package javax.mail.search;

import javax.mail.Address;
import javax.mail.internet.InternetAddress;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AddressStringTerm extends StringTerm {
    public AddressStringTerm(String str) {
        super(str, true);
    }

    @Override // javax.mail.search.StringTerm
    public boolean equals(Object obj) {
        if (obj instanceof AddressStringTerm) {
            return super.equals(obj);
        }
        return false;
    }

    public boolean match(Address address) {
        return address instanceof InternetAddress ? super.match(((InternetAddress) address).toUnicodeString()) : super.match(address.toString());
    }
}
