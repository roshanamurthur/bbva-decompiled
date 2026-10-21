package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class aww implements awd {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54064q0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f54065p0;
    public static final aww setY = new aww("kyber512");
    public static final aww setDividerPadding = new aww("kyber768");
    public static final aww setX = new aww("kyber1024");
    public static final aww setOnFocusChangeListener = new aww("kyber512-aes");
    public static final aww setCompoundDrawableTintBlendMode = new aww("kyber768-aes");
    public static final aww setLayoutAnimation = new aww("kyber1024-aes");

    public aww(String str) {
        this.f54065p0 = str;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        aww awwVar = (aww) objArr[0];
        int i13 = f54064q0;
        int i14 = i13 & 87;
        int i15 = (i14 - (~((i13 ^ 87) | i14))) - 1;
        int i16 = i15 % 128;
        int i17 = i15 % 2;
        String str = awwVar.f54065p0;
        if (i17 != 0) {
            throw null;
        }
        int i18 = i16 & 63;
        int i19 = (((i16 ^ 63) | i18) << 1) - ((i16 | 63) & (~i18));
        f54064q0 = i19 % 128;
        if (i19 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String setCompoundDrawableTintBlendMode() {
        return (String) setY(new Object[]{this}, -909497264, 909497264, System.identityHashCode(this));
    }
}
