package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bda implements bcc {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54534q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54535r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient baa f54536p0;

    public bda(ajj ajjVar) throws IOException {
        setOnFocusChangeListener(new Object[]{this, ajjVar}, 510077643, -510077639, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54535r0;
        int i11 = i10 & 103;
        int i12 = i11 + ((i10 ^ 103) | i11);
        f54534q0 = i12 % 128;
        int i13 = i12 % 2;
        objectInputStream.defaultReadObject();
        setOnFocusChangeListener(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) objectInputStream.readObject()}, 909154525, -909154522, (int) System.currentTimeMillis())}, 510077643, -510077639, System.identityHashCode(this));
        int i14 = f54535r0;
        int i15 = i14 & 75;
        int i16 = (i14 | 75) & (~i15);
        int i17 = i15 << 1;
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        f54534q0 = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~((~i10) | i11);
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~i12;
        int i17 = (((~(i11 | i16)) | (~(i12 | i14)) | i13) * 988) + (((~(i10 | i16)) | i15) * (-1976)) + ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
        if (i17 == 1) {
            int i18 = f54534q0;
            int i19 = (i18 ^ 11) + ((i18 & 11) << 1);
            int i20 = i19 % 128;
            f54535r0 = i20;
            int i21 = i19 % 2;
            int i22 = (((i20 & (-66)) | ((~i20) & 65)) - (~((i20 & 65) << 1))) - 1;
            f54534q0 = i22 % 128;
            int i23 = i22 % 2;
            return ConstantKt.CERTIFICATE_TYPE_X509;
        }
        if (i17 == 2) {
            bda bdaVar = (bda) objArr[0];
            int i24 = f54535r0;
            int i25 = ((((i24 ^ 117) | (i24 & 117)) << 1) - (~(-(((~i24) & 117) | (i24 & (-118)))))) - 1;
            f54534q0 = i25 % 128;
            int i26 = i25 % 2;
            baa baaVar = bdaVar.f54536p0;
            int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) baa.setX(new Object[]{baaVar}, -297392802, 297392802, System.identityHashCode(baaVar))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
            int i27 = f54534q0;
            int i28 = (i27 ^ 95) + ((i27 & 95) << 1);
            f54535r0 = i28 % 128;
            if (i28 % 2 == 0) {
                int i29 = 10 / 0;
            }
            objValueOf = Integer.valueOf(iIntValue);
        } else {
            if (i17 == 3) {
                int i30 = f54534q0;
                int i31 = ((i30 | 85) << 1) - (i30 ^ 85);
                f54535r0 = i31 % 128;
                if (i31 % 2 == 0) {
                    throw null;
                }
                int i32 = i30 & 25;
                int i33 = -(-((i30 ^ 25) | i32));
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                f54535r0 = i34 % 128;
                int i35 = i34 % 2;
                return "SPHINCS+";
            }
            if (i17 == 4) {
                bda bdaVar2 = (bda) objArr[0];
                ajj ajjVar = (ajj) objArr[1];
                int i36 = f54535r0;
                int i37 = ((i36 | 69) << 1) - (i36 ^ 69);
                f54534q0 = i37 % 128;
                if (i37 % 2 != 0) {
                    bdaVar2.f54536p0 = (baa) ((amw) baf.setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis()));
                    throw null;
                }
                bdaVar2.f54536p0 = (baa) ((amw) baf.setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis()));
                int i38 = f54534q0;
                int i39 = (i38 ^ 13) + ((i38 & 13) << 1);
                f54535r0 = i39 % 128;
                if (i39 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            if (i17 == 5) {
                bda bdaVar3 = (bda) objArr[0];
                int i40 = f54534q0;
                int i41 = i40 & 35;
                int i42 = (((i40 | 35) & (~i41)) - (~(i41 << 1))) - 1;
                f54535r0 = i42 % 128;
                try {
                    if (i42 % 2 != 0) {
                        return ((ajj) bac.setDividerPadding(new Object[]{bdaVar3.f54536p0}, 629434876, -629434876, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                    }
                    ((ajj) bac.setDividerPadding(new Object[]{bdaVar3.f54536p0}, 629434876, -629434876, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                    throw null;
                } catch (IOException unused) {
                    return null;
                }
            }
            bda bdaVar4 = (bda) objArr[0];
            Object obj = objArr[1];
            int i43 = f54535r0;
            int i44 = i43 & 39;
            int i45 = -(-((i43 ^ 39) | i44));
            int i46 = (i44 & i45) + (i44 | i45);
            int i47 = i46 % 128;
            f54534q0 = i47;
            int i48 = i46 % 2;
            if (obj == bdaVar4) {
                int i49 = (((i43 & (-34)) | ((~i43) & 33)) - (~((i43 & 33) << 1))) - 1;
                f54534q0 = i49 % 128;
                int i50 = i49 % 2;
                int i51 = ((i43 & 89) - (~(i43 | 89))) - 1;
                f54534q0 = i51 % 128;
                int i52 = i51 % 2;
                objValueOf = Boolean.TRUE;
            } else if (obj instanceof bda) {
                int i53 = i47 & 43;
                int i54 = i53 + ((i47 ^ 43) | i53);
                f54535r0 = i54 % 128;
                int i55 = i54 % 2;
                baa baaVar2 = bdaVar4.f54536p0;
                byte[] bArr = (byte[]) baa.setX(new Object[]{baaVar2}, -297392802, 297392802, System.identityHashCode(baaVar2));
                baa baaVar3 = ((bda) obj).f54536p0;
                boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) baa.setX(new Object[]{baaVar3}, -297392802, 297392802, System.identityHashCode(baaVar3))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                int i56 = f54535r0;
                int i57 = (i56 & 69) + (i56 | 69);
                f54534q0 = i57 % 128;
                if (i57 % 2 != 0) {
                    throw null;
                }
                objValueOf = Boolean.valueOf(zBooleanValue);
            } else {
                int i58 = i47 ^ 105;
                int i59 = (((i47 & 105) | i58) << 1) - i58;
                f54535r0 = i59 % 128;
                int i60 = i59 % 2;
                objValueOf = Boolean.FALSE;
            }
        }
        return objValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54535r0;
        int i11 = ((i10 | 75) << 1) - (i10 ^ 75);
        f54534q0 = i11 % 128;
        int i12 = i11 % 2;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject((byte[]) setOnFocusChangeListener(new Object[]{this}, -1107392581, 1107392586, System.identityHashCode(this)));
        int i13 = f54535r0;
        int i14 = (i13 ^ 15) + ((i13 & 15) << 1);
        f54534q0 = i14 % 128;
        int i15 = i14 % 2;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, obj}, 780687967, -780687967, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -548773214, 548773217, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -1107392581, 1107392586, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -498802898, 498802899, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 1657271701, -1657271699, System.identityHashCode(this))).intValue();
    }
}
