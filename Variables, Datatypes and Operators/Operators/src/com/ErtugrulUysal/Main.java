package com.ErtugrulUysal;

public class Main {

    public static void main(String[] args) {
	int result=1+2;
        System.out.println("1+2="+result);

        int previousResult=result;
        result=result-1;
        System.out.println(previousResult+"-1="+result);

        previousResult=result;
        result=result*10;
        System.out.println(previousResult+"*10="+result);

        previousResult=result;
        result=result/5;
        System.out.println(previousResult+"/5="+result);

        previousResult=result;
        result=result%3;
        System.out.println(previousResult+"%3="+result);

        previousResult=result;
        result=result+1;
        System.out.println(previousResult+"Result is now ="+result);
        result++;
        System.out.println(previousResult+"Result is now ="+result);
        result--;
        System.out.println(previousResult+"Result is now ="+result);
        result +=2;
        System.out.println(previousResult+"Result is now ="+result);
        result*=10;
        System.out.println(previousResult+"Result is now ="+result);
        result-=10;
        System.out.println(previousResult+"Result is now ="+result);
        result /=10;
        System.out.println(previousResult+"Result is now ="+result);

        boolean isAlien = false;
        if(isAlien==true)
            System.out.println("It is not a alien");

        int topScore =80;
        if (topScore<100)
            System.out.println("You got the top score!!");

        int secondTopScore=81;
        if ((topScore>secondTopScore)&&(topScore<100))
            System.out.println("Greater than second top score and less than 100");

        // Soru
        double firstValue=20d;
        double secondValue=80d;
        double total=(firstValue+secondValue)*25;
        System.out.println("Total : "+total);
        double remainder=total%40;
        System.out.println("Remainder : "+remainder);
        if (remainder<=20)
            System.out.println("Total wasover th limit ");






    }
}
