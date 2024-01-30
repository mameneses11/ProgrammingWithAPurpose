public class GreatCircle {
    public static void main(String[] args) {
        double earthDiameter = 6371.0;

        double degree1 = Double.parseDouble(args[0]);
        double degree2 = Double.parseDouble(args[1]);
        double degree3 = Double.parseDouble(args[2]);
        double degree4 = Double.parseDouble(args[3]);

        double degree1ToRadians = Math.toRadians(degree1);
        double degree2ToRadians = Math.toRadians(degree2);
        double degree3ToRadians = Math.toRadians(degree3);
        double degree4ToRadians = Math.toRadians(degree4);

        double squareSinX = Math.sin((degree3ToRadians - degree1ToRadians) / 2) * Math.sin((degree3ToRadians - degree1ToRadians) / 2);
        double squareSinY = Math.sin((degree4ToRadians - degree2ToRadians) / 2) * Math.sin((degree4ToRadians- degree2ToRadians) / 2);
        double squareRoot = Math.sqrt(squareSinX + (Math.cos(degree1ToRadians) * Math.cos(degree3ToRadians) * squareSinY));
        double distance = 2 * earthDiameter * Math.asin(squareRoot);

        System.out.println(distance + " kilometers");
    }
}
