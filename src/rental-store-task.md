1.  given customer named Mark,having no rental
    when call Customer.statement()
    then return "Rental Record for Mark
                 Amount owed is 0.0
                 You earned 0 frequent renter points"

2.  given customer named Mark,having rent 1 regular movie for 1 day
    when call Customer.statement()
    then return "Rental Record for Mark
                 	Titanic	2.0
                 Amount owed is 2.0
                 You earned 1 frequent renter points"