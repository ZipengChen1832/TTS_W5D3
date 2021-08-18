import java.util.Arrays;

public class Third {
    public static int[] toPower(int size, int power){
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = (int) Math.pow(i,power);
        }
        return array;
    }

    public static void main(String[] args){
        int[] array = toPower(4,2);
        System.out.println(Arrays.toString(array));
    }
}
