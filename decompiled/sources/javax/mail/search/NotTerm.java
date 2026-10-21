package javax.mail.search;

import javax.mail.Message;

/* JADX INFO: loaded from: classes12.dex */
public final class NotTerm extends SearchTerm {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SearchTerm f79044p0;

    public NotTerm(SearchTerm searchTerm) {
        this.f79044p0 = searchTerm;
    }

    public boolean equals(Object obj) {
        if (obj instanceof NotTerm) {
            return ((NotTerm) obj).f79044p0.equals(this.f79044p0);
        }
        return false;
    }

    public SearchTerm getTerm() {
        return this.f79044p0;
    }

    public int hashCode() {
        return this.f79044p0.hashCode() << 1;
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        return !this.f79044p0.match(message);
    }
}
