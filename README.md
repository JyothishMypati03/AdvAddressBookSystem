# Address Book System

A Java console-based **Address Book System** developed using **Core Java**, **Object-Oriented Programming (OOP)**, **Collections Framework**, **Java Streams**, **File Handling**, **OpenCSV**, **Gson**, **REST Assured**, and **Multithreading**.

This project is implemented incrementally using **15 Use Cases (UC1–UC15)**, with each use case developed in a separate Git branch.

---

# Features

- Add Contact
- Edit Contact
- Delete Contact
- Display Contacts
- Search Contacts
- Sort Contacts
- Prevent Duplicate Entries
- View Contacts by City and State
- Read/Write JSON Files
- Read/Write CSV Files
- Gson Serialization
- REST API Testing using REST Assured
- Multithreading

---

# Technologies Used

- Java 17
- Maven
- Collections Framework
- Java Streams API
- Java NIO File API
- OpenCSV
- Gson
- REST Assured
- JUnit 5
- Git & GitHub

---

# Project Structure

```text
AddressBookSystem
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── bridgelabz
│   │   │           └── addressbook
│   │   │               │
│   │   │               ├── model
│   │   │               │     └── Person.java
│   │   │               │
│   │   │               ├── service
│   │   │               │     ├── AddressBook.java
│   │   │               │     ├── FileService.java
│   │   │               │     ├── CSVService.java
│   │   │               │     └── JsonService.java
│   │   │               │
│   │   │               ├── util
│   │   │               │
│   │   │               └── AddressBookMain.java
│   │   │
│   │   └── resources
│   │         ├── contacts.json
│   │         └── contacts.csv
│   │
│   └── test
│
├── pom.xml
├── .gitignore
└── README.md
```

---

# Project Workflow

```text
UC1 → Create Contact

↓

UC2 → Add Contact

↓

UC3 → Edit Contact

↓

UC4 → Delete Contact

↓

UC5 → Multiple Contacts

↓

UC6 → Prevent Duplicate Contacts

↓

UC7 → Sort Contacts by Name

↓

UC8 → Sort by City, State and Zip

↓

UC9 → View Contacts by City or State

↓

UC10 → Search Contacts by City or State

↓

UC11 → JSON File Handling

↓

UC12 → CSV File Handling

↓

UC13 → Gson JSON Serialization

↓

UC14 → REST Assured (JSON Server)

↓

UC15 → Multithreading
```

---

# Git Branch Strategy

Each use case is implemented in a separate branch.

```text
main

feature/uc1-create-contact
feature/uc2-add-contact
feature/uc3-edit-contact
feature/uc4-delete-contact
feature/uc5-multiple-contacts
feature/uc6-prevent-duplicates
feature/uc7-sort-contacts
feature/uc8-sort-city-state-zip
feature/uc9-view-by-city-state
feature/uc10-search-by-city-state
feature/uc11-json-file
feature/uc12-csv-file
feature/uc13-gson
feature/uc14-rest-assured
feature/uc15-multithreading
```

---

# OOP Concepts Used

- Class and Object
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism
- Composition

---

# Java Concepts Used

- Collections Framework
- ArrayList
- HashMap
- HashSet
- Java Streams
- Lambda Expressions
- Comparator
- File Handling
- Java NIO
- Exception Handling
- Regular Expressions
- JSON Processing
- CSV Processing
- Multithreading

---

# Learning Outcomes

After completing this project, you will understand:

- Object-Oriented Programming
- Collections Framework
- Stream API
- File Handling
- JSON Processing
- CSV Processing
- Gson Library
- REST API Testing
- Multithreading
- Maven Project Structure
- Git Branch Workflow

---

# Future Enhancements

- Database Integration (MySQL)
- Spring Boot REST API
- Hibernate/JPA
- User Authentication
- GUI using JavaFX
- Cloud Deployment

---

# Author

**Jyothish Mypati**

Java Full Stack Developer