import React from 'react';
import logo from './logo.svg';
import './App.css';
import Data from './components/Sveikinimas/data.json';
import ProductListContainer from './components/Sveikinimas/ProductListContainer.js'
// import NavBar from './components/Navigation/NavigationComponent.js'

// const goProducts = () => props.history.push("products");
// // o patį mygtuką kur nors į render() metodą
// <p><button onClick={goProducts}
// className="btn btn-primary"
// role="button">
// Go to Products
// </button></p>


function App() {
  return (
    <div className="App">
 
      <main className="container">
        <div className="row">
          {Data.map(post => {
            return (
              <div className="col">
                <ProductListContainer title={post.pavadinimas} text={post.aprasymas} />
              </div>
            )
          })}
        </div>
      </main>
    </div>
  );
}

export default App;
