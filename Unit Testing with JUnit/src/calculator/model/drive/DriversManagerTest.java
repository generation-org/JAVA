package calculator.model.drive;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;



public class DriversManagerTest
{

    private final DriversManager driversManager = new DriversManager();

    @Before
    public void setup(){
        driversManager.addPassenger( new Passenger( "Carlos", "44234", 100 ) );
        driversManager.addPassenger( new Passenger( "Elise", "533434", 100 ) );
        driversManager.addPassenger( new Passenger( "Ian", "5343433", 100 ) );
        driversManager.addPassenger( new Passenger( "Debbie", "44555521", 100 ) );
        driversManager.addPassenger( new Passenger( "Cleon", "559988", 100 ) );
        driversManager.addPassenger( new Passenger( "Santiago", "1203123", 100 ) );

        driversManager.addDriver( new Driver( "Emilio", "1234990", 10f ) );
        driversManager.addDriver( new Driver( "Pedro", "12312440", 12f ) );
        driversManager.addDriver( new Driver( "Constanza", "9824990", 11f ) );
    }

    @Test
    public void startTripTest(){
        driversManager.startTrip("44234", "1234990");
        Driver driver = driversManager.getDriver("1234990");
        Assert.assertFalse("failure - driver should be unavailable", driver.isAvailable());
        Passenger passenger = driversManager.getPassenger("44234");
        Assert.assertTrue("failure - passenger should be on trip", passenger.isOnTrip());
    }

    @Test
    public void endTripTest(){
        driversManager.endTrip("44234", "1234990");
        Driver driver = driversManager.getDriver("1234990");
        Assert.assertTrue("failure - driver should be available", driver.isAvailable());
        Passenger passenger = driversManager.getPassenger("44234");
        Assert.assertFalse("failure - passenger should not be on trip", passenger.isOnTrip());
    }

    @Test
    public void nextAvailableDriverTest(){
        Driver driver = driversManager.getDriver(driversManager.findNextAvailableDriver());
        Assert.assertNotNull("failure - driver should not be null", driver);
        Assert.assertTrue("failure - next available driver should be available", driver.isAvailable());
    }
}
