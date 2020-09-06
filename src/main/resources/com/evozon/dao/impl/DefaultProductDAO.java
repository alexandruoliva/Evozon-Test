package evozon.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import evozon.dao.ProductDAO;
import evozon.model.Product;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

	@PersistenceContext
	EntityManager em;

	@Override
	public Product getById(int id) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
		// TODO
//        throw new NotYetImplementedException();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProducts() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();

		// TODO
//        throw new NotYetImplementedException();
	}

	@Override
	public void addProduct(Product product) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(product);
		// TODO
//        throw new NotYetImplementedException();
	}
}
