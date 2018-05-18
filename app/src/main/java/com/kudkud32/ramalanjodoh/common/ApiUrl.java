package com.kudkud32.ramalanjodoh.common;

/*
 * Created by Kristiawan on 21/04/18.
 */
public class ApiUrl {

    //API Ramalan Harian
    public static String BASE_API = "http://mastupang.rackspira.id/";
    public static String ZODIAK_ARIES_API = BASE_API.concat("ramalan/aries.php");

    //API Wetton
    public static String BASE_API_WETON = "https://script.google.com/macros/exec";

    public static String LOGIN_API = BASE_API.concat("/login");
    public static String LOGOUT_API = BASE_API.concat("/logout");
}
