package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class t6 extends Lambda implements Function1<dc, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final t6 f60984p0 = new t6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f60985q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f60986r0 = 1;

    static {
        int i10 = f60986r0;
        int i11 = i10 ^ 89;
        int i12 = ((i10 & 89) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 & i13) + (i12 | i13);
        f60985q0 = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 11 / 0;
        }
    }

    public t6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~i11;
        int i17 = i13 | i16;
        if ((((~(i10 | i16 | i12)) | (~(i11 | i13 | i12)) | (~(i17 | i14))) * 867) + (((~i17) | (~(i13 | i12)) | (~(i16 | i12))) * (-1734)) + ((i15 | (~(i16 | i14))) * (-867)) + (i11 * 868) + (i10 * 868) == 1) {
            t6 t6Var = (t6) objArr[0];
            Object obj = objArr[1];
            int i18 = f60985q0;
            int i19 = (i18 & 29) + (i18 | 29);
            f60986r0 = i19 % 128;
            dc dcVar = (dc) obj;
            if (i19 % 2 == 0) {
                a(new Object[]{t6Var, dcVar}, 1752753135, -1752753135, System.identityHashCode(t6Var));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a(new Object[]{t6Var, dcVar}, 1752753135, -1752753135, System.identityHashCode(t6Var));
            Unit unit2 = Unit.INSTANCE;
            int i20 = f60986r0;
            int i21 = (i20 & (-26)) | ((~i20) & 25);
            int i22 = -(-((i20 & 25) << 1));
            int i23 = (i21 & i22) + (i22 | i21);
            f60985q0 = i23 % 128;
            int i24 = i23 % 2;
            return unit2;
        }
        t6 t6Var2 = (t6) objArr[0];
        dc dcVar2 = (dc) objArr[1];
        int iIdentityHashCode = System.identityHashCode(t6Var2);
        int i25 = ~iIdentityHashCode;
        int i26 = (i25 | iIdentityHashCode) & i25;
        int i27 = (-1795900284) ^ i26;
        int i28 = i26 & (-1795900284);
        int i29 = ~((i28 & i27) | (i27 ^ i28));
        int i30 = ((-754440964) ^ iIdentityHashCode) | ((-754440964) & iIdentityHashCode);
        int i31 = ~i30;
        int i32 = (i30 | i31) & i31;
        int i33 = ((~i32) & i29) | ((~i29) & i32);
        int i34 = i29 & i32;
        int i35 = ((i34 & i33) | (i33 ^ i34)) * 333;
        int i36 = (-2113618287) & i35;
        int i37 = (((i35 | (-2113618287)) & (~i36)) - (~(i36 << 1))) - 1;
        int i38 = ((-1795900284) & i25) | (1795900283 & iIdentityHashCode);
        int i39 = iIdentityHashCode & (-1795900284);
        int i40 = ~((i39 & i38) | (i38 ^ i39));
        int i41 = i25 & (-754440964);
        int i42 = (i25 | (-754440964)) & (~i41);
        int i43 = ~((i42 & i41) | (i42 ^ i41));
        int i44 = -(~(((i40 & i43) | (i40 ^ i43)) * 333));
        int i45 = ((i37 & i44) + (i44 | i37)) - 1;
        int iIdentityHashCode2 = System.identityHashCode(t6Var2);
        int i46 = ~iIdentityHashCode2;
        int i47 = (-1570745424) & i46;
        int i48 = (~i47) & ((-1570745424) | i46);
        int i49 = ~((i48 & i47) | (i48 ^ i47));
        int i50 = (-1906826079) & iIdentityHashCode2;
        int i51 = ~(((-1906826079) ^ iIdentityHashCode2) | i50);
        int i52 = i49 & i51;
        int i53 = (((i49 | i51) & (~i52)) | i52) * 1150;
        int i54 = ((((1033751066 ^ i53) | (1033751066 & i53)) << 1) - (~(-((i53 & (-1033751067)) | (1033751066 & (~i53)))))) - 1;
        int i55 = (-1906826079) & i46;
        int i56 = (iIdentityHashCode2 & 1906826078) | i55;
        int i57 = ~((i56 & i50) | (i56 ^ i50));
        int i58 = ~(i55 | ((~i46) & 1906826078) | (1906826078 & i46));
        int i59 = i57 ^ i58;
        int i60 = i58 & i57;
        int i61 = (i54 - (~(((i60 & i59) | (i59 ^ i60)) * (-575)))) - 1;
        int i62 = i47 | (iIdentityHashCode2 & 1570745423);
        int i63 = (-1570745424) & iIdentityHashCode2;
        int i64 = ~((i62 & i63) | (i62 ^ i63));
        int i65 = (iIdentityHashCode2 | i46) & i46;
        int i66 = (i65 & (-1570745424)) | ((~i65) & 1570745423);
        int i67 = i65 & 1570745423;
        int i68 = ~((i67 & i66) | (i66 ^ i67));
        int i69 = ((~i68) & i64) | ((~i64) & i68);
        int i70 = i68 & i64;
        int i71 = ((i70 & i69) | (i69 ^ i70)) * 575;
        int i72 = i61 & i71;
        int i73 = -(-((i71 ^ i61) | i72));
        if (i45 > (i72 ^ i73) + ((i73 & i72) << 1)) {
            Intrinsics.checkNotNullParameter(dcVar2, "");
            dc.setDividerPadding(new Object[]{dcVar2}, -1087540522, 1087540523, System.identityHashCode(dcVar2));
            return null;
        }
        Intrinsics.checkNotNullParameter(dcVar2, "");
        dc.setDividerPadding(new Object[]{dcVar2}, -1087540522, 1087540523, System.identityHashCode(dcVar2));
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(dc dcVar) {
        return a(new Object[]{this, dcVar}, 467200632, -467200631, System.identityHashCode(this));
    }
}
