package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class kn extends ki {
    public static int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f56808n = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final setFontFeatureSettings f56809l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate, @NotNull kw kwVar, @NotNull getValue getvalue, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull kb kbVar) {
        super(kaVar, settextkeepstate, kwVar, getvalue, kbVar);
        Intrinsics.checkNotNullParameter(kaVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kwVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(kbVar, "");
        this.f56809l = setfontfeaturesettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    public static /* synthetic */ fk a(Object[] objArr) {
        fk fkVar;
        kn knVar = (kn) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i10 = m;
        int i11 = i10 & 57;
        int i12 = -(-((i10 ^ 57) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f56808n = i13 % 128;
        int i14 = i13 % 2;
        if (!((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue()) {
            int i15 = f56808n;
            int i16 = (i15 & 9) + (i15 | 9);
            m = i16 % 128;
            if (i16 % 2 != 0) {
                byte[] bArr = (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx));
                setNextFocusLeftId setnextfocusleftid = setNextFocusLeftId.INSTANCE;
                ((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{bArr, getEmvLibVersion.setCompoundDrawableTintBlendMode}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            byte[] bArr2 = (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx));
            setNextFocusLeftId setnextfocusleftid2 = setNextFocusLeftId.INSTANCE;
            if (((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{bArr2, getEmvLibVersion.setCompoundDrawableTintBlendMode}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
                fk fkVar2 = (fk) setDividerPadding(new Object[]{knVar}, 797443013, -797443011, System.identityHashCode(knVar));
                int i17 = m + 79;
                f56808n = i17 % 128;
                int i18 = i17 % 2;
                return fkVar2;
            }
            if (!((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{bArr2, getEmvLibVersion.setX}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
                int i19 = m + 3;
                f56808n = i19 % 128;
                int i20 = i19 % 2;
                if (!((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{bArr2, getEmvLibVersion.setLayoutAnimation}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
                    fk fkVar3 = (fk) setDividerPadding(new Object[]{knVar}, 797443013, -797443011, System.identityHashCode(knVar));
                    int i21 = f56808n;
                    int i22 = (i21 & 40) + (i21 | 40);
                    int i23 = (i22 ^ (-1)) + (i22 << 1);
                    m = i23 % 128;
                    int i24 = i23 % 2;
                    return fkVar3;
                }
            }
            kw kwVar = (kw) knVar.setX();
            fk fkVar4 = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar, (ka) knVar.setOnFocusChangeListener(), knVar.setCompoundDrawableTintBlendMode(), (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -961968564, 961968575, System.identityHashCode(kwVar));
            int i25 = f56808n;
            int i26 = (i25 & 59) + (i25 | 59);
            m = i26 % 128;
            int i27 = i26 % 2;
            return fkVar4;
        }
        getNetworkTimeout getnetworktimeout = getNetworkTimeout.INSTANCE;
        if (!((Boolean) getNetworkTimeout.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)), knVar.setOnFocusChangeListener()}, 803823515, -803823515, (int) System.currentTimeMillis())).booleanValue()) {
            int i28 = f56808n;
            int i29 = ((i28 ^ 31) | (i28 & 31)) << 1;
            int i30 = -(((~i28) & 31) | (i28 & (-32)));
            int i31 = (i29 & i30) + (i30 | i29);
            m = i31 % 128;
            int i32 = i31 % 2;
            kw kwVar2 = (kw) knVar.setX();
            fk fkVar5 = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar2, (ka) knVar.setOnFocusChangeListener(), knVar.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, 1530407395, -1530407393, System.identityHashCode(kwVar2));
            int i33 = m;
            int i34 = (((i33 ^ 93) | (i33 & 93)) << 1) - (((~i33) & 93) | (i33 & (-94)));
            f56808n = i34 % 128;
            int i35 = i34 % 2;
            return fkVar5;
        }
        setAnimation setanimation = setAnimation.INSTANCE;
        if (!((Boolean) setDividerPadding(new Object[]{knVar, (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), 2}, 8474888, -8474880, 2)).booleanValue()) {
            int i36 = f56808n;
            int i37 = (((i36 | 60) << 1) - (i36 ^ 60)) - 1;
            m = i37 % 128;
            int i38 = i37 % 2;
            kw kwVar3 = (kw) knVar.setX();
            fk fkVar6 = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar3, (ka) knVar.setOnFocusChangeListener(), knVar.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, 1530407395, -1530407393, System.identityHashCode(kwVar3));
            int i39 = f56808n + 117;
            m = i39 % 128;
            if (i39 % 2 == 0) {
                return fkVar6;
            }
            throw null;
        }
        if (!((Boolean) setDividerPadding(new Object[]{knVar, (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis()), 2}, 8474888, -8474880, 2)).booleanValue()) {
            int i40 = f56808n;
            int i41 = i40 & 117;
            int i42 = -(-((i40 ^ 117) | i41));
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            m = i43 % 128;
            if (i43 % 2 == 0) {
                kw kwVar4 = (kw) knVar.setX();
                return (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar4, (ka) knVar.setOnFocusChangeListener(), knVar.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, 1530407395, -1530407393, System.identityHashCode(kwVar4));
            }
            kw kwVar5 = (kw) knVar.setX();
            int i44 = 24 / 0;
            return (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar5, (ka) knVar.setOnFocusChangeListener(), knVar.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, 1530407395, -1530407393, System.identityHashCode(kwVar5));
        }
        ka kaVar = (ka) knVar.setOnFocusChangeListener();
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis());
        if (!(!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -203580470, 203580510, System.identityHashCode(kaVar))).booleanValue())) {
            int i45 = f56808n;
            int i46 = ((i45 | 5) << 1) - (i45 ^ 5);
            m = i46 % 128;
            int i47 = i46 % 2;
            kw kwVar6 = (kw) knVar.setX();
            fk fkVar7 = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar6, (ka) knVar.setOnFocusChangeListener(), knVar.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, 1530407395, -1530407393, System.identityHashCode(kwVar6));
            int i48 = m;
            int i49 = (i48 | 111) << 1;
            int i50 = -(((~i48) & 111) | (i48 & (-112)));
            int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
            f56808n = i51 % 128;
            int i52 = i51 % 2;
            return fkVar7;
        }
        if (!((Boolean) setDividerPadding(new Object[]{knVar, (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis()), 1}, 8474888, -8474880, 1)).booleanValue()) {
            int i53 = f56808n;
            int i54 = ((i53 & 90) + (i53 | 90)) - 1;
            m = i54 % 128;
            if (i54 % 2 != 0) {
                kw kwVar7 = (kw) knVar.setX();
                throw null;
            }
            kw kwVar8 = (kw) knVar.setX();
            fk fkVar8 = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar8, (ka) knVar.setOnFocusChangeListener(), knVar.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, 1530407395, -1530407393, System.identityHashCode(kwVar8));
            int i55 = m;
            int i56 = i55 & 5;
            int i57 = (i55 ^ 5) | i56;
            int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
            f56808n = i58 % 128;
            int i59 = i58 % 2;
            return fkVar8;
        }
        if (!(!((Boolean) setDividerPadding(new Object[]{knVar, (TransactionFailed) setAnimation.setY(new Object[0], -1923859756, 1923859992, (int) System.currentTimeMillis()), 2}, 8474888, -8474880, 2)).booleanValue())) {
            cz czVar = new cz(knVar.setOnFocusChangeListener());
            int i60 = f56808n;
            int i61 = ((i60 | 5) << 1) - (i60 ^ 5);
            m = i61 % 128;
            if (i61 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i62 = m;
        int i63 = (((i62 | 71) << 1) - (~(-(((~i62) & 71) | (i62 & (-72)))))) - 1;
        f56808n = i63 % 128;
        if (i63 % 2 == 0) {
            kw kwVar9 = (kw) knVar.setX();
            fkVar = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar9, (ka) knVar.setOnFocusChangeListener(), knVar.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, 1530407395, -1530407393, System.identityHashCode(kwVar9));
            int i64 = 11 / 0;
        } else {
            kw kwVar10 = (kw) knVar.setX();
            fkVar = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar10, (ka) knVar.setOnFocusChangeListener(), knVar.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, 1530407395, -1530407393, System.identityHashCode(kwVar10));
        }
        int i65 = f56808n;
        int i66 = (i65 ^ 85) + ((i65 & 85) << 1);
        m = i66 % 128;
        if (i66 % 2 != 0) {
            int i67 = 96 / 0;
        }
        return fkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ fk b(Object[] objArr) {
        kn knVar = (kn) objArr[0];
        int i10 = f56808n;
        int i11 = i10 & 25;
        int i12 = (((i10 ^ 25) | i11) << 1) - ((i10 | 25) & (~i11));
        m = i12 % 128;
        if (i12 % 2 != 0) {
            kw kwVar = (kw) knVar.setX();
            throw null;
        }
        kw kwVar2 = (kw) knVar.setX();
        fk fkVar = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar2, (ka) knVar.setOnFocusChangeListener(), knVar.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setLayoutAnimation}, 1530407395, -1530407393, System.identityHashCode(kwVar2));
        int i13 = f56808n;
        int i14 = ((i13 | 16) << 1) - (i13 ^ 16);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        m = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 88 / 0;
        }
        return fkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x06d0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x06d1, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.kn.m;
        r4 = (r3 & (-48)) | ((~r3) & 47);
        r3 = (r3 & 47) << 1;
        r6 = (r4 & r3) + (r3 | r4);
        com.mypinpad.tsdk.isolation.kn.f56808n = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x06e5, code lost:
    
        if ((r6 % 2) == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x06e7, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.fk) setDividerPadding(new java.lang.Object[]{r1}, -1716004728, 1716004733, java.lang.System.identityHashCode(r1));
        java.lang.System.identityHashCode(r1);
        java.lang.System.identityHashCode(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x06fe, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x06ff, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.fk) setDividerPadding(new java.lang.Object[]{r1}, -1716004728, 1716004733, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0710, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0711, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.kn.f56808n;
        r4 = r3 ^ 57;
        r3 = (r3 & 57) << 1;
        r6 = ((r4 | r3) << 1) - (r3 ^ r4);
        com.mypinpad.tsdk.isolation.kn.m = r6 % 128;
        r6 = r6 % 2;
        r1 = (com.mypinpad.tsdk.isolation.fk) setDividerPadding(new java.lang.Object[]{r1}, -1716004728, 1716004733, java.lang.System.identityHashCode(r1));
        r3 = com.mypinpad.tsdk.isolation.kn.f56808n;
        r4 = ((r3 & 18) + (r3 | 18)) - 1;
        com.mypinpad.tsdk.isolation.kn.m = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0740, code lost:
    
        if ((r4 % 2) == 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0742, code lost:
    
        r2 = 27 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0745, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x018c, code lost:
    
        if ((r8 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x05bc, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.setImageTintList.setX(new java.lang.Object[]{r3}, 1174276769, -1174276767, java.lang.System.identityHashCode(r3))).intValue() >= 4) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x05e2, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.setImageTintList.setX(new java.lang.Object[]{r3}, 1174276769, -1174276767, java.lang.System.identityHashCode(r3))).intValue() >= 20) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0617, code lost:
    
        if ((!((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r4, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], 1217059921, -1217059727, (int) java.lang.System.currentTimeMillis()), 1}, -625073588, 625073594, 1)).booleanValue()) == true) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x063a, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r4, com.mypinpad.tsdk.isolation.setAnimation.getSuppressed(), 3}, -625073588, 625073594, 3)).booleanValue() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x066c, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r4, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], 840618122, -840618073, (int) java.lang.System.currentTimeMillis()), 2}, -625073588, 625073594, 2)).booleanValue() != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x066e, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.kn.f56808n;
        r4 = ((r3 | 35) << 1) - (r3 ^ 35);
        com.mypinpad.tsdk.isolation.kn.m = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x067b, code lost:
    
        if ((r4 % 2) != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x067d, code lost:
    
        r1 = (com.mypinpad.tsdk.isolation.fk) setDividerPadding(new java.lang.Object[]{r1}, -1716004728, 1716004733, java.lang.System.identityHashCode(r1));
        r3 = com.mypinpad.tsdk.isolation.kn.m;
        r6 = r3 & 61;
        r2 = (((r3 ^ 61) | r6) << 1) - ((r3 | 61) & (~r6));
        com.mypinpad.tsdk.isolation.kn.f56808n = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x06a1, code lost:
    
        if ((r2 % 2) != 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x06a3, code lost:
    
        r2 = 54 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x06a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x06a7, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.fk) setDividerPadding(new java.lang.Object[]{r1}, -1716004728, 1716004733, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x06b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x06b9, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.kn.m;
        r3 = ((r1 | 48) << 1) - (r1 ^ 48);
        r1 = (r3 ^ (-1)) + (r3 << 1);
        com.mypinpad.tsdk.isolation.kn.f56808n = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x06cb, code lost:
    
        if ((r1 % 2) != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x06cd, code lost:
    
        r1 = 28 / 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v25, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.fk c(java.lang.Object[] r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.kn.c(java.lang.Object[]):com.mypinpad.tsdk.i.fk");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x028b  */
    /* JADX WARN: Code duplicated, block: B:88:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x072d  */
    /* JADX WARN: Code duplicated, block: B:91:0x075f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0790  */
    /* JADX WARN: Code duplicated, block: B:95:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:96:0x07cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v46, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13;
        int i14;
        TransactionFailed transactionFailed;
        setImageTintList setimagetintlist;
        int i15;
        int i16;
        int i17;
        ah ahVar;
        int i18 = ~i11;
        int i19 = ~i12;
        int i20 = ~(i18 | i19);
        int i21 = ~i10;
        int i22 = ((i20 | (~(i21 | i12))) * (-370)) + (i11 * 371) + (i10 * 371);
        int i23 = (~(i12 | i18)) | (~(i21 | i19));
        int i24 = ~(i10 | i11);
        fk fkVar = null;
        Integer numValueOf = null;
        switch ((i24 * 370) + ((i23 | i24) * (-370)) + i22) {
            case 1:
                return c(objArr);
            case 2:
                return b(objArr);
            case 3:
                kn knVar = (kn) objArr[0];
                setMaxWidth setmaxwidth = (setMaxWidth) objArr[1];
                int i25 = f56808n;
                int i26 = i25 & 3;
                int i27 = i26 + ((3 ^ i25) | i26);
                m = i27 % 128;
                int i28 = i27 % 2;
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -480651882, 480651889, System.identityHashCode(setmaxwidth));
                if (getbeeponfailure != null) {
                    int i29 = m;
                    int i30 = i29 | 11;
                    int i31 = ((i30 << 1) - (~(-((~(i29 & 11)) & i30)))) - 1;
                    f56808n = i31 % 128;
                    if (i31 % 2 == 0) {
                        setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
                        if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist2}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist2))).intValue() * 2 != 0) {
                            fkVar = (fk) setDividerPadding(new Object[]{knVar}, -1716004728, 1716004733, System.identityHashCode(knVar));
                            int i32 = m;
                            int i33 = i32 ^ 7;
                            int i34 = ((i32 & 7) | i33) << 1;
                            int i35 = -i33;
                            i13 = i34 & i35;
                            i14 = i34 | i35;
                        } else {
                            transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis());
                            if (((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 420631327, -420631322, System.identityHashCode(setmaxwidth))).booleanValue()) {
                                int i36 = f56808n;
                                int i37 = ((i36 | 15) << 1) - (i36 ^ 15);
                                m = i37 % 128;
                                int i38 = i37 % 2;
                                fkVar = (fk) setDividerPadding(new Object[]{knVar}, -764454862, 764454866, System.identityHashCode(knVar));
                                int i39 = m;
                                int i40 = ((i39 & 104) + (i39 | 104)) - 1;
                                f56808n = i40 % 128;
                                int i41 = i40 % 2;
                            } else if (!(!((Boolean) setDividerPadding(new Object[]{setmaxwidth, (TransactionFailed) setAnimation.setY(new Object[0], -967810516, 967810619, (int) System.currentTimeMillis())}, 1176875211, -1176875202, (int) System.currentTimeMillis())).booleanValue())) {
                                int i42 = m;
                                int i43 = i42 & 39;
                                int i44 = (i42 | 39) & (~i43);
                                int i45 = i43 << 1;
                                i13 = i44 ^ i45;
                                i14 = (i44 & i45) << 1;
                            } else {
                                int i46 = m + 67;
                                f56808n = i46 % 128;
                                int i47 = i46 % 2;
                                fkVar = (fk) setDividerPadding(new Object[]{knVar}, -764454862, 764454866, System.identityHashCode(knVar));
                                int i48 = f56808n + 29;
                                m = i48 % 128;
                                int i49 = i48 % 2;
                            }
                        }
                        int i50 = i13 + i14;
                        f56808n = i50 % 128;
                        int i51 = i50 % 2;
                    } else {
                        setImageTintList setimagetintlist3 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
                        if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist3}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist3))).intValue() % 4 != 0) {
                            fkVar = (fk) setDividerPadding(new Object[]{knVar}, -1716004728, 1716004733, System.identityHashCode(knVar));
                            int i310 = m;
                            int i311 = i310 ^ 7;
                            int i312 = ((i310 & 7) | i311) << 1;
                            int i313 = -i311;
                            i13 = i312 & i313;
                            i14 = i312 | i313;
                        } else {
                            transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis());
                            if (((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 420631327, -420631322, System.identityHashCode(setmaxwidth))).booleanValue()) {
                                int i314 = f56808n;
                                int i315 = ((i314 | 15) << 1) - (i314 ^ 15);
                                m = i315 % 128;
                                int i316 = i315 % 2;
                                fkVar = (fk) setDividerPadding(new Object[]{knVar}, -764454862, 764454866, System.identityHashCode(knVar));
                                int i317 = m;
                                int i410 = ((i317 & 104) + (i317 | 104)) - 1;
                                f56808n = i410 % 128;
                                int i411 = i410 % 2;
                            } else if (!(!((Boolean) setDividerPadding(new Object[]{setmaxwidth, (TransactionFailed) setAnimation.setY(new Object[0], -967810516, 967810619, (int) System.currentTimeMillis())}, 1176875211, -1176875202, (int) System.currentTimeMillis())).booleanValue())) {
                                int i412 = m;
                                int i413 = i412 & 39;
                                int i414 = (i412 | 39) & (~i413);
                                int i415 = i413 << 1;
                                i13 = i414 ^ i415;
                                i14 = (i414 & i415) << 1;
                            } else {
                                int i416 = m + 67;
                                f56808n = i416 % 128;
                                int i417 = i416 % 2;
                                fkVar = (fk) setDividerPadding(new Object[]{knVar}, -764454862, 764454866, System.identityHashCode(knVar));
                                int i418 = f56808n + 29;
                                m = i418 % 128;
                                int i419 = i418 % 2;
                            }
                        }
                        int i52 = i13 + i14;
                        f56808n = i52 % 128;
                        int i53 = i52 % 2;
                    }
                } else {
                    fkVar = (fk) setDividerPadding(new Object[]{knVar}, -1716004728, 1716004733, System.identityHashCode(knVar));
                    int i318 = m;
                    int i319 = i318 ^ 7;
                    int i3110 = ((i318 & 7) | i319) << 1;
                    int i3111 = -i319;
                    i13 = i3110 & i3111;
                    i14 = i3110 | i3111;
                    int i54 = i13 + i14;
                    f56808n = i54 % 128;
                    int i55 = i54 % 2;
                }
                return fkVar;
            case 4:
                kn knVar2 = (kn) objArr[0];
                int i56 = f56808n;
                int i57 = ((i56 | 45) << 1) - (i56 ^ 45);
                m = i57 % 128;
                int i58 = i57 % 2;
                kw kwVar = (kw) knVar2.setX();
                fk fkVar2 = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar, (ka) knVar2.setOnFocusChangeListener(), knVar2.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setOnLongClickListener}, 1530407395, -1530407393, System.identityHashCode(kwVar));
                int i59 = m;
                int i60 = (i59 & (-52)) | ((~i59) & 51);
                int i61 = (i59 & 51) << 1;
                int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                f56808n = i62 % 128;
                int i63 = i62 % 2;
                return fkVar2;
            case 5:
                kn knVar3 = (kn) objArr[0];
                cz czVar = new cz(knVar3.setOnFocusChangeListener());
                fk fkVar3 = (fk) setDividerPadding(new Object[]{knVar3}, -764454862, 764454866, System.identityHashCode(knVar3));
                int i64 = m;
                int i65 = ((i64 & (-72)) | ((~i64) & 71)) + ((i64 & 71) << 1);
                f56808n = i65 % 128;
                if (i65 % 2 != 0) {
                    return fkVar3;
                }
                throw null;
            case 6:
                setMaxWidth setmaxwidth2 = (setMaxWidth) objArr[0];
                TransactionFailed transactionFailed3 = (TransactionFailed) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i66 = (-27283460) ^ iIntValue;
                int i67 = ~iIntValue;
                int i68 = (-27283460) & iIntValue;
                int i69 = ~((i66 ^ i68) | (i66 & i68));
                int i70 = (1813752552 ^ i67) | (1813752552 & i67);
                int i71 = (i70 & (-1303597740)) | (1303597739 & (~i70));
                int i72 = i70 & 1303597739;
                int i73 = (i71 ^ i72) | (i72 & i71);
                int i74 = ~i73;
                int i75 = (i73 | i74) & i74;
                int i76 = -(-(((i69 & i75) | (i69 ^ i75)) * 920));
                int i77 = 680838802 | i76;
                int i78 = i77 << 1;
                int i79 = -((~(i76 & 680838802)) & i77);
                int i80 = (i78 ^ i79) + ((i78 & i79) << 1);
                int i81 = (-1303597740) & i67;
                int i82 = (~i81) & ((-1303597740) | i67);
                int i83 = (i82 ^ i81) | (i81 & i82);
                int i84 = ~i83;
                int i85 = (i83 | i84) & i84;
                int i86 = 27283459 ^ i85;
                int i87 = i85 & 27283459;
                int i88 = ((i86 & i87) | (i86 ^ i87)) * 920;
                int i89 = i80 ^ i88;
                int i90 = ((i88 & i80) | i89) << 1;
                int i91 = -i89;
                int i92 = (i90 & i91) + (i90 | i91);
                int i93 = ((-27283460) & i67) | ((-27283460) ^ i67);
                int i94 = ~i93;
                int i95 = (i93 | i94) & i94;
                int i96 = (-1276314281) & iIntValue;
                int i97 = ((-1276314281) | iIntValue) & (~i96);
                int i98 = ~((i97 & i96) | (i97 ^ i96));
                int i99 = ((~i98) & i95) | ((~i95) & i98);
                int i100 = i95 & i98;
                int i101 = (i100 & i99) | (i99 ^ i100);
                int i102 = 1841036011 ^ iIntValue;
                int i103 = 1841036011 & iIntValue;
                int i104 = (i101 | (~((i103 & i102) | (i102 ^ i103)))) * 920;
                int i105 = ((i92 | i104) << 1) - (i104 ^ i92);
                int i106 = (-1481004321) & iIntValue;
                int i107 = (~i106) & ((-1481004321) | iIntValue);
                int i108 = ~((i106 & i107) | (i107 ^ i106));
                int i109 = ((~i108) & 138433824) | (i108 & (-138433825));
                int i110 = i108 & 138433824;
                int i111 = (i110 & i109) | (i109 ^ i110);
                int i112 = 1426464979 & iIntValue;
                int i113 = (~i112) & (1426464979 | iIntValue);
                int i114 = ~((i113 & i112) | (i113 ^ i112));
                int i115 = i111 & i114;
                int i116 = (i114 | i111) & (~i115);
                int i117 = -(-(((i116 & i115) | (i116 ^ i115)) * (-880)));
                int i118 = (804518284 ^ i117) + ((i117 & 804518284) << 1);
                int i119 = (-1481004321) ^ i67;
                int i120 = (-1481004321) & i67;
                int i121 = (i119 & i120) | (i119 ^ i120);
                int i122 = ~i121;
                int i123 = (i121 | i122) & i122;
                int i124 = (i123 & (-1426464980)) | ((-1426464980) ^ i123);
                int i125 = ~(1481004320 | iIntValue);
                int i126 = i124 & i125;
                int i127 = (i124 | i125) & (~i126);
                int i128 = ((i127 & i126) | (i127 ^ i126)) * (-880);
                int i129 = ((i118 | i128) << 1) - (i128 ^ i118);
                int i130 = 1481004320 ^ iIntValue;
                int i131 = 1481004320 & iIntValue;
                int i132 = (~((i130 & i131) | (i130 ^ i131))) * 880;
                int i133 = i129 & i132;
                int i134 = (i132 | i129) & (~i133);
                int i135 = i133 << 1;
                if (i105 > (i134 ^ i135) + ((i134 & i135) << 1)) {
                    throw null;
                }
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth2, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -480651882, 480651889, System.identityHashCode(setmaxwidth2));
                if (getbeeponfailure2 != null && (setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2))) != null) {
                    int i136 = f56808n + 17;
                    m = i136 % 128;
                    int i137 = i136 % 2;
                    if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue() == iIntValue) {
                        int i138 = m;
                        int i139 = (i138 & 29) + (i138 | 29);
                        f56808n = i139 % 128;
                        int i140 = i139 % 2;
                        return Boolean.TRUE;
                    }
                }
                int i141 = f56808n;
                int i142 = i141 & 69;
                int i143 = i142 + ((i141 ^ 69) | i142);
                m = i143 % 128;
                int i144 = i143 % 2;
                return Boolean.FALSE;
            case 7:
                return a(objArr);
            case 8:
                kn knVar4 = (kn) objArr[0];
                TransactionFailed transactionFailed4 = (TransactionFailed) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i145 = m;
                int i146 = ((i145 & 91) - (~(i145 | 91))) - 1;
                f56808n = i146 % 128;
                if (i146 % 2 == 0) {
                    ka kaVar = (ka) knVar4.setOnFocusChangeListener();
                    ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, -232375606, 232375652, System.identityHashCode(kaVar))).booleanValue();
                    throw null;
                }
                ka kaVar2 = (ka) knVar4.setOnFocusChangeListener();
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, -232375606, 232375652, System.identityHashCode(kaVar2))).booleanValue()) {
                    int i147 = f56808n;
                    int i148 = i147 & 83;
                    int i149 = (((i147 ^ 83) | i148) << 1) - ((i147 | 83) & (~i148));
                    m = i149 % 128;
                    int i150 = i149 % 2;
                    ka kaVar3 = (ka) knVar4.setOnFocusChangeListener();
                    getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar3, transactionFailed4}, 1431838387, -1431838363, System.identityHashCode(kaVar3));
                    if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3))).length == iIntValue2) {
                        int i151 = f56808n;
                        int i152 = i151 & 23;
                        int i153 = (((~i152) & (i151 | 23)) - (~(i152 << 1))) - 1;
                        m = i153 % 128;
                        int i154 = i153 % 2;
                        int i155 = (i151 & 5) + (i151 | 5);
                        m = i155 % 128;
                        int i156 = i155 % 2;
                        return Boolean.TRUE;
                    }
                }
                int i157 = (-2) - ((m + 28) ^ (-1));
                f56808n = i157 % 128;
                if (i157 % 2 != 0) {
                    return Boolean.FALSE;
                }
                throw null;
            case 9:
                setMaxWidth setmaxwidth3 = (setMaxWidth) objArr[0];
                TransactionFailed transactionFailed5 = (TransactionFailed) objArr[1];
                int i158 = f56808n + 69;
                m = i158 % 128;
                int i159 = i158 % 2;
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth3, (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5))}, -480651882, 480651889, System.identityHashCode(setmaxwidth3));
                if (getbeeponfailure4 != null) {
                    setImageTintList setimagetintlist4 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure4));
                    if (setimagetintlist4 == null) {
                        int i160 = m;
                        int i161 = ((((i160 ^ 103) | (i160 & 103)) << 1) - (~(-((i160 & (-104)) | ((~i160) & 103))))) - 1;
                        f56808n = i161 % 128;
                        int i162 = i161 % 2;
                        int i163 = i160 & 83;
                        i15 = ((i160 ^ 83) | i163) << 1;
                        i16 = (i160 | 83) & (~i163);
                    } else {
                        numValueOf = Integer.valueOf(((Integer) setImageTintList.setX(new Object[]{setimagetintlist4}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist4))).intValue());
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                    }
                    if (numValueOf != null) {
                        int i164 = m;
                        int i165 = i164 & 33;
                        int i166 = (i165 - (~((i164 ^ 33) | i165))) - 1;
                        f56808n = i166 % 128;
                        i17 = i166 % 2;
                        int iIntValue3 = numValueOf.intValue();
                        if (i17 == 0 ? iIntValue3 != 6 : iIntValue3 != 81) {
                            int i167 = m;
                            int i168 = i167 & 107;
                            int i169 = (i167 ^ 107) | i168;
                            int i170 = (i168 & i169) + (i169 | i168);
                            f56808n = i170 % 128;
                            int i171 = i170 % 2;
                            return Boolean.FALSE;
                        }
                    }
                    int i172 = f56808n + 83;
                    m = i172 % 128;
                    int i173 = i172 % 2;
                    return Boolean.TRUE;
                }
                int i174 = m;
                int i175 = i174 & 69;
                int i176 = (~i175) & (i174 | 69);
                int i177 = i175 << 1;
                int i178 = (i176 ^ i177) + ((i177 & i176) << 1);
                f56808n = i178 % 128;
                if (i178 % 2 == 0) {
                    throw null;
                }
                i15 = i174 ^ 103;
                i16 = -((i174 & 103) << 1);
                int i179 = (i15 - (~(-i16))) - 1;
                f56808n = i179 % 128;
                int i180 = i179 % 2;
                if (numValueOf != null) {
                    int i1610 = m;
                    int i1611 = i1610 & 33;
                    int i1612 = (i1611 - (~((i1610 ^ 33) | i1611))) - 1;
                    f56808n = i1612 % 128;
                    i17 = i1612 % 2;
                    int iIntValue4 = numValueOf.intValue();
                    if (i17 == 0) {
                        int i1613 = m;
                        int i1614 = i1613 & 107;
                        int i1615 = (i1613 ^ 107) | i1614;
                        int i1710 = (i1614 & i1615) + (i1615 | i1614);
                        f56808n = i1710 % 128;
                        int i1711 = i1710 % 2;
                        return Boolean.FALSE;
                    }
                    int i1616 = m;
                    int i1617 = i1616 & 107;
                    int i1618 = (i1616 ^ 107) | i1617;
                    int i1712 = (i1617 & i1618) + (i1618 | i1617);
                    f56808n = i1712 % 128;
                    int i1713 = i1712 % 2;
                    return Boolean.FALSE;
                }
                int i1714 = f56808n + 83;
                m = i1714 % 128;
                int i1715 = i1714 % 2;
                return Boolean.TRUE;
            case 10:
                kn knVar5 = (kn) objArr[0];
                setRotationX setrotationx = (setRotationX) objArr[1];
                int i181 = m + 59;
                f56808n = i181 % 128;
                int i182 = i181 % 2;
                Intrinsics.checkNotNullParameter(setrotationx, "");
                fk fkVar4 = (fk) setDividerPadding(new Object[]{knVar5, setrotationx}, -1371853328, 1371853335, System.identityHashCode(knVar5));
                if (fkVar4 != null) {
                    int i183 = f56808n;
                    int i184 = (i183 ^ 36) + ((i183 & 36) << 1);
                    int i185 = (i184 ^ (-1)) + (i184 << 1);
                    int i186 = i185 % 128;
                    m = i186;
                    int i187 = i185 % 2;
                    int i188 = (i186 | 61) << 1;
                    int i189 = -(i186 ^ 61);
                    int i190 = (i188 ^ i189) + ((i188 & i189) << 1);
                    f56808n = i190 % 128;
                    if (i190 % 2 != 0) {
                        return fkVar4;
                    }
                    throw null;
                }
                fk fkVar5 = (fk) setDividerPadding(new Object[]{knVar5, setrotationx}, -2120954950, 2120954951, System.identityHashCode(knVar5));
                if (fkVar5 != null) {
                    int i191 = f56808n;
                    int i192 = i191 + 103;
                    m = i192 % 128;
                    int i193 = i192 % 2;
                    int i194 = i191 & 103;
                    int i195 = (i191 | 103) & (~i194);
                    int i196 = -(-(i194 << 1));
                    int i197 = (i195 & i196) + (i195 | i196);
                    m = i197 % 128;
                    int i198 = i197 % 2;
                    return fkVar5;
                }
                ka kaVar4 = (ka) knVar5.setOnFocusChangeListener();
                ka kaVar5 = (ka) knVar5.setOnFocusChangeListener();
                setAnimation setanimation2 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
                getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar5, (String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6))}, -1511355589, 1511355624, System.identityHashCode(kaVar5));
                if (getbeeponfailure5 == null) {
                    int i199 = m;
                    int i200 = (i199 | 79) << 1;
                    int i201 = -(((~i199) & 79) | (i199 & (-80)));
                    int i202 = (i200 & i201) + (i201 | i200);
                    int i203 = i202 % 128;
                    f56808n = i203;
                    if (i202 % 2 == 0) {
                        int i204 = 91 / 0;
                    }
                    int i205 = ((i203 ^ 105) | (i203 & 105)) << 1;
                    int i206 = -(((~i203) & 105) | (i203 & (-106)));
                    int i207 = ((i205 | i206) << 1) - (i206 ^ i205);
                    m = i207 % 128;
                    int i208 = i207 % 2;
                    ahVar = null;
                } else {
                    ahVar = new ah(getbeeponfailure5.setNavigationOnClickListener());
                    int i209 = m;
                    int i210 = (i209 ^ 123) + ((i209 & 123) << 1);
                    f56808n = i210 % 128;
                    int i211 = i210 % 2;
                }
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar4, ahVar}, 2023572198, -2023572188, System.identityHashCode(kaVar4));
                kr krVar = kr.INSTANCE;
                fk fkVar6 = (fk) kr.setX(new Object[]{(ka) knVar5.setOnFocusChangeListener(), knVar5.setCompoundDrawableTintBlendMode(), knVar5.setY(), (kw) knVar5.setX(), knVar5.setOnLongClickListener()}, -837179530, 837179530, (int) System.currentTimeMillis());
                int i212 = f56808n + 21;
                m = i212 % 128;
                if (i212 % 2 == 0) {
                    return fkVar6;
                }
                throw null;
            default:
                kn knVar6 = (kn) objArr[0];
                int i213 = m + 57;
                int i214 = i213 % 128;
                f56808n = i214;
                int i215 = i213 % 2;
                setFontFeatureSettings setfontfeaturesettings = knVar6.f56809l;
                int i216 = i214 & 27;
                int i217 = (i214 | 27) & (~i216);
                int i218 = -(-(i216 << 1));
                int i219 = (i217 ^ i218) + ((i218 & i217) << 1);
                m = i219 % 128;
                int i220 = i219 % 2;
                return setfontfeaturesettings;
        }
    }

    public static final /* synthetic */ setFontFeatureSettings setX(kn knVar) {
        return (setFontFeatureSettings) setDividerPadding(new Object[]{knVar}, 2039431541, -2039431541, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, -1862336821, 1862336831, System.identityHashCode(this));
    }
}
