package com.googlecode.opennars.parser.loan.Loan.Absyn; // Java Package generated by the BNF Converter.

public class StmTrm extends Stm {
  public final Term term_;

  public StmTrm(Term p1) { term_ = p1; }

  public <R,A> R accept(com.googlecode.opennars.parser.loan.Loan.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.googlecode.opennars.parser.loan.Loan.Absyn.StmTrm) {
      com.googlecode.opennars.parser.loan.Loan.Absyn.StmTrm x = (com.googlecode.opennars.parser.loan.Loan.Absyn.StmTrm)o;
      return this.term_.equals(x.term_);
    }
    return false;
  }

  public int hashCode() {
    return this.term_.hashCode();
  }


}
