
## ATM Interface in Java

This repository contains a simple Java implementation of an ATM (Automated Teller Machine) interface. The code allows users to perform basic banking operations such as depositing money, withdrawing money (with sufficient balance), transferring money, checking transaction history, and exiting the system.

### Code Structure

The repository consists of two main Java classes:

1. **Transaction**: Represents individual transactions with attributes like type (Deposit, Withdrawal, Transfer) and amount.
   
2. **ATM**: Manages the ATM functionalities:
   - `deposit(double amount)`: Adds the specified amount to the ATM balance and records a deposit transaction.
   - `withdraw(double amount)`: Deducts the specified amount from the ATM balance if sufficient funds are available and records a withdrawal transaction.
   - `transfer(double amount)`: Simulates transferring money to another account.
   - `displayTransactionHistory()`: Prints all recorded transactions.
   - `main(String[] args)`: Implements the main ATM interface, where users interact via a menu-driven system using `Scanner` for input.

### Usage

To run the ATM interface:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/atm-interface-java.git
   ```

2. **Compile the Java files**:
   ```bash
   javac ATM.java
   ```

3. **Run the ATM interface**:
   ```bash
   java ATM
   ```

4. **Follow the on-screen prompts**:
   - Select `1` to deposit money.
   - Select `2` to withdraw money.
   - Select `3` to transfer money.
   - Select `4` to view transaction history.
   - Select `5` to exit the ATM interface.

### Example Session

Here is an example session demonstrating interactions with the ATM interface:

### Features

- **Deposit**: Allows users to add funds to their account.
- **Withdraw**: Enables users to withdraw funds, provided their balance is sufficient.
- **Transfer Money**: Simulates transferring money to another account (simplified for        demonstration).
- **Transaction History**: Displays a list of all transactions conducted during the session.
- **Exit**: Allows users to exit the ATM interface.

### Notes

- This repository serves as a basic example of an ATM interface and does not include advanced features such as authentication or database integration.
- You are encouraged to modify and expand the codebase according to your specific requirements.
