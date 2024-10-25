public class Lec8 {
    public static void main(String[] args) {
        // ARRAY OF THE STRINGS :
//        String [] cars ;  // this is one of the example of the array of the string.

           String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

           int[] mynum = {10 , 20 , 30 , 30} ;

           // length of the array :
        System.out.println(mynum.length);

        // loop through the array :
        String [] str_list = {"volvo" , "alto" , "ford" , "mazda"} ;
        for(int i = 0 ; i  < str_list.length ; i++){
            System.out.println(str_list[i]);
        }

        //  using the forEach loop with the array  :
        for(String i : str_list){
            System.out.print(i+"\t");
        }

        System.out.println();
        int [][] nums = {{1 , 2 , 3} , {2 , 3 , 3 }}  ;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums[0].length ; j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println(); ;
        }
    }
}
