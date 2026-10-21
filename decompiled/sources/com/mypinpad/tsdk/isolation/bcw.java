package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes10.dex */
public final class bcw implements bbx, PublicKey {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54521q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54522r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient ayz f54523p0;

    public bcw(ajj ajjVar) throws IOException {
        setDividerPadding(new Object[]{this, ajjVar}, -121713661, 121713662, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54522r0;
        int i11 = i10 & 55;
        int i12 = (i10 | 55) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f54521q0 = i14 % 128;
        int i15 = i14 % 2;
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        if (i15 != 0) {
            setDividerPadding(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, -121713661, 121713662, System.identityHashCode(this));
            throw null;
        }
        setDividerPadding(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, -121713661, 121713662, System.identityHashCode(this));
        int i16 = f54521q0;
        int i17 = i16 & 115;
        int i18 = (i16 | 115) & (~i17);
        int i19 = i17 << 1;
        int i20 = (i18 & i19) + (i18 | i19);
        f54522r0 = i20 % 128;
        int i21 = i20 % 2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object alwaysDrawnWithCacheEnabled;
        int i13 = (i11 * (-344)) + (i10 * (-344));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        int i17 = ((~(i16 | i12)) * 345) + (((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + (((~i16) | (~(i14 | i12))) * 345) + i13;
        if (i17 == 1) {
            bcw bcwVar = (bcw) objArr[0];
            ajj ajjVar = (ajj) objArr[1];
            int i18 = f54522r0;
            int i19 = (i18 & 47) + (i18 | 47);
            f54521q0 = i19 % 128;
            Object[] objArr2 = new Object[1];
            if (i19 % 2 == 0) {
                objArr2[0] = ajjVar;
                bcwVar.f54523p0 = (ayz) ((amw) baf.setY(objArr2, -1408872677, 1408872678, (int) System.currentTimeMillis()));
                return null;
            }
            objArr2[0] = ajjVar;
            bcwVar.f54523p0 = (ayz) ((amw) baf.setY(objArr2, -1408872677, 1408872678, (int) System.currentTimeMillis()));
            throw null;
        }
        if (i17 == 2) {
            int i20 = f54522r0;
            int i21 = i20 ^ 103;
            int i22 = ((i20 & 103) | i21) << 1;
            int i23 = -i21;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            f54521q0 = i24 % 128;
            if (i24 % 2 == 0) {
                return "Picnic";
            }
            throw null;
        }
        if (i17 == 3) {
            bcw bcwVar2 = (bcw) objArr[0];
            int i25 = f54521q0 + 72;
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            f54522r0 = i26 % 128;
            int i27 = i26 % 2;
            try {
                alwaysDrawnWithCacheEnabled = ((ajj) bac.setDividerPadding(new Object[]{bcwVar2.f54523p0}, 629434876, -629434876, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                int i28 = f54522r0;
                int i29 = ((i28 & (-66)) | ((~i28) & 65)) + ((i28 & 65) << 1);
                f54521q0 = i29 % 128;
                if (i29 % 2 != 0) {
                    throw null;
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            if (i17 == 4) {
                int i30 = f54521q0;
                int i31 = (((i30 | 66) << 1) - (i30 ^ 66)) - 1;
                int i32 = i31 % 128;
                f54522r0 = i32;
                int i33 = i31 % 2;
                int i34 = i32 ^ 123;
                int i35 = (i32 & 123) << 1;
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                f54521q0 = i36 % 128;
                if (i36 % 2 != 0) {
                    int i37 = 44 / 0;
                }
                return ConstantKt.CERTIFICATE_TYPE_X509;
            }
            if (i17 != 5) {
                bcw bcwVar3 = (bcw) objArr[0];
                int i38 = f54521q0;
                int i39 = (i38 & 125) + (i38 | 125);
                f54522r0 = i39 % 128;
                int i40 = i39 % 2;
                ayz ayzVar = bcwVar3.f54523p0;
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) ayz.setY(new Object[]{ayzVar}, -8039635, 8039635, System.identityHashCode(ayzVar))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i41 = f54521q0;
                int i42 = (-2) - (((i41 & 54) + (i41 | 54)) ^ (-1));
                f54522r0 = i42 % 128;
                if (i42 % 2 != 0) {
                    return Integer.valueOf(iIntValue);
                }
                throw null;
            }
            bcw bcwVar4 = (bcw) objArr[0];
            Object obj = objArr[1];
            int i43 = f54521q0;
            int i44 = ((i43 ^ 78) + ((i43 & 78) << 1)) - 1;
            int i45 = i44 % 128;
            f54522r0 = i45;
            if (i44 % 2 == 0) {
                throw null;
            }
            if (obj == bcwVar4) {
                int i46 = i45 & 23;
                int i47 = (((i45 ^ 23) | i46) << 1) - ((~i46) & (i45 | 23));
                int i48 = i47 % 128;
                f54521q0 = i48;
                int i49 = i47 % 2;
                int i50 = i48 + 41;
                f54522r0 = i50 % 128;
                int i51 = i50 % 2;
                alwaysDrawnWithCacheEnabled = Boolean.TRUE;
            } else if (obj instanceof bcw) {
                int i52 = (i43 & 77) + (i43 | 77);
                f54522r0 = i52 % 128;
                bcw bcwVar5 = (bcw) obj;
                if (i52 % 2 == 0) {
                    ayz ayzVar2 = bcwVar4.f54523p0;
                    byte[] bArr = (byte[]) ayz.setY(new Object[]{ayzVar2}, -8039635, 8039635, System.identityHashCode(ayzVar2));
                    ayz ayzVar3 = bcwVar5.f54523p0;
                    ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) ayz.setY(new Object[]{ayzVar3}, -8039635, 8039635, System.identityHashCode(ayzVar3))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                ayz ayzVar4 = bcwVar4.f54523p0;
                byte[] bArr2 = (byte[]) ayz.setY(new Object[]{ayzVar4}, -8039635, 8039635, System.identityHashCode(ayzVar4));
                ayz ayzVar5 = bcwVar5.f54523p0;
                boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr2, (byte[]) ayz.setY(new Object[]{ayzVar5}, -8039635, 8039635, System.identityHashCode(ayzVar5))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                int i53 = f54522r0 + 69;
                f54521q0 = i53 % 128;
                if (i53 % 2 != 0) {
                    int i54 = 71 / 0;
                }
                alwaysDrawnWithCacheEnabled = Boolean.valueOf(zBooleanValue);
            } else {
                int i55 = i45 & 111;
                int i56 = (i45 ^ 111) | i55;
                int i57 = (i55 & i56) + (i55 | i56);
                f54521q0 = i57 % 128;
                if (i57 % 2 != 0) {
                    int i58 = 25 / 0;
                }
                alwaysDrawnWithCacheEnabled = Boolean.FALSE;
            }
        }
        return alwaysDrawnWithCacheEnabled;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54521q0 + 55;
        f54522r0 = i10 % 128;
        int i11 = i10 % 2;
        objectOutputStream.defaultWriteObject();
        if (i11 == 0) {
            objectOutputStream.writeObject((byte[]) setDividerPadding(new Object[]{this}, 1303706953, -1303706950, System.identityHashCode(this)));
            int i12 = 66 / 0;
        } else {
            objectOutputStream.writeObject((byte[]) setDividerPadding(new Object[]{this}, 1303706953, -1303706950, System.identityHashCode(this)));
        }
        int iIdentityHashCode = System.identityHashCode(this);
        int i13 = ~iIdentityHashCode;
        int i14 = ~(((-217388165) & i13) | (iIdentityHashCode & 217388164) | ((-217388165) & iIdentityHashCode));
        int i15 = 82121732 & i14;
        int i16 = (i14 | 82121732) & (~i15);
        int i17 = ((i16 & i15) | (i16 ^ i15)) * 336;
        int i18 = (-978783128) & i17;
        int i19 = -(-(i17 | (-978783128)));
        int i20 = (i18 & i19) + (i19 | i18);
        int i21 = (iIdentityHashCode & 1743068708) | (1743068708 ^ iIdentityHashCode);
        int i22 = (i21 | (~i21)) & (~i21);
        int i23 = ((~i22) & (-1878335141)) | (1878335140 & i22);
        int i24 = i22 & (-1878335141);
        int i25 = -(-(((i24 & i23) | (i23 ^ i24)) * (-168)));
        int i26 = (((i20 ^ i25) | (i20 & i25)) << 1) - ((i25 & (~i20)) | ((~i25) & i20));
        int i27 = i13 & 1743068708;
        int i28 = (i13 | 1743068708) & (~i27);
        int i29 = ~((i27 & i28) | (i28 ^ i27));
        int i30 = ((~i29) & (-217388165)) | (i29 & 217388164);
        int i31 = i29 & (-217388165);
        int i32 = ((i31 & i30) | (i30 ^ i31)) * 168;
        int i33 = (((i26 ^ i32) | (i26 & i32)) << 1) - ((i32 & (~i26)) | ((~i32) & i26));
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i34 = ~(((-15697313) & iIdentityHashCode2) | ((-15697313) ^ iIdentityHashCode2));
        int i35 = ((~i34) & 196996116) | ((-196996117) & i34);
        int i36 = i34 & 196996116;
        int i37 = (((i36 & i35) | (i35 ^ i36)) * (-366)) + 79702452;
        int i38 = iIdentityHashCode2 | (-4325793);
        int i39 = (((i38 | (~i38)) & (~i38)) | 185624596) * 366;
        if (i33 <= (i37 ^ i39) + ((i39 & i37) << 1)) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, -350379601, 350379606, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setDividerPadding(new Object[]{this}, -220825993, 220825995, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1303706953, -1303706950, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setDividerPadding(new Object[]{this}, 702463500, -702463496, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1803958921, -1803958921, System.identityHashCode(this))).intValue();
    }
}
