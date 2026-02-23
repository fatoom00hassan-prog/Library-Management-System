#  Library Management System

##  Project Overview
The Library Management System is a desktop-based application developed using Java (Object-Oriented Programming) and JDBC with SQL Server integration.

The system automates core library operations including book management, member registration, borrowing, and returning processes. It replaces manual record-keeping with a structured, database-driven solution to improve efficiency, accuracy, and data organization.

This project was developed as a group project at Imam Abdulrahman Bin Faisal University (IAU).


##  Project Structure

```
Library-Management-System/
│
├── src/                        # Java source files (Business Logic & UI)
│   ├── DatabaseConnection.java
│   ├── DatabaseManager.java
│   ├── MainFrame.java
│   ├── ManageBook.java
│   ├── ManageCategories.java
│   ├── Reservation.java
│   ├── Users.java
│   └── ...
│
├── database/                   # SQL database script
│   └── LMS.sql
│
├── screenshots/                # Application UI screenshots
│   ├── admin/                  # Admin interface screens
│   ├── member/                 # Member interface screens
│   └── welcome.png
│
├── docs/                       # System design documentation
│   ├── uml.png
│   ├── er.png
│   └── relation-schema.png
│
├── README.md
└── manifest.mf
```

##  Tech Stack

Language: Java  

Programming Paradigm: Object-Oriented Programming (OOP)  

Database: Microsoft SQL Server  

Database Connectivity: JDBC (Java Database Connectivity)  

User Interface: Java Swing


##  Key Features

###  Admin Capabilities
- Full CRUD operations for books, users, and categories
- Borrow and return management
- Reservation handling
- Fine calculation and management
- Report generation and TXT export functionality

###  Member Capabilities
- Book search functionality
- View borrowed books
- Reserve and cancel reservations
- View reservation history

##  Database Design
The system is connected to a SQL Server database that includes:
- Books Table
- Members Table
- Borrowing Records Table
- Defined relationships using ERD



