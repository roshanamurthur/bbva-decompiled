package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bce implements bbn {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54456t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54457u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient axb f54458p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient String f54459q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient byte[] f54460r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public transient aee f54461s0;

    public bce(ahw ahwVar) throws IOException {
        setDividerPadding(new Object[]{this, ahwVar}, 23600680, -23600680, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54456t0 + 91;
        f54457u0 = i10 % 128;
        int i11 = i10 % 2;
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        if (i11 == 0) {
            setDividerPadding(new Object[]{this, (ahw) ahw.setX(new Object[]{bArr}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, 23600680, -23600680, System.identityHashCode(this));
            throw null;
        }
        setDividerPadding(new Object[]{this, (ahw) ahw.setX(new Object[]{bArr}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, 23600680, -23600680, System.identityHashCode(this));
        int i12 = f54456t0;
        int i13 = (i12 & 107) + (i12 | 107);
        f54457u0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Boolean boolValueOf;
        int i13 = ~i10;
        int i14 = ~(i13 | i12);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-1808)) + (i11 * (-903)) + (i10 * 905);
        int i17 = ~i11;
        int i18 = i10 | i15;
        switch ((((~i18) | (~(i11 | i13)) | (~(i12 | i17))) * 904) + (((~(i18 | i11)) | (~(i13 | i17 | i12))) * 904) + i16) {
            case 1:
                int i19 = f54456t0;
                int i20 = i19 ^ 15;
                int i21 = (((i19 & 15) | i20) << 1) - i20;
                f54457u0 = i21 % 128;
                if (i21 % 2 != 0) {
                    return "PKCS#8";
                }
                throw null;
            case 2:
                bce bceVar = (bce) objArr[0];
                axb axbVar = (axb) objArr[1];
                aee aeeVar = (aee) objArr[2];
                int i22 = f54457u0;
                int i23 = (i22 ^ 57) + ((i22 & 57) << 1);
                f54456t0 = i23 % 128;
                int i24 = i23 % 2;
                bceVar.f54461s0 = aeeVar;
                bceVar.f54458p0 = axbVar;
                axd axdVar = (axd) axc.setY(new Object[]{axbVar}, -1152451803, 1152451803, System.identityHashCode(axbVar));
                bceVar.f54459q0 = (String) bez.setX(new Object[]{(String) axd.setOnFocusChangeListener(new Object[]{axdVar}, -722872963, 722872964, System.identityHashCode(axdVar))}, -925397906, 925397910, (int) System.currentTimeMillis());
                int i25 = f54456t0;
                int i26 = i25 & 89;
                int i27 = -(-(i25 | 89));
                int i28 = (i26 & i27) + (i27 | i26);
                f54457u0 = i28 % 128;
                int i29 = i28 % 2;
                return null;
            case 3:
                bce bceVar2 = (bce) objArr[0];
                int i30 = f54457u0;
                int i31 = i30 & 41;
                int i32 = (i30 ^ 41) | i31;
                int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                f54456t0 = i33 % 128;
                if (i33 % 2 != 0) {
                    String str = bceVar2.f54459q0;
                    throw null;
                }
                String str2 = bceVar2.f54459q0;
                int i34 = i30 & 1;
                int i35 = (i30 | 1) & (~i34);
                int i36 = -(-(i34 << 1));
                int i37 = (i35 & i36) + (i36 | i35);
                f54456t0 = i37 % 128;
                int i38 = i37 % 2;
                return str2;
            case 4:
                bce bceVar3 = (bce) objArr[0];
                Object obj = objArr[1];
                int i39 = f54456t0;
                int i40 = i39 & 83;
                int i41 = -(-(i39 | 83));
                int i42 = (i40 & i41) + (i40 | i41);
                int i43 = i42 % 128;
                f54457u0 = i43;
                if (i42 % 2 == 0) {
                    throw null;
                }
                if (obj == bceVar3) {
                    int i44 = ((i39 ^ 105) | (i39 & 105)) << 1;
                    int i45 = -((i39 & (-106)) | ((~i39) & 105));
                    int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
                    f54457u0 = i46 % 128;
                    boolValueOf = Boolean.valueOf(i46 % 2 != 0);
                } else if (obj instanceof bce) {
                    int i47 = ((i43 | 85) << 1) - (i43 ^ 85);
                    f54456t0 = i47 % 128;
                    bce bceVar4 = (bce) obj;
                    if (i47 % 2 != 0) {
                        ((Boolean) bek.setOnFocusChangeListener(new Object[]{(byte[]) setDividerPadding(new Object[]{bceVar3}, -1779090879, 1779090884, System.identityHashCode(bceVar3)), (byte[]) setDividerPadding(new Object[]{bceVar4}, -1779090879, 1779090884, System.identityHashCode(bceVar4))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    boolValueOf = Boolean.valueOf(((Boolean) bek.setOnFocusChangeListener(new Object[]{(byte[]) setDividerPadding(new Object[]{bceVar3}, -1779090879, 1779090884, System.identityHashCode(bceVar3)), (byte[]) setDividerPadding(new Object[]{bceVar4}, -1779090879, 1779090884, System.identityHashCode(bceVar4))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue());
                } else {
                    int i48 = ((i43 ^ 73) - (~(-(-((i43 & 73) << 1))))) - 1;
                    f54456t0 = i48 % 128;
                    int i49 = i48 % 2;
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
            case 5:
                bce bceVar5 = (bce) objArr[0];
                int i50 = f54456t0;
                int i51 = i50 ^ 11;
                int i52 = (i50 & 11) << 1;
                int i53 = (i51 & i52) + (i52 | i51);
                int i54 = i53 % 128;
                f54457u0 = i54;
                int i55 = i53 % 2;
                if (bceVar5.f54460r0 == null) {
                    int i56 = (i54 & 119) + (i54 | 119);
                    f54456t0 = i56 % 128;
                    int i57 = i56 % 2;
                    bceVar5.f54460r0 = (byte[]) bdd.setOnFocusChangeListener(new Object[]{bceVar5.f54458p0, bceVar5.f54461s0}, -1270303781, 1270303784, (int) System.currentTimeMillis());
                    int i58 = f54456t0;
                    int i59 = i58 & 41;
                    int i60 = ((i58 | 41) & (~i59)) + (i59 << 1);
                    f54457u0 = i60 % 128;
                    int i61 = i60 % 2;
                }
                byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{bceVar5.f54460r0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i62 = f54457u0;
                int i63 = (i62 ^ 43) + ((i62 & 43) << 1);
                f54456t0 = i63 % 128;
                if (i63 % 2 == 0) {
                    return bArr;
                }
                int i64 = 93 / 0;
                return bArr;
            case 6:
                bce bceVar6 = (bce) objArr[0];
                int i65 = f54456t0;
                int i66 = i65 & 67;
                int i67 = i65 | 67;
                int i68 = (i66 & i67) + (i67 | i66);
                f54457u0 = i68 % 128;
                if (i68 % 2 == 0) {
                    ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) setDividerPadding(new Object[]{bceVar6}, -1779090879, 1779090884, System.identityHashCode(bceVar6))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                    throw null;
                }
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) setDividerPadding(new Object[]{bceVar6}, -1779090879, 1779090884, System.identityHashCode(bceVar6))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i69 = f54456t0;
                int i70 = (i69 ^ 21) + ((i69 & 21) << 1);
                f54457u0 = i70 % 128;
                int i71 = i70 % 2;
                return Integer.valueOf(iIntValue);
            default:
                bce bceVar7 = (bce) objArr[0];
                ahw ahwVar = (ahw) objArr[1];
                int i72 = f54457u0;
                int i73 = (((i72 | 62) << 1) - (i72 ^ 62)) - 1;
                f54456t0 = i73 % 128;
                if (i73 % 2 != 0) {
                    setDividerPadding(new Object[]{bceVar7, (axb) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis())), (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar))}, 1216782593, -1216782591, System.identityHashCode(bceVar7));
                    throw null;
                }
                setDividerPadding(new Object[]{bceVar7, (axb) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis())), (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar))}, 1216782593, -1216782591, System.identityHashCode(bceVar7));
                int i74 = f54457u0;
                int i75 = (((i74 | 34) << 1) - (i74 ^ 34)) - 1;
                f54456t0 = i75 % 128;
                int i76 = i75 % 2;
                return null;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54457u0 + 12;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f54456t0 = i11 % 128;
        int i12 = i11 % 2;
        objectOutputStream.defaultWriteObject();
        if (i12 != 0) {
            objectOutputStream.writeObject((byte[]) setDividerPadding(new Object[]{this}, -1779090879, 1779090884, System.identityHashCode(this)));
            int i13 = 0 / 0;
        } else {
            objectOutputStream.writeObject((byte[]) setDividerPadding(new Object[]{this}, -1779090879, 1779090884, System.identityHashCode(this)));
        }
        int i14 = f54457u0;
        int i15 = (((i14 | 73) << 1) - (~(-(i14 ^ 73)))) - 1;
        f54456t0 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 508338603, -508338599, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setDividerPadding(new Object[]{this}, -1095997784, 1095997787, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1779090879, 1779090884, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setDividerPadding(new Object[]{this}, 1947416164, -1947416163, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 564421315, -564421309, System.identityHashCode(this))).intValue();
    }
}
