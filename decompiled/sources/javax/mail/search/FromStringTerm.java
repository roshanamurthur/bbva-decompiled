package javax.mail.search;

import javax.mail.Address;
import javax.mail.Message;

/* JADX INFO: loaded from: classes12.dex */
public final class FromStringTerm extends AddressStringTerm {
    public FromStringTerm(String str) {
        super(str);
    }

    @Override // javax.mail.search.AddressStringTerm, javax.mail.search.StringTerm
    public boolean equals(Object obj) {
        if (obj instanceof FromStringTerm) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        try {
            Address[] from = message.getFrom();
            if (from == null) {
                return false;
            }
            for (Address address : from) {
                if (super.match(address)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
