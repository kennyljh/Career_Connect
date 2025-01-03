package com.example.careerconnect.AccountPersonalizationElements;

public class LibraryURL {

    public static String getCountriesGETRequest(){
        return "http://10.0.2.2:8080/country/get/";
    }

    public static String getUniversitiesGETRequest(){
        return "http://10.0.2.2:8080/university/get/";
    }

    public static String getMajorsGETRequest(){
        return "http://10.0.2.2:8080/college/major/get/";
    }

    public static String getUserProfileGETRequest(){
        return "http://10.0.2.2:8080/user/profile/get/";
    }

    public static String getUserProfilePUTRequest(){
        return "http://10.0.2.2:8080/user/profile/put/";
    }
}
