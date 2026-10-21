package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class anz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f53365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53366b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53367c = 1;

    public static class a extends k {
        @Override // com.mypinpad.tsdk.i.anz.k
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar, null};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            ahx ahxVar = (ahx) ahx.setCompoundDrawableTintBlendMode(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 1906174166, -1906174164, (int) System.currentTimeMillis());
            return new anw((BigInteger) ahx.setCompoundDrawableTintBlendMode(new Object[]{ahxVar}, 397751114, -397751113, System.identityHashCode(ahxVar)), (BigInteger) ahx.setCompoundDrawableTintBlendMode(new Object[]{ahxVar}, 389614071, -389614068, System.identityHashCode(ahxVar)));
        }
    }

    public static class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f53368a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53369b = 1;

        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v25 byte[], still in use, count: 2, list:
              (r0v25 byte[]) from 0x00ef: ARRAY_LENGTH (r0v25 byte[]) A[WRAPPED] (LINE:240)
              (r0v25 byte[]) from 0x0106: PHI (r0 I:byte[] A[IMMUTABLE_TYPE]) = (r0v11 byte[]), (r0v25 byte[]) binds: [B:10:0x0104, B:7:0x00f2] A[DONT_GENERATE, DONT_INLINE]
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
        @Override // com.mypinpad.tsdk.i.anz.k
        public final com.mypinpad.tsdk.isolation.amw a(com.mypinpad.tsdk.isolation.ajj r20) {
            /*
                Method dump skipped, instruction units count: 775
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.anz.b.a(com.mypinpad.tsdk.i.ajj):com.mypinpad.tsdk.i.amw");
        }
    }

    public static class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f53370a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53371b = 1;

        @Override // com.mypinpad.tsdk.i.anz.k
        public final amw a(ajj ajjVar) throws IOException {
            int iIntValue = 0;
            Object[] objArr = {this, ajjVar, null};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            int i10 = f53370a;
            int i11 = ((i10 | 89) << 1) - (i10 ^ 89);
            f53371b = i11 % 128;
            int i12 = i11 % 2;
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            ahu ahuVar = (ahu) ahu.setCompoundDrawableTintBlendMode(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -513456911, 513456913, System.identityHashCode(aiwVar))}, 1605013944, -1605013940, (int) System.currentTimeMillis());
            adp adpVar = (adp) ((ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2)));
            BigInteger bigInteger = (BigInteger) ahu.setCompoundDrawableTintBlendMode(new Object[]{ahuVar}, -552555373, 552555374, System.identityHashCode(ahuVar));
            if (bigInteger == null) {
                int i13 = f53370a;
                int i14 = (i13 & 103) + (i13 | 103);
                f53371b = i14 % 128;
                if (i14 % 2 == 0) {
                    iIntValue = 1;
                }
            } else {
                iIntValue = bigInteger.intValue();
                int i15 = f53371b;
                int i16 = ((i15 & (-100)) | ((~i15) & 99)) + ((i15 & 99) << 1);
                f53370a = i16 % 128;
                int i17 = i16 % 2;
            }
            anb anbVar = new anb(adpVar.setCompoundDrawableTintBlendMode(), new ana(ahuVar.setDividerPadding(), ahuVar.setY(), iIntValue));
            int i18 = f53370a;
            int i19 = i18 & 117;
            int i20 = (i18 ^ 117) | i19;
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f53371b = i21 % 128;
            int i22 = i21 % 2;
            return anbVar;
        }
    }

    public static class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f53372a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53373b = 1;

        /* JADX WARN: Code duplicated, block: B:37:0x0212  */
        /* JADX WARN: Code duplicated, block: B:39:0x02e0  */
        /* JADX WARN: Code duplicated, block: B:41:0x02f9 A[Catch: IOException -> 0x0334, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0334, blocks: (B:41:0x02f9, B:43:0x030e, B:48:0x0314), top: B:60:0x02f7 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0314 A[Catch: IOException -> 0x0334, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0334, blocks: (B:41:0x02f9, B:43:0x030e, B:48:0x0314), top: B:60:0x02f7 }] */
        @Override // com.mypinpad.tsdk.i.anz.k
        public final amw a(ajj ajjVar) {
            ang angVar;
            int iIntValue;
            int i10;
            int i11;
            int i12;
            ads adsVar;
            Object[] objArr = {this, ajjVar, null};
            System.identityHashCode(this);
            d dVar = (d) objArr[0];
            ajj ajjVar2 = (ajj) objArr[1];
            int i13 = f53373b;
            int i14 = (i13 | 15) << 1;
            int i15 = -(i13 ^ 15);
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            f53372a = i16 % 128;
            int i17 = i16 % 2;
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            ajw ajwVar = (ajw) ajw.setOnFocusChangeListener(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -513456911, 513456913, System.identityHashCode(aiwVar))}, 1407491790, -1407491786, (int) System.currentTimeMillis());
            if (((Boolean) ajw.setOnFocusChangeListener(new Object[]{ajwVar}, 129079318, -129079316, System.identityHashCode(ajwVar))).booleanValue()) {
                int i18 = f53373b;
                int i19 = i18 & 21;
                int i20 = (i18 | 21) & (~i19);
                int i21 = i19 << 1;
                int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                f53372a = i22 % 128;
                if (i22 % 2 != 0) {
                    throw null;
                }
                adu aduVar = (adu) ((ady) ajw.setOnFocusChangeListener(new Object[]{ajwVar}, 317561633, -317561633, System.identityHashCode(ajwVar)));
                ajz ajzVar = (ajz) ama.setDividerPadding(new Object[]{aduVar}, -88371935, 88371941, (int) System.currentTimeMillis());
                if (ajzVar == null) {
                    ajzVar = (ajz) ajv.setY(new Object[]{aduVar}, -921880524, 921880524, (int) System.currentTimeMillis());
                    int i23 = f53372a;
                    int i24 = i23 & 99;
                    int i25 = i24 + ((i23 ^ 99) | i24);
                    f53373b = i25 % 128;
                    int i26 = i25 % 2;
                }
                angVar = new ank(aduVar, ajzVar);
                int i27 = f53373b;
                int i28 = (i27 ^ 80) + ((i27 & 80) << 1);
                int i29 = (i28 ^ (-1)) + (i28 << 1);
                f53372a = i29 % 128;
                int i30 = i29 % 2;
            } else if (((Boolean) ajw.setOnFocusChangeListener(new Object[]{ajwVar}, 551840194, -551840193, System.identityHashCode(ajwVar))).booleanValue()) {
                int i31 = f53373b;
                int i32 = i31 ^ 51;
                int i33 = (((i31 & 51) | i32) << 1) - i32;
                f53372a = i33 % 128;
                if (i33 % 2 != 0) {
                    throw null;
                }
                int i34 = i31 & 5;
                int i35 = i31 | 5;
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                f53372a = i36 % 128;
                int i37 = i36 % 2;
                angVar = null;
            } else {
                angVar = new ang((ajz) ajz.setDividerPadding(new Object[]{(ady) ajw.setOnFocusChangeListener(new Object[]{ajwVar}, 317561633, -317561633, System.identityHashCode(ajwVar))}, 1538081117, -1538081113, (int) System.currentTimeMillis()));
                int i38 = f53372a;
                int i39 = ((i38 & (-60)) | ((~i38) & 59)) + ((i38 & 59) << 1);
                f53373b = i39 % 128;
                int i40 = i39 % 2;
            }
            acz aczVar = (acz) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, -792808893, 792808894, System.identityHashCode(ajjVar2));
            byte[] bArr = (byte[]) acz.setDividerPadding(new Object[]{aczVar}, -2004692391, 2004692392, System.identityHashCode(aczVar));
            ads aftVar = new aft(bArr);
            if (bArr[0] == 4) {
                int i41 = f53373b;
                int i42 = (i41 & (-58)) | ((~i41) & 57);
                int i43 = -(-((i41 & 57) << 1));
                int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                int i45 = i44 % 128;
                f53372a = i45;
                int i46 = i44 % 2;
                byte b10 = bArr[1];
                int length = bArr.length;
                if (b10 == ((length | (-2)) << 1) - (length ^ (-2))) {
                    int i47 = i45 + 71;
                    int i48 = i47 % 128;
                    f53373b = i48;
                    if (i47 % 2 != 0 ? bArr[2] == 2 : bArr[2] == 3) {
                        new akc();
                        iIntValue = ((Integer) akc.setDividerPadding(new Object[]{(aph) ang.setOnFocusChangeListener(new Object[]{angVar}, 1031463732, -1031463726, System.identityHashCode(angVar))}, 1681595904, -1681595902, (int) System.currentTimeMillis())).intValue();
                        int length2 = bArr.length;
                        int iIdentityHashCode = System.identityHashCode(dVar);
                        int i49 = -(-(length2 * (-622)));
                        int i50 = ((~i49) & (-1872)) | (i49 & 1871);
                        int i51 = (i49 & (-1872)) << 1;
                        int i52 = (i50 & i51) + (i51 | i50);
                        int i53 = ~length2;
                        int i54 = (i53 & 2) | ((~i53) & (-3));
                        int i55 = i53 & (-3);
                        int i56 = (i54 & i55) | (i54 ^ i55);
                        int i57 = i56 ^ iIdentityHashCode;
                        int i58 = i56 & iIdentityHashCode;
                        int i59 = -(-((~((i57 ^ i58) | (i58 & i57))) * 623));
                        int i60 = i52 & i59;
                        int i61 = (~i60) & (i59 | i52);
                        int i62 = i60 << 1;
                        int i63 = (i61 & i62) + (i61 | i62);
                        int i64 = ~iIdentityHashCode;
                        int i65 = (2 ^ length2) | (2 & length2);
                        int i66 = ~i65;
                        int i67 = (i65 | i66) & i66;
                        int i68 = ((~i64) & i67) | ((~i67) & i64);
                        int i69 = i67 & i64;
                        int i70 = -(-(((i68 & i69) | (i68 ^ i69)) * (-623)));
                        int i71 = (i63 | i70) << 1;
                        int i72 = -((i70 & (~i63)) | ((~i70) & i63));
                        int i73 = (i71 & i72) + (i72 | i71);
                        int i74 = (~i55) & (i53 | (-3));
                        int i75 = (i74 & i55) | (i74 ^ i55);
                        int i76 = ~i75;
                        int i77 = (i75 | i76) & i76;
                        int i78 = (length2 | i53) & i53;
                        int i79 = ~((i78 & iIdentityHashCode) | (i78 & i64) | ((~i78) & iIdentityHashCode));
                        int i80 = (i77 & i79) | (i77 ^ i79);
                        int i81 = (i64 & (-3)) | (iIdentityHashCode & 2);
                        int i82 = iIdentityHashCode & (-3);
                        int i83 = (i81 & i82) | (i81 ^ i82);
                        int i84 = ~i83;
                        int i85 = (i83 | i84) & i84;
                        int i86 = i80 & i85;
                        int i87 = (i80 | i85) & (~i86);
                        int i88 = ((i87 & i86) | (i87 ^ i86)) * 623;
                        i10 = ((~i88) & i73) | ((~i73) & i88);
                        i11 = (i88 & i73) << 1;
                        if (iIntValue >= (i10 & i11) + (i11 | i10)) {
                            int i89 = f53372a;
                            int i90 = i89 & 13;
                            i12 = (i90 - (~(-(-((i89 ^ 13) | i90))))) - 1;
                            f53373b = i12 % 128;
                            try {
                                if (i12 % 2 == 0) {
                                    adsVar = (ads) ((ady) ady.setNavigationOnClickListener(new Object[]{bArr}, -1692126728, 1692126730, (int) System.currentTimeMillis()));
                                    int i91 = 41 / 0;
                                } else {
                                    adsVar = (ads) ((ady) ady.setNavigationOnClickListener(new Object[]{bArr}, -1692126728, 1692126730, (int) System.currentTimeMillis()));
                                }
                                aftVar = adsVar;
                                int i92 = f53372a;
                                int i93 = (i92 & 125) + (i92 | 125);
                                f53373b = i93 % 128;
                                int i94 = i93 % 2;
                            } catch (IOException unused) {
                                throw new IllegalArgumentException("error recovering public key");
                            }
                        }
                    } else {
                        int i95 = i48 & 11;
                        int i96 = (((i48 ^ 11) | i95) << 1) - ((i48 | 11) & (~i95));
                        f53372a = i96 % 128;
                        if (i96 % 2 == 0 ? bArr[2] == 3 : bArr[3] == 2) {
                            new akc();
                            iIntValue = ((Integer) akc.setDividerPadding(new Object[]{(aph) ang.setOnFocusChangeListener(new Object[]{angVar}, 1031463732, -1031463726, System.identityHashCode(angVar))}, 1681595904, -1681595902, (int) System.currentTimeMillis())).intValue();
                            int length3 = bArr.length;
                            int iIdentityHashCode2 = System.identityHashCode(dVar);
                            int i410 = -(-(length3 * (-622)));
                            int i510 = ((~i410) & (-1872)) | (i410 & 1871);
                            int i511 = (i410 & (-1872)) << 1;
                            int i512 = (i510 & i511) + (i511 | i510);
                            int i513 = ~length3;
                            int i514 = (i513 & 2) | ((~i513) & (-3));
                            int i515 = i513 & (-3);
                            int i516 = (i514 & i515) | (i514 ^ i515);
                            int i517 = i516 ^ iIdentityHashCode2;
                            int i518 = i516 & iIdentityHashCode2;
                            int i519 = -(-((~((i517 ^ i518) | (i518 & i517))) * 623));
                            int i610 = i512 & i519;
                            int i611 = (~i610) & (i519 | i512);
                            int i612 = i610 << 1;
                            int i613 = (i611 & i612) + (i611 | i612);
                            int i614 = ~iIdentityHashCode2;
                            int i615 = (2 ^ length3) | (2 & length3);
                            int i616 = ~i615;
                            int i617 = (i615 | i616) & i616;
                            int i618 = ((~i614) & i617) | ((~i617) & i614);
                            int i619 = i617 & i614;
                            int i710 = -(-(((i618 & i619) | (i618 ^ i619)) * (-623)));
                            int i711 = (i613 | i710) << 1;
                            int i712 = -((i710 & (~i613)) | ((~i710) & i613));
                            int i713 = (i711 & i712) + (i712 | i711);
                            int i714 = (~i515) & (i513 | (-3));
                            int i715 = (i714 & i515) | (i714 ^ i515);
                            int i716 = ~i715;
                            int i717 = (i715 | i716) & i716;
                            int i718 = (length3 | i513) & i513;
                            int i719 = ~((i718 & iIdentityHashCode2) | (i718 & i614) | ((~i718) & iIdentityHashCode2));
                            int i810 = (i717 & i719) | (i717 ^ i719);
                            int i811 = (i614 & (-3)) | (iIdentityHashCode2 & 2);
                            int i812 = iIdentityHashCode2 & (-3);
                            int i813 = (i811 & i812) | (i811 ^ i812);
                            int i814 = ~i813;
                            int i815 = (i813 | i814) & i814;
                            int i816 = i810 & i815;
                            int i817 = (i810 | i815) & (~i816);
                            int i818 = ((i817 & i816) | (i817 ^ i816)) * 623;
                            i10 = ((~i818) & i713) | ((~i713) & i818);
                            i11 = (i818 & i713) << 1;
                            if (iIntValue >= (i10 & i11) + (i11 | i10)) {
                                int i819 = f53372a;
                                int i97 = i819 & 13;
                                i12 = (i97 - (~(-(-((i819 ^ 13) | i97))))) - 1;
                                f53373b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    adsVar = (ads) ((ady) ady.setNavigationOnClickListener(new Object[]{bArr}, -1692126728, 1692126730, (int) System.currentTimeMillis()));
                                    int i98 = 41 / 0;
                                } else {
                                    adsVar = (ads) ((ady) ady.setNavigationOnClickListener(new Object[]{bArr}, -1692126728, 1692126730, (int) System.currentTimeMillis()));
                                }
                                aftVar = adsVar;
                                int i99 = f53372a;
                                int i910 = (i99 & 125) + (i99 | 125);
                                f53373b = i910 % 128;
                                int i911 = i910 % 2;
                            }
                        }
                    }
                }
            }
            anl anlVar = new anl(new akb(angVar.setDividerPadding(), aftVar).setX(), angVar);
            int i100 = f53373b;
            int i101 = i100 & 115;
            int i102 = i100 | 115;
            int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
            f53372a = i103 % 128;
            if (i103 % 2 == 0) {
                return anlVar;
            }
            throw null;
        }
    }

    public static class e extends k {
        @Override // com.mypinpad.tsdk.i.anz.k
        public final amw a(ajj ajjVar) {
            Object[] objArr = {this, ajjVar, null};
            System.identityHashCode(this);
            return new aob(anz.a((ajj) objArr[1]));
        }
    }

    public static class f extends k {
        @Override // com.mypinpad.tsdk.i.anz.k
        public final amw a(ajj ajjVar) {
            Object[] objArr = {this, ajjVar, null};
            System.identityHashCode(this);
            return new anj(anz.a((ajj) objArr[1]));
        }
    }

    public static class g extends k {
        @Override // com.mypinpad.tsdk.i.anz.k
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar, null};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            ahs ahsVar = (ahs) ahs.setCompoundDrawableTintBlendMode(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -513456911, 513456913, System.identityHashCode(aiwVar))}, 482759757, -482759757, (int) System.currentTimeMillis());
            return new anq(((adp) ((ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2)))).setCompoundDrawableTintBlendMode(), new anr(ahsVar.setDividerPadding(), ahsVar.setCompoundDrawableTintBlendMode()));
        }
    }

    public static class h extends k {
        @Override // com.mypinpad.tsdk.i.anz.k
        public final amw a(ajj ajjVar) {
            Object[] objArr = {this, ajjVar, null};
            System.identityHashCode(this);
            return new ani(anz.a((ajj) objArr[1]));
        }
    }

    public static class i extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f53374a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53375b = 1;

        public static /* synthetic */ anl b(Object[] objArr) {
            adu aduVar;
            aif aifVar;
            ads adsVar;
            int i10;
            ang angVar;
            int i11;
            ang angVar2;
            i iVar = (i) objArr[0];
            ajj ajjVar = (ajj) objArr[1];
            Object obj = objArr[2];
            int i12 = f53375b;
            int i13 = i12 & 33;
            int i14 = (i13 - (~(-(-((i12 ^ 33) | i13))))) - 1;
            f53374a = i14 % 128;
            try {
                if (i14 % 2 != 0) {
                    aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, 912478577, -912478575, System.identityHashCode(ajjVar));
                    aduVar = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar));
                    aifVar = (aif) aif.setX(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -513456911, 513456913, System.identityHashCode(aiwVar))}, 1248089737, -1248089734, (int) System.currentTimeMillis());
                    adsVar = (ads) ((ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, 777066731, -777066731, System.identityHashCode(ajjVar)));
                    int i15 = 77 / 0;
                } else {
                    aiw aiwVar2 = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, 912478577, -912478575, System.identityHashCode(ajjVar));
                    aduVar = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -661220858, 661220861, System.identityHashCode(aiwVar2));
                    aifVar = (aif) aif.setX(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -513456911, 513456913, System.identityHashCode(aiwVar2))}, 1248089737, -1248089734, (int) System.currentTimeMillis());
                    adsVar = (ads) ((ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, 777066731, -777066731, System.identityHashCode(ajjVar)));
                }
                int i16 = f53374a;
                int i17 = ((i16 | 77) << 1) - (i16 ^ 77);
                f53375b = i17 % 128;
                int i18 = i17 % 2;
                int i19 = (-2) - ((i16 + 116) ^ (-1));
                f53375b = i19 % 128;
                int i20 = i19 % 2;
                byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
                adu aduVar2 = aik.setX;
                if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, aduVar2}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                    int i21 = f53374a;
                    int i22 = i21 & 79;
                    int i23 = (i21 ^ 79) | i22;
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    f53375b = i24 % 128;
                    int i25 = i24 % 2;
                    c(new Object[]{bArr}, -1116229230, 1116229230, (int) System.currentTimeMillis());
                    int i26 = f53375b;
                    int i27 = (i26 & (-8)) | ((~i26) & 7);
                    int i28 = -(-((i26 & 7) << 1));
                    int i29 = (i27 & i28) + (i28 | i27);
                    f53374a = i29 % 128;
                    int i30 = i29 % 2;
                }
                if (!(!((Boolean) aif.setX(new Object[]{aifVar}, 1450725992, -1450725988, System.identityHashCode(aifVar))).booleanValue())) {
                    int i31 = f53374a + 29;
                    f53375b = i31 % 128;
                    if (i31 % 2 == 0) {
                        angVar2 = (ang) aie.setCompoundDrawableTintBlendMode(new Object[]{(adu) aif.setX(new Object[]{aifVar}, 1577795567, -1577795567, System.identityHashCode(aifVar))}, -1584293911, 1584293911, (int) System.currentTimeMillis());
                        int i32 = 94 / 0;
                    } else {
                        angVar2 = (ang) aie.setCompoundDrawableTintBlendMode(new Object[]{(adu) aif.setX(new Object[]{aifVar}, 1577795567, -1577795567, System.identityHashCode(aifVar))}, -1584293911, 1584293911, (int) System.currentTimeMillis());
                    }
                    int i33 = f53375b;
                    int i34 = (((i33 & (-34)) | ((~i33) & 33)) - (~((i33 & 33) << 1))) - 1;
                    f53374a = i34 % 128;
                    int i35 = i34 % 2;
                    angVar = angVar2;
                    i11 = 2;
                } else {
                    aig aigVar = (aig) aif.setX(new Object[]{aifVar}, -429049255, 429049256, System.identityHashCode(aifVar));
                    byte[] bArr2 = (byte[]) aig.setDividerPadding(new Object[]{aigVar}, -557516030, 557516036, System.identityHashCode(aigVar));
                    if (!(!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, aduVar2}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue())) {
                        System.identityHashCode(iVar);
                        System.identityHashCode(iVar);
                        c(new Object[]{bArr2}, -1116229230, 1116229230, (int) System.currentTimeMillis());
                        int i36 = f53374a;
                        int i37 = (i36 ^ 15) + ((i36 & 15) << 1);
                        f53375b = i37 % 128;
                        int i38 = i37 % 2;
                    }
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    aih aihVar = (aih) aig.setDividerPadding(new Object[]{aigVar}, 1004177238, -1004177234, System.identityHashCode(aigVar));
                    aph.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new aph.setCompoundDrawableTintBlendMode(((Integer) aih.setY(new Object[]{aihVar}, 661001106, -661001103, System.identityHashCode(aihVar))).intValue(), ((Integer) aih.setY(new Object[]{aihVar}, -782909305, 782909306, System.identityHashCode(aihVar))).intValue(), ((Integer) aih.setY(new Object[]{aihVar}, -217190719, 217190719, System.identityHashCode(aihVar))).intValue(), ((Integer) aih.setY(new Object[]{aihVar}, -1412912864, 1412912869, System.identityHashCode(aihVar))).intValue(), (BigInteger) aig.setDividerPadding(new Object[]{aigVar}, -266185672, 266185672, System.identityHashCode(aigVar)), bigInteger, null, null);
                    byte[] bArr3 = (byte[]) aig.setDividerPadding(new Object[]{aigVar}, -1665078170, 1665078175, System.identityHashCode(aigVar));
                    if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, aduVar2}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                        int i39 = f53375b;
                        int i40 = ((i39 | 117) << 1) - (i39 ^ 117);
                        f53374a = i40 % 128;
                        int i41 = i40 % 2;
                        c(new Object[]{bArr3}, -1116229230, 1116229230, (int) System.currentTimeMillis());
                        int i42 = f53374a;
                        int i43 = (i42 & 19) + (i42 | 19);
                        f53375b = i43 % 128;
                        i10 = 2;
                        int i44 = i43 % 2;
                    } else {
                        i10 = 2;
                    }
                    Object[] objArr2 = new Object[i10];
                    objArr2[0] = setcompounddrawabletintblendmode;
                    objArr2[1] = bArr3;
                    angVar = new ang(setcompounddrawabletintblendmode, (apl) aij.setCompoundDrawableTintBlendMode(objArr2, -834321393, 834321394, (int) System.currentTimeMillis()), (BigInteger) aig.setDividerPadding(new Object[]{aigVar}, -2037262492, 2037262494, System.identityHashCode(aigVar)));
                    int i45 = f53374a;
                    int i46 = i45 & 87;
                    int i47 = -(-((i45 ^ 87) | i46));
                    int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                    f53375b = i48 % 128;
                    i11 = 2;
                    int i49 = i48 % 2;
                }
                Object[] objArr3 = new Object[i11];
                objArr3[0] = (aph) ang.setOnFocusChangeListener(new Object[]{angVar}, 1031463732, -1031463726, System.identityHashCode(angVar));
                objArr3[1] = bArr;
                anl anlVar = new anl((apl) aij.setCompoundDrawableTintBlendMode(objArr3, -834321393, 834321394, (int) System.currentTimeMillis()), angVar);
                int i50 = f53374a;
                int i51 = ((i50 ^ 13) | (i50 & 13)) << 1;
                int i52 = -(((~i50) & 13) | (i50 & (-14)));
                int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                f53375b = i53 % 128;
                int i54 = i53 % 2;
                return anlVar;
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering DSTU public key");
            }
        }

        public static /* synthetic */ Object c(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~((~i10) | i11);
            int i14 = ~i11;
            int i15 = ~(i10 | i14);
            if (((i15 | (~(i14 | (~i12))) | i13) * 262) + (i15 * (-786)) + ((i13 | i15 | (~(i14 | i12))) * 262) + (i11 * 263) + (i10 * (-523)) == 1) {
                return b(objArr);
            }
            int i16 = 0;
            byte[] bArr = (byte[]) objArr[0];
            int i17 = f53374a;
            int i18 = i17 & 91;
            int i19 = i18 + ((i17 ^ 91) | i18);
            f53375b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = i17 + 37;
            f53375b = i21 % 128;
            int i22 = i21 % 2;
            while (i16 < bArr.length / 2) {
                int i23 = f53374a;
                int i24 = i23 & 5;
                int i25 = (((i23 ^ 5) | i24) << 1) - ((i23 | 5) & (~i24));
                f53375b = i25 % 128;
                int i26 = i25 % 2;
                byte b10 = bArr[i16];
                int length = ((-1) << 1) - (bArr.length ^ (-1));
                int i27 = -i16;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i28 = i27 * (-574);
                int i29 = length * (-574);
                int i30 = i28 & i29;
                int i31 = ((i28 ^ i29) | i30) << 1;
                int i32 = -((i28 | i29) & (~i30));
                int i33 = (i31 & i32) + (i32 | i31);
                int i34 = ~i27;
                int i35 = ~iCurrentTimeMillis;
                int i36 = i34 ^ i35;
                int i37 = i34 & i35;
                int i38 = ~((i36 & i37) | (i36 ^ i37));
                int i39 = ~length;
                int i40 = i39 & iCurrentTimeMillis;
                int i41 = (~i40) & (i39 | iCurrentTimeMillis);
                int i42 = ~((i41 ^ i40) | (i41 & i40));
                int i43 = i38 ^ i42;
                int i44 = i38 & i42;
                int i45 = (((i43 & i44) | (i43 ^ i44)) * 1150) + i33;
                int i46 = i39 & i35;
                int i47 = ((~i39) & iCurrentTimeMillis) | i46;
                int i48 = ~((i47 & i40) | (i47 ^ i40));
                int i49 = i46 | ((~i35) & length);
                int i50 = length & i35;
                int i51 = (i50 & i49) | (i49 ^ i50);
                int i52 = ~i51;
                int i53 = (((i51 | i52) & i52) | i48) * (-575);
                int i54 = i45 & i53;
                int i55 = (((i45 ^ i53) | i54) << 1) - ((i53 | i45) & (~i54));
                int i56 = ((~i34) & iCurrentTimeMillis) | i37;
                int i57 = i34 & iCurrentTimeMillis;
                int i58 = ~((i56 & i57) | (i56 ^ i57));
                int i59 = (iCurrentTimeMillis | i35) & i35;
                int i60 = i59 & i27;
                int i61 = ((i27 | i59) & (~i60)) | i60;
                int i62 = ~i61;
                int i63 = (i61 | i62) & i62;
                int i64 = -(~(-(-(((i63 & i58) | (i58 ^ i63)) * 575))));
                bArr[i16] = bArr[(((i55 | i64) << 1) - (i64 ^ i55)) - 1];
                int length2 = bArr.length;
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i65 = length2 * 713;
                int i66 = (711 & i65) + (i65 | 711);
                int i67 = ~length2;
                int i68 = ~i67;
                int i69 = ~((i68 ^ i67) | (i68 & i67));
                int i70 = ~iCurrentTimeMillis2;
                int i71 = (i70 | iCurrentTimeMillis2) & i70;
                int i72 = ~i71;
                int i73 = (i71 & i72) | (i72 ^ i71);
                int i74 = ~i73;
                int i75 = (i73 | i74) & i74;
                int i76 = i69 & i75;
                int i77 = (i69 | i75) & (~i76);
                int i78 = ((i77 & i76) | (i77 ^ i76)) * (-712);
                int i79 = i66 & i78;
                int i80 = -(-((i66 ^ i78) | i79));
                int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                int i82 = i67 ^ i70;
                int i83 = i70 & i67;
                int i84 = (i82 & i83) | (i82 ^ i83);
                int i85 = ~i84;
                int i86 = ~((i84 & i85) | (i85 ^ i84));
                int i87 = length2 | ((-1) ^ length2);
                int i88 = i87 & iCurrentTimeMillis2;
                int i89 = (i87 | iCurrentTimeMillis2) & (~i88);
                int i90 = ~((i89 & i88) | (i89 ^ i88));
                int i91 = ((i90 & i86) | ((~i90) & i86) | ((~i86) & i90)) * (-712);
                int i92 = ((~i91) & i81) | ((~i81) & i91);
                int i93 = -(-((i91 & i81) << 1));
                int i94 = ((i92 | i93) << 1) - (i93 ^ i92);
                int i95 = ((~i75) & i67) | (i75 & i68);
                int i96 = i67 & i75;
                int i97 = ((i95 & i96) | (i95 ^ i96)) * 712;
                int i98 = i94 & i97;
                int i99 = (i97 | i94) & (~i98);
                int i100 = i98 << 1;
                int i101 = ((i99 ^ i100) + ((i99 & i100) << 1)) - i34;
                bArr[(i101 ^ (-1)) + (i101 << 1)] = b10;
                int i102 = (i16 ^ (-71)) + ((i16 & (-71)) << 1);
                i16 = (i102 ^ 72) + ((i102 & 72) << 1);
                int i103 = f53374a;
                int i104 = (((i103 & (-126)) | ((~i103) & 125)) - (~(-(-((i103 & 125) << 1))))) - 1;
                f53375b = i104 % 128;
                int i105 = i104 % 2;
            }
            int i106 = f53374a;
            int i107 = i106 & 77;
            int i108 = ((i106 ^ 77) | i107) << 1;
            int i109 = -((i106 | 77) & (~i107));
            int i110 = (i108 & i109) + (i109 | i108);
            f53375b = i110 % 128;
            int i111 = i110 % 2;
            return null;
        }

        @Override // com.mypinpad.tsdk.i.anz.k
        public final amw a(ajj ajjVar) throws IOException {
            return (amw) c(new Object[]{this, ajjVar, null}, 1228798287, -1228798286, System.identityHashCode(this));
        }
    }

    public static class j extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f53376a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53377b = 1;

        @Override // com.mypinpad.tsdk.i.anz.k
        public final amw a(ajj ajjVar) {
            int i10;
            int i11 = 1;
            int i12 = 2;
            Object[] objArr = {this, ajjVar, null};
            System.identityHashCode(this);
            j jVar = (j) objArr[0];
            ajj ajjVar2 = (ajj) objArr[1];
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            adu aduVar = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar));
            ahh ahhVar = (ahh) ahh.setOnFocusChangeListener(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -513456911, 513456913, System.identityHashCode(aiwVar))}, 1278117974, -1278117974, (int) System.currentTimeMillis());
            adu aduVar2 = (adu) ahh.setOnFocusChangeListener(new Object[]{ahhVar}, -371706487, 371706491, System.identityHashCode(ahhVar));
            ane aneVar = new ane(new ank(aduVar2, agz.setY(aduVar2)), aduVar2, (adu) ahh.setOnFocusChangeListener(new Object[]{ahhVar}, 622724280, -622724278, System.identityHashCode(ahhVar)), (adu) ahh.setOnFocusChangeListener(new Object[]{ahhVar}, -1501399272, 1501399273, System.identityHashCode(ahhVar)));
            try {
                ads adsVar = (ads) ((ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2)));
                int i13 = f53376a;
                int i14 = i13 & 15;
                int i15 = (((i13 | 15) & (~i14)) - (~(i14 << 1))) - 1;
                f53377b = i15 % 128;
                int i16 = i15 % 2;
                if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, aia.setY}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                    i10 = 32;
                } else {
                    int i17 = f53376a;
                    int i18 = i17 & 7;
                    int i19 = -(-(i17 | 7));
                    int i20 = (i18 & i19) + (i18 | i19);
                    f53377b = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = ((i17 & 109) - (~(-(-(i17 | 109))))) - 1;
                    f53377b = i22 % 128;
                    int i23 = i22 % 2;
                    i10 = 64;
                }
                int i24 = i10 * 2;
                byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
                if (bArr.length != i24) {
                    throw new IllegalArgumentException("invalid length for GOST3410_2012 public key");
                }
                int i25 = i24 & 1;
                byte[] bArr2 = new byte[((~i25) & (i24 | 1)) + (i25 << 1)];
                bArr2[0] = 4;
                int i26 = f53377b + 41;
                f53376a = i26 % 128;
                int i27 = i26 % 2;
                int i28 = 1;
                while (i28 <= i10) {
                    int i29 = f53376a;
                    int i30 = (i29 & 87) + (i29 | 87);
                    f53377b = i30 % 128;
                    int i31 = i30 % i12;
                    int i32 = -i28;
                    int iIdentityHashCode = System.identityHashCode(jVar);
                    int i33 = i32 * 465;
                    int i34 = -(-(i10 * (-463)));
                    int i35 = i33 & i34;
                    int i36 = i35 + ((i33 ^ i34) | i35);
                    int i37 = ~i10;
                    int i38 = ~iIdentityHashCode;
                    int i39 = i37 & i38;
                    int i40 = ~(i39 | ((~i39) & (i37 | i38)));
                    int i41 = (i37 ^ i32) | (i37 & i32);
                    int i42 = ~i41;
                    int i43 = (i41 | i42) & i42;
                    int i44 = i40 ^ i43;
                    int i45 = i40 & i43;
                    int i46 = (i44 & i45) | (i44 ^ i45);
                    int i47 = i38 & i32;
                    int i48 = (~i47) & (i38 | i32);
                    int i49 = ~i32;
                    int i50 = ~((i48 ^ i47) | (i47 & i48));
                    int i51 = ((i46 & i50) | (i46 ^ i50)) * 464;
                    int i52 = ((i36 | i51) << 1) - (i51 ^ i36);
                    int i53 = iIdentityHashCode | i49;
                    int i54 = i53 & i37;
                    int i55 = (i53 | i37) & (~i54);
                    int i56 = ((i55 & i54) | (i55 ^ i54)) * (-464);
                    int i57 = i52 ^ i56;
                    int i58 = -(-((i56 & i52) << 1));
                    int i59 = (i57 & i58) + (i58 | i57);
                    int i60 = i32 ^ iIdentityHashCode;
                    int i61 = i32 & iIdentityHashCode;
                    int i62 = (i60 & i61) | (i60 ^ i61);
                    int i63 = ~i62;
                    int i64 = (i62 | i63) & i63;
                    bArr2[i28] = bArr[(((i64 & i42) | (i42 ^ i64)) * 464) + i59];
                    int i65 = -(-i10);
                    int i66 = i28 & i65;
                    int i67 = -(-((i65 ^ i28) | i66));
                    int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                    int iIdentityHashCode2 = System.identityHashCode(jVar);
                    int i69 = i32 * (-391);
                    int i70 = -(-(i10 * (-390)));
                    int i71 = i69 ^ i70;
                    int i72 = (i69 & i70) << 1;
                    int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                    int i74 = ~i24;
                    int i75 = i74 ^ i32;
                    int i76 = i74 & i32;
                    int i77 = ~((i75 & i76) | (i75 ^ i76));
                    int i78 = ~((iIdentityHashCode2 & i24) | (i24 ^ iIdentityHashCode2));
                    int i79 = i77 & i78;
                    int i80 = -(-((((i77 | i78) & (~i79)) | i79) * (-196)));
                    int i81 = (i73 ^ i80) + ((i80 & i73) << 1);
                    int i82 = i32 & i24;
                    int i83 = (i32 | i24) & (~i82);
                    int i84 = -(-(((i82 & i83) | (i83 ^ i82)) * 392));
                    int i85 = i81 ^ i84;
                    int i86 = (i84 & i81) << 1;
                    int i87 = (i85 & i86) + (i86 | i85);
                    int i88 = (i74 & i49) | ((~i74) & i49) | ((~i49) & i74);
                    int i89 = ~i88;
                    int i90 = -(-((i78 | ((i88 | i89) & i89)) * 196));
                    int i91 = i87 & i90;
                    bArr2[i68] = bArr[(i91 - (~((i90 ^ i87) | i91))) - 1];
                    int i92 = (i28 & (-2)) | ((~i28) & 1);
                    int i93 = (i28 & 1) << 1;
                    i28 = ((i92 | i93) << 1) - (i92 ^ i93);
                    int i94 = f53377b;
                    int i95 = i94 & 99;
                    int i96 = (((i94 | 99) & (~i95)) - (~(i95 << 1))) - 1;
                    f53376a = i96 % 128;
                    int i97 = i96 % 2;
                    i12 = 2;
                    i11 = 1;
                }
                int i98 = i11;
                Object[] objArr2 = new Object[i98];
                objArr2[0] = aneVar;
                aph aphVar = (aph) ang.setOnFocusChangeListener(objArr2, 1031463732, -1031463726, System.identityHashCode(aneVar));
                Object[] objArr3 = new Object[i12];
                objArr3[0] = aphVar;
                objArr3[i98] = bArr2;
                anl anlVar = new anl((apl) aph.setX(objArr3, 390612441, -390612434, System.identityHashCode(aphVar)), aneVar);
                int i99 = f53376a;
                int i100 = (i99 ^ 3) + ((i99 & 3) << 1);
                f53377b = i100 % 128;
                int i101 = i100 % 2;
                return anlVar;
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering GOST3410_2012 public key");
            }
        }
    }

    public static abstract class k {
        public abstract amw a(ajj ajjVar) throws IOException;
    }

    public static class l extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f53378a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53379b = 1;

        @Override // com.mypinpad.tsdk.i.anz.k
        public final amw a(ajj ajjVar) throws IOException {
            BigInteger bigInteger;
            amz amzVar;
            Object[] objArr = {this, ajjVar, null};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            int i10 = f53379b;
            int i11 = (i10 & (-8)) | ((~i10) & 7);
            int i12 = (i10 & 7) << 1;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f53378a = i13 % 128;
            if (i13 % 2 != 0) {
                aju ajuVar = (aju) aju.setCompoundDrawableTintBlendMode(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, -758499763, 758499763, (int) System.currentTimeMillis());
                aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
                ajs ajsVar = (ajs) ajs.setY(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -513456911, 513456913, System.identityHashCode(aiwVar))}, -532838143, 532838145, (int) System.currentTimeMillis());
                throw null;
            }
            aju ajuVar2 = (aju) aju.setCompoundDrawableTintBlendMode(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, -758499763, 758499763, (int) System.currentTimeMillis());
            BigInteger bigInteger2 = (BigInteger) aju.setCompoundDrawableTintBlendMode(new Object[]{ajuVar2}, 323505899, -323505898, System.identityHashCode(ajuVar2));
            aiw aiwVar2 = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            ajs ajsVar2 = (ajs) ajs.setY(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -513456911, 513456913, System.identityHashCode(aiwVar2))}, -532838143, 532838145, (int) System.currentTimeMillis());
            BigInteger bigInteger3 = (BigInteger) ajs.setY(new Object[]{ajsVar2}, -327654908, 327654911, System.identityHashCode(ajsVar2));
            BigInteger bigInteger4 = (BigInteger) ajs.setY(new Object[]{ajsVar2}, -860916433, 860916438, System.identityHashCode(ajsVar2));
            BigInteger bigInteger5 = (BigInteger) ajs.setY(new Object[]{ajsVar2}, 1670427418, -1670427414, System.identityHashCode(ajsVar2));
            if (((BigInteger) ajs.setY(new Object[]{ajsVar2}, -171671074, 171671074, System.identityHashCode(ajsVar2))) != null) {
                int i14 = f53378a;
                int i15 = i14 & 99;
                int i16 = (i14 | 99) & (~i15);
                int i17 = -(-(i15 << 1));
                int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
                f53379b = i18 % 128;
                int i19 = i18 % 2;
                BigInteger bigInteger6 = (BigInteger) ajs.setY(new Object[]{ajsVar2}, -171671074, 171671074, System.identityHashCode(ajsVar2));
                int i20 = f53379b;
                int i21 = i20 ^ 79;
                int i22 = ((i20 & 79) | i21) << 1;
                int i23 = -i21;
                int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                f53378a = i24 % 128;
                int i25 = i24 % 2;
                bigInteger = bigInteger6;
            } else {
                bigInteger = null;
            }
            ajt ajtVar = (ajt) ajs.setY(new Object[]{ajsVar2}, -2133152458, 2133152464, System.identityHashCode(ajsVar2));
            if (ajtVar != null) {
                amz amzVar2 = new amz((byte[]) ajt.setCompoundDrawableTintBlendMode(new Object[]{ajtVar}, -183474119, 183474122, System.identityHashCode(ajtVar)), ((BigInteger) ajt.setCompoundDrawableTintBlendMode(new Object[]{ajtVar}, -212392432, 212392434, System.identityHashCode(ajtVar))).intValue());
                int i26 = f53378a;
                int i27 = ((i26 ^ 44) + ((i26 & 44) << 1)) - 1;
                f53379b = i27 % 128;
                int i28 = i27 % 2;
                amzVar = amzVar2;
            } else {
                amzVar = null;
            }
            anb anbVar = new anb(bigInteger2, new ana(bigInteger3, bigInteger4, bigInteger5, bigInteger, amzVar));
            int i29 = f53378a;
            int i30 = (i29 ^ 101) + ((i29 & 101) << 1);
            f53379b = i30 % 128;
            int i31 = i30 % 2;
            return anbVar;
        }
    }

    public static class m extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f53380a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53381b = 1;

        @Override // com.mypinpad.tsdk.i.anz.k
        public final amw a(ajj ajjVar) throws IOException {
            anh anhVar;
            Object[] objArr = {this, ajjVar, null};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            int i10 = f53381b + 75;
            f53380a = i10 % 128;
            if (i10 % 2 != 0) {
                aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
                throw null;
            }
            adp adpVar = (adp) ((ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2)));
            aiw aiwVar2 = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            add addVar = (add) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -513456911, 513456913, System.identityHashCode(aiwVar2));
            if (addVar != null) {
                aiz aizVar = (aiz) aiz.setOnFocusChangeListener(new Object[]{addVar.UiMessageCallbackKtWhenMappings()}, -845573931, 845573934, (int) System.currentTimeMillis());
                anhVar = new anh(aizVar.setCompoundDrawableTintBlendMode(), aizVar.setOnFocusChangeListener(), aizVar.setDividerPadding());
                int i11 = f53380a + 1;
                f53381b = i11 % 128;
                int i12 = i11 % 2;
            } else {
                anhVar = null;
            }
            and andVar = new and(adpVar.setCompoundDrawableTintBlendMode(), anhVar);
            int i13 = f53381b;
            int i14 = ((i13 ^ 79) | (i13 & 79)) << 1;
            int i15 = -(((~i13) & 79) | (i13 & (-80)));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            f53380a = i16 % 128;
            if (i16 % 2 == 0) {
                return andVar;
            }
            throw null;
        }
    }

    public static class n extends k {
        @Override // com.mypinpad.tsdk.i.anz.k
        public final amw a(ajj ajjVar) {
            Object[] objArr = {this, ajjVar, null};
            System.identityHashCode(this);
            return new anx(anz.a((ajj) objArr[1]));
        }
    }

    static {
        HashMap map = new HashMap();
        f53365a = map;
        map.put(ahv.setX, new a());
        map.put(ahv.setY, new a());
        map.put(ajr.setOnFocusChangeListener, new a());
        map.put(akf.getPreferredLanguage, new l());
        map.put(ahv.setDividerPadding, new c());
        map.put(akf.getError, new m());
        map.put(ahr.setY, new m());
        map.put(ahr.setOnFocusChangeListener, new g());
        map.put(akf.setLayoutAnimation, new d());
        map.put(aha.setCompoundDrawableTintBlendMode, new b());
        map.put(aia.setX, new j());
        map.put(aia.setY, new j());
        map.put(aik.setOnFocusChangeListener, new i());
        map.put(aik.setX, new i());
        map.put(ahe.setDividerPadding, new n());
        map.put(ahe.setY, new e());
        map.put(ahe.setOnFocusChangeListener, new h());
        map.put(ahe.setX, new f());
        int i10 = f53367c;
        int i11 = i10 & 35;
        int i12 = ((i10 ^ 35) | i11) << 1;
        int i13 = -((i10 | 35) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f53366b = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 74 / 0;
        }
    }

    public static /* synthetic */ byte[] a(ajj ajjVar) {
        return (byte[]) setX(new Object[]{ajjVar}, 430622170, -430622166, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c4, code lost:
    
        if (r5 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c7, code lost:
    
        if (r5 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
    
        if (r5.length == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cc, code lost:
    
        r5 = (com.mypinpad.tsdk.isolation.amw) setX(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.ajj) com.mypinpad.tsdk.isolation.ajj.setCompoundDrawableTintBlendMode(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.ady) com.mypinpad.tsdk.isolation.ady.setNavigationOnClickListener(new java.lang.Object[]{r5}, -1692126728, 1692126730, (int) java.lang.System.currentTimeMillis())}, 909154525, -909154522, (int) java.lang.System.currentTimeMillis())}, 1097946459, -1097946457, (int) java.lang.System.currentTimeMillis());
        r6 = com.mypinpad.tsdk.isolation.anz.f53367c;
        r0 = r6 & 87;
        r7 = ((r6 ^ 87) | r0) << 1;
        r6 = -((r6 | 87) & (~r0));
        r8 = (r7 & r6) + (r6 | r7);
        com.mypinpad.tsdk.isolation.anz.f53366b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x012b, code lost:
    
        throw new java.lang.IllegalArgumentException("keyInfoData array empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0133, code lost:
    
        throw new java.lang.IllegalArgumentException("keyInfoData array null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0154, code lost:
    
        if (r5 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0157, code lost:
    
        if (r5 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0159, code lost:
    
        r5 = (com.mypinpad.tsdk.isolation.amw) setX(new java.lang.Object[]{r5}, -413038935, 413038936, (int) java.lang.System.currentTimeMillis());
        r6 = com.mypinpad.tsdk.isolation.anz.f53367c;
        r7 = ((r6 | 57) << 1) - (r6 ^ 57);
        com.mypinpad.tsdk.isolation.anz.f53366b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x017c, code lost:
    
        if ((r7 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x017f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0185, code lost:
    
        throw new java.lang.IllegalArgumentException("keyInfo argument null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r5, int r6, int r7, int r8) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.anz.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static amw setY(byte[] bArr) throws IOException {
        return (amw) setX(new Object[]{bArr}, -2118765618, 2118765621, (int) System.currentTimeMillis());
    }
}
