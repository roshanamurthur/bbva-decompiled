package h3;

import java.util.Arrays;

/* JADX INFO: compiled from: VelocityTracker1D.java */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f69333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f69334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f69335c;

    public p(int i10) {
        if (i10 != 1) {
            long[] jArr = new long[20];
            this.f69334b = jArr;
            this.f69335c = new float[20];
            this.f69333a = 0;
            Arrays.fill(jArr, Long.MIN_VALUE);
        }
    }
}
