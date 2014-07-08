/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ADiferenteSimbolo1 extends PSimbolo1
{
    private TDiferente _diferente_;

    public ADiferenteSimbolo1()
    {
        // Constructor
    }

    public ADiferenteSimbolo1(
        @SuppressWarnings("hiding") TDiferente _diferente_)
    {
        // Constructor
        setDiferente(_diferente_);

    }

    @Override
    public Object clone()
    {
        return new ADiferenteSimbolo1(
            cloneNode(this._diferente_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADiferenteSimbolo1(this);
    }

    public TDiferente getDiferente()
    {
        return this._diferente_;
    }

    public void setDiferente(TDiferente node)
    {
        if(this._diferente_ != null)
        {
            this._diferente_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._diferente_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._diferente_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._diferente_ == child)
        {
            this._diferente_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._diferente_ == oldChild)
        {
            setDiferente((TDiferente) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
