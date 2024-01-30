public class RightTriangle {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        boolean isAllPositives = num1 > 0;
        isAllPositives = isAllPositives && (num2 > 0);
        isAllPositives = isAllPositives && (num3 > 0);

        int squareNum1 = num1 * num1;
        int squareNum2 = num2 * num2;
        int squareNum3 = num3 * num3;

        boolean isARightTriangle = squareNum1 == (squareNum2 + squareNum3);
        isARightTriangle = isARightTriangle || (squareNum2 == (squareNum1 + squareNum3));
        isARightTriangle = isARightTriangle || (squareNum3 == (squareNum1 + squareNum2));

        System.out.println(isARightTriangle && isAllPositives);
    }
}
