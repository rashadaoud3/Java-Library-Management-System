# Java Library Management System

This project is a simple **Library Catalog Management System** implemented in Java, organized under the `AssignmentTwo` package. It allows users to manage a collection of books with functionalities such as adding, searching, borrowing, and returning books, using a console-based menu interface.

---

## 📂 Project Structure

### `BookIndex.java`
- Represents a book entity with the following properties:
  - Title
  - Author
  - Number of available copies
  - Copyright year
- Includes:
  - Getters and setters for all properties
  - `toString()` method for displaying book information

### `LibraryCatalog.java`
- Manages a collection of books using a fixed-size array (`BookIndex[50]`)
- Core functionalities:
  - Add new books
  - Search books by title
  - Borrow and return books
  - List all books
  - Manage book copies (add more copies)

### `MyLibrary.java`
- Acts as the **main driver class**
- Provides a **menu-driven console interface**:
  - Add a book
  - Search a book
  - Borrow a book
  - Return a book
  - List all books
  - Quit the application
- Handles user input and interacts with `LibraryCatalog`

---

## 🔑 Key Features

### 📚 Book Management
- Add new books to the catalog
- Search books by title
- View all cataloged books
- Add more copies of an existing book

### 🔁 Loan Management
- Borrow a book (decreases available copies)
- Return a book (increases available copies)
- Prevents borrowing if no copies are available

### 🖥️ User Interface
- Text-based console menu with 6 options
- Repeats menu until user selects "Quit"

---

## ⚙️ Technical Observations

### 📌 Data Storage
- Uses an array (`BookIndex[50]`) with a counter to track current number of books

### ⚠️ Implementation Notes
- `setCopyright(+quantity)` appears to be incorrectly used; should affect number of copies
- String comparison uses `==` instead of `.equals()`, which may result in bugs
- Some redundancy in `addNewBook` methods
- Contains commented code and TODO notes indicating incomplete work

### ❌ Error Handling
- Relies on return values (`true/false`, `-1`) for logic flow
- No exception handling for user input (e.g., invalid integers)

---

## 🧪 Expected Behavior

When running `MyLibrary.java`:
1. Program starts and prompts the user to create an initial book
2. Displays a menu with 6 options
3. Based on the user’s selection, performs the corresponding library action
4. Loop continues until the user selects option 6 (Quit)

---

## 💡 Suggested Improvements

- Use `.equals()` for string comparisons instead of `==`
- Clarify and fix logic for managing number of copies vs. copyright
- Add validation for user input (e.g., empty title, negative copies)
- Replace fixed-size array with `ArrayList<BookIndex>` for flexibility
- Improve error messages and user feedback
- Separate UI logic from business logic for cleaner design

---

## 🧠 Concepts Demonstrated

- Java class design and encapsulation
- Array manipulation
- Console input/output
- Menu-driven application design
- Basic inventory management

---

## 📌 How to Run

1. Compile the Java files:
   ```bash
   javac AssignmentTwo/*.java
2. Run the main program:
    ```bash
    java AssignmentTwo.MyLibrary

