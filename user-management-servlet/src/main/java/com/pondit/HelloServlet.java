package com.pondit;
import java.io.IOException;

import com.pondit.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	//String name = req.getParameter("name");
    	//Integer age = Integer.parseInt(req.getParameter("age"));
    	//User user = new User("Syed", 30);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

    	User user = User.builder()
						//.id(System.currentTimeMillis())
						.name("Syed Hasan")
						.email("Mainul@gmail.com")
						.password("secret")
    					.build();

		entityManager.persist(user);
		entityManager.getTransaction().commit();
		entityManager.close();

    	req.setAttribute("user", user);  
    	req.getRequestDispatcher("hello.jsp").forward(req, resp);
    }
}
