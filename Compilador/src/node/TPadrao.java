/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TPadrao extends Token
{
    public TPadrao()
    {
        super.setText("padrao");
    }

    public TPadrao(int line, int pos)
    {
        super.setText("padrao");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPadrao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPadrao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPadrao text.");
    }
}
