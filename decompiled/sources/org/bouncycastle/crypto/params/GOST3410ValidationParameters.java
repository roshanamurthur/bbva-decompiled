package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class GOST3410ValidationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f89306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f89307d;

    public GOST3410ValidationParameters(int i10, int i11) {
        this.f89304a = i10;
        this.f89305b = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f89305b == this.f89305b && gOST3410ValidationParameters.f89304a == this.f89304a && gOST3410ValidationParameters.f89307d == this.f89307d && gOST3410ValidationParameters.f89306c == this.f89306c;
    }

    public int getC() {
        return this.f89305b;
    }

    public long getCL() {
        return this.f89307d;
    }

    public int getX0() {
        return this.f89304a;
    }

    public long getX0L() {
        return this.f89306c;
    }

    public int hashCode() {
        int i10 = this.f89304a ^ this.f89305b;
        long j10 = this.f89306c;
        int i11 = (i10 ^ ((int) j10)) ^ ((int) (j10 >> 32));
        long j11 = this.f89307d;
        return (i11 ^ ((int) j11)) ^ ((int) (j11 >> 32));
    }

    public GOST3410ValidationParameters(long j10, long j11) {
        this.f89306c = j10;
        this.f89307d = j11;
    }
}
