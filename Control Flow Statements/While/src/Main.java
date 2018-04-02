public class Main {
    public static void main(String[] args){
//        int ilkSayi=6;
//        int sonSayi=25;
//    while (ilkSayi<=sonSayi){
//        ilkSayi++;
//        if(isEvenNumber(ilkSayi)) {
//
//             System.out.println(ilkSayi + " Çift sayıdır.");
//            }
//        }
        int ilkSayi=34;
        int sonSayi=45;
        int bulunanSayi=0;
        while (ilkSayi<=sonSayi){
            ilkSayi++;
            if(isEvenNumber(ilkSayi)) {
                bulunanSayi++;
                System.out.println(ilkSayi + " Çift sayıdır.");
            }
            if (bulunanSayi==5){
                break;
            }
        }
        System.out.println(bulunanSayi+" adet çift sayı bulundu");
    }

    public static boolean isEvenNumber(int n){
            if(n%2==0){
                return true;
            }else return false;
    }
}
