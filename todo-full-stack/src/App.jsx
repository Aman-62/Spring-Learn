import TodoApp from "./components/TodoApp";

function App() {
  return (
    <main>
      <TodoApp />
    </main>
  );
  return (
    <PageLayout>
      <main>
        <h1>Children Prop</h1>
      </main>
    </PageLayout>
  );
}

export default App;

function PageLayout({ children }) {
  return (
    <>
      <header>
        <h3>Header</h3>
      </header>
      {children}
      <footer>
        <h3>Footer</h3>
      </footer>
    </>
  );
}
