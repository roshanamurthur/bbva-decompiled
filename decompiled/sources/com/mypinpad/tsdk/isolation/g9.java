package com.mypinpad.tsdk.isolation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class g9 extends Lambda implements Function1<getBeepOnFailure, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g9 f55644p0 = new g9();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55645q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55646r0 = 1;

    static {
        int i10 = f55646r0;
        int i11 = ((i10 | 77) << 1) - (i10 ^ 77);
        f55645q0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public g9() {
        super(1);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:16:0x00e6  */
    public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ~(i13 | i10);
        int i15 = ~((~i10) | i11);
        int i16 = (((~(i10 | (~i11))) | i15 | i14) * 764) + (((~(i13 | i11)) | i15) * (-1528)) + ((i11 | i14) * 764) + (i11 * (-1527)) + (i10 * 765);
        boolean z10 = false;
        if (i16 != 1) {
            Object obj = objArr[1];
            int i17 = f55645q0;
            int i18 = ((i17 & 5) - (~(-(-(i17 | 5))))) - 1;
            f55646r0 = i18 % 128;
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) obj;
            Object[] objArr2 = new Object[1];
            if (i18 % 2 != 0) {
                objArr2[0] = getbeeponfailure;
                return a(objArr2, 1260564205, -1260564204, (int) System.currentTimeMillis());
            }
            objArr2[0] = getbeeponfailure;
            int i19 = 30 / 0;
            return a(objArr2, 1260564205, -1260564204, (int) System.currentTimeMillis());
        }
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[0];
        int i20 = f55645q0;
        int i21 = (i20 ^ 75) + ((i20 & 75) << 1);
        f55646r0 = i21 % 128;
        if (i21 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getbeeponfailure2, "");
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
            if (((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer))).length() == 98) {
                int i22 = f55646r0;
                int i23 = i22 & 75;
                int i24 = (i22 ^ 75) | i23;
                int i25 = (i23 & i24) + (i24 | i23);
                f55645q0 = i25 % 128;
                int i26 = i25 % 2;
                z10 = true;
            } else {
                int i27 = f55645q0 + 109;
                f55646r0 = i27 % 128;
                int i28 = i27 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(getbeeponfailure2, "");
            setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
            if (((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2))).length() == 6) {
                int i29 = f55646r0;
                int i210 = i29 & 75;
                int i211 = (i29 ^ 75) | i210;
                int i212 = (i210 & i211) + (i211 | i210);
                f55645q0 = i212 % 128;
                int i213 = i212 % 2;
                z10 = true;
            } else {
                int i214 = f55645q0 + 109;
                f55646r0 = i214 % 128;
                int i215 = i214 % 2;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i30 = f55645q0;
        int i31 = i30 & 115;
        int i32 = (i31 - (~((i30 ^ 115) | i31))) - 1;
        f55646r0 = i32 % 128;
        if (i32 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(getBeepOnFailure getbeeponfailure) {
        return a(new Object[]{this, getbeeponfailure}, -161781946, 161781946, System.identityHashCode(this));
    }
}
