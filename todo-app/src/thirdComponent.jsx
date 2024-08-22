// Rules of JSX
// return single element
// React.Fragment let's us group elements without adding extra node
function ThirdComponent(props) {
  // console.log(props);
  const { msg } = props;

  const str = "Hello Mars"
  const customCSS = {
    color: "red",
    fontSize: "26px"
  }
  return (
    <>
      <div style={customCSS}>Div One {str.toUpperCase()}</div>
      <article>Article One</article>
      <h3>{msg}</h3>
    </>
  )
}

export default ThirdComponent;