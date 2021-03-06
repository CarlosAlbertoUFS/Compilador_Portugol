package Testes;
import java.nio.channels.AcceptPendingException;

import analysis.*;
import node.*;


class Tradutor extends DepthFirstAdapter
{
	@Override
	public void outANumeroNegativoExpAritimetrica(
			ANumeroNegativoExpAritimetrica node) {
		// TODO Auto-generated method stub
		System.out.println(node.getMenos());
	}
	
	
	@Override
	public void outAAdicaoSoma(AAdicaoSoma node) {
		System.out.println(node.getMais());
	}
	
	@Override
	public void outASubtracaoSoma(ASubtracaoSoma node) {
		System.out.println(node.getMenos());
	}
	
	@Override
	public void outADivisaoMult(ADivisaoMult node) {
			System.out.println(node.getBarraDir());
	}
	
	@Override
	public void outAMultiplicacaoMult(AMultiplicacaoMult node) {
		System.out.println(node.getEstrela());
	}
	
	@Override
	public void outANumeroInteiroFator(ANumeroInteiroFator node) {
		System.out.println(node.getNInt());
	}
	
	@Override
	public void outANumeroRealFator(ANumeroRealFator node) {
		System.out.println(node.getNReal());
	}
	
	
	
	@Override
	public void caseAExpParentesesFator(AExpParentesesFator node) {
		if(node.getParenteseDir().equals("(")){
			System.out.println(node.getParenteseDir());
		}else{
			System.out.println(node.getParenteseEsq());
		}
	}
	
	
	
	
	
	}

