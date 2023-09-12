import java.util.*;
interface StudentFee
{
    double getAmount();
    String getFirstName();
    String getLastName();
    String getAddress();
    String getContact();
}

class Hostler implements StudentFee
{
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private double collegeFee;
    private double messFee;

    public Hostler(String firstName, String lastName, String address, String contact, double collegeFee, double messFee)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.collegeFee = collegeFee;
        this.messFee = messFee;
    }

    @Override
    public double getAmount()
    {
        return collegeFee + messFee;
    }

    @Override
    public String getFirstName()
    {
        return firstName;
    }

    @Override
    public String getLastName()
    {
        return lastName;
    }

    @Override
    public String getAddress()
    {
        return address;
    }

    @Override
    public String getContact()
    {
        return contact;
    }
}

class NonHostler implements StudentFee
{
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private double collegeFee;

    public NonHostler(String firstName, String lastName, String address, String contact, double collegeFee)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.collegeFee = collegeFee;
    }

    @Override
    public double getAmount()
    {
        return collegeFee;
    }

    @Override
    public String getFirstName()
    {
        return firstName;
    }

    @Override
    public String getLastName()
    {
        return lastName;
    }

    @Override
    public String getAddress() 
    {
        return address;
    }

    @Override
    public String getContact() 
    {
        return contact;
    }
}

class Fee {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String hostlerFirstName = scanner.nextLine();
        // System.out.print("Last Name: ");
        String hostlerLastName = scanner.nextLine();
        // System.out.print("Address: ");
        String hostlerAddress = scanner.nextLine();
        // System.out.print("Phone No: ");
        String hostlerContact = scanner.nextLine();
        // System.out.print("College Fee: ");
        double hostlerCollegeFee = scanner.nextDouble();
        // System.out.print("Mess Fee: ");
        double hostlerMessFee = scanner.nextDouble();

        Hostler hostler = new Hostler(hostlerFirstName, hostlerLastName, hostlerAddress, hostlerContact, hostlerCollegeFee, hostlerMessFee);
        // System.out.print("First Name: ");
        String nonHostlerFirstName = scanner.nextLine();
        // System.out.print("Last Name: ");
        String nonHostlerLastName = scanner.nextLine();
        // System.out.print("Address: ");
        String nonHostlerAddress = scanner.nextLine();
        // System.out.print("Phone No: ");
        String nonHostlerContact = scanner.nextLine();
        // System.out.print("College Fee: ");
        double nonHostlerCollegeFee = scanner.nextDouble();

        NonHostler nonHostler = new NonHostler(nonHostlerFirstName, nonHostlerLastName, nonHostlerAddress, nonHostlerContact, nonHostlerCollegeFee);

        System.out.println("Type: Hostler");
        System.out.println("Name: " + hostler.getFirstName() + " " + hostler.getLastName());
        System.out.println("Address: " + hostler.getAddress());
        System.out.println("Phone No: " + hostler.getContact());
        System.out.format("Amount: %.2f\n", hostler.getAmount());
        System.out.println("Type: Non Hostler");
        System.out.println("Name: " + nonHostler.getFirstName() + " " + nonHostler.getLastName());
        System.out.println("Address: " + nonHostler.getAddress());
        System.out.println("Phone No: " + nonHostler.getContact());
        System.out.format("Amount: %.2f\n", nonHostler.getAmount());
        scanner.close();
    }
}