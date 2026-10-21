package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class initialisedefault {

    public static final class setX implements getDetailsFieldTextSizeSp {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f56501b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f56502c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f56503a;

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            setX setx = (setX) objArr[0];
            int i13 = f56501b;
            int i14 = i13 & 93;
            int i15 = -(-((i13 ^ 93) | i14));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            f56502c = i16 % 128;
            int i17 = i16 % 2;
            String strValueOf = String.valueOf(setx.f56503a);
            int i18 = f56502c;
            int i19 = (i18 ^ 117) + ((i18 & 117) << 1);
            f56501b = i19 % 128;
            int i20 = i19 % 2;
            return strValueOf;
        }

        @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
        @NotNull
        public final String setCompoundDrawableTintBlendMode() {
            return (String) setY(new Object[]{this}, 1907892580, -1907892580, System.identityHashCode(this));
        }
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        setX setx = new setX();
        setx.f56503a = zBooleanValue;
        return setx;
    }

    @NotNull
    public static final getDetailsFieldTextSizeSp setCompoundDrawableTintBlendMode(boolean z10) {
        return (getDetailsFieldTextSizeSp) setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(z10)}, -772901588, 772901588, (int) System.currentTimeMillis());
    }
}
