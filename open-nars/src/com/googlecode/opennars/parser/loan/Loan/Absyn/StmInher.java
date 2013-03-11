package com.googlecode.opennars.parser.loan.Loan.Absyn; // Java Package generated by the BNF Converter.

public class StmInher extends Stm {
  public final Term term_1, term_2;

  public StmInher(Term p1, Term p2) { term_1 = p1; term_2 = p2; }

  public <R,A> R accept(com.googlecode.opennars.parser.loan.Loan.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.googlecode.opennars.parser.loan.Loan.Absyn.StmInher) {
      com.googlecode.opennars.parser.loan.Loan.Absyn.StmInher x = (com.googlecode.opennars.parser.loan.Loan.Absyn.StmInher)o;
      return this.term_1.equals(x.term_1) && this.term_2.equals(x.term_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.term_1.hashCode())+this.term_2.hashCode();
  }


}