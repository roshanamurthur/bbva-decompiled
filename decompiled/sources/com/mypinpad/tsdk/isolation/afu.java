package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class afu implements aea {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f52603q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52604r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public s0 f52605p0;

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 965) + ((i10 * (-963)) - 964);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (((~(i10 | i15)) | (~((~i12) | i15))) * (-964)) + ((i14 | (~(i15 | i12))) * (-964)) + i13;
        if (i16 == 1) {
            afu afuVar = (afu) objArr[0];
            int i17 = f52604r0;
            int i18 = (i17 & 40) + (i17 | 40);
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            f52603q0 = i19 % 128;
            int i20 = i19 % 2;
            s0 s0Var = afuVar.f52605p0;
            int i21 = (i17 & 14) + (i17 | 14);
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            f52603q0 = i22 % 128;
            if (i22 % 2 == 0) {
                return s0Var;
            }
            throw null;
        }
        if (i16 == 2) {
            s0 s0Var2 = ((afu) objArr[0]).f52605p0;
            aft aftVar = new aft((byte[]) s0.b(new Object[]{s0Var2}, 1552872941, -1552872940, System.identityHashCode(s0Var2)));
            int i23 = f52604r0 + 37;
            f52603q0 = i23 % 128;
            if (i23 % 2 == 0) {
                return aftVar;
            }
            throw null;
        }
        afu afuVar2 = (afu) objArr[0];
        int i24 = f52603q0;
        int i25 = i24 & 101;
        int i26 = (i24 | 101) & (~i25);
        int i27 = -(-(i25 << 1));
        int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
        f52604r0 = i28 % 128;
        try {
            if (i28 % 2 != 0) {
                return (ady) setX(new Object[]{afuVar2}, -1038542878, 1038542880, System.identityHashCode(afuVar2));
            }
            throw null;
        } catch (IOException e5) {
            StringBuilder sb2 = new StringBuilder("IOException converting stream to byte array: ");
            sb2.append(e5.getMessage());
            throw new adx(sb2.toString(), e5);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, -1382732195, 1382732195, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aea
    public final InputStream setDividerPadding() {
        return (InputStream) setX(new Object[]{this}, -654088152, 654088153, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() throws IOException {
        return (ady) setX(new Object[]{this}, -1038542878, 1038542880, System.identityHashCode(this));
    }
}
