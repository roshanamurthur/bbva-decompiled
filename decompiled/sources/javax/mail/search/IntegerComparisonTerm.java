package javax.mail.search;

/* JADX INFO: loaded from: classes12.dex */
public abstract class IntegerComparisonTerm extends ComparisonTerm {
    protected int number;

    public IntegerComparisonTerm(int i10, int i11) {
        this.comparison = i10;
        this.number = i11;
    }

    @Override // javax.mail.search.ComparisonTerm
    public boolean equals(Object obj) {
        return (obj instanceof IntegerComparisonTerm) && ((IntegerComparisonTerm) obj).number == this.number && super.equals(obj);
    }

    public int getComparison() {
        return this.comparison;
    }

    public int getNumber() {
        return this.number;
    }

    @Override // javax.mail.search.ComparisonTerm
    public int hashCode() {
        return this.number + super.hashCode();
    }

    public boolean match(int i10) {
        switch (this.comparison) {
            case 1:
                return i10 <= this.number;
            case 2:
                return i10 < this.number;
            case 3:
                return i10 == this.number;
            case 4:
                return i10 != this.number;
            case 5:
                return i10 > this.number;
            case 6:
                return i10 >= this.number;
            default:
                return false;
        }
    }
}
