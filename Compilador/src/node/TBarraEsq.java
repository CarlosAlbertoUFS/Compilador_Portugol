/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TBarraEsq extends Token
{
    public TBarraEsq()
    {
        super.setText("\\");
    }

    public TBarraEsq(int line, int pos)
    {
        super.setText("\\");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBarraEsq(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBarraEsq(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBarraEsq text.");
    }
}