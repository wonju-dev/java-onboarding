package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            String num = Integer.toString(i);
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) == '3') {
                    count += 1;
                }
                if (num.charAt(j) == '6') {
                    count += 1;
                }
                if (num.charAt(j) == '9') {
                    count += 1;
                }
            }
        }
        return count;
    }
}
