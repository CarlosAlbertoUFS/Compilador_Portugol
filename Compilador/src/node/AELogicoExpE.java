/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AELogicoExpE extends PExpE
{
    private PExpE _expE_;
    private TE _e_;
    private PExpNao _expNao_;

    public AELogicoExpE()
    {
        // Constructor
    }

    public AELogicoExpE(
        @SuppressWarnings("hiding") PExpE _expE_,
        @SuppressWarnings("hiding") TE _e_,
        @SuppressWarnings("hiding") PExpNao _expNao_)
    {
        // Constructor
        setExpE(_expE_);

        setE(_e_);

        setExpNao(_expNao_);

    }

    @Override
    public Object clone()
    {
        return new AELogicoExpE(
            cloneNode(this._expE_),
            cloneNode(this._e_),
            cloneNode(this._expNao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAELogicoExpE(this);
    }

    public PExpE getExpE()
    {
        return this._expE_;
    }

    public void setExpE(PExpE node)
    {
        if(this._expE_ != null)
        {
            this._expE_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expE_ = node;
    }

    public TE getE()
    {
        return this._e_;
    }

    public void setE(TE node)
    {
        if(this._e_ != null)
        {
            this._e_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e_ = node;
    }

    public PExpNao getExpNao()
    {
        return this._expNao_;
    }

    public void setExpNao(PExpNao node)
    {
        if(this._expNao_ != null)
        {
            this._expNao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expNao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expE_)
            + toString(this._e_)
            + toString(this._expNao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expE_ == child)
        {
            this._expE_ = null;
            return;
        }

        if(this._e_ == child)
        {
            this._e_ = null;
            return;
        }

        if(this._expNao_ == child)
        {
            this._expNao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expE_ == oldChild)
        {
            setExpE((PExpE) newChild);
            return;
        }

        if(this._e_ == oldChild)
        {
            setE((TE) newChild);
            return;
        }

        if(this._expNao_ == oldChild)
        {
            setExpNao((PExpNao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
