import com.google.common.math.DoubleMath;

public class GuavaTester {
    public static void main(String[] args) {
        double num = Math.PI;
        double butInt = 7;

        System.out.println(num);

        System.out.println(DoubleMath.isMathematicalInteger(num));
        System.out.println(DoubleMath.isMathematicalInteger(butInt));

        int largeNum = Integer.MAX_VALUE;
//        System.out.println(largeNum + 1);
        try {
            System.out.println(IntMath.checkedAdd(largeNum, 1));
        } catch (ArithmeticException e) {
            System.out.println("That number is too big.");
        }

        System.out.println(largeNum);

        String nameTag = "Hello,,, ,My, Name,,, is,,, Joe!";
        List<String> cutUpTag;
        Splitter.on(",").trimResults().omitEmptyStrings().splitToList(nameTag);

        System.out.println(cutUpTag.size());

        for (int i = 0; i < cutUpTag.size(); i ++) {
            System.out.println(cutUpTag.get(i));
        }
        }
    }
}
