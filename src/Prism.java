public class Prism {
    private int length = 0;
    private int width = 0;
    private int height = 0;
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
    public int returnDimensions(){
        return "Length: " + this.length + "\n" + "Width: " + this.width + "\n" + "Height: " + this.height;
    }
    public int volume(){
        return this.height * this.width * this.length;
    }
    public int surfaceArea(){

    }
}
