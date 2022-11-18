package org.example;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(checkString("ABBDCA", 2) ? "true" : "false");
        System.out.println(checkString("BAAABDBB", 3) ? "true" : "false");
        System.out.println(checkString("BAABDB", 3) ? "true" : "false");
        System.out.println(checkString("CABDACCCA", 2) ? "true" : "false");
        System.out.println(checkString("CABDDACCA", 2) ? "true" : "false");

    }
    public static boolean checkString(String str , int n){
        char c = str.charAt(0);
        int occ = 1,max = 0;
//        LinkedList<Integer> list = new LinkedList<>();
        for(int i =1; i< str.length();i++){
            if(c == str.charAt(i)){
                occ++;
                if(occ>n) return false;
            }else{
//                list.add(occ);
                if(occ>max) max=occ;
                c = str.charAt(i);
                occ=1;
            }

//            char c = str.charAt(i);
//            int occ = 1;
//            for(int j=i+1; j<str.length() && c == str.charAt(j);j++){
//                occ++;
//                if(occ == n){
//                    return true;
//                }
//            }
        }
//        Collections.sort(list);
//        int result = list.getLast();
        return max==n;
    }


    /*
    * “ABBDCA”, 2 -> true
“BAAABDBB”, 3 -> true
“BAABDB”, 3 -> false
“CABDDACCCA”, 2 -> true
    * */
}