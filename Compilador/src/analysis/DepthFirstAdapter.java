/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPPrograma().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inACabecalhoPrograma(ACabecalhoPrograma node)
    {
        defaultIn(node);
    }

    public void outACabecalhoPrograma(ACabecalhoPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACabecalhoPrograma(ACabecalhoPrograma node)
    {
        inACabecalhoPrograma(node);
        if(node.getPrograma() != null)
        {
            node.getPrograma().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getDeclaracao() != null)
        {
            node.getDeclaracao().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getFimPonto() != null)
        {
            node.getFimPonto().apply(this);
        }
        outACabecalhoPrograma(node);
    }

    public void inAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        inAVariaveisDeclaracao(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        if(node.getEscorpo() != null)
        {
            node.getEscorpo().apply(this);
        }
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        outAVariaveisDeclaracao(node);
    }

    public void inAConstantesDeclaracao(AConstantesDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAConstantesDeclaracao(AConstantesDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstantesDeclaracao(AConstantesDeclaracao node)
    {
        inAConstantesDeclaracao(node);
        if(node.getConstante() != null)
        {
            node.getConstante().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        outAConstantesDeclaracao(node);
    }

    public void inAVazioDeclaracao(AVazioDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVazioDeclaracao(AVazioDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioDeclaracao(AVazioDeclaracao node)
    {
        inAVazioDeclaracao(node);
        outAVazioDeclaracao(node);
    }

    public void inAInteiroTipo(AInteiroTipo node)
    {
        defaultIn(node);
    }

    public void outAInteiroTipo(AInteiroTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node)
    {
        inAInteiroTipo(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAInteiroTipo(node);
    }

    public void inARealTipo(ARealTipo node)
    {
        defaultIn(node);
    }

    public void outARealTipo(ARealTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        inARealTipo(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealTipo(node);
    }

    public void inACaractereTipo(ACaractereTipo node)
    {
        defaultIn(node);
    }

    public void outACaractereTipo(ACaractereTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaractereTipo(ACaractereTipo node)
    {
        inACaractereTipo(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outACaractereTipo(node);
    }

    public void inAListaVariaveisEscorpo(AListaVariaveisEscorpo node)
    {
        defaultIn(node);
    }

    public void outAListaVariaveisEscorpo(AListaVariaveisEscorpo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListaVariaveisEscorpo(AListaVariaveisEscorpo node)
    {
        inAListaVariaveisEscorpo(node);
        if(node.getEscorpo() != null)
        {
            node.getEscorpo().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        outAListaVariaveisEscorpo(node);
    }

    public void inAVariavelEscorpo(AVariavelEscorpo node)
    {
        defaultIn(node);
    }

    public void outAVariavelEscorpo(AVariavelEscorpo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelEscorpo(AVariavelEscorpo node)
    {
        inAVariavelEscorpo(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        outAVariavelEscorpo(node);
    }

    public void inAVetorVariavel(AVetorVariavel node)
    {
        defaultIn(node);
    }

    public void outAVetorVariavel(AVetorVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVariavel(AVetorVariavel node)
    {
        inAVetorVariavel(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getCocheteEsq() != null)
        {
            node.getCocheteEsq().apply(this);
        }
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        if(node.getCocheteDir() != null)
        {
            node.getCocheteDir().apply(this);
        }
        outAVetorVariavel(node);
    }

    public void inAVariavelVariavel(AVariavelVariavel node)
    {
        defaultIn(node);
    }

    public void outAVariavelVariavel(AVariavelVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelVariavel(AVariavelVariavel node)
    {
        inAVariavelVariavel(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAVariavelVariavel(node);
    }

    public void inASeSenaoComando(ASeSenaoComando node)
    {
        defaultIn(node);
    }

    public void outASeSenaoComando(ASeSenaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeSenaoComando(ASeSenaoComando node)
    {
        inASeSenaoComando(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getSeBloco() != null)
        {
            node.getSeBloco().apply(this);
        }
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        outASeSenaoComando(node);
    }

    public void inAVazioComando(AVazioComando node)
    {
        defaultIn(node);
    }

    public void outAVazioComando(AVazioComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioComando(AVazioComando node)
    {
        inAVazioComando(node);
        outAVazioComando(node);
    }

    public void inASeBlocoSeBloco(ASeBlocoSeBloco node)
    {
        defaultIn(node);
    }

    public void outASeBlocoSeBloco(ASeBlocoSeBloco node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeBlocoSeBloco(ASeBlocoSeBloco node)
    {
        inASeBlocoSeBloco(node);
        if(node.getSe() != null)
        {
            node.getSe().apply(this);
        }
        if(node.getParenteseEsq() != null)
        {
            node.getParenteseEsq().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getParenteseDir() != null)
        {
            node.getParenteseDir().apply(this);
        }
        if(node.getEntao() != null)
        {
            node.getEntao().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getSenaoBloco() != null)
        {
            node.getSenaoBloco().apply(this);
        }
        if(node.getFimSe() != null)
        {
            node.getFimSe().apply(this);
        }
        outASeBlocoSeBloco(node);
    }

    public void inASenaoBlocoSenaoBloco(ASenaoBlocoSenaoBloco node)
    {
        defaultIn(node);
    }

    public void outASenaoBlocoSenaoBloco(ASenaoBlocoSenaoBloco node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASenaoBlocoSenaoBloco(ASenaoBlocoSenaoBloco node)
    {
        inASenaoBlocoSenaoBloco(node);
        if(node.getSenao() != null)
        {
            node.getSenao().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getFimSenao() != null)
        {
            node.getFimSenao().apply(this);
        }
        outASenaoBlocoSenaoBloco(node);
    }

    public void inAVazioSenaoBloco(AVazioSenaoBloco node)
    {
        defaultIn(node);
    }

    public void outAVazioSenaoBloco(AVazioSenaoBloco node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioSenaoBloco(AVazioSenaoBloco node)
    {
        inAVazioSenaoBloco(node);
        outAVazioSenaoBloco(node);
    }

    public void inANumeroNegativoExpAritimetrica(ANumeroNegativoExpAritimetrica node)
    {
        defaultIn(node);
    }

    public void outANumeroNegativoExpAritimetrica(ANumeroNegativoExpAritimetrica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroNegativoExpAritimetrica(ANumeroNegativoExpAritimetrica node)
    {
        inANumeroNegativoExpAritimetrica(node);
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outANumeroNegativoExpAritimetrica(node);
    }

    public void inAAdicaoSubtracaoExpAritimetrica(AAdicaoSubtracaoExpAritimetrica node)
    {
        defaultIn(node);
    }

    public void outAAdicaoSubtracaoExpAritimetrica(AAdicaoSubtracaoExpAritimetrica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAdicaoSubtracaoExpAritimetrica(AAdicaoSubtracaoExpAritimetrica node)
    {
        inAAdicaoSubtracaoExpAritimetrica(node);
        if(node.getExpAritimetrica() != null)
        {
            node.getExpAritimetrica().apply(this);
        }
        if(node.getSoma() != null)
        {
            node.getSoma().apply(this);
        }
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outAAdicaoSubtracaoExpAritimetrica(node);
    }

    public void inATermoExpAritimetrica(ATermoExpAritimetrica node)
    {
        defaultIn(node);
    }

    public void outATermoExpAritimetrica(ATermoExpAritimetrica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermoExpAritimetrica(ATermoExpAritimetrica node)
    {
        inATermoExpAritimetrica(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outATermoExpAritimetrica(node);
    }

    public void inAAdicaoSoma(AAdicaoSoma node)
    {
        defaultIn(node);
    }

    public void outAAdicaoSoma(AAdicaoSoma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAdicaoSoma(AAdicaoSoma node)
    {
        inAAdicaoSoma(node);
        if(node.getMais() != null)
        {
            node.getMais().apply(this);
        }
        outAAdicaoSoma(node);
    }

    public void inASubtracaoSoma(ASubtracaoSoma node)
    {
        defaultIn(node);
    }

    public void outASubtracaoSoma(ASubtracaoSoma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubtracaoSoma(ASubtracaoSoma node)
    {
        inASubtracaoSoma(node);
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        outASubtracaoSoma(node);
    }

    public void inAMultiplicacaoDivisaoTermo(AMultiplicacaoDivisaoTermo node)
    {
        defaultIn(node);
    }

    public void outAMultiplicacaoDivisaoTermo(AMultiplicacaoDivisaoTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplicacaoDivisaoTermo(AMultiplicacaoDivisaoTermo node)
    {
        inAMultiplicacaoDivisaoTermo(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outAMultiplicacaoDivisaoTermo(node);
    }

    public void inAFatorTermo(AFatorTermo node)
    {
        defaultIn(node);
    }

    public void outAFatorTermo(AFatorTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorTermo(AFatorTermo node)
    {
        inAFatorTermo(node);
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outAFatorTermo(node);
    }

    public void inAMultiplicacaoMult(AMultiplicacaoMult node)
    {
        defaultIn(node);
    }

    public void outAMultiplicacaoMult(AMultiplicacaoMult node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplicacaoMult(AMultiplicacaoMult node)
    {
        inAMultiplicacaoMult(node);
        if(node.getEstrela() != null)
        {
            node.getEstrela().apply(this);
        }
        outAMultiplicacaoMult(node);
    }

    public void inADivisaoMult(ADivisaoMult node)
    {
        defaultIn(node);
    }

    public void outADivisaoMult(ADivisaoMult node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivisaoMult(ADivisaoMult node)
    {
        inADivisaoMult(node);
        if(node.getBarraDir() != null)
        {
            node.getBarraDir().apply(this);
        }
        outADivisaoMult(node);
    }

    public void inAExpParentesesFator(AExpParentesesFator node)
    {
        defaultIn(node);
    }

    public void outAExpParentesesFator(AExpParentesesFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpParentesesFator(AExpParentesesFator node)
    {
        inAExpParentesesFator(node);
        if(node.getParenteseEsq() != null)
        {
            node.getParenteseEsq().apply(this);
        }
        if(node.getExpAritimetrica() != null)
        {
            node.getExpAritimetrica().apply(this);
        }
        if(node.getParenteseDir() != null)
        {
            node.getParenteseDir().apply(this);
        }
        outAExpParentesesFator(node);
    }

    public void inAElementoFator(AElementoFator node)
    {
        defaultIn(node);
    }

    public void outAElementoFator(AElementoFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElementoFator(AElementoFator node)
    {
        inAElementoFator(node);
        if(node.getElemento() != null)
        {
            node.getElemento().apply(this);
        }
        outAElementoFator(node);
    }

    public void inAOuLogicoExpLogica(AOuLogicoExpLogica node)
    {
        defaultIn(node);
    }

    public void outAOuLogicoExpLogica(AOuLogicoExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuLogicoExpLogica(AOuLogicoExpLogica node)
    {
        inAOuLogicoExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getOu() != null)
        {
            node.getOu().apply(this);
        }
        if(node.getExpXou() != null)
        {
            node.getExpXou().apply(this);
        }
        outAOuLogicoExpLogica(node);
    }

    public void inAExpXouExpLogica(AExpXouExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpXouExpLogica(AExpXouExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpXouExpLogica(AExpXouExpLogica node)
    {
        inAExpXouExpLogica(node);
        if(node.getExpXou() != null)
        {
            node.getExpXou().apply(this);
        }
        outAExpXouExpLogica(node);
    }

    public void inAOuxLogicoExpXou(AOuxLogicoExpXou node)
    {
        defaultIn(node);
    }

    public void outAOuxLogicoExpXou(AOuxLogicoExpXou node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuxLogicoExpXou(AOuxLogicoExpXou node)
    {
        inAOuxLogicoExpXou(node);
        if(node.getExpXou() != null)
        {
            node.getExpXou().apply(this);
        }
        if(node.getXou() != null)
        {
            node.getXou().apply(this);
        }
        if(node.getExpE() != null)
        {
            node.getExpE().apply(this);
        }
        outAOuxLogicoExpXou(node);
    }

    public void inAExpEExpXou(AExpEExpXou node)
    {
        defaultIn(node);
    }

    public void outAExpEExpXou(AExpEExpXou node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpEExpXou(AExpEExpXou node)
    {
        inAExpEExpXou(node);
        if(node.getExpE() != null)
        {
            node.getExpE().apply(this);
        }
        outAExpEExpXou(node);
    }

    public void inAELogicoExpE(AELogicoExpE node)
    {
        defaultIn(node);
    }

    public void outAELogicoExpE(AELogicoExpE node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAELogicoExpE(AELogicoExpE node)
    {
        inAELogicoExpE(node);
        if(node.getExpE() != null)
        {
            node.getExpE().apply(this);
        }
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getExpNao() != null)
        {
            node.getExpNao().apply(this);
        }
        outAELogicoExpE(node);
    }

    public void inAExpNaoExpE(AExpNaoExpE node)
    {
        defaultIn(node);
    }

    public void outAExpNaoExpE(AExpNaoExpE node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpNaoExpE(AExpNaoExpE node)
    {
        inAExpNaoExpE(node);
        if(node.getExpNao() != null)
        {
            node.getExpNao().apply(this);
        }
        outAExpNaoExpE(node);
    }

    public void inANaoLogicoExpNao(ANaoLogicoExpNao node)
    {
        defaultIn(node);
    }

    public void outANaoLogicoExpNao(ANaoLogicoExpNao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANaoLogicoExpNao(ANaoLogicoExpNao node)
    {
        inANaoLogicoExpNao(node);
        if(node.getNao() != null)
        {
            node.getNao().apply(this);
        }
        if(node.getTermoLogico() != null)
        {
            node.getTermoLogico().apply(this);
        }
        outANaoLogicoExpNao(node);
    }

    public void inATermoLogicoExpNao(ATermoLogicoExpNao node)
    {
        defaultIn(node);
    }

    public void outATermoLogicoExpNao(ATermoLogicoExpNao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermoLogicoExpNao(ATermoLogicoExpNao node)
    {
        inATermoLogicoExpNao(node);
        if(node.getTermoLogico() != null)
        {
            node.getTermoLogico().apply(this);
        }
        outATermoLogicoExpNao(node);
    }

    public void inAParentesesLogicoTermoLogico(AParentesesLogicoTermoLogico node)
    {
        defaultIn(node);
    }

    public void outAParentesesLogicoTermoLogico(AParentesesLogicoTermoLogico node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParentesesLogicoTermoLogico(AParentesesLogicoTermoLogico node)
    {
        inAParentesesLogicoTermoLogico(node);
        if(node.getParenteseEsq() != null)
        {
            node.getParenteseEsq().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getParenteseDir() != null)
        {
            node.getParenteseDir().apply(this);
        }
        outAParentesesLogicoTermoLogico(node);
    }

    public void inAParentesesComparacaoTermoLogico(AParentesesComparacaoTermoLogico node)
    {
        defaultIn(node);
    }

    public void outAParentesesComparacaoTermoLogico(AParentesesComparacaoTermoLogico node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParentesesComparacaoTermoLogico(AParentesesComparacaoTermoLogico node)
    {
        inAParentesesComparacaoTermoLogico(node);
        if(node.getExpComparativa() != null)
        {
            node.getExpComparativa().apply(this);
        }
        outAParentesesComparacaoTermoLogico(node);
    }

    public void inAIgualDiferente1ExpComparativa(AIgualDiferente1ExpComparativa node)
    {
        defaultIn(node);
    }

    public void outAIgualDiferente1ExpComparativa(AIgualDiferente1ExpComparativa node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualDiferente1ExpComparativa(AIgualDiferente1ExpComparativa node)
    {
        inAIgualDiferente1ExpComparativa(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getSimbolo1() != null)
        {
            node.getSimbolo1().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAIgualDiferente1ExpComparativa(node);
    }

    public void inAMenorMaiorExpComparativa(AMenorMaiorExpComparativa node)
    {
        defaultIn(node);
    }

    public void outAMenorMaiorExpComparativa(AMenorMaiorExpComparativa node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorMaiorExpComparativa(AMenorMaiorExpComparativa node)
    {
        inAMenorMaiorExpComparativa(node);
        if(node.getExpMenorMaior() != null)
        {
            node.getExpMenorMaior().apply(this);
        }
        outAMenorMaiorExpComparativa(node);
    }

    public void inAIgualSimbolo1(AIgualSimbolo1 node)
    {
        defaultIn(node);
    }

    public void outAIgualSimbolo1(AIgualSimbolo1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualSimbolo1(AIgualSimbolo1 node)
    {
        inAIgualSimbolo1(node);
        if(node.getIgual() != null)
        {
            node.getIgual().apply(this);
        }
        outAIgualSimbolo1(node);
    }

    public void inADiferenteSimbolo1(ADiferenteSimbolo1 node)
    {
        defaultIn(node);
    }

    public void outADiferenteSimbolo1(ADiferenteSimbolo1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferenteSimbolo1(ADiferenteSimbolo1 node)
    {
        inADiferenteSimbolo1(node);
        if(node.getDiferente() != null)
        {
            node.getDiferente().apply(this);
        }
        outADiferenteSimbolo1(node);
    }

    public void inAMenorLogicoExpMenorMaior(AMenorLogicoExpMenorMaior node)
    {
        defaultIn(node);
    }

    public void outAMenorLogicoExpMenorMaior(AMenorLogicoExpMenorMaior node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorLogicoExpMenorMaior(AMenorLogicoExpMenorMaior node)
    {
        inAMenorLogicoExpMenorMaior(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getSimbolo2() != null)
        {
            node.getSimbolo2().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAMenorLogicoExpMenorMaior(node);
    }

    public void inAElementoExpMenorMaior(AElementoExpMenorMaior node)
    {
        defaultIn(node);
    }

    public void outAElementoExpMenorMaior(AElementoExpMenorMaior node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElementoExpMenorMaior(AElementoExpMenorMaior node)
    {
        inAElementoExpMenorMaior(node);
        if(node.getElemento() != null)
        {
            node.getElemento().apply(this);
        }
        outAElementoExpMenorMaior(node);
    }

    public void inAMenorQueSimbolo2(AMenorQueSimbolo2 node)
    {
        defaultIn(node);
    }

    public void outAMenorQueSimbolo2(AMenorQueSimbolo2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorQueSimbolo2(AMenorQueSimbolo2 node)
    {
        inAMenorQueSimbolo2(node);
        if(node.getMenorq() != null)
        {
            node.getMenorq().apply(this);
        }
        outAMenorQueSimbolo2(node);
    }

    public void inAMaiorQueSimbolo2(AMaiorQueSimbolo2 node)
    {
        defaultIn(node);
    }

    public void outAMaiorQueSimbolo2(AMaiorQueSimbolo2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorQueSimbolo2(AMaiorQueSimbolo2 node)
    {
        inAMaiorQueSimbolo2(node);
        if(node.getMaiorq() != null)
        {
            node.getMaiorq().apply(this);
        }
        outAMaiorQueSimbolo2(node);
    }

    public void inAMenorIgualSimbolo2(AMenorIgualSimbolo2 node)
    {
        defaultIn(node);
    }

    public void outAMenorIgualSimbolo2(AMenorIgualSimbolo2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorIgualSimbolo2(AMenorIgualSimbolo2 node)
    {
        inAMenorIgualSimbolo2(node);
        if(node.getMenorIgual() != null)
        {
            node.getMenorIgual().apply(this);
        }
        outAMenorIgualSimbolo2(node);
    }

    public void inAMaiorIgualSimbolo2(AMaiorIgualSimbolo2 node)
    {
        defaultIn(node);
    }

    public void outAMaiorIgualSimbolo2(AMaiorIgualSimbolo2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorIgualSimbolo2(AMaiorIgualSimbolo2 node)
    {
        inAMaiorIgualSimbolo2(node);
        if(node.getMaiorIgual() != null)
        {
            node.getMaiorIgual().apply(this);
        }
        outAMaiorIgualSimbolo2(node);
    }

    public void inAValorElemento(AValorElemento node)
    {
        defaultIn(node);
    }

    public void outAValorElemento(AValorElemento node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorElemento(AValorElemento node)
    {
        inAValorElemento(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorElemento(node);
    }

    public void inAVariaveisElemento(AVariaveisElemento node)
    {
        defaultIn(node);
    }

    public void outAVariaveisElemento(AVariaveisElemento node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariaveisElemento(AVariaveisElemento node)
    {
        inAVariaveisElemento(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        outAVariaveisElemento(node);
    }

    public void inACaractereValor(ACaractereValor node)
    {
        defaultIn(node);
    }

    public void outACaractereValor(ACaractereValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaractereValor(ACaractereValor node)
    {
        inACaractereValor(node);
        if(node.getLCaractere() != null)
        {
            node.getLCaractere().apply(this);
        }
        outACaractereValor(node);
    }

    public void inANumeroInteiroValor(ANumeroInteiroValor node)
    {
        defaultIn(node);
    }

    public void outANumeroInteiroValor(ANumeroInteiroValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroInteiroValor(ANumeroInteiroValor node)
    {
        inANumeroInteiroValor(node);
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        outANumeroInteiroValor(node);
    }

    public void inANumeroRealValor(ANumeroRealValor node)
    {
        defaultIn(node);
    }

    public void outANumeroRealValor(ANumeroRealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroRealValor(ANumeroRealValor node)
    {
        inANumeroRealValor(node);
        if(node.getNReal() != null)
        {
            node.getNReal().apply(this);
        }
        outANumeroRealValor(node);
    }
}
