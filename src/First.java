public class First {
    public static double calcSum(double[] array){
        double sum = 0;
        for(double value : array){
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args){
        double[] array = {1,2,3,4,5};
        System.out.println(calcSum(array));
    }
}
