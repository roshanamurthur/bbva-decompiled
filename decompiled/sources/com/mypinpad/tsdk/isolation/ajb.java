package com.mypinpad.tsdk.isolation;

import com.google.firebase.ktx.BuildConfig;
import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes10.dex */
public final class ajb extends adw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String[] f52855s0 = {BuildConfig.VERSION_NAME, "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Hashtable f52856t0 = new Hashtable();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52857u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ade f52858r0;

    static {
        int i10 = v0;
        int i11 = i10 & 99;
        int i12 = ((((i10 ^ 99) | i11) << 1) - (~(-((i10 | 99) & (~i11))))) - 1;
        f52857u0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public static ajb setCompoundDrawableTintBlendMode(Object obj) {
        return (ajb) setX(new Object[]{obj}, -1147332350, 1147332354, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:49:0x01fa A[PHI: r5
      0x01fa: PHI (r5v7 int) = (r5v6 int), (r5v23 int) binds: [B:48:0x01f8, B:45:0x01e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x023e  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        int iIntValue;
        String str;
        String strConcat;
        int i13;
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = (((~(i10 | i16)) | (~(i11 | i15))) * 662) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + ((i14 | (~(i15 | i16))) * 1324) + (i11 * (-661)) + (i10 * (-661));
        ajb ajbVar = null;
        if (i17 == 1) {
            ajb ajbVar2 = (ajb) objArr[0];
            int i18 = v0;
            int i19 = ((i18 ^ 69) | (i18 & 69)) << 1;
            int i20 = -(((~i18) & 69) | (i18 & (-70)));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f52857u0 = i21 % 128;
            if (i21 % 2 == 0) {
                iIntValue = ((BigInteger) setX(new Object[]{ajbVar2}, -451642087, 451642089, System.identityHashCode(ajbVar2))).intValue();
                if (iIntValue >= 0) {
                    if (iIntValue > 10) {
                        str = f52855s0[iIntValue];
                        int i22 = f52857u0;
                        int i23 = (i22 ^ 7) + ((i22 & 7) << 1);
                        v0 = i23 % 128;
                        int i24 = i23 % 2;
                    }
                }
                strConcat = "CRLReason: ".concat(String.valueOf(str));
                int i25 = f52857u0;
                i13 = ((i25 & (-24)) | ((~i25) & 23)) + ((i25 & 23) << 1);
                v0 = i13 % 128;
                if (i13 % 2 != 0) {
                    return strConcat;
                }
                throw null;
            }
            iIntValue = ((BigInteger) setX(new Object[]{ajbVar2}, -451642087, 451642089, System.identityHashCode(ajbVar2))).intValue();
            int i26 = 14 / 0;
            if (iIntValue >= 0) {
                if (iIntValue > 10) {
                    str = f52855s0[iIntValue];
                    int i27 = f52857u0;
                    int i28 = (i27 ^ 7) + ((i27 & 7) << 1);
                    v0 = i28 % 128;
                    int i29 = i28 % 2;
                }
            }
            strConcat = "CRLReason: ".concat(String.valueOf(str));
            int i210 = f52857u0;
            i13 = ((i210 & (-24)) | ((~i210) & 23)) + ((i210 & 23) << 1);
            v0 = i13 % 128;
            if (i13 % 2 != 0) {
                return strConcat;
            }
            throw null;
            int i30 = v0 + 94;
            int i31 = (i30 ^ (-1)) + (i30 << 1);
            f52857u0 = i31 % 128;
            int i32 = i31 % 2;
            str = "invalid";
            strConcat = "CRLReason: ".concat(String.valueOf(str));
            int i211 = f52857u0;
            i13 = ((i211 & (-24)) | ((~i211) & 23)) + ((i211 & 23) << 1);
            v0 = i13 % 128;
            if (i13 % 2 != 0) {
                return strConcat;
            }
            throw null;
        }
        if (i17 == 2) {
            ajb ajbVar3 = (ajb) objArr[0];
            int i33 = f52857u0;
            int i34 = i33 & 57;
            int i35 = (i33 ^ 57) | i34;
            int i36 = (i34 & i35) + (i35 | i34);
            v0 = i36 % 128;
            int i37 = i36 % 2;
            ade adeVar = ajbVar3.f52858r0;
            if (i37 == 0) {
                throw null;
            }
            BigInteger bigInteger = (BigInteger) ade.setY(new Object[]{adeVar}, 1706244763, -1706244762, System.identityHashCode(adeVar));
            int i38 = f52857u0;
            int i39 = i38 & 99;
            int i40 = ((i38 ^ 99) | i39) << 1;
            int i41 = -((i38 | 99) & (~i39));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            v0 = i42 % 128;
            if (i42 % 2 != 0) {
                return bigInteger;
            }
            throw null;
        }
        if (i17 == 3) {
            int iIntValue2 = ((Number) objArr[0]).intValue();
            int i43 = v0;
            int i44 = i43 & 95;
            int i45 = ((i43 | 95) & (~i44)) + (i44 << 1);
            f52857u0 = i45 % 128;
            int i46 = i45 % 2;
            Integer num = (Integer) beq.setY(new Object[]{Integer.valueOf(iIntValue2)}, 843618426, -843618423, iIntValue2);
            Hashtable hashtable = f52856t0;
            if (!hashtable.containsKey(num)) {
                ajb ajbVar4 = new ajb();
                if (iIntValue2 < 0) {
                    throw new IllegalArgumentException("Invalid CRL reason : not in (0..MAX)");
                }
                ajbVar4.f52858r0 = new ade(iIntValue2);
                hashtable.put(num, ajbVar4);
                int i47 = f52857u0;
                int i48 = ((i47 | 125) << 1) - (i47 ^ 125);
                v0 = i48 % 128;
                int i49 = i48 % 2;
            }
            ajb ajbVar5 = (ajb) hashtable.get(num);
            int i50 = f52857u0;
            int i51 = ((i50 | 3) << 1) - (i50 ^ 3);
            v0 = i51 % 128;
            if (i51 % 2 != 0) {
                return ajbVar5;
            }
            throw null;
        }
        if (i17 != 4) {
            ajb ajbVar6 = (ajb) objArr[0];
            int i52 = v0 + 123;
            f52857u0 = i52 % 128;
            if (i52 % 2 != 0) {
                ade adeVar2 = ajbVar6.f52858r0;
                throw null;
            }
            ade adeVar3 = ajbVar6.f52858r0;
            System.identityHashCode(ajbVar6);
            System.identityHashCode(ajbVar6);
            return adeVar3;
        }
        Object obj = objArr[0];
        int i53 = v0;
        int i54 = i53 ^ 45;
        int i55 = i53 & 45;
        int i56 = i55 << 1;
        int i57 = (i54 & i56) + (i56 | i54);
        int i58 = i57 % 128;
        f52857u0 = i58;
        if (i57 % 2 != 0) {
            int i59 = 14 / 0;
            if (obj != null) {
                int i60 = (i58 & (-112)) | ((~i58) & 111);
                int i61 = -(-((i58 & 111) << 1));
                int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
                v0 = i62 % 128;
                int i63 = i62 % 2;
                ade adeVar4 = (ade) ade.setY(new Object[]{obj}, -1255399082, 1255399087, (int) System.currentTimeMillis());
                int iIntValue3 = ((Integer) ade.setY(new Object[]{adeVar4}, -943305917, 943305920, System.identityHashCode(adeVar4))).intValue();
                ajbVar = (ajb) setX(new Object[]{Integer.valueOf(iIntValue3)}, 784813595, -784813592, iIntValue3);
                int i64 = f52857u0;
                int i65 = (i64 ^ 69) + ((i64 & 69) << 1);
                v0 = i65 % 128;
                int i66 = i65 % 2;
            } else {
                int i67 = -(-(i54 | i55));
                int i68 = (i55 ^ i67) + ((i67 & i55) << 1);
                f52857u0 = i68 % 128;
                int i69 = i68 % 2;
            }
        } else if (obj != null) {
            int i610 = (i58 & (-112)) | ((~i58) & 111);
            int i611 = -(-((i58 & 111) << 1));
            int i612 = ((i610 | i611) << 1) - (i610 ^ i611);
            v0 = i612 % 128;
            int i613 = i612 % 2;
            ade adeVar5 = (ade) ade.setY(new Object[]{obj}, -1255399082, 1255399087, (int) System.currentTimeMillis());
            int iIntValue4 = ((Integer) ade.setY(new Object[]{adeVar5}, -943305917, 943305920, System.identityHashCode(adeVar5))).intValue();
            ajbVar = (ajb) setX(new Object[]{Integer.valueOf(iIntValue4)}, 784813595, -784813592, iIntValue4);
            int i614 = f52857u0;
            int i615 = (i614 ^ 69) + ((i614 & 69) << 1);
            v0 = i615 % 128;
            int i616 = i615 % 2;
        } else {
            int i617 = -(-(i54 | i55));
            int i618 = (i55 ^ i617) + ((i617 & i55) << 1);
            f52857u0 = i618 % 128;
            int i619 = i618 % 2;
        }
        return ajbVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, 1170147131, -1170147131, System.identityHashCode(this));
    }

    public final String toString() {
        return (String) setX(new Object[]{this}, -35343038, 35343039, System.identityHashCode(this));
    }
}
