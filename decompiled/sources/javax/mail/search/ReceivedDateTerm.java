package javax.mail.search;

import java.util.Date;
import javax.mail.Message;

/* JADX INFO: loaded from: classes12.dex */
public final class ReceivedDateTerm extends DateTerm {
    public ReceivedDateTerm(int i10, Date date) {
        super(i10, date);
    }

    @Override // javax.mail.search.DateTerm, javax.mail.search.ComparisonTerm
    public boolean equals(Object obj) {
        if (obj instanceof ReceivedDateTerm) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        try {
            Date receivedDate = message.getReceivedDate();
            if (receivedDate == null) {
                return false;
            }
            return super.match(receivedDate);
        } catch (Exception unused) {
            return false;
        }
    }
}
