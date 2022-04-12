public class soal5 {
    public static void main(String[] args) {
        int[] nilai = {11,2,34,31};
        
        System.out.println("Max value & min value");
        int max=nilai[0];
        int min=nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i]>max){
                max = nilai[i];
            }else if(nilai[i]<min){
                min = nilai[i];
            }
        }
        System.out.println("Max value = "+max);
        System.out.println("Min value = "+min);
    }
}
