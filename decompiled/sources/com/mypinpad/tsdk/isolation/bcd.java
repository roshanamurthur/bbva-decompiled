package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bcd implements bbh {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54450t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54451u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient awv f54452p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient String f54453q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient byte[] f54454r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public transient aee f54455s0;

    public bcd(ahw ahwVar) throws IOException {
        setY(new Object[]{this, ahwVar}, 1572357953, -1572357950, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54450t0;
        int i11 = (i10 ^ 101) + ((i10 & 101) << 1);
        f54451u0 = i11 % 128;
        int i12 = i11 % 2;
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        if (i12 == 0) {
            setY(new Object[]{this, (ahw) ahw.setX(new Object[]{bArr}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, 1572357953, -1572357950, System.identityHashCode(this));
            throw null;
        }
        setY(new Object[]{this, (ahw) ahw.setX(new Object[]{bArr}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, 1572357953, -1572357950, System.identityHashCode(this));
        int i13 = f54450t0;
        int i14 = i13 & 31;
        int i15 = (i13 | 31) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        f54451u0 = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x009d  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~(i13 | i11);
        switch ((((~(i10 | (~i11))) | i12 | i16) * 397) + (i16 * (-397)) + (((~(i14 | i11)) | i15 | i16) * (-397)) + (i11 * (-396)) + (i10 * 398)) {
            case 1:
                int i17 = f54451u0;
                int i18 = ((-1) << 1) - (((i17 & 84) + (i17 | 84)) ^ (-1));
                int i19 = i18 % 128;
                f54450t0 = i19;
                int i20 = i18 % 2;
                int i21 = i19 + 117;
                f54451u0 = i21 % 128;
                int i22 = i21 % 2;
                return "PKCS#8";
            case 2:
                bcd bcdVar = (bcd) objArr[0];
                awv awvVar = (awv) objArr[1];
                aee aeeVar = (aee) objArr[2];
                int i23 = f54450t0;
                int i24 = i23 & 121;
                int i25 = (i23 ^ 121) | i24;
                int i26 = (i24 & i25) + (i25 | i24);
                f54451u0 = i26 % 128;
                int i27 = i26 % 2;
                bcdVar.f54455s0 = aeeVar;
                bcdVar.f54452p0 = awvVar;
                Object[] objArr2 = new Object[1];
                if (i27 != 0) {
                    objArr2[0] = awvVar;
                    awu awuVar = (awu) awp.setY(objArr2, 1056854071, -1056854071, System.identityHashCode(awvVar));
                    bcdVar.f54453q0 = (String) bez.setX(new Object[]{(String) awu.setCompoundDrawableTintBlendMode(new Object[]{awuVar}, 1611557984, -1611557984, System.identityHashCode(awuVar))}, -925397906, 925397910, (int) System.currentTimeMillis());
                    return null;
                }
                objArr2[0] = awvVar;
                awu awuVar2 = (awu) awp.setY(objArr2, 1056854071, -1056854071, System.identityHashCode(awvVar));
                bcdVar.f54453q0 = (String) bez.setX(new Object[]{(String) awu.setCompoundDrawableTintBlendMode(new Object[]{awuVar2}, 1611557984, -1611557984, System.identityHashCode(awuVar2))}, -925397906, 925397910, (int) System.currentTimeMillis());
                throw null;
            case 3:
                bcd bcdVar2 = (bcd) objArr[0];
                ahw ahwVar = (ahw) objArr[1];
                int i28 = f54451u0 + 31;
                f54450t0 = i28 % 128;
                int i29 = i28 % 2;
                setY(new Object[]{bcdVar2, (awv) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis())), (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar))}, -1000659997, 1000659999, System.identityHashCode(bcdVar2));
                int i30 = f54450t0;
                int i31 = (i30 & (-84)) | ((~i30) & 83);
                int i32 = (i30 & 83) << 1;
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                f54451u0 = i33 % 128;
                int i34 = i33 % 2;
                return null;
            case 4:
                bcd bcdVar3 = (bcd) objArr[0];
                Object obj = objArr[1];
                int i35 = f54450t0;
                int i36 = i35 & 97;
                int i37 = (i35 ^ 97) | i36;
                int i38 = (i36 & i37) + (i36 | i37);
                int i39 = i38 % 128;
                f54451u0 = i39;
                int i40 = i38 % 2;
                if (obj == bcdVar3) {
                    int i41 = (((i35 | 102) << 1) - (i35 ^ 102)) - 1;
                    f54451u0 = i41 % 128;
                    int i42 = i41 % 2;
                    System.identityHashCode(bcdVar3);
                    System.identityHashCode(bcdVar3);
                    objValueOf = Boolean.TRUE;
                } else if (!(obj instanceof bcd)) {
                    int i43 = i39 & 107;
                    int i44 = (i39 ^ 107) | i43;
                    int i45 = (i43 & i44) + (i43 | i44);
                    f54450t0 = i45 % 128;
                    int i46 = i45 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    int i47 = i39 & 119;
                    int i48 = (i39 | 119) & (~i47);
                    int i49 = -(-(i47 << 1));
                    int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                    f54450t0 = i50 % 128;
                    int i51 = i50 % 2;
                    bcd bcdVar4 = (bcd) obj;
                    boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{(byte[]) setY(new Object[]{bcdVar3}, 1137660115, -1137660109, System.identityHashCode(bcdVar3)), (byte[]) setY(new Object[]{bcdVar4}, 1137660115, -1137660109, System.identityHashCode(bcdVar4))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i52 = f54451u0;
                    int i53 = i52 & 119;
                    int i54 = (i52 ^ 119) | i53;
                    int i55 = (i53 & i54) + (i54 | i53);
                    f54450t0 = i55 % 128;
                    if (i55 % 2 != 0) {
                        int i56 = 32 / 0;
                    }
                    objValueOf = Boolean.valueOf(zBooleanValue);
                }
                break;
            case 5:
                bcd bcdVar5 = (bcd) objArr[0];
                int i57 = f54450t0;
                int i58 = (i57 | 111) << 1;
                int i59 = -(((~i57) & 111) | (i57 & (-112)));
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                f54451u0 = i60 % 128;
                int i61 = i60 % 2;
                objValueOf = bcdVar5.f54453q0;
                if (i61 == 0) {
                    int i62 = 77 / 0;
                }
                break;
            case 6:
                bcd bcdVar6 = (bcd) objArr[0];
                int i63 = f54451u0;
                int i64 = i63 & 115;
                int i65 = ((i63 ^ 115) | i64) << 1;
                int i66 = -((i63 | 115) & (~i64));
                int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                f54450t0 = i67 % 128;
                int i68 = i67 % 2;
                byte[] bArr = bcdVar6.f54454r0;
                if (i68 != 0) {
                    int i69 = 47 / 0;
                    if (bArr == null) {
                        bcdVar6.f54454r0 = (byte[]) bdd.setOnFocusChangeListener(new Object[]{bcdVar6.f54452p0, bcdVar6.f54455s0}, -1270303781, 1270303784, (int) System.currentTimeMillis());
                        int i70 = f54451u0;
                        int i71 = i70 & 29;
                        int i72 = (i70 ^ 29) | i71;
                        int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                        f54450t0 = i73 % 128;
                        int i74 = i73 % 2;
                    }
                } else if (bArr == null) {
                    bcdVar6.f54454r0 = (byte[]) bdd.setOnFocusChangeListener(new Object[]{bcdVar6.f54452p0, bcdVar6.f54455s0}, -1270303781, 1270303784, (int) System.currentTimeMillis());
                    int i75 = f54451u0;
                    int i76 = i75 & 29;
                    int i77 = (i75 ^ 29) | i76;
                    int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
                    f54450t0 = i78 % 128;
                    int i79 = i78 % 2;
                }
                byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bcdVar6.f54454r0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i80 = f54451u0 + 109;
                f54450t0 = i80 % 128;
                if (i80 % 2 == 0) {
                    return bArr2;
                }
                int i81 = 55 / 0;
                return bArr2;
            default:
                bcd bcdVar7 = (bcd) objArr[0];
                int i82 = f54450t0;
                int i83 = ((-1) << 1) - ((-1) ^ ((i82 & 88) + (i82 | 88)));
                f54451u0 = i83 % 128;
                int i84 = i83 % 2;
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) setY(new Object[]{bcdVar7}, 1137660115, -1137660109, System.identityHashCode(bcdVar7))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i85 = f54451u0 + 79;
                f54450t0 = i85 % 128;
                int i86 = i85 % 2;
                return Integer.valueOf(iIntValue);
        }
        return objValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54450t0 + 21;
        f54451u0 = i10 % 128;
        int i11 = i10 % 2;
        objectOutputStream.defaultWriteObject();
        if (i11 == 0) {
            objectOutputStream.writeObject((byte[]) setY(new Object[]{this}, 1137660115, -1137660109, System.identityHashCode(this)));
            throw null;
        }
        objectOutputStream.writeObject((byte[]) setY(new Object[]{this}, 1137660115, -1137660109, System.identityHashCode(this)));
        int i12 = f54450t0;
        int i13 = (i12 & 47) + (i12 | 47);
        f54451u0 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 82 / 0;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, -1041196388, 1041196392, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setY(new Object[]{this}, -667718091, 667718096, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setY(new Object[]{this}, 1137660115, -1137660109, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setY(new Object[]{this}, 1577795199, -1577795198, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -936240087, 936240087, System.identityHashCode(this))).intValue();
    }
}
