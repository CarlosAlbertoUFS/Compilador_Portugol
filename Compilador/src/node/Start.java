/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class Start extends Node
{
    private PExpAritimetrica _pExpAritimetrica_;
    private EOF _eof_;

    public Start()
    {
        // Empty body
    }

    public Start(
        @SuppressWarnings("hiding") PExpAritimetrica _pExpAritimetrica_,
        @SuppressWarnings("hiding") EOF _eof_)
    {
        setPExpAritimetrica(_pExpAritimetrica_);
        setEOF(_eof_);
    }

    @Override
    public Object clone()
    {
        return new Start(
            cloneNode(this._pExpAritimetrica_),
            cloneNode(this._eof_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseStart(this);
    }

    public PExpAritimetrica getPExpAritimetrica()
    {
        return this._pExpAritimetrica_;
    }

    public void setPExpAritimetrica(PExpAritimetrica node)
    {
        if(this._pExpAritimetrica_ != null)
        {
            this._pExpAritimetrica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pExpAritimetrica_ = node;
    }

    public EOF getEOF()
    {
        return this._eof_;
    }

    public void setEOF(EOF node)
    {
        if(this._eof_ != null)
        {
            this._eof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eof_ = node;
    }

    @Override
    void removeChild(Node child)
    {
        if(this._pExpAritimetrica_ == child)
        {
            this._pExpAritimetrica_ = null;
            return;
        }

        if(this._eof_ == child)
        {
            this._eof_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(Node oldChild, Node newChild)
    {
        if(this._pExpAritimetrica_ == oldChild)
        {
            setPExpAritimetrica((PExpAritimetrica) newChild);
            return;
        }

        if(this._eof_ == oldChild)
        {
            setEOF((EOF) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    public String toString()
    {
        return "" +
            toString(this._pExpAritimetrica_) +
            toString(this._eof_);
    }
}