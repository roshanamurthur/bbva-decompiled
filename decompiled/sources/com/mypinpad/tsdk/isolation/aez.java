package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class aez implements aea {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f52570q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52571r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final aej f52572p0;

    public aez(aej aejVar) {
        this.f52572p0 = aejVar;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 334) + (i10 * (-665));
        int i14 = ~i10;
        int i15 = (i14 * (-333)) + i13;
        int i16 = ~i12;
        int i17 = (((~(i14 | i12)) | (~(i11 | i16))) * 333) + (((~(i14 | i16)) | (~(i11 | i12))) * 333) + i15;
        if (i17 == 1) {
            aex aexVar = new aex((byte[]) bfc.setOnFocusChangeListener(new Object[]{new n0((aej) objArr[0])}, 1574614765, -1574614762, (int) System.currentTimeMillis()));
            int i18 = f52570q0 + 73;
            f52571r0 = i18 % 128;
            int i19 = i18 % 2;
            return aexVar;
        }
        if (i17 == 2) {
            aez aezVar = (aez) objArr[0];
            int i20 = f52570q0;
            int i21 = (((i20 | 4) << 1) - (i20 ^ 4)) - 1;
            f52571r0 = i21 % 128;
            int i22 = i21 % 2;
            aex aexVar2 = (aex) setOnFocusChangeListener(new Object[]{aezVar.f52572p0}, 1038087760, -1038087759, (int) System.currentTimeMillis());
            int i23 = f52570q0;
            int i24 = (-2) - ((((i23 | 56) << 1) - (i23 ^ 56)) ^ (-1));
            f52571r0 = i24 % 128;
            if (i24 % 2 != 0) {
                return aexVar2;
            }
            int i25 = 43 / 0;
            return aexVar2;
        }
        if (i17 != 3) {
            n0 n0Var = new n0(((aez) objArr[0]).f52572p0);
            int i26 = f52571r0 + 81;
            f52570q0 = i26 % 128;
            if (i26 % 2 == 0) {
                return n0Var;
            }
            throw null;
        }
        aez aezVar2 = (aez) objArr[0];
        int i27 = f52571r0;
        int i28 = (i27 & (-116)) | ((~i27) & 115);
        int i29 = -(-((i27 & 115) << 1));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        f52570q0 = i30 % 128;
        int i31 = i30 % 2;
        try {
            ady adyVar = (ady) setOnFocusChangeListener(new Object[]{aezVar2}, -773223124, 773223126, System.identityHashCode(aezVar2));
            int i32 = f52570q0 + 87;
            f52571r0 = i32 % 128;
            int i33 = i32 % 2;
            return adyVar;
        } catch (IOException e5) {
            StringBuilder sb2 = new StringBuilder("IOException converting stream to byte array: ");
            sb2.append(e5.getMessage());
            throw new adx(sb2.toString(), e5);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -407371121, 407371124, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aea
    public final InputStream setDividerPadding() {
        return (InputStream) setOnFocusChangeListener(new Object[]{this}, 1246251226, -1246251226, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() throws IOException {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -773223124, 773223126, System.identityHashCode(this));
    }
}
