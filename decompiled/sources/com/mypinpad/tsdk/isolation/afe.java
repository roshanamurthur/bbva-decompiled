package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class afe implements aec {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f52588q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52589r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public aej f52590p0;

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i12 | i11);
        int i15 = (((~(i10 | (~i11))) | (~(i13 | i11))) * 110) + ((i14 | (~(i10 | i11))) * 220) + ((i13 | i14) * (-220)) + (i11 * 111) + (i10 * (-109));
        if (i15 == 1) {
            afe afeVar = (afe) objArr[0];
            int i16 = f52588q0;
            int i17 = i16 ^ 83;
            int i18 = ((((i16 & 83) | i17) << 1) - (~(-i17))) - 1;
            f52589r0 = i18 % 128;
            int i19 = i18 % 2;
            aej aejVar = afeVar.f52590p0;
            if (i19 == 0) {
                throw null;
            }
            aey aeyVar = (aey) setY(new Object[]{aejVar}, 1735669363, -1735669363, (int) System.currentTimeMillis());
            int i20 = f52589r0;
            int i21 = i20 & 61;
            int i22 = (((i20 ^ 61) | i21) << 1) - ((i20 | 61) & (~i21));
            f52588q0 = i22 % 128;
            int i23 = i22 % 2;
            return aeyVar;
        }
        if (i15 != 2) {
            aej aejVar2 = (aej) objArr[0];
            aey aeyVar2 = new aey((adh) aej.setCompoundDrawableTintBlendMode(new Object[]{aejVar2}, 2021899958, -2021899954, System.identityHashCode(aejVar2)));
            int i24 = f52588q0;
            int i25 = i24 & 65;
            int i26 = (i25 - (~((i24 ^ 65) | i25))) - 1;
            f52589r0 = i26 % 128;
            if (i26 % 2 != 0) {
                return aeyVar2;
            }
            throw null;
        }
        afe afeVar2 = (afe) objArr[0];
        int i27 = f52588q0 + 49;
        f52589r0 = i27 % 128;
        try {
            if (i27 % 2 != 0) {
                return (ady) setY(new Object[]{afeVar2}, -1210150178, 1210150179, System.identityHashCode(afeVar2));
            }
            throw null;
        } catch (IOException e5) {
            throw new IllegalStateException(e5.getMessage());
        }
    }

    @Override // com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, 1347738494, -1347738492, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() throws IOException {
        return (ady) setY(new Object[]{this}, -1210150178, 1210150179, System.identityHashCode(this));
    }
}
