import { useState } from "react";
import { BrowserRouter, Routes, Route, useNavigate } from "react-router-dom";

function TodoApp() {
  return (
    <div className="TodoApp">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<LoginComponent />} />
          <Route path="/login" element={<LoginComponent />} />
          <Route path="/welcome" element={<WelcomeComponent />} />
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
      navigate("/welcome");
    } else {
      setShowErrorMessage(true);
      setShowSuccessMessage(false);
    }
  }
  return (
    <div className="login">
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
  return <div className="Welcome">WelcomeComponent</div>;
}
