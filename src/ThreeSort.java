public class ThreeSort {
    public static void main(String[] args) {
        int num_1 = Integer.parseInt(args[0]);
        int num_2 = Integer.parseInt(args[1]);
        int num_3 = Integer.parseInt(args[2]);

        int min = Math.min(num_1, num_2);
        min = Math.min(min, num_3);

        int max = Math.max(num_1, num_2);
        max = Math.max(max, num_3);

        int median = num_1 + num_2 + num_3 - min - max;

        System.out.println(min);
        System.out.println(median);
        System.out.println(max);
    }
}
