package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes10.dex */
public final class bcl implements bbp, PublicKey {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54486q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54487r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient ayc f54488p0;

    public bcl(ajj ajjVar) throws IOException {
        setOnFocusChangeListener(new Object[]{this, ajjVar}, 189103043, -189103039, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54487r0;
        int i11 = i10 & 61;
        int i12 = (i10 | 61) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        f54486q0 = i14 % 128;
        int i15 = i14 % 2;
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        if (i15 == 0) {
            setOnFocusChangeListener(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, 189103043, -189103039, System.identityHashCode(this));
        } else {
            setOnFocusChangeListener(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, 189103043, -189103039, System.identityHashCode(this));
            throw null;
        }
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object alwaysDrawnWithCacheEnabled;
        int iIntValue;
        int i13 = ~i10;
        int i14 = (i13 * 677) + (i11 * (-676)) + (i10 * 678);
        int i15 = ~i11;
        int i16 = ((~(i10 | i15)) * 677) + ((i13 | i15) * (-677)) + i14;
        if (i16 == 1) {
            int i17 = f54487r0;
            int i18 = i17 & 125;
            int i19 = -(-(i17 | 125));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            f54486q0 = i20 % 128;
            if (i20 % 2 == 0) {
                return "LMS";
            }
            throw null;
        }
        if (i16 == 2) {
            bcl bclVar = (bcl) objArr[0];
            int i21 = f54486q0;
            int i22 = ((i21 ^ 37) | (i21 & 37)) << 1;
            int i23 = -(((~i21) & 37) | (i21 & (-38)));
            int i24 = (i22 & i23) + (i23 | i22);
            f54487r0 = i24 % 128;
            int i25 = i24 % 2;
            try {
                alwaysDrawnWithCacheEnabled = ((ajj) bac.setDividerPadding(new Object[]{bclVar.f54488p0}, 629434876, -629434876, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                int i26 = f54486q0;
                int i27 = ((i26 ^ 37) | (i26 & 37)) << 1;
                int i28 = -(((~i26) & 37) | (i26 & (-38)));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                f54487r0 = i29 % 128;
                if (i29 % 2 == 0) {
                    throw null;
                }
            } catch (IOException unused) {
                return null;
            }
        } else if (i16 == 3) {
            bcl bclVar2 = (bcl) objArr[0];
            int i30 = f54487r0;
            int i31 = ((((i30 ^ 107) | (i30 & 107)) << 1) - (~(-(((~i30) & 107) | (i30 & (-108)))))) - 1;
            f54486q0 = i31 % 128;
            try {
                if (i31 % 2 != 0) {
                    ((Integer) bek.setOnFocusChangeListener(new Object[]{bclVar2.f54488p0.setAlwaysDrawnWithCacheEnabled()}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                    throw null;
                }
                iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{bclVar2.f54488p0.setAlwaysDrawnWithCacheEnabled()}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                alwaysDrawnWithCacheEnabled = Integer.valueOf(iIntValue);
            } catch (IOException unused2) {
                iIntValue = -1;
            }
        } else {
            if (i16 == 4) {
                bcl bclVar3 = (bcl) objArr[0];
                ajj ajjVar = (ajj) objArr[1];
                int i32 = f54486q0;
                int i33 = (((i32 & (-4)) | ((~i32) & 3)) - (~((3 & i32) << 1))) - 1;
                f54487r0 = i33 % 128;
                if (i33 % 2 == 0) {
                    bclVar3.f54488p0 = (ayc) ((amw) baf.setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis()));
                    throw null;
                }
                bclVar3.f54488p0 = (ayc) ((amw) baf.setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis()));
                int i34 = f54487r0;
                int i35 = ((i34 ^ 19) | (i34 & 19)) << 1;
                int i36 = -(((~i34) & 19) | (i34 & (-20)));
                int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                f54486q0 = i37 % 128;
                int i38 = i37 % 2;
                return null;
            }
            if (i16 == 5) {
                int i39 = f54487r0;
                int i40 = i39 + 115;
                f54486q0 = i40 % 128;
                int i41 = i40 % 2;
                int i42 = ((i39 | 113) << 1) - (i39 ^ 113);
                f54486q0 = i42 % 128;
                if (i42 % 2 == 0) {
                    return ConstantKt.CERTIFICATE_TYPE_X509;
                }
                throw null;
            }
            bcl bclVar4 = (bcl) objArr[0];
            Object obj = objArr[1];
            int i43 = f54487r0;
            int i44 = i43 + 27;
            int i45 = i44 % 128;
            f54486q0 = i45;
            if (i44 % 2 != 0) {
                throw null;
            }
            if (obj == bclVar4) {
                int i46 = i45 & 109;
                int i47 = ((i45 ^ 109) | i46) << 1;
                int i48 = -((~i46) & (i45 | 109));
                int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
                f54487r0 = i49 % 128;
                if (i49 % 2 == 0) {
                    throw null;
                }
                alwaysDrawnWithCacheEnabled = Boolean.TRUE;
            } else {
                if (obj instanceof bcl) {
                    int i50 = i45 ^ 81;
                    int i51 = -(-((i45 & 81) << 1));
                    int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                    f54487r0 = i52 % 128;
                    int i53 = i52 % 2;
                    try {
                        boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{bclVar4.f54488p0.setAlwaysDrawnWithCacheEnabled(), ((bcl) obj).f54488p0.setAlwaysDrawnWithCacheEnabled()}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                        int i54 = f54486q0 + 7;
                        f54487r0 = i54 % 128;
                        if (i54 % 2 == 0) {
                            throw null;
                        }
                        alwaysDrawnWithCacheEnabled = Boolean.valueOf(zBooleanValue);
                    } catch (IOException unused3) {
                        alwaysDrawnWithCacheEnabled = Boolean.FALSE;
                    }
                } else {
                    int i55 = i43 & 77;
                    int i56 = (~i55) & (i43 | 77);
                    int i57 = i55 << 1;
                    int i58 = (i56 & i57) + (i57 | i56);
                    f54486q0 = i58 % 128;
                    int i59 = i58 % 2;
                }
                alwaysDrawnWithCacheEnabled = Boolean.FALSE;
            }
        }
        return alwaysDrawnWithCacheEnabled;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54486q0;
        int i11 = ((i10 & 103) - (~(i10 | 103))) - 1;
        f54487r0 = i11 % 128;
        int i12 = i11 % 2;
        objectOutputStream.defaultWriteObject();
        Object[] objArr = new Object[1];
        if (i12 != 0) {
            objArr[0] = this;
            objectOutputStream.writeObject((byte[]) setOnFocusChangeListener(objArr, -33317555, 33317557, System.identityHashCode(this)));
        } else {
            objArr[0] = this;
            objectOutputStream.writeObject((byte[]) setOnFocusChangeListener(objArr, -33317555, 33317557, System.identityHashCode(this)));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, obj}, -1206759996, 1206759996, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -921976672, 921976673, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -33317555, 33317557, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -2033779816, 2033779821, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -889535484, 889535487, System.identityHashCode(this))).intValue();
    }
}
