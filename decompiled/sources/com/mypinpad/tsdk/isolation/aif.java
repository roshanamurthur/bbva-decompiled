package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class aif extends adw {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final byte[] f52768u0 = {-87, -42, -21, 69, -15, 60, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -126, -128, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, Constants.CVR_B2b87_11_RFU, 55, 41, 29, 56, -39, 107, Constants.CVR_B2b8765_1111_APP_DISABLED, 37, -54, 78, 23, -8, -23, 114, 13, -58, MessageUtils.MESSAGE_21_NAK, -76, 58, 40, -105, Constants.STATE_ERROR, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, MessageUtils.MESSAGE_18_DC2, 62, 109, -72, -6, -59, 121, 4};
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52769w0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adu f52770r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public aig f52771s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f52772t0;

    static {
        int i10 = (1 & 79) + (1 | 79);
        v0 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 82 / 0;
        }
    }

    public static aif setCompoundDrawableTintBlendMode(Object obj) {
        return (aif) setX(new Object[]{obj}, 1248089737, -1248089734, (int) System.currentTimeMillis());
    }

    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        aif aifVar;
        int i13 = ~i10;
        int i14 = (~((~i11) | i13)) | i12;
        int i15 = ~(i10 | i11);
        int i16 = ((i11 | (~(i12 | i13))) * 376) + (((~(i10 | (~i12))) | i15) * (-376)) + ((i14 | i15) * 376) + (i11 * (-375)) + (i10 * (-375));
        if (i16 == 1) {
            aif aifVar2 = (aif) objArr[0];
            int i17 = v0;
            int i18 = i17 | 39;
            int i19 = (i18 << 1) - ((~(i17 & 39)) & i18);
            f52769w0 = i19 % 128;
            int i20 = i19 % 2;
            aig aigVar = aifVar2.f52771s0;
            if (i20 != 0) {
                return aigVar;
            }
            throw null;
        }
        byte[] bArr = f52768u0;
        if (i16 == 2) {
            aif aifVar3 = (aif) objArr[0];
            adh adhVar = new adh(2);
            adu aduVar = aifVar3.f52770r0;
            if (aduVar != null) {
                int i21 = f52769w0 + 57;
                v0 = i21 % 128;
                if (i21 % 2 != 0) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aduVar}, 240298319, -240298315, System.identityHashCode(adhVar));
                    throw null;
                }
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aduVar}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i22 = f52769w0;
                int i23 = (i22 & 25) + (i22 | 25);
                v0 = i23 % 128;
                int i24 = i23 % 2;
            } else {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aifVar3.f52771s0}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i25 = f52769w0 + 117;
                v0 = i25 % 128;
                int i26 = i25 % 2;
            }
            if (!((Boolean) bek.setOnFocusChangeListener(new Object[]{aifVar3.f52772t0, bArr}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue()) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(aifVar3.f52772t0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i27 = f52769w0;
                int i28 = (((i27 | 50) << 1) - (i27 ^ 50)) - 1;
                v0 = i28 % 128;
                int i29 = i28 % 2;
            }
            afv afvVar = new afv(adhVar);
            int i30 = f52769w0;
            int i31 = i30 ^ 7;
            int i32 = (i30 & 7) << 1;
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            v0 = i33 % 128;
            if (i33 % 2 == 0) {
                return afvVar;
            }
            int i34 = 48 / 0;
            return afvVar;
        }
        if (i16 != 3) {
            if (i16 != 4) {
                aif aifVar4 = (aif) objArr[0];
                int i35 = f52769w0;
                int i36 = ((i35 | 59) << 1) - (i35 ^ 59);
                int i37 = i36 % 128;
                v0 = i37;
                int i38 = i36 % 2;
                adu aduVar2 = aifVar4.f52770r0;
                if (i38 != 0) {
                    throw null;
                }
                int i39 = i37 & 49;
                int i40 = ((i37 ^ 49) | i39) << 1;
                int i41 = -((i37 | 49) & (~i39));
                int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                f52769w0 = i42 % 128;
                if (i42 % 2 != 0) {
                    return aduVar2;
                }
                throw null;
            }
            aif aifVar5 = (aif) objArr[0];
            int i43 = f52769w0;
            int i44 = (i43 & 121) + (i43 | 121);
            int i45 = i44 % 128;
            v0 = i45;
            int i46 = i44 % 2;
            adu aduVar3 = aifVar5.f52770r0;
            if (i46 != 0) {
                throw null;
            }
            if (aduVar3 != null) {
                int i47 = i43 & 39;
                int i48 = (((~i47) & (i43 | 39)) - (~(i47 << 1))) - 1;
                v0 = i48 % 128;
                int i49 = i48 % 2;
                return Boolean.TRUE;
            }
            int i50 = i45 & 67;
            int i51 = (i50 - (~(-(-((i45 ^ 67) | i50))))) - 1;
            f52769w0 = i51 % 128;
            if (i51 % 2 != 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        Object obj = objArr[0];
        int i52 = f52769w0;
        int i53 = (((i52 ^ 43) | (i52 & 43)) << 1) - ((i52 & (-44)) | ((~i52) & 43));
        int i54 = i53 % 128;
        v0 = i54;
        int i55 = i53 % 2;
        if (obj instanceof aif) {
            int i56 = ((i52 & 20) + (i52 | 20)) - 1;
            int i57 = i56 % 128;
            v0 = i57;
            int i58 = i56 % 2;
            aif aifVar6 = (aif) obj;
            int i59 = i57 ^ 63;
            int i60 = (i57 & 63) << 1;
            int i61 = (i59 & i60) + (i60 | i59);
            f52769w0 = i61 % 128;
            int i62 = i61 % 2;
            return aifVar6;
        }
        if (obj == null) {
            throw new IllegalArgumentException("object parse error");
        }
        int i63 = ((i54 & (-8)) | ((~i54) & 7)) + ((i54 & 7) << 1);
        f52769w0 = i63 % 128;
        int i64 = i63 % 2;
        aed aedVar = (aed) aed.setY(new Object[]{obj}, 691787085, -691787084, (int) System.currentTimeMillis());
        if (aedVar.setX(0) instanceof adu) {
            adu y7 = adu.setY(aedVar.setX(0));
            aifVar = new aif();
            aifVar.f52772t0 = bArr;
            aifVar.f52770r0 = y7;
            int i65 = f52769w0;
            int i66 = i65 & 125;
            int i67 = (i65 | 125) & (~i66);
            int i68 = -(-(i66 << 1));
            int i69 = (i67 & i68) + (i67 | i68);
            v0 = i69 % 128;
            int i70 = i69 % 2;
        } else {
            aig aigVar2 = (aig) aig.setDividerPadding(new Object[]{aedVar.setX(0)}, -983722736, 983722739, (int) System.currentTimeMillis());
            aifVar = new aif();
            aifVar.f52772t0 = bArr;
            aifVar.f52771s0 = aigVar2;
            int i71 = f52769w0;
            int i72 = i71 & 111;
            int i73 = (((i71 | 111) & (~i72)) - (~(i72 << 1))) - 1;
            v0 = i73 % 128;
            int i74 = i73 % 2;
        }
        if (aedVar.setCompoundDrawableTintBlendMode() == 2) {
            int i75 = v0;
            int i76 = (i75 ^ 41) + ((i75 & 41) << 1);
            f52769w0 = i76 % 128;
            int i77 = i76 % 2;
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{aedVar.setX(1)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            byte[] bArr2 = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
            aifVar.f52772t0 = bArr2;
            if (bArr2.length != 64) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        int i78 = v0 + 69;
        f52769w0 = i78 % 128;
        int i79 = i78 % 2;
        return aifVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, -1322160976, 1322160978, System.identityHashCode(this));
    }

    public final aig setDividerPadding() {
        return (aig) setX(new Object[]{this}, -429049255, 429049256, System.identityHashCode(this));
    }

    public final adu setCompoundDrawableTintBlendMode() {
        return (adu) setX(new Object[]{this}, 1577795567, -1577795567, System.identityHashCode(this));
    }

    public final boolean setX() {
        return ((Boolean) setX(new Object[]{this}, 1450725992, -1450725988, System.identityHashCode(this))).booleanValue();
    }
}
