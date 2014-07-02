package Testes;

import lexer.IPushbackReader;
import lexer.Lexer;
import lexer.LexerException;
import lexer.Lexer.State;
import node.InvalidToken;
import node.TComentarioFim;
import node.TComentarioInicio;
import node.TComentarioCorpo;
import node.TComentarioFim;;
import node.TSimbolo;
import node.Token;

public class ComentarioAninhado{
	
private int count;
	private TComentarioInicio comentario;
	private StringBuffer text;
	/*    protected Token token;
    protected State state = State.NORMAL;

    private IPushbackReader in;
    private int line;
    private int pos;
    private boolean cr;
    private boolean eof;
    private final StringBuffer text = new StringBuffer();
	private String texto = new String();;
    private TComentarioCorpo comentario;
    private int contador; 
    private LexerException error;*/
    
	
	public ComentarioAninhado(java.io.PushbackReader in)
	{ super(in);
	}
	
	// We define a filter that recognizes nested comments.
	public void filtro(){ // if we are in the comment state
	
		/*	//Aqui vamos iniciar com o estado que me permite parar o laço do filtro.
    	if(state.equals(State.COMENTARIO_ANINHADO))
		{
    		//Aqui analisamos o código para saber se existe comentários balanceados
    		if(token instanceof TComentarioInicio){//Se encontrarmos um token  TComentarioInicio
    			contador++;						  //vamos incrementar o contador.
    		}
    		if(token instanceof TComentarioFim){//Se encontrarmos aqui um token TComentarioFim
    			contador--;						//vamos decrementar o contador.
    		}
    	
    		//aqui é só uma forma de reiniciar o token TComentarioCorpo.
    		if(comentario == null){
    			comentario = new TComentarioCorpo("");
    		
    		}
    	
    		//Caso o Comentario aninhado não esteja balanceado.
    		if(contador != 0){
    			//Gera um erro se o Comentario aninhado não estiver balanceado e se for encontrado o fim do arquivo.
    			if(!(token instanceof TComentarioInicio) && !(token instanceof TComentarioCorpo) && !(token instanceof TComentarioFim)&& !(token instanceof TLCaractere)){
    				InvalidToken tokenInvalido = new InvalidToken(token.getText());
    				error = new LexerException(tokenInvalido, "Falta um */  ou /* para completar o comentario");
    				error.printStackTrace();
    			}else{//Se ainda existir algum token ele o empilha no token comentárioCorpo
    				texto += token.getText();
    				token = null;
    			}
    		}else{//Se o comentario estiver balançeado , encerramos o loop, e inserimos todo o comentário no token comentárioCorpo
    				comentario.setText(texto);	
    				token = comentario;
    				comentario = null;
    				state = State.NORMAL;
    			}
		}*/

		
		}
	}



