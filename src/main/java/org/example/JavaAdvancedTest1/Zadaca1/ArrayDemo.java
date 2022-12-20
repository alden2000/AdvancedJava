package org.example.JavaAdvancedTest1.Zadaca1;

public class ArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray=new DynamicArray();
        dynamicArray.add(23);
        dynamicArray.add(16);
        dynamicArray.add(17);
        dynamicArray.add(22);
        dynamicArray.add(12);
        dynamicArray.add(17);
        dynamicArray.add(33);
        for (int i:dynamicArray){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Novi niz: ");
        dynamicArray.remove(17);
        for (int i:dynamicArray){
            System.out.print(i+" ");
        }
    }
}
