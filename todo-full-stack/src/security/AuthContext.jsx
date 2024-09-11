import { createContext, useState, useContext } from "react";

export const AuthContext = createContext();
export const useAuthContext = function () {
  const value = useContext(AuthContext);
  return value;
};

function AuthProvider({ children }) {
  const [isAuthenticated, setIsAuthenticated] = useState(false);

  return (
    <AuthContext.Provider
      value={{
        isAuthenticated,
        setIsAuthenticated,
      }}
    >
      {children}
    </AuthContext.Provider>
  );
}

export default AuthProvider;
