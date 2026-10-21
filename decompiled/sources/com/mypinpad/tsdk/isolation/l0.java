package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class l0 implements aem {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f56875s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f56876t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f56877p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f56878q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final aej f56879r0;

    public l0(int i10, int i11, aej aejVar) {
        this.f56877p0 = i10;
        this.f56878q0 = i11;
        this.f56879r0 = aejVar;
    }

    @Override // com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        System.identityHashCode(this);
        l0 l0Var = (l0) new Object[]{this}[0];
        int i10 = f56875s0;
        int i11 = i10 & 115;
        int i12 = ((i10 | 115) & (~i11)) + (i11 << 1);
        f56876t0 = i12 % 128;
        try {
            if (i12 % 2 != 0) {
                return l0Var.setLayoutAnimation();
            }
            l0Var.setLayoutAnimation();
            throw null;
        } catch (IOException e5) {
            throw new adx(e5.getMessage());
        }
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public ady setLayoutAnimation() throws IOException {
        int i10 = f56876t0;
        int i11 = i10 & 45;
        int i12 = (((i10 ^ 45) | i11) << 1) - ((i10 | 45) & (~i11));
        f56875s0 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = this.f56878q0;
        int i15 = this.f56877p0;
        aej aejVar = this.f56879r0;
        if (i13 != 0) {
            throw null;
        }
        ady adyVar = (ady) aej.setCompoundDrawableTintBlendMode(new Object[]{aejVar, Integer.valueOf(i15), Integer.valueOf(i14)}, -1472002010, 1472002016, i15);
        int i16 = f56875s0;
        int i17 = (i16 & 25) + (i16 | 25);
        f56876t0 = i17 % 128;
        int i18 = i17 % 2;
        return adyVar;
    }
}
