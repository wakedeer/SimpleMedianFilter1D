public class Main {


    //simple 
    public static double middleOf3(double a, double b, double c) {
        double middle;
        if ((a <= b) && (a <= c)) {
            middle = (b <= c) ? b : c;
        } else {
            if ((b <= a) && (b <= c)) {
                middle = (a <= c) ? a : c;
            } else {
                middle = (a <= b) ? a : b;
            }
        }
        return middle;
    }

    public static double minValue(double[] array) {
        double[] resultArray = new double[array.length];
        double min = Double.MAX_VALUE;

        for(int i = 0 ; i < array.length; i++){
            if(i==0){
                resultArray[i] = middleOf3(array[i], array[i],array[i+1]);
            }else if(i == array.length-1){
                resultArray[i] = middleOf3(array[i-1], array[i], array[i]);
            }
            else{
                resultArray[i] = middleOf3(array[i-1], array[i], array[i+1]);
            }
        }
        //search min value
        for (double value : resultArray) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        double[] arr = {2.0, 80.0, 6.0, 3.0};

        System.out.println("min = " + minValue(arr));
    }
}
