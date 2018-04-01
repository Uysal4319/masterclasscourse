public class Main {
    public static void main(String[] args){
      calcFeetAndInchesToCentimeters(13,1);
      calcFeetAndInchesToCentimeters(157);

    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet>=0&&(0<=inches&&inches<=12)){
        double cm=feet*30.48+inches*2.54;
            System.out.println(feet+" Feet "+inches+" Inches = "+cm+" Centimeters");
            return cm;
        }
        System.out.println("Geçersiz parametre");
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(int inches){
        if (inches>=0){
            double feet=(int)inches/12;
            double artanInc=(int) inches%12;
            System.out.println(inches+" Inches = "+feet+" feet and "+artanInc+" Inches");
            return calcFeetAndInchesToCentimeters(feet,artanInc);
        }System.out.println("geçersiz parametre");
        return -1;
    }


}
