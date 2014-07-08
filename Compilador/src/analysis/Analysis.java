/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseACabecalhoPrograma(ACabecalhoPrograma node);
    void caseAVariaveisDeclaracao(AVariaveisDeclaracao node);
    void caseAConstantesDeclaracao(AConstantesDeclaracao node);
    void caseAVazioDeclaracao(AVazioDeclaracao node);
    void caseAInteiroTipo(AInteiroTipo node);
    void caseARealTipo(ARealTipo node);
    void caseACaractereTipo(ACaractereTipo node);
    void caseAListaVariaveisEscorpo(AListaVariaveisEscorpo node);
    void caseAVariavelEscorpo(AVariavelEscorpo node);
    void caseAVetorVariavel(AVetorVariavel node);
    void caseAVariavelVariavel(AVariavelVariavel node);
    void caseASeSenaoComando(ASeSenaoComando node);
    void caseAVazioComando(AVazioComando node);
    void caseASeBlocoSeBloco(ASeBlocoSeBloco node);
    void caseASenaoBlocoSenaoBloco(ASenaoBlocoSenaoBloco node);
    void caseAVazioSenaoBloco(AVazioSenaoBloco node);
    void caseANumeroNegativoExpAritimetrica(ANumeroNegativoExpAritimetrica node);
    void caseAAdicaoSubtracaoExpAritimetrica(AAdicaoSubtracaoExpAritimetrica node);
    void caseATermoExpAritimetrica(ATermoExpAritimetrica node);
    void caseAAdicaoSoma(AAdicaoSoma node);
    void caseASubtracaoSoma(ASubtracaoSoma node);
    void caseAMultiplicacaoDivisaoTermo(AMultiplicacaoDivisaoTermo node);
    void caseAFatorTermo(AFatorTermo node);
    void caseAMultiplicacaoMult(AMultiplicacaoMult node);
    void caseADivisaoMult(ADivisaoMult node);
    void caseAExpParentesesFator(AExpParentesesFator node);
    void caseAElementoFator(AElementoFator node);
    void caseAOuLogicoExpLogica(AOuLogicoExpLogica node);
    void caseAExpXouExpLogica(AExpXouExpLogica node);
    void caseAOuxLogicoExpXou(AOuxLogicoExpXou node);
    void caseAExpEExpXou(AExpEExpXou node);
    void caseAELogicoExpE(AELogicoExpE node);
    void caseAExpNaoExpE(AExpNaoExpE node);
    void caseANaoLogicoExpNao(ANaoLogicoExpNao node);
    void caseATermoLogicoExpNao(ATermoLogicoExpNao node);
    void caseAParentesesLogicoTermoLogico(AParentesesLogicoTermoLogico node);
    void caseAParentesesComparacaoTermoLogico(AParentesesComparacaoTermoLogico node);
    void caseAIgualDiferente1ExpComparativa(AIgualDiferente1ExpComparativa node);
    void caseAMenorMaiorExpComparativa(AMenorMaiorExpComparativa node);
    void caseAIgualSimbolo1(AIgualSimbolo1 node);
    void caseADiferenteSimbolo1(ADiferenteSimbolo1 node);
    void caseAMenorLogicoExpMenorMaior(AMenorLogicoExpMenorMaior node);
    void caseAElementoExpMenorMaior(AElementoExpMenorMaior node);
    void caseAMenorQueSimbolo2(AMenorQueSimbolo2 node);
    void caseAMaiorQueSimbolo2(AMaiorQueSimbolo2 node);
    void caseAMenorIgualSimbolo2(AMenorIgualSimbolo2 node);
    void caseAMaiorIgualSimbolo2(AMaiorIgualSimbolo2 node);
    void caseAValorElemento(AValorElemento node);
    void caseAVariaveisElemento(AVariaveisElemento node);
    void caseACaractereValor(ACaractereValor node);
    void caseANumeroInteiroValor(ANumeroInteiroValor node);
    void caseANumeroRealValor(ANumeroRealValor node);

    void caseTChaveDir(TChaveDir node);
    void caseTChaveEsq(TChaveEsq node);
    void caseTCocheteDir(TCocheteDir node);
    void caseTCocheteEsq(TCocheteEsq node);
    void caseTBarraDir(TBarraDir node);
    void caseTBarraEsq(TBarraEsq node);
    void caseTParenteseDir(TParenteseDir node);
    void caseTParenteseEsq(TParenteseEsq node);
    void caseTEstrela(TEstrela node);
    void caseTSublinhado(TSublinhado node);
    void caseTVirgula(TVirgula node);
    void caseTMenos(TMenos node);
    void caseTMais(TMais node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTExponenciacao(TExponenciacao node);
    void caseTResto(TResto node);
    void caseTAtrib(TAtrib node);
    void caseTMaiorq(TMaiorq node);
    void caseTMenorq(TMenorq node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTIgual(TIgual node);
    void caseTDiferente(TDiferente node);
    void caseTPonto(TPonto node);
    void caseTApostrof(TApostrof node);
    void caseTPrograma(TPrograma node);
    void caseTInicio(TInicio node);
    void caseTFimPonto(TFimPonto node);
    void caseTVar(TVar node);
    void caseTConstante(TConstante node);
    void caseTInteiro(TInteiro node);
    void caseTReal(TReal node);
    void caseTLogico(TLogico node);
    void caseTCaractere(TCaractere node);
    void caseTSe(TSe node);
    void caseTEntao(TEntao node);
    void caseTFimSe(TFimSe node);
    void caseTSenao(TSenao node);
    void caseTFimSenao(TFimSenao node);
    void caseTAvalie(TAvalie node);
    void caseTCaso(TCaso node);
    void caseTPadrao(TPadrao node);
    void caseTPara(TPara node);
    void caseTFaca(TFaca node);
    void caseTAte(TAte node);
    void caseTInicioPara(TInicioPara node);
    void caseTFimPara(TFimPara node);
    void caseTEnquanto(TEnquanto node);
    void caseTInicioEnquanto(TInicioEnquanto node);
    void caseTFimEnquanto(TFimEnquanto node);
    void caseTRepita(TRepita node);
    void caseTInicioRepita(TInicioRepita node);
    void caseTFimRepita(TFimRepita node);
    void caseTLeia(TLeia node);
    void caseTEscreva(TEscreva node);
    void caseTPasso(TPasso node);
    void caseTRetorne(TRetorne node);
    void caseTInterrompa(TInterrompa node);
    void caseTContinue(TContinue node);
    void caseTNao(TNao node);
    void caseTOu(TOu node);
    void caseTXou(TXou node);
    void caseTE(TE node);
    void caseTVerdade(TVerdade node);
    void caseTFalso(TFalso node);
    void caseTVetor(TVetor node);
    void caseTNInt(TNInt node);
    void caseTNReal(TNReal node);
    void caseTLCaractere(TLCaractere node);
    void caseTComentario(TComentario node);
    void caseTBrancos(TBrancos node);
    void caseTIdentificador(TIdentificador node);
    void caseTComentarioInicio(TComentarioInicio node);
    void caseTComentarioFim(TComentarioFim node);
    void caseTComentarioCorpo(TComentarioCorpo node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
