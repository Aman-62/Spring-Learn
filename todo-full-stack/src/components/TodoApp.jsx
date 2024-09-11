import { BrowserRouter, Routes, Route } from "react-router-dom";

import LogoutComponent from "./LogoutComponent";
import HeaderComponent from "./HeaderComponent";
import ListTodosComponent from "./ListTodosComponent";
import FooterComponent from "./FooterComponent";
import NotFoundComponent from "./NotFoundComponent";
import LoginComponent from "./LoginComponent";
import WelcomeComponent from "./WelcomeComponent";
import AuthProvider from "../security/AuthContext";

function TodoApp() {
  return (
    <AuthProvider>
      <BrowserRouter>
        <HeaderComponent />
        <Routes>
          <Route path="/" element={<LoginComponent />} />
          <Route path="/login" element={<LoginComponent />} />
          <Route path="/welcome/:username" element={<WelcomeComponent />} />
          <Route path="/todos" element={<ListTodosComponent />} />
          <Route path="/logout" element={<LogoutComponent />} />

          <Route path="*" element={<NotFoundComponent />} />
        </Routes>
        <FooterComponent />
      </BrowserRouter>
    </AuthProvider>
  );
}

export default TodoApp;
