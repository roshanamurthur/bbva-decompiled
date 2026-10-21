package br.com.opencs.bincodec.random;

/* JADX INFO: loaded from: classes2.dex */
public class RandomSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f25278a;

    public RandomSource(long j10) {
        this.f25278a = j10 & 2147483647L;
    }

    public int next() {
        long j10 = ((this.f25278a * 1103515245) + 12345) & 2147483647L;
        this.f25278a = j10;
        return (int) j10;
    }
}
