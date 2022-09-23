package session3;

import BankAccount.Account;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();
        a.run();
        Dog d = new Dog(54,"Cnt",2019);
        d.run();
        d.eat();
        BullDog bd = new BullDog();

    }
    public static void main2(String[] args){
        int[] intArrays = new int[5];
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(10); //arr[0]
        arrayList.add("Later bitch"); //arr[1]
        arrayList.add(new Account("34","f d f",134));
        arrayList.remove(0); //position
        //arrayList.remove("Hello World");
        System.out.println(arrayList.size());

        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("World");
        strArray.add("Hello");

        for (String s: strArray){
            System.out.println(s);
        }

        for (int i=0;i<strArray.size();i++){
            System.out.println(strArray.get(i));
        }

        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(11);
        ArrayList<Double> dArr = new ArrayList<>();
        dArr.add(10.5);
    }

}
