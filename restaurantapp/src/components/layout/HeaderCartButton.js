import React, {useContext} from 'react';

import CartIcon from '../cart/CartIcon';
import classes from './headerCartButton.module.css';
import CartContext from '../../store/Cart-Context';

function HeaderCartButton(props){
  const cartCtx = useContext(CartContext);

  const numberOfCartItems = cartCtx.items.reduce((curNumber, item) => {
    return curNumber + item.amount;
  }, 0);

  return(
    <button className={classes.button} onClick={props.onClick}>
      <span className={classes.icon}>
        <CartIcon />
      </span>
      <span>Your Cart</span>
      <span className={classes.badge}>{numberOfCartItems}</span>
    </button>
  );
}

export default HeaderCartButton;