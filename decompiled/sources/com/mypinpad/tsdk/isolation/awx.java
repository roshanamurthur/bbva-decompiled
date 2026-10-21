package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class awx extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54066s0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final aww f54067r0;

    public awx(boolean z10, aww awwVar) {
        super(z10);
        this.f54067r0 = awwVar;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        awx awxVar = (awx) objArr[0];
        int i13 = f54066s0 + 86;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        aww awwVar = awxVar.f54067r0;
        int i17 = i15 & 107;
        int i18 = (i17 - (~((i15 ^ 107) | i17))) - 1;
        f54066s0 = i18 % 128;
        int i19 = i18 % 2;
        return awwVar;
    }

    public final aww setY() {
        return (aww) setCompoundDrawableTintBlendMode(new Object[]{this}, 1369349888, -1369349888, System.identityHashCode(this));
    }
}
