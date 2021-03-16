package com.company.killoran;

abstract class Wrestler{

    public void paymentForWork(double hours){
        System.out.println("The wrestler will make $" + (hours*250.00));
    }

    public abstract void entranceMusic();
    public abstract void finisher();
    public abstract void combo1();
    public abstract void combo2();

}








public class Main {

    public static void main(String[] args) {




    }
}
