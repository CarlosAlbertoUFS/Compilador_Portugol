package Testes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import lexer.Lexer;
import lexer.LexerException;
import node.EOF;

public class TesteLexico {

	public static void main(String[] args) throws FileNotFoundException, LexerException, IOException {
        File file = new File("teste.txt");
        PushbackReader pushbackReader = new PushbackReader(new FileReader(file));
        Lexer lex = new Lexer(pushbackReader);
        String teste = "";
        int linha = 0;
        
        
        while (!(lex.peek() instanceof EOF))//lex.peek retorna o token, aqui ele quer saber se o token é uma instancia de final de arquivo.
        {            
            if (lex.peek().getLine() > linha)//lex.peek retorna o numero de linha do token
            {
                linha = lex.peek().getLine();
                teste = teste + System.lineSeparator();
            }
            teste =  teste + " " + lex.next().getClass().getSimpleName();// aqui retorna o nome da classe.
        }
        System.out.println(teste);       
    }
}
