package za.ac.cput;

public class Calculator implements CalcInterface{

    public Calculator() {
    }
     public int add(int a, int b){
        return a+b;
     }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }

}