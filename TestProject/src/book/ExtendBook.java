package book;

public class ExtendBook extends Book {

    public void setTitle(String s)
    {
        title = s;
    }

    public static void main(String[] args) {

        ExtendBook eb = new ExtendBook();
        eb.setTitle("Harry Potter");
        System.out.println(eb.getTitle());
    }

}
