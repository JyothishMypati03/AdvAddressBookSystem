# UC-04 : Delete a Person

## What is UC-04?

UC-04 allows the user to delete an existing person using the person's **name**.

---

## Why do we need this?

Sometimes a person's information is no longer needed.

This use case allows the user to remove that person's details from the Address Book.

---

## What do we do in this use case?

- Create a `Person` object.
- Enter person details.
- Display the person's details.
- Ask the user to enter the person's name.
- If the name matches, delete the person.
- Display a success message.

---

## Classes Used

### Person.java

Stores the person's information.

### AddressBookMain.java

- Reads user input.
- Creates a `Person` object.
- Deletes the person using the person's name.
- Displays the result.

---

## Flow

```text
Create Person
      ↓
Enter Details
      ↓
Display Details
      ↓
Enter Person Name
      ↓
Name Found?
   ↓        ↓
 Yes       No
 ↓          ↓
Delete    Show Message
Person
```

---

## Sample Output

```text
Enter First Name : Rahul
Enter Last Name : Sharma

Person Created Successfully

Enter Name to Delete : Rahul

Person Deleted Successfully
```

---

## Learning

- How to compare strings.
- How to delete an object.
- How to use `if` statements.
- How one class uses another class.

---

## Status

✅ UC-04 Completed