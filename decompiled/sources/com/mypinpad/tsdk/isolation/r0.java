package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 extends l0 {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f58035w0 = 1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f58036u0;

    public r0(int i10, int i11, boolean z10, aej aejVar) {
        super(i10, i11, aejVar);
        this.f58036u0 = z10;
    }

    @Override // com.mypinpad.tsdk.isolation.l0, com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() throws IOException {
        System.identityHashCode(this);
        r0 r0Var = (r0) new Object[]{this}[0];
        int i10 = v0 + 1;
        f58035w0 = i10 % 128;
        int i11 = i10 % 2;
        int i12 = r0Var.f56877p0;
        ady adyVar = (ady) aej.setCompoundDrawableTintBlendMode(new Object[]{r0Var.f56879r0, Integer.valueOf(i12), Integer.valueOf(r0Var.f56878q0), Boolean.valueOf(r0Var.f58036u0)}, 1844930564, -1844930559, i12);
        int i13 = f58035w0;
        int i14 = (i13 & 23) + (i13 | 23);
        v0 = i14 % 128;
        int i15 = i14 % 2;
        return adyVar;
    }
}
