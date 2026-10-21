package com.mypinpad.tsdk.isolation;

import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public final class bdd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54544a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54545b = 1;

    public static byte[] setDividerPadding(amw amwVar) {
        return (byte[]) setOnFocusChangeListener(new Object[]{amwVar}, 777503361, -777503360, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        byte[] bArr2;
        int i13 = ~i10;
        int i14 = ((~(i13 | i11)) * (-1182)) + (i11 * (-590)) + (i10 * 592);
        int i15 = ~i11;
        int i16 = ((i12 | i13 | i15) * 591) + (((~(i10 | i11)) | (~(i13 | i15 | (~i12)))) * (-591)) + i14;
        try {
            if (i16 == 1) {
                amw amwVar = (amw) objArr[0];
                int i17 = (-2) - ((f54544a + 112) ^ (-1));
                f54545b = i17 % 128;
                if (i17 % 2 == 0) {
                    ((Boolean) amw.setOnFocusChangeListener(new Object[]{amwVar}, 1283892343, -1283892343, System.identityHashCode(amwVar))).booleanValue();
                    throw null;
                }
                if (((Boolean) amw.setOnFocusChangeListener(new Object[]{amwVar}, 1283892343, -1283892343, System.identityHashCode(amwVar))).booleanValue()) {
                    throw new IllegalArgumentException("private key found");
                }
                bArr = (byte[]) setOnFocusChangeListener(new Object[]{(ajj) bac.setDividerPadding(new Object[]{amwVar}, 629434876, -629434876, (int) System.currentTimeMillis())}, -65903190, 65903192, (int) System.currentTimeMillis());
                int i18 = f54545b;
                int i19 = (((i18 ^ 37) | (i18 & 37)) << 1) - (((~i18) & 37) | (i18 & (-38)));
                f54544a = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 37 / 0;
                }
            } else if (i16 == 2) {
                ajj ajjVar = (ajj) objArr[0];
                int i21 = f54544a;
                int i22 = (i21 & (-72)) | ((~i21) & 71);
                int i23 = -(-((i21 & 71) << 1));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                f54545b = i24 % 128;
                if (i24 % 2 == 0) {
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                bArr = (byte[]) adw.setOnLongClickListener(new Object[]{ajjVar, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(ajjVar));
                int i25 = f54545b;
                int i26 = i25 & 87;
                int i27 = i26 + ((i25 ^ 87) | i26);
                f54544a = i27 % 128;
                if (i27 % 2 != 0) {
                    throw null;
                }
            } else {
                if (i16 != 3) {
                    ahw ahwVar = (ahw) objArr[0];
                    int i28 = f54545b;
                    int i29 = (i28 ^ 55) + ((i28 & 55) << 1);
                    f54544a = i29 % 128;
                    if (i29 % 2 != 0) {
                        bArr2 = (byte[]) adw.setOnLongClickListener(new Object[]{ahwVar, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(ahwVar));
                        int i30 = 34 / 0;
                    } else {
                        bArr2 = (byte[]) adw.setOnLongClickListener(new Object[]{ahwVar, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(ahwVar));
                    }
                    byte[] bArr3 = bArr2;
                    int i31 = f54545b + 121;
                    f54544a = i31 % 128;
                    int i32 = i31 % 2;
                    return bArr3;
                }
                amw amwVar2 = (amw) objArr[0];
                aee aeeVar = (aee) objArr[1];
                int i33 = f54544a;
                int i34 = ((i33 | 61) << 1) - (i33 ^ 61);
                f54545b = i34 % 128;
                int i35 = i34 % 2;
                if (!((Boolean) amw.setOnFocusChangeListener(new Object[]{amwVar2}, 1283892343, -1283892343, System.identityHashCode(amwVar2))).booleanValue()) {
                    throw new IllegalArgumentException("public key found");
                }
                bArr = (byte[]) setOnFocusChangeListener(new Object[]{(ahw) bab.setY(new Object[]{amwVar2, aeeVar}, 491760219, -491760218, (int) System.currentTimeMillis())}, 620383328, -620383328, (int) System.currentTimeMillis());
                int i36 = f54545b + 98;
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                f54544a = i37 % 128;
                int i38 = i37 % 2;
            }
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] setOnFocusChangeListener(amw amwVar, aee aeeVar) {
        return (byte[]) setOnFocusChangeListener(new Object[]{amwVar, aeeVar}, -1270303781, 1270303784, (int) System.currentTimeMillis());
    }
}
