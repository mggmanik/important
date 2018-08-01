import java.util.Scanner;

public class Cuboid {

    private int length;
    private int width;
    private int height;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        int n,l,w,h,vol;
        System.out.println("Enter the number of inputs: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Cuboid[] obj = new Cuboid[n];
        for(int i=0;i<n;i++)
        {
            obj[i] = new Cuboid();
            System.out.println("Enter Length:");
            l = in.nextInt();
            obj[i].setLength(l);
            System.out.println("Enter Width:");
            w = in.nextInt();
            obj[i].setWidth(w);
            System.out.println("Enter Height:");
            h = in.nextInt();
            obj[i].setHeight(h);

            vol = obj[i].getLength()*obj[i].getWidth()*obj[i].getHeight();

            System.out.println("Volume of cuboid: "+vol);
        }
    }
}
