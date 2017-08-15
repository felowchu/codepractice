public class Power {
    public static void main(String[] args){
        System.out.println(power(2,3));
    }

    public static double power(double base, int exponent) {
        double result = 1.0;
        int exp = Math.abs(exponent);
        while (exp > 0) {
            int i = 1;
            double temp = base;
            while (i * i <= exp) {
                i = i << 1;
                temp *= temp;
            }
            base *= temp;
            exp -= i * i;
        }

        if (exponent < 0) {
            if(base != 0)
                result = 1.0 / base;
            else
                throw new ArithmeticException("底数不能为零");
        }else if(exponent > 0)
            result = base;
        return result;
    }
}
