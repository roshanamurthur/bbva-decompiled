package ri;

import java.util.NoSuchElementException;
import java.util.Vector;

/* JADX INFO: compiled from: MimeTypeFile.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f93096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f93097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Vector f93098d;

    public final boolean a() {
        if (this.f93098d.size() > 0) {
            return true;
        }
        while (true) {
            int i10 = this.f93095a;
            if (i10 >= this.f93096b || !Character.isWhitespace(this.f93097c.charAt(i10))) {
                break;
            }
            this.f93095a++;
        }
        return this.f93095a < this.f93096b;
    }

    public final String b() {
        Vector vector = this.f93098d;
        int size = vector.size();
        if (size > 0) {
            int i10 = size - 1;
            String str = (String) vector.elementAt(i10);
            vector.removeElementAt(i10);
            return str;
        }
        while (true) {
            int i11 = this.f93095a;
            if (i11 >= this.f93096b || !Character.isWhitespace(this.f93097c.charAt(i11))) {
                break;
            }
            this.f93095a++;
        }
        int i12 = this.f93095a;
        int i13 = this.f93096b;
        if (i12 >= i13) {
            throw new NoSuchElementException();
        }
        String str2 = this.f93097c;
        char cCharAt = str2.charAt(i12);
        if (cCharAt == '\"') {
            this.f93095a++;
            boolean z10 = false;
            while (true) {
                int i14 = this.f93095a;
                if (i14 >= i13) {
                    break;
                }
                this.f93095a = i14 + 1;
                char cCharAt2 = str2.charAt(i14);
                if (cCharAt2 == '\\') {
                    this.f93095a++;
                    z10 = true;
                } else if (cCharAt2 == '\"') {
                    if (!z10) {
                        return str2.substring(i12 + 1, this.f93095a - 1);
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i15 = i12 + 1; i15 < this.f93095a - 1; i15++) {
                        char cCharAt3 = str2.charAt(i15);
                        if (cCharAt3 != '\\') {
                            stringBuffer.append(cCharAt3);
                        }
                    }
                    return stringBuffer.toString();
                }
            }
        } else if ("=".indexOf(cCharAt) >= 0) {
            this.f93095a++;
        } else {
            while (true) {
                int i16 = this.f93095a;
                if (i16 >= i13 || "=".indexOf(str2.charAt(i16)) >= 0 || Character.isWhitespace(str2.charAt(this.f93095a))) {
                    break;
                }
                this.f93095a++;
            }
        }
        return str2.substring(i12, this.f93095a);
    }
}
