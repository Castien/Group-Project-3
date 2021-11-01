package com.project.restaurant.dao;

import com.project.restaurant.entity.Cart;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CartIMPL implements CartDAO {

    //Define field for entity manager
    /*The EntityManager API is used to create and remove persistent entity instances,
        to find entities by their primary key, and to query over entities. */
    private final EntityManager entityManager;

    //Set up constructor injection
    @Autowired
    public CartIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public List<Cart> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Cart> myQuery = currentSession.createQuery("from Cart");
        return myQuery.getResultList();
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public Cart findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Cart.class, theId);
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public void saveOrUpdate(Cart theCart) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theCart);
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Cart myCart = currentSession.get(Cart.class, theId);
        currentSession.delete(myCart);
    }


}
