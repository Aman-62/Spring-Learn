import { Link } from "react-router-dom";
import { useAuthContext } from "../security/AuthContext";

function HeaderComponent() {
  const { isAuthenticated } = useAuthContext();

  return (
    <div className="border-bottom border-light border-5 navbar navbar-expand-md mb-5 py-3">
      <div className="container">
        <a className="h2 text-decoration-none me-3" href="#">
          MyTodoApp
        </a>

        <button
          className="navbar-toggler"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
          {isAuthenticated && (
            <div className="navbar-nav">
              <Link className="nav-link active" to="/welcome">
                Home
              </Link>
              <Link className="nav-link" to="/todos">
                Todos
              </Link>
            </div>
          )}
        </div>

        <ul className="navbar-nav">
          {isAuthenticated || (
            <li className="nav-item">
              <Link className=" btn btn-primary" to="/login">
                Login
              </Link>
            </li>
          )}
          {isAuthenticated && (
            <li className="nav-item">
              <Link className="nav-link" to="/logout">
                Logout
              </Link>
            </li>
          )}
        </ul>
      </div>
    </div>
  );
}

export default HeaderComponent;
