## ATM Interface in Java
This repository contains a simple implementation of an ATM (Automated Teller Machine) interface in Java. The code provides functionalities such as depositing money, withdrawing money, transferring money, checking transaction history, and exiting the system.

## Code Structure
The code is structured into two main classes:

Transaction: Represents individual transactions with attributes such as type (e.g., Deposit, Withdrawal) and amount.

ATM: Manages the ATM functionalities and transaction history. Key methods include:

deposit(double amount): Adds money to the ATM balance and records the transaction.
withdraw(double amount): Deducts money from the ATM balance if sufficient funds are available and records the transaction.
transfer(double amount): Simulates transferring money to another account.
displayTransactionHistory(): Prints out all transactions recorded.
main(String[] args): Simulates the ATM interface with a menu-driven approach using Scanner for user input.

## Usage
To use this ATM interface:

1. *Clone the repository*
Copy code
git clone https://github.com/your-username/atm-interface-java.git

2. *Compile the Java files*
Copy code
javac ATM.java

3. *Run the ATM interface*
Copy code
java ATM

4. *Follow the on-screen prompts to perform transactions*

Enter option 1 to deposit money.
Enter option 2 to withdraw money.
Enter option 3 to transfer money.
Enter option 4 to view transaction history.
Enter option 5 to exit the ATM interface.
Example
Here’s an example session with the ATM interface:

## Features
Deposit: Allows users to deposit money into the ATM.
Withdraw: Enables users to withdraw money from the ATM, provided they have sufficient balance.
Transfer Money: Simulates transferring money from the ATM to another account.
Transaction History: Displays a list of all transactions performed.
Exit: Allows users to exit the ATM interface.

## Notes
This code is a basic implementation and does not include advanced features like authentication, multi-threading, or database integration.
Feel free to modify and extend the code according to your needs.
