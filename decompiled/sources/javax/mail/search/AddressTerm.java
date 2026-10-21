package javax.mail.search;

import javax.mail.Address;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AddressTerm extends SearchTerm {
    protected Address address;

    public AddressTerm(Address address) {
        this.address = address;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AddressTerm) {
            return ((AddressTerm) obj).address.equals(this.address);
        }
        return false;
    }

    public Address getAddress() {
        return this.address;
    }

    public int hashCode() {
        return this.address.hashCode();
    }

    public boolean match(Address address) {
        return address.equals(this.address);
    }
}
