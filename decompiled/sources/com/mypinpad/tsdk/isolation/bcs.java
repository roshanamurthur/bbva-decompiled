package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bcs implements bbt {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54509q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54510r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient ayd f54511p0;

    public bcs(ajj ajjVar) throws IOException {
        setDividerPadding(new Object[]{this, ajjVar}, 1137270811, -1137270810, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54509q0;
        int i11 = (i10 ^ 17) + ((i10 & 17) << 1);
        f54510r0 = i11 % 128;
        int i12 = i11 % 2;
        objectInputStream.defaultReadObject();
        setDividerPadding(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) objectInputStream.readObject()}, 909154525, -909154522, (int) System.currentTimeMillis())}, 1137270811, -1137270810, System.identityHashCode(this));
        int i13 = f54509q0;
        int i14 = i13 & 109;
        int i15 = (((i13 ^ 109) | i14) << 1) - ((i13 | 109) & (~i14));
        f54510r0 = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 72 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x012a  */
    /* JADX WARN: Code duplicated, block: B:30:0x013d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0140  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13;
        int i14 = ~i10;
        int i15 = ((i11 | i14) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i16 = ~i12;
        int i17 = ~(i16 | i11);
        int i18 = ~(i10 | i11);
        int i19 = i14 | (~i11);
        int i20 = ((i18 | (~(i19 | i16)) | (~(i11 | i12))) * 717) + ((i17 | i18 | (~(i19 | i12))) * 717) + i15;
        if (i20 == 1) {
            bcs bcsVar = (bcs) objArr[0];
            ajj ajjVar = (ajj) objArr[1];
            int i21 = f54510r0;
            int i22 = ((i21 & 50) + (i21 | 50)) - 1;
            f54509q0 = i22 % 128;
            int i23 = i22 % 2;
            bcsVar.f54511p0 = (ayd) ((amw) baf.setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis()));
            int i24 = f54509q0;
            int i25 = i24 & 69;
            int i26 = i25 + ((i24 ^ 69) | i25);
            f54510r0 = i26 % 128;
            if (i26 % 2 != 0) {
                return null;
            }
            int i27 = 70 / 0;
            return null;
        }
        if (i20 == 2) {
            int i28 = f54509q0;
            int i29 = ((i28 | 11) << 1) - (i28 ^ 11);
            int i30 = i29 % 128;
            f54510r0 = i30;
            if (i29 % 2 == 0) {
                throw null;
            }
            int i31 = i30 + 87;
            f54509q0 = i31 % 128;
            int i32 = i31 % 2;
            return ConstantKt.CERTIFICATE_TYPE_X509;
        }
        if (i20 == 3) {
            bcs bcsVar2 = (bcs) objArr[0];
            int i33 = f54509q0;
            int i34 = ((i33 | 1) << 1) - (i33 ^ 1);
            f54510r0 = i34 % 128;
            int i35 = i34 % 2;
            ayd aydVar = bcsVar2.f54511p0;
            int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) ayd.setDividerPadding(new Object[]{aydVar}, -726179413, 726179413, System.identityHashCode(aydVar))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
            int i36 = f54510r0;
            int i37 = i36 & 103;
            int i38 = (((i36 ^ 103) | i37) << 1) - ((i36 | 103) & (~i37));
            f54509q0 = i38 % 128;
            if (i38 % 2 != 0) {
                int i39 = 26 / 0;
            }
            objValueOf = Integer.valueOf(iIntValue);
        } else {
            if (i20 != 4) {
                if (i20 == 5) {
                    int i40 = f54509q0;
                    int i41 = (((i40 | 6) << 1) - (i40 ^ 6)) - 1;
                    f54510r0 = i41 % 128;
                    if (i41 % 2 == 0) {
                        int i42 = 37 / 0;
                    }
                    return "NH";
                }
                bcs bcsVar3 = (bcs) objArr[0];
                int i43 = f54509q0;
                int i44 = ((i43 & (-88)) | ((~i43) & 87)) + ((i43 & 87) << 1);
                f54510r0 = i44 % 128;
                try {
                    if (i44 % 2 != 0) {
                        return ((ajj) bac.setDividerPadding(new Object[]{bcsVar3.f54511p0}, 629434876, -629434876, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                    }
                    ((ajj) bac.setDividerPadding(new Object[]{bcsVar3.f54511p0}, 629434876, -629434876, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                    throw null;
                } catch (IOException unused) {
                    return null;
                }
            }
            bcs bcsVar4 = (bcs) objArr[0];
            Object obj = objArr[1];
            int i45 = f54509q0;
            int i46 = i45 & 33;
            int i47 = (i45 ^ 33) | i46;
            int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
            f54510r0 = i48 % 128;
            if (i48 % 2 == 0) {
                throw null;
            }
            if (obj != null) {
                int i49 = (i45 & (-118)) | ((~i45) & 117);
                int i50 = (i45 & 117) << 1;
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                f54510r0 = i51 % 128;
                int i52 = i51 % 2;
                if (!(obj instanceof bcs)) {
                    int i53 = f54510r0;
                    int i54 = i53 & 29;
                    i13 = (i54 - (~(-(-((i53 ^ 29) | i54))))) - 1;
                    f54509q0 = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                } else {
                    ayd aydVar2 = bcsVar4.f54511p0;
                    byte[] bArr = (byte[]) ayd.setDividerPadding(new Object[]{aydVar2}, -726179413, 726179413, System.identityHashCode(aydVar2));
                    ayd aydVar3 = ((bcs) obj).f54511p0;
                    boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) ayd.setDividerPadding(new Object[]{aydVar3}, -726179413, 726179413, System.identityHashCode(aydVar3))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i55 = f54509q0;
                    int i56 = (i55 & (-4)) | ((~i55) & 3);
                    int i57 = (i55 & 3) << 1;
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    f54510r0 = i58 % 128;
                    int i59 = i58 % 2;
                    objValueOf = Boolean.valueOf(zBooleanValue);
                }
            } else {
                int i510 = f54510r0;
                int i511 = i510 & 29;
                i13 = (i511 - (~(-(-((i510 ^ 29) | i511))))) - 1;
                f54509q0 = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
                objValueOf = Boolean.FALSE;
            }
        }
        return objValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54510r0 + 103;
        f54509q0 = i10 % 128;
        int i11 = i10 % 2;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject((byte[]) setDividerPadding(new Object[]{this}, -1043312707, 1043312707, System.identityHashCode(this)));
        int i12 = f54510r0;
        int i13 = i12 ^ 71;
        int i14 = (i12 & 71) << 1;
        int i15 = (i13 & i14) + (i14 | i13);
        f54509q0 = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 16 / 0;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1983256431, -1983256427, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setDividerPadding(new Object[]{this}, -1637537285, 1637537290, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1043312707, 1043312707, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setDividerPadding(new Object[]{this}, 1796103664, -1796103662, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 438340320, -438340317, System.identityHashCode(this))).intValue();
    }
}
