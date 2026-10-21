package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bch implements bbf {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54470s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54471t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient awy f54472p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient String f54473q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient byte[] f54474r0;

    public bch(ajj ajjVar) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, ajjVar}, 2731559, -2731555, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54470s0;
        int i11 = i10 & 13;
        int i12 = (((i10 | 13) & (~i11)) - (~(i11 << 1))) - 1;
        f54471t0 = i12 % 128;
        int i13 = i12 % 2;
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        if (i13 == 0) {
            setCompoundDrawableTintBlendMode(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, 2731559, -2731555, System.identityHashCode(this));
            int i14 = 72 / 0;
        } else {
            setCompoundDrawableTintBlendMode(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, 2731559, -2731555, System.identityHashCode(this));
        }
        int i15 = f54471t0;
        int i16 = (((i15 & (-56)) | ((~i15) & 55)) - (~(-(-((i15 & 55) << 1))))) - 1;
        f54470s0 = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~(i15 | i12);
        int i17 = ~i12;
        switch ((((~(i10 | i14 | i12)) | (~(i11 | i13 | i12)) | (~(i15 | i17))) * 920) + (((~i15) | (~(i13 | i17))) * 920) + ((i16 | (~(i14 | i17 | i10))) * 920) + (i11 * (-919)) + (i10 * (-919))) {
            case 1:
                bch bchVar = (bch) objArr[0];
                int i18 = f54471t0;
                int i19 = (-2) - (((i18 ^ 116) + ((i18 & 116) << 1)) ^ (-1));
                f54470s0 = i19 % 128;
                int i20 = i19 % 2;
                if (bchVar.f54474r0 == null) {
                    int i21 = i18 + 33;
                    f54470s0 = i21 % 128;
                    if (i21 % 2 != 0) {
                        bchVar.f54474r0 = (byte[]) bdd.setOnFocusChangeListener(new Object[]{bchVar.f54472p0}, 777503361, -777503360, (int) System.currentTimeMillis());
                        throw null;
                    }
                    bchVar.f54474r0 = (byte[]) bdd.setOnFocusChangeListener(new Object[]{bchVar.f54472p0}, 777503361, -777503360, (int) System.currentTimeMillis());
                }
                objValueOf = (byte[]) bek.setOnFocusChangeListener(new Object[]{bchVar.f54474r0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i22 = f54471t0;
                int i23 = (i22 & 11) + (i22 | 11);
                f54470s0 = i23 % 128;
                if (i23 % 2 != 0) {
                    throw null;
                }
                break;
            case 2:
                bch bchVar2 = (bch) objArr[0];
                int i24 = f54471t0;
                int i25 = (((i24 | 88) << 1) - (i24 ^ 88)) - 1;
                f54470s0 = i25 % 128;
                if (i25 % 2 == 0) {
                    return bchVar2.f54473q0;
                }
                String str = bchVar2.f54473q0;
                throw null;
            case 3:
                bch bchVar3 = (bch) objArr[0];
                int i26 = f54471t0;
                int i27 = (i26 ^ 54) + ((i26 & 54) << 1);
                int i28 = (i27 ^ (-1)) + (i27 << 1);
                f54470s0 = i28 % 128;
                int i29 = i28 % 2;
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) setCompoundDrawableTintBlendMode(new Object[]{bchVar3}, -2128033823, 2128033824, System.identityHashCode(bchVar3))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i30 = f54471t0;
                int i31 = i30 & 63;
                int i32 = (i31 - (~((i30 ^ 63) | i31))) - 1;
                f54470s0 = i32 % 128;
                int i33 = i32 % 2;
                return Integer.valueOf(iIntValue);
            case 4:
                bch bchVar4 = (bch) objArr[0];
                ajj ajjVar = (ajj) objArr[1];
                int i34 = f54470s0;
                int i35 = i34 & 11;
                int i36 = (((i34 | 11) & (~i35)) - (~(i35 << 1))) - 1;
                f54471t0 = i36 % 128;
                if (i36 % 2 == 0) {
                    setCompoundDrawableTintBlendMode(new Object[]{bchVar4, (awy) ((amw) baf.setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis()))}, 1849017966, -1849017966, System.identityHashCode(bchVar4));
                    throw null;
                }
                setCompoundDrawableTintBlendMode(new Object[]{bchVar4, (awy) ((amw) baf.setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis()))}, 1849017966, -1849017966, System.identityHashCode(bchVar4));
                int i37 = f54471t0;
                int i38 = (((i37 | 62) << 1) - (i37 ^ 62)) - 1;
                f54470s0 = i38 % 128;
                if (i38 % 2 == 0) {
                    return null;
                }
                throw null;
            case 5:
                bch bchVar5 = (bch) objArr[0];
                Object obj = objArr[1];
                int i39 = f54470s0;
                int i40 = i39 + 115;
                int i41 = i40 % 128;
                f54471t0 = i41;
                int i42 = i40 % 2;
                if (obj == bchVar5) {
                    int i43 = ((i41 | 84) << 1) - (i41 ^ 84);
                    int i44 = (i43 ^ (-1)) + (i43 << 1);
                    int i45 = i44 % 128;
                    f54470s0 = i45;
                    int i46 = i44 % 2;
                    int i47 = i45 & 77;
                    int i48 = (((i45 ^ 77) | i47) << 1) - ((i45 | 77) & (~i47));
                    f54471t0 = i48 % 128;
                    int i49 = i48 % 2;
                    objValueOf = Boolean.TRUE;
                } else if (obj instanceof bch) {
                    int i50 = i39 & 15;
                    int i51 = (i39 | 15) & (~i50);
                    int i52 = i50 << 1;
                    int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                    f54471t0 = i53 % 128;
                    int i54 = i53 % 2;
                    bch bchVar6 = (bch) obj;
                    boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{(byte[]) setCompoundDrawableTintBlendMode(new Object[]{bchVar5}, -2128033823, 2128033824, System.identityHashCode(bchVar5)), (byte[]) setCompoundDrawableTintBlendMode(new Object[]{bchVar6}, -2128033823, 2128033824, System.identityHashCode(bchVar6))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i55 = f54471t0;
                    int i56 = i55 & 23;
                    int i57 = ((i55 ^ 23) | i56) << 1;
                    int i58 = -((i55 | 23) & (~i56));
                    int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                    f54470s0 = i59 % 128;
                    if (i59 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.valueOf(zBooleanValue);
                } else {
                    int i60 = (i39 ^ 125) + ((i39 & 125) << 1);
                    f54471t0 = i60 % 128;
                    if (i60 % 2 == 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                }
                break;
            case 6:
                int i61 = f54471t0;
                int i62 = ((((i61 ^ 101) | (i61 & 101)) << 1) - (~(-((i61 & (-102)) | ((~i61) & 101))))) - 1;
                f54470s0 = i62 % 128;
                if (i62 % 2 != 0) {
                    int i63 = 49 / 0;
                }
                int i64 = i61 & 21;
                int i65 = (i61 ^ 21) | i64;
                int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                f54470s0 = i66 % 128;
                int i67 = i66 % 2;
                return ConstantKt.CERTIFICATE_TYPE_X509;
            default:
                bch bchVar7 = (bch) objArr[0];
                awy awyVar = (awy) objArr[1];
                int i68 = f54470s0;
                int i69 = (i68 & 45) + (i68 | 45);
                f54471t0 = i69 % 128;
                int i70 = i69 % 2;
                bchVar7.f54472p0 = awyVar;
                awu awuVar = (awu) awp.setY(new Object[]{awyVar}, 1056854071, -1056854071, System.identityHashCode(awyVar));
                bchVar7.f54473q0 = (String) bez.setX(new Object[]{(String) awu.setCompoundDrawableTintBlendMode(new Object[]{awuVar}, 1611557984, -1611557984, System.identityHashCode(awuVar))}, -925397906, 925397910, (int) System.currentTimeMillis());
                int i71 = f54471t0;
                int i72 = i71 & 97;
                int i73 = (i71 ^ 97) | i72;
                int i74 = (i72 & i73) + (i73 | i72);
                f54470s0 = i74 % 128;
                int i75 = i74 % 2;
                return null;
        }
        return objValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54470s0;
        int i11 = (i10 & (-68)) | ((~i10) & 67);
        int i12 = -(-((i10 & 67) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f54471t0 = i13 % 128;
        int i14 = i13 % 2;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject((byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -2128033823, 2128033824, System.identityHashCode(this)));
        int i15 = f54470s0;
        int i16 = i15 & 87;
        int i17 = ((i15 | 87) & (~i16)) + (i16 << 1);
        f54471t0 = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 20 / 0;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, obj}, 1900663234, -1900663229, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -993311426, 993311428, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -2128033823, 2128033824, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -944652482, 944652488, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -638353124, 638353127, System.identityHashCode(this))).intValue();
    }
}
