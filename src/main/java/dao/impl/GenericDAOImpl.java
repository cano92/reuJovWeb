package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import dao.IGenericDAO;


@Transactional //anotacion de trnasacciones a BD de spring
public class GenericDAOImpl<T> implements IGenericDAO<T> {
		
	//clase del objeto que esta herendando
	protected Class<T> persistentClass;
	
	private EntityManager entityManager;

	//constructor al instanciar la clase se guarda la clase que se instancia
	public GenericDAOImpl(Class<T> persistentClass) {
		this.setPersistentClass(persistentClass);
	}

	
	
	@PersistenceContext //inyecta el EntityMAnager por set Definido en el archivo de confg
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}


	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}
	

	// FALTA REVISAR DETALLES 
	@Override
	public List getAll() {
		try{
			//consulta para recuperar
			Query query=this.getEntityManager().createQuery("");
			
			//ejecuta la consulta
			 List<T> list= query.getResultList();
			 return list;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public T getByID(long id) {
		try{
			return this.getEntityManager().find(this.getPersistentClass(), id);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void save(T entidad) {
		try{
			this.getEntityManager().persist(entidad);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(T entidad) {
		try{
			this.getEntityManager().merge(entidad);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean delete(long id) {
		try{
			T entidad = this.exist(id);
			if (entidad != null) {
				return this.delete(entidad);
			}else { return false; }
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(T entidad) {
		try {
			this.getEntityManager().remove(entidad);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public T exist(long id) {
		try {
			return this.getEntityManager().find(this.getPersistentClass(), id);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

}
