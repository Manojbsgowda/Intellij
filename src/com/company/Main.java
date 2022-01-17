package com.company;

public class Main {

    public static void main(String[] args) {
      /*  int[] array ={1,2,3,5};
try{
    int a=10,b=0,c;
    c=a/b;
    System.out.println("divison by zero exception"+c);
    for (int i=0;i<=array.length;i++){
        System.out.println("array elements are "+array[i]);
    }


}catch (ArithmeticException e){
    System.out.println("enter a valid array size");
    System.out.println("please enter a valid number");

}
        System.out.println("result");
    }
    */



        //array index error
        int[] array ={1,2,3,5};
        try{

            for (int i=0;i<=array.length;i++){
                System.out.println("array elements are "+array[i]);
            }


        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("please enter a valid array size");


        }
        System.out.println("inserted array elements");
    }



}
