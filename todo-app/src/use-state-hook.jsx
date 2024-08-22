import { useState } from "react";

const people = ['Rahul', 'Vishal', 'Raj'];

function UseStateHook() {
  const [num, setNum] = useState(0);
  const [peopleList, setPeopleList] = useState(people);
  const [person, setPerson] = useState({
    name: "Rahul",
    age: 24
  })

  function handleClick() {
    console.log("Clicked");
    setNum(num + 1);
  };

  function handleClearList() {
    setPeopleList([]);
  }

  function handleUpdatePerson() {
    setPerson({
      name: "Vishal",
      age: 30
    })
  }

  return (
    <div>
      <h2>Use State Hook by React</h2>
      <p>Number: {num}</p>
      <button onClick={handleClick}>increment</button>

      <hr />

      {peopleList.map((el, index) => <p key={index}>{el}</p>)}
      <button onClick={handleClearList}>clear list</button>

      <hr />

      <h3>Name: {person.name}</h3>
      <p>Age: {person.age}</p>
      <button onClick={handleUpdatePerson}>update person</button>
    </div>
  )
};

export default UseStateHook;