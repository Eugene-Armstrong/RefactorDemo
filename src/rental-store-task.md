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

3.  given customer named Mark,having rent 1 regular movie for 3 day
    when call Customer.statement()
    then return "Rental Record for Mark
                 	Titanic	3.5
                 Amount owed is 3.5
                 You earned 1 frequent renter points"

4.  given customer named Mark,having rent 1 new release movie for 1 day
    when call Customer.statement()
    then return "Rental Record for Mark
                 	Titanic	3.0
                 Amount owed is 3.0
                 You earned 1 frequent renter points"

5.  given customer named Mark,having rent 1 new release movie for 2 day
    when call Customer.statement()
    then return "Rental Record for Mark
                 	Titanic	6.0
                 Amount owed is 6.0
                 You earned 2 frequent renter points"