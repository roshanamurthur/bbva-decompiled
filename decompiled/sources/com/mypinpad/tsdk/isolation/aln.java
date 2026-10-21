package com.mypinpad.tsdk.isolation;

import org.bouncycastle.jcajce.spec.XDHParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public final class aln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ans f53050a;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-1917)) + (i10 * 960);
        int i14 = ~i11;
        int i15 = ~i12;
        if ((((~(i10 | i15)) | (~(i14 | i12))) * 959) + (i14 * (-959)) + (((~(i14 | i15)) | (~(i10 | i12))) * 959) + i13 == 1) {
            ans.setX(new Object[]{((aln) objArr[0]).f53050a, (anx) ((akk) objArr[1]), (byte[]) objArr[2], 0}, -392064954, 392064954, 0);
            return null;
        }
        aln alnVar = (aln) objArr[0];
        ans ansVar = (ans) ((akk) objArr[1]);
        alnVar.f53050a = ansVar;
        Object[] objArr2 = {XDHParameterSpec.X25519, ansVar};
        System.currentTimeMillis();
        new alo((String) objArr2[0], 128, (ans) objArr2[1], akp.setX);
        aku.setCompoundDrawableTintBlendMode(new Object[0], -825950727, 825950727, (int) System.currentTimeMillis());
        return null;
    }

    public final void setCompoundDrawableTintBlendMode(akk akkVar) {
        setOnFocusChangeListener(new Object[]{this, akkVar}, 2132207906, -2132207906, System.identityHashCode(this));
    }

    public final void setDividerPadding(akk akkVar, byte[] bArr) {
        setOnFocusChangeListener(new Object[]{this, akkVar, bArr}, -1925988061, 1925988062, System.identityHashCode(this));
    }
}
