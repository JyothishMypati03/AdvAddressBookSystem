# UC-02 : Add a New Person

## What is UC-02?

UC-02 is used to create a new **Person**.

The user enters the person's details through the **console**, and the application creates a `Person` object.

---

## Why do we need this?

To store a person's information in the Address Book.

Before adding a person to the Address Book, we must first create a `Person` object.

---

## What do we do in this use case?

- Read person details from the console.
- Create a `Person` object.
- Store the entered details in the object.
- Display the person's details.

---

## Classes Used

### Person.java

Stores the person's information.

### AddressBookMain.java

- Takes input from the user.
- Creates a `Person` object.
- Displays the person's details.

---

## Flow

```text
User
   ↓
Enter Details
   ↓
Create Person Object
   ↓
Store Details
   ↓
Display Details
```

---

## Learning

- How to use `Scanner`.
- How to create an object.
- How to store values in an object.
- How one class uses another class.

---

## Status

✅ UC-02 Completed