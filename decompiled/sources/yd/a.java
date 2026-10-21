package yd;

/* JADX INFO: compiled from: AutoValue_EventStoreConfig.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f94766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f94767f;

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f94763b = j10;
        this.f94764c = i10;
        this.f94765d = i11;
        this.f94766e = j11;
        this.f94767f = i12;
    }

    @Override // yd.c
    public final int a() {
        return this.f94765d;
    }

    @Override // yd.c
    public final long b() {
        return this.f94766e;
    }

    @Override // yd.c
    public final int c() {
        return this.f94764c;
    }

    @Override // yd.c
    public final int d() {
        return this.f94767f;
    }

    @Override // yd.c
    public final long e() {
        return this.f94763b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f94763b == cVar.e() && this.f94764c == cVar.c() && this.f94765d == cVar.a() && this.f94766e == cVar.b() && this.f94767f == cVar.d();
    }

    public final int hashCode() {
        long j10 = this.f94763b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f94764c) * 1000003) ^ this.f94765d) * 1000003;
        long j11 = this.f94766e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f94767f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f94763b);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f94764c);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f94765d);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f94766e);
        sb2.append(", maxBlobByteSizePerRow=");
        return androidx.appcompat.widget.a.c(sb2, this.f94767f, "}");
    }
}
