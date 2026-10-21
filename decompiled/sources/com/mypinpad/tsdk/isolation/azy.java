package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;

/* JADX INFO: loaded from: classes10.dex */
public final class azy extends azw {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f54219w0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final w2 f54220t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final u2 f54221u0;

    public azy(azz azzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, azzVar);
        this.f54220t0 = new w2(bArr, bArr2);
        this.f54221u0 = new u2(bArr3, bArr4);
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (((~(i11 | (~i12))) | (~(i13 | i11))) * Opcodes.ATHROW) + ((i10 | (~(i11 | i12))) * Opcodes.ATHROW) + (i13 * (-191)) + (i11 * 192) + (i10 * (-381));
        if (i14 == 1) {
            azy azyVar = (azy) objArr[0];
            int i15 = f54219w0;
            int i16 = i15 ^ 115;
            int i17 = (((i15 & 115) | i16) << 1) - i16;
            v0 = i17 % 128;
            int i18 = i17 % 2;
            byte[] bArr = azyVar.f54221u0.f61233b;
            if (i18 == 0) {
                return (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
            }
            throw null;
        }
        if (i14 == 2) {
            azy azyVar2 = (azy) objArr[0];
            int i19 = f54219w0;
            int i20 = i19 & 125;
            int i21 = (((i19 ^ 125) | i20) << 1) - ((i19 | 125) & (~i20));
            v0 = i21 % 128;
            int i22 = i21 % 2;
            byte[] bArr2 = azyVar2.f54221u0.f61232a;
            if (i22 == 0) {
                return (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
            }
            throw null;
        }
        if (i14 == 3) {
            azy azyVar3 = (azy) objArr[0];
            int i23 = v0;
            int i24 = i23 & 73;
            int i25 = i24 + ((i23 ^ 73) | i24);
            f54219w0 = i25 % 128;
            int i26 = i25 % 2;
            byte[] bArr3 = azyVar3.f54220t0.f61597b;
            if (i26 == 0) {
                throw null;
            }
            byte[] bArr4 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i27 = v0;
            int i28 = i27 & 41;
            int i29 = ((i27 | 41) & (~i28)) + (i28 << 1);
            f54219w0 = i29 % 128;
            if (i29 % 2 != 0) {
                return bArr4;
            }
            int i30 = 37 / 0;
            return bArr4;
        }
        if (i14 != 4) {
            azy azyVar4 = (azy) objArr[0];
            int i31 = f54219w0;
            int i32 = ((i31 & 24) + (i31 | 24)) - 1;
            v0 = i32 % 128;
            int i33 = i32 % 2;
            byte[] bArr5 = (byte[]) bek.setOnFocusChangeListener(new Object[]{azyVar4.f54220t0.f61596a}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i34 = v0;
            int i35 = i34 & 121;
            int i36 = -(-((i34 ^ 121) | i35));
            int i37 = (i35 & i36) + (i36 | i35);
            f54219w0 = i37 % 128;
            int i38 = i37 % 2;
            return bArr5;
        }
        azy azyVar5 = (azy) objArr[0];
        int i39 = v0;
        int i40 = i39 & 121;
        int i41 = (((i39 ^ 121) | i40) << 1) - ((i39 | 121) & (~i40));
        f54219w0 = i41 % 128;
        int i42 = i41 % 2;
        azz dividerPadding = azyVar5.setDividerPadding();
        Object[] objArr2 = {dividerPadding};
        w2 w2Var = azyVar5.f54220t0;
        u2 u2Var = azyVar5.f54221u0;
        byte[] bArr6 = (byte[]) bek.setOnFocusChangeListener(new Object[]{new byte[][]{(byte[]) azz.setOnFocusChangeListener(objArr2, -1303490317, 1303490318, System.identityHashCode(dividerPadding)), w2Var.f61596a, w2Var.f61597b, u2Var.f61232a, u2Var.f61233b}}, 107086576, -107086562, (int) System.currentTimeMillis());
        int i43 = v0;
        int i44 = (((i43 | 102) << 1) - (i43 ^ 102)) - 1;
        f54219w0 = i44 % 128;
        int i45 = i44 % 2;
        return bArr6;
    }

    public final byte[] getNavBarTitleString() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1332740973, -1332740972, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -383505759, 383505759, System.identityHashCode(this));
    }

    public final byte[] setOnLongClickListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 566920265, -566920261, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -2104415716, 2104415718, System.identityHashCode(this));
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -1117919234, 1117919237, System.identityHashCode(this));
    }
}
