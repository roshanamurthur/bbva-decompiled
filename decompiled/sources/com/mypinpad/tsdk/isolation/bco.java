package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bco implements bbs {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54497r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54498s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient aye f54499p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient aee f54500q0;

    public bco(ahw ahwVar) throws IOException {
        setX(new Object[]{this, ahwVar}, -979810127, 979810128, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54498s0;
        int i11 = i10 & 77;
        int i12 = (i11 - (~((i10 ^ 77) | i11))) - 1;
        f54497r0 = i12 % 128;
        int i13 = i12 % 2;
        objectInputStream.defaultReadObject();
        setX(new Object[]{this, (ahw) ahw.setX(new Object[]{(byte[]) objectInputStream.readObject()}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, -979810127, 979810128, System.identityHashCode(this));
        int i14 = f54498s0;
        int i15 = (i14 & (-106)) | ((~i14) & 105);
        int i16 = -(-((i14 & 105) << 1));
        int i17 = (i15 & i16) + (i16 | i15);
        f54497r0 = i17 % 128;
        int i18 = i17 % 2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Boolean boolValueOf;
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i11)) | (~(i12 | i13))) * 49) + (((~((~i10) | i14)) | i13 | (~(i10 | i12))) * (-49)) + (((~(i13 | i14)) | (~(i13 | i10))) * 98) + (i11 * (-97)) + (i10 * 50);
        if (i15 == 1) {
            bco bcoVar = (bco) objArr[0];
            ahw ahwVar = (ahw) objArr[1];
            int i16 = f54497r0;
            int i17 = (i16 ^ 25) + ((i16 & 25) << 1);
            f54498s0 = i17 % 128;
            int i18 = i17 % 2;
            bcoVar.f54500q0 = (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar));
            bcoVar.f54499p0 = (aye) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis()));
            int i19 = f54497r0;
            int i20 = i19 & 17;
            int i21 = ((i19 ^ 17) | i20) << 1;
            int i22 = -((i19 | 17) & (~i20));
            int i23 = (i21 & i22) + (i22 | i21);
            f54498s0 = i23 % 128;
            if (i23 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i15 == 2) {
            bco bcoVar2 = (bco) objArr[0];
            int i24 = f54498s0;
            int i25 = i24 & 95;
            int i26 = -(-(i24 | 95));
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f54497r0 = i27 % 128;
            int i28 = i27 % 2;
            aye ayeVar = bcoVar2.f54499p0;
            int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(short[]) aye.setCompoundDrawableTintBlendMode(new Object[]{ayeVar}, 2124642337, -2124642337, System.identityHashCode(ayeVar))}, -2022403238, 2022403264, (int) System.currentTimeMillis())).intValue();
            int i29 = f54497r0;
            int i30 = i29 & 51;
            int i31 = ((((i29 ^ 51) | i30) << 1) - (~(-((i29 | 51) & (~i30))))) - 1;
            f54498s0 = i31 % 128;
            int i32 = i31 % 2;
            return Integer.valueOf(iIntValue);
        }
        if (i15 != 3) {
            if (i15 == 4) {
                int i33 = f54498s0 + 77;
                int i34 = i33 % 128;
                f54497r0 = i34;
                int i35 = i33 % 2;
                int i36 = i34 & 29;
                int i37 = -(-(i34 | 29));
                int i38 = (i36 & i37) + (i36 | i37);
                f54498s0 = i38 % 128;
                if (i38 % 2 == 0) {
                    int i39 = 76 / 0;
                }
                return "NH";
            }
            if (i15 == 5) {
                int i40 = f54498s0 + 59;
                f54497r0 = i40 % 128;
                if (i40 % 2 != 0) {
                    int i41 = 17 / 0;
                }
                return "PKCS#8";
            }
            bco bcoVar3 = (bco) objArr[0];
            int i42 = f54498s0;
            int i43 = (((i42 | 108) << 1) - (i42 ^ 108)) - 1;
            f54497r0 = i43 % 128;
            try {
                if (i43 % 2 == 0) {
                    return ((ahw) bab.setY(new Object[]{bcoVar3.f54499p0, bcoVar3.f54500q0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                }
                ((ahw) bab.setY(new Object[]{bcoVar3.f54499p0, bcoVar3.f54500q0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                throw null;
            } catch (IOException unused) {
                return null;
            }
        }
        bco bcoVar4 = (bco) objArr[0];
        Object obj = objArr[1];
        int i44 = f54498s0;
        int i45 = ((i44 & 14) + (i44 | 14)) - 1;
        int i46 = i45 % 128;
        f54497r0 = i46;
        if (i45 % 2 != 0) {
            boolean z10 = obj instanceof bco;
            throw null;
        }
        if (obj instanceof bco) {
            aye ayeVar2 = bcoVar4.f54499p0;
            short[] sArr = (short[]) aye.setCompoundDrawableTintBlendMode(new Object[]{ayeVar2}, 2124642337, -2124642337, System.identityHashCode(ayeVar2));
            aye ayeVar3 = ((bco) obj).f54499p0;
            boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{sArr, (short[]) aye.setCompoundDrawableTintBlendMode(new Object[]{ayeVar3}, 2124642337, -2124642337, System.identityHashCode(ayeVar3))}, 225655275, -225655270, (int) System.currentTimeMillis())).booleanValue();
            int i47 = f54498s0;
            int i48 = (i47 & 65) + (i47 | 65);
            f54497r0 = i48 % 128;
            if (i48 % 2 != 0) {
                throw null;
            }
            boolValueOf = Boolean.valueOf(zBooleanValue);
        } else {
            int i49 = i46 & 77;
            int i50 = ((i46 ^ 77) | i49) << 1;
            int i51 = -((~i49) & (i46 | 77));
            int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
            int i53 = i52 % 128;
            f54498s0 = i53;
            int i54 = i52 % 2;
            int i55 = i53 & 5;
            int i56 = ((i53 ^ 5) | i55) << 1;
            int i57 = -((i53 | 5) & (~i55));
            int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
            f54497r0 = i58 % 128;
            if (i58 % 2 != 0) {
                int i59 = 33 / 0;
            }
            boolValueOf = Boolean.FALSE;
        }
        return boolValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54497r0 + 97;
        f54498s0 = i10 % 128;
        int i11 = i10 % 2;
        objectOutputStream.defaultWriteObject();
        if (i11 == 0) {
            objectOutputStream.writeObject((byte[]) setX(new Object[]{this}, -180164533, 180164533, System.identityHashCode(this)));
            throw null;
        }
        objectOutputStream.writeObject((byte[]) setX(new Object[]{this}, -180164533, 180164533, System.identityHashCode(this)));
        int i12 = f54497r0;
        int i13 = (i12 & 41) + (i12 | 41);
        f54498s0 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, 1653438086, -1653438083, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setX(new Object[]{this}, 1032540249, -1032540245, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setX(new Object[]{this}, -180164533, 180164533, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setX(new Object[]{this}, -1229278248, 1229278253, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -1774550170, 1774550172, System.identityHashCode(this))).intValue();
    }
}
