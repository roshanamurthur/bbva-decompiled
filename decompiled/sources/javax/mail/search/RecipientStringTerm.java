package javax.mail.search;

import javax.mail.Address;
import javax.mail.Message;

/* JADX INFO: loaded from: classes12.dex */
public final class RecipientStringTerm extends AddressStringTerm {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Message.RecipientType f79046p0;

    public RecipientStringTerm(Message.RecipientType recipientType, String str) {
        super(str);
        this.f79046p0 = recipientType;
    }

    @Override // javax.mail.search.AddressStringTerm, javax.mail.search.StringTerm
    public boolean equals(Object obj) {
        return (obj instanceof RecipientStringTerm) && ((RecipientStringTerm) obj).f79046p0.equals(this.f79046p0) && super.equals(obj);
    }

    public Message.RecipientType getRecipientType() {
        return this.f79046p0;
    }

    @Override // javax.mail.search.StringTerm
    public int hashCode() {
        return this.f79046p0.hashCode() + super.hashCode();
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        try {
            Address[] recipients = message.getRecipients(this.f79046p0);
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
