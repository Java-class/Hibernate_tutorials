package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Food;
import service.FoodService;
import service.FoodServiceImpl;


@WebServlet("/FoodController")
public class FoodController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	FoodService fs = new FoodServiceImpl();
	
	public FoodController()
	{
		super();
		//fs = new FoodServiceImpl();
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8"); 
		
		Food food = new Food();
		food.setFoodname(request.getParameter("txtname"));
		food.setBaseprice(request.getParameter("txtbaseprice"));
		
		
		
		try {
			fs.Add(food);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getSession().setAttribute("AllFoods", fs.getAll());
		
		response.sendRedirect("InsertFood.jsp");
	}
	
    protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
    {
		request.setCharacterEncoding("UTF-8"); //
		
		
		String action=request.getParameter("Action");
		
		if (action.equals("del"))
		{
			FoodService fs = new FoodServiceImpl();
			fs.Remove(Integer.parseInt(request.getParameter("id")));
			request.getSession().setAttribute("AllFoods", fs.getAll());		
			response.sendRedirect("InsertFood.jsp");
		}
		
		
			
		if(action.equals("edit"))
		{
			request.getRequestDispatcher("upfood.jsp").forward(request, response);
		}
		if (action.equals("edit2"))
		{
			Food newFood = new Food();
			newFood=fs.getFood(Integer.parseInt(request.getParameter("id2")));
			newFood.setFoodname(request.getParameter("name2"));
			newFood.setBaseprice(request.getParameter("base2"));

			fs.Update(newFood);
			
			response.sendRedirect("upfood.jsp");
			
		}
		}
	}
	
	
	

