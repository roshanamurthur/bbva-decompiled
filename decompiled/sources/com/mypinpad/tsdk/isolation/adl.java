package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class adl extends ady {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52475y0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final adu f52476t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final adp f52477u0;
    public final ady v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f52478w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final ady f52479x0;

    static {
        Integer num = 8;
        num.intValue();
        int i10 = f52475y0 + 121;
        E0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public adl(adu aduVar, adp adpVar, ady adyVar, int i10, ady adyVar2) {
        this.f52476t0 = aduVar;
        this.f52477u0 = adpVar;
        this.v0 = adyVar;
        this.f52478w0 = ((Integer) setDividerPadding(new Object[]{Integer.valueOf(i10)}, 607333364, -607333357, i10)).intValue();
        this.f52479x0 = (ady) setDividerPadding(new Object[]{Integer.valueOf(i10), adyVar2}, -1605719928, 1605719931, i10);
    }

    public static /* synthetic */ void g(Object[] objArr) throws IOException {
        adl adlVar = (adl) objArr[0];
        aeb aebVar = (aeb) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i10 = E0 + 108;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f52475y0 = i11 % 128;
        int i12 = i11 % 2;
        aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 40}, 1303469841, -1303469839, 40);
        adlVar.f().c(aebVar, false);
        int i13 = E0;
        int i14 = i13 ^ 97;
        int i15 = ((i13 & 97) | i14) << 1;
        int i16 = -i14;
        int i17 = (i15 & i16) + (i15 | i16);
        f52475y0 = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ ady h(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        ady adyVar = (ady) objArr[1];
        int i10 = f52475y0;
        int i11 = (((i10 ^ 93) | (i10 & 93)) << 1) - ((i10 & (-94)) | ((~i10) & 93));
        E0 = i11 % 128;
        int i12 = i11 % 2;
        if (iIntValue == 1) {
            ads.a aVar = ads.f52500u0;
            ady adyVarC = j0.c(-589139092, 589139094, System.identityHashCode(aVar), new Object[]{aVar, adyVar});
            int i13 = f52475y0;
            int i14 = i13 ^ 3;
            int i15 = (((i13 & 3) | i14) << 1) - i14;
            E0 = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 29 / 0;
            }
            return adyVarC;
        }
        if (iIntValue != 2) {
            int i17 = (i10 ^ 79) + ((i10 & 79) << 1);
            E0 = i17 % 128;
            if (i17 % 2 != 0) {
                return adyVar;
            }
            throw null;
        }
        acz.a aVar2 = acz.f52437u0;
        ady adyVarC2 = j0.c(-589139092, 589139094, System.identityHashCode(aVar2), new Object[]{aVar2, adyVar});
        int i18 = E0 + 49;
        f52475y0 = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 71 / 0;
        }
        return adyVarC2;
    }

    public static /* synthetic */ ady i(Object[] objArr) {
        aed aedVar = (aed) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f52475y0;
        int i11 = ((i10 & 62) + (i10 | 62)) - 1;
        E0 = i11 % 128;
        if (i11 % 2 == 0) {
            aedVar.setCompoundDrawableTintBlendMode();
            throw null;
        }
        if (aedVar.setCompoundDrawableTintBlendMode() <= iIntValue) {
            throw new IllegalArgumentException("too few objects in input sequence");
        }
        ady adyVarUiMessageCallbackKtWhenMappings = aedVar.setX(iIntValue).UiMessageCallbackKtWhenMappings();
        int i12 = E0 + 89;
        f52475y0 = i12 % 128;
        if (i12 % 2 == 0) {
            return adyVarUiMessageCallbackKtWhenMappings;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:57:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x02f5  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a7, code lost:
    
        if (6940 == r13) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d0, code lost:
    
        if (128 == r13) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d2, code lost:
    
        if (r5 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d4, code lost:
    
        if (r5 == 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d6, code lost:
    
        if (r5 != 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d8, code lost:
    
        r10 = (com.mypinpad.tsdk.isolation.acz) com.mypinpad.tsdk.isolation.acz.setDividerPadding(new java.lang.Object[]{r10}, -2033199183, 2033199187, (int) java.lang.System.currentTimeMillis());
        r11 = com.mypinpad.tsdk.isolation.adl.E0;
        r13 = (((r11 ^ 109) | (r11 & 109)) << 1) - (((~r11) & 109) | (r11 & (-110)));
        com.mypinpad.tsdk.isolation.adl.f52475y0 = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0102, code lost:
    
        r12 = new java.lang.StringBuilder("invalid tag: ");
        r12.append((java.lang.String) com.mypinpad.tsdk.isolation.aeu.setX(new java.lang.Object[]{java.lang.Integer.valueOf(r13), java.lang.Integer.valueOf(r5)}, 1539419709, -1539419709, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0127, code lost:
    
        throw new java.lang.IllegalArgumentException(r12.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0128, code lost:
    
        r10 = (com.mypinpad.tsdk.isolation.ads) com.mypinpad.tsdk.isolation.ads.setDividerPadding(new java.lang.Object[]{r10, java.lang.Boolean.FALSE}, 1788383860, -1788383856, (int) java.lang.System.currentTimeMillis());
        r11 = com.mypinpad.tsdk.isolation.adl.f52475y0;
        r11 = (-2) - (((r11 & 78) + (r11 | 78)) ^ (-1));
        com.mypinpad.tsdk.isolation.adl.E0 = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0153, code lost:
    
        r10 = ((com.mypinpad.tsdk.isolation.adw) com.mypinpad.tsdk.isolation.aeh.setOnFocusChangeListener(new java.lang.Object[]{r10}, 872654789, -872654774, java.lang.System.identityHashCode(r10))).UiMessageCallbackKtWhenMappings();
        java.lang.System.currentTimeMillis();
        java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0173, code lost:
    
        r12 = new java.lang.StringBuilder("invalid tag: ");
        r12.append((java.lang.String) com.mypinpad.tsdk.isolation.aeu.setX(new java.lang.Object[]{java.lang.Integer.valueOf(r13), java.lang.Integer.valueOf(r5)}, 1539419709, -1539419709, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0198, code lost:
    
        throw new java.lang.IllegalArgumentException(r12.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r10, int r11, int r12, int r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.adl.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public ady a() {
        agj agjVar = new agj(this.f52476t0, this.f52477u0, this.v0, this.f52478w0, this.f52479x0);
        int i10 = E0;
        int i11 = i10 & 55;
        int i12 = (i10 | 55) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        f52475y0 = i14 % 128;
        int i15 = i14 % 2;
        return agjVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, -1574662497, 1574662508, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setDividerPadding(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 1233080480, -1233080474, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setDividerPadding(new Object[]{this, adyVar}, -106960585, 106960594, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public ady e() {
        afg afgVar = new afg(this.f52476t0, this.f52477u0, this.v0, this.f52478w0, this.f52479x0);
        int i10 = E0;
        int i11 = ((i10 ^ 100) + ((i10 & 100) << 1)) - 1;
        f52475y0 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 9 / 0;
        }
        return afgVar;
    }

    public abstract aed f();

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = f52475y0;
        int i11 = i10 & 21;
        int i12 = (i11 - (~(-(-((i10 ^ 21) | i11))))) - 1;
        E0 = i12 % 128;
        int i13 = i12 % 2;
        int iIntValue = ((Integer) bev.setOnFocusChangeListener(new Object[]{this.f52476t0}, -2050569287, 2050569288, (int) System.currentTimeMillis())).intValue();
        int iIntValue2 = ((Integer) bev.setOnFocusChangeListener(new Object[]{this.f52477u0}, -2050569287, 2050569288, (int) System.currentTimeMillis())).intValue();
        int i14 = (iIntValue | iIntValue2) & (~(iIntValue & iIntValue2));
        int iIntValue3 = ((Integer) bev.setOnFocusChangeListener(new Object[]{this.v0}, -2050569287, 2050569288, (int) System.currentTimeMillis())).intValue();
        int i15 = (~iIntValue3) & i14;
        int i16 = (~i14) & iIntValue3;
        int i17 = (i16 & i15) | (i15 ^ i16);
        int i18 = this.f52478w0;
        int i19 = i17 & i18;
        int i20 = ((i17 ^ i18) | i19) & (~i19);
        int iHashCode = this.f52479x0.hashCode();
        int i21 = (~iHashCode) & i20;
        int i22 = (~i20) & iHashCode;
        int i23 = (i22 & i21) | (i21 ^ i22);
        int i24 = f52475y0;
        int i25 = i24 & 27;
        int i26 = (i24 ^ 27) | i25;
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        E0 = i27 % 128;
        if (i27 % 2 != 0) {
            return i23;
        }
        throw null;
    }

    public final adp setLayoutAnimation() {
        return (adp) setDividerPadding(new Object[]{this}, 901093441, -901093439, System.identityHashCode(this));
    }

    public final ady setOnDragListener() {
        return (ady) setDividerPadding(new Object[]{this}, 538502844, -538502844, System.identityHashCode(this));
    }

    public final ady setOnFocusChangeListener() {
        return (ady) setDividerPadding(new Object[]{this}, -948630986, 948630990, System.identityHashCode(this));
    }

    public final adu setX() {
        return (adu) setDividerPadding(new Object[]{this}, 89982222, -89982212, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 872206819, -872206814, System.identityHashCode(this))).booleanValue();
    }

    public adl(aed aedVar) {
        int i10;
        ady adyVar = (ady) setDividerPadding(new Object[]{aedVar, 0}, -1355152957, 1355152958, 0);
        if (adyVar instanceof adu) {
            this.f52476t0 = (adu) adyVar;
            adyVar = (ady) setDividerPadding(new Object[]{aedVar, 1}, -1355152957, 1355152958, 1);
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (adyVar instanceof adp) {
            this.f52477u0 = (adp) adyVar;
            int i11 = i10 & 48;
            int i12 = (i11 - (~(-(-((i10 ^ 48) | i11))))) - 1;
            int i13 = i12 ^ (-47);
            int i14 = -(-((i12 & (-47)) << 1));
            i10 = ((i13 | i14) << 1) - (i14 ^ i13);
            adyVar = (ady) setDividerPadding(new Object[]{aedVar, Integer.valueOf(i10)}, -1355152957, 1355152958, i10);
        }
        if (!(adyVar instanceof aeh)) {
            this.v0 = adyVar;
            i10 = ((i10 & 1) << 1) + ((i10 & (-2)) | ((~i10) & 1));
            adyVar = (ady) setDividerPadding(new Object[]{aedVar, Integer.valueOf(i10)}, -1355152957, 1355152958, i10);
        }
        if (aedVar.setCompoundDrawableTintBlendMode() != ((i10 | 1) << 1) - (i10 ^ 1)) {
            throw new IllegalArgumentException("input sequence too large");
        }
        if (!(adyVar instanceof aeh)) {
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        aeh aehVar = (aeh) adyVar;
        int iIntValue = ((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, -1417963191, 1417963201, System.identityHashCode(aehVar))).intValue();
        this.f52478w0 = ((Integer) setDividerPadding(new Object[]{Integer.valueOf(iIntValue)}, 607333364, -607333357, iIntValue)).intValue();
        this.f52479x0 = (ady) setDividerPadding(new Object[]{aehVar}, -1541907863, 1541907875, (int) System.currentTimeMillis());
    }

    public final int setDividerPadding() {
        return ((Integer) setDividerPadding(new Object[]{this}, 2120988267, -2120988259, System.identityHashCode(this))).intValue();
    }
}
