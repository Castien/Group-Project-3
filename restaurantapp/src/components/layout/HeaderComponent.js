import React, {Fragment} from 'react';
import HeaderCartButton from './HeaderCartButton';
import mealsImage from '../../assets/meals.jpg';
import classes from './header.module.css';

function HeaderComponent(props){
  return(
    <Fragment>
      <header className={classes.header}>
        <h1>Le Restaurant</h1>
        <HeaderCartButton onClick={props.onShowCart}/>
      </header>
      <div className={classes['main-image']}>
        <img src={mealsImage} alt="Table of meals!" />
      </div>
    </Fragment>
  );
}
export default HeaderComponent;