import java.util.ArrayList;

public class Bob {
    private ArrayList moods;

    public Bob() {
        this.moods = new ArrayList<MoodType>();
    }

    public void addMood(MoodType m) {
        this.moods.add(m);
    }

    public String getMood(int index) {
        int ind = index - 1;
        if (ind > this.moods.size()) {
            throw new RuntimeException("Unknown mood");
        } else {
            MoodType mood = (MoodType) moods.get(ind);
            return mood.getMood();
        }
    }
}
