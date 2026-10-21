package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56115c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56116d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56118b;

    public h(int i10, int i11) {
        this.f56117a = i10;
        this.f56118b = i11;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-929)) + (i10 * (-464));
        int i14 = ~i10;
        int i15 = i11 | i12;
        if (((i14 | i15) * 465) + ((i11 | (~(i12 | i14))) * 930) + (((~i15) | i14) * (-465)) + i13 == 1) {
            h hVar = (h) objArr[0];
            t tVar = (t) objArr[1];
            KProperty kProperty = (KProperty) objArr[2];
            int i16 = f56116d;
            int i17 = i16 & 123;
            int i18 = (((i16 ^ 123) | i17) << 1) - ((i16 | 123) & (~i17));
            f56115c = i18 % 128;
            int i19 = i18 % 2;
            Intrinsics.checkNotNullParameter(tVar, "");
            Intrinsics.checkNotNullParameter(kProperty, "");
            byte[] bArr = (byte[]) setImageTintList.setX(new Object[]{tVar}, -1317873722, 1317873728, System.identityHashCode(tVar));
            int i20 = hVar.f56117a;
            boolean zBooleanValue = ((Boolean) setInputExtras.setDividerPadding(new Object[]{bArr, Integer.valueOf(i20), Integer.valueOf(hVar.f56118b)}, 837138809, -837138798, i20)).booleanValue();
            int i21 = f56116d;
            int i22 = (i21 ^ 65) + ((i21 & 65) << 1);
            f56115c = i22 % 128;
            if (i22 % 2 == 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            throw null;
        }
        h hVar2 = (h) objArr[0];
        t tVar2 = (t) objArr[1];
        KProperty kProperty2 = (KProperty) objArr[2];
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        int i23 = f56115c;
        int i24 = ((i23 | 1) << 1) - (i23 ^ 1);
        f56116d = i24 % 128;
        if (i24 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tVar2, "");
            Intrinsics.checkNotNullParameter(kProperty2, "");
            byte[] bArr2 = (byte[]) setImageTintList.setX(new Object[]{tVar2}, -1317873722, 1317873728, System.identityHashCode(tVar2));
            int i25 = hVar2.f56117a;
            setInputExtras.setDividerPadding(new Object[]{bArr2, Integer.valueOf(i25), Integer.valueOf(hVar2.f56118b), Boolean.valueOf(zBooleanValue2)}, -91299280, 91299286, i25);
            throw null;
        }
        Intrinsics.checkNotNullParameter(tVar2, "");
        Intrinsics.checkNotNullParameter(kProperty2, "");
        byte[] bArr3 = (byte[]) setImageTintList.setX(new Object[]{tVar2}, -1317873722, 1317873728, System.identityHashCode(tVar2));
        int i26 = hVar2.f56117a;
        setInputExtras.setDividerPadding(new Object[]{bArr3, Integer.valueOf(i26), Integer.valueOf(hVar2.f56118b), Boolean.valueOf(zBooleanValue2)}, -91299280, 91299286, i26);
        int i27 = f56116d;
        int i28 = (i27 & (-8)) | ((~i27) & 7);
        int i29 = -(-((i27 & 7) << 1));
        int i30 = (i28 & i29) + (i29 | i28);
        f56115c = i30 % 128;
        if (i30 % 2 == 0) {
            return null;
        }
        int i31 = 71 / 0;
        return null;
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull t tVar, @NotNull KProperty<?> kProperty) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, tVar, kProperty}, -709183664, 709183665, System.identityHashCode(this))).booleanValue();
    }

    public final void setY(@NotNull t tVar, @NotNull KProperty<?> kProperty, boolean z10) {
        setOnFocusChangeListener(new Object[]{this, tVar, kProperty, Boolean.valueOf(z10)}, 951550455, -951550455, System.identityHashCode(this));
    }
}
