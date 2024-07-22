package packofcards;

public class packOfCards {

    public String solution(String[] cards1, String[] cards2, String[] goal) {

        for (int i = 0; i < goal.length; i++) {


            if (cards1[i].equals(goal[i])) {
                continue;
            }

            if (cards2[i].equals(goal[i])) {
                continue;
            }

            return "No";
        }

        return "Yes";
    }
}
