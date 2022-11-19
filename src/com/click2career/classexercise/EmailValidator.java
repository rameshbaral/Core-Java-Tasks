package com.click2career.classexercise;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class EmailValidator {
    ///checks email for validation
    public static boolean isValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public static void main(String[] args) {
        //array list declaration for storing list of email input
        ArrayList<String> address = new ArrayList<>();
        //adds to aarylist of String
        address.add("baralramesh07@gmail.com");
        address.add("baralramesh.com.np");
        //checks each email for validation
        for (String i : address) {
            if (isValid(i))
                System.out.println(i + " - Yes email is correct");
            else
                System.out.println(i + " - No wrong email ");
        }
    }
}
