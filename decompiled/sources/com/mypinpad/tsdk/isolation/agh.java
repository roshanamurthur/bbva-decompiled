package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class agh implements adc {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52612r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52613s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final s0 f52614p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f52615q0 = 0;

    public agh(s0 s0Var) {
        this.f52614p0 = s0Var;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13 = (~i10) | (~i12);
        int i14 = ((i10 | (~(i11 | i12))) * 519) + (((~(i13 | i11)) | (~(i10 | i11 | i12))) * (-519)) + (((~i13) | i11) * 519) + (i11 * (-518)) + (i10 * (-518));
        if (i14 == 1) {
            agh aghVar = (agh) objArr[0];
            int i15 = f52612r0;
            int i16 = (((i15 | 84) << 1) - (i15 ^ 84)) - 1;
            f52613s0 = i16 % 128;
            int i17 = i16 % 2;
            s0 s0Var = aghVar.f52614p0;
            acz aczVar = (acz) acz.setDividerPadding(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, -1839471968, 1839471976, (int) System.currentTimeMillis());
            int i18 = f52612r0 + 83;
            f52613s0 = i18 % 128;
            if (i18 % 2 != 0) {
                return aczVar;
            }
            int i19 = 81 / 0;
            return aczVar;
        }
        if (i14 == 2) {
            agh aghVar2 = (agh) objArr[0];
            int i20 = f52613s0;
            int i21 = i20 & 99;
            int i22 = ((i20 | 99) & (~i21)) + (i21 << 1);
            int i23 = i22 % 128;
            f52612r0 = i23;
            int i24 = i22 % 2;
            int i25 = aghVar2.f52615q0;
            int i26 = i23 & 11;
            int i27 = ((i23 ^ 11) | i26) << 1;
            int i28 = -((i23 | 11) & (~i26));
            int i29 = (i27 & i28) + (i27 | i28);
            f52613s0 = i29 % 128;
            int i30 = i29 % 2;
            return Integer.valueOf(i25);
        }
        if (i14 == 3) {
            agh aghVar3 = (agh) objArr[0];
            int i31 = f52613s0;
            int i32 = (i31 & 89) + (i31 | 89);
            f52612r0 = i32 % 128;
            int i33 = i32 % 2;
            try {
                ady adyVar = (ady) setY(new Object[]{aghVar3}, -881671900, 881671901, System.identityHashCode(aghVar3));
                int i34 = f52612r0;
                int i35 = (i34 & 89) + (i34 | 89);
                f52613s0 = i35 % 128;
                int i36 = i35 % 2;
                return adyVar;
            } catch (IOException e5) {
                StringBuilder sb2 = new StringBuilder("IOException converting stream to byte array: ");
                sb2.append(e5.getMessage());
                throw new adx(sb2.toString(), e5);
            }
        }
        if (i14 != 4) {
            agh aghVar4 = (agh) objArr[0];
            int i37 = f52613s0;
            int i38 = i37 ^ 29;
            int i39 = -(-((i37 & 29) << 1));
            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
            f52612r0 = i40 % 128;
            Object[] objArr2 = new Object[1];
            if (i40 % 2 == 0) {
                objArr2[0] = aghVar4;
                return (InputStream) setY(objArr2, -1923779513, 1923779517, System.identityHashCode(aghVar4));
            }
            objArr2[0] = aghVar4;
            throw null;
        }
        agh aghVar5 = (agh) objArr[0];
        int i41 = f52612r0;
        int i42 = i41 ^ 119;
        int i43 = ((i41 & 119) | i42) << 1;
        int i44 = -i42;
        int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
        f52613s0 = i45 % 128;
        int i46 = i45 % 2;
        s0 s0Var2 = aghVar5.f52614p0;
        int iIntValue = ((Integer) s0.b(new Object[]{s0Var2}, -1664608674, 1664608676, System.identityHashCode(s0Var2))).intValue();
        if (iIntValue <= 0) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        s0 s0Var3 = aghVar5.f52614p0;
        int i47 = s0Var3.read();
        aghVar5.f52615q0 = i47;
        if (i47 > 0) {
            int i48 = f52612r0;
            int i49 = i48 & 105;
            int i50 = (i48 ^ 105) | i49;
            int i51 = (i49 & i50) + (i50 | i49);
            f52613s0 = i51 % 128;
            int i52 = i51 % 2;
            if (iIntValue < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (i47 > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
        }
        int i53 = f52612r0;
        int i54 = ((i53 ^ 13) | (i53 & 13)) << 1;
        int i55 = -(((~i53) & 13) | (i53 & (-14)));
        int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
        f52613s0 = i56 % 128;
        int i57 = i56 % 2;
        return s0Var3;
    }

    @Override // com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, -1448916908, 1448916911, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() throws IOException {
        return (ady) setY(new Object[]{this}, -881671900, 881671901, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adc
    public final int setOnDragListener() {
        return ((Integer) setY(new Object[]{this}, -297681112, 297681114, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adc
    public final InputStream setX() throws IOException {
        return (InputStream) setY(new Object[]{this}, -512420991, 512420991, System.identityHashCode(this));
    }
}
