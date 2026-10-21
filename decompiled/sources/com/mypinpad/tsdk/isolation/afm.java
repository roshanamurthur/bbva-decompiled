package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class afm implements adi {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f52595q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52596r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final aej f52597p0;

    public afm(aej aejVar) {
        this.f52597p0 = aejVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~(i13 | i12);
        int i16 = ~i11;
        int i17 = ((i15 | (~(i16 | i12))) * 140) + ((i14 | i15) * (-280)) + (i11 * (-139)) + (i10 * 141);
        int i18 = ~(i13 | i16 | i12);
        int i19 = ~i12;
        int i20 = (((~(i10 | i19 | i16)) | (~(i11 | i13 | i19)) | i18) * 140) + i17;
        if (i20 == 1) {
            aej aejVar = (aej) objArr[0];
            try {
                agj agjVar = new agj(new agi((adh) aej.setCompoundDrawableTintBlendMode(new Object[]{aejVar}, 2021899958, -2021899954, System.identityHashCode(aejVar))));
                int i21 = f52595q0;
                int i22 = (((i21 | 84) << 1) - (i21 ^ 84)) - 1;
                f52596r0 = i22 % 128;
                if (i22 % 2 != 0) {
                    return agjVar;
                }
                throw null;
            } catch (IllegalArgumentException e5) {
                throw new adk(e5.getMessage(), e5);
            }
        }
        if (i20 == 2) {
            afm afmVar = (afm) objArr[0];
            int i23 = f52596r0;
            int i24 = ((i23 | 31) << 1) - (i23 ^ 31);
            f52595q0 = i24 % 128;
            int i25 = i24 % 2;
            agj agjVar2 = (agj) setY(new Object[]{afmVar.f52597p0}, -810232216, 810232217, (int) System.currentTimeMillis());
            int i26 = f52595q0;
            int i27 = (i26 ^ 37) + ((i26 & 37) << 1);
            f52596r0 = i27 % 128;
            if (i27 % 2 != 0) {
                return agjVar2;
            }
            throw null;
        }
        afm afmVar2 = (afm) objArr[0];
        int i28 = f52595q0;
        int i29 = i28 & 105;
        int i30 = (i28 | 105) & (~i29);
        int i31 = -(-(i29 << 1));
        int i32 = (i30 & i31) + (i30 | i31);
        f52596r0 = i32 % 128;
        try {
            if (i32 % 2 == 0) {
                throw null;
            }
            ady adyVar = (ady) setY(new Object[]{afmVar2}, -442784095, 442784097, System.identityHashCode(afmVar2));
            int i33 = f52595q0;
            int i34 = i33 & 123;
            int i35 = (i33 | 123) & (~i34);
            int i36 = -(-(i34 << 1));
            int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
            f52596r0 = i37 % 128;
            int i38 = i37 % 2;
            return adyVar;
        } catch (IOException e7) {
            throw new adx("unable to get DER object", e7);
        } catch (IllegalArgumentException e10) {
            throw new adx("unable to get DER object", e10);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, -1791836347, 1791836347, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() throws IOException {
        return (ady) setY(new Object[]{this}, -442784095, 442784097, System.identityHashCode(this));
    }
}
