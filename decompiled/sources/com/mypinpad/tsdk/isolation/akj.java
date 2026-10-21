package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class akj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final amw f53010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final amw f53011b;

    public akj(amw amwVar, amw amwVar2) {
        this.f53010a = amwVar;
        this.f53011b = amwVar2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        return (((~((i10 | i14) | i12)) | ((~(i11 | i13)) | (~(i13 | i17)))) * 168) + (((~(i15 | i12)) * 168) + (((i16 | (~(i14 | i17))) * 168) + ((i11 * (-167)) + (i10 * (-167))))) != 1 ? ((akj) objArr[0]).f53011b : ((akj) objArr[0]).f53010a;
    }

    public final amw setX() {
        return (amw) setDividerPadding(new Object[]{this}, -1749934830, 1749934830, System.identityHashCode(this));
    }

    public final amw setDividerPadding() {
        return (amw) setDividerPadding(new Object[]{this}, 1413033694, -1413033693, System.identityHashCode(this));
    }
}
