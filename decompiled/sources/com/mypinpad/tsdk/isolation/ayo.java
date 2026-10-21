package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class ayo extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54161s0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ayr f54162r0;

    public ayo(boolean z10, ayr ayrVar) {
        super(z10);
        this.f54162r0 = ayrVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        ayo ayoVar = (ayo) objArr[0];
        int i13 = f54161s0;
        int i14 = (((i13 ^ 105) | (i13 & 105)) << 1) - (((~i13) & 105) | (i13 & (-106)));
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        ayr ayrVar = ayoVar.f54162r0;
        int i17 = (i15 ^ 7) + ((i15 & 7) << 1);
        f54161s0 = i17 % 128;
        int i18 = i17 % 2;
        return ayrVar;
    }

    public final ayr setOnFocusChangeListener() {
        return (ayr) setX(new Object[]{this}, 1380375734, -1380375734, System.identityHashCode(this));
    }
}
