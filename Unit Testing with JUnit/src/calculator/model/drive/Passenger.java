package calculator.model.drive;

public class Passenger
{

    private final String name;

    private final String id;

    private double balance = 0;

    private boolean isOnTrip = false;

    public Passenger( String name, String id )
    {
        this.name = name;
        this.id = id;
    }

    public void addBalance( double balance )
    {
        this.balance += balance;
    }

    public boolean hasEnoughBalance( double balance )
    {
        return this.balance > balance;
    }

    public Passenger( String name, String id, double balance )
    {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public Boolean isOnTrip() { return isOnTrip; }

    public void startTrip()
    {
        isOnTrip = true;
    }

    public void endTrip( double fee )
    {
        balance -= fee;
        isOnTrip = false;
    }
}
