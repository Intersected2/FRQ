public class Spinner {
    private int sections = 0;
    private int spinvalue = 0;
    private int spincount = 0;
    private double total = 0;
    private int total2 = 0;
    public Spinner(int sections){
        this.sections = sections;
    }
    public void spin(){
        spinvalue = (int) (Math.random() * this.sections) + 1;
        spincount++;
        total += spinvalue;
        total2 += spinvalue;
    }
    public int getSpinCount(){
        return spincount;
    }
    public double averageSpin(){
        return total / spincount;
    }
    public int getSpinSum(){
        return total2;
    }
    public int getSpinValue(){
        return spinvalue;
    }
}
