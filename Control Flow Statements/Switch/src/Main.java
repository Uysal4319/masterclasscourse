public class Main {
    public static void main(String[] args){
        char myChar = 'H';
        switch (myChar){
            case 'A':
                System.out.println("A seçildi");
                break;
            case 'B':
                System.out.println("B seçildi");
                break;
            case 'C':
                System.out.println("C seçildi");
                break;
            case 'D':
                System.out.println("D seçildi");
                break;
            case 'E':
                System.out.println("E seçildi");
                break;
            case 'F': case 'G': case 'H':                //pratik bir yol
                System.out.println(myChar+" seçildi.");
                break;
            default:
                System.out.println("Seçilen harf olmadı");
                break;
        }
        String month="January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("janu");
                break;
            case "june":
                System.out.println("jun");
                break;
            case "april":
                System.out.println("ap");
                break;
            default:
                System.out.println("Ay yok");
                break;
        }


    }
}
