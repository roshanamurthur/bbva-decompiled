package javax.mail.search;

import javax.mail.Message;

/* JADX INFO: loaded from: classes12.dex */
public final class SizeTerm extends IntegerComparisonTerm {
    public SizeTerm(int i10, int i11) {
        super(i10, i11);
    }

    @Override // javax.mail.search.IntegerComparisonTerm, javax.mail.search.ComparisonTerm
    public boolean equals(Object obj) {
        if (obj instanceof SizeTerm) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        try {
            int size = message.getSize();
            if (size == -1) {
                return false;
            }
            return super.match(size);
        } catch (Exception unused) {
            return false;
        }
    }
}
