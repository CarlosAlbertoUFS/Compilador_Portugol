/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AParentesesLogicoTermoLogico extends PTermoLogico
{
    private TParenteseEsq _parenteseEsq_;
    private PExpLogica _expLogica_;
    private TParenteseDir _parenteseDir_;

    public AParentesesLogicoTermoLogico()
    {
        // Constructor
    }

    public AParentesesLogicoTermoLogico(
        @SuppressWarnings("hiding") TParenteseEsq _parenteseEsq_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TParenteseDir _parenteseDir_)
    {
        // Constructor
        setParenteseEsq(_parenteseEsq_);

        setExpLogica(_expLogica_);

        setParenteseDir(_parenteseDir_);

    }

    @Override
    public Object clone()
    {
        return new AParentesesLogicoTermoLogico(
            cloneNode(this._parenteseEsq_),
            cloneNode(this._expLogica_),
            cloneNode(this._parenteseDir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParentesesLogicoTermoLogico(this);
    }

    public TParenteseEsq getParenteseEsq()
    {
        return this._parenteseEsq_;
    }

    public void setParenteseEsq(TParenteseEsq node)
    {
        if(this._parenteseEsq_ != null)
        {
            this._parenteseEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteseEsq_ = node;
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
    }

    public TParenteseDir getParenteseDir()
    {
        return this._parenteseDir_;
    }

    public void setParenteseDir(TParenteseDir node)
    {
        if(this._parenteseDir_ != null)
        {
            this._parenteseDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteseDir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parenteseEsq_)
            + toString(this._expLogica_)
            + toString(this._parenteseDir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parenteseEsq_ == child)
        {
            this._parenteseEsq_ = null;
            return;
        }

        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._parenteseDir_ == child)
        {
            this._parenteseDir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parenteseEsq_ == oldChild)
        {
            setParenteseEsq((TParenteseEsq) newChild);
            return;
        }

        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        if(this._parenteseDir_ == oldChild)
        {
            setParenteseDir((TParenteseDir) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
