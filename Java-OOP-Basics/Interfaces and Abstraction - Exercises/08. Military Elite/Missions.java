package militaryElite;

public class Missions {
    private String codeName;
    private String state;

    public Missions(String codeName, String state) {
        this.codeName = codeName;
        this.state = state;
    }

    public String getCodeName() {
        return codeName;
    }

    public String getState() {
        return state;
    }

    public boolean completeMission(String state){
       if (state.equals("inProgress")){
           return true;
       } else if (state.equals("Finished")){
           return true;
        }
        return false;
    }
}
