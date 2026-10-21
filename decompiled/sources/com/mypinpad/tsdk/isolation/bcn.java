package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes10.dex */
public final class bcn implements bbq, PrivateKey {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54493r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54494s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient ayc f54495p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient aee f54496q0;

    public bcn(ahw ahwVar) throws IOException {
        setY(new Object[]{this, ahwVar}, 1360097192, -1360097188, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54493r0;
        int i11 = ((i10 | 99) << 1) - (i10 ^ 99);
        f54494s0 = i11 % 128;
        int i12 = i11 % 2;
        objectInputStream.defaultReadObject();
        setY(new Object[]{this, (ahw) ahw.setX(new Object[]{(byte[]) objectInputStream.readObject()}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, 1360097192, -1360097188, System.identityHashCode(this));
        int i13 = f54494s0 + 53;
        f54493r0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Boolean boolValueOf;
        int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13;
        if (i16 == 1) {
            bcn bcnVar = (bcn) objArr[0];
            int i17 = f54493r0 + 77;
            f54494s0 = i17 % 128;
            try {
                if (i17 % 2 == 0) {
                    ((ahw) bab.setY(new Object[]{bcnVar.f54495p0, bcnVar.f54496q0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                    throw null;
                }
                byte[] alwaysDrawnWithCacheEnabled = ((ahw) bab.setY(new Object[]{bcnVar.f54495p0, bcnVar.f54496q0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                int i18 = f54494s0;
                int i19 = ((i18 | 68) << 1) - (i18 ^ 68);
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                f54493r0 = i20 % 128;
                int i21 = i20 % 2;
                return alwaysDrawnWithCacheEnabled;
            } catch (IOException unused) {
                return null;
            }
        }
        if (i16 == 2) {
            bcn bcnVar2 = (bcn) objArr[0];
            Object obj = objArr[1];
            int i22 = f54494s0;
            int i23 = ((i22 ^ 60) + ((i22 & 60) << 1)) - 1;
            int i24 = i23 % 128;
            f54493r0 = i24;
            int i25 = i23 % 2;
            if (obj == bcnVar2) {
                int i26 = ((i24 & 38) + (i24 | 38)) - 1;
                int i27 = i26 % 128;
                f54494s0 = i27;
                boolean z10 = i26 % 2 != 0;
                int i28 = ((((i27 ^ 85) | (i27 & 85)) << 1) - (~(-(((~i27) & 85) | (i27 & (-86)))))) - 1;
                f54493r0 = i28 % 128;
                int i29 = i28 % 2;
                boolValueOf = Boolean.valueOf(z10);
            } else if (obj instanceof bcn) {
                int i30 = i22 & 39;
                int i31 = i30 + ((i22 ^ 39) | i30);
                f54493r0 = i31 % 128;
                bcn bcnVar3 = (bcn) obj;
                try {
                    if (i31 % 2 != 0) {
                        ((Boolean) bek.setOnFocusChangeListener(new Object[]{bcnVar2.f54495p0.setAlwaysDrawnWithCacheEnabled(), bcnVar3.f54495p0.setAlwaysDrawnWithCacheEnabled()}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{bcnVar2.f54495p0.setAlwaysDrawnWithCacheEnabled(), bcnVar3.f54495p0.setAlwaysDrawnWithCacheEnabled()}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i32 = f54493r0;
                    int i33 = ((i32 & (-74)) | ((~i32) & 73)) + ((i32 & 73) << 1);
                    f54494s0 = i33 % 128;
                    int i34 = i33 % 2;
                    boolValueOf = Boolean.valueOf(zBooleanValue);
                } catch (IOException unused2) {
                    throw new IllegalStateException("unable to perform equals");
                }
            } else {
                int i35 = i24 & 117;
                int i36 = (~i35) & (i24 | 117);
                int i37 = -(-(i35 << 1));
                int i38 = (i36 & i37) + (i37 | i36);
                f54494s0 = i38 % 128;
                if (i38 % 2 == 0) {
                    int i39 = 66 / 0;
                }
                boolValueOf = Boolean.FALSE;
            }
            return boolValueOf;
        }
        if (i16 == 3) {
            bcn bcnVar4 = (bcn) objArr[0];
            int i40 = f54494s0 + 57;
            f54493r0 = i40 % 128;
            try {
                if (i40 % 2 == 0) {
                    return Integer.valueOf(((Integer) bek.setOnFocusChangeListener(new Object[]{bcnVar4.f54495p0.setAlwaysDrawnWithCacheEnabled()}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue());
                }
                ((Integer) bek.setOnFocusChangeListener(new Object[]{bcnVar4.f54495p0.setAlwaysDrawnWithCacheEnabled()}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                throw null;
            } catch (IOException unused3) {
                throw new IllegalStateException("unable to calculate hashCode");
            }
        }
        if (i16 == 4) {
            bcn bcnVar5 = (bcn) objArr[0];
            ahw ahwVar = (ahw) objArr[1];
            int i41 = f54493r0;
            int i42 = i41 & 95;
            int i43 = -(-((i41 ^ 95) | i42));
            int i44 = (i42 & i43) + (i43 | i42);
            f54494s0 = i44 % 128;
            int i45 = i44 % 2;
            bcnVar5.f54496q0 = (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar));
            bcnVar5.f54495p0 = (ayc) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis()));
            int i46 = f54494s0;
            int i47 = (i46 | 3) << 1;
            int i48 = -(((~i46) & 3) | (i46 & (-4)));
            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
            f54493r0 = i49 % 128;
            if (i49 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i16 != 5) {
            int i50 = f54494s0;
            int i51 = ((i50 | 1) << 1) - (i50 ^ 1);
            f54493r0 = i51 % 128;
            if (i51 % 2 == 0) {
                return "PKCS#8";
            }
            throw null;
        }
        bcn bcnVar6 = (bcn) objArr[0];
        int iIdentityHashCode = System.identityHashCode(bcnVar6);
        int i52 = ~iIdentityHashCode;
        int i53 = ~((-74264540) | i52);
        int i54 = (-565918210) - (~(((i53 & 6303000) | (6303000 ^ i53)) * 168));
        int i55 = (~(((-6303001) & iIdentityHashCode) | ((-6303001) ^ iIdentityHashCode))) * 168;
        int i56 = i54 & i55;
        int i57 = (i55 | i54) & (~i56);
        int i58 = i56 << 1;
        int i59 = (i57 ^ i58) + ((i57 & i58) << 1);
        int i60 = ((~i52) & (-57716029)) | (57716028 & i52);
        int i61 = i52 & (-57716029);
        int i62 = ~((i61 & i60) | (i60 ^ i61));
        int i63 = i62 ^ 51413028;
        int i64 = i62 & 51413028;
        int i65 = (i64 & i63) | (i63 ^ i64);
        int i66 = (iIdentityHashCode & (-67961540)) | ((-67961540) ^ iIdentityHashCode);
        int i67 = ~i66;
        int i68 = (i66 | i67) & i67;
        int i69 = ((~i68) & i65) | ((~i65) & i68);
        int i70 = i68 & i65;
        int i71 = -(-(((i70 & i69) | (i69 ^ i70)) * 168));
        int i72 = i59 & i71;
        int i73 = -(-((i71 ^ i59) | i72));
        int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
        int iIdentityHashCode2 = System.identityHashCode(bcnVar6);
        int i75 = ~iIdentityHashCode2;
        int i76 = (411904790 & iIdentityHashCode2) | (411904790 & i75) | (iIdentityHashCode2 & (-411904791));
        int i77 = ~i76;
        int i78 = (i76 | i77) & i77;
        int i79 = (i75 | iIdentityHashCode2) & i75;
        int i80 = (i79 & (-2089850772)) | ((~i79) & 2089850771);
        int i81 = i79 & 2089850771;
        int i82 = ~((i81 & i80) | (i80 ^ i81));
        int i83 = ((~i82) & i78) | ((~i78) & i82);
        int i84 = i78 & i82;
        int i85 = (((i84 & i83) | (i83 ^ i84)) * (-1808)) - 756284372;
        int i86 = ~(((-1678808194) & iIdentityHashCode2) | ((-1678808194) & i75) | (1678808193 & iIdentityHashCode2));
        int i87 = i75 ^ (-411904791);
        int i88 = i75 & (-411904791);
        int i89 = (i87 & i88) | (i87 ^ i88);
        int i90 = (i89 & (-2089850772)) | ((~i89) & 2089850771);
        int i91 = i89 & 2089850771;
        int i92 = ~((i91 & i90) | (i90 ^ i91));
        int i93 = i86 & i92;
        int i94 = (((i86 | i92) & (~i93)) | i93) * 904;
        int i95 = i85 & i94;
        int i96 = ((i85 ^ i94) | i95) << 1;
        int i97 = -((i85 | i94) & (~i95));
        int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
        int i99 = (-2089850772) ^ iIdentityHashCode2;
        int i100 = iIdentityHashCode2 & (-2089850772);
        int i101 = ~((i100 & i99) | (i99 ^ i100));
        int i102 = (i101 & (-2090712984)) | ((~i101) & (-2090712984)) | (2090712983 & i101);
        int i103 = (i75 | (-411904791)) & (~i88);
        int i104 = ~((i103 & i88) | (i103 ^ i88));
        if (i74 > (i98 - (~(((i102 & i104) | (((~i104) & i102) | ((~i102) & i104))) * 904))) - 1) {
            int i105 = 90 / 0;
        }
        return "LMS";
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54494s0 + 93;
        f54493r0 = i10 % 128;
        int i11 = i10 % 2;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject((byte[]) setY(new Object[]{this}, -1366670302, 1366670303, System.identityHashCode(this)));
        int i12 = f54494s0;
        int i13 = ((i12 & (-2)) | ((~i12) & 1)) + ((i12 & 1) << 1);
        f54493r0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, 1424923390, -1424923388, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setY(new Object[]{this}, 1849973948, -1849973943, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setY(new Object[]{this}, -1366670302, 1366670303, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setY(new Object[]{this}, -527218566, 527218566, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -382511741, 382511744, System.identityHashCode(this))).intValue();
    }
}
