package com.example.retrofitdemo2;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String url = "https://simplifiedcoding.net/demos/";
    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        tv.setText("");

        apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<ArrayList<TestModel>> call = apiInterface.MarvelList();

        call.enqueue(new Callback<ArrayList<TestModel>>() {
            @Override
            public void onResponse(Call<ArrayList<TestModel>> call, Response<ArrayList<TestModel>> response) {

                Log.d("responce", response.body().toString());
                ArrayList<TestModel> mArray = response.body();

                for(int i=0;i<mArray.size();i++)
                {
                    tv.append("Name - " + mArray.get(i).name + "\nRealname - " + mArray.get(i).realname + "\nTeam - " + mArray.get(i).team + "\n\n\n");
                }
            }

            @Override
            public void onFailure(Call<ArrayList<TestModel>> call, Throwable t) {
                call.cancel();
            }
        });
    }
}