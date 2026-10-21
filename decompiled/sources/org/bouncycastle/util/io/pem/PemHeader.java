package org.bouncycastle.util.io.pem;

/* JADX INFO: loaded from: classes13.dex */
public class PemHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91660b;

    public PemHeader(String str, String str2) {
        this.f91659a = str;
        this.f91660b = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PemHeader)) {
            return false;
        }
        PemHeader pemHeader = (PemHeader) obj;
        if (pemHeader != this) {
            Object obj2 = pemHeader.f91659a;
            String str = this.f91659a;
            if (str != obj2 && (str == null || obj2 == null || !str.equals(obj2))) {
                return false;
            }
            String str2 = this.f91660b;
            String str3 = pemHeader.f91660b;
            if (str2 != str3 && (str2 == null || str3 == null || !str2.equals(str3))) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return this.f91659a;
    }

    public String getValue() {
        return this.f91660b;
    }

    public int hashCode() {
        String str = this.f91659a;
        int iHashCode = str == null ? 1 : str.hashCode();
        String str2 = this.f91660b;
        return ((str2 != null ? str2.hashCode() : 1) * 31) + iHashCode;
    }
}
