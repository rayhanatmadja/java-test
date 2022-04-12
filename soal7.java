public class soal7 {
    public static void main(String[] args) {
        int[] num = {2,34,31,11};
        int count = 0;
        
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                }
            }
        }
        if(count == 1){
            System.out.println("FOUND");
        }else{
            System.out.println("NOT FOUND");
        }

    }
}
