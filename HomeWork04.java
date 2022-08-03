public class HomeWork04 {

    public static void main(String[] args) {

        try {
            int array[]={1,3,4,-7,5};
            System.out.println("the smallest number is "+getSmallPositive(array));

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        try {
            customer customer1 = new customer(439003145, "salha alasmari", 'f');

     if(customer1.geneder !='m' && customer1.geneder!='f'){
         throw new RuntimeException("please enter the gender either f or m");
     }   System.out.println(customer1.toString());
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


    }
    public static  int getSmallPositive (int [] array)  throws RuntimeException {
        int min =array[0];


        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                throw new RuntimeException("Warning , please enter positive numbers");
            }
            else {
                if(array[i] < min){
                    min = array[i];
                }
            }
        }


        return min;
    }

}
