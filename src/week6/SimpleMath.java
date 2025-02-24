package week6;

public class SimpleMath {
    public static int factorial(int n){
        if (n==0){
            return 1;
        } else if(n<0){
            return -1;
        }else {
            return n*factorial(n-1);
        }
    }
    public static int multiplyInt(int x, int y){
        if (x==0 || y==0){
            return 0;
        }
        boolean xNeg=x<0;
        boolean yNeg=y<0;
        int results=multiplyhelper(Math.abs(x),y);
        if ((xNeg && yNeg) || (!xNeg && !yNeg)){
            return results;
        } else {
            return -1*results;
        }
    }
    public static int multiplyhelper(int x, int y){
        if (y==1){// || or, && and, ! not
            return x;
        } else {
            return x+multiplyhelper(x,y-1);
        }
    }
}
