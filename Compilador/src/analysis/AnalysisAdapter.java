/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACabecalhoPrograma(ACabecalhoPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstantesDeclaracao(AConstantesDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVazioDeclaracao(AVazioDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereTipo(ACaractereTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaVariaveisEscorpo(AListaVariaveisEscorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelEscorpo(AVariavelEscorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVariavel(AVetorVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelVariavel(AVariavelVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeSenaoComando(ASeSenaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVazioComando(AVazioComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeBlocoSeBloco(ASeBlocoSeBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASenaoBlocoSenaoBloco(ASenaoBlocoSenaoBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVazioSenaoBloco(AVazioSenaoBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroNegativoExpAritimetrica(ANumeroNegativoExpAritimetrica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAdicaoSubtracaoExpAritimetrica(AAdicaoSubtracaoExpAritimetrica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExpAritimetrica(ATermoExpAritimetrica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAdicaoSoma(AAdicaoSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubtracaoSoma(ASubtracaoSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplicacaoDivisaoTermo(AMultiplicacaoDivisaoTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorTermo(AFatorTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplicacaoMult(AMultiplicacaoMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisaoMult(ADivisaoMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpParentesesFator(AExpParentesesFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElementoFator(AElementoFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuLogicoExpLogica(AOuLogicoExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpXouExpLogica(AExpXouExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuxLogicoExpXou(AOuxLogicoExpXou node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpEExpXou(AExpEExpXou node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAELogicoExpE(AELogicoExpE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpNaoExpE(AExpNaoExpE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoLogicoExpNao(ANaoLogicoExpNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoLogicoExpNao(ATermoLogicoExpNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParentesesLogicoTermoLogico(AParentesesLogicoTermoLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParentesesComparacaoTermoLogico(AParentesesComparacaoTermoLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualDiferente1ExpComparativa(AIgualDiferente1ExpComparativa node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorMaiorExpComparativa(AMenorMaiorExpComparativa node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualSimbolo1(AIgualSimbolo1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiferenteSimbolo1(ADiferenteSimbolo1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorLogicoExpMenorMaior(AMenorLogicoExpMenorMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElementoExpMenorMaior(AElementoExpMenorMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorQueSimbolo2(AMenorQueSimbolo2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorQueSimbolo2(AMaiorQueSimbolo2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorIgualSimbolo2(AMenorIgualSimbolo2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorIgualSimbolo2(AMaiorIgualSimbolo2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorElemento(AValorElemento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariaveisElemento(AVariaveisElemento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereValor(ACaractereValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroInteiroValor(ANumeroInteiroValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroRealValor(ANumeroRealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTChaveDir(TChaveDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTChaveEsq(TChaveEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCocheteDir(TCocheteDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCocheteEsq(TCocheteEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarraDir(TBarraDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarraEsq(TBarraEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParenteseDir(TParenteseDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParenteseEsq(TParenteseEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEstrela(TEstrela node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSublinhado(TSublinhado node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTExponenciacao(TExponenciacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTResto(TResto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtrib(TAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorq(TMaiorq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorq(TMenorq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTApostrof(TApostrof node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPonto(TFimPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVar(TVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstante(TConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLogico(TLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSenao(TFimSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPadrao(TPadrao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicioPara(TInicioPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicioEnquanto(TInicioEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicioRepita(TInicioRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimRepita(TFimRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRetorne(TRetorne node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInterrompa(TInterrompa node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTContinue(TContinue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXou(TXou node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVerdade(TVerdade node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFalso(TFalso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVetor(TVetor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNInt(TNInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNReal(TNReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLCaractere(TLCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentario(TComentario node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBrancos(TBrancos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentificador(TIdentificador node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioInicio(TComentarioInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioFim(TComentarioFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioCorpo(TComentarioCorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
