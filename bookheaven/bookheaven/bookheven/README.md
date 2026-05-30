  # 📚 Online Bookstore Management System (Spring Boot + Thymeleaf)

A full-featured **Bookstore Web Application** built using `Spring Boot`, `Thymeleaf`, and `Bootstrap`.  
This project demonstrates **CRUD operations**, **Add to Cart**, **Role-Based Access Control**, and **Session management**, making it perfect for real-world internship/project showcase.

---

## 🚀 Features

### 🧑‍💻 Public (USER)
- ✅ View list of all books
- ✅ Add books to cart
- ✅ View cart with total price
- 🔐 Cannot Add/Delete/Update books

### 🔐 Admin Panel (ADMIN)
- ✅ Add New Book (with image, price, stock, etc.)
- ✅ Update existing book by Title
- ✅ Delete book by Title
- ✅ Role-based protected routes
- ✅ Secure login/logout functionality

### 🧠 Backend Logic
- Built using MVC Architecture
- Cart stored in **HttpSession**
- Dynamic routing using Thymeleaf
- Session-based cart management
- Proper validations and fallback logic

---

## 🛠️ Tech Stack

| Layer        | Technology               |
|-------------|--------------------------|
| Backend     | Spring Boot, Java        |
| Frontend    | Thymeleaf + Bootstrap    |
| Build Tool  | Maven                    |
| View Engine | Thymeleaf                |
| Security    | Spring Security (RBAC)   |
| Database    | In-Memory (for now)      |
| Hosting     | (optional) Render/Railway |

---

## 👤 User Credentials

> For testing login system:

| Role   | Username | Password   |
|--------|----------|------------|
| ADMIN  | bookheaven@gmail.com | Admin123 |
| USER   | user     | user123    |

---

## 📸 Screenshots


- 🏠 Home Page  
  ![Home Page 1](https://github.com/ankitdoi-coder/Book-Store-Web-Application-Full-Stack-Java/blob/main/Deployment%20ScreenShot/HomePage_1.png)  
  ![Home Page 2](https://github.com/ankitdoi-coder/Book-Store-Web-Application-Full-Stack-Java/blob/main/Deployment%20ScreenShot/HomePage_2.png)

- 🔐 Login Page  
  ![Login Page](https://github.com/ankitdoi-coder/Book-Store-Web-Application-Full-Stack-Java/blob/main/Deployment%20ScreenShot/Login_Page.png)

- 🛒 Cart Page  
  ![Cart Page](https://github.com/ankitdoi-coder/Book-Store-Web-Application-Full-Stack-Java/blob/main/Deployment%20ScreenShot/Cart_Page.png)

- 📋 Add Book Form  
  ![Add Book Page](https://github.com/ankitdoi-coder/Book-Store-Web-Application-Full-Stack-Java/blob/main/Deployment%20ScreenShot/Add_New_Book_Page.png)

- 📤 Update Book Form  
  ![Update Book Page](https://github.com/ankitdoi-coder/Book-Store-Web-Application-Full-Stack-Java/blob/main/Deployment%20ScreenShot/Update_BookPage.png)

- 🗑️ Delete Book  
  ![Delete Book Page](https://github.com/ankitdoi-coder/Book-Store-Web-Application-Full-Stack-Java/blob/main/Deployment%20ScreenShot/Delete_A_Book_Page.png)

- New Login Page
- ![New Login Page](https://github.com/ankitdoi-coder/Book-Store-Web-Application-Full-Stack-Java/blob/main/Deployment%20ScreenShot/Updated_Login_page.jpg)
---

## ⚙️ Setup Instructions


# 1. Clone the Repository
git clone https://github.com/yourusername/online-bookstore.git
cd online-bookstore

# 2. Open in IDE (Eclipse, IntelliJ, VS Code with Java Extension)


## 3. Build and Run

Use the following command to run the project:

```bash
./mvnw spring-boot:run
```

## Video Preview
- https://youtu.be/Eax4XVx56_0?si=Wi48ZAcV3REIxUxs
## Folder Structure

```
├── Controller/           # All controllers (routes)
├── Model/                # Book.java entity
├── Service/              # Service layer interfaces and implementations
├── Repository/           # BookRepository interface (JPA)
├── config/               # Spring Security configuration
├── templates/            # Thymeleaf HTML pages
├── static/               # CSS, JavaScript, and images
└── application.properties
```

## Future Improvements

- New Login UI  
- User registration and profile management  
- Pagination and sorting on the homepage  
- RESTful APIs with Postman Collection  
- Payment Gateway Integration Soon...

## License

My License – Free for learning, educational use, and personal modifications.

## Contact

**Ankit Kumar Gurjar**  
📧 Email: ankdoi82@gmail.com  
🔗 LinkedIn: [https://www.linkedin.com/in/ankit-kumar-gurjar](https://www.linkedin.com/in/ankit-kumar-gurjar)  
📂 GitHub: [https://github.com/ankitdoi--coder](https://github.com/ankitdoi--coder)
