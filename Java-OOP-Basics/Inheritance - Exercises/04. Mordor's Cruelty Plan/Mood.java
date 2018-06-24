package mordor;

import java.util.ArrayList;
import java.util.List;

public class Mood {
    private List<Food> foodList;

    public Mood(List<Food> foods) {
        this.foodList = foods;
    }

    private int pointsOfHappiness() {
        int pointsOfHappiness = 0;
        for (Food food : this.foodList) {
            switch (food.getName()) {
                case "cram":
                    pointsOfHappiness += 2;
                    break;
                case "lembas":
                    pointsOfHappiness += 3;
                    break;
                case "apple":
                    pointsOfHappiness += 1;
                    break;
                case "melon":
                    pointsOfHappiness += 1;
                    break;
                case "honeycake":
                    pointsOfHappiness += 5;
                    break;
                case "mushrooms":
                    pointsOfHappiness -= 10;
                    break;
                default:
                    pointsOfHappiness -= 1;
                    break;
            }
        }


        return pointsOfHappiness;
    }

    private String moodGandalf(){
        if (this.pointsOfHappiness() < -5){
            return "Angry";
        } else if (this.pointsOfHappiness() < 0){
            return "Sad";
        } else if (this.pointsOfHappiness() < 15){
            return "Happy";
        }
        return "JavaScript";
    }

    @Override
    public String toString() {
        return String.format("%d%n%s",this.pointsOfHappiness(),this.moodGandalf());
    }
}
