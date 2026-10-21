package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/bz;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/bz;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class w3 extends Lambda implements Function1<bz, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final w3 f61598p0 = new w3();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61599q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61600r0 = 1;

    static {
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = (-686738469) & iCurrentTimeMillis;
        int i11 = (iCurrentTimeMillis | (-686738469)) & (~i10);
        int i12 = ~((i11 & i10) | (i11 ^ i10));
        int i13 = ((1342190104 & i12) | (1342190104 ^ i12)) * (-196);
        int i14 = (((617364574 ^ i13) | (617364574 & i13)) << 1) - ((i13 & (-617364575)) | (617364574 & (~i13)));
        int i15 = (i14 ^ 954449529) + ((954449529 & i14) << 1);
        int i16 = (((i12 & (-2028928573)) | ((~i12) & (-2028928573)) | (2028928572 & i12)) * 196) + (i15 ^ (-1)) + (i15 << 1);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i17 = ~iCurrentTimeMillis2;
        int i18 = ((~i17) & (-921869788)) | (i17 & 921869787);
        int i19 = (-921869788) & i17;
        int i20 = ~((i18 & i19) | (i18 ^ i19));
        int i21 = ((~i20) & 37781786) | ((-37781787) & i20);
        int i22 = i20 & 37781786;
        int i23 = (i22 & i21) | (i21 ^ i22);
        int i24 = ~iCurrentTimeMillis2;
        int i25 = ((~i24) & 1974615233) | (i24 & (-1974615234));
        int i26 = 1974615233 & i24;
        int i27 = ~((i25 & i26) | (i25 ^ i26));
        int i28 = i23 & i27;
        int i29 = (i23 | i27) & (~i28);
        int i30 = (i29 & i28) | (i29 ^ i28);
        int i31 = (-1090527233) & iCurrentTimeMillis2;
        int i32 = ((-1090527233) | iCurrentTimeMillis2) & (~i31);
        int i33 = ~((i32 & i31) | (i32 ^ i31));
        int i34 = i30 & i33;
        int i35 = -(-((((i30 | i33) & (~i34)) | i34) * (-84)));
        int i36 = (710950221 ^ i35) + ((i35 & 710950221) << 1);
        int i37 = (iCurrentTimeMillis2 & 1974615233) | (1974615233 ^ iCurrentTimeMillis2);
        int i38 = (i37 | (~i37)) & (~i37);
        int i39 = (i38 & 921869787) | ((~i38) & 921869787) | ((-921869788) & i38);
        int i40 = (i17 & 1974615233) | ((~i17) & (-1974615234));
        int i41 = i17 & (-1974615234);
        int i42 = ~((i41 & i40) | (i40 ^ i41));
        int i43 = -(~(-(-(((i39 & i42) | ((~i42) & i39) | ((~i39) & i42)) * (-84)))));
        int i44 = (((i36 | i43) << 1) - (i43 ^ i36)) - 1;
        int i45 = i24 ^ (-1974615234);
        int i46 = i24 & (-1974615234);
        int i47 = ((~((i45 & i46) | (i45 ^ i46))) | 1090527232) * 84;
        if (i16 > ((i44 | i47) << 1) - (i47 ^ i44)) {
            int i48 = 26 / 0;
        }
    }

    public w3() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        if ((((~(i10 | (~i12))) | i14) * 168) + (((~(i11 | i10)) | (~(i10 | i12))) * (-168)) + (((~(i13 | i14)) | (~(i14 | i12))) * 336) + (i11 * (-167)) + (i10 * (-167)) == 1) {
            bz bzVar = (bz) objArr[1];
            int i15 = f61600r0 + 37;
            f61599q0 = i15 % 128;
            if (i15 % 2 == 0) {
                Intrinsics.checkNotNullParameter(bzVar, "");
                bz.setY(new Object[]{bzVar, Byte.valueOf(by.UNRECOGNISED_CVM.setDividerPadding())}, 881254746, -881254746, System.identityHashCode(bzVar));
                bz.setY(new Object[]{bzVar, cb.ALWAYS}, -478987183, 478987185, System.identityHashCode(bzVar));
                bz.setY(new Object[]{bzVar, ce.setOnFocusChangeListener}, 2141338749, -2141338746, System.identityHashCode(bzVar));
                return null;
            }
            Intrinsics.checkNotNullParameter(bzVar, "");
            bz.setY(new Object[]{bzVar, Byte.valueOf(by.UNRECOGNISED_CVM.setDividerPadding())}, 881254746, -881254746, System.identityHashCode(bzVar));
            bz.setY(new Object[]{bzVar, cb.ALWAYS}, -478987183, 478987185, System.identityHashCode(bzVar));
            bz.setY(new Object[]{bzVar, ce.setOnFocusChangeListener}, 2141338749, -2141338746, System.identityHashCode(bzVar));
            int i16 = 57 / 0;
            return null;
        }
        w3 w3Var = (w3) objArr[0];
        Object obj = objArr[1];
        int i17 = f61599q0;
        int i18 = ((i17 & (-86)) | ((~i17) & 85)) + ((i17 & 85) << 1);
        f61600r0 = i18 % 128;
        bz bzVar2 = (bz) obj;
        if (i18 % 2 == 0) {
            a(new Object[]{w3Var, bzVar2}, -1595487204, 1595487205, System.identityHashCode(w3Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        a(new Object[]{w3Var, bzVar2}, -1595487204, 1595487205, System.identityHashCode(w3Var));
        Unit unit2 = Unit.INSTANCE;
        int i19 = f61599q0;
        int i20 = i19 & 53;
        int i21 = -(-((i19 ^ 53) | i20));
        int i22 = (i20 & i21) + (i21 | i20);
        f61600r0 = i22 % 128;
        int i23 = i22 % 2;
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(bz bzVar) {
        return a(new Object[]{this, bzVar}, -2140867660, 2140867660, System.identityHashCode(this));
    }
}
