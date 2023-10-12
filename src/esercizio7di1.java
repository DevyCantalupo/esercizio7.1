public class esercizio7di1 {
    public static boolean x(int a, int b, int c){
        boolean x = c >= a && c <= b;
        return x;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        int c = 90;

        boolean risultato = x(a,b,c);
        System.out.println("c " + c + " e tra a " + a + " e b " + b + "? " + risultato);
    }
}
