package javax.mail.search;

import javax.mail.Message;

/* JADX INFO: loaded from: classes12.dex */
public final class AndTerm extends SearchTerm {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SearchTerm[] f79040p0;

    public AndTerm(SearchTerm searchTerm, SearchTerm searchTerm2) {
        this.f79040p0 = new SearchTerm[]{searchTerm, searchTerm2};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AndTerm)) {
            return false;
        }
        AndTerm andTerm = (AndTerm) obj;
        int length = andTerm.f79040p0.length;
        SearchTerm[] searchTermArr = this.f79040p0;
        if (length != searchTermArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < searchTermArr.length; i10++) {
            if (!searchTermArr[i10].equals(andTerm.f79040p0[i10])) {
                return false;
            }
        }
        return true;
    }

    public SearchTerm[] getTerms() {
        return (SearchTerm[]) this.f79040p0.clone();
    }

    public int hashCode() {
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            SearchTerm[] searchTermArr = this.f79040p0;
            if (i10 >= searchTermArr.length) {
                return iHashCode;
            }
            iHashCode += searchTermArr[i10].hashCode();
            i10++;
        }
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        int i10 = 0;
        while (true) {
            SearchTerm[] searchTermArr = this.f79040p0;
            if (i10 >= searchTermArr.length) {
                return true;
            }
            if (!searchTermArr[i10].match(message)) {
                return false;
            }
            i10++;
        }
    }

    public AndTerm(SearchTerm[] searchTermArr) {
        this.f79040p0 = new SearchTerm[searchTermArr.length];
        for (int i10 = 0; i10 < searchTermArr.length; i10++) {
            this.f79040p0[i10] = searchTermArr[i10];
        }
    }
}
