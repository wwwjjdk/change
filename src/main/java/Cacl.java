public class Cacl {
    public int monthlyPayment(int s, double r, int t){
        // s*(r*(1+r)^t/(1+r)^t-1)
        return 0;//(int)Math.floor(s*((r*Math.pow((1+r),t))/(Math.pow((1+r),t)-1)));
    }

    public int payOut(int mp, int t){
        return  0;//mp*t;
    }
    public int overpayment(int payOut, int s){
        return 0;//payOut-s;
    }
}
