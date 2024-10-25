// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------
    public static int factorial(int n){
        if (n < 1){
            throw new IllegalArgumentException("Bukan bilangan asli");
        }else if (n > 16){
            throw new IllegalArgumentException("Melebihi batas");
        }
        int fac = 1;
        for (int i=n; i>0; i--)
            fac *= i;
        return fac;
    }
}