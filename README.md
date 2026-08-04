# UC-03 : Edit Person Details

## What is UC-03?

UC-03 allows the user to edit the details of an existing person.

The person's **First Name** and **Last Name** cannot be changed.

---

## Why do we need this?

Sometimes a person's information changes.

For example:

- Address
- City
- State
- Zip Code
- Phone Number
- Email

UC-03 allows the user to update these details.

---

## What do we do in this use case?

- Create a `Person` object.
- Read person details from the console.
- Display the person's details.
- Edit the person's information (except name).
- Display the updated details.

---

## Classes Used

### Person.java

Stores the person's information.

### AddressBookMain.java

- Reads input from the user.
- Creates a `Person` object.
- Updates the person's details.
- Displays the updated information.

---

## Flow

```text
Create Person
      ↓
Enter Details
      ↓
Display Details
      ↓
Edit Details
      ↓
Display Updated Details
```

---

## Sample Output

```text
Enter First Name : Rahul
Enter Last Name : Sharma
Enter Address : MG Road
Enter City : Bangalore
Enter State : Karnataka
Enter Zip : 560001
Enter Phone : 9876543210
Enter Email : rahul@gmail.com

Person Created Successfully

Do you want to edit details? (yes/no)

yes

Enter New Address : Indiranagar
Enter New City : Bangalore
Enter New State : Karnataka
Enter New Zip : 560038
Enter New Phone : 9999999999
Enter New Email : rahul123@gmail.com

Person Details Updated Successfully
```

---

## Learning

- How to update object data.
- How to use setter methods.
- How to modify existing information.
- How one object's data can change during program execution.

---
