package rentalstore.statement;

import rentalstore.Customer;
import rentalstore.Rental;

import java.util.Enumeration;

public class HtmlStatement extends Statement  {

    protected String headerString(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

    protected String bodyString(Customer customer) {
        Enumeration rentals = customer.getRentals();
        String result = "";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
        }
        return result;
    }

    protected String footerString(Customer customer) {
        return "<P>You owe<EM>"
                + String.valueOf(customer.getTotalCharge())
                + "</EM><P>\n" + "On this rental you earned <EM>"
                + String.valueOf(customer.getTotalFrequentRenterPoints())
                + "</EM> frequent renter points<P>";
    }
}
