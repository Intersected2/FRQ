public class Prism {
    private int length = 0;
    private int width = 0;
    private int height = 0;
    private int ram = 0;
    private int ram1 = 0;
    private int ram2 = 0;
    private int sa = 0;
    public Prism(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Prism(int sidelength){
        this.length = sidelength;
        this.width = sidelength;
        this.height = sidelength;
    }
    public String dimensions(){
        return "Length: " + this.length + "\n" + "Width: " + this.width + "\n" + "Height: " + this.height;
    }
    public int volume(){
        return this.height * this.width * this.length;
    }
    public int surfaceArea(){
        ram = this.length * this.width * 2;
        ram1 = this.length * this.height * 2;
        ram2 = this. width * this.height * 2;
        sa = ram + ram1 + ram2;
        return sa;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
}
