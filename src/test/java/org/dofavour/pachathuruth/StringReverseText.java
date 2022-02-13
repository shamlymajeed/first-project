package org.dofavour.pachathuruth;

import org.junit.jupiter.api.Test;

public class StringReverseText {

public static void main(String x[]){




}

//test cases

    public void must_throw_exception_if_string_empty(){
    try {
        StringReverse.reverseMyString("");
        System.out.println("Failed  !!!!");
    }
    catch(IllegalArgumentException il){
        System.out.println("Success");
    }
    }
    public void must_return_single_character(){

        String rev = StringReverse.reverseMyString("a");
        if(rev.equals("a")) {

            System.out.println("success  !!!!");
        }

        else
            System.out.println("Failed  !!!!");


    }


    public void must_return_same_string_if_palindrome(){

            String rev = StringReverse.reverseMyString("malayalam");
            if(rev.equals("malayalam")) {

                System.out.println("success  !!!!");
            }

            else
                System.out.println("Failed  !!!!");


    }


}
