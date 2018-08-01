package clone;

public class CopyOfObject implements Cloneable {

    int a,b;
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}

