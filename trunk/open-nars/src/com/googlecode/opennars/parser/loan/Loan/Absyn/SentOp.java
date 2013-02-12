package com.googlecode.opennars.parser.loan.Loan.Absyn; // Java Package generated by the BNF Converter.

public class SentOp extends Sentence {
  public final URIRef uriref_;

  public SentOp(URIRef p1) { uriref_ = p1; }

  public <R,A> R accept(com.googlecode.opennars.parser.loan.Loan.Absyn.Sentence.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.googlecode.opennars.parser.loan.Loan.Absyn.SentOp) {
      com.googlecode.opennars.parser.loan.Loan.Absyn.SentOp x = (com.googlecode.opennars.parser.loan.Loan.Absyn.SentOp)o;
      return this.uriref_.equals(x.uriref_);
    }
    return false;
  }

  public int hashCode() {
    return this.uriref_.hashCode();
  }


}