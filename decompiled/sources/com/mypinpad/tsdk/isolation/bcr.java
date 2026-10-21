package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes10.dex */
public final class bcr implements bbw, PrivateKey {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54505r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54506s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient aym f54507p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient aee f54508q0;

    public bcr(ahw ahwVar) throws IOException {
        setDividerPadding(new Object[]{this, ahwVar}, 659944486, -659944483, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54506s0;
        int i11 = ((i10 & 94) + (i10 | 94)) - 1;
        f54505r0 = i11 % 128;
        int i12 = i11 % 2;
        objectInputStream.defaultReadObject();
        setDividerPadding(new Object[]{this, (ahw) ahw.setX(new Object[]{(byte[]) objectInputStream.readObject()}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, 659944486, -659944483, System.identityHashCode(this));
        int i13 = f54505r0;
        int i14 = (i13 & (-64)) | ((~i13) & 63);
        int i15 = (i13 & 63) << 1;
        int i16 = (i14 & i15) + (i15 | i14);
        f54506s0 = i16 % 128;
        int i17 = i16 % 2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Boolean boolValueOf;
        int iIntValue;
        int i13 = (i11 * (-500)) + (i10 * (-500));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~i10;
        int i17 = ((~(i16 | (~i12) | i11)) * 501) + ((~(i14 | i16)) * 1002) + ((i15 | (~(i16 | i11 | i12))) * 501) + i13;
        if (i17 == 1) {
            int i18 = f54505r0;
            int i19 = ~i18;
            int i20 = (i18 & (-62)) | (61 & i19);
            int i21 = (i18 & 61) << 1;
            int i22 = (i20 & i21) + (i20 | i21);
            f54506s0 = i22 % 128;
            int i23 = i22 % 2;
            int i24 = ((i18 ^ 3) | (i18 & 3)) << 1;
            int i25 = -((i18 & (-4)) | (3 & i19));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            f54506s0 = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 77 / 0;
            }
            return "NTRU";
        }
        if (i17 == 2) {
            int i28 = f54505r0;
            int i29 = i28 ^ 105;
            int i30 = ((i28 & 105) | i29) << 1;
            int i31 = -i29;
            int i32 = (i30 & i31) + (i30 | i31);
            int i33 = i32 % 128;
            f54506s0 = i33;
            if (i32 % 2 == 0) {
                throw null;
            }
            int i34 = (i33 & (-14)) | ((~i33) & 13);
            int i35 = (i33 & 13) << 1;
            int i36 = (i34 & i35) + (i35 | i34);
            f54505r0 = i36 % 128;
            if (i36 % 2 == 0) {
                return "PKCS#8";
            }
            throw null;
        }
        if (i17 == 3) {
            bcr bcrVar = (bcr) objArr[0];
            ahw ahwVar = (ahw) objArr[1];
            int i37 = f54505r0;
            int i38 = i37 & 65;
            int i39 = ((((i37 ^ 65) | i38) << 1) - (~(-((i37 | 65) & (~i38))))) - 1;
            f54506s0 = i39 % 128;
            int i40 = i39 % 2;
            bcrVar.f54508q0 = (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar));
            bcrVar.f54507p0 = (aym) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis()));
            int i41 = f54505r0;
            int i42 = (i41 ^ 115) + ((i41 & 115) << 1);
            f54506s0 = i42 % 128;
            if (i42 % 2 != 0) {
                return null;
            }
            int i43 = 35 / 0;
            return null;
        }
        if (i17 != 4) {
            if (i17 != 5) {
                bcr bcrVar2 = (bcr) objArr[0];
                int i44 = f54506s0 + 73;
                f54505r0 = i44 % 128;
                int i45 = i44 % 2;
                aym aymVar = bcrVar2.f54507p0;
                if (i45 != 0) {
                    iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) aym.setX(new Object[]{aymVar}, 204982284, -204982283, System.identityHashCode(aymVar))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                    int i46 = 1 / 0;
                } else {
                    iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) aym.setX(new Object[]{aymVar}, 204982284, -204982283, System.identityHashCode(aymVar))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                }
                return Integer.valueOf(iIntValue);
            }
            bcr bcrVar3 = (bcr) objArr[0];
            int i47 = f54506s0 + 15;
            f54505r0 = i47 % 128;
            int i48 = i47 % 2;
            try {
                byte[] alwaysDrawnWithCacheEnabled = ((ahw) bab.setY(new Object[]{bcrVar3.f54507p0, bcrVar3.f54508q0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                int i49 = f54506s0;
                int i50 = ((i49 | 107) << 1) - (i49 ^ 107);
                f54505r0 = i50 % 128;
                int i51 = i50 % 2;
                return alwaysDrawnWithCacheEnabled;
            } catch (IOException unused) {
                return null;
            }
        }
        bcr bcrVar4 = (bcr) objArr[0];
        Object obj = objArr[1];
        int i52 = f54506s0;
        int i53 = i52 & 69;
        int i54 = (~i53) & (i52 | 69);
        int i55 = i53 << 1;
        int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
        int i57 = i56 % 128;
        f54505r0 = i57;
        int i58 = i56 % 2;
        if (obj == bcrVar4) {
            int i59 = i57 & 63;
            int i60 = (i59 - (~(-(-((i57 ^ 63) | i59))))) - 1;
            int i61 = i60 % 128;
            f54506s0 = i61;
            int i62 = i60 % 2;
            int i63 = i61 & 65;
            int i64 = -(-((i61 ^ 65) | i63));
            int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
            f54505r0 = i65 % 128;
            if (i65 % 2 != 0) {
                throw null;
            }
            boolValueOf = Boolean.TRUE;
        } else if (!(obj instanceof bcr)) {
            int i66 = i57 & 95;
            int i67 = (i66 - (~(-(-((i57 ^ 95) | i66))))) - 1;
            f54506s0 = i67 % 128;
            int i68 = i67 % 2;
            boolValueOf = Boolean.FALSE;
        } else {
            int i69 = (-2) - ((((i52 | 94) << 1) - (i52 ^ 94)) ^ (-1));
            f54505r0 = i69 % 128;
            int i70 = i69 % 2;
            aym aymVar2 = bcrVar4.f54507p0;
            byte[] bArr = (byte[]) aym.setX(new Object[]{aymVar2}, 204982284, -204982283, System.identityHashCode(aymVar2));
            aym aymVar3 = ((bcr) obj).f54507p0;
            boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) aym.setX(new Object[]{aymVar3}, 204982284, -204982283, System.identityHashCode(aymVar3))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
            int i71 = f54505r0 + 55;
            f54506s0 = i71 % 128;
            if (i71 % 2 == 0) {
                throw null;
            }
            boolValueOf = Boolean.valueOf(zBooleanValue);
        }
        return boolValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = ((-1) << 1) - ((f54505r0 + 42) ^ (-1));
        f54506s0 = i10 % 128;
        int i11 = i10 % 2;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject((byte[]) setDividerPadding(new Object[]{this}, 128793274, -128793269, System.identityHashCode(this)));
        int i12 = f54506s0;
        int i13 = (i12 & 19) + (i12 | 19);
        f54505r0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 201539039, -201539035, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setDividerPadding(new Object[]{this}, 2049374973, -2049374972, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setDividerPadding(new Object[]{this}, 128793274, -128793269, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setDividerPadding(new Object[]{this}, -1565917570, 1565917572, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 2049889135, -2049889135, System.identityHashCode(this))).intValue();
    }
}
