package packofcards;

public class packOfCards {

    public String solution(String[] cards1, String[] cards2, String[] goal) {

        for (int i = 0; i < goal.length; i++) {
            System.out.println("goal[i] = " + goal[i]);
            for (int j = 0; j < goal.length; j++) {

                //2. cards1과 cards2의 배열길이가 넘어가지 않게 처리.
                if ((cards1.length - 1) >= j && cards1[j].equals(goal[i])) {
                    break;
                }

                if ((cards2.length - 1) >= j && cards2[j].equals(goal[i])) {
                    break;
                }

                if (j < goal.length) {
                    continue;
                }

                return "No";
            }
        }

        return "Yes";
    }
}
