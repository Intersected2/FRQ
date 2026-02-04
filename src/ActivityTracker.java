public class ActivityTracker {
    private int goal = 0;
    private int totalmins = 0;
    private int activity = 0;
    private int max = 0;
    public ActivityTracker(int goal){
        this.goal = goal;
    }
    public void logMinutes(int minutes){
        totalmins += minutes;
        activity++;
        if (max < minutes){
            max = minutes;
        }
    }
    public int getTotalMinutes(){
        return totalmins;
    }
    public int getSessions(){
        return activity;
    }
    public boolean goalAchieved(){
        if(totalmins > this.goal){
            return true;
        } else {
            return false;
        }
    }
    public int getMaxMinutes(){
        return max;
    }
}
