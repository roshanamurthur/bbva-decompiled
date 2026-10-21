package com.mypinpad.tsdk.isolation;

import android.os.Messenger;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/rs;", "p0", "", "setX", "(Lcom/mypinpad/tsdk/i/rs;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class i00 extends Lambda implements Function1<rs, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ IsolatedService f56320p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Messenger f56321q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i00(IsolatedService isolatedService, Messenger messenger) {
        super(1);
        this.f56320p0 = isolatedService;
        this.f56321q0 = messenger;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (((~(i11 | i12)) | (~(i14 | i15 | i16))) * 520) + i13;
        int i18 = ~(i15 | i16);
        int i19 = ~(i12 | i10);
        if ((((~(i10 | i15)) | (~(i14 | i16)) | i19) * 520) + ((i18 | i19) * (-1040)) + i17 == 1) {
            i00 i00Var = (i00) objArr[0];
            rs rsVar = (rs) objArr[1];
            Intrinsics.checkNotNullParameter(rsVar, "");
            IsolatedService.setOnFocusChangeListener(new Object[]{i00Var.f56320p0, i00Var.f56321q0, new xm(rsVar)}, -2024684754, 2024684762, (int) System.currentTimeMillis());
            return null;
        }
        i00 i00Var2 = (i00) objArr[0];
        Object obj = objArr[1];
        int iIdentityHashCode = System.identityHashCode(i00Var2);
        int i20 = ~iIdentityHashCode;
        int i21 = ((~i20) & (-572191361)) | (572191360 & i20);
        int i22 = (-572191361) & i20;
        int i23 = ~((i21 & i22) | (i21 ^ i22));
        int i24 = ~((1660877444 & iIdentityHashCode) | (1660877444 ^ iIdentityHashCode));
        int i25 = ((~i24) & i23) | ((~i23) & i24);
        int i26 = i23 & i24;
        int i27 = ((i26 & i25) | (i25 ^ i26)) * 520;
        int i28 = 708900711 & i27;
        int i29 = (i27 ^ 708900711) | i28;
        int i30 = (i28 & i29) + (i29 | i28);
        int i31 = (-1660877445) & i20;
        int i32 = ((-1660877445) | i20) & (~i31);
        int i33 = ~((i32 & i31) | (i32 ^ i31));
        int i34 = (-1172573285) & iIdentityHashCode;
        int i35 = ~(((-1172573285) ^ iIdentityHashCode) | i34);
        int i36 = -(-(((i33 & i35) | (i33 ^ i35)) * (-1040)));
        int i37 = i30 & i36;
        int i38 = (i36 | i30) & (~i37);
        int i39 = i37 << 1;
        int i40 = (i38 & i39) + (i38 | i39);
        int i41 = (i20 | iIdentityHashCode) & i20;
        int i42 = (i41 & 1172573284) | (1172573284 ^ i41);
        int i43 = ~i42;
        int i44 = (i42 | i43) & i43;
        int i45 = i44 & 1088686084;
        int i46 = (i44 | 1088686084) & (~i45);
        int i47 = (i46 & i45) | (i46 ^ i45);
        int i48 = (iIdentityHashCode & 1172573284) | (i20 & (-1172573285));
        int i49 = ~((i48 & i34) | (i48 ^ i34));
        int i50 = i47 & i49;
        int i51 = (i49 | i47) & (~i50);
        int i52 = -(~(((i51 & i50) | (i51 ^ i50)) * 520));
        int i53 = (-2) - (((i40 ^ i52) + ((i52 & i40) << 1)) ^ (-1));
        int iIdentityHashCode2 = System.identityHashCode(i00Var2);
        int i54 = ~iIdentityHashCode2;
        int i55 = (-1716407637) & i54;
        int i56 = (1716407636 & iIdentityHashCode2) | i55;
        int i57 = iIdentityHashCode2 & (-1716407637);
        int i58 = (i57 & i56) | (i56 ^ i57);
        int i59 = i58 & (-506389305);
        int i60 = (i58 | (-506389305)) & (~i59);
        int i61 = -(-(((i60 & i59) | (i60 ^ i59)) * (-381)));
        int i62 = ((((~i61) & (-1987095542)) | (1987095541 & i61)) - (~(-(-((i61 & (-1987095542)) << 1))))) - 1;
        int i63 = (~i55) & (i54 | (-1716407637));
        int i64 = (i63 & i55) | (i63 ^ i55);
        int i65 = ~i64;
        int i66 = (i64 | i65) & i65;
        int i67 = 404791848 & i66;
        int i68 = (i66 | 404791848) & (~i67);
        int i69 = (i68 & i67) | (i68 ^ i67);
        int i70 = ((i69 & 1614810180) | (i69 ^ 1614810180)) * 381;
        int i71 = ((~i70) & i62) | ((~i62) & i70);
        int i72 = -(-((i70 & i62) << 1));
        int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
        int i74 = ((i73 ^ 53925072) | (i73 & 53925072)) << 1;
        int i75 = -((53925072 & (~i73)) | ((-53925073) & i73));
        rs rsVar2 = (rs) obj;
        Object[] objArr2 = new Object[2];
        if (i53 > (i74 & i75) + (i75 | i74)) {
            objArr2[0] = i00Var2;
            objArr2[1] = rsVar2;
            a(objArr2, -2047607203, 2047607204, System.identityHashCode(i00Var2));
            return Unit.INSTANCE;
        }
        objArr2[0] = i00Var2;
        objArr2[1] = rsVar2;
        a(objArr2, -2047607203, 2047607204, System.identityHashCode(i00Var2));
        int i76 = 89 / 0;
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(rs rsVar) {
        return a(new Object[]{this, rsVar}, -1430513106, 1430513106, System.identityHashCode(this));
    }
}
