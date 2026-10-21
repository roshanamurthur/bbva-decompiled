package javax.mail.search;

import javax.mail.Address;
import javax.mail.Message;

/* JADX INFO: loaded from: classes12.dex */
public final class RecipientTerm extends AddressTerm {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Message.RecipientType f79047p0;

    public RecipientTerm(Message.RecipientType recipientType, Address address) {
        super(address);
        this.f79047p0 = recipientType;
    }

    @Override // javax.mail.search.AddressTerm
    public boolean equals(Object obj) {
        return (obj instanceof RecipientTerm) && ((RecipientTerm) obj).f79047p0.equals(this.f79047p0) && super.equals(obj);
    }

    public Message.RecipientType getRecipientType() {
        return this.f79047p0;
    }

    @Override // javax.mail.search.AddressTerm
    public int hashCode() {
        return this.f79047p0.hashCode() + super.hashCode();
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        try {
            Address[] recipients = message.getRecipients(this.f79047p0);
            if (recipients == null) {
                return false;
            }
            for (Address address : recipients) {
                if (super.match(address)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
