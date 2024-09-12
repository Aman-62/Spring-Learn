import { Link, useParams } from "react-router-dom";

function WelcomeComponent() {
  const params = useParams();
  const { username } = params;

  return (
    <div className="text-center py-5">
      <h1 className="display-3">Welcome Todo App</h1>
      <p className="fs-4">{username}</p>
      <p>
        Check your <Link to="/todos">todos</Link>
      </p>
    </div>
  );
}

export default WelcomeComponent;
