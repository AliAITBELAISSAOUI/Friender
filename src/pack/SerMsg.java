package pack;

import java.io.IOException;
import java.util.Collection;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Interaction;
import beans.Messages;
import beans.Person;

/**
 * Servlet implementation class SerMsg
 */
@WebServlet("/SerMsg")
public class SerMsg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	@EJB
	private Facade f;
	
    public SerMsg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String op =request.getParameter("op");
		
		switch (op) {
		case "startchat" :
			
			//person to chat with
			long idother  = 2 ;
			//Person other= f.getperson(idother);
			request.setAttribute("idOther",idother);
 			//person and account in session
			long idconnected = 1;
			
			//Person personconnected= f.getperson(idconnected);
			request.setAttribute("idConect",idconnected);
			// list of message
			
			request.setAttribute("lm",f.getAllMessages(idconnected,idother));
			//list of started conversation
					
			request.setAttribute("li", f.getInerractions(idconnected) );

			request.getRequestDispatcher("chatrome.jsp").forward(request, response);
			return;
		
			
		default:
			request.getRequestDispatcher("index.html").forward(request, response);
			break;
		}
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
