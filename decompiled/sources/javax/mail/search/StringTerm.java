package javax.mail.search;

/* JADX INFO: loaded from: classes12.dex */
public abstract class StringTerm extends SearchTerm {
    protected boolean ignoreCase;
    protected String pattern;

    public StringTerm(String str) {
        this.pattern = str;
        this.ignoreCase = true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StringTerm)) {
            return false;
        }
        StringTerm stringTerm = (StringTerm) obj;
        if (this.ignoreCase) {
            return stringTerm.pattern.equalsIgnoreCase(this.pattern) && stringTerm.ignoreCase == this.ignoreCase;
        }
        return stringTerm.pattern.equals(this.pattern) && stringTerm.ignoreCase == this.ignoreCase;
    }

    public boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    public String getPattern() {
        return this.pattern;
    }

    public int hashCode() {
        return this.ignoreCase ? this.pattern.hashCode() : ~this.pattern.hashCode();
    }

    public boolean match(String str) {
        int length = str.length() - this.pattern.length();
        for (int i10 = 0; i10 <= length; i10++) {
            boolean z10 = this.ignoreCase;
            String str2 = this.pattern;
            if (str.regionMatches(z10, i10, str2, 0, str2.length())) {
                return true;
            }
        }
        return false;
    }

    public StringTerm(String str, boolean z10) {
        this.pattern = str;
        this.ignoreCase = z10;
    }
}
