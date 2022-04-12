public class soal4 {
    public static void main(String[] args){

        int[] num = {1, 7, 9, 4};

        for(int i = 0; i < num.length; i++){

            if(num[i] % 2 == 0){
                System.out.println(num[i] + "even");
            }else{
                System.out.println(num[i] + "odd");
            }

        }

    }
}
