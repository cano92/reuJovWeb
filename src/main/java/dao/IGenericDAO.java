package dao;

import java.util.List;

public interface IGenericDAO<T> {

	List<T> getAll();
	
	T getByID(long id);
	
	void save(T entidad);
	
	void update(T entidad);
	
	boolean delete( long id );
	
	boolean delete( T entidad );
	
	public T exist(long id);
	

}
