package immutable;

import immutable.ImmutableDemo;

public class TestClass {

       public static void main(String args[])
        {
            ImmutableDemo id = new ImmutableDemo("ABC", 101);
            System.out.println(id.getName());
            System.out.println(id.getRegNo());

        }
}
