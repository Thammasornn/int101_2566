package Work03;

public class MyUtil {
    public static void CalculateBMI(double weight, double height){
        double resultBMI = weight / (height * height);
        System.out.println(resultBMI);
    }

    public  static  void Average(int v1, int v2, int v3){
        double resultAverage = (double) 3 / (v1+v2+v3);
        System.out.println(resultAverage);
    }
}
