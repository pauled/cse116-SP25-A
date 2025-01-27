package week2;

public class PlusMinus {
    public static String letter(int score){
        int tens=score/10;
        if(tens>=9){
            return "A";
        } else if(tens>=8){
            return "B";
        } else if(tens>=7){
            return "C";
        } else if(tens>=6){
            return "D";
        } else {
            return "F";
        }
    }
    //write a functoin that does not return anything and
    //prints all values from 1 to a number input and that
    //number squared
    public static void printSquares(int val){
        for (int i=0; i<=val; i++){
            System.out.println(i+" "+i*i);
        }
    }

    public static void main(String[] args) {
        System.out.println(letter(98));
        System.out.println(letter(75));
        System.out.println(letter(30));

        double val=10;
        while (val>1){
            System.out.println(val);
            val/=2;
        }
        for (int x=0; x<5; x++){ //x++ is x+=1
            int bob=x;
            System.out.println(x);
        }
        printSquares(10);
    }
}
