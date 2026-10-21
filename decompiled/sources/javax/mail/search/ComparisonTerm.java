package javax.mail.search;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ComparisonTerm extends SearchTerm {
    public static final int EQ = 3;
    public static final int GE = 6;
    public static final int GT = 5;
    public static final int LE = 1;
    public static final int LT = 2;
    public static final int NE = 4;
    protected int comparison;

    public boolean equals(Object obj) {
        return (obj instanceof ComparisonTerm) && ((ComparisonTerm) obj).comparison == this.comparison;
    }

    public int hashCode() {
        return this.comparison;
    }
}
