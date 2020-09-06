import java.util.Scanner;


public class GeometryCalculator {

    public double radius;

    public static void main(String[] args) {

        GeometryLoader geometryLoader = new GeometryLoader();


        Scanner in = new Scanner(System.in);

        System.out.println("Что рассчитать?\n" +
                "1 - Площадь круга\n" +
                "2 - Площадь треугольника\n" +
                "3 - Объем сферы\n" +
                "4 - Построение треугольника по трём длинам сторон\t");
        int insOption = in.nextInt();
        switch (insOption) {
            case 1:
                System.out.println("Введите радиус рассчитываемого круга: \t");
                Scanner circleRadius = new Scanner(System.in);
                geometryLoader.setRadius(in.nextInt());
                GeometryCalculator.circleArea(geometryLoader.radius);
                break;
            case 2:
                System.out.println("Введите высоту и длину основания через запятую: \t");
                Scanner basisHeightInsert = new Scanner(System.in);
                String[] inputs = in.next().split(",");
                geometryLoader.setTriangleHeight(Double.valueOf(inputs[0]));
                geometryLoader.setTriangleBasis(Double.valueOf(inputs[1]));
                GeometryCalculator.triangleArea(geometryLoader.getTriangleHeight(), geometryLoader.getTriangleBasis());
                break;
            case 3:
                System.out.println("Введите радиус сферы: \t");
                Scanner volumeRadius = new Scanner(System.in);
                geometryLoader.setVolumeRadius(Double.parseDouble(volumeRadius.next()));
                GeometryCalculator.volumeArea(geometryLoader.getVolumeRadius());
            case 4:
                System.out.println("Введите три стороны через запятую: \t");
                Scanner threeBasics = new Scanner(System.in);
                String[] inputsThreeBasics = in.next().split(",");
                geometryLoader.setTriangleBasisFirst(Double.parseDouble(inputsThreeBasics[0]));
                geometryLoader.setTriangleBasisSecond(Double.parseDouble(inputsThreeBasics[1]));
                geometryLoader.setTriangleBasisThird(Double.parseDouble(inputsThreeBasics[2]));
                GeometryCalculator.triangleThreeBasicsArea(geometryLoader.getTriangleBasisFirst(),
                        geometryLoader.getTriangleBasisSecond(),
                        geometryLoader.getTriangleBasisThird());
        }

    }

    /*Формулы*/

    public static void circleArea(double radius) {
        System.out.println("Площадь круга равна: " +
                Math.round(Math.PI * Math.pow(radius, 2)));
    }

    public static void triangleArea(double trHeight, double trBasis) {
        System.out.println("Площадь треугольника равна: " +
                (trHeight * trBasis) / 2);
    }

    public static void volumeArea(double volumeRadius) {
        System.out.println("Объем сферы равен: " +
                Math.round(4 * Math.PI * Math.pow(volumeRadius, 3)) / 3);
    }

    public static void triangleThreeBasicsArea(double getTriangleBasisFirst, double triangleBasisSecond, double triangleBasisThird) {
        double halfPerimeter = (getTriangleBasisFirst + triangleBasisSecond + triangleBasisThird) / 2;
        double trArea = Math.sqrt(halfPerimeter *
                (halfPerimeter - getTriangleBasisFirst) *
                (halfPerimeter - triangleBasisSecond) *
                (halfPerimeter - triangleBasisThird));

        if (trArea != 0) {
            System.out.println("Площадь треугольника по трём сторонам равна: "
                    + trArea);
        } else {
            System.out.println("Треугольник с такими сторонами не существует.");
        }
    }


}
