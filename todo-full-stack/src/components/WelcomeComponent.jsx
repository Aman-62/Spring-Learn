import { Link, useParams } from "react-router-dom";

function WelcomeComponent() {
  const params = useParams();
  const { username } = params;

  return (
    <div className="text-center">
      <h1>Welcome Todo App</h1>
      <p>Welcome, {username}</p>
      <p>
        Check your <Link to="/todos">todos</Link>
      </p>
    </div>
  );
}

export default WelcomeComponent;
