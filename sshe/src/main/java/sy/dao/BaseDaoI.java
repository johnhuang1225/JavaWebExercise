package sy.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDaoI<T> {

	public Serializable save(T t);
	
	public T get(String hql);
	
	public T get(String hql,Map<String,Object> params);
	
	public List<T> find(String hql);
	
	public List<T> find(String hql,Map<String,Object> params);
	
}
