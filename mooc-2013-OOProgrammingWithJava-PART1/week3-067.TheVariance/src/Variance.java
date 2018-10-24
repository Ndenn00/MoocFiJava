import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0; 
        for(int i : list){
            sum += i; 
        }
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        return (double)sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
         double var = 0;
        double total = 0;
        double average = average(list);
        for (int num : list) {
            var = Math.pow((num * 1.0 - average), 2);
            total += var;
        }
       
        return  total / (list.size() - 1);
        
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
