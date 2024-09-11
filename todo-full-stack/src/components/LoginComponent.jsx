import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { useAuthContext } from "../security/AuthContext";

function LoginComponent() {
  const { setIsAuthenticated } = useAuthContext();
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
      setIsAuthenticated(true);
      navigate(`/welcome/${username}`);
    } else {
      setShowErrorMessage(true);
      setShowSuccessMessage(false);
    }
  }
  return (
    <div className="text-center container">
      <h1>Login page</h1>
      {showSuccessMessage && (
        <div className="text-danger">Authenticated Successfully</div>
      )}
      {showErrorMessage && (
        <div className="text-danger">
          Authentication Failed, Please check your credentials
        </div>
      )}
      <form
        onSubmit={handleSubmit}
        className="mx-auto shadow p-4 rounded"
        style={{
          width: "95%",
          maxWidth: "440px",
        }}
      >
        <div className="mb-3">
          <label htmlFor="name" className="form-label">
            User Name
          </label>
          <input
            type="text"
            name="username"
            value={username}
            className="form-control"
            onChange={handleUsernameChange}
          />
        </div>
        <div className="mb-3">
          <label htmlFor="password" className="form-label">
            Password
          </label>
          <input
            type="password"
            name="password"
            value={password}
            className="form-control"
            onChange={handlePasswordChange}
          />
        </div>
        <div>
          <button type="submit" name="login" className="btn btn-primary">
            Login
          </button>
        </div>
      </form>
    </div>
  );
}

export default LoginComponent;
