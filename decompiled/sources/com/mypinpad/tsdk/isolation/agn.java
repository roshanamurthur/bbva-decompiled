package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class agn implements aec {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f52621q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52622r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public aej f52623p0;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-475)) + (i10 * 477);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i15 | i10 | i12);
        if (((~(i10 | i15 | (~i12))) * 476) + (i16 * 952) + ((i14 | i16) * (-476)) + i13 == 1) {
            agn agnVar = (agn) objArr[0];
            int i17 = f52621q0;
            int i18 = (i17 & 80) + (i17 | 80);
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            f52622r0 = i19 % 128;
            int i20 = i19 % 2;
            aej aejVar = agnVar.f52623p0;
            agi agiVar = (agi) p0.a(new Object[]{(adh) aej.setCompoundDrawableTintBlendMode(new Object[]{aejVar}, 2021899958, -2021899954, System.identityHashCode(aejVar))}, -1653659896, 1653659896, (int) System.currentTimeMillis());
            int i21 = f52622r0 + 103;
            f52621q0 = i21 % 128;
            int i22 = i21 % 2;
            return agiVar;
        }
        agn agnVar2 = (agn) objArr[0];
        int i23 = f52622r0;
        int i24 = i23 | 65;
        int i25 = ((i24 << 1) - (~(-((~(i23 & 65)) & i24)))) - 1;
        f52621q0 = i25 % 128;
        try {
            if (i25 % 2 != 0) {
                throw null;
            }
            ady adyVar = (ady) setOnFocusChangeListener(new Object[]{agnVar2}, -2047866803, 2047866804, System.identityHashCode(agnVar2));
            int i26 = f52622r0;
            int i27 = ((i26 | 27) << 1) - (i26 ^ 27);
            f52621q0 = i27 % 128;
            int i28 = i27 % 2;
            return adyVar;
        } catch (IOException e5) {
            throw new IllegalStateException(e5.getMessage());
        }
    }

    @Override // com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -90079181, 90079181, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() throws IOException {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -2047866803, 2047866804, System.identityHashCode(this));
    }
}
