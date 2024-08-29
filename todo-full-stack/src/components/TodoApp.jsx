import { useState } from "react";
import {
  BrowserRouter,
  Routes,
  Route,
  useNavigate,
  useParams,
  Link,
} from "react-router-dom";

function TodoApp() {
  return (
    <div className="TodoApp">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<LoginComponent />} />
          <Route path="/login" element={<LoginComponent />} />
          <Route path="/welcome/:username" element={<WelcomeComponent />} />
          <Route path="/todos" element={<ListTodosComponent />} />

          <Route path="*" element={<NotFoundComponent />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default TodoApp;

function LoginComponent() {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [showSuccessMessage, setShowSuccessMessage] = useState(false);
  const [showErrorMessage, setShowErrorMessage] = useState(false);

  const navigate = useNavigate();

  function handleUsernameChange(event) {
    setUsername(event.target.value);
  }

  function handlePasswordChange(event) {
    setPassword(event.target.value);
  }

  function handleSubmit(event) {
    event.preventDefault();
    if (username === "admin" && password === "root1234") {
      setShowSuccessMessage(true);
      setShowErrorMessage(false);
      navigate(`/welcome/${username}`);
    } else {
      setShowErrorMessage(true);
      setShowSuccessMessage(false);
    }
  }
  return (
    <div className="login">
      <h1>Login page</h1>
      {showSuccessMessage && <div>Authenticated Successfully</div>}
      {showErrorMessage && (
        <div>Authentication Failed, Please check your credentials</div>
      )}
      <form onSubmit={handleSubmit} className="loginForm">
        <div>
          <label htmlFor="name">User Name</label>
          <input
            type="text"
            name="username"
            value={username}
            onChange={handleUsernameChange}
          />
        </div>
        <div>
          <label htmlFor="password">Password</label>
          <input
            type="password"
            name="password"
            value={password}
            onChange={handlePasswordChange}
          />
        </div>
        <div>
          <button type="submit" name="login">
            Login
          </button>
        </div>
      </form>
    </div>
  );
}

function WelcomeComponent() {
  const params = useParams();
  const { username } = params;

  return (
    <div className="welcome">
      <h1>Welcome Todo App</h1>
      <p>Welcome, {username}</p>
      <p>
        Check your <Link to="/todos">todos</Link>
      </p>
    </div>
  );
}

function NotFoundComponent() {
  return (
    <div className="notFoundComponent">
      <h1>We are working hard!</h1>
      <p>Apologies for the 404. Reach out to our team at ABC-DEF-GHI</p>
    </div>
  );
}

function ListTodosComponent() {
  const today = new Date();
  const targetDate = new Date(
    today.getFullYear(),
    today.getMonth() + 3,
    today.getDay()
  );

  const todos = [
    {
      id: 1,
      description: "Learn AWS",
      done: false,
      targetDate: targetDate,
    },
    {
      id: 2,
      description: "Learn React",
      done: false,
      targetDate: targetDate,
    },
    {
      id: 3,
      description: "Learn DevOps",
      done: false,
      targetDate: targetDate,
    },
  ];
  return (
    <div className="listTodosComponent">
      <h1>Things you want to do!</h1>
      <div>
        <table border={2}>
          <thead>
            <tr>
              <th>id</th>
              <th>description</th>
              <th>is Done?</th>
              <th>target date</th>
            </tr>
          </thead>
          <tbody>
            {todos.map((todo) => {
              return (
                <tr key={todo.id}>
                  <td>{todo.id}</td>
                  <td>{todo.description}</td>
                  <td>{todo.done.toString()}</td>
                  <td>{todo.targetDate.toString()}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    </div>
  );
}
