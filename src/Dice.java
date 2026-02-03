public class Dice {
    int sides = 0;
    int roll = 0;
    int numtimesrolled = 0;
    public Dice(int sides){
        this.sides = sides;
    }
    public int roll(){
        roll = (int) (Math.random() * sides) + 1;
        numtimesrolled++;
        return roll;
    }
    public int getRollValue(){
        return roll;
    }
    public int getRollCount(){
        return numtimesrolled;
    }
    public int getSides(){
        return this.sides;
    }
    public String setSides(int sides){
        this.sides = sides;
        return "The dice has now a D" + sides;
    }
}
