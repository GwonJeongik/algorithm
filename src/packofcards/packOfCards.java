package packofcards;

public class packOfCards {

    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int cards1Index = 0;
        int cards2Index = 0;

        for (int i = 0; i < goal.length; i++) {

            if (cards1[cards1Index].equals(goal[i])) {
                if (cards1.length - 1 > cards1Index) {
                    cards1Index++;
                }
                continue;
            }

            if (cards2[cards2Index].equals(goal[i])) {
                if (cards2.length - 1 > cards2Index) {
                    cards2Index++;
                }
                continue;
            }

            return "No";
        }

        return "Yes";
    }
}
