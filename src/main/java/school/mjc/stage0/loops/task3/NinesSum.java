package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
        } else {
            int sum = 0;
            int count = 0;
            String nine = "9";
            String nineFin = "";
            for (int i = 1; i <= lengthOfLastNumber; i++) {
                count = Integer.valueOf(nine);
                sum = sum + count;
                nine = nine + "9";
            }
            System.out.println(sum);
        }
    }
}
