package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class arr extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53702g = arp.setOnDragListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53703h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53704i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ars f53705f;

    static {
        new arp(apj.setOnFocusChangeListener);
        int i10 = f53703h;
        int i11 = i10 & 25;
        int i12 = (i11 - (~((i10 ^ 25) | i11))) - 1;
        f53704i = i12 % 128;
        int i13 = i12 % 2;
    }

    public arr() {
        super(f53702g);
        this.f53705f = new ars(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object arpVar;
        int i13 = (i11 * 971) + (i10 * (-1939));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~((~i12) | i11);
        int i17 = ~i10;
        switch ((((~(i17 | i14)) | i16) * 970) + ((~(i11 | i17)) * 1940) + ((i15 | i16) * (-970)) + i13) {
            case 1:
                arr arrVar = (arr) objArr[0];
                int i18 = f53704i;
                int i19 = ((i18 | 53) << 1) - (i18 ^ 53);
                f53703h = i19 % 128;
                int i20 = i19 % 2;
                arpVar = arrVar.f53705f;
                int i21 = i18 & 33;
                int i22 = (i18 | 33) & (~i21);
                int i23 = -(-(i21 << 1));
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                f53703h = i24 % 128;
                int i25 = i24 % 2;
                break;
            case 2:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) auy.setOnFocusChangeListener(new Object[]{12}, 1950542281, -1950542250, 12);
                aro.setDividerPadding(new Object[]{secureRandom, iArr}, 1180277873, -1180277871, (int) System.currentTimeMillis());
                arpVar = new arp(iArr);
                int i26 = f53704i;
                int i27 = (i26 ^ 11) + ((i26 & 11) << 1);
                f53703h = i27 % 128;
                if (i27 % 2 != 0) {
                    throw null;
                }
                break;
            case 3:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i28 = f53704i;
                int i29 = (i28 & 105) + (i28 | 105);
                f53703h = i29 % 128;
                if (i29 % 2 != 0) {
                    throw null;
                }
                if (iIntValue != 2) {
                    int i30 = i28 & 49;
                    int i31 = -(-(i28 | 49));
                    int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                    f53703h = i32 % 128;
                    int i33 = i32 % 2;
                    arpVar = Boolean.FALSE;
                } else {
                    int i34 = ((i28 & 36) + (i28 | 36)) - 1;
                    f53703h = i34 % 128;
                    if (i34 % 2 != 0) {
                        throw null;
                    }
                    arpVar = Boolean.TRUE;
                }
                break;
                break;
            case 4:
                int i35 = f53704i;
                int i36 = i35 & 51;
                int i37 = (((i35 ^ 51) | i36) << 1) - ((i35 | 51) & (~i36));
                f53703h = i37 % 128;
                int i38 = i37 % 2;
                BigInteger bigInteger = f53702g;
                if (i38 != 0) {
                    bigInteger.bitLength();
                    throw null;
                }
                int iBitLength = bigInteger.bitLength();
                int i39 = f53704i;
                int i40 = i39 & 11;
                int i41 = (i39 | 11) & (~i40);
                int i42 = i40 << 1;
                int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                f53703h = i43 % 128;
                int i44 = i43 % 2;
                return Integer.valueOf(iBitLength);
            case 5:
                arr arrVar2 = new arr();
                int i45 = f53703h;
                int i46 = (i45 ^ 123) + ((i45 & 123) << 1);
                f53704i = i46 % 128;
                int i47 = i46 % 2;
                return arrVar2;
            case 6:
                ars arsVar = new ars((arr) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i48 = f53704i + 75;
                f53703h = i48 % 128;
                int i49 = i48 % 2;
                return arsVar;
            default:
                arp arpVar2 = new arp((BigInteger) objArr[1]);
                int i50 = f53703h;
                int i51 = (i50 ^ 109) + ((i50 & 109) << 1);
                f53704i = i51 % 128;
                int i52 = i51 % 2;
                return arpVar2;
        }
        return arpVar;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setDividerPadding(new Object[]{this}, 1649432179, -1649432174, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setDividerPadding(new Object[]{this, bigInteger}, -1333044205, 1333044205, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setDividerPadding(new Object[]{this, secureRandom}, -2007634572, 2007634574, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1095510854, 1095510858, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setDividerPadding(new Object[]{this}, -1131440401, 1131440402, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setDividerPadding(new Object[]{this, apkVar, apkVar2}, 670852252, -670852246, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 1227129558, -1227129555, i10)).booleanValue();
    }
}
