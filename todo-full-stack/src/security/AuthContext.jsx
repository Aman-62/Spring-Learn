import { createContext, useState, useContext } from "react";

export const AuthContext = createContext();
export const useAuthContext = function () {
  const value = useContext(AuthContext);
  return value;
};

function AuthProvider({ children }) {
  const [isAuthenticated, setIsAuthenticated] = useState(false);

  function login(username, password) {
    if (username === "admin" && password === "1234") {
      setIsAuthenticated(true);
      return true;
    } else {
      setIsAuthenticated(false);
      return false;
    }
  }

  function logout() {
    setIsAuthenticated(false);
  }

  return (
    <AuthContext.Provider
      value={{
        isAuthenticated,
        login,
        logout,
      }}
    >
      {children}
    </AuthContext.Provider>
  );
}

export default AuthProvider;
