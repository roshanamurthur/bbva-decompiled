package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class avy extends adw {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f54031r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54032s0;

    public avy(byte[] bArr, byte[] bArr2) {
        this.f54031r0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54032s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        avy avyVar = (avy) objArr[0];
        adh adhVar = new adh();
        adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(0L)}, 240298319, -240298315, System.identityHashCode(adhVar));
        adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avyVar.f54031r0)}, 240298319, -240298315, System.identityHashCode(adhVar));
        return c.a(adhVar, new Object[]{adhVar, new aft(avyVar.f54032s0)}, 240298319, -240298315, adhVar);
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setDividerPadding(new Object[]{this}, 1892096095, -1892096095, System.identityHashCode(this));
    }
}
