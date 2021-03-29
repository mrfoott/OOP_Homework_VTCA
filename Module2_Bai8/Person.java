public abstract class Person
{
    protected String lastName;
    protected String firstName;

    public Person(String lastName, String firstName)
    {
        if (!lastName.trim().equals(""))
        {
            this.lastName = lastName;
        }
        else
        {
            this.lastName = "null";
        }

        if (!firstName.trim().equals(""))
        {
            this.firstName = firstName;
        }
        else
        {
            this.firstName = "null";
        }
    }

    public String getLastName() 
    {
        return lastName;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setLastName(String lastName) 
    {
        if (!lastName.trim().equals(""))
        {
            this.lastName = lastName;
        }
        else
        {
            this.lastName = "null";
        }
    }

    public void setFirstName(String firstName) 
    {
        if (!firstName.trim().equals(""))
        {
            this.firstName = firstName;
        }
        else
        {
            this.lastName = "null";
        }
    }

    public abstract boolean equals(Person ps);
}