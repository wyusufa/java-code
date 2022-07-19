package dsa.binary_number;

public class intToBinary {
    /**
     * convert integer to binary representation
     *
     * divide the input by 2.
     * if the dividend == 0, add mod to stringbuilder
     * else, while dividend !=0, dividend = dividend % 2, add the mod to string builder
     * return the casting of reverse of stringbuilder
     */
    public static String intToBinary(int masuk){
        int dividend=0,mod=0;
        StringBuilder sb=new StringBuilder("");

        dividend=masuk/2;
        mod=masuk%2;
        sb.append(mod);

        while(dividend!=0){
            mod=dividend%2;
            dividend=dividend/2;
            sb.append(mod);
        }

        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        int n=5; System.out.print(n + " => "); System.out.println(intToBinary(n));
        n=6; System.out.print(n + " => "); System.out.println(intToBinary(n));
        n=7; System.out.print(n + " => "); System.out.println(intToBinary(n));
        n=0; System.out.print(n + " => "); System.out.println(intToBinary(n));
        n=1; System.out.print(n + " => "); System.out.println(intToBinary(n));

    }

}
