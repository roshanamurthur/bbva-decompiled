package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class setNavigationContentDescription extends setFindListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f60156k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f60157l = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f60158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f60159j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setNavigationContentDescription(@NotNull PinViewportDp pinViewportDp, int i10, int i11) {
        super(pinViewportDp);
        Intrinsics.checkNotNullParameter(pinViewportDp, "");
        this.f60158i = i10;
        this.f60159j = i11;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        setNavigationContentDescription setnavigationcontentdescription = (setNavigationContentDescription) objArr[0];
        System.identityHashCode(setnavigationcontentdescription);
        System.identityHashCode(setnavigationcontentdescription);
        int i13 = setnavigationcontentdescription.f60159j;
        int i14 = f60156k + 17;
        f60157l = i14 % 128;
        if (i14 % 2 != 0) {
            return Integer.valueOf(i13);
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.setFindListener
    public final int setOnFocusChangeListener() {
        return ((Integer) setX(new Object[]{this}, 203000480, -203000480, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setFindListener
    public boolean setX(@NotNull byte[] bArr) {
        int i10 = f60157l;
        int i11 = i10 & 123;
        int i12 = (i10 ^ 123) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f60156k = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        int i15 = this.f60159j;
        int i16 = this.f60158i;
        if (i16 == -1) {
            int i17 = f60157l;
            int i18 = i17 & 65;
            int i19 = ((i17 | 65) & (~i18)) + (i18 << 1);
            int i20 = i19 % 128;
            f60156k = i20;
            if (i19 % 2 != 0) {
                throw null;
            }
            if (i15 == -1) {
                int i21 = ((i20 & 17) - (~(-(-(i20 | 17))))) - 1;
                f60157l = i21 % 128;
                int i22 = i21 % 2;
                return true;
            }
        }
        if (bArr.length >= i16) {
            int i23 = f60156k;
            int i24 = i23 & 105;
            int i25 = (((i23 | 105) & (~i24)) - (~(i24 << 1))) - 1;
            int i26 = i25 % 128;
            f60157l = i26;
            int i27 = i25 % 2;
            if (bArr.length <= i15) {
                int i28 = ((-1) << 1) - (((i26 & 16) + (i26 | 16)) ^ (-1));
                f60156k = i28 % 128;
                int i29 = i28 % 2;
                int i30 = i26 + 35;
                f60156k = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 55 / 0;
                }
                return true;
            }
        }
        int i32 = f60157l;
        int i33 = i32 & 75;
        int i34 = i33 + ((i32 ^ 75) | i33);
        f60156k = i34 % 128;
        if (i34 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
