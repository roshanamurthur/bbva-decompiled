package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/af;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/af;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class w4 extends Lambda implements Function1<af, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final w4 f61601p0 = new w4();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61602q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61603r0 = 1;

    static {
        int i10 = f61603r0;
        int i11 = i10 & 19;
        int i12 = (i10 | 19) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f61602q0 = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public w4() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        if (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711)) != 1) {
            w4 w4Var = (w4) objArr[0];
            Object obj = objArr[1];
            int i17 = f61602q0;
            int i18 = i17 & 33;
            int i19 = (i17 ^ 33) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            f61603r0 = i20 % 128;
            int i21 = i20 % 2;
            a(new Object[]{w4Var, (af) obj}, -713789956, 713789957, System.identityHashCode(w4Var));
            Unit unit = Unit.INSTANCE;
            int i22 = f61603r0 + 107;
            f61602q0 = i22 % 128;
            if (i22 % 2 == 0) {
                return unit;
            }
            int i23 = 53 / 0;
            return unit;
        }
        w4 w4Var2 = (w4) objArr[0];
        af afVar = (af) objArr[1];
        int i24 = f61602q0;
        int i25 = i24 & 101;
        int i26 = i25 + ((i24 ^ 101) | i25);
        f61603r0 = i26 % 128;
        int i27 = i26 % 2;
        Intrinsics.checkNotNullParameter(afVar, "");
        af.setDividerPadding(new Object[]{afVar, ValueQualifier.setOnFocusChangeListener}, 1991488095, -1991488092, System.identityHashCode(afVar));
        byte[] bArr = new byte[3];
        int i28 = f61602q0 + 3;
        f61603r0 = i28 % 128;
        int i29 = i28 % 2;
        int i30 = 0;
        while (i30 < 3) {
            int i31 = f61603r0;
            int i32 = ((i31 | 37) << 1) - (i31 ^ 37);
            f61602q0 = i32 % 128;
            int i33 = i32 % 2;
            bArr[i30] = 0;
            int iIdentityHashCode = System.identityHashCode(w4Var2);
            int i34 = -(-(i30 * 46));
            int i35 = 46 ^ i34;
            int i36 = -(-((i34 & 46) << 1));
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            int i38 = ~i30;
            int i39 = (i38 | i30) & i38;
            int i40 = ~iIdentityHashCode;
            int i41 = ((~i40) & i39) | ((~i39) & i40);
            int i42 = i39 & i40;
            int i43 = (i42 & i41) | (i41 ^ i42);
            int i44 = ~i43;
            int i45 = (i43 | i44) & i44;
            int i46 = -(-(((i45 & 1) | ((~i45) & 1) | (i45 & (-2))) * (-90)));
            int i47 = i37 | i46;
            int i48 = i47 << 1;
            int i49 = -((~(i37 & i46)) & i47);
            int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
            int i51 = i38 & iIdentityHashCode;
            int i52 = (~i51) & (i38 | iIdentityHashCode);
            int i53 = ~((i51 & i52) | (i52 ^ i51));
            int i54 = ~((i30 & 1) | (i30 ^ 1));
            int i55 = i53 ^ i54;
            int i56 = i54 & i53;
            int i57 = -(-(((i56 & i55) | (i55 ^ i56)) * (-45)));
            int i58 = i50 & i57;
            int i59 = (((i57 | i50) & (~i58)) - (~(-(-(i58 << 1))))) - 1;
            int i60 = (-2) & iIdentityHashCode;
            int i61 = (iIdentityHashCode | (-2)) & (~i60);
            int i62 = ~((i61 & i60) | (i61 ^ i60));
            int i63 = i38 & i62;
            int i64 = (i62 | i38) & (~i63);
            int i65 = (i64 & i63) | (i64 ^ i63);
            int i66 = i40 & 1;
            int i67 = (~i66) & (i40 | 1);
            int i68 = ~((i66 & i67) | (i67 ^ i66));
            int i69 = i65 & i68;
            int i70 = -(-((((i65 | i68) & (~i69)) | i69) * 45));
            int i71 = i59 & i70;
            int i72 = (i59 ^ i70) | i71;
            i30 = ((i72 & i71) << 1) + (i71 ^ i72);
            int i73 = f61603r0;
            int i74 = i73 & 83;
            int i75 = (i74 - (~((i73 ^ 83) | i74))) - 1;
            f61602q0 = i75 % 128;
            int i76 = i75 % 2;
        }
        af.setDividerPadding(new Object[]{afVar, bArr}, -730300567, 730300574, System.identityHashCode(afVar));
        int i77 = f61603r0;
        int i78 = (i77 & 121) + (i77 | 121);
        f61602q0 = i78 % 128;
        int i79 = i78 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(af afVar) {
        return a(new Object[]{this, afVar}, 1962456684, -1962456684, System.identityHashCode(this));
    }
}
