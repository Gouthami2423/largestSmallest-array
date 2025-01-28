public class SmallestAndLargest {
    public static void main(String[] args) {
        int[] numbers= {12,23,24,65,15,3};
        int min= numbers[0];
        int max= numbers[0];
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i]<min) {
                min = numbers[i];
            }
            if (numbers[i]>max) {
                max = numbers[i];
            }
        }
        System.out.println("smallest value:"+ min);
        System.out.println("largest value:"+ max);
    }
}
