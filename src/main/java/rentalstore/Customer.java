package rentalstore;

import rentalstore.statement.HtmlStatement;
import rentalstore.statement.Statement;
import rentalstore.statement.TxtStatement;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    private Statement statement=new TxtStatement();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public Enumeration getRentals() {
        return rentals.elements();
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public String txtStatement(){
        setStatement(new TxtStatement());
        return this.statement.statement(this);
    }

    public String htmlStatement() {
        setStatement(new HtmlStatement());
        return this.statement.statement(this);
    }

    public double getTotalCharge() {
        double result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    public int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRentalPoints();
        }
        return result;

    }
}
