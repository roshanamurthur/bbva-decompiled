package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes10.dex */
public final class bcu implements bbw, PublicKey {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54516q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54517r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient ayi f54518p0;

    public bcu(ajj ajjVar) throws IOException {
        setX(new Object[]{this, ajjVar}, -710513860, 710513861, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = ((-1) << 1) - ((f54517r0 + 112) ^ (-1));
        f54516q0 = i10 % 128;
        int i11 = i10 % 2;
        objectInputStream.defaultReadObject();
        setX(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) objectInputStream.readObject()}, 909154525, -909154522, (int) System.currentTimeMillis())}, -710513860, 710513861, System.identityHashCode(this));
        int i12 = f54516q0 + 65;
        f54517r0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int iIntValue;
        int i13 = (((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628);
        if (i13 == 1) {
            bcu bcuVar = (bcu) objArr[0];
            ajj ajjVar = (ajj) objArr[1];
            int i14 = f54517r0;
            int i15 = i14 & 27;
            int i16 = ((((i14 ^ 27) | i15) << 1) - (~(-((i14 | 27) & (~i15))))) - 1;
            f54516q0 = i16 % 128;
            Object[] objArr2 = new Object[1];
            if (i16 % 2 == 0) {
                objArr2[0] = ajjVar;
                bcuVar.f54518p0 = (ayi) ((amw) baf.setY(objArr2, -1408872677, 1408872678, (int) System.currentTimeMillis()));
                return null;
            }
            objArr2[0] = ajjVar;
            bcuVar.f54518p0 = (ayi) ((amw) baf.setY(objArr2, -1408872677, 1408872678, (int) System.currentTimeMillis()));
            throw null;
        }
        if (i13 == 2) {
            bcu bcuVar2 = (bcu) objArr[0];
            Object obj = objArr[1];
            int i17 = f54516q0;
            int i18 = i17 + 5;
            int i19 = i18 % 128;
            f54517r0 = i19;
            if (i18 % 2 == 0) {
                throw null;
            }
            if (obj == bcuVar2) {
                int i20 = ((((i19 ^ 51) | (i19 & 51)) << 1) - (~(-((i19 & (-52)) | ((~i19) & 51))))) - 1;
                f54516q0 = i20 % 128;
                int i21 = i20 % 2;
                objValueOf = Boolean.TRUE;
            } else if (obj instanceof bcu) {
                int i22 = i19 & 23;
                int i23 = (~i22) & (i19 | 23);
                int i24 = -(-(i22 << 1));
                int i25 = (i23 & i24) + (i24 | i23);
                f54516q0 = i25 % 128;
                int i26 = i25 % 2;
                ayi ayiVar = bcuVar2.f54518p0;
                byte[] bArr = (byte[]) ayi.setX(new Object[]{ayiVar}, -1328119761, 1328119762, System.identityHashCode(ayiVar));
                ayi ayiVar2 = ((bcu) obj).f54518p0;
                boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) ayi.setX(new Object[]{ayiVar2}, -1328119761, 1328119762, System.identityHashCode(ayiVar2))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                int i27 = f54516q0;
                int i28 = (i27 ^ 7) + ((i27 & 7) << 1);
                f54517r0 = i28 % 128;
                if (i28 % 2 == 0) {
                    throw null;
                }
                objValueOf = Boolean.valueOf(zBooleanValue);
            } else {
                int i29 = i17 + 79;
                f54517r0 = i29 % 128;
                int i30 = i29 % 2;
                objValueOf = Boolean.FALSE;
            }
        } else {
            if (i13 == 3) {
                int i31 = f54517r0;
                int i32 = (i31 & (-22)) | ((~i31) & 21);
                int i33 = (i31 & 21) << 1;
                int i34 = (i32 & i33) + (i33 | i32);
                int i35 = i34 % 128;
                f54516q0 = i35;
                int i36 = i34 % 2;
                int i37 = i35 & 49;
                int i38 = ((i35 | 49) & (~i37)) + (i37 << 1);
                f54517r0 = i38 % 128;
                int i39 = i38 % 2;
                return "NTRU";
            }
            if (i13 == 4) {
                int i40 = f54516q0;
                int i41 = i40 & 59;
                int i42 = i41 + ((i40 ^ 59) | i41);
                int i43 = i42 % 128;
                f54517r0 = i43;
                int i44 = i42 % 2;
                int i45 = (i43 & (-86)) | ((~i43) & 85);
                int i46 = -(-((i43 & 85) << 1));
                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                f54516q0 = i47 % 128;
                if (i47 % 2 == 0) {
                    return ConstantKt.CERTIFICATE_TYPE_X509;
                }
                throw null;
            }
            if (i13 != 5) {
                bcu bcuVar3 = (bcu) objArr[0];
                int i48 = f54517r0;
                int i49 = i48 & 57;
                int i50 = (i48 | 57) & (~i49);
                int i51 = -(-(i49 << 1));
                int i52 = (i50 & i51) + (i50 | i51);
                f54516q0 = i52 % 128;
                int i53 = i52 % 2;
                try {
                    byte[] alwaysDrawnWithCacheEnabled = ((ajj) bac.setDividerPadding(new Object[]{bcuVar3.f54518p0}, 629434876, -629434876, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                    int i54 = f54516q0;
                    int i55 = (i54 | 19) << 1;
                    int i56 = -(((~i54) & 19) | (i54 & (-20)));
                    int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                    f54517r0 = i57 % 128;
                    int i58 = i57 % 2;
                    return alwaysDrawnWithCacheEnabled;
                } catch (IOException unused) {
                    return null;
                }
            }
            bcu bcuVar4 = (bcu) objArr[0];
            int i59 = f54517r0 + 41;
            f54516q0 = i59 % 128;
            int i60 = i59 % 2;
            ayi ayiVar3 = bcuVar4.f54518p0;
            if (i60 != 0) {
                iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) ayi.setX(new Object[]{ayiVar3}, -1328119761, 1328119762, System.identityHashCode(ayiVar3))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i61 = 10 / 0;
            } else {
                iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) ayi.setX(new Object[]{ayiVar3}, -1328119761, 1328119762, System.identityHashCode(ayiVar3))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
            }
            int i62 = f54516q0 + 43;
            f54517r0 = i62 % 128;
            if (i62 % 2 == 0) {
                int i63 = 26 / 0;
            }
            objValueOf = Integer.valueOf(iIntValue);
        }
        return objValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54516q0;
        int i11 = (i10 & 35) + (i10 | 35);
        f54517r0 = i11 % 128;
        int i12 = i11 % 2;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject((byte[]) setX(new Object[]{this}, 910070701, -910070701, System.identityHashCode(this)));
        int i13 = f54516q0;
        int i14 = (((i13 | 26) << 1) - (i13 ^ 26)) - 1;
        f54517r0 = i14 % 128;
        int i15 = i14 % 2;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -450064761, 450064763, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setX(new Object[]{this}, 1183021783, -1183021780, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setX(new Object[]{this}, 910070701, -910070701, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setX(new Object[]{this}, 244564629, -244564625, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 1742991826, -1742991821, System.identityHashCode(this))).intValue();
    }
}
