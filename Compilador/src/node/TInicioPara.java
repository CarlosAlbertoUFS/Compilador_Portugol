/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TInicioPara extends Token
{
    public TInicioPara()
    {
        super.setText("inicio para");
    }

    public TInicioPara(int line, int pos)
    {
        super.setText("inicio para");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInicioPara(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInicioPara(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInicioPara text.");
    }
}