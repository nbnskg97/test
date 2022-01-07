package peaksoft.main;

import peaksoft.animal.Cat;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat cat=new Cat();
        cat.setName("sary");
        cat.setAge(3);
        System.out.println("сарынын аты: "+cat.getName());
        System.out.println("сарынын жашы: "+cat.getAge());


    }
}
