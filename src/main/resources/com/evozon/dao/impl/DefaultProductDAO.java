package evozon.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import evozon.dao.ProductDAO;
import evozon.exceptionHandler.DAOExceptionHandler;
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
	public Product getById(int id) throws DAOExceptionHandler {
		if (id != 0) {
			return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
		} else {
			throw new DAOExceptionHandler("The id is invalid.");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProducts() throws DAOExceptionHandler {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		if (query != null) {
			return query.getResultList();
		} else {
			throw new DAOExceptionHandler("The query is null.");
		}
	}

	@Override
	public Product addProduct(Product product) throws DAOExceptionHandler {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(product);
		if (product != null) {
			return product;
		} else {
			throw new DAOExceptionHandler("The product is null.");
		}

	}
}
