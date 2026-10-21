package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bck implements bbm {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54481s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54482t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient axa f54483p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient String f54484q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient byte[] f54485r0;

    public bck(ajj ajjVar) throws IOException {
        setY(new Object[]{this, ajjVar}, 828666686, -828666684, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54482t0;
        int i11 = (i10 & (-26)) | ((~i10) & 25);
        int i12 = -(-((i10 & 25) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        f54481s0 = i13 % 128;
        int i14 = i13 % 2;
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        if (i14 == 0) {
            setY(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, 828666686, -828666684, System.identityHashCode(this));
        } else {
            setY(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, 828666686, -828666684, System.identityHashCode(this));
            throw null;
        }
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (((~(i14 | i12)) | (~(i13 | i14)) | (~(i13 | i12))) * (-880)) + (i11 * 881) + (i10 * 881);
        int i16 = i11 | (~(i13 | (~i12)));
        int i17 = ~(i10 | i12);
        switch ((i17 * 880) + ((i16 | i17) * (-880)) + i15) {
            case 1:
                int i18 = f54482t0;
                int i19 = (-2) - ((i18 + 112) ^ (-1));
                f54481s0 = i19 % 128;
                int i20 = i19 % 2;
                int i21 = i18 & 13;
                int i22 = (i18 ^ 13) | i21;
                int i23 = (i21 & i22) + (i22 | i21);
                f54481s0 = i23 % 128;
                if (i23 % 2 == 0) {
                    return ConstantKt.CERTIFICATE_TYPE_X509;
                }
                throw null;
            case 2:
                bck bckVar = (bck) objArr[0];
                ajj ajjVar = (ajj) objArr[1];
                int i24 = f54482t0 + 25;
                f54481s0 = i24 % 128;
                int i25 = i24 % 2;
                setY(new Object[]{bckVar, (axa) ((amw) baf.setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis()))}, -594623734, 594623740, System.identityHashCode(bckVar));
                int i26 = f54482t0;
                int i27 = i26 & 119;
                int i28 = ((((i26 ^ 119) | i27) << 1) - (~(-((i26 | 119) & (~i27))))) - 1;
                f54481s0 = i28 % 128;
                int i29 = i28 % 2;
                return null;
            case 3:
                bck bckVar2 = (bck) objArr[0];
                int i30 = f54481s0;
                int i31 = i30 & 65;
                int i32 = ((i30 | 65) & (~i31)) + (i31 << 1);
                f54482t0 = i32 % 128;
                int i33 = i32 % 2;
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) setY(new Object[]{bckVar2}, 505158176, -505158171, System.identityHashCode(bckVar2))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i34 = f54481s0;
                int i35 = i34 & 25;
                int i36 = ((((i34 ^ 25) | i35) << 1) - (~(-((i34 | 25) & (~i35))))) - 1;
                f54482t0 = i36 % 128;
                if (i36 % 2 != 0) {
                    return Integer.valueOf(iIntValue);
                }
                throw null;
            case 4:
                bck bckVar3 = (bck) objArr[0];
                int i37 = f54481s0;
                int i38 = (i37 | 41) << 1;
                int i39 = -(i37 ^ 41);
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                int i41 = i40 % 128;
                f54482t0 = i41;
                int i42 = i40 % 2;
                objValueOf = bckVar3.f54484q0;
                int i43 = i41 ^ 109;
                int i44 = ((i41 & 109) | i43) << 1;
                int i45 = -i43;
                int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
                f54481s0 = i46 % 128;
                if (i46 % 2 != 0) {
                    throw null;
                }
                break;
            case 5:
                bck bckVar4 = (bck) objArr[0];
                int i47 = f54481s0;
                int i48 = (((i47 ^ 105) | (i47 & 105)) << 1) - (((~i47) & 105) | (i47 & (-106)));
                int i49 = i48 % 128;
                f54482t0 = i49;
                int i50 = i48 % 2;
                if (bckVar4.f54485r0 == null) {
                    int i51 = ((i49 ^ 79) | (i49 & 79)) << 1;
                    int i52 = -(((~i49) & 79) | (i49 & (-80)));
                    int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                    f54481s0 = i53 % 128;
                    int i54 = i53 % 2;
                    bckVar4.f54485r0 = (byte[]) bdd.setOnFocusChangeListener(new Object[]{bckVar4.f54483p0}, 777503361, -777503360, (int) System.currentTimeMillis());
                    int i55 = f54482t0;
                    int i56 = (((i55 ^ 107) | (i55 & 107)) << 1) - (((~i55) & 107) | (i55 & (-108)));
                    f54481s0 = i56 % 128;
                    int i57 = i56 % 2;
                }
                byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{bckVar4.f54485r0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i58 = ((-1) << 1) - ((f54481s0 + 114) ^ (-1));
                f54482t0 = i58 % 128;
                int i59 = i58 % 2;
                return bArr;
            case 6:
                bck bckVar5 = (bck) objArr[0];
                axa axaVar = (axa) objArr[1];
                int i60 = f54481s0;
                int i61 = (((i60 & (-6)) | ((~i60) & 5)) - (~(-(-((i60 & 5) << 1))))) - 1;
                f54482t0 = i61 % 128;
                int i62 = i61 % 2;
                bckVar5.f54483p0 = axaVar;
                aww awwVar = (aww) awx.setCompoundDrawableTintBlendMode(new Object[]{axaVar}, 1369349888, -1369349888, System.identityHashCode(axaVar));
                bckVar5.f54484q0 = (String) bez.setX(new Object[]{(String) aww.setY(new Object[]{awwVar}, -909497264, 909497264, System.identityHashCode(awwVar))}, -925397906, 925397910, (int) System.currentTimeMillis());
                int i63 = f54481s0;
                int i64 = i63 & 93;
                int i65 = -(-((i63 ^ 93) | i64));
                int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                f54482t0 = i66 % 128;
                int i67 = i66 % 2;
                return null;
            default:
                bck bckVar6 = (bck) objArr[0];
                Object obj = objArr[1];
                int i68 = f54481s0;
                int i69 = i68 & 103;
                int i70 = (i69 - (~((i68 ^ 103) | i69))) - 1;
                int i71 = i70 % 128;
                f54482t0 = i71;
                if (i70 % 2 == 0) {
                    throw null;
                }
                if (obj == bckVar6) {
                    int i72 = ((i68 | 21) << 1) - (i68 ^ 21);
                    f54482t0 = i72 % 128;
                    int i73 = i72 % 2;
                    objValueOf = Boolean.TRUE;
                } else if (!(obj instanceof bck)) {
                    int i74 = i71 & 27;
                    int i75 = (~i74) & (i71 | 27);
                    int i76 = -(-(i74 << 1));
                    int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                    f54481s0 = i77 % 128;
                    int i78 = i77 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    int i79 = i71 & 35;
                    int i80 = i79 + ((i71 ^ 35) | i79);
                    f54481s0 = i80 % 128;
                    bck bckVar7 = (bck) obj;
                    if (i80 % 2 != 0) {
                        ((Boolean) bek.setOnFocusChangeListener(new Object[]{(byte[]) setY(new Object[]{bckVar6}, 505158176, -505158171, System.identityHashCode(bckVar6)), (byte[]) setY(new Object[]{bckVar7}, 505158176, -505158171, System.identityHashCode(bckVar7))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    objValueOf = Boolean.valueOf(((Boolean) bek.setOnFocusChangeListener(new Object[]{(byte[]) setY(new Object[]{bckVar6}, 505158176, -505158171, System.identityHashCode(bckVar6)), (byte[]) setY(new Object[]{bckVar7}, 505158176, -505158171, System.identityHashCode(bckVar7))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue());
                }
                break;
                break;
        }
        return objValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54481s0;
        int i11 = i10 & 71;
        int i12 = (i10 | 71) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f54482t0 = i14 % 128;
        int i15 = i14 % 2;
        objectOutputStream.defaultWriteObject();
        if (i15 == 0) {
            objectOutputStream.writeObject((byte[]) setY(new Object[]{this}, 505158176, -505158171, System.identityHashCode(this)));
            int i16 = 9 / 0;
        } else {
            objectOutputStream.writeObject((byte[]) setY(new Object[]{this}, 505158176, -505158171, System.identityHashCode(this)));
        }
        int i17 = f54481s0;
        int i18 = (i17 ^ 121) + ((i17 & 121) << 1);
        f54482t0 = i18 % 128;
        int i19 = i18 % 2;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, -1510302871, 1510302871, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setY(new Object[]{this}, 878428402, -878428398, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setY(new Object[]{this}, 505158176, -505158171, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setY(new Object[]{this}, -231339772, 231339773, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -809124143, 809124146, System.identityHashCode(this))).intValue();
    }
}
