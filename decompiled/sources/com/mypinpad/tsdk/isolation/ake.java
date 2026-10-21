package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ake extends adw implements akf {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52998t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52999u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adu f53000r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ady f53001s0;

    public ake(int i10, int i11, int i12, int i13) {
        this.f53000r0 = akf.setDividerPadding;
        adh adhVar = new adh(3);
        adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(i10)}, 240298319, -240298315, System.identityHashCode(adhVar));
        if (i12 == 0) {
            if (i13 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, akf.setOnFocusChangeListener}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(i11)}, 240298319, -240298315, System.identityHashCode(adhVar));
        } else {
            if (i12 <= i11 || i13 <= i12) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, akf.setOnDragListener}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh adhVar2 = new adh(3);
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new adp(i11)}, 240298319, -240298315, System.identityHashCode(adhVar2));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new adp(i12)}, 240298319, -240298315, System.identityHashCode(adhVar2));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, c.a(adhVar2, new Object[]{adhVar2, new adp(i13)}, 240298319, -240298315, adhVar2)}, 240298319, -240298315, System.identityHashCode(adhVar));
        }
        this.f53001s0 = new afv(adhVar);
    }

    public static ake setDividerPadding(Object obj) {
        return (ake) setY(new Object[]{obj}, -1517063374, 1517063377, (int) System.currentTimeMillis());
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~i12;
        int i17 = (((~(i11 | i16)) | (~(i12 | i14)) | i13) * 988) + (((~(i10 | i16)) | i15) * (-1976)) + ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
        if (i17 == 1) {
            ake akeVar = (ake) objArr[0];
            int i18 = f52999u0;
            int i19 = (i18 ^ 69) + ((i18 & 69) << 1);
            f52998t0 = i19 % 128;
            int i20 = i19 % 2;
            adu aduVar = akeVar.f53000r0;
            int i21 = ((-1) << 1) - ((-1) ^ ((i18 ^ 28) + ((i18 & 28) << 1)));
            f52998t0 = i21 % 128;
            int i22 = i21 % 2;
            return aduVar;
        }
        if (i17 == 2) {
            ake akeVar2 = (ake) objArr[0];
            adh adhVar = new adh(2);
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, akeVar2.f53000r0}, 240298319, -240298315, System.identityHashCode(adhVar));
            afv afvVarA = c.a(adhVar, new Object[]{adhVar, akeVar2.f53001s0}, 240298319, -240298315, adhVar);
            int i23 = f52998t0;
            int i24 = i23 & 89;
            int i25 = (i23 ^ 89) | i24;
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            f52999u0 = i26 % 128;
            int i27 = i26 % 2;
            return afvVarA;
        }
        if (i17 != 3) {
            ake akeVar3 = (ake) objArr[0];
            int i28 = f52998t0;
            int i29 = i28 & 125;
            int i30 = -(-((i28 ^ 125) | i29));
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            int i32 = i31 % 128;
            f52999u0 = i32;
            int i33 = i31 % 2;
            ady adyVar = akeVar3.f53001s0;
            int i34 = i32 + 71;
            f52998t0 = i34 % 128;
            if (i34 % 2 == 0) {
                return adyVar;
            }
            int i35 = 6 / 0;
            return adyVar;
        }
        Object obj = objArr[0];
        System.currentTimeMillis();
        System.currentTimeMillis();
        if (!(!(obj instanceof ake))) {
            int i36 = f52998t0;
            int i37 = i36 & 33;
            int i38 = i37 + ((i36 ^ 33) | i37);
            int i39 = i38 % 128;
            f52999u0 = i39;
            int i40 = i38 % 2;
            ake akeVar4 = (ake) obj;
            int i41 = i39 & 93;
            int i42 = ((((i39 ^ 93) | i41) << 1) - (~(-((i39 | 93) & (~i41))))) - 1;
            f52998t0 = i42 % 128;
            int i43 = i42 % 2;
            return akeVar4;
        }
        if (obj == null) {
            int i44 = f52998t0;
            int i45 = (i44 ^ 117) + ((i44 & 117) << 1);
            f52999u0 = i45 % 128;
            if (i45 % 2 != 0) {
                return null;
            }
            throw null;
        }
        aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
        ake akeVar5 = new ake();
        akeVar5.f53000r0 = (adu) adu.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode.setX(0)}, -892573455, 892573460, (int) System.currentTimeMillis());
        akeVar5.f53001s0 = compoundDrawableTintBlendMode.setX(1).UiMessageCallbackKtWhenMappings();
        int i46 = f52999u0;
        int i47 = (i46 & (-58)) | ((~i46) & 57);
        int i48 = -(-((i46 & 57) << 1));
        int i49 = (i47 & i48) + (i48 | i47);
        f52998t0 = i49 % 128;
        if (i49 % 2 == 0) {
            return akeVar5;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, -1145660336, 1145660338, System.identityHashCode(this));
    }

    public final adu setOnFocusChangeListener() {
        return (adu) setY(new Object[]{this}, -1045465378, 1045465379, System.identityHashCode(this));
    }

    public final ady setX() {
        return (ady) setY(new Object[]{this}, -1604615837, 1604615837, System.identityHashCode(this));
    }

    public ake(int i10, int i11) {
        this(i10, i11, 0, 0);
    }

    public ake(BigInteger bigInteger) {
        this.f53000r0 = akf.setCompoundDrawableTintBlendMode;
        this.f53001s0 = new adp(bigInteger);
    }
}
