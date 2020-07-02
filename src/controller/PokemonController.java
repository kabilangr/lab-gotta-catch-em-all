package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			
			Bulbasaur b1=new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.",
                    "POISON","IVYSAUR",64);
            msg = "<center>" + b1.getPokemonName() + "  #" + b1.getPokemonNumber();
            request.setAttribute("message1",msg);
            request.setAttribute("character1", b1.getCharacteristics());
            request.setAttribute("type1",b1.getType());
            request.setAttribute("evolution1",b1.getEvolution());
            request.setAttribute("baseExp1", b1.getBaseExp());
		}

		if (value2 != null) {
			Charizard b2=new Charizard("Charizard",006,"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
                    "FIRE","CHARMELEON",240);
            msg = "<center>" + b2.getPokemonName() + "  #" + b2.getPokemonNumber();
            request.setAttribute("message1",msg);
            request.setAttribute("character1", b2.getCharacteristics());
            request.setAttribute("type1",b2.getType());
            request.setAttribute("evolution1",b2.getEvolution());
            request.setAttribute("baseExp1", b2.getBaseExp());
		}

		if (value3 != null) {

			Dragonite b3=new Dragonite("Dragonite",149,"Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.",
                    "DRAGON","DRATINI",270);
            msg = "<center>" + b3.getPokemonName() + "  #" + b3.getPokemonNumber();
            request.setAttribute("message1",msg);
            request.setAttribute("character1", b3.getCharacteristics());
            request.setAttribute("type1",b3.getType());
            request.setAttribute("evolution1",b3.getEvolution());
            request.setAttribute("baseExp1", b3.getBaseExp());
		}
		if (value4 != null) {

			Mew b4=new Mew("Mew",151,"Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
                    "PSYCHIC","NONE",64);
            msg = "<center>" + b4.getPokemonName() + "  #" + b4.getPokemonNumber();
            request.setAttribute("message1",msg);
            request.setAttribute("character1", b4.getCharacteristics());
            request.setAttribute("type1",b4.getType());
            request.setAttribute("evolution1",b4.getEvolution());
            request.setAttribute("baseExp1", b4.getBaseExp());
		}

		if (value5 != null) {

			Pikachu b4=new Pikachu("Pikachu",025,"Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.",
                    "ELECTRIC","RAICHU",112);
            msg = "<center>" + b4.getPokemonName() + "  #" + b4.getPokemonNumber();
            request.setAttribute("message1",msg);
            request.setAttribute("character1", b4.getCharacteristics());
            request.setAttribute("type1",b4.getType());
            request.setAttribute("evolution1",b4.getEvolution());
            request.setAttribute("baseExp1", b4.getBaseExp());
		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
