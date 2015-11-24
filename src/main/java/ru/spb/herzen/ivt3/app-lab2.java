package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

public class App
{
    public static void main( String[] args )
    {
        RandomNameGenerator rand = new RandomNameGenerator(0); // 0 is random seed

        String[] array = new String[15];

        System.out.println("Задание 1");
        for(int i=0; i<15; i++){
             name = rand.next();
            array[i] = name;
        }
        for(String tmp : array){
            System.out.println("Hello, " + tmp);
        }


        System.out.println("Задание 2");
        Arrays.sort(array);
        for(String tmp : array){
            System.out.println("Hello, " + tmp);
        }


        System.out.println("Задание 3");
        for(int i=2; i<5; i++){
            System.out.println("Hello, " + array[i]);
        }


        System.out.println("Задание 4");
        for(int i=0; i<15; i++){
            array[i] = array[i].toUpperCase();
        }
        for(int i=0; i<15; i++){
            System.out.println("Hello, " + array[i]);
        }

        System.out.println("Задание 5");
        for(int i=0; i<15; i++){
            array[i] = array[i].toUpperCase();
        }
        for(int i=0; i<15; i++){
            System.out.println("Hello, " + array[i]);
        }

       
        System.out.println("Задание 6");
        int[] num_array = new int[30];

        for(int i=0; i<15; i++){
            String name = rand.next();
            num_array[i] = (int) Math.floor(Math.random()*201);
        }
        int count = 0;
        for(int i=0; i<15; i++){
            if(num_array[i]%2==0){
                count++;
            }
            System.out.println(i + " : " + num_array[i]);
        }
        System.out.println("Amount of even numbers: " + count);


        System.out.println("Задание 7");
        String my_name = "Anastasia";
        char[] char_array = my_name.toCharArray();
        Arrays.sort(char_array);
        for(char x : char_array){
            System.out.println(x);
        }

        
       
