package com.example.retrofitdemo2;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TestModel {
//    @SerializedName("data")
//    public ArrayList<Data> data;
    @SerializedName("name")
    public String name;
    @SerializedName("bio")
    public String bio;
    @SerializedName("imageurl")
    public String imageurl;
    @SerializedName("publisher")
    public String publisher;
    @SerializedName("createdby")
    public String createdby;
    @SerializedName("firstappearance")
    public String firstappearance;
    @SerializedName("team")
    public String team;
    @SerializedName("realname")
    public String realname;
    // First to activate DTO generator. Open File-Settings-Plugins-DTO Generator and activate it.
    // Then Code->Generate->DTO from JSON- copy all the JSON data here- press Validate- Format- Generate- tick Single File With Inner Class- tick Gson- untick @Expose.
    // Then click generate in previous sheet.

    @Override
    public String toString() {
        return "TestModel{" +
                "bio='" + bio + '\'' +
                ", imageurl='" + imageurl + '\'' +
                ", publisher='" + publisher + '\'' +
                ", createdby='" + createdby + '\'' +
                ", firstappearance='" + firstappearance + '\'' +
                ", team='" + team + '\'' +
                ", realname='" + realname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

//    public class Data {
//        @SerializedName("bio")
//        public String bio;
//        @SerializedName("imageurl")
//        public String imageurl;
//        @SerializedName("publisher")
//        public String publisher;
//        @SerializedName("createdby")
//        public String createdby;
//        @SerializedName("firstappearance")
//        public String firstappearance;
//        @SerializedName("team")
//        public String team;
//        @SerializedName("realname")
//        public String realname;
//    }
}
