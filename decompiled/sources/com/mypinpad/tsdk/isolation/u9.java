package com.mypinpad.tsdk.isolation;

import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Currency;", "p0", "", "setDividerPadding", "(Ljava/util/Currency;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class u9 extends Lambda implements Function1<Currency, Boolean> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61256q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61257r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ sq f61258p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(sq sqVar) {
        super(1);
        this.f61258p0 = sqVar;
    }

    public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ((~(i11 | (~i12) | i10)) * (-104)) + (((~(i13 | i14)) | (~(i14 | i12))) * 104) + (i11 * (-103)) + (i10 * (-103));
        boolean z10 = false;
        if (((i10 | i12) * 104) + i15 == 1) {
            u9 u9Var = (u9) objArr[0];
            Object obj = objArr[1];
            int i16 = f61256q0;
            int i17 = (i16 & (-54)) | ((~i16) & 53);
            int i18 = -(-((i16 & 53) << 1));
            int i19 = (i17 & i18) + (i18 | i17);
            f61257r0 = i19 % 128;
            Currency currency = (Currency) obj;
            if (i19 % 2 != 0) {
                return a(new Object[]{u9Var, currency}, 1476303935, -1476303935, System.identityHashCode(u9Var));
            }
            a(new Object[]{u9Var, currency}, 1476303935, -1476303935, System.identityHashCode(u9Var));
            throw null;
        }
        u9 u9Var2 = (u9) objArr[0];
        Currency currency2 = (Currency) objArr[1];
        int i20 = f61256q0;
        int i21 = i20 & 47;
        int i22 = (i20 ^ 47) | i21;
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        f61257r0 = i23 % 128;
        if (i23 % 2 == 0) {
            currency2.getNumericCode();
            sl onFocusChangeListener = u9Var2.f61258p0.setOnFocusChangeListener();
            ((Integer) sl.setY(new Object[]{onFocusChangeListener}, -1433045547, 1433045547, System.identityHashCode(onFocusChangeListener))).intValue();
            throw null;
        }
        int numericCode = currency2.getNumericCode();
        sl onFocusChangeListener2 = u9Var2.f61258p0.setOnFocusChangeListener();
        if (numericCode == ((Integer) sl.setY(new Object[]{onFocusChangeListener2}, -1433045547, 1433045547, System.identityHashCode(onFocusChangeListener2))).intValue()) {
            int i24 = f61257r0 + 89;
            f61256q0 = i24 % 128;
            int i25 = i24 % 2;
            z10 = true;
        } else {
            int i26 = f61257r0;
            int i27 = i26 & 113;
            int i28 = i26 | 113;
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            f61256q0 = i29 % 128;
            int i30 = i29 % 2;
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i31 = f61257r0;
        int i32 = i31 ^ 111;
        int i33 = (i31 & 111) << 1;
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        f61256q0 = i34 % 128;
        int i35 = i34 % 2;
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Currency currency) {
        return a(new Object[]{this, currency}, 640456662, -640456661, System.identityHashCode(this));
    }
}
