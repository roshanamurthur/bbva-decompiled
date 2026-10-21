package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes10.dex */
public abstract class apk implements apj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53493a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53494b = 1;

    public static class setCompoundDrawableTintBlendMode extends setOnFocusChangeListener {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f53495i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f53496j = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f53497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f53498f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int[] f53499g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final p1 f53500h;

        public setCompoundDrawableTintBlendMode(int i10, int[] iArr, p1 p1Var) {
            this.f53498f = i10;
            this.f53497e = iArr.length == 1 ? 2 : 3;
            this.f53499g = iArr;
            this.f53500h = p1Var;
        }

        /* JADX WARN: Code duplicated, block: B:96:0x0512  */
        /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0290, code lost:
        
            if (r1 <= 0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0293, code lost:
        
            if (r1 <= 0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0295, code lost:
        
            r1 = r3 & 121;
            r2 = -(-((r3 ^ 121) | r1));
            r3 = ((r1 | r2) << 1) - (r1 ^ r2);
            com.mypinpad.tsdk.i.apk.setCompoundDrawableTintBlendMode.f53496j = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x02a6, code lost:
        
            if ((r3 % 2) != 0) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x02a8, code lost:
        
            r1 = 61 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x02ad, code lost:
        
            r3 = r0.f53498f;
            r0 = r0.f53499g;
            r2 = new com.mypinpad.tsdk.i.apk.setCompoundDrawableTintBlendMode(r3, r0, (com.mypinpad.tsdk.isolation.p1) com.mypinpad.tsdk.isolation.p1.m(new java.lang.Object[]{r0.f53500h, java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(r3), r0}, -868380472, 868380504, r1));
            r0 = com.mypinpad.tsdk.i.apk.setCompoundDrawableTintBlendMode.f53496j;
            r1 = (r0 & (-28)) | ((~r0) & 27);
            r0 = -(-((r0 & 27) << 1));
            r3 = (r1 ^ r0) + ((r0 & r1) << 1);
            com.mypinpad.tsdk.i.apk.setCompoundDrawableTintBlendMode.f53495i = r3 % 128;
            r3 = r3 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r16, int r17, int r18, int r19) {
            /*
                Method dump skipped, instruction units count: 1864
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.apk.setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
        }

        public final boolean equals(Object obj) {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, obj}, -777515827, 777515844, System.identityHashCode(this))).booleanValue();
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final boolean getNavBarTitleString() {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -1121149238, 1121149241, System.identityHashCode(this))).booleanValue();
        }

        public final int hashCode() {
            return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -300737661, 300737670, System.identityHashCode(this))).intValue();
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final boolean setAlwaysDrawnWithCacheEnabled() {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -1239318878, 1239318898, System.identityHashCode(this))).booleanValue();
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setDividerPadding(apk apkVar) {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar}, 1832396981, -1832396969, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final int setLayoutAnimation() {
            return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -464091160, 464091160, System.identityHashCode(this))).intValue();
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setNavigationOnClickListener() {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 2044389071, -2044389069, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final boolean setOnDragListener() {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 615138131, -615138130, System.identityHashCode(this))).booleanValue();
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setOnFocusChangeListener(apk apkVar) {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar}, 1443050235, -1443050225, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setOnLongClickListener() {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 1392268825, -1392268806, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setX() {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 246658062, -246658048, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setY(apk apkVar, apk apkVar2) {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2}, 192201398, -192201393, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setDividerPadding() {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 803100042, -803100029, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final int setOnFocusChangeListener() {
            return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 284148093, -284148082, System.identityHashCode(this))).intValue();
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setY() {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 1707256473, -1707256469, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setY(apk apkVar, apk apkVar2, apk apkVar3) {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2, apkVar3}, 1147397983, -1147397968, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setY(apk apkVar) {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar}, 515330648, -515330642, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setCompoundDrawableTintBlendMode(int i10) {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, 1159113972, -1159113956, i10);
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setCompoundDrawableTintBlendMode(apk apkVar, apk apkVar2, apk apkVar3) {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2, apkVar3}, -2119735181, 2119735188, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar}, -1777460776, 1777460794, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final BigInteger setCompoundDrawableTintBlendMode() {
            return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, 169688977, -169688969, System.identityHashCode(this));
        }
    }

    public static abstract class setDividerPadding extends apk {
    }

    public static abstract class setOnFocusChangeListener extends apk {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f53501c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f53502d = 1;

        public int UiMessageCallbackKtWhenMappings() {
            int onFocusChangeListener;
            int iIntValue;
            int i10 = f53501c;
            int i11 = i10 & 5;
            int i12 = (i11 - (~((i10 ^ 5) | i11))) - 1;
            f53502d = i12 % 128;
            if (i12 % 2 == 0) {
                onFocusChangeListener = setOnFocusChangeListener();
                iIntValue = ((Integer) beq.setY(new Object[]{Integer.valueOf(onFocusChangeListener)}, 339562877, -339562877, onFocusChangeListener)).intValue() * 40;
            } else {
                onFocusChangeListener = setOnFocusChangeListener();
                int i13 = -((Integer) beq.setY(new Object[]{Integer.valueOf(onFocusChangeListener)}, 339562877, -339562877, onFocusChangeListener)).intValue();
                int i14 = ((~i13) & 31) | (i13 & (-32));
                int i15 = -(-((i13 & 31) << 1));
                iIntValue = ((i14 | i15) << 1) - (i15 ^ i14);
            }
            int i16 = f53502d;
            int i17 = (((i16 | 62) << 1) - (i16 ^ 62)) - 1;
            f53501c = i17 % 128;
            int i18 = i17 % 2;
            apk onFocusChangeListener2 = this;
            int i19 = 1;
            while (iIntValue > 0) {
                int i20 = f53502d;
                int i21 = i20 & 103;
                int i22 = -(-((i20 ^ 103) | i21));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                f53501c = i23 % 128;
                int i24 = i23 % 2;
                onFocusChangeListener2 = onFocusChangeListener2.setCompoundDrawableTintBlendMode(i19).setOnFocusChangeListener(onFocusChangeListener2);
                if (i24 != 0) {
                    iIntValue += 74;
                    int i25 = -(-iIntValue);
                    int i26 = onFocusChangeListener & i25;
                    int i27 = -(-((i25 ^ onFocusChangeListener) | i26));
                    i19 = (i26 & i27) + (i27 | i26);
                } else {
                    iIntValue = (iIntValue << 1) + (~iIntValue);
                    i19 = onFocusChangeListener >>> iIntValue;
                    if ((i19 & 1) == 0) {
                        continue;
                    }
                }
                int i28 = f53501c;
                int i29 = i28 & 93;
                int i30 = ((i28 ^ 93) | i29) << 1;
                int i31 = -((i28 | 93) & (~i29));
                int i32 = (i30 & i31) + (i31 | i30);
                f53502d = i32 % 128;
                if (i32 % 2 == 0) {
                    onFocusChangeListener2.setX().setOnFocusChangeListener(this);
                    throw null;
                }
                onFocusChangeListener2 = onFocusChangeListener2.setX().setOnFocusChangeListener(this);
                int i33 = f53502d;
                int i34 = ((i33 ^ 41) - (~((i33 & 41) << 1))) - 1;
                f53501c = i34 % 128;
                int i35 = i34 % 2;
            }
            if (!(!onFocusChangeListener2.setOnDragListener())) {
                int i36 = f53502d;
                int i37 = i36 + 11;
                f53501c = i37 % 128;
                int i38 = i37 % 2;
                int i39 = (i36 ^ 93) + ((i36 & 93) << 1);
                f53501c = i39 % 128;
                int i40 = i39 % 2;
                return 0;
            }
            if (!onFocusChangeListener2.getNavBarTitleString()) {
                throw new IllegalStateException("Internal error in trace calculation");
            }
            int i41 = f53502d;
            int i42 = (i41 ^ 99) + ((i41 & 99) << 1);
            int i43 = i42 % 128;
            f53501c = i43;
            int i44 = i42 % 2 == 0 ? 1 : 0;
            int i45 = ((i43 ^ 66) + ((i43 & 66) << 1)) - 1;
            f53502d = i45 % 128;
            if (i45 % 2 != 0) {
                return i44;
            }
            throw null;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v11 int, still in use, count: 2, list:
              (r1v11 int) from 0x0015: ARITH (r1v11 int) & (1 int) A[WRAPPED] (LINE:22)
              (r1v11 int) from 0x0022: PHI (r1 I:??) = (r1v3 int), (r1v11 int) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        public com.mypinpad.tsdk.isolation.apk setIncludeFontPadding() {
            /*
                Method dump skipped, instruction units count: 380
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.apk.setOnFocusChangeListener.setIncludeFontPadding():com.mypinpad.tsdk.i.apk");
        }

        public boolean setZ() {
            int i10 = f53501c;
            int i11 = (i10 ^ 23) + ((i10 & 23) << 1);
            f53502d = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 & 17;
            int i14 = (i10 ^ 17) | i13;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            f53502d = i15 % 128;
            if (i15 % 2 != 0) {
                return false;
            }
            throw null;
        }
    }

    public static class setY extends setDividerPadding {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f53503f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f53504g = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigInteger f53505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final BigInteger f53506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final BigInteger f53507e;

        public setY(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this.f53505c = bigInteger;
            this.f53506d = bigInteger2;
            this.f53507e = bigInteger3;
        }

        public static /* synthetic */ Boolean a(Object[] objArr) {
            setY sety = (setY) objArr[0];
            Object obj = objArr[1];
            int i10 = f53504g;
            int i11 = i10 & 119;
            int i12 = -(-((i10 ^ 119) | i11));
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            int i14 = i13 % 128;
            f53503f = i14;
            if (i13 % 2 != 0) {
                throw null;
            }
            if (obj == sety) {
                int i15 = i10 & 55;
                int i16 = ((~i15) & (i10 | 55)) + (i15 << 1);
                f53503f = i16 % 128;
                if (i16 % 2 == 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
            if (!(obj instanceof setY)) {
                int i17 = i14 & 53;
                int i18 = ((i14 ^ 53) | i17) << 1;
                int i19 = -((~i17) & (i14 | 53));
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                int i21 = i20 % 128;
                f53504g = i21;
                int i22 = i20 % 2;
                int i23 = (i21 ^ 11) + ((i21 & 11) << 1);
                f53503f = i23 % 128;
                int i24 = i23 % 2;
                return Boolean.FALSE;
            }
            setY sety2 = (setY) obj;
            if (sety.f53505c.equals(sety2.f53505c)) {
                int i25 = f53504g;
                int i26 = (((i25 ^ 39) | (i25 & 39)) << 1) - (((~i25) & 39) | (i25 & (-40)));
                f53503f = i26 % 128;
                int i27 = i26 % 2;
                BigInteger bigInteger = sety.f53507e;
                BigInteger bigInteger2 = sety2.f53507e;
                if (i27 != 0) {
                    bigInteger.equals(bigInteger2);
                    throw null;
                }
                if (bigInteger.equals(bigInteger2)) {
                    int i28 = f53504g;
                    int i29 = (i28 & (-106)) | ((~i28) & 105);
                    int i30 = (i28 & 105) << 1;
                    int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                    int i32 = i31 % 128;
                    f53503f = i32;
                    int i33 = i31 % 2;
                    int i34 = i32 + 111;
                    f53504g = i34 % 128;
                    int i35 = i34 % 2;
                    return Boolean.TRUE;
                }
            }
            int i36 = f53504g;
            int i37 = ((i36 | 31) << 1) - (i36 ^ 31);
            f53503f = i37 % 128;
            if (i37 % 2 == 0) {
                return Boolean.FALSE;
            }
            throw null;
        }

        public static /* synthetic */ apk b(Object[] objArr) {
            setY sety = (setY) objArr[0];
            apk apkVar = (apk) objArr[1];
            int i10 = f53504g;
            int i11 = (i10 & 71) + (i10 | 71);
            f53503f = i11 % 128;
            if (i11 % 2 != 0) {
                apkVar.setX().equals(sety);
                throw null;
            }
            if (!apkVar.setX().equals(sety)) {
                int i12 = f53504g + 65;
                f53503f = i12 % 128;
                if (i12 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            int i13 = f53503f;
            int i14 = ((i13 | 6) << 1) - (i13 ^ 6);
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            int i16 = i15 % 128;
            f53504g = i16;
            if (i15 % 2 == 0) {
                throw null;
            }
            int i17 = i16 + 31;
            f53503f = i17 % 128;
            int i18 = i17 % 2;
            return apkVar;
        }

        public static /* synthetic */ BigInteger c(Object[] objArr) {
            setY sety = (setY) objArr[0];
            BigInteger bigInteger = (BigInteger) objArr[1];
            BigInteger bigInteger2 = (BigInteger) objArr[2];
            int i10 = f53503f;
            int i11 = (i10 & (-6)) | ((~i10) & 5);
            int i12 = (i10 & 5) << 1;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f53504g = i13 % 128;
            int i14 = i13 % 2;
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            if (i14 == 0) {
                bigIntegerSubtract.signum();
                throw null;
            }
            if (bigIntegerSubtract.signum() < 0) {
                bigIntegerSubtract = bigIntegerSubtract.add(sety.f53505c);
                int i15 = f53504g;
                int i16 = i15 & 125;
                int i17 = -(-((i15 ^ 125) | i16));
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                f53503f = i18 % 128;
                int i19 = i18 % 2;
            }
            int i20 = f53503f;
            int i21 = (-2) - ((((i20 | 106) << 1) - (i20 ^ 106)) ^ (-1));
            f53504g = i21 % 128;
            if (i21 % 2 != 0) {
                return bigIntegerSubtract;
            }
            throw null;
        }

        public static /* synthetic */ BigInteger d(Object[] objArr) {
            setY sety = (setY) objArr[0];
            BigInteger bigInteger = (BigInteger) objArr[1];
            int i10 = f53503f;
            int i11 = (i10 ^ 83) + ((i10 & 83) << 1);
            f53504g = i11 % 128;
            int i12 = i11 % 2;
            BigInteger bigInteger2 = sety.f53505c;
            if (i12 == 0) {
                throw null;
            }
            BigInteger bigInteger3 = (BigInteger) bep.setDividerPadding(new Object[]{bigInteger2, bigInteger}, -906767090, 906767094, (int) System.currentTimeMillis());
            int i13 = f53503f;
            int i14 = i13 & 125;
            int i15 = (i13 | 125) & (~i14);
            int i16 = -(-(i14 << 1));
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            f53504g = i17 % 128;
            if (i17 % 2 != 0) {
                return bigInteger3;
            }
            throw null;
        }

        public static /* synthetic */ BigInteger e(Object[] objArr) {
            boolean z10;
            BigInteger bigInteger;
            BigInteger bigIntegerSubtract;
            setY sety = (setY) objArr[0];
            BigInteger bigIntegerMod = (BigInteger) objArr[1];
            int i10 = f53503f;
            int i11 = ((i10 & (-4)) | ((~i10) & 3)) + ((i10 & 3) << 1);
            int i12 = i11 % 128;
            f53504g = i12;
            if (i11 % 2 == 0) {
                BigInteger bigInteger2 = sety.f53506d;
                throw null;
            }
            if (sety.f53506d != null) {
                int i13 = (i12 & 13) + (i12 | 13);
                f53503f = i13 % 128;
                if (i13 % 2 != 0) {
                    bigIntegerMod.signum();
                    throw null;
                }
                if (bigIntegerMod.signum() < 0) {
                    int i14 = f53504g;
                    int i15 = i14 & 125;
                    int i16 = i14 | 125;
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    f53503f = i17 % 128;
                    int i18 = i17 % 2;
                    z10 = true;
                } else {
                    int i19 = f53503f;
                    int i20 = (i19 & 75) + (i19 | 75);
                    f53504g = i20 % 128;
                    int i21 = i20 % 2;
                    z10 = false;
                }
                if (z10) {
                    int i22 = f53503f + 83;
                    f53504g = i22 % 128;
                    if (i22 % 2 == 0) {
                        bigIntegerMod.abs();
                        throw null;
                    }
                    bigIntegerMod = bigIntegerMod.abs();
                }
                int iBitLength = sety.f53505c.bitLength();
                BigInteger bigInteger3 = apj.setOnFocusChangeListener;
                BigInteger bigInteger4 = sety.f53506d;
                boolean zEquals = bigInteger4.equals(bigInteger3);
                int i23 = f53504g;
                int i24 = ((i23 & 16) + (i23 | 16)) - 1;
                f53503f = i24 % 128;
                int i25 = i24 % 2;
                while (true) {
                    int iBitLength2 = bigIntegerMod.bitLength();
                    int iIdentityHashCode = System.identityHashCode(sety);
                    int i26 = (iBitLength * (-112)) - 112;
                    int i27 = ~iBitLength;
                    int i28 = ~iIdentityHashCode;
                    int i29 = i27 & i28;
                    int i30 = (~i29) & (i27 | i28);
                    int i31 = ~((i30 ^ i29) | (i29 & i30));
                    int i32 = ((~i31) & 1) | (i31 & (-2));
                    int i33 = i31 & 1;
                    int i34 = ((i32 ^ i33) | (i33 & i32)) * 226;
                    int i35 = ((i26 | i34) << 1) - (i26 ^ i34);
                    int i36 = ((-2) ^ iBitLength) | ((-2) & iBitLength);
                    int i37 = ~i36;
                    int i38 = i37 & (i36 | i37);
                    int i39 = ((-2) & i28) | (iIdentityHashCode & 1);
                    int i40 = (-2) & iIdentityHashCode;
                    int i41 = ~((i39 ^ i40) | (i40 & i39));
                    int i42 = i38 & i41;
                    int i43 = ((i38 | i41) & (~i42)) | i42;
                    int i44 = (i27 | iBitLength) & i27;
                    int i45 = ((~i28) & i44) | ((~i44) & i28);
                    int i46 = i44 & i28;
                    int i47 = (i46 & i45) | (i45 ^ i46);
                    int i48 = (i47 & 1) | (i47 ^ 1);
                    int i49 = ~i48;
                    int i50 = (i48 | i49) & i49;
                    int i51 = ((~i50) & i43) | ((~i43) & i50);
                    int i52 = i43 & i50;
                    int i53 = -(-(((i52 & i51) | (i51 ^ i52)) * (-113)));
                    int i54 = ((i35 | i53) << 1) - (i53 ^ i35);
                    int i55 = (i27 ^ iIdentityHashCode) | (iIdentityHashCode & i27);
                    int i56 = ~i55;
                    int i57 = ((i55 | i56) & i56) * 113;
                    int i58 = i54 & i57;
                    if (iBitLength2 <= (((i57 | i54) & (~i58)) - (~(-(-(i58 << 1))))) - 1) {
                        while (true) {
                            bigInteger = sety.f53505c;
                            if (bigIntegerMod.compareTo(bigInteger) < 0) {
                                break;
                            }
                            int i59 = f53503f;
                            int i60 = i59 & 61;
                            int i61 = (i59 | 61) & (~i60);
                            int i62 = -(-(i60 << 1));
                            int i63 = (i61 & i62) + (i61 | i62);
                            f53504g = i63 % 128;
                            if (i63 % 2 == 0) {
                                bigIntegerSubtract = bigIntegerMod.subtract(bigInteger);
                                int i64 = 22 / 0;
                            } else {
                                bigIntegerSubtract = bigIntegerMod.subtract(bigInteger);
                            }
                            bigIntegerMod = bigIntegerSubtract;
                        }
                        if (z10) {
                            int i65 = f53504g + 19;
                            f53503f = i65 % 128;
                            if (i65 % 2 != 0) {
                                bigIntegerMod.signum();
                                throw null;
                            }
                            if (bigIntegerMod.signum() != 0) {
                                int i66 = f53504g;
                                int i67 = (i66 & 35) + (i66 | 35);
                                f53503f = i67 % 128;
                                if (i67 % 2 != 0) {
                                    bigInteger.subtract(bigIntegerMod);
                                    throw null;
                                }
                                bigIntegerMod = bigInteger.subtract(bigIntegerMod);
                            }
                        }
                        int i68 = f53503f;
                        int i69 = ((i68 | 113) << 1) - (i68 ^ 113);
                        f53504g = i69 % 128;
                        int i70 = i69 % 2;
                        break;
                    }
                    int i71 = f53503f + 109;
                    f53504g = i71 % 128;
                    if (i71 % 2 == 0) {
                        bigIntegerMod.subtract(bigIntegerMod.shiftRight(iBitLength).shiftLeft(iBitLength));
                        throw null;
                    }
                    BigInteger bigIntegerShiftRight = bigIntegerMod.shiftRight(iBitLength);
                    BigInteger bigIntegerSubtract2 = bigIntegerMod.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                    if (!zEquals) {
                        bigIntegerShiftRight = bigIntegerShiftRight.multiply(bigInteger4);
                        int i72 = f53503f;
                        int i73 = ((i72 & 44) + (i72 | 44)) - 1;
                        f53504g = i73 % 128;
                        int i74 = i73 % 2;
                    }
                    bigIntegerMod = bigIntegerShiftRight.add(bigIntegerSubtract2);
                    int i75 = f53504g;
                    int i76 = ((((i75 ^ 97) | (i75 & 97)) << 1) - (~(-(((~i75) & 97) | (i75 & (-98)))))) - 1;
                    f53503f = i76 % 128;
                    int i77 = i76 % 2;
                }
            } else {
                bigIntegerMod = bigIntegerMod.mod(sety.f53505c);
                int i78 = f53503f;
                int i79 = i78 ^ 1;
                int i80 = ((i78 & 1) | i79) << 1;
                int i81 = -i79;
                int i82 = (i80 & i81) + (i80 | i81);
                f53504g = i82 % 128;
                int i83 = i82 % 2;
            }
            int i84 = f53503f;
            int i85 = i84 & 37;
            int i86 = (((i84 ^ 37) | i85) << 1) - ((i84 | 37) & (~i85));
            f53504g = i86 % 128;
            int i87 = i86 % 2;
            return bigIntegerMod;
        }

        public static /* synthetic */ setY f(Object[] objArr) {
            setY sety = (setY) objArr[0];
            apk apkVar = (apk) objArr[1];
            setY sety2 = new setY(sety.f53505c, sety.f53506d, sety.s(sety.f53507e, apkVar.setCompoundDrawableTintBlendMode()));
            int i10 = f53503f;
            int i11 = ((i10 & 57) - (~(i10 | 57))) - 1;
            f53504g = i11 % 128;
            if (i11 % 2 != 0) {
                return sety2;
            }
            throw null;
        }

        public static /* synthetic */ Integer i(Object[] objArr) {
            setY sety = (setY) objArr[0];
            int i10 = f53503f;
            int i11 = ((i10 & (-30)) | ((~i10) & 29)) + ((i10 & 29) << 1);
            f53504g = i11 % 128;
            int i12 = i11 % 2;
            BigInteger bigInteger = sety.f53505c;
            if (i12 == 0) {
                bigInteger.bitLength();
                throw null;
            }
            int iBitLength = bigInteger.bitLength();
            int i13 = f53503f;
            int i14 = (i13 & (-38)) | ((~i13) & 37);
            int i15 = (i13 & 37) << 1;
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            f53504g = i16 % 128;
            if (i16 % 2 != 0) {
                return Integer.valueOf(iBitLength);
            }
            int i17 = 42 / 0;
            return Integer.valueOf(iBitLength);
        }

        public static /* synthetic */ setY j(Object[] objArr) {
            setY sety = (setY) objArr[0];
            apk apkVar = (apk) objArr[1];
            apk apkVar2 = (apk) objArr[2];
            apk apkVar3 = (apk) objArr[3];
            setY sety2 = new setY(sety.f53505c, sety.f53506d, sety.g(sety.f53507e.multiply(apkVar.setCompoundDrawableTintBlendMode()).subtract(apkVar2.setCompoundDrawableTintBlendMode().multiply(apkVar3.setCompoundDrawableTintBlendMode()))));
            int i10 = f53503f + 87;
            f53504g = i10 % 128;
            if (i10 % 2 != 0) {
                return sety2;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003f  */
        /* JADX WARN: Code duplicated, block: B:12:0x0049  */
        /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r5
          0x002f: PHI (r5v4 java.math.BigInteger) = (r5v3 java.math.BigInteger), (r5v8 java.math.BigInteger) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        public static /* synthetic */ BigInteger k(Object[] objArr) {
            BigInteger bigIntegerShiftLeft;
            int i10;
            setY sety = (setY) objArr[0];
            BigInteger bigInteger = (BigInteger) objArr[1];
            int i11 = f53503f + 73;
            f53504g = i11 % 128;
            if (i11 % 2 == 0) {
                bigIntegerShiftLeft = bigInteger.shiftLeft(0);
                if (bigIntegerShiftLeft.compareTo(sety.f53505c) >= 0) {
                    int i12 = f53504g;
                    i10 = (i12 ^ 67) + ((i12 & 67) << 1);
                    f53503f = i10 % 128;
                    if (i10 % 2 != 0) {
                        bigIntegerShiftLeft = bigIntegerShiftLeft.subtract(sety.f53505c);
                        int i13 = 15 / 0;
                    } else {
                        bigIntegerShiftLeft = bigIntegerShiftLeft.subtract(sety.f53505c);
                    }
                }
            } else {
                bigIntegerShiftLeft = bigInteger.shiftLeft(1);
                if (bigIntegerShiftLeft.compareTo(sety.f53505c) >= 0) {
                    int i14 = f53504g;
                    i10 = (i14 ^ 67) + ((i14 & 67) << 1);
                    f53503f = i10 % 128;
                    if (i10 % 2 != 0) {
                        bigIntegerShiftLeft = bigIntegerShiftLeft.subtract(sety.f53505c);
                        int i15 = 15 / 0;
                    } else {
                        bigIntegerShiftLeft = bigIntegerShiftLeft.subtract(sety.f53505c);
                    }
                }
            }
            int i16 = f53503f;
            int i17 = (-2) - ((((i16 | 64) << 1) - (i16 ^ 64)) ^ (-1));
            f53504g = i17 % 128;
            int i18 = i17 % 2;
            return bigIntegerShiftLeft;
        }

        public static /* synthetic */ setY l(Object[] objArr) {
            setY sety = (setY) objArr[0];
            int i10 = f53504g + 17;
            f53503f = i10 % 128;
            if (i10 % 2 != 0) {
                sety.f53507e.signum();
                throw null;
            }
            if (sety.f53507e.signum() == 0) {
                int i11 = f53504g + 105;
                f53503f = i11 % 128;
                int i12 = i11 % 2;
                return sety;
            }
            BigInteger bigInteger = sety.f53505c;
            setY sety2 = new setY(bigInteger, sety.f53506d, bigInteger.subtract(sety.f53507e));
            int i13 = f53504g;
            int i14 = i13 & 41;
            int i15 = (i14 - (~(-(-((i13 ^ 41) | i14))))) - 1;
            f53503f = i15 % 128;
            int i16 = i15 % 2;
            return sety2;
        }

        public static /* synthetic */ Object m(Object[] objArr) {
            BigInteger bigInteger;
            BigInteger bigInteger2;
            int i10;
            BigInteger bigInteger3;
            BigInteger bigInteger4;
            BigInteger bigInteger5;
            int i11;
            int i12;
            BigInteger bigInteger6;
            BigInteger bigInteger7;
            BigInteger bigInteger8;
            setY sety = (setY) objArr[0];
            int i13 = 1;
            BigInteger bigInteger9 = (BigInteger) objArr[1];
            BigInteger bigInteger10 = (BigInteger) objArr[2];
            BigInteger bigInteger11 = (BigInteger) objArr[3];
            int i14 = f53503f;
            int i15 = i14 | 31;
            int i16 = ((i15 << 1) - (~(-((~(i14 & 31)) & i15)))) - 1;
            f53504g = i16 % 128;
            int i17 = i16 % 2;
            int iBitLength = bigInteger11.bitLength();
            int lowestSetBit = bigInteger11.getLowestSetBit();
            if (i17 == 0) {
                bigInteger = apj.setOnFocusChangeListener;
                bigInteger2 = apj.setDividerPadding;
                i10 = (iBitLength & 53) + (iBitLength | 53) + 20;
            } else {
                bigInteger = apj.setOnFocusChangeListener;
                bigInteger2 = apj.setDividerPadding;
                int i18 = iBitLength & (-38);
                int i19 = ((iBitLength ^ (-38)) | i18) << 1;
                int i20 = -((iBitLength | (-38)) & (~i18));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = i21 & 37;
                i10 = (i22 - (~((i21 ^ 37) | i22))) - 1;
            }
            BigInteger bigInteger12 = bigInteger;
            int i23 = i10;
            BigInteger bigInteger13 = bigInteger2;
            BigInteger bigInteger14 = bigInteger12;
            int i24 = f53504g;
            int i25 = i24 & 121;
            int i26 = ((i24 ^ 121) | i25) << 1;
            int i27 = -((~i25) & (i24 | 121));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            f53503f = i28 % 128;
            int i29 = i28 % 2;
            BigInteger bigInteger15 = bigInteger9;
            while (true) {
                int iIdentityHashCode = System.identityHashCode(sety);
                int i30 = -(-(lowestSetBit * 407));
                int i31 = (i30 & ResultCode.ERROR_REPO_CORRUPT) | ((-405) & (~i30));
                int i32 = ((-405) & i30) << i13;
                int i33 = ((i31 | i32) << i13) - (i31 ^ i32);
                int i34 = ~lowestSetBit;
                int i35 = (i34 ^ iIdentityHashCode) | (i34 & iIdentityHashCode);
                bigInteger3 = bigInteger10;
                int i36 = (~i35) & ((~i35) | i35);
                int i37 = ~iIdentityHashCode;
                int i38 = i37 & 1;
                bigInteger4 = bigInteger9;
                int i39 = (~i38) & (i37 | 1);
                int i40 = (i39 ^ i38) | (i39 & i38);
                int i41 = i40 & lowestSetBit;
                bigInteger5 = bigInteger15;
                int i42 = (~i41) & (i40 | lowestSetBit);
                int i43 = ~((i42 & i41) | (i42 ^ i41));
                int i44 = i36 & i43;
                int i45 = (i43 | i36) & (~i44);
                int i46 = -(-(((i45 & i44) | (i45 ^ i44)) * (-406)));
                int i47 = ((i33 ^ i46) | (i33 & i46)) << 1;
                int i48 = -((i46 & (~i33)) | ((~i46) & i33));
                int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                int i50 = i34 & i37;
                int i51 = (~i50) & (i34 | i37);
                int i52 = (i50 & i51) | (i51 ^ i50);
                int i53 = i52 & 1;
                int i54 = (i52 | 1) & (~i53);
                int i55 = (i54 & i53) | (i54 ^ i53);
                int i56 = (((i55 | (~i55)) & (~i55)) * (-406)) + i49;
                int i57 = ((-2) & i37) | (iIdentityHashCode & 1);
                int i58 = (-2) & iIdentityHashCode;
                int i59 = ~((i58 & i57) | (i57 ^ i58));
                int i60 = ~iIdentityHashCode;
                int i61 = (i34 & i60) | ((~i60) & lowestSetBit);
                int i62 = i60 & lowestSetBit;
                int i63 = ~((i62 & i61) | (i61 ^ i62));
                int i64 = i59 ^ i63;
                int i65 = i59 & i63;
                int i66 = ((i65 & i64) | (i64 ^ i65)) * 406;
                int i67 = i56 & i66;
                int i68 = -(-((i56 ^ i66) | i67));
                if (i23 < (i67 & i68) + (i68 | i67)) {
                    break;
                }
                int i69 = f53504g;
                int i70 = (i69 & 61) + (i69 | 61);
                f53503f = i70 % 128;
                if (i70 % 2 != 0) {
                    i11 = 1;
                    bigInteger7 = (BigInteger) setX(new Object[]{sety, bigInteger12, bigInteger14}, 1484269935, -1484269934, System.identityHashCode(sety));
                    int i71 = 45 / 0;
                    if (!bigInteger11.testBit(i23)) {
                        bigInteger6 = bigInteger7;
                        i12 = 2;
                        BigInteger bigIntegerSubtract = bigInteger.multiply(bigInteger13).subtract(bigInteger6);
                        Object[] objArr2 = new Object[i12];
                        objArr2[0] = sety;
                        objArr2[i11] = bigIntegerSubtract;
                        BigInteger bigInteger16 = (BigInteger) setX(objArr2, -628445762, 628445764, System.identityHashCode(sety));
                        bigInteger4 = bigInteger4;
                        BigInteger bigIntegerSubtract2 = bigInteger5.multiply(bigInteger13).subtract(bigInteger4.multiply(bigInteger6));
                        Object[] objArr3 = new Object[i12];
                        objArr3[0] = sety;
                        objArr3[i11] = bigIntegerSubtract2;
                        BigInteger bigInteger17 = (BigInteger) setX(objArr3, -628445762, 628445764, System.identityHashCode(sety));
                        BigInteger bigIntegerSubtract3 = bigInteger13.multiply(bigInteger13).subtract(bigInteger6.shiftLeft(i11));
                        Object[] objArr4 = new Object[i12];
                        objArr4[0] = sety;
                        objArr4[i11] = bigIntegerSubtract3;
                        BigInteger bigInteger18 = (BigInteger) setX(objArr4, -628445762, 628445764, System.identityHashCode(sety));
                        int i72 = f53503f;
                        int i73 = i72 & 21;
                        int i74 = (i73 - (~(-(-((i72 ^ 21) | i73))))) - 1;
                        f53504g = i74 % 128;
                        int i75 = i74 % 2;
                        bigInteger13 = bigInteger18;
                        bigInteger = bigInteger16;
                        bigInteger15 = bigInteger17;
                        bigInteger8 = bigInteger6;
                        bigInteger12 = bigInteger8;
                    } else {
                        int i76 = f53503f;
                        int i77 = i76 & 61;
                        int i78 = (i76 | 61) & (~i77);
                        int i79 = -(-(i77 << 1));
                        int i80 = (i78 & i79) + (i78 | i79);
                        f53504g = i80 % 128;
                        int i81 = i80 % 2;
                        bigInteger8 = (BigInteger) setX(new Object[]{sety, bigInteger7, bigInteger3}, 1484269935, -1484269934, System.identityHashCode(sety));
                        BigInteger bigInteger19 = (BigInteger) setX(new Object[]{sety, bigInteger, bigInteger5}, 1484269935, -1484269934, System.identityHashCode(sety));
                        BigInteger bigInteger20 = (BigInteger) setX(new Object[]{sety, bigInteger5.multiply(bigInteger13).subtract(bigInteger4.multiply(bigInteger7))}, -628445762, 628445764, System.identityHashCode(sety));
                        bigInteger15 = (BigInteger) setX(new Object[]{sety, bigInteger5.multiply(bigInteger5).subtract(bigInteger8.shiftLeft(1))}, -628445762, 628445764, System.identityHashCode(sety));
                        int i82 = f53503f;
                        int i83 = i82 & 125;
                        int i84 = (i83 - (~((i82 ^ 125) | i83))) - 1;
                        f53504g = i84 % 128;
                        int i85 = i84 % 2;
                        bigInteger12 = bigInteger7;
                        bigInteger = bigInteger19;
                        bigInteger13 = bigInteger20;
                    }
                } else {
                    i11 = 1;
                    i12 = 2;
                    bigInteger6 = (BigInteger) setX(new Object[]{sety, bigInteger12, bigInteger14}, 1484269935, -1484269934, System.identityHashCode(sety));
                    if (!bigInteger11.testBit(i23)) {
                        BigInteger bigIntegerSubtract4 = bigInteger.multiply(bigInteger13).subtract(bigInteger6);
                        Object[] objArr5 = new Object[i12];
                        objArr5[0] = sety;
                        objArr5[i11] = bigIntegerSubtract4;
                        BigInteger bigInteger110 = (BigInteger) setX(objArr5, -628445762, 628445764, System.identityHashCode(sety));
                        bigInteger4 = bigInteger4;
                        BigInteger bigIntegerSubtract5 = bigInteger5.multiply(bigInteger13).subtract(bigInteger4.multiply(bigInteger6));
                        Object[] objArr6 = new Object[i12];
                        objArr6[0] = sety;
                        objArr6[i11] = bigIntegerSubtract5;
                        BigInteger bigInteger111 = (BigInteger) setX(objArr6, -628445762, 628445764, System.identityHashCode(sety));
                        BigInteger bigIntegerSubtract6 = bigInteger13.multiply(bigInteger13).subtract(bigInteger6.shiftLeft(i11));
                        Object[] objArr7 = new Object[i12];
                        objArr7[0] = sety;
                        objArr7[i11] = bigIntegerSubtract6;
                        BigInteger bigInteger112 = (BigInteger) setX(objArr7, -628445762, 628445764, System.identityHashCode(sety));
                        int i710 = f53503f;
                        int i711 = i710 & 21;
                        int i712 = (i711 - (~(-(-((i710 ^ 21) | i711))))) - 1;
                        f53504g = i712 % 128;
                        int i713 = i712 % 2;
                        bigInteger13 = bigInteger112;
                        bigInteger = bigInteger110;
                        bigInteger15 = bigInteger111;
                        bigInteger8 = bigInteger6;
                        bigInteger12 = bigInteger8;
                    } else {
                        bigInteger7 = bigInteger6;
                        int i714 = f53503f;
                        int i715 = i714 & 61;
                        int i716 = (i714 | 61) & (~i715);
                        int i717 = -(-(i715 << 1));
                        int i86 = (i716 & i717) + (i716 | i717);
                        f53504g = i86 % 128;
                        int i87 = i86 % 2;
                        bigInteger8 = (BigInteger) setX(new Object[]{sety, bigInteger7, bigInteger3}, 1484269935, -1484269934, System.identityHashCode(sety));
                        BigInteger bigInteger113 = (BigInteger) setX(new Object[]{sety, bigInteger, bigInteger5}, 1484269935, -1484269934, System.identityHashCode(sety));
                        BigInteger bigInteger21 = (BigInteger) setX(new Object[]{sety, bigInteger5.multiply(bigInteger13).subtract(bigInteger4.multiply(bigInteger7))}, -628445762, 628445764, System.identityHashCode(sety));
                        bigInteger15 = (BigInteger) setX(new Object[]{sety, bigInteger5.multiply(bigInteger5).subtract(bigInteger8.shiftLeft(1))}, -628445762, 628445764, System.identityHashCode(sety));
                        int i88 = f53503f;
                        int i89 = i88 & 125;
                        int i810 = (i89 - (~((i88 ^ 125) | i89))) - 1;
                        f53504g = i810 % 128;
                        int i811 = i810 % 2;
                        bigInteger12 = bigInteger7;
                        bigInteger = bigInteger113;
                        bigInteger13 = bigInteger21;
                    }
                }
                i23--;
                int i90 = f53503f;
                int i91 = (((i90 ^ 27) | (i90 & 27)) << 1) - (((~i90) & 27) | (i90 & (-28)));
                f53504g = i91 % 128;
                int i92 = i91 % 2;
                bigInteger10 = bigInteger3;
                i13 = 1;
                BigInteger bigInteger22 = bigInteger4;
                bigInteger14 = bigInteger8;
                bigInteger9 = bigInteger22;
            }
            BigInteger bigInteger23 = (BigInteger) setX(new Object[]{sety, bigInteger12, bigInteger14}, 1484269935, -1484269934, System.identityHashCode(sety));
            BigInteger bigInteger24 = (BigInteger) setX(new Object[]{sety, bigInteger23, bigInteger3}, 1484269935, -1484269934, System.identityHashCode(sety));
            BigInteger bigInteger25 = (BigInteger) setX(new Object[]{sety, bigInteger.multiply(bigInteger13).subtract(bigInteger23)}, -628445762, 628445764, System.identityHashCode(sety));
            BigInteger bigInteger26 = (BigInteger) setX(new Object[]{sety, bigInteger5.multiply(bigInteger13).subtract(bigInteger4.multiply(bigInteger23))}, -628445762, 628445764, System.identityHashCode(sety));
            BigInteger bigInteger27 = (BigInteger) setX(new Object[]{sety, bigInteger23, bigInteger24}, 1484269935, -1484269934, System.identityHashCode(sety));
            int i93 = f53503f;
            int i94 = (i93 ^ 17) + ((i93 & 17) << 1);
            f53504g = i94 % 128;
            int i95 = i94 % 2;
            BigInteger bigInteger28 = bigInteger26;
            int i96 = 1;
            while (i96 <= lowestSetBit) {
                int i97 = f53503f;
                int i98 = i97 ^ 87;
                int i99 = ((((i97 & 87) | i98) << 1) - (~(-i98))) - 1;
                f53504g = i99 % 128;
                int i100 = i99 % 2;
                bigInteger25 = (BigInteger) setX(new Object[]{sety, bigInteger25, bigInteger28}, 1484269935, -1484269934, System.identityHashCode(sety));
                bigInteger28 = (BigInteger) setX(new Object[]{sety, bigInteger28.multiply(bigInteger28).subtract(bigInteger27.shiftLeft(1))}, -628445762, 628445764, System.identityHashCode(sety));
                bigInteger27 = (BigInteger) setX(new Object[]{sety, bigInteger27, bigInteger27}, 1484269935, -1484269934, System.identityHashCode(sety));
                int i101 = i96 & (-2);
                int i102 = ((i96 | (-2)) & (~i101)) + (i101 << 1);
                i96 = ((i102 ^ 4) + ((i102 & 4) << 1)) - 1;
                int i103 = f53503f;
                int i104 = i103 & 15;
                int i105 = (i104 - (~((i103 ^ 15) | i104))) - 1;
                f53504g = i105 % 128;
                int i106 = i105 % 2;
            }
            BigInteger[] bigIntegerArr = {bigInteger25, bigInteger28};
            int i107 = f53503f;
            int i108 = ((i107 ^ 113) - (~((i107 & 113) << 1))) - 1;
            f53504g = i108 % 128;
            int i109 = i108 % 2;
            return bigIntegerArr;
        }

        public static /* synthetic */ BigInteger o(Object[] objArr) {
            setY sety = (setY) objArr[0];
            int i10 = f53503f;
            int i11 = i10 & 51;
            int i12 = ((i10 ^ 51) | i11) << 1;
            int i13 = -((i10 | 51) & (~i11));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            int i15 = i14 % 128;
            f53504g = i15;
            int i16 = i14 % 2;
            BigInteger bigInteger = sety.f53507e;
            if (i16 == 0) {
                throw null;
            }
            int i17 = i15 & 23;
            int i18 = -(-((i15 ^ 23) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            f53503f = i19 % 128;
            if (i19 % 2 == 0) {
                return bigInteger;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:56:0x02e2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:57:0x02e3  */
        /* JADX WARN: Code duplicated, block: B:62:0x032c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:63:0x032d  */
        public static apk p(Object[] objArr) {
            int i10;
            BigInteger bigInteger;
            int i11;
            BigInteger bigInteger2;
            apk apkVar;
            int i12;
            apk apkVar2;
            int i13;
            char c10 = 0;
            setY sety = (setY) objArr[0];
            int i14 = f53504g;
            int i15 = 1;
            int i16 = (i14 ^ 47) + ((i14 & 47) << 1);
            f53503f = i16 % 128;
            int i17 = 2;
            int i18 = i16 % 2;
            if (!sety.setOnDragListener()) {
                int i19 = f53503f;
                int i20 = ((i19 ^ 40) + ((i19 & 40) << 1)) - 1;
                f53504g = i20 % 128;
                if (i20 % 2 == 0) {
                    sety.getNavBarTitleString();
                    throw null;
                }
                if (!sety.getNavBarTitleString()) {
                    BigInteger bigInteger3 = sety.f53505c;
                    if (!bigInteger3.testBit(0)) {
                        throw new RuntimeException("not done yet");
                    }
                    boolean zTestBit = bigInteger3.testBit(1);
                    BigInteger bigInteger4 = sety.f53506d;
                    BigInteger bigInteger5 = sety.f53507e;
                    if (zTestBit) {
                        apk apkVar3 = (apk) setX(new Object[]{sety, new setY(bigInteger3, bigInteger4, bigInteger5.modPow(bigInteger3.shiftRight(2).add(apj.setOnFocusChangeListener), bigInteger3))}, -1338730005, 1338730028, System.identityHashCode(sety));
                        int i21 = f53503f;
                        int i22 = i21 & 37;
                        int i23 = i22 + ((i21 ^ 37) | i22);
                        f53504g = i23 % 128;
                        int i24 = i23 % 2;
                        return apkVar3;
                    }
                    if (!(!bigInteger3.testBit(2))) {
                        int i25 = f53504g;
                        int i26 = i25 & 105;
                        int i27 = i26 + ((i25 ^ 105) | i26);
                        f53503f = i27 % 128;
                        if (i27 % 2 != 0) {
                            BigInteger bigIntegerModPow = bigInteger5.modPow(bigInteger3.shiftRight(2), bigInteger3);
                            bigInteger2 = (BigInteger) setX(new Object[]{sety, bigIntegerModPow, bigInteger5}, 1484269935, -1484269934, System.identityHashCode(sety));
                            if (((BigInteger) setX(new Object[]{sety, bigInteger2, bigIntegerModPow}, 1484269935, -1484269934, System.identityHashCode(sety))).equals(apj.setOnFocusChangeListener)) {
                                i10 = 2;
                                setY sety2 = new setY(bigInteger3, bigInteger4, bigInteger2);
                                Object[] objArr2 = new Object[i10];
                                objArr2[0] = sety;
                                objArr2[1] = sety2;
                                apkVar2 = (apk) setX(objArr2, -1338730005, 1338730028, System.identityHashCode(sety));
                                int i28 = f53504g;
                                i13 = ((i28 ^ 53) - (~(-(-((i28 & 53) << 1))))) - 1;
                                f53503f = i13 % 128;
                                if (i13 % 2 == 0) {
                                    return apkVar2;
                                }
                                throw null;
                            }
                            bigInteger = bigInteger2;
                            i11 = 2;
                            BigInteger bigIntegerModPow2 = apj.setDividerPadding.modPow(bigInteger3.shiftRight(i11), bigInteger3);
                            Object[] objArr3 = new Object[3];
                            objArr3[0] = sety;
                            objArr3[1] = bigInteger;
                            objArr3[i11] = bigIntegerModPow2;
                            setY sety3 = new setY(bigInteger3, bigInteger4, (BigInteger) setX(objArr3, 1484269935, -1484269934, System.identityHashCode(sety)));
                            Object[] objArr4 = new Object[i11];
                            objArr4[0] = sety;
                            objArr4[1] = sety3;
                            apkVar = (apk) setX(objArr4, -1338730005, 1338730028, System.identityHashCode(sety));
                            i12 = f53503f + 39;
                            f53504g = i12 % 128;
                            if (i12 % 2 != 0) {
                                return apkVar;
                            }
                            throw null;
                        }
                        BigInteger bigIntegerModPow3 = bigInteger5.modPow(bigInteger3.shiftRight(3), bigInteger3);
                        i10 = 2;
                        bigInteger = (BigInteger) setX(new Object[]{sety, bigIntegerModPow3, bigInteger5}, 1484269935, -1484269934, System.identityHashCode(sety));
                        if (((BigInteger) setX(new Object[]{sety, bigInteger, bigIntegerModPow3}, 1484269935, -1484269934, System.identityHashCode(sety))).equals(apj.setOnFocusChangeListener)) {
                            bigInteger2 = bigInteger;
                            setY sety4 = new setY(bigInteger3, bigInteger4, bigInteger2);
                            Object[] objArr5 = new Object[i10];
                            objArr5[0] = sety;
                            objArr5[1] = sety4;
                            apkVar2 = (apk) setX(objArr5, -1338730005, 1338730028, System.identityHashCode(sety));
                            int i29 = f53504g;
                            i13 = ((i29 ^ 53) - (~(-(-((i29 & 53) << 1))))) - 1;
                            f53503f = i13 % 128;
                            if (i13 % 2 == 0) {
                                return apkVar2;
                            }
                            throw null;
                        }
                        i11 = 2;
                        BigInteger bigIntegerModPow4 = apj.setDividerPadding.modPow(bigInteger3.shiftRight(i11), bigInteger3);
                        Object[] objArr6 = new Object[3];
                        objArr6[0] = sety;
                        objArr6[1] = bigInteger;
                        objArr6[i11] = bigIntegerModPow4;
                        setY sety5 = new setY(bigInteger3, bigInteger4, (BigInteger) setX(objArr6, 1484269935, -1484269934, System.identityHashCode(sety)));
                        Object[] objArr7 = new Object[i11];
                        objArr7[0] = sety;
                        objArr7[1] = sety5;
                        apkVar = (apk) setX(objArr7, -1338730005, 1338730028, System.identityHashCode(sety));
                        i12 = f53503f + 39;
                        f53504g = i12 % 128;
                        if (i12 % 2 != 0) {
                            return apkVar;
                        }
                        throw null;
                    }
                    BigInteger bigIntegerShiftRight = bigInteger3.shiftRight(1);
                    BigInteger bigIntegerModPow5 = bigInteger5.modPow(bigIntegerShiftRight, bigInteger3);
                    BigInteger bigInteger6 = apj.setOnFocusChangeListener;
                    if (!bigIntegerModPow5.equals(bigInteger6)) {
                        int i30 = f53503f;
                        int i31 = ((i30 | 32) << 1) - (i30 ^ 32);
                        int i32 = (i31 ^ (-1)) + (i31 << 1);
                        f53504g = i32 % 128;
                        if (i32 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                    BigInteger bigInteger7 = (BigInteger) setX(new Object[]{sety, (BigInteger) setX(new Object[]{sety, bigInteger5}, 1729981938, -1729981927, System.identityHashCode(sety))}, 1729981938, -1729981927, System.identityHashCode(sety));
                    BigInteger bigIntegerAdd = bigIntegerShiftRight.add(bigInteger6);
                    BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger6);
                    Random random = new Random();
                    int i33 = f53503f + 77;
                    f53504g = i33 % 128;
                    int i34 = i33 % 2;
                    while (true) {
                        BigInteger bigInteger8 = new BigInteger(bigInteger3.bitLength(), random);
                        if (bigInteger8.compareTo(bigInteger3) < 0) {
                            int i35 = f53504g;
                            int i36 = i35 & 95;
                            int i37 = ((i35 | 95) & (~i36)) + (i36 << i15);
                            f53503f = i37 % 128;
                            if (i37 % i17 != 0) {
                                int i38 = i17;
                                BigInteger bigIntegerSubtract2 = bigInteger8.multiply(bigInteger8).subtract(bigInteger7);
                                Object[] objArr8 = new Object[i38];
                                objArr8[0] = sety;
                                objArr8[1] = bigIntegerSubtract2;
                                ((BigInteger) setX(objArr8, -628445762, 628445764, System.identityHashCode(sety))).modPow(bigIntegerShiftRight, bigInteger3).equals(bigIntegerSubtract);
                                throw null;
                            }
                            BigInteger bigIntegerSubtract3 = bigInteger8.multiply(bigInteger8).subtract(bigInteger7);
                            Object[] objArr9 = new Object[i17];
                            objArr9[c10] = sety;
                            objArr9[i15] = bigIntegerSubtract3;
                            if (((BigInteger) setX(objArr9, -628445762, 628445764, System.identityHashCode(sety))).modPow(bigIntegerShiftRight, bigInteger3).equals(bigIntegerSubtract)) {
                                Object[] objArr10 = new Object[4];
                                objArr10[c10] = sety;
                                objArr10[i15] = bigInteger8;
                                objArr10[2] = bigInteger5;
                                objArr10[3] = bigIntegerAdd;
                                BigInteger[] bigIntegerArr = (BigInteger[]) setX(objArr10, -846404040, 846404043, System.identityHashCode(sety));
                                BigInteger bigInteger9 = bigIntegerArr[c10];
                                BigInteger bigInteger10 = bigIntegerArr[i15];
                                Object[] objArr11 = new Object[3];
                                objArr11[c10] = sety;
                                objArr11[i15] = bigInteger10;
                                objArr11[2] = bigInteger10;
                                if (((BigInteger) setX(objArr11, 1484269935, -1484269934, System.identityHashCode(sety))).equals(bigInteger7)) {
                                    setY sety6 = new setY(bigInteger3, bigInteger4, (BigInteger) setX(new Object[]{sety, bigInteger10}, -2033718290, 2033718314, System.identityHashCode(sety)));
                                    int i39 = f53504g;
                                    int i40 = ((i39 | 59) << 1) - (i39 ^ 59);
                                    f53503f = i40 % 128;
                                    int i41 = i40 % 2;
                                    return sety6;
                                }
                                if (!bigInteger9.equals(apj.setOnFocusChangeListener)) {
                                    int i42 = f53504g;
                                    int i43 = ((i42 ^ 59) | (i42 & 59)) << 1;
                                    int i44 = -(((~i42) & 59) | (i42 & (-60)));
                                    int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                                    f53503f = i45 % 128;
                                    int i46 = i45 % 2;
                                    if (!bigInteger9.equals(bigIntegerSubtract)) {
                                        int i47 = f53504g;
                                        int i48 = i47 & 19;
                                        int i49 = ((i47 ^ 19) | i48) << 1;
                                        int i50 = -((i47 | 19) & (~i48));
                                        int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                                        int i52 = i51 % 128;
                                        f53503f = i52;
                                        int i53 = i51 % 2;
                                        int i54 = (i52 & (-90)) | ((~i52) & 89);
                                        int i55 = -(-((i52 & 89) << 1));
                                        int i56 = (i54 & i55) + (i55 | i54);
                                        f53504g = i56 % 128;
                                        int i57 = i56 % 2;
                                        return null;
                                    }
                                    c10 = 0;
                                    i17 = 2;
                                    i15 = 1;
                                } else {
                                    i15 = 1;
                                }
                            }
                            c10 = 0;
                            i17 = 2;
                        }
                    }
                }
            }
            int i58 = f53504g;
            int i59 = i58 & 59;
            int i60 = ((((i58 ^ 59) | i59) << 1) - (~(-((i58 | 59) & (~i59))))) - 1;
            f53503f = i60 % 128;
            int i61 = i60 % 2;
            return sety;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0035  */
        public static /* synthetic */ setY q(Object[] objArr) {
            BigInteger bigIntegerAdd;
            setY sety = (setY) objArr[0];
            int i10 = f53503f + 95;
            f53504g = i10 % 128;
            if (i10 % 2 == 0) {
                bigIntegerAdd = sety.f53507e.add(apj.setOnFocusChangeListener);
                int i11 = 43 / 0;
                if (bigIntegerAdd.compareTo(sety.f53505c) == 0) {
                    bigIntegerAdd = apj.setY;
                    int i12 = f53504g;
                    int i13 = ((i12 ^ 49) | (i12 & 49)) << 1;
                    int i14 = -(((~i12) & 49) | (i12 & (-50)));
                    int i15 = (i13 & i14) + (i14 | i13);
                    f53503f = i15 % 128;
                    int i16 = i15 % 2;
                }
            } else {
                bigIntegerAdd = sety.f53507e.add(apj.setOnFocusChangeListener);
                if (bigIntegerAdd.compareTo(sety.f53505c) == 0) {
                    bigIntegerAdd = apj.setY;
                    int i17 = f53504g;
                    int i18 = ((i17 ^ 49) | (i17 & 49)) << 1;
                    int i19 = -(((~i17) & 49) | (i17 & (-50)));
                    int i110 = (i18 & i19) + (i19 | i18);
                    f53503f = i110 % 128;
                    int i111 = i110 % 2;
                }
            }
            setY sety2 = new setY(sety.f53505c, sety.f53506d, bigIntegerAdd);
            int i20 = f53503f;
            int i21 = (i20 ^ 21) + ((i20 & 21) << 1);
            f53504g = i21 % 128;
            int i22 = i21 % 2;
            return sety2;
        }

        public static /* synthetic */ Integer r(Object[] objArr) {
            setY sety = (setY) objArr[0];
            int i10 = f53503f;
            int i11 = i10 ^ 119;
            int i12 = ((i10 & 119) | i11) << 1;
            int i13 = -i11;
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            f53504g = i14 % 128;
            int i15 = i14 % 2;
            BigInteger bigInteger = sety.f53505c;
            if (i15 == 0) {
                bigInteger.hashCode();
                sety.f53507e.hashCode();
                throw null;
            }
            int iHashCode = bigInteger.hashCode();
            int iHashCode2 = sety.f53507e.hashCode();
            int i16 = (~iHashCode2) & iHashCode;
            int i17 = iHashCode2 & (~iHashCode);
            return Integer.valueOf((i17 & i16) | (i16 ^ i17));
        }

        public static Object setX(Object[] objArr, int i10, int i11, int i12) {
            setY sety;
            int i13 = ~((~i10) | (~i11));
            int i14 = ~i12;
            int i15 = ((i13 | (~(i14 | i10 | i11))) * (-828)) + (i11 * 829) + (i10 * 829);
            int i16 = i10 | i11;
            switch (((~i16) * 828) + ((i16 | i14) * (-828)) + i15) {
                case 1:
                    setY sety2 = (setY) objArr[0];
                    BigInteger bigInteger = (BigInteger) objArr[1];
                    BigInteger bigInteger2 = (BigInteger) objArr[2];
                    int i17 = f53503f + 125;
                    f53504g = i17 % 128;
                    int i18 = i17 % 2;
                    BigInteger bigInteger3 = (BigInteger) setX(new Object[]{sety2, bigInteger.multiply(bigInteger2)}, -628445762, 628445764, System.identityHashCode(sety2));
                    int i19 = f53503f;
                    int i20 = i19 ^ 121;
                    int i21 = ((((i19 & 121) | i20) << 1) - (~(-i20))) - 1;
                    f53504g = i21 % 128;
                    int i22 = i21 % 2;
                    return bigInteger3;
                case 2:
                    return e(objArr);
                case 3:
                    return m(objArr);
                case 4:
                    return t(objArr);
                case 5:
                    return f(objArr);
                case 6:
                    setY sety3 = (setY) objArr[0];
                    BigInteger bigInteger4 = sety3.f53505c;
                    BigInteger bigInteger5 = sety3.f53507e;
                    setY sety4 = new setY(bigInteger4, sety3.f53506d, sety3.s(bigInteger5, bigInteger5));
                    int i23 = f53504g;
                    int i24 = i23 & 121;
                    int i25 = -(-((i23 ^ 121) | i24));
                    int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                    f53503f = i26 % 128;
                    int i27 = i26 % 2;
                    return sety4;
                case 7:
                    return l(objArr);
                case 8:
                    return c(objArr);
                case 9:
                    BigInteger bigInteger6 = (BigInteger) objArr[0];
                    int i28 = f53504g;
                    int i29 = (i28 | 21) << 1;
                    int i30 = -(((~i28) & 21) | (i28 & (-22)));
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    f53503f = i31 % 128;
                    int i32 = i31 % 2;
                    int iBitLength = bigInteger6.bitLength();
                    if (iBitLength >= 96) {
                        int i33 = f53503f;
                        int i34 = ((i33 | 24) << 1) - (i33 ^ 24);
                        int i35 = (i34 ^ (-1)) + (i34 << 1);
                        f53504g = i35 % 128;
                        int i36 = i35 % 2;
                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                        int i37 = -(-(iBitLength * (-885)));
                        int i38 = ((-113472) | i37) << 1;
                        int i39 = -(i37 ^ (-113472));
                        int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                        int i41 = ~iBitLength;
                        int i42 = 63 & i41;
                        int i43 = (63 | i41) & (~i42);
                        int i44 = (i43 & i42) | (i43 ^ i42);
                        int i45 = ~i44;
                        int i46 = (i44 | i45) & i45;
                        int i47 = (i41 | iBitLength) & i41;
                        int i48 = ~iCurrentTimeMillis;
                        int i49 = ~((i47 & iCurrentTimeMillis) | (i47 & i48) | ((~i47) & iCurrentTimeMillis));
                        int i50 = ((~i49) & i46) | ((~i46) & i49);
                        int i51 = i46 & i49;
                        int i52 = (i51 & i50) | (i50 ^ i51);
                        int i53 = (iCurrentTimeMillis | i48) & i48;
                        int i54 = (i53 & (-64)) | (i53 ^ (-64));
                        int i55 = i54 ^ iBitLength;
                        int i56 = i54 & iBitLength;
                        int i57 = ~((i56 & i55) | (i55 ^ i56));
                        int i58 = i52 ^ i57;
                        int i59 = i57 & i52;
                        int i60 = (i40 - (~(-(-(((i59 & i58) | (i58 ^ i59)) * 886))))) - 1;
                        int i61 = ~((i48 & i41) | ((~i48) & iBitLength) | (i48 & iBitLength));
                        int i62 = ((i61 & (-64)) | ((-64) ^ i61)) * (-1772);
                        int i63 = i60 ^ i62;
                        int i64 = -(-((i62 & i60) << 1));
                        int i65 = (i63 & i64) + (i64 | i63);
                        int i66 = i48 & (-64);
                        int i67 = (~i66) & (i48 | (-64));
                        int i68 = (~((i66 & i67) | (i67 ^ i66))) * 886;
                        int i69 = i65 & i68;
                        if (bigInteger6.shiftRight(i69 + ((i68 ^ i65) | i69)).longValue() == -1) {
                            int i70 = f53504g;
                            int i71 = ((i70 | 69) << 1) - (i70 ^ 69);
                            f53503f = i71 % 128;
                            int i72 = i71 % 2;
                            BigInteger bigIntegerSubtract = apj.setOnFocusChangeListener.shiftLeft(iBitLength).subtract(bigInteger6);
                            int i73 = f53504g;
                            int i74 = ((i73 ^ 20) + ((i73 & 20) << 1)) - 1;
                            f53503f = i74 % 128;
                            int i75 = i74 % 2;
                            return bigIntegerSubtract;
                        }
                    }
                    int i76 = f53504g;
                    int i77 = ((i76 ^ 49) - (~(-(-((i76 & 49) << 1))))) - 1;
                    f53503f = i77 % 128;
                    int i78 = i77 % 2;
                    return null;
                case 10:
                    setY sety5 = (setY) objArr[0];
                    setY sety6 = new setY(sety5.f53505c, sety5.f53506d, sety5.g(sety5.f53507e.multiply(((apk) objArr[1]).setCompoundDrawableTintBlendMode()).add(((apk) objArr[2]).setCompoundDrawableTintBlendMode().multiply(((apk) objArr[3]).setCompoundDrawableTintBlendMode()))));
                    int i79 = f53503f;
                    int i80 = ((i79 & (-62)) | ((~i79) & 61)) + ((i79 & 61) << 1);
                    f53504g = i80 % 128;
                    int i81 = i80 % 2;
                    return sety6;
                case 11:
                    return k(objArr);
                case 12:
                    return o(objArr);
                case 13:
                    return j(objArr);
                case 14:
                    return p(objArr);
                case 15:
                    setY sety7 = (setY) objArr[0];
                    sety = new setY(sety7.f53505c, sety7.f53506d, sety7.s(sety7.f53507e, (BigInteger) setX(new Object[]{sety7, ((apk) objArr[1]).setCompoundDrawableTintBlendMode()}, -1701231048, 1701231070, System.identityHashCode(sety7))));
                    int i82 = f53503f;
                    int i83 = i82 | 105;
                    int i84 = i83 << 1;
                    int i85 = -((~(i82 & 105)) & i83);
                    int i86 = (i84 & i85) + (i85 | i84);
                    f53504g = i86 % 128;
                    int i87 = i86 % 2;
                    break;
                case 16:
                    return i(objArr);
                case 17:
                    setY sety8 = (setY) objArr[0];
                    sety = new setY(sety8.f53505c, sety8.f53506d, sety8.h(sety8.f53507e, ((apk) objArr[1]).setCompoundDrawableTintBlendMode()));
                    int i88 = f53504g;
                    int i89 = ((i88 & (-86)) | ((~i88) & 85)) + ((i88 & 85) << 1);
                    f53503f = i89 % 128;
                    int i90 = i89 % 2;
                    break;
                case 18:
                    return a(objArr);
                case 19:
                    setY sety9 = (setY) objArr[0];
                    sety = new setY(sety9.f53505c, sety9.f53506d, sety9.n(sety9.f53507e, ((apk) objArr[1]).setCompoundDrawableTintBlendMode()));
                    int i91 = f53504g + 35;
                    f53503f = i91 % 128;
                    int i92 = i91 % 2;
                    break;
                case 20:
                    return u(objArr);
                case 21:
                    setY sety10 = (setY) objArr[0];
                    BigInteger bigInteger7 = (BigInteger) objArr[1];
                    BigInteger bigInteger8 = (BigInteger) objArr[2];
                    int i93 = f53503f;
                    int i94 = ((i93 & (-20)) | ((~i93) & 19)) + ((i93 & 19) << 1);
                    f53504g = i94 % 128;
                    int i95 = i94 % 2;
                    BigInteger bigIntegerAdd = bigInteger7.add(bigInteger8);
                    if (bigIntegerAdd.compareTo(sety10.f53505c) >= 0) {
                        int i96 = f53503f;
                        int i97 = (i96 & 9) + (i96 | 9);
                        f53504g = i97 % 128;
                        int i98 = i97 % 2;
                        bigIntegerAdd = bigIntegerAdd.subtract(sety10.f53505c);
                        int i99 = f53504g;
                        int i100 = i99 ^ 65;
                        int i101 = -(-((i99 & 65) << 1));
                        int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                        f53503f = i102 % 128;
                        int i103 = i102 % 2;
                    }
                    int i104 = f53504g;
                    int i105 = ((i104 | 13) << 1) - (((~i104) & 13) | (i104 & (-14)));
                    f53503f = i105 % 128;
                    int i106 = i105 % 2;
                    return bigIntegerAdd;
                case 22:
                    return d(objArr);
                case 23:
                    return b(objArr);
                case 24:
                    setY sety11 = (setY) objArr[0];
                    BigInteger bigIntegerSubtract2 = (BigInteger) objArr[1];
                    int i107 = f53504g;
                    int i108 = (i107 ^ 29) + ((i107 & 29) << 1);
                    f53503f = i108 % 128;
                    if (i108 % 2 == 0 ? bigIntegerSubtract2.testBit(0) : bigIntegerSubtract2.testBit(1)) {
                        int i109 = f53503f;
                        int i110 = i109 & 61;
                        int i111 = (i110 - (~(-(-((61 ^ i109) | i110))))) - 1;
                        f53504g = i111 % 128;
                        int i112 = i111 % 2;
                        bigIntegerSubtract2 = sety11.f53505c.subtract(bigIntegerSubtract2);
                        int i113 = f53504g;
                        int i114 = (i113 ^ 67) + ((i113 & 67) << 1);
                        f53503f = i114 % 128;
                        int i115 = i114 % 2;
                    }
                    BigInteger bigIntegerShiftRight = bigIntegerSubtract2.shiftRight(1);
                    System.identityHashCode(sety11);
                    System.identityHashCode(sety11);
                    return bigIntegerShiftRight;
                case 25:
                    return q(objArr);
                default:
                    return r(objArr);
            }
            return sety;
        }

        public static /* synthetic */ setY t(Object[] objArr) {
            setY sety = (setY) objArr[0];
            apk apkVar = (apk) objArr[1];
            apk apkVar2 = (apk) objArr[2];
            BigInteger bigInteger = sety.f53507e;
            setY sety2 = new setY(sety.f53505c, sety.f53506d, sety.g(bigInteger.multiply(bigInteger).add(apkVar.setCompoundDrawableTintBlendMode().multiply(apkVar2.setCompoundDrawableTintBlendMode()))));
            int i10 = f53504g + 92;
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            f53503f = i11 % 128;
            if (i11 % 2 == 0) {
                return sety2;
            }
            throw null;
        }

        public static setY u(Object[] objArr) {
            setY sety = (setY) objArr[0];
            setY sety2 = new setY(sety.f53505c, sety.f53506d, (BigInteger) setX(new Object[]{sety, sety.f53507e}, -1701231048, 1701231070, System.identityHashCode(sety)));
            int i10 = f53503f;
            int i11 = i10 ^ 91;
            int i12 = ((i10 & 91) | i11) << 1;
            int i13 = -i11;
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            f53504g = i14 % 128;
            if (i14 % 2 != 0) {
                return sety2;
            }
            throw null;
        }

        public final boolean equals(Object obj) {
            return ((Boolean) setX(new Object[]{this, obj}, 1494426390, -1494426372, System.identityHashCode(this))).booleanValue();
        }

        public final BigInteger g(BigInteger bigInteger) {
            return (BigInteger) setX(new Object[]{this, bigInteger}, -628445762, 628445764, System.identityHashCode(this));
        }

        public final BigInteger h(BigInteger bigInteger, BigInteger bigInteger2) {
            return (BigInteger) setX(new Object[]{this, bigInteger, bigInteger2}, 731227007, -731226986, System.identityHashCode(this));
        }

        public final int hashCode() {
            return ((Integer) setX(new Object[]{this}, -1973848493, 1973848493, System.identityHashCode(this))).intValue();
        }

        public final BigInteger n(BigInteger bigInteger, BigInteger bigInteger2) {
            return (BigInteger) setX(new Object[]{this, bigInteger, bigInteger2}, -727574019, 727574027, System.identityHashCode(this));
        }

        public final BigInteger s(BigInteger bigInteger, BigInteger bigInteger2) {
            return (BigInteger) setX(new Object[]{this, bigInteger, bigInteger2}, 1484269935, -1484269934, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setCompoundDrawableTintBlendMode(apk apkVar, apk apkVar2, apk apkVar3) {
            return (apk) setX(new Object[]{this, apkVar, apkVar2, apkVar3}, 1505381768, -1505381758, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setDividerPadding(apk apkVar) {
            return (apk) setX(new Object[]{this, apkVar}, -1908735566, 1908735581, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setNavigationOnClickListener() {
            return (apk) setX(new Object[]{this}, 1304120390, -1304120370, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setOnFocusChangeListener(apk apkVar) {
            return (apk) setX(new Object[]{this, apkVar}, 251463973, -251463956, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setOnLongClickListener() {
            return (apk) setX(new Object[]{this}, 915989031, -915989017, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setY(apk apkVar, apk apkVar2) {
            return (apk) setX(new Object[]{this, apkVar, apkVar2}, -848705971, 848705975, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
            return (apk) setX(new Object[]{this, apkVar}, -2053513032, 2053513037, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setDividerPadding() {
            return (apk) setX(new Object[]{this}, 1409279002, -1409278977, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final int setOnFocusChangeListener() {
            return ((Integer) setX(new Object[]{this}, 820028588, -820028572, System.identityHashCode(this))).intValue();
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setY() {
            return (apk) setX(new Object[]{this}, -250851157, 250851164, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final BigInteger setCompoundDrawableTintBlendMode() {
            return (BigInteger) setX(new Object[]{this}, 472562329, -472562317, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setY(apk apkVar, apk apkVar2, apk apkVar3) {
            return (apk) setX(new Object[]{this, apkVar, apkVar2, apkVar3}, -1676840887, 1676840900, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setY(apk apkVar) {
            return (apk) setX(new Object[]{this, apkVar}, -1372623315, 1372623334, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apk
        public final apk setX() {
            return (apk) setX(new Object[]{this}, -898537437, 898537443, System.identityHashCode(this));
        }
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object dividerPadding;
        apk apkVar = (apk) objArr[0];
        int i13 = f53493a;
        int i14 = i13 & 47;
        int i15 = i14 + ((i13 ^ 47) | i14);
        f53494b = i15 % 128;
        if (i15 % 2 == 0) {
            int onFocusChangeListener = (apkVar.setOnFocusChangeListener() >> 35) << 62;
            dividerPadding = bep.setDividerPadding(new Object[]{Integer.valueOf(onFocusChangeListener), apkVar.setCompoundDrawableTintBlendMode()}, -602888520, 602888526, onFocusChangeListener);
        } else {
            int onFocusChangeListener2 = apkVar.setOnFocusChangeListener();
            int i16 = onFocusChangeListener2 & 7;
            int i17 = (onFocusChangeListener2 | 7) & (~i16);
            int i18 = -(-(i16 << 1));
            int i19 = ((i17 ^ i18) + ((i17 & i18) << 1)) / 8;
            dividerPadding = bep.setDividerPadding(new Object[]{Integer.valueOf(i19), apkVar.setCompoundDrawableTintBlendMode()}, -602888520, 602888526, i19);
        }
        return (byte[]) dividerPadding;
    }

    public boolean getNavBarTitleString() {
        int i10 = f53494b;
        int i11 = i10 & 103;
        int i12 = (((i10 | 103) & (~i11)) - (~(i11 << 1))) - 1;
        f53493a = i12 % 128;
        int i13 = i12 % 2;
        if (setLayoutAnimation() == 1) {
            int i14 = f53494b;
            int i15 = ((i14 & 64) + (i14 | 64)) - 1;
            f53493a = i15 % 128;
            int i16 = i15 % 2;
            return true;
        }
        int i17 = f53493a;
        int i18 = (((i17 | 114) << 1) - (i17 ^ 114)) - 1;
        f53494b = i18 % 128;
        int i19 = i18 % 2;
        return false;
    }

    public boolean setAlwaysDrawnWithCacheEnabled() {
        int i10 = f53494b;
        int i11 = i10 & 119;
        int i12 = ((i10 | 119) & (~i11)) + (i11 << 1);
        f53493a = i12 % 128;
        int i13 = i12 % 2;
        boolean zTestBit = setCompoundDrawableTintBlendMode().testBit(0);
        int i14 = ((-1) << 1) - ((f53494b + 14) ^ (-1));
        f53493a = i14 % 128;
        if (i14 % 2 == 0) {
            return zTestBit;
        }
        throw null;
    }

    public apk setCompoundDrawableTintBlendMode(int i10) {
        int i11 = f53494b;
        int i12 = (i11 | 85) << 1;
        int i13 = -(i11 ^ 85);
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f53493a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = i11 + 7;
        f53493a = i16 % 128;
        int i17 = i16 % 2;
        apk x4 = this;
        int i18 = 0;
        while (i18 < i10) {
            int i19 = f53493a;
            int i20 = ((-1) << 1) - ((((i19 | 80) << 1) - (i19 ^ 80)) ^ (-1));
            f53494b = i20 % 128;
            int i21 = i20 % 2;
            x4 = x4.setX();
            int i22 = ((i18 & (-54)) + (i18 | (-54))) - 1;
            int i23 = i22 & 56;
            int i24 = -(-(i22 | 56));
            i18 = ((i23 | i24) << 1) - (i23 ^ i24);
            int i25 = f53494b;
            int i26 = ((i25 | 57) << 1) - (i25 ^ 57);
            f53493a = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = f53493a;
        int i29 = (i28 ^ 89) + ((i28 & 89) << 1);
        f53494b = i29 % 128;
        if (i29 % 2 == 0) {
            int i30 = 14 / 0;
        }
        return x4;
    }

    public abstract apk setCompoundDrawableTintBlendMode(apk apkVar);

    public abstract BigInteger setCompoundDrawableTintBlendMode();

    public abstract apk setDividerPadding();

    public abstract apk setDividerPadding(apk apkVar);

    public int setLayoutAnimation() {
        int i10 = f53493a;
        int i11 = ((i10 | 33) << 1) - (i10 ^ 33);
        f53494b = i11 % 128;
        int i12 = i11 % 2;
        int iBitLength = setCompoundDrawableTintBlendMode().bitLength();
        int i13 = f53493a;
        int i14 = ((i13 & 80) + (i13 | 80)) - 1;
        f53494b = i14 % 128;
        int i15 = i14 % 2;
        return iBitLength;
    }

    public abstract apk setNavigationOnClickListener();

    public boolean setOnDragListener() {
        int i10 = f53494b;
        int i11 = i10 & 111;
        int i12 = ((((i10 ^ 111) | i11) << 1) - (~(-((i10 | 111) & (~i11))))) - 1;
        f53493a = i12 % 128;
        int i13 = i12 % 2;
        int iSignum = setCompoundDrawableTintBlendMode().signum();
        if (i13 == 0 ? iSignum != 0 : 1 != iSignum) {
            int i14 = f53494b;
            int i15 = ((i14 ^ 105) | (i14 & 105)) << 1;
            int i16 = -(((~i14) & 105) | (i14 & (-106)));
            int i17 = (i15 & i16) + (i16 | i15);
            f53493a = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        int i19 = f53493a;
        int i20 = i19 & 15;
        int i21 = (i19 ^ 15) | i20;
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        f53494b = i22 % 128;
        if (i22 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public abstract int setOnFocusChangeListener();

    public abstract apk setOnFocusChangeListener(apk apkVar);

    public abstract apk setOnLongClickListener();

    public final byte[] setTextAlignment() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1440196034, -1440196034, System.identityHashCode(this));
    }

    public abstract apk setX();

    public abstract apk setY();

    public abstract apk setY(apk apkVar);

    public apk setY(apk apkVar, apk apkVar2) {
        int i10 = f53494b;
        int i11 = (i10 ^ 117) + ((i10 & 117) << 1);
        f53493a = i11 % 128;
        int i12 = i11 % 2;
        apk x4 = setX();
        apk compoundDrawableTintBlendMode = apkVar.setCompoundDrawableTintBlendMode(apkVar2);
        if (i12 == 0) {
            return x4.setOnFocusChangeListener(compoundDrawableTintBlendMode);
        }
        x4.setOnFocusChangeListener(compoundDrawableTintBlendMode);
        throw null;
    }

    public String toString() {
        int i10 = f53494b;
        int i11 = ((i10 ^ 34) + ((i10 & 34) << 1)) - 1;
        f53493a = i11 % 128;
        int i12 = i11 % 2;
        String string = setCompoundDrawableTintBlendMode().toString(16);
        int i13 = f53494b;
        int i14 = (i13 & (-82)) | ((~i13) & 81);
        int i15 = -(-((i13 & 81) << 1));
        int i16 = (i14 & i15) + (i15 | i14);
        f53493a = i16 % 128;
        if (i16 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public apk setCompoundDrawableTintBlendMode(apk apkVar, apk apkVar2, apk apkVar3) {
        int i10 = f53493a;
        int i11 = (i10 & 42) + (i10 | 42);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f53494b = i12 % 128;
        int i13 = i12 % 2;
        apk compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(apkVar);
        apk compoundDrawableTintBlendMode2 = apkVar2.setCompoundDrawableTintBlendMode(apkVar3);
        if (i13 == 0) {
            compoundDrawableTintBlendMode.setOnFocusChangeListener(compoundDrawableTintBlendMode2);
            throw null;
        }
        apk onFocusChangeListener = compoundDrawableTintBlendMode.setOnFocusChangeListener(compoundDrawableTintBlendMode2);
        int i14 = f53494b;
        int i15 = i14 & 109;
        int i16 = (i14 | 109) & (~i15);
        int i17 = -(-(i15 << 1));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        f53493a = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 54 / 0;
        }
        return onFocusChangeListener;
    }

    public apk setY(apk apkVar, apk apkVar2, apk apkVar3) {
        int i10 = f53493a;
        int i11 = ((i10 ^ 15) | (i10 & 15)) << 1;
        int i12 = -(((~i10) & 15) | (i10 & (-16)));
        int i13 = (i11 & i12) + (i12 | i11);
        f53494b = i13 % 128;
        int i14 = i13 % 2;
        apk y7 = setCompoundDrawableTintBlendMode(apkVar).setY(apkVar2.setCompoundDrawableTintBlendMode(apkVar3));
        if (i14 == 0) {
            int i15 = 41 / 0;
        }
        int i16 = f53494b;
        int i17 = i16 & 5;
        int i18 = ((i16 | 5) & (~i17)) + (i17 << 1);
        f53493a = i18 % 128;
        int i19 = i18 % 2;
        return y7;
    }
}
