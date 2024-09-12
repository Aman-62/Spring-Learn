import { BrowserRouter, Routes, Route, Navigate } from "react-router-dom";

import LogoutComponent from "./LogoutComponent";
import HeaderComponent from "./HeaderComponent";
import ListTodosComponent from "./ListTodosComponent";
import FooterComponent from "./FooterComponent";
import NotFoundComponent from "./NotFoundComponent";
import LoginComponent from "./LoginComponent";
import WelcomeComponent from "./WelcomeComponent";
import AuthProvider, { useAuthContext } from "../security/AuthContext";

function AuthenticatedRoutes({ children }) {
  const { isAuthenticated } = useAuthContext();

  if (isAuthenticated) return children;
  else return <Navigate to={"/login"} />;
}

function TodoApp() {
  return (
    <AuthProvider>
      <BrowserRouter>
        <HeaderComponent />
        <Routes>
          <Route path="/" element={<LoginComponent />} />
          <Route path="/login" element={<LoginComponent />} />
          <Route
            path="/welcome/:username"
            element={
              <AuthenticatedRoutes>
                <WelcomeComponent />
              </AuthenticatedRoutes>
            }
          />
          <Route
            path="/todos"
            element={
              <AuthenticatedRoutes>
                <ListTodosComponent />
              </AuthenticatedRoutes>
            }
          />
          <Route
            path="/logout"
            element={
              <AuthenticatedRoutes>
                <LogoutComponent />
              </AuthenticatedRoutes>
            }
          />

          <Route path="*" element={<NotFoundComponent />} />
        </Routes>
        <FooterComponent />
      </BrowserRouter>
    </AuthProvider>
  );
}

export default TodoApp;
