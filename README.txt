Portugol
========

Compilador Portugol
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////////////////////////////
\\\\Curso Sisttemas de Informa��o - 171                           /////
\\\\Disciplina Linguagens Formais e Tradutores UFS-SE Turma 2014-1/////
\\\\Professor Kalil                                               /////
\\\\                                                              /////
\\\\Desenvolvedores:                                              /////
\\\\                Carlos Alberto Santos de Souza                /////
\\\\                e-mail: carlos.albertoufs@gmail.com           /////
\\\\                Samir Dantas Oliveira                         /////
\\\\                e-mail: samir.ufs@hotmail.com                 /////
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////////////////////////////




Este projeto foi feito para fins de avalia��o do aluno no curso.
O objetivo � criar um compilador com base em uma linguagem portugol.


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;Testando o Lexico;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

Para compilar este programa � necess�rio que voc� tenha o compilador da linguagem java 
Eclipse instalado em seu pc.

-> Baixe a pasta "LFT" do repositorio: https://github.com/CarlosAlbertoUFS/Portugol_Compilador 

->Abra o eclipse.

->Importe a pasta "Compilador" para o Eclipse,

//////////////////////////////////////////////////////////////////////////////////////////////

Para testar o lexico:

-> Na package testes, compile a classe "testeLexico".
   
   - Esta classe lê os caracteres do "Texto.txt" eagrupa-os em tokens e os imprime na tela na ordem
   em que vão sendo lidos.
   
//////////////////////////////////////////////////////////////////////////////////////////////

Para testar o parser:

-> Na package testes, compile a classe "testeParser". 
    
    - Esta classe recebe os tokens da classe "TesteLexico" e de acordo com a posição deles reconhece 
    as produções queforam criadas na gramatica. Se algum token não fiser partede alguma produção ou estiver 
    fora da ordem da gramatica, será impresso um erro. Se tudo estiver correto ele simplesmente terminará 
    o programa sem imprimir erro algum.
    
//////////////////////////////////////////////////////////////////////////////////////////////
obs:
-O arquivo texto usado na classe "TesteLexico" e "TesteParser", encontra-se dentro da pasta "Compilador".

