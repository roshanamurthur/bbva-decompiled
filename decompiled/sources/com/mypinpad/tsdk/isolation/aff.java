package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class aff implements aef {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f52591q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52592r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public aej f52593p0;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        ady adyVar;
        int i13 = (((~(i10 | i12)) | (~i11)) * 529) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (i11 * 530) + (i10 * 530) + 1058;
        if (i13 == 1) {
            aff affVar = (aff) objArr[0];
            int i14 = f52591q0;
            int i15 = (-2) - ((((i14 | 96) << 1) - (i14 ^ 96)) ^ (-1));
            f52592r0 = i15 % 128;
            int i16 = i15 % 2;
            aej aejVar = affVar.f52593p0;
            if (i16 == 0) {
                throw null;
            }
            afb afbVar = (afb) setOnFocusChangeListener(new Object[]{aejVar}, -1201856613, 1201856613, (int) System.currentTimeMillis());
            int i17 = f52592r0;
            int i18 = ((i17 | 9) << 1) - (i17 ^ 9);
            f52591q0 = i18 % 128;
            if (i18 % 2 == 0) {
                return afbVar;
            }
            throw null;
        }
        if (i13 != 2) {
            aej aejVar2 = (aej) objArr[0];
            afb afbVar2 = new afb((adh) aej.setCompoundDrawableTintBlendMode(new Object[]{aejVar2}, 2021899958, -2021899954, System.identityHashCode(aejVar2)));
            int i19 = f52591q0;
            int i20 = (i19 ^ 85) + ((i19 & 85) << 1);
            f52592r0 = i20 % 128;
            int i21 = i20 % 2;
            return afbVar2;
        }
        aff affVar2 = (aff) objArr[0];
        int i22 = f52592r0;
        int i23 = (i22 & (-14)) | ((~i22) & 13);
        int i24 = (i22 & 13) << 1;
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        f52591q0 = i25 % 128;
        try {
            if (i25 % 2 != 0) {
                adyVar = (ady) setOnFocusChangeListener(new Object[]{affVar2}, -1724653101, 1724653102, System.identityHashCode(affVar2));
                int i26 = 68 / 0;
            } else {
                adyVar = (ady) setOnFocusChangeListener(new Object[]{affVar2}, -1724653101, 1724653102, System.identityHashCode(affVar2));
            }
            ady adyVar2 = adyVar;
            int i27 = f52592r0 + 39;
            f52591q0 = i27 % 128;
            if (i27 % 2 == 0) {
                return adyVar2;
            }
            throw null;
        } catch (IOException e5) {
            throw new adx(e5.getMessage(), e5);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, 1343412964, -1343412962, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() throws IOException {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -1724653101, 1724653102, System.identityHashCode(this));
    }
}
