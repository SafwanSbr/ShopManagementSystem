# Shop Management System

## Project Overview

The Shop Management System is a Java-based application developed in Eclipse IDE. This system aims to provide a comprehensive solution for managing various aspects of a shop, including accounts, customer information, and payment processing. The project adheres to fundamental Object-Oriented Programming (OOP) principles and incorporates several key features.

## Implemented Requirements

1. **Inheritance**
   - Implemented in files: `AccountExpenses`, `Cash`, `Card`, `MobileBanking`, etc.
   - Inheritance is utilized to facilitate the reuse of variables and methods from a superclass to its subclasses.

2. **Encapsulation**
   - Implemented in files: `Account`, `Cash`.
   - Encapsulation is employed to hide data within classes and ensure controlled access.

3. **Polymorphism**
   - Implemented in files: `AccountExpenses`, `AccountRevenue`.
   - Polymorphism is achieved through the use of multiple forms of the same method.

4. **Exception Handling**
   - Implemented in the `Main` file, specifically in the `checkInput` methods.
   - Manual handling of exceptions is incorporated to enhance robustness.

5. **File I/O**
   - Implemented in the `FileCustomer` file.
   - File I/O operations are utilized for reading from and writing to a file, managing customer data.

6. **Interface/Abstract Class**
   - Implemented in files: `OnlinePayment`, `OfflinePayment`, `Payment`.
   - Abstraction is achieved through interfaces and abstract classes.

7. **Final Keyword**
   - Implemented in the `Account` file.
   - The final keyword is used to prevent method overriding in certain cases.

## How to Run the Project

1. Clone the repository to your local machine.
2. Open the project in Eclipse IDE.
3. Run the `Main` class to start the Shop Management System.

## Usage

- Choose options for managing accounts, customers, and payments through the interactive console-based menu.
- Input validation and error handling are implemented for a seamless user experience.

## File Structure

- `Main.java`: Main class orchestrating the entire system.
- `AccountExpenses.java`, `Cash.java`, `Card.java`, `MobileBanking.java`: Classes representing various account and payment types.
- `Account.java`: Class implementing encapsulation and using the final keyword.
- `FileCustomer.java`: Handles File I/O for customer information.
- `OnlinePayment.java`, `OfflinePayment.java`, `Payment.java`: Interfaces and abstract classes for payment methods.
- Other supporting files for specific functionalities.

## Contributing
Supervisor : <a href="https://www.linkedin.com/in/md-ismail-hossen-a5b144ba/">Md Ismail Hossen Sir</a>
Feel free to fork the repository, make improvements, and submit pull requests.
