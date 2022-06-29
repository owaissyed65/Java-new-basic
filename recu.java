public class recu {
        static int factorial(int n)
        {
            int f = 1;
            for (int i = n; i != 0; i--)
            {
                f = f * i;
            }
            return f;
//            if (n == 1 || n == 0) {
//                return 1;
//            }
//            else {
//                return n * factorial(n-1);
//            }
        }
    public static void main(String[] args) {
        int x = 3;
        System.out.println(factorial(x));
    }
}
