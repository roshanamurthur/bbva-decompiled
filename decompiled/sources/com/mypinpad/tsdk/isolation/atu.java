package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class atu extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53852g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53853h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final atv f53854f;

    static {
        new atq(apj.setOnFocusChangeListener);
        int i10 = f53852g;
        int i11 = i10 & 63;
        int i12 = i11 + ((i10 ^ 63) | i11);
        f53853h = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 27 / 0;
        }
    }

    public atu() {
        super(409, 87, 0, 0);
        this.f53854f = new atv(this, null, null);
        this.setX = setOnFocusChangeListener(BigInteger.valueOf(1L));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
        int i14 = ~i12;
        int i15 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i14 | i11)) | i10) * (-1042)) + i13;
        int i16 = ~i10;
        int i17 = (((~(i10 | i14 | i11)) | (~(i12 | i16)) | (~((~i11) | i16))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i15;
        if (i17 == 1) {
            int iIntValue = ((Number) objArr[1]).intValue();
            int i18 = f53852g;
            int i19 = (i18 & 61) + (i18 | 61);
            int i20 = i19 % 128;
            f53853h = i20;
            if (i19 % 2 == 0) {
                throw null;
            }
            if (iIntValue == 6) {
                int i21 = (i18 & 83) + (i18 | 83);
                f53853h = i21 % 128;
                int i22 = i21 % 2;
                return Boolean.TRUE;
            }
            int i23 = i20 + 43;
            f53852g = i23 % 128;
            if (i23 % 2 == 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        if (i17 == 2) {
            atv atvVar = new atv((atu) objArr[0], (apk) objArr[1], (apk) objArr[2]);
            int i24 = f53852g;
            int i25 = ((i24 & 25) - (~(-(-(i24 | 25))))) - 1;
            f53853h = i25 % 128;
            int i26 = i25 % 2;
            return atvVar;
        }
        if (i17 == 3) {
            atu atuVar = (atu) objArr[0];
            int i27 = f53853h;
            int i28 = i27 & 71;
            int i29 = (~i28) & (i27 | 71);
            int i30 = i28 << 1;
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            f53852g = i31 % 128;
            int i32 = i31 % 2;
            atv atvVar2 = atuVar.f53854f;
            int i33 = i27 ^ 29;
            int i34 = -(-((i27 & 29) << 1));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            f53852g = i35 % 128;
            int i36 = i35 % 2;
            return atvVar2;
        }
        if (i17 != 4) {
            if (i17 != 5) {
                atu atuVar2 = new atu();
                int i37 = f53852g;
                int i38 = i37 & 89;
                int i39 = i38 + ((i37 ^ 89) | i38);
                f53853h = i39 % 128;
                int i40 = i39 % 2;
                return atuVar2;
            }
            atq atqVar = new atq((BigInteger) objArr[1]);
            int i41 = f53853h;
            int i42 = i41 & 3;
            int i43 = i42 + ((i41 ^ 3) | i42);
            f53852g = i43 % 128;
            int i44 = i43 % 2;
            return atqVar;
        }
        int i45 = f53853h;
        int i46 = (i45 & (-14)) | ((~i45) & 13);
        int i47 = -(-((i45 & 13) << 1));
        int i48 = (i46 & i47) + (i47 | i46);
        int i49 = i48 % 128;
        f53852g = i49;
        int i50 = i48 % 2;
        int i51 = i49 & 79;
        int i52 = ((i49 ^ 79) | i51) << 1;
        int i53 = -((i49 | 79) & (~i51));
        int i54 = (i52 & i53) + (i53 | i52);
        f53853h = i54 % 128;
        if (i54 % 2 != 0) {
            return 409;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setY(new Object[]{this}, 515540305, -515540305, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setY(new Object[]{this, apkVar, apkVar2}, -68551751, 68551753, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setY(new Object[]{this, bigInteger}, 248310882, -248310877, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setY(new Object[]{this, Integer.valueOf(i10)}, 1795827831, -1795827830, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, -767114382, 767114386, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setY(new Object[]{this}, -1272389764, 1272389767, System.identityHashCode(this));
    }
}
