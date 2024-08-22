import React from "react";
import { createRoot } from "react-dom/client";
import "./styles.css";

import UseStateHook from "./use-state-hook"


// React Developer Tools (Browser ext)

const root = createRoot(document.getElementById("root"));

// root.render(<Greeting></Greeting>);
root.render(<UseStateHook />);