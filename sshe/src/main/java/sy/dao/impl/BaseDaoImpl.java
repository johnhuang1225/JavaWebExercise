package sy.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sy.dao.BaseDaoI;

@Repository("baseDao")
public class BaseDaoImpl<T> implements BaseDaoI<T> {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getCurrentSession() {
		return this.getSessionFactory().getCurrentSession();
	}

	@Override
	public Serializable save(T t) {
		return this.getCurrentSession().save(t);
	}

	@Override
	public T get(String hql) {
		Query query = this.getCurrentSession().createQuery(hql);
		List<T> result = query.list();
		if(result!=null&&result.size()>0){
			return result.get(0);
		}
		return null;
	}

	@Override
	public T get(String hql, Map<String, Object> params) {
		Query query = this.getCurrentSession().createQuery(hql);
		if(params!=null&&params.size()>0){
			for (String key : params.keySet()) {
				query.setParameter(key, params.get(key));
			}
		}
		List<T> result = query.list();
		if(result!=null&&result.size()>0){
			return result.get(0);
		}		
		return null;
	}

	@Override
	public List<T> find(String hql) {
		Query query = this.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public List<T> find(String hql, Map<String, Object> params) {
		Query query = this.getCurrentSession().createQuery(hql);
		if(params!=null&&params.size()>0){
			for (String key : params.keySet()) {
				query.setParameter(key, params.get(key));
			}
		}
		return query.list();
	}
	
	
	
}
