// TYPE CASTING IN THE JAVA :

public class Lec4 {
    public static void main(String[] args) {
        /*
        * Widening Casting (automatically) - converting a smaller type to a larger type size
            byte -> short -> char -> int -> long -> float -> double

            Narrowing Casting (manually) - converting a larger type to a smaller size type
            double -> float -> long -> int -> char -> short -> byte

        */


        // Widening casting  :
        int x = 5 ;
        double y = x ;
        System.out.println(x);
        System.out.println(y);  // automatic typecasting.

        double z = 4.256 ;
        int nz  = (int)z ; // manual typecasting.

        System.out.println(z);
        System.out.println(nz);
    }
}
