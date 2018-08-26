package rentalstore.statement;

import rentalstore.Customer;
import rentalstore.Rental;

import java.util.Enumeration;

public class TxtStatement extends Statement {

    protected String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    protected String bodyString(Customer customer) {
        Enumeration rentals = customer.getRentals().elements();
        String result = "";
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        return result;
    }

    protected String footerString(Customer customer) {
        return "Amount owed is "
                + String.valueOf(customer.getTotalCharge()) + "\n"
                + "You earned "
                + String.valueOf(customer.getTotalFrequentRenterPoints())
                + " frequent renter points";
    }
}
