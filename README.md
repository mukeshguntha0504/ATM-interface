ATM Interface in Java
This repository contains a simple implementation of an ATM (Automated Teller Machine) interface in Java. The code provides functionalities such as depositing money, withdrawing money, transferring money, checking transaction history, and exiting the system.

Features
Deposit: Allows users to deposit money into the ATM.
Withdraw: Enables users to withdraw money from the ATM, provided they have sufficient balance.
Transfer Money: Simulates transferring money from the ATM to another account.
Transaction History: Displays a list of all transactions performed.
Exit: Allows users to exit the ATM interface.
Code Structure
The code is structured into two main classes:

Transaction: Represents individual transactions with attributes such as type (e.g., Deposit, Withdrawal) and amount.

ATM: Manages the ATM functionalities and transaction history. Key methods include:

deposit(double amount): Adds money to the ATM balance and records the transaction.
withdraw(double amount): Deducts money from the ATM balance if sufficient funds are available and records the transaction.
transfer(double amount): Simulates transferring money to another account.
displayTransactionHistory(): Prints out all transactions recorded.
main(String[] args): Simulates the ATM interface with a menu-driven approach using Scanner for user input.
Usage
To use this ATM interface:

Clone the repository:

bash
Copy code
git clone https://github.com/your-username/atm-interface-java.git
Compile the Java files:

Copy code
javac ATM.java
Run the ATM interface:

Copy code
java ATM
Follow the on-screen prompts to perform transactions:

Enter option 1 to deposit money.
Enter option 2 to withdraw money.
Enter option 3 to transfer money.
Enter option 4 to view transaction history.
Enter option 5 to exit the ATM interface.
Example
Here’s an example session with the ATM interface:

markdown
Copy code
ATM Menu:
1. Deposit
2. Withdraw
3. Transfer Money
4. Transaction History
5. Exit
Choose an option: 1
Enter amount to deposit: 500
500.0 deposited successfully.

ATM Menu:
1. Deposit
2. Withdraw
3. Transfer Money
4. Transaction History
5. Exit
Choose an option: 2
Enter amount to withdraw: 200
200.0 withdrawn successfully.

ATM Menu:
1. Deposit
2. Withdraw
3. Transfer Money
4. Transaction History
5. Exit
Choose an option: 4
Transaction History:
Transaction{type='Deposit', amount=500.0}
Transaction{type='Withdrawal', amount=200.0}

ATM Menu:
1. Deposit
2. Withdraw
3. Transfer Money
4. Transaction History
5. Exit
Choose an option: 5
Exiting ATM. Thank you!
Notes
This code is a basic implementation and does not include advanced features like authentication, multi-threading, or database integration.
Feel free to modify and extend the code according to your needs.
