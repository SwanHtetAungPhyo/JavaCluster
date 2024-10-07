Explanation
Encapsulation:

The BankAccount class has private fields (accountNumber and balance), preventing direct access from outside the class. This protects the integrity of the account data.
Controlled Access:

Public methods (deposit, withdraw, getBalance, getAccountNumber) provide controlled access to the internal state. For example, the deposit method only allows positive amounts to be added, while the withdraw method checks if there are sufficient funds