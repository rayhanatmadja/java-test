public class soal6 {
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,6,7,8};
        int count = 0;

        for(int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] + num[j] == 10) {
                    count++;
                }
            }
        }
        System.out.println(count);
        if(count >= 1){
            System.out.println("FOUND");
        }else{
            System.out.println("NOT FOUND");
        }
    }
}
