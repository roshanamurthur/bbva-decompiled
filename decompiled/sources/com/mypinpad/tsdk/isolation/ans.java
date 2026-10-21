package com.mypinpad.tsdk.isolation;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class ans extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53348s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53349t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f53350r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ans(byte[] bArr) {
        super(true);
        byte[] bArr2 = (byte[]) setX(new Object[]{bArr}, 213122647, -213122645, (int) System.currentTimeMillis());
        byte[] bArr3 = new byte[32];
        this.f53350r0 = bArr3;
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b8, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.aub.setY(new java.lang.Object[]{r12.f53350r0, r13, r4, 0}, 903755251, -903755249, 0)).booleanValue() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ba, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.ans.f53348s0;
        r12 = r11 & 91;
        r12 = r12 + ((r11 ^ 91) | r12);
        com.mypinpad.tsdk.isolation.ans.f53349t0 = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cf, code lost:
    
        throw new java.lang.IllegalStateException("X25519 agreement failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008c, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.aub.setY(new java.lang.Object[]{r12.f53350r0, r13, r4, 0}, 903755251, -903755249, 0)).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ans.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final anx setCompoundDrawableTintBlendMode() {
        return (anx) setX(new Object[]{this}, -1977001129, 1977001130, System.identityHashCode(this));
    }

    public final void setY(anx anxVar, byte[] bArr, int i10) {
        setX(new Object[]{this, anxVar, bArr, Integer.valueOf(i10)}, -392064954, 392064954, i10);
    }

    public ans(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.f53350r0 = bArr;
        aub.setY(new Object[]{secureRandom, bArr}, 1886179456, -1886179455, (int) System.currentTimeMillis());
    }
}
