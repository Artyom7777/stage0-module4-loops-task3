package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String len = String.valueOf(t);
        Integer sum = 0;
        for (int i = 0; i < len.length(); i++) {
            sum += Integer.parseInt(String.valueOf(len.charAt(i)));
        }
        System.out.println(sum);
    }
}

