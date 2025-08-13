public class MaximoDivComum {
    public static void main(String[] args) {
        System.out.println(MDC(6, 3));
        System.out.println(" imprime 10");
        System.out.println(imprime10(10));
        System.out.println(" Expoente ");
        System.out.println(expoente(10, 3));
}
public static int imprime10(int n){
        if(n==1){
            System.out.println(1);
        }else{
            System.out.println(n);
            imprime10(n-1);
        }
    return n;
}
public static int expoente(int base, int expo){
    if (expo == 0) {
        return 1;
    }else{
        return expoente(base, expo-1) * base;
    }
}
public static int MDC(int x, int y){
    if (y <= x && x % y == 0){
        return y;
    }
        else
            if (x < y) return MDC(y, x);
        else return MDC(y, x% y);
    }

}


