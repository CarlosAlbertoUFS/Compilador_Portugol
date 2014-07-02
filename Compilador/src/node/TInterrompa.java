/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TInterrompa extends Token
{
    public TInterrompa()
    {
        super.setText("interrompa");
    }

    public TInterrompa(int line, int pos)
    {
        super.setText("interrompa");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInterrompa(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInterrompa(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInterrompa text.");
    }
}
