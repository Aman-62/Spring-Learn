import { useAuthContext } from "../security/AuthContext";

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
    <div className="container">
      <h1 className="display-3 mb-4">Things you want to do!</h1>
      <div>
        <table className="table table-hover border shadow">
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

export default ListTodosComponent;
