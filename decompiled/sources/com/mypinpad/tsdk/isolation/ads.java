package com.mypinpad.tsdk.isolation;

import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ads extends ady implements aea {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a f52500u0 = new a(ads.class, 4);
    public static final byte[] v0 = new byte[0];

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52501w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52502x0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f52503t0;

    public static class a extends j0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52504f;

        public static /* synthetic */ ads e(Object[] objArr, int i10, int i11, int i12) {
            ads adsVarH;
            int i13 = ~i10;
            int i14 = ~(i13 | i11);
            int i15 = ~i12;
            int i16 = ((i14 | (~(i15 | i11))) * (-108)) + (i11 * (-107)) + (i10 * 55);
            int i17 = ~(i13 | i12);
            int i18 = ~((~i11) | i10);
            if (((i18 | i12) * 54) + (((~(i10 | i15)) | i17 | i18) * 54) + i16 != 1) {
                aed aedVar = (aed) objArr[1];
                int i19 = f52504f;
                int i20 = ((i19 & 106) + (i19 | 106)) - 1;
                int i21 = i20 % 128;
                int i22 = i20 % 2;
                adsVarH = aedVar.h();
                if (i22 == 0) {
                    int i23 = 34 / 0;
                }
            } else {
                adsVarH = (aft) objArr[1];
                int i24 = (-2) - ((f52504f + 86) ^ (-1));
                int i25 = i24 % 128;
                if (i24 % 2 == 0) {
                    int i26 = 9 / 0;
                }
                int i27 = (i25 & 41) + (i25 | 41);
                f52504f = i27 % 128;
                int i28 = i27 % 2;
            }
            return adsVarH;
        }

        @Override // com.mypinpad.tsdk.isolation.j0
        public final ady b(aft aftVar) {
            return e(new Object[]{this, aftVar}, -71394969, 71394970, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.j0
        public final ady d(aed aedVar) {
            return e(new Object[]{this, aedVar}, -569126240, 569126240, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f52501w0;
        int i11 = i10 & 71;
        int i12 = -(-((i10 ^ 71) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52502x0 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 70 / 0;
        }
    }

    public ads(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f52503t0 = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0276, code lost:
    
        if ((r11 instanceof com.mypinpad.tsdk.isolation.ads) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0283, code lost:
    
        if ((!(r11 instanceof com.mypinpad.tsdk.isolation.ads)) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0285, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.ads.f52501w0;
        r12 = ((r10 & 84) + (r10 | 84)) - 1;
        com.mypinpad.tsdk.isolation.ads.f52502x0 = r12 % 128;
        r12 = r12 % 2;
        r11 = (com.mypinpad.tsdk.isolation.ads) r11;
        r12 = (((r10 | 10) << 1) - (r10 ^ 10)) - 1;
        com.mypinpad.tsdk.isolation.ads.f52502x0 = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02a2, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.ads.f52502x0;
        r12 = (r11 & (-62)) | ((~r11) & 61);
        r11 = -(-((r11 & 61) << 1));
        r13 = ((r12 | r11) << 1) - (r11 ^ r12);
        com.mypinpad.tsdk.isolation.ads.f52501w0 = r13 % 128;
        r13 = r13 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r10, int r11, int r12, int r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ads.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static ads setX(Object obj) {
        return (ads) setDividerPadding(new Object[]{obj}, 1337255032, -1337255030, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public ady a() {
        aft aftVar = new aft(this.f52503t0);
        int i10 = f52501w0;
        int i11 = ((i10 ^ 92) + ((i10 & 92) << 1)) - 1;
        f52502x0 = i11 % 128;
        if (i11 % 2 != 0) {
            return aftVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setDividerPadding(new Object[]{this, adyVar}, 1585915449, -1585915449, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public ady e() {
        aft aftVar = new aft(this.f52503t0);
        int i10 = f52502x0;
        int i11 = ((i10 ^ 61) | (i10 & 61)) << 1;
        int i12 = -(((~i10) & 61) | (i10 & (-62)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52501w0 = i13 % 128;
        int i14 = i13 % 2;
        return aftVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = f52502x0;
        int i11 = (i10 & 69) + (i10 | 69);
        f52501w0 = i11 % 128;
        int i12 = i11 % 2;
        int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) setDividerPadding(new Object[]{this}, -952512304, 952512305, System.identityHashCode(this))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
        int i13 = f52501w0;
        int i14 = (((i13 | 40) << 1) - (i13 ^ 40)) - 1;
        f52502x0 = i14 % 128;
        int i15 = i14 % 2;
        return iIntValue;
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setDividerPadding(new Object[]{this}, -952512304, 952512305, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() {
        return (ady) setDividerPadding(new Object[]{this}, -660588305, 660588308, System.identityHashCode(this));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("#");
        sb2.append((String) bez.setX(new Object[]{(byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{this.f52503t0}, 1477946699, -1477946695, (int) System.currentTimeMillis())}, -1321203111, 1321203112, (int) System.currentTimeMillis()));
        String string = sb2.toString();
        int i10 = f52501w0 + 91;
        f52502x0 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    public static ads setCompoundDrawableTintBlendMode(aeh aehVar, boolean z10) {
        return (ads) setDividerPadding(new Object[]{aehVar, Boolean.valueOf(z10)}, 1788383860, -1788383856, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.aea
    public final InputStream setDividerPadding() {
        return (InputStream) setDividerPadding(new Object[]{this}, -839420010, 839420015, System.identityHashCode(this));
    }
}
