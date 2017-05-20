package com.kaist.antr.se550finalproject.login;

public class UserAccountManager {

    private static String username = "";

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserAccountManager.username = username;
    }

    public static boolean userIsLoggedIn(){
        return !username.equals("");
    }
}
