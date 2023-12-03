package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentScore {
    private String name;
    private int score;

    public StudentScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "StudentScore{" + "name='" + name + '\'' + ", score=" + score + '}';
    }

    public static void findTopThree(ArrayList<StudentScore> studentScores) {
        Collections.sort(studentScores, new Comparator<StudentScore>() {
            @Override
            public int compare(StudentScore o1, StudentScore o2) {
                if (o2.getScore() != o1.getScore()) {
                    return o2.getScore() - o1.getScore(); // Descending order of scores
                }
                return o1.getName().compareTo(o2.getName()); // Ascending order of names
            }
        });

        int limit = Math.min(3, studentScores.size());
        for (int i = 0; i < limit; i++) {
            System.out.println(studentScores.get(i));
        }
    }
}

public class Gpt1C {
    public static void main(String[] args) {
        ArrayList<StudentScore> scores = new ArrayList<>();
        scores.add(new StudentScore("Alice", 85));
        scores.add(new StudentScore("Bob", 90));
        scores.add(new StudentScore("Charlie", 90));
        scores.add(new StudentScore("Dave", 88));

        StudentScore.findTopThree(scores);
    }
}
