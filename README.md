# 📝 **Full Stack Todo App**

A **full-stack Todo List application** built using **React.js (Frontend)** and **Spring Boot (Backend)**.  
This app allows users to manage their tasks efficiently with a clean and responsive UI.

---

## 🚀 **Features**

- ✅ **Create, update, and delete** todos  
- 📃 **View all tasks** from the database  
- 🔄 **Syncs with a Spring Boot REST API**  
- 📦 **Full CRUD operations**  
- 💡 **Responsive and clean UI**  

---

## 🛠️ **Tech Stack**

| Layer     | Technology             |
|-----------|------------------------|
| Frontend  | React.js, CSS          |
| Backend   | Spring Boot, Java      |
| API       | RESTful Web Services   |

---

## 📂 **Folder Structure**

todo-app/
├── todolist/ # Spring Boot backend
│ ├── src/
│ └── pom.xml
├── frontend/ # React frontend
│ ├── src/
│ └── package.json

## 👨‍💻 **Getting Started**

### 📦 **Backend Setup (Spring Boot)**

1. Navigate to the backend folder:
     cd todolist

2. Build and run the Spring Boot app:
    ./mvnw spring-boot:run

3. The backend server will run at:
👉 http://localhost:8080

### 🌐 **Frontend Setup (React)**
1. Navigate to the frontend folder:
    cd frontend

2. Install dependencies:
    npm install

3. Start the React app:
    npm start

4. The frontend will run at:
👉 http://localhost:3000

## 🔌 API Endpoints

| Method | Endpoint           | Description         |
|--------|--------------------|---------------------|
| GET    | `/api/todos`       | Fetch all todos     |
| POST   | `/api/todos`       | Create a new todo   |
| PUT    | `/api/todos/{id}`  | Update a todo       |
| DELETE | `/api/todos/{id}`  | Delete a todo       |

## 🙌 Acknowledgments
Built with 💙 by Abdullah
