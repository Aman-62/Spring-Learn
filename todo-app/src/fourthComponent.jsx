// default import
import FirstComponent from "./firstComponent";
import { SecondComponent } from "./secondComponent";
import ThirdComponent from "./thirdComponent";

// Nested Components
function FourthComponent() {
  return (
    <>
      <FirstComponent></FirstComponent>
      <SecondComponent></SecondComponent>
      <ThirdComponent msg="My props msg" />
    </>
  )
}

export default FourthComponent;