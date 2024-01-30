public class FiveUniformRandomNumbers {
    public static void main(String[] args) {
        double num_1 = Math.random();
        double num_2 = Math.random();
        double num_3 = Math.random();
        double num_4 = Math.random();
        double num_5 = Math.random();
        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_3);
        System.out.println(num_4);
        System.out.println(num_5);
        double average = (num_1 + num_2 + num_3 + num_4 + num_5) / 5;
        System.out.println("Average: " + average);
        double min = Math.min(num_1, num_2);
        min = Math.min(min, num_3);
        min = Math.min(min, num_4);
        min = Math.min(min, num_5);
        System.out.println("Min: " + min);
        double max = Math.max(num_1, num_2);
        max = Math.max(max, num_3);
        max = Math.max(max, num_4);
        max = Math.max(max, num_5);
        System.out.println("Max: " + max);
    }
}
