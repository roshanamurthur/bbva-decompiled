package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bcm implements bbo {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54489s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient awz f54490p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient String f54491q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient aee f54492r0;

    public bcm(ahw ahwVar) throws IOException {
        setDividerPadding(new Object[]{this, ahwVar}, 449457437, -449457433, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54489s0;
        int i11 = (i10 & 75) + (i10 | 75);
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        objectInputStream.defaultReadObject();
        setDividerPadding(new Object[]{this, (ahw) ahw.setX(new Object[]{(byte[]) objectInputStream.readObject()}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, 449457437, -449457433, System.identityHashCode(this));
        int i14 = f54489s0;
        int i15 = (i14 & 111) + (i14 | 111);
        int i16 = i15 % 128;
        int i17 = i15 % 2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ((i14 | i11) * 629) + ((~(i13 | i14)) * (-629)) + (i13 * (-629)) + (i11 * (-628)) + (i10 * 630);
        if (i15 == 1) {
            int i16 = f54489s0;
            int i17 = i16 & 79;
            int i18 = i17 + ((i16 ^ 79) | i17);
            int i19 = i18 % 128;
            if (i18 % 2 != 0) {
                int i20 = 89 / 0;
            }
            return "PKCS#8";
        }
        if (i15 == 2) {
            objValueOf = null;
            bcm bcmVar = (bcm) objArr[0];
            int i21 = f54489s0;
            int i22 = i21 | 105;
            int i23 = ((i22 << 1) - (~(-((~(i21 & 105)) & i22)))) - 1;
            int i24 = i23 % 128;
            int i25 = i23 % 2;
            try {
                byte[] alwaysDrawnWithCacheEnabled = ((ahw) bab.setY(new Object[]{bcmVar.f54490p0, bcmVar.f54492r0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                int i26 = f54489s0;
                int i27 = ((i26 ^ 19) | (i26 & 19)) << 1;
                int i28 = -(((~i26) & 19) | (i26 & (-20)));
                int i29 = (i27 & i28) + (i28 | i27);
                int i30 = i29 % 128;
                int i31 = i29 % 2;
                return alwaysDrawnWithCacheEnabled;
            } catch (IOException unused) {
            }
        } else if (i15 == 3) {
            bcm bcmVar2 = (bcm) objArr[0];
            int i32 = f54489s0;
            int i33 = i32 & 7;
            int i34 = ((i32 ^ 7) | i33) << 1;
            int i35 = -((i32 | 7) & (~i33));
            int i36 = (i34 & i35) + (i34 | i35);
            int i37 = i36 % 128;
            int i38 = i36 % 2;
            objValueOf = bcmVar2.f54491q0;
            if (i38 != 0) {
                int i39 = 53 / 0;
            }
        } else {
            if (i15 == 4) {
                bcm bcmVar3 = (bcm) objArr[0];
                ahw ahwVar = (ahw) objArr[1];
                int i40 = f54489s0;
                int i41 = i40 ^ 61;
                int i42 = -(-((i40 & 61) << 1));
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                int i44 = i43 % 128;
                if (i43 % 2 != 0) {
                    bcmVar3.f54492r0 = (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar));
                    awz awzVar = (awz) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis()));
                    bcmVar3.f54490p0 = awzVar;
                    aww awwVar = (aww) awx.setCompoundDrawableTintBlendMode(new Object[]{awzVar}, 1369349888, -1369349888, System.identityHashCode(awzVar));
                    bcmVar3.f54491q0 = (String) bez.setX(new Object[]{(String) aww.setY(new Object[]{awwVar}, -909497264, 909497264, System.identityHashCode(awwVar))}, -925397906, 925397910, (int) System.currentTimeMillis());
                    throw null;
                }
                bcmVar3.f54492r0 = (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar));
                awz awzVar2 = (awz) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis()));
                bcmVar3.f54490p0 = awzVar2;
                aww awwVar2 = (aww) awx.setCompoundDrawableTintBlendMode(new Object[]{awzVar2}, 1369349888, -1369349888, System.identityHashCode(awzVar2));
                bcmVar3.f54491q0 = (String) bez.setX(new Object[]{(String) aww.setY(new Object[]{awwVar2}, -909497264, 909497264, System.identityHashCode(awwVar2))}, -925397906, 925397910, (int) System.currentTimeMillis());
                int i45 = f54489s0;
                int i46 = i45 & 45;
                int i47 = i46 + ((i45 ^ 45) | i46);
                int i48 = i47 % 128;
                int i49 = i47 % 2;
                return null;
            }
            if (i15 != 5) {
                bcm bcmVar4 = (bcm) objArr[0];
                int i50 = f54489s0;
                int i51 = i50 & 75;
                int i52 = ((i50 ^ 75) | i51) << 1;
                int i53 = -((i50 | 75) & (~i51));
                int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                int i55 = i54 % 128;
                int i56 = i54 % 2;
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) setDividerPadding(new Object[]{bcmVar4}, 1951029008, -1951029006, System.identityHashCode(bcmVar4))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i57 = f54489s0 + 33;
                int i58 = i57 % 128;
                int i59 = i57 % 2;
                return Integer.valueOf(iIntValue);
            }
            bcm bcmVar5 = (bcm) objArr[0];
            Object obj = objArr[1];
            int i60 = f54489s0;
            int i61 = ((i60 ^ 93) | (i60 & 93)) << 1;
            int i62 = -((i60 & (-94)) | ((~i60) & 93));
            int i63 = (i61 & i62) + (i61 | i62);
            int i64 = i63 % 128;
            int i65 = i63 % 2;
            if (obj == bcmVar5) {
                int i66 = i60 & 57;
                int i67 = (((i60 ^ 57) | i66) << 1) - ((~i66) & (i60 | 57));
                int i68 = i67 % 128;
                int i69 = i67 % 2;
                int i70 = i60 & 31;
                int i71 = (~i70) & (i60 | 31);
                int i72 = i70 << 1;
                int i73 = (i71 & i72) + (i72 | i71);
                int i74 = i73 % 128;
                int i75 = i73 % 2;
                objValueOf = Boolean.TRUE;
            } else if (!(!(obj instanceof bcm))) {
                int i76 = (i60 ^ 49) + ((i60 & 49) << 1);
                int i77 = i76 % 128;
                bcm bcmVar6 = (bcm) obj;
                if (i76 % 2 != 0) {
                    ((Boolean) bek.setOnFocusChangeListener(new Object[]{(byte[]) setDividerPadding(new Object[]{bcmVar5}, 1951029008, -1951029006, System.identityHashCode(bcmVar5)), (byte[]) setDividerPadding(new Object[]{bcmVar6}, 1951029008, -1951029006, System.identityHashCode(bcmVar6))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                objValueOf = Boolean.valueOf(((Boolean) bek.setOnFocusChangeListener(new Object[]{(byte[]) setDividerPadding(new Object[]{bcmVar5}, 1951029008, -1951029006, System.identityHashCode(bcmVar5)), (byte[]) setDividerPadding(new Object[]{bcmVar6}, 1951029008, -1951029006, System.identityHashCode(bcmVar6))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue());
            } else {
                int i78 = (i64 | 65) << 1;
                int i79 = -((i64 & (-66)) | ((~i64) & 65));
                int i80 = ((i78 | i79) << 1) - (i78 ^ i79);
                f54489s0 = i80 % 128;
                int i81 = i80 % 2;
                objValueOf = Boolean.FALSE;
            }
        }
        return objValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54489s0;
        int i11 = i10 ^ 119;
        int i12 = ((((i10 & 119) | i11) << 1) - (~(-i11))) - 1;
        int i13 = i12 % 128;
        int i14 = i12 % 2;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject((byte[]) setDividerPadding(new Object[]{this}, 1951029008, -1951029006, System.identityHashCode(this)));
        int i15 = f54489s0 + 53;
        int i16 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1201542541, -1201542536, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setDividerPadding(new Object[]{this}, -1133065722, 1133065725, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1951029008, -1951029006, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setDividerPadding(new Object[]{this}, -1570465658, 1570465659, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 770725865, -770725865, System.identityHashCode(this))).intValue();
    }
}
