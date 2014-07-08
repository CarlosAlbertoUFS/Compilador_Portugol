package Testes;

import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PushbackReader;

import node.Start;
import lexer.Lexer;
import parser.Parser;



public class TesteParser {

	
	public static void main(String[] arguments)
	{
		File file = new File("teste.txt");
		try
		{
			
			
		Parser p =
					new Parser(
					new Lexer(
					new PushbackReader(new FileReader(file))));
		
			// Parse the input.
		Start tree = p.parse();
		// Apply the translation.
		//tree.apply(new Tradutor());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
