package com.ErtugrulUysal;

public class Main {

    public static void main(String[] args) {
    byte byteMinValue=-128;
    byte byteMaxValue=127;

    short shortMinValue=-32768;
    short shortMaxValue=32767;

    int intMinValue=-2_147_483_648;
    int intMaxValue=2_147_483_647;

    long longMinValue=-9_223_372_036_854_775_808L;
    long longMaxValue=9_223_372_036_854_775_807L;

		System.out.println("Byte min: "+ byteMinValue+" Byte max: "+byteMaxValue);
		System.out.println("Short min: "+ shortMinValue+" Short max: "+shortMaxValue);
		System.out.println("Int min: "+ intMinValue+" Int max: "+intMaxValue);
		System.out.println("Long min: "+ longMinValue+" Long max: "+longMaxValue);



    byte byteValue=10;
	short shortValue=20;
	int intValue=50;


	long longTotal= 50000L+10L *(byteValue+intValue+shortValue);
	short shortTotal= (short)(1000+10*(byteValue+intValue+shortValue));
        System.out.println("longTotal= "+longTotal);
        System.out.println("shortTotal= "+shortTotal);

    }
}
