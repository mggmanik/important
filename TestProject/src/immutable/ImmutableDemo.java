package immutable;

final class ImmutableDemo {

//  • Class must be declared as final (So that child classes can’t be created)
//  • Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
//  • A parameterized constructor
//  • Getter method for all the variables in it
//  • No setters(To not have option to change the value of the instance variable)

    final String name;
    final int regNo;

    public ImmutableDemo(String name, int regNo)
    {
        this.name = name;
        this.regNo = regNo;
    }
    public String getName()
    {
        return name;
    }
    public int getRegNo()
    {
        return regNo;
    }
}

