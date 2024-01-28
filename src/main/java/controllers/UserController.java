package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.User;

public class UserController {


	/**
	 * createUser method.
	 * Método para crear un usuario en la base de datos.
	 * @param name
	 * @param surname
	 * @param direction
	 * @return
	 */
	public String createUser(String name, String surname, String direction){

		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			User u = new User(name, surname, direction);
			session.beginTransaction();
			session.save(u);
			session.getTransaction().commit();
			sessionFactory.close();


		}catch(Exception ex) {

			return "error al registrar creado";
		}
		return "usuario creado";
	}

	/**
	 * deleteUser method.
	 * Método para borrar un usuario de la base de datos indicando el número de id.
	 * @param id
	 * @return
	 */
	public String deleteUser(int id) {

		SessionFactory sessionFactory = new Configuration()
				.configure("src/hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			User u = session.get(User.class, id);

			session.delete(u);
			session.getTransaction().commit();
			sessionFactory.close();


		}catch(Exception ex) {
			return "error al borrar usuario";
		}
		return "usuario borrado";
	}

	/**
	 * updateUser method.
	 * Método para cambiar el nombre de un usuario indicando su id.
	 * @param id
	 * @param name
	 * @return
	 */
	public String updateUser(int id, String name) {

		SessionFactory sessionFactory = new Configuration()
				.configure("src/hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			User u = session.get(User.class, id);

			u.setName(name);
			session.update(u);
			session.getTransaction().commit();
			sessionFactory.close();


		}catch(Exception ex) {

			return "error al actualizar usuario";
		}
		return "usuario actualizado";
	}

	/**
	 * readUser method.
	 * Método para leer un registro indicando su id.
	 * @param id
	 * @return
	 */
	public String readUser(int id) {

		SessionFactory sessionFactory = new Configuration()
				.configure("src/hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			User u = session.get(User.class, id);

			session.getTransaction().commit();
			sessionFactory.close();

			return u.toString() ;

		}catch(Exception ex) {
			ex.printStackTrace();
		}

		return "usuario no existe";
	}

}
