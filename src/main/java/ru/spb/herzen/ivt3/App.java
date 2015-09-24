package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

public class App
{
    public static void main( String[] args )
    {
        System.out.println();
        RandomNameGenerator rand = new RandomNameGenerator();

        String name = rand.next();
        System.out.println( "Hello, " + name + "\n" );

        System.out.println( "Задание 1" );
        for(int i=0; i<4; i++){
            name = rand.next();
            System.out.println( "Hello, " + name );
        }

        System.out.println( "\nЗадание 2" );
        for(int i=0; i<15; i++){
            name = rand.next();
            System.out.println( "Hello, " + name );
        }
    }
}
