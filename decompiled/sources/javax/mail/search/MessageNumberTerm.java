package javax.mail.search;

import javax.mail.Message;

/* JADX INFO: loaded from: classes12.dex */
public final class MessageNumberTerm extends IntegerComparisonTerm {
    public MessageNumberTerm(int i10) {
        super(3, i10);
    }

    @Override // javax.mail.search.IntegerComparisonTerm, javax.mail.search.ComparisonTerm
    public boolean equals(Object obj) {
        if (obj instanceof MessageNumberTerm) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        try {
            return super.match(message.getMessageNumber());
        } catch (Exception unused) {
            return false;
        }
    }
}
