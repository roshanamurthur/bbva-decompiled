package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class afa implements adc {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52582r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52583s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final aej f52584p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public m0 f52585q0;

    public afa(aej aejVar) {
        this.f52584p0 = aejVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int iIntValue;
        int i13 = ~i10;
        int i14 = (((~(i10 | (~i11))) | (~(i11 | i12))) * 302) + ((~(i13 | i11 | i12)) * (-604)) + (((~((~i12) | i13 | i11)) | (~(i10 | i11 | i12))) * (-302)) + (i11 * (-301)) + (i10 * 303);
        if (i14 == 1) {
            afa afaVar = (afa) objArr[0];
            m0 m0Var = new m0(afaVar.f52584p0);
            afaVar.f52585q0 = m0Var;
            int i15 = f52582r0;
            int i16 = ((i15 | 81) << 1) - (((~i15) & 81) | (i15 & (-82)));
            f52583s0 = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 60 / 0;
            }
            return m0Var;
        }
        if (i14 == 2) {
            m0 m0Var2 = new m0((aej) objArr[0]);
            aev aevVar = new aev((byte[]) bfc.setOnFocusChangeListener(new Object[]{m0Var2}, 1574614765, -1574614762, (int) System.currentTimeMillis()), ((Integer) m0.a(new Object[]{m0Var2}, -344436061, 344436063, System.identityHashCode(m0Var2))).intValue());
            int i18 = f52583s0 + 13;
            f52582r0 = i18 % 128;
            if (i18 % 2 == 0) {
                return aevVar;
            }
            throw null;
        }
        if (i14 == 3) {
            afa afaVar2 = (afa) objArr[0];
            int i19 = f52583s0;
            int i20 = ((i19 | 27) << 1) - (i19 ^ 27);
            f52582r0 = i20 % 128;
            try {
                if (i20 % 2 == 0) {
                    return (ady) setY(new Object[]{afaVar2}, -1062588247, 1062588247, System.identityHashCode(afaVar2));
                }
                throw null;
            } catch (IOException e5) {
                StringBuilder sb2 = new StringBuilder("IOException converting stream to byte array: ");
                sb2.append(e5.getMessage());
                throw new adx(sb2.toString(), e5);
            }
        }
        if (i14 != 4) {
            afa afaVar3 = (afa) objArr[0];
            int i21 = f52583s0;
            int i22 = i21 & 105;
            int i23 = (i21 | 105) & (~i22);
            int i24 = -(-(i22 << 1));
            int i25 = (i23 & i24) + (i23 | i24);
            f52582r0 = i25 % 128;
            int i26 = i25 % 2;
            aev aevVar2 = (aev) setY(new Object[]{afaVar3.f52584p0}, 967337476, -967337474, (int) System.currentTimeMillis());
            int i27 = f52582r0;
            int i28 = (i27 & 23) + (i27 | 23);
            f52583s0 = i28 % 128;
            if (i28 % 2 != 0) {
                return aevVar2;
            }
            int i29 = 2 / 0;
            return aevVar2;
        }
        afa afaVar4 = (afa) objArr[0];
        int i30 = f52582r0;
        int i31 = i30 ^ 113;
        int i32 = ((i30 & 113) | i31) << 1;
        int i33 = -i31;
        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
        f52583s0 = i34 % 128;
        int i35 = i34 % 2;
        m0 m0Var3 = afaVar4.f52585q0;
        Object[] objArr2 = new Object[1];
        if (i35 == 0) {
            objArr2[0] = m0Var3;
            iIntValue = ((Integer) m0.a(objArr2, -344436061, 344436063, System.identityHashCode(m0Var3))).intValue();
            int i36 = 34 / 0;
        } else {
            objArr2[0] = m0Var3;
            iIntValue = ((Integer) m0.a(objArr2, -344436061, 344436063, System.identityHashCode(m0Var3))).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @Override // com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, 1867095488, -1867095485, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() throws IOException {
        return (ady) setY(new Object[]{this}, -1062588247, 1062588247, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adc
    public final int setOnDragListener() {
        return ((Integer) setY(new Object[]{this}, -93597395, 93597399, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adc
    public final InputStream setX() throws IOException {
        return (InputStream) setY(new Object[]{this}, 1996784037, -1996784036, System.identityHashCode(this));
    }
}
