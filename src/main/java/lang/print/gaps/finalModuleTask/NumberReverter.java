package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        StringBuilder str = new StringBuilder(number);
        System.out.println(str.reverse().toString());
    }
}
