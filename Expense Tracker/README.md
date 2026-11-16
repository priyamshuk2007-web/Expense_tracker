# Expense Tracker

A simple command-line expense tracker built using Java. The program reads expense records from a text file, groups expenses by category, and generates a basic expense summary.

## Features

- Reads expense records from a text file.
- Groups expenses by category.
- Calculates total expenses for each category.
- Calculates the overall expenditure.
- Identifies the category with the highest expenditure.

## Technologies Used

- Java
- Java Collections Framework (`HashMap`, `Map`)
- Java I/O (`FileReader`, `BufferedReader`)
- Exception Handling

## Input Format

The program reads records from `expense.txt`.

Each record should follow this format:

```text
Date,Category,Amount
```

Example:

```text
01-11-2026,Food,150
02-11-2026,Travel,80
03-11-2026,Food,200
04-11-2026,Entertainment,300
```

## How to Run

1. Clone this repository.
2. Open the project directory in your terminal.
3. Compile the Java source file:

```bash
javac expense_tracker.java
```

4. Run the program:

```bash
java expense_tracker
```

Make sure `expense.txt` is present in the working directory.

## Concepts Practised

- File handling
- HashMaps and Map interfaces
- String manipulation
- Data parsing
- Iteration
- Exception handling
- Basic data aggregation

## Future Improvements

- Allow users to add expenses through console input.
- Support adding and updating expense records.
- Identify the category with the lowest expenditure.
- Improve input validation and error handling.

## Author

Priyam