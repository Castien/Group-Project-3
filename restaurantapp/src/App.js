
import React, {useState} from "react";
import CartProvider from './store/CartProvider';

import HeaderComponent from './components/layout/HeaderComponent';
import Meals from './components/meals/Meals';
import Cart from './components/cart/Cart';

export default function App() {
  const[cartIsShown, setCartIsShown] = useState(false);

  function showCartHandler(){
    setCartIsShown(true);
  }

  function hideCartHandler(){
    setCartIsShown(false);
  }

  return (
    <CartProvider>
      {cartIsShown && <Cart onClose={hideCartHandler}/>}
      <HeaderComponent onShowCart={showCartHandler}/>
      <main>
        <Meals />
      </main>
    </CartProvider>
  );
}
