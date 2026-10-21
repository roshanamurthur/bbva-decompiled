package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes10.dex */
public final class bcz implements bbv, PrivateKey {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54530r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54531s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient azy f54532p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient aee f54533q0;

    public bcz(ahw ahwVar) throws IOException {
        setDividerPadding(new Object[]{this, ahwVar}, 1038003161, -1038003161, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = ((-1) << 1) - ((f54531s0 + 28) ^ (-1));
        f54530r0 = i10 % 128;
        int i11 = i10 % 2;
        objectInputStream.defaultReadObject();
        setDividerPadding(new Object[]{this, (ahw) ahw.setX(new Object[]{(byte[]) objectInputStream.readObject()}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, 1038003161, -1038003161, System.identityHashCode(this));
        int i12 = f54530r0;
        int i13 = ((-1) << 1) - (((i12 & 126) + (i12 | 126)) ^ (-1));
        f54531s0 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0130  */
    /* JADX WARN: Code duplicated, block: B:41:0x013f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0144  */
    /* JADX WARN: Code duplicated, block: B:45:0x0148  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b1  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        Object objValueOf;
        int i14;
        int i15 = (i11 * 253) + (i10 * 253);
        int i16 = ~i10;
        int i17 = ~i11;
        int i18 = ~(i16 | i17);
        int i19 = i17 | (~i12);
        int i20 = i18 | (~i19);
        int i21 = i11 | i10;
        int i22 = ~(i12 | i21);
        int i23 = (((~(i10 | i19)) | i22) * 252) + (i21 * (-252)) + ((i20 | i22) * (-252)) + i15;
        if (i23 == 1) {
            int i24 = f54530r0;
            int i25 = i24 & 59;
            int i26 = ((i24 ^ 59) | i25) << 1;
            int i27 = -((~i25) & (i24 | 59));
            int i28 = (i26 & i27) + (i26 | i27);
            f54531s0 = i28 % 128;
            int i29 = i28 % 2;
            int i30 = (i24 | 13) << 1;
            int i31 = -(i24 ^ 13);
            int i32 = (i30 & i31) + (i31 | i30);
            f54531s0 = i32 % 128;
            int i33 = i32 % 2;
            return "SPHINCS+";
        }
        if (i23 == 2) {
            bcz bczVar = (bcz) objArr[0];
            int i34 = f54531s0;
            int i35 = (i34 & 27) + (i34 | 27);
            f54530r0 = i35 % 128;
            int i36 = i35 % 2;
            azy azyVar = bczVar.f54532p0;
            if (i36 != 0) {
                ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) azy.setCompoundDrawableTintBlendMode(new Object[]{azyVar}, 566920265, -566920261, System.identityHashCode(azyVar))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                throw null;
            }
            int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) azy.setCompoundDrawableTintBlendMode(new Object[]{azyVar}, 566920265, -566920261, System.identityHashCode(azyVar))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
            int i37 = f54531s0;
            int i38 = ((i37 ^ 31) | (i37 & 31)) << 1;
            int i39 = -(((~i37) & 31) | (i37 & (-32)));
            int i40 = (i38 & i39) + (i39 | i38);
            f54530r0 = i40 % 128;
            if (i40 % 2 == 0) {
                return Integer.valueOf(iIntValue);
            }
            throw null;
        }
        if (i23 == 3) {
            bcz bczVar2 = (bcz) objArr[0];
            Object obj = objArr[1];
            int i41 = f54531s0;
            int i42 = ((i41 | 55) << 1) - (i41 ^ 55);
            f54530r0 = i42 % 128;
            if (i42 % 2 != 0) {
                int i43 = 83 / 0;
                if (obj == bczVar2) {
                    int i44 = i41 & 61;
                    i13 = ((~i44) & (i41 | 61)) + (i44 << 1);
                    f54530r0 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i45 = 7 / 0;
                    }
                    objValueOf = Boolean.TRUE;
                } else if (obj instanceof bcz) {
                    int i46 = i41 + 15;
                    f54530r0 = i46 % 128;
                    int i47 = i46 % 2;
                    azy azyVar2 = bczVar2.f54532p0;
                    byte[] bArr = (byte[]) azy.setCompoundDrawableTintBlendMode(new Object[]{azyVar2}, 566920265, -566920261, System.identityHashCode(azyVar2));
                    azy azyVar3 = ((bcz) obj).f54532p0;
                    boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) azy.setCompoundDrawableTintBlendMode(new Object[]{azyVar3}, 566920265, -566920261, System.identityHashCode(azyVar3))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i48 = f54531s0;
                    int i49 = (i48 & (-18)) | ((~i48) & 17);
                    int i50 = (i48 & 17) << 1;
                    int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                    f54530r0 = i51 % 128;
                    int i52 = i51 % 2;
                    objValueOf = Boolean.valueOf(zBooleanValue);
                } else {
                    i14 = i41 + 27;
                    f54530r0 = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i53 = 30 / 0;
                    }
                    objValueOf = Boolean.FALSE;
                }
            } else if (obj == bczVar2) {
                int i410 = i41 & 61;
                i13 = ((~i410) & (i41 | 61)) + (i410 << 1);
                f54530r0 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i411 = 7 / 0;
                }
                objValueOf = Boolean.TRUE;
            } else if (obj instanceof bcz) {
                int i412 = i41 + 15;
                f54530r0 = i412 % 128;
                int i413 = i412 % 2;
                azy azyVar4 = bczVar2.f54532p0;
                byte[] bArr2 = (byte[]) azy.setCompoundDrawableTintBlendMode(new Object[]{azyVar4}, 566920265, -566920261, System.identityHashCode(azyVar4));
                azy azyVar5 = ((bcz) obj).f54532p0;
                boolean zBooleanValue2 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr2, (byte[]) azy.setCompoundDrawableTintBlendMode(new Object[]{azyVar5}, 566920265, -566920261, System.identityHashCode(azyVar5))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                int i414 = f54531s0;
                int i415 = (i414 & (-18)) | ((~i414) & 17);
                int i54 = (i414 & 17) << 1;
                int i55 = ((i415 | i54) << 1) - (i54 ^ i415);
                f54530r0 = i55 % 128;
                int i56 = i55 % 2;
                objValueOf = Boolean.valueOf(zBooleanValue2);
            } else {
                i14 = i41 + 27;
                f54530r0 = i14 % 128;
                if (i14 % 2 != 0) {
                    int i57 = 30 / 0;
                }
                objValueOf = Boolean.FALSE;
            }
        } else {
            if (i23 == 4) {
                int i58 = f54530r0 + 66;
                int i59 = (i58 ^ (-1)) + (i58 << 1);
                int i60 = i59 % 128;
                f54531s0 = i60;
                if (i59 % 2 == 0) {
                    int i61 = 45 / 0;
                }
                int i62 = (i60 ^ 59) + ((i60 & 59) << 1);
                f54530r0 = i62 % 128;
                if (i62 % 2 == 0) {
                    return "PKCS#8";
                }
                throw null;
            }
            if (i23 != 5) {
                bcz bczVar3 = (bcz) objArr[0];
                ahw ahwVar = (ahw) objArr[1];
                int i63 = f54530r0;
                int i64 = i63 & 65;
                int i65 = (i63 ^ 65) | i64;
                int i66 = (i64 & i65) + (i65 | i64);
                f54531s0 = i66 % 128;
                int i67 = i66 % 2;
                bczVar3.f54533q0 = (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar));
                bczVar3.f54532p0 = (azy) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis()));
                int i68 = f54530r0;
                int i69 = ((i68 ^ 69) | (i68 & 69)) << 1;
                int i70 = -(((~i68) & 69) | (i68 & (-70)));
                int i71 = (i69 & i70) + (i70 | i69);
                f54531s0 = i71 % 128;
                if (i71 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            bcz bczVar4 = (bcz) objArr[0];
            int i72 = f54530r0;
            int i73 = (i72 & 107) + (i72 | 107);
            f54531s0 = i73 % 128;
            try {
                if (i73 % 2 == 0) {
                    objValueOf = ((ahw) bab.setY(new Object[]{bczVar4.f54532p0, bczVar4.f54533q0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                    int i74 = 81 / 0;
                } else {
                    objValueOf = ((ahw) bab.setY(new Object[]{bczVar4.f54532p0, bczVar4.f54533q0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                }
            } catch (IOException unused) {
                return null;
            }
        }
        return objValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54530r0;
        int i11 = ((i10 | 53) << 1) - (i10 ^ 53);
        f54531s0 = i11 % 128;
        int i12 = i11 % 2;
        objectOutputStream.defaultWriteObject();
        if (i12 != 0) {
            objectOutputStream.writeObject((byte[]) setDividerPadding(new Object[]{this}, -1817501491, 1817501496, System.identityHashCode(this)));
        } else {
            objectOutputStream.writeObject((byte[]) setDividerPadding(new Object[]{this}, -1817501491, 1817501496, System.identityHashCode(this)));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 55627719, -55627716, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setDividerPadding(new Object[]{this}, -1300073700, 1300073701, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1817501491, 1817501496, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setDividerPadding(new Object[]{this}, 2035987554, -2035987550, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -249748929, 249748931, System.identityHashCode(this))).intValue();
    }
}
