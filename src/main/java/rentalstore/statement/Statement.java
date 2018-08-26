package rentalstore.statement;

import rentalstore.Customer;

public abstract class Statement {

    public String statement(Customer customer){
        return headerString(customer)+ bodyString(customer)+footerString(customer);
    }

    protected abstract String footerString(Customer customer);

    protected abstract String bodyString(Customer customer);

    protected abstract String headerString(Customer customer);
}
