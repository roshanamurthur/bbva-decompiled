package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.security.PublicKey;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class aoe implements PublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static int f53405p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f53406q0 = 1;

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Boolean bool;
        int i13 = (i11 * (-657)) + (i10 * 659);
        int i14 = ~((~i10) | i11);
        int i15 = ~((~i11) | i10);
        int i16 = ~(i10 | i12);
        int i17 = ((i14 | i15 | i16) * (-658)) + i13;
        int i18 = ((i16 | i15) * 658) + (i15 * 658) + i17;
        if (i18 == 1) {
            ((aoe) objArr[0]).getClass();
            throw null;
        }
        if (i18 == 2) {
            int i19 = f53405p0;
            int i20 = (i19 & (-112)) | ((~i19) & 111);
            int i21 = -(-((i19 & 111) << 1));
            int i22 = (i20 & i21) + (i20 | i21);
            f53406q0 = i22 % 128;
            int i23 = i22 % 2;
            int i24 = i19 + 41;
            f53406q0 = i24 % 128;
            int i25 = i24 % 2;
            return "Composite";
        }
        if (i18 == 3) {
            aoe aoeVar = (aoe) objArr[0];
            int i26 = f53406q0;
            int i27 = i26 ^ 55;
            int i28 = ((i26 & 55) | i27) << 1;
            int i29 = -i27;
            int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
            f53405p0 = i30 % 128;
            int i31 = i30 % 2;
            aoeVar.getClass();
            int i32 = f53406q0 + 53;
            f53405p0 = i32 % 128;
            int i33 = i32 % 2;
            return null;
        }
        if (i18 == 4) {
            int i34 = f53405p0;
            int i35 = (i34 | 67) << 1;
            int i36 = -((i34 & (-68)) | ((~i34) & 67));
            int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
            f53406q0 = i37 % 128;
            int i38 = i37 % 2;
            int i39 = i34 & 61;
            int i40 = ((i34 ^ 61) | i39) << 1;
            int i41 = -((i34 | 61) & (~i39));
            int i42 = (i40 & i41) + (i41 | i40);
            f53406q0 = i42 % 128;
            int i43 = i42 % 2;
            return ConstantKt.CERTIFICATE_TYPE_X509;
        }
        if (i18 == 5) {
            aoe aoeVar2 = (aoe) objArr[0];
            new adh();
            aoeVar2.getClass();
            throw null;
        }
        aoe aoeVar3 = (aoe) objArr[0];
        Object obj = objArr[1];
        int i44 = f53406q0;
        int i45 = i44 ^ 99;
        int i46 = (i44 & 99) << 1;
        int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
        int i48 = i47 % 128;
        f53405p0 = i48;
        if (i47 % 2 != 0) {
            throw null;
        }
        if (obj == aoeVar3) {
            int i49 = i44 & 125;
            int i50 = i44 | 125;
            int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
            f53405p0 = i51 % 128;
            int i52 = i51 % 2;
            int i53 = ((i44 ^ 3) | (i44 & 3)) << 1;
            int i54 = -((i44 & (-4)) | ((~i44) & 3));
            int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
            f53405p0 = i55 % 128;
            if (i55 % 2 != 0) {
                int i56 = 40 / 0;
            }
            bool = Boolean.TRUE;
        } else {
            if (obj instanceof aoe) {
                aoeVar3.getClass();
                ((aoe) obj).getClass();
                throw null;
            }
            int i57 = (-2) - ((i48 + 52) ^ (-1));
            f53406q0 = i57 % 128;
            int i58 = i57 % 2;
            bool = Boolean.FALSE;
        }
        return bool;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, -1853217526, 1853217526, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setY(new Object[]{this}, -260042683, 260042685, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setY(new Object[]{this}, -349626232, 349626237, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setY(new Object[]{this}, -410232317, 410232321, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -1111687238, 1111687239, System.identityHashCode(this))).intValue();
    }

    public final List<PublicKey> setDividerPadding() {
        return (List) setY(new Object[]{this}, 1903915007, -1903915004, System.identityHashCode(this));
    }
}
