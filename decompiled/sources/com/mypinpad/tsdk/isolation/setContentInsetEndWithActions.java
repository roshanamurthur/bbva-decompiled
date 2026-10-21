package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setContentInsetEndWithActions extends setCompoundDrawableTintMode {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59578d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59579e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f59580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setMinimumHeight f59581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final byte[] f59582c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setContentInsetEndWithActions(@NotNull byte[] bArr, @NotNull setMinimumHeight setminimumheight, @NotNull byte[] bArr2) {
        super(null);
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(setminimumheight, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.f59580a = bArr;
        this.f59581b = setminimumheight;
        this.f59582c = bArr2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (~(i13 | i14)) | (~(i14 | i12));
        int i16 = ~i12;
        int i17 = i16 | i10;
        int i18 = ((~i17) * 886) + ((i10 | (~(i11 | i16))) * (-1772)) + ((i15 | (~(i17 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773);
        if (i18 == 1) {
            setContentInsetEndWithActions setcontentinsetendwithactions = (setContentInsetEndWithActions) objArr[0];
            int i19 = f59578d;
            int i20 = (i19 ^ 96) + ((i19 & 96) << 1);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f59579e = i21 % 128;
            int i22 = i21 % 2;
            byte[] bArr2 = setcontentinsetendwithactions.f59580a;
            int i23 = (((i19 | 60) << 1) - (i19 ^ 60)) - 1;
            f59579e = i23 % 128;
            int i24 = i23 % 2;
            return bArr2;
        }
        if (i18 == 2) {
            setContentInsetEndWithActions setcontentinsetendwithactions2 = (setContentInsetEndWithActions) objArr[0];
            int i25 = f59578d + 94;
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            int i27 = i26 % 128;
            f59579e = i27;
            int i28 = i26 % 2;
            setMinimumHeight setminimumheight = setcontentinsetendwithactions2.f59581b;
            int i29 = (i27 ^ 55) + ((i27 & 55) << 1);
            f59578d = i29 % 128;
            if (i29 % 2 == 0) {
                return setminimumheight;
            }
            throw null;
        }
        setContentInsetEndWithActions setcontentinsetendwithactions3 = (setContentInsetEndWithActions) objArr[0];
        int i30 = f59579e + 53;
        f59578d = i30 % 128;
        if (i30 % 2 != 0) {
            bArr = setcontentinsetendwithactions3.f59582c;
            int i31 = 87 / 0;
        } else {
            bArr = setcontentinsetendwithactions3.f59582c;
        }
        int iIdentityHashCode = System.identityHashCode(setcontentinsetendwithactions3);
        int i32 = 1442708896 ^ iIdentityHashCode;
        int i33 = 1442708896 & iIdentityHashCode;
        int i34 = ~((i33 & i32) | (i32 ^ i33));
        int i35 = ((i34 & 826328308) | (826328308 ^ i34)) * (-948);
        int i36 = 1812684922 ^ i35;
        int i37 = ((i35 & 1812684922) | i36) << 1;
        int i38 = -i36;
        int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
        int i40 = ~iIdentityHashCode;
        int i41 = 1979579892 ^ i40;
        int i42 = i40 & 1979579892;
        int i43 = -(-((~((i42 & i41) | (i41 ^ i42))) * (-948)));
        int i44 = (i39 ^ i43) + ((i43 & i39) << 1) + 2147403068;
        int iIdentityHashCode2 = System.identityHashCode(setcontentinsetendwithactions3);
        int i45 = ~iIdentityHashCode2;
        int i46 = (-1890874301) & i45;
        int i47 = (iIdentityHashCode2 & 1890874300) | i46 | ((-1890874301) & iIdentityHashCode2);
        int i48 = ~i47;
        int i49 = (i47 | i48) & i48;
        int i50 = (i45 ^ (-1427090390)) | (i45 & (-1427090390));
        int i51 = ~((i50 & 1890874300) | (i50 ^ 1890874300));
        int i52 = ((i49 & i51) | (i49 ^ i51)) * (-406);
        int i53 = ((-1062282894) & i52) + (i52 | (-1062282894));
        int i54 = ((-1890874301) | i45) & (~i46);
        int i55 = (i54 & i46) | (i54 ^ i46);
        int i56 = (i55 & 1427090389) | ((~i55) & (-1427090390));
        int i57 = i55 & (-1427090390);
        int i58 = (~((i57 & i56) | (i56 ^ i57))) * (-406);
        int i59 = ((~i58) & i53) | ((~i53) & i58);
        int i60 = -(-((i58 & i53) << 1));
        int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
        int i62 = (1427090389 & i45) | (iIdentityHashCode2 & (-1427090390));
        int i63 = iIdentityHashCode2 & 1427090389;
        int i64 = (i63 & i62) | (i62 ^ i63);
        int i65 = ~i64;
        int i66 = (i64 | i65) & i65;
        int i67 = ~((i45 & 1890874300) | (i45 ^ 1890874300));
        int i68 = -(-(((i66 & i67) | (i66 ^ i67)) * 406));
        int i69 = (i61 | i68) << 1;
        int i70 = -(i68 ^ i61);
        if (i44 > (i69 & i70) + (i70 | i69)) {
            return bArr;
        }
        throw null;
    }

    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, 1043956272, -1043956271, System.identityHashCode(this));
    }

    @NotNull
    public final setMinimumHeight setOnFocusChangeListener() {
        return (setMinimumHeight) setX(new Object[]{this}, -1575246717, 1575246719, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, 180111564, -180111564, System.identityHashCode(this));
    }
}
