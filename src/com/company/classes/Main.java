package com.company.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        function1();
    }

    static void function1(){
        List<Integer> list = new ArrayList<Integer>(5);

        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++){
            try{
                Integer n = Integer.parseInt(bReader.readLine());
                list.add(Integer.valueOf(n));
            }catch(IOException e){
                System.out.println("ERROR!!!");
            }
        }

        ListIterator<Integer> itr = list.listIterator();



        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
