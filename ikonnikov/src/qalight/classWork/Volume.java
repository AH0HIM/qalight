package qalight.classWork;

public class Volume {
    int width;
    int length;
    int high;
    int volume;

    public int Volume(){
        this.volume = 0;
        return volume;
    }

    public double Volume(int width, int length, int high){
        volume = width*length*high;
        return volume;
    }

    public void Volume (int width){
        volume = width*width*width;
        System.out.println(volume);
    }
}
