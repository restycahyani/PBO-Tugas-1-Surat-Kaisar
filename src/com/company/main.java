package com.company;
import java.util.*;

        public class main {
            public static String methodKarakter(String kata, int geser, String huruf2){
                for(int i = 0; i < kata.length(); i++){
                    char karakter = kata.charAt(i);
                    int abjad = karakter;
                    int count = countAbjad(abjad, geser);
                    if(karakter >= 'a' && karakter <= 'z'){
                        if(count > 122 ){
                            count = 96 + (count - 122);
                        }
                        huruf2 += String.valueOf((char)count);
                    }else if(karakter >= 'A' && karakter <= 'Z'){
                        if(count > 90 ){
                            count = 64 + (count - 90);
                        }
                        huruf2 += String.valueOf((char)count);
                    }else{
                        huruf2 += String.valueOf(karakter);
                    }
                }
                return huruf2;
            }
            public static void main(String[] args) {
                Scanner hasil = new Scanner(System.in);
                String huruf2 = "";
                String kata = hasil.nextLine();
                int geser = hasil.nextInt();

                System.out.println(methodKarakter(kata, geser, huruf2));
            }
            public static int countAbjad( int abjad, int geser){
                int count = abjad +geser;
                return count;
            }
        }

