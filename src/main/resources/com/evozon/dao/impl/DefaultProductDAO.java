package evozon.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import evozon.dao.ProductDAO;
import evozon.model.Product;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultProductDAO implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Product getById(int id) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<Product> getAll() {
    	Session session = sessionFactory.getCurrentSession();
    	CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < Product > cq = cb.createQuery(Product.class);
        Root < Product > root = cq.from(Product.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    	
    	//TODO
//        throw new NotYetImplementedException();
    }

    @Override
    public Product addProduct(Product product) {
        throw new NotYetImplementedException();
    }
}
