package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class awu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54057a;
    public static final awu setY = new awu("dilithium2");
    public static final awu setCompoundDrawableTintBlendMode = new awu("dilithium2-aes");
    public static final awu setDividerPadding = new awu("dilithium3");
    public static final awu setOnFocusChangeListener = new awu("dilithium3-aes");
    public static final awu setX = new awu("dilithium5");
    public static final awu setNavigationOnClickListener = new awu("dilithium5-aes");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f54056b = 52;

    public awu(String str) {
        this.f54057a = str;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        awu awuVar = (awu) objArr[0];
        int i13 = f54056b;
        int i14 = i13 & 97;
        int i15 = -(-((i13 ^ 97) | i14));
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = i16 % 128;
        if (i16 % 2 == 0) {
            String str = awuVar.f54057a;
            throw null;
        }
        String str2 = awuVar.f54057a;
        System.identityHashCode(awuVar);
        System.identityHashCode(awuVar);
        return str2;
    }

    public final String setCompoundDrawableTintBlendMode() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1611557984, -1611557984, System.identityHashCode(this));
    }
}
