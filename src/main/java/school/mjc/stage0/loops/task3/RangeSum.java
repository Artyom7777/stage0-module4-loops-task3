package school.mjc.stage0.loops.task3;

public class RangeSum {

    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        for(int i = 0; firstBoarder <= secondBoarder; i ++){
            sum = firstBoarder + sum;
            firstBoarder++;
        }
        System.out.println(sum);
    }
}
