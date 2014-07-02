/* This file was generated by SableCC (http://www.sablecc.org/). */

package parser;

import lexer.*;
import node.*;
import analysis.*;
import java.util.*;

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

@SuppressWarnings("nls")
public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    protected ArrayList<Object> nodeList;

    private final Lexer lexer;
    private final ListIterator<Object> stack = new LinkedList<Object>().listIterator();
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(@SuppressWarnings("hiding") Lexer lexer)
    {
        this.lexer = lexer;
    }

    protected void filter() throws ParserException, LexerException, IOException
    {
        // Empty body
    }

    private void push(int numstate, ArrayList<Object> listNode, boolean hidden) throws ParserException, LexerException, IOException
    {
        this.nodeList = listNode;

        if(!hidden)
        {
            filter();
        }

        if(!this.stack.hasNext())
        {
            this.stack.add(new State(numstate, this.nodeList));
            return;
        }

        State s = (State) this.stack.next();
        s.state = numstate;
        s.nodes = this.nodeList;
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            // int middle = (low + high) / 2;
            int middle = (low + high) >>> 1;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private int state()
    {
        State s = (State) this.stack.previous();
        this.stack.next();
        return s.state;
    }

    private ArrayList<Object> pop()
    {
        return ((State) this.stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        this.converter.index = -1;
        token.apply(this.converter);
        return this.converter.index;
    }

    @SuppressWarnings("unchecked")
    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null, true);
        List<Node> ign = null;
        while(true)
        {
            while(index(this.lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new LinkedList<Node>();
                }

                ign.add(this.lexer.next());
            }

            if(ign != null)
            {
                this.ignoredTokens.setIn(this.lexer.peek(), ign);
                ign = null;
            }

            this.last_pos = this.lexer.peek().getPos();
            this.last_line = this.lexer.peek().getLine();
            this.last_token = this.lexer.peek();

            int index = index(this.lexer.peek());
            this.action[0] = Parser.actionTable[state()][0][1];
            this.action[1] = Parser.actionTable[state()][0][2];

            int low = 1;
            int high = Parser.actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < Parser.actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > Parser.actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    this.action[0] = Parser.actionTable[state()][middle][1];
                    this.action[1] = Parser.actionTable[state()][middle][2];
                    break;
                }
            }

            switch(this.action[0])
            {
                case SHIFT:
		    {
		        ArrayList<Object> list = new ArrayList<Object>();
		        list.add(this.lexer.next());
                        push(this.action[1], list, false);
                    }
		    break;
                case REDUCE:
                    {
                        int reduction = this.action[1];
                        if(reduction < 500) reduce_0(reduction);
                    }
                    break;
                case ACCEPT:
                    {
                        EOF node2 = (EOF) this.lexer.next();
                        PExpAritimetrica node1 = (PExpAritimetrica) pop().get(0);
                        Start node = new Start(node1, node2);
                        return node;
                    }
                case ERROR:
                    throw new ParserException(this.last_token,
                        "[" + this.last_line + "," + this.last_pos + "] " +
                        Parser.errorMessages[Parser.errors[this.action[1]]]);
            }
        }
    }

    private void reduce_0(int reduction) throws IOException, LexerException, ParserException
    {
        switch(reduction)
        {
            case 0: /* reduce AAdicaoSubtracaoExpAritimetrica */
            {
                ArrayList<Object> list = new0();
                push(goTo(0), list, false);
            }
            break;
            case 1: /* reduce ATermoExpAritimetrica */
            {
                ArrayList<Object> list = new1();
                push(goTo(0), list, false);
            }
            break;
            case 2: /* reduce AAdicaoSoma */
            {
                ArrayList<Object> list = new2();
                push(goTo(1), list, false);
            }
            break;
            case 3: /* reduce ASubtracaoSoma */
            {
                ArrayList<Object> list = new3();
                push(goTo(1), list, false);
            }
            break;
            case 4: /* reduce AMultiplicacaoDivisaoTermo */
            {
                ArrayList<Object> list = new4();
                push(goTo(2), list, false);
            }
            break;
            case 5: /* reduce AFatorTermo */
            {
                ArrayList<Object> list = new5();
                push(goTo(2), list, false);
            }
            break;
            case 6: /* reduce AMultiplicacaoMult */
            {
                ArrayList<Object> list = new6();
                push(goTo(3), list, false);
            }
            break;
            case 7: /* reduce ADivisaoMult */
            {
                ArrayList<Object> list = new7();
                push(goTo(3), list, false);
            }
            break;
            case 8: /* reduce ANumeroInteiroFator */
            {
                ArrayList<Object> list = new8();
                push(goTo(4), list, false);
            }
            break;
            case 9: /* reduce ANumeroRealFator */
            {
                ArrayList<Object> list = new9();
                push(goTo(4), list, false);
            }
            break;
            case 10: /* reduce AExpParentesesFator */
            {
                ArrayList<Object> list = new10();
                push(goTo(4), list, false);
            }
            break;
        }
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new0() /* reduce AAdicaoSubtracaoExpAritimetrica */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PExpAritimetrica pexparitimetricaNode1;
        {
            // Block
        PExpAritimetrica pexparitimetricaNode2;
        PSoma psomaNode3;
        PTermo ptermoNode4;
        pexparitimetricaNode2 = (PExpAritimetrica)nodeArrayList1.get(0);
        psomaNode3 = (PSoma)nodeArrayList2.get(0);
        ptermoNode4 = (PTermo)nodeArrayList3.get(0);

        pexparitimetricaNode1 = new AAdicaoSubtracaoExpAritimetrica(pexparitimetricaNode2, psomaNode3, ptermoNode4);
        }
	nodeList.add(pexparitimetricaNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new1() /* reduce ATermoExpAritimetrica */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PExpAritimetrica pexparitimetricaNode1;
        {
            // Block
        PTermo ptermoNode2;
        ptermoNode2 = (PTermo)nodeArrayList1.get(0);

        pexparitimetricaNode1 = new ATermoExpAritimetrica(ptermoNode2);
        }
	nodeList.add(pexparitimetricaNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new2() /* reduce AAdicaoSoma */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PSoma psomaNode1;
        {
            // Block
        TMais tmaisNode2;
        tmaisNode2 = (TMais)nodeArrayList1.get(0);

        psomaNode1 = new AAdicaoSoma(tmaisNode2);
        }
	nodeList.add(psomaNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new3() /* reduce ASubtracaoSoma */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PSoma psomaNode1;
        {
            // Block
        TMenos tmenosNode2;
        tmenosNode2 = (TMenos)nodeArrayList1.get(0);

        psomaNode1 = new ASubtracaoSoma(tmenosNode2);
        }
	nodeList.add(psomaNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new4() /* reduce AMultiplicacaoDivisaoTermo */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PTermo ptermoNode1;
        {
            // Block
        PTermo ptermoNode2;
        PMult pmultNode3;
        PFator pfatorNode4;
        ptermoNode2 = (PTermo)nodeArrayList1.get(0);
        pmultNode3 = (PMult)nodeArrayList2.get(0);
        pfatorNode4 = (PFator)nodeArrayList3.get(0);

        ptermoNode1 = new AMultiplicacaoDivisaoTermo(ptermoNode2, pmultNode3, pfatorNode4);
        }
	nodeList.add(ptermoNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new5() /* reduce AFatorTermo */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PTermo ptermoNode1;
        {
            // Block
        PFator pfatorNode2;
        pfatorNode2 = (PFator)nodeArrayList1.get(0);

        ptermoNode1 = new AFatorTermo(pfatorNode2);
        }
	nodeList.add(ptermoNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new6() /* reduce AMultiplicacaoMult */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PMult pmultNode1;
        {
            // Block
        TEstrela testrelaNode2;
        testrelaNode2 = (TEstrela)nodeArrayList1.get(0);

        pmultNode1 = new AMultiplicacaoMult(testrelaNode2);
        }
	nodeList.add(pmultNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new7() /* reduce ADivisaoMult */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PMult pmultNode1;
        {
            // Block
        TBarraDir tbarradirNode2;
        tbarradirNode2 = (TBarraDir)nodeArrayList1.get(0);

        pmultNode1 = new ADivisaoMult(tbarradirNode2);
        }
	nodeList.add(pmultNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new8() /* reduce ANumeroInteiroFator */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PFator pfatorNode1;
        {
            // Block
        TNInt tnintNode2;
        tnintNode2 = (TNInt)nodeArrayList1.get(0);

        pfatorNode1 = new ANumeroInteiroFator(tnintNode2);
        }
	nodeList.add(pfatorNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new9() /* reduce ANumeroRealFator */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PFator pfatorNode1;
        {
            // Block
        TNReal tnrealNode2;
        tnrealNode2 = (TNReal)nodeArrayList1.get(0);

        pfatorNode1 = new ANumeroRealFator(tnrealNode2);
        }
	nodeList.add(pfatorNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new10() /* reduce AExpParentesesFator */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PFator pfatorNode1;
        {
            // Block
        TParenteseEsq tparenteseesqNode2;
        PExpAritimetrica pexparitimetricaNode3;
        TParenteseDir tparentesedirNode4;
        tparenteseesqNode2 = (TParenteseEsq)nodeArrayList1.get(0);
        pexparitimetricaNode3 = (PExpAritimetrica)nodeArrayList2.get(0);
        tparentesedirNode4 = (TParenteseDir)nodeArrayList3.get(0);

        pfatorNode1 = new AExpParentesesFator(tparenteseesqNode2, pexparitimetricaNode3, tparentesedirNode4);
        }
	nodeList.add(pfatorNode1);
        return nodeList;
    }



    private static int[][][] actionTable;
/*      {
			{{-1, ERROR, 0}, {7, SHIFT, 1}, {67, SHIFT, 2}, {68, SHIFT, 3}, },
			{{-1, ERROR, 1}, {7, SHIFT, 1}, {67, SHIFT, 2}, {68, SHIFT, 3}, },
			{{-1, REDUCE, 8}, },
			{{-1, REDUCE, 9}, },
			{{-1, ERROR, 4}, {11, SHIFT, 8}, {12, SHIFT, 9}, {73, ACCEPT, -1}, },
			{{-1, REDUCE, 1}, {4, SHIFT, 11}, {8, SHIFT, 12}, },
			{{-1, REDUCE, 5}, },
			{{-1, ERROR, 7}, {6, SHIFT, 14}, {11, SHIFT, 8}, {12, SHIFT, 9}, },
			{{-1, REDUCE, 3}, },
			{{-1, REDUCE, 2}, },
			{{-1, ERROR, 10}, {7, SHIFT, 1}, {67, SHIFT, 2}, {68, SHIFT, 3}, },
			{{-1, REDUCE, 7}, },
			{{-1, REDUCE, 6}, },
			{{-1, ERROR, 13}, {7, SHIFT, 1}, {67, SHIFT, 2}, {68, SHIFT, 3}, },
			{{-1, REDUCE, 10}, },
			{{-1, REDUCE, 0}, {4, SHIFT, 11}, {8, SHIFT, 12}, },
			{{-1, REDUCE, 4}, },
        };*/
    private static int[][][] gotoTable;
/*      {
			{{-1, 4}, {1, 7}, },
			{{-1, 10}, },
			{{-1, 5}, {10, 15}, },
			{{-1, 13}, },
			{{-1, 6}, {13, 16}, },
        };*/
    private static String[] errorMessages;
/*      {
			"expecting: ')', n int, n real",
			"expecting: '/', '(', '*', '-', '+', EOF",
			"expecting: '-', '+', EOF",
			"expecting: '(', '-', '+'",
        };*/
    private static int[] errors;
/*      {
			0, 0, 1, 1, 2, 1, 1, 3, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
        };*/

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Parser.class.getResourceAsStream("parser.dat")));

            // read actionTable
            int length = s.readInt();
            Parser.actionTable = new int[length][][];
            for(int i = 0; i < Parser.actionTable.length; i++)
            {
                length = s.readInt();
                Parser.actionTable[i] = new int[length][3];
                for(int j = 0; j < Parser.actionTable[i].length; j++)
                {
                for(int k = 0; k < 3; k++)
                {
                    Parser.actionTable[i][j][k] = s.readInt();
                }
                }
            }

            // read gotoTable
            length = s.readInt();
            gotoTable = new int[length][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][2];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                for(int k = 0; k < 2; k++)
                {
                    gotoTable[i][j][k] = s.readInt();
                }
                }
            }

            // read errorMessages
            length = s.readInt();
            errorMessages = new String[length];
            for(int i = 0; i < errorMessages.length; i++)
            {
                length = s.readInt();
                StringBuffer buffer = new StringBuffer();

                for(int j = 0; j < length; j++)
                {
                buffer.append(s.readChar());
                }
                errorMessages[i] = buffer.toString();
            }

            // read errors
            length = s.readInt();
            errors = new int[length];
            for(int i = 0; i < errors.length; i++)
            {
                errors[i] = s.readInt();
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"parser.dat\" is either missing or corrupted.");
        }
    }
}