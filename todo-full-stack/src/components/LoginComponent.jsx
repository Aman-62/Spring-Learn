import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { useAuthContext } from "../security/AuthContext";

function LoginComponent() {
  const { login } = useAuthContext();
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
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
    if (login(username, password)) {
      setShowErrorMessage(false);
      navigate(`/welcome/${username}`);
    } else {
      setShowErrorMessage(true);
    }
  }

  return (
    <div className="text-center container">
      <h1 className="display-3">Login page</h1>
      {showErrorMessage && (
        <div className="text-danger">
          Authentication Failed, Please check your credentials
        </div>
      )}
      <form
        onSubmit={handleSubmit}
        className="mx-auto my-5 shadow p-4 rounded"
        style={{
          width: "95%",
          maxWidth: "540px",
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
