package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aed extends ady implements bem {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final b f52528u0 = new b(aed.class, 16);
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52529w0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public add[] f52530t0;

    public class a implements Enumeration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f52531c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f52532d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ aed f52534b;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0097, code lost:
        
            if (r9.f52533a < r9.f52534b.f52530t0.length) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0099, code lost:
        
            r10 = com.mypinpad.tsdk.i.aed.a.f52531c;
            r11 = r10 & 107;
            r10 = r10 | 107;
            r0 = (r11 & r10) + (r10 | r11);
            com.mypinpad.tsdk.i.aed.a.f52532d = r0 % 128;
            r0 = r0 % 2;
            r10 = r9.f52534b.f52530t0;
            r11 = r9.f52533a;
            r0 = java.lang.System.identityHashCode(r9);
            r1 = -(-(r11 * (-590)));
            r3 = (592 & r1) + (r1 | 592);
            r1 = ~r11;
            r5 = r11 & 1;
            r4 = ((-2) & r1) | r5;
            r6 = (-2) & r11;
            r4 = (~((r4 & r6) | (r4 ^ r6))) * (-1182);
            r6 = r3 & r4;
            r3 = (r3 ^ r4) | r6;
            r4 = (r6 ^ r3) + ((r3 & r6) << 1);
            r3 = (r1 | r11) & r1;
            r6 = (-2) & r3;
            r3 = (r3 | (-2)) & (~r6);
            r3 = (r3 & r6) | (r3 ^ r6);
            r6 = ~r0;
            r7 = r3 & r6;
            r3 = ~(((r3 | r6) & (~r7)) | r7);
            r5 = r5 | (r11 ^ 1);
            r6 = ~r5;
            r5 = (r5 | r6) & r6;
            r6 = ((~r5) & r3) | ((~r3) & r5);
            r3 = r3 & r5;
            r3 = ((r3 & r6) | (r6 ^ r3)) * (-591);
            r5 = r4 ^ r3;
            r3 = -(-((r3 & r4) << 1));
            r4 = (r5 ^ r3) + ((r3 & r5) << 1);
            r3 = r0 & (-2);
            r0 = (r0 | (-2)) & (~r3);
            r0 = (r0 & r3) | (r0 ^ r3);
            r2 = ((~r1) & r0) | ((~r0) & r1);
            r0 = r0 & r1;
            r0 = ((r0 & r2) | (r2 ^ r0)) * 591;
            r1 = ((r4 ^ r0) | (r4 & r0)) << 1;
            r0 = -((r0 & (~r4)) | ((~r0) & r4));
            r9.f52533a = (r1 & r0) + (r0 | r1);
            r9 = r10[r11];
            r10 = com.mypinpad.tsdk.i.aed.a.f52532d;
            r11 = ((r10 | 19) << 1) - (r10 ^ 19);
            com.mypinpad.tsdk.i.aed.a.f52531c = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0144, code lost:
        
            throw new java.util.NoSuchElementException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x008d, code lost:
        
            if (r9.f52533a < r9.f52534b.f52530t0.length) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object a(java.lang.Object[] r9, int r10, int r11, int r12) {
            /*
                Method dump skipped, instruction units count: 384
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.aed.a.a(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return ((Boolean) a(new Object[]{this}, -662614533, 662614534, System.identityHashCode(this))).booleanValue();
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return a(new Object[]{this}, 1815657741, -1815657741, System.identityHashCode(this));
        }
    }

    public static class b extends j0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52535f = 1;

        @Override // com.mypinpad.tsdk.isolation.j0
        public final ady d(aed aedVar) {
            Object[] objArr = {this, aedVar};
            System.identityHashCode(this);
            aed aedVar2 = (aed) objArr[1];
            int i10 = f52535f + 79;
            int i11 = i10 % 128;
            if (i10 % 2 != 0) {
                int i12 = 70 / 0;
            }
            int i13 = i11 & 49;
            int i14 = -(-((i11 ^ 49) | i13));
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            f52535f = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 80 / 0;
            }
            return aedVar2;
        }
    }

    static {
        int i10 = f52529w0;
        int i11 = (i10 | 7) << 1;
        int i12 = -(((~i10) & 7) | (i10 & (-8)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        v0 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 60 / 0;
        }
    }

    public aed(add[] addVarArr, int i10) {
        this.f52530t0 = addVarArr;
    }

    public static aed setOnFocusChangeListener(aeh aehVar, boolean z10) {
        return (aed) setY(new Object[]{aehVar, Boolean.valueOf(z10)}, 113370947, -113370947, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (~i12) | i13;
        int i15 = (((~i14) | i10) * 226) + (i11 * (-112)) + (i10 * (-112));
        int i16 = ~i10;
        int i17 = ((~(i13 | i12)) * 113) + (((~(i10 | i14)) | (~(i11 | i16)) | (~(i16 | i12))) * (-113)) + i15;
        int i18 = 0;
        if (i17 == 1) {
            Object obj = objArr[0];
            int i19 = v0;
            int i20 = i19 & 123;
            int i21 = i20 + ((i19 ^ 123) | i20);
            int i22 = i21 % 128;
            f52529w0 = i22;
            int i23 = i21 % 2;
            if (obj != null) {
                int i24 = i22 + 111;
                int i25 = i24 % 128;
                v0 = i25;
                int i26 = i24 % 2;
                if (!(obj instanceof aed)) {
                    if (obj instanceof add) {
                        int i27 = (i25 & (-24)) | ((~i25) & 23);
                        int i28 = -(-((i25 & 23) << 1));
                        int i29 = (i27 & i28) + (i27 | i28);
                        f52529w0 = i29 % 128;
                        int i30 = i29 % 2;
                        ady adyVarUiMessageCallbackKtWhenMappings = ((add) obj).UiMessageCallbackKtWhenMappings();
                        if (adyVarUiMessageCallbackKtWhenMappings instanceof aed) {
                            int i31 = v0;
                            int i32 = i31 & 111;
                            int i33 = i31 | 111;
                            int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                            f52529w0 = i34 % 128;
                            int i35 = i34 % 2;
                            aed aedVar = (aed) adyVarUiMessageCallbackKtWhenMappings;
                            int i36 = i31 & 103;
                            int i37 = (i31 | 103) & (~i36);
                            int i38 = -(-(i36 << 1));
                            int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                            f52529w0 = i39 % 128;
                            if (i39 % 2 != 0) {
                                return aedVar;
                            }
                            throw null;
                        }
                        int i40 = f52529w0;
                        int i41 = (-2) - (((i40 & 50) + (i40 | 50)) ^ (-1));
                        v0 = i41 % 128;
                        int i42 = i41 % 2;
                    } else if (!(!(obj instanceof byte[]))) {
                        int i43 = i25 & 27;
                        int i44 = -(-((i25 ^ 27) | i43));
                        int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                        f52529w0 = i45 % 128;
                        int i46 = i45 % 2;
                        try {
                            b bVar = f52528u0;
                            aed aedVar2 = (aed) j0.c(-1221427223, 1221427224, System.identityHashCode(bVar), new Object[]{bVar, (byte[]) obj});
                            int i47 = v0;
                            int i48 = i47 & 85;
                            int i49 = (i48 - (~((i47 ^ 85) | i48))) - 1;
                            f52529w0 = i49 % 128;
                            if (i49 % 2 != 0) {
                                return aedVar2;
                            }
                            throw null;
                        } catch (IOException e5) {
                            StringBuilder sb2 = new StringBuilder("failed to construct sequence from byte[]: ");
                            sb2.append(e5.getMessage());
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                    throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "unknown object in getInstance: "));
                }
            }
            aed aedVar3 = (aed) obj;
            int i50 = (-2) - ((i22 + 42) ^ (-1));
            v0 = i50 % 128;
            int i51 = i50 % 2;
            return aedVar3;
        }
        if (i17 == 2) {
            aed aedVar4 = (aed) objArr[0];
            int i52 = f52529w0;
            int i53 = ((i52 | 113) << 1) - (i52 ^ 113);
            v0 = i53 % 128;
            int i54 = i53 % 2;
            int compoundDrawableTintBlendMode = aedVar4.setCompoundDrawableTintBlendMode();
            ads[] adsVarArr = new ads[compoundDrawableTintBlendMode];
            int i55 = v0 + 85;
            f52529w0 = i55 % 128;
            int i56 = i55 % 2;
            int i57 = 0;
            while (i57 < compoundDrawableTintBlendMode) {
                int i58 = f52529w0;
                int i59 = i58 ^ 59;
                int i60 = (((i58 & 59) | i59) << 1) - i59;
                v0 = i60 % 128;
                if (i60 % 2 != 0) {
                    adsVarArr[i57] = (ads) ads.setDividerPadding(new Object[]{aedVar4.f52530t0[i57]}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                    int i61 = i57 & 186;
                    int i62 = -(-((i57 ^ 186) | i61));
                    int i63 = (((i61 | i62) << 1) - (i62 ^ i61)) - 113;
                    i57 = (i63 ^ (-1)) + (i63 << 1);
                } else {
                    adsVarArr[i57] = (ads) ads.setDividerPadding(new Object[]{aedVar4.f52530t0[i57]}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                    i57++;
                }
            }
            int i64 = v0;
            int i65 = i64 & 69;
            int i66 = ((i64 | 69) & (~i65)) + (i65 << 1);
            f52529w0 = i66 % 128;
            int i67 = i66 % 2;
            return adsVarArr;
        }
        if (i17 == 3) {
            int i68 = f52529w0;
            int i69 = i68 & 47;
            int i70 = (i68 ^ 47) | i69;
            int i71 = (i69 ^ i70) + ((i69 & i70) << 1);
            v0 = i71 % 128;
            int i72 = i71 % 2;
            int i73 = i68 & 55;
            int i74 = -(-(i68 | 55));
            int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
            v0 = i75 % 128;
            int i76 = i75 % 2;
            return Boolean.TRUE;
        }
        if (i17 == 4) {
            aed aedVar5 = (aed) objArr[0];
            int i77 = v0;
            int i78 = i77 & 109;
            int i79 = i77 | 109;
            int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
            f52529w0 = i80 % 128;
            int i81 = i80 % 2;
            int compoundDrawableTintBlendMode2 = aedVar5.setCompoundDrawableTintBlendMode();
            acz[] aczVarArr = new acz[compoundDrawableTintBlendMode2];
            int i82 = v0 + 99;
            f52529w0 = i82 % 128;
            int i83 = i82 % 2;
            int i84 = 0;
            while (i84 < compoundDrawableTintBlendMode2) {
                int i85 = f52529w0;
                int i86 = (i85 ^ 47) + ((i85 & 47) << 1);
                v0 = i86 % 128;
                int i87 = i86 % 2;
                aczVarArr[i84] = (acz) acz.setDividerPadding(new Object[]{aedVar5.f52530t0[i84]}, 1095238957, -1095238954, (int) System.currentTimeMillis());
                int i88 = ((i84 ^ 1) | (i84 & 1)) << 1;
                int i89 = -(((~i84) & 1) | (i84 & (-2)));
                i84 = ((i89 & i88) << 1) + (i88 ^ i89);
                int i90 = v0;
                int i91 = ((i90 & (-74)) | ((~i90) & 73)) + ((i90 & 73) << 1);
                f52529w0 = i91 % 128;
                int i92 = i91 % 2;
            }
            int i93 = f52529w0;
            int i94 = ((i93 & 26) + (i93 | 26)) - 1;
            v0 = i94 % 128;
            if (i94 % 2 == 0) {
                return aczVarArr;
            }
            throw null;
        }
        if (i17 != 5) {
            aeh aehVar = (aeh) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            int i95 = f52529w0;
            int i96 = (((i95 & (-26)) | ((~i95) & 25)) - (~((i95 & 25) << 1))) - 1;
            v0 = i96 % 128;
            int i97 = i96 % 2;
            b bVar2 = f52528u0;
            aed aedVar6 = (aed) j0.c(-1072042084, 1072042084, System.identityHashCode(bVar2), new Object[]{bVar2, aehVar, Boolean.valueOf(zBooleanValue)});
            int i98 = v0;
            int i99 = i98 & 75;
            int i100 = (i98 | 75) & (~i99);
            int i101 = i99 << 1;
            int i102 = (i100 & i101) + (i101 | i100);
            f52529w0 = i102 % 128;
            int i103 = i102 % 2;
            return aedVar6;
        }
        aed aedVar7 = (aed) objArr[0];
        ady adyVar = (ady) objArr[1];
        int i104 = f52529w0;
        int i105 = i104 & 45;
        int i106 = -(-((i104 ^ 45) | i105));
        int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
        int i108 = i107 % 128;
        v0 = i108;
        int i109 = i107 % 2;
        if (!(adyVar instanceof aed)) {
            int i110 = i108 & 37;
            int i111 = ((((i108 ^ 37) | i110) << 1) - (~(-((~i110) & (i108 | 37))))) - 1;
            f52529w0 = i111 % 128;
            boolean z10 = i111 % 2 == 0;
            int i112 = ((i108 & 42) + (i108 | 42)) - 1;
            f52529w0 = i112 % 128;
            if (i112 % 2 != 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        aed aedVar8 = (aed) adyVar;
        int compoundDrawableTintBlendMode3 = aedVar7.setCompoundDrawableTintBlendMode();
        if (aedVar8.setCompoundDrawableTintBlendMode() == compoundDrawableTintBlendMode3) {
            int i113 = v0;
            int i114 = i113 & 7;
            int i115 = -(-((i113 ^ 7) | i114));
            int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
            f52529w0 = i116 % 128;
            int i117 = i116 % 2;
            while (i18 < compoundDrawableTintBlendMode3) {
                int i118 = v0;
                int i119 = (((i118 ^ 7) | (i118 & 7)) << 1) - (((~i118) & 7) | (i118 & (-8)));
                f52529w0 = i119 % 128;
                int i120 = i119 % 2;
                ady adyVarUiMessageCallbackKtWhenMappings2 = aedVar7.f52530t0[i18].UiMessageCallbackKtWhenMappings();
                ady adyVarUiMessageCallbackKtWhenMappings3 = aedVar8.f52530t0[i18].UiMessageCallbackKtWhenMappings();
                if (adyVarUiMessageCallbackKtWhenMappings2 != adyVarUiMessageCallbackKtWhenMappings3) {
                    int i121 = v0;
                    int i122 = (((i121 | 106) << 1) - (i121 ^ 106)) - 1;
                    f52529w0 = i122 % 128;
                    if (i122 % 2 == 0) {
                        adyVarUiMessageCallbackKtWhenMappings2.d(adyVarUiMessageCallbackKtWhenMappings3);
                        throw null;
                    }
                    if (!adyVarUiMessageCallbackKtWhenMappings2.d(adyVarUiMessageCallbackKtWhenMappings3)) {
                        int i123 = v0;
                        int i124 = i123 ^ 91;
                        int i125 = ((((i123 & 91) | i124) << 1) - (~(-i124))) - 1;
                        f52529w0 = i125 % 128;
                        int i126 = i125 % 2;
                        int i127 = i123 + 43;
                        f52529w0 = i127 % 128;
                        int i128 = i127 % 2;
                    }
                }
                i18 = ((i18 | 1) << 1) - (i18 ^ 1);
                int i129 = f52529w0;
                int i130 = (-2) - (((i129 & 70) + (i129 | 70)) ^ (-1));
                v0 = i130 % 128;
                int i131 = i130 % 2;
            }
            int i132 = v0;
            int i133 = (i132 ^ 69) + ((i132 & 69) << 1);
            f52529w0 = i133 % 128;
            int i134 = i133 % 2;
            return Boolean.TRUE;
        }
        int i135 = v0;
        int i136 = ((i135 ^ 30) + ((i135 & 30) << 1)) - 1;
        f52529w0 = i136 % 128;
        int i137 = i136 % 2;
        int i138 = i135 & 23;
        int i139 = (i135 ^ 23) | i138;
        int i140 = ((i138 | i139) << 1) - (i139 ^ i138);
        f52529w0 = i140 % 128;
        if (i140 % 2 == 0) {
            throw null;
        }
        return Boolean.FALSE;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public ady a() {
        agi agiVar = new agi(this.f52530t0);
        int i10 = v0;
        int i11 = i10 & 65;
        int i12 = ((((i10 ^ 65) | i11) << 1) - (~(-((i10 | 65) & (~i11))))) - 1;
        f52529w0 = i12 % 128;
        int i13 = i12 % 2;
        return agiVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setY(new Object[]{this, adyVar}, -1840194529, 1840194534, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public ady e() {
        afv afvVar = new afv(this.f52530t0, 0);
        afvVar.f52607x0 = -1;
        int i10 = v0;
        int i11 = (i10 ^ 71) + ((i10 & 71) << 1);
        f52529w0 = i11 % 128;
        int i12 = i11 % 2;
        return afvVar;
    }

    public final acz[] f() {
        return (acz[]) setY(new Object[]{this}, 50206465, -50206461, System.identityHashCode(this));
    }

    public abstract aee g();

    public abstract ads h();

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = f52529w0;
        int i11 = ((i10 | 10) << 1) - (i10 ^ 10);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        v0 = i12 % 128;
        int i13 = i12 % 2;
        int length = this.f52530t0.length;
        int iIdentityHashCode = System.identityHashCode(this);
        int i14 = length * (-68);
        int i15 = 70 & i14;
        int i16 = (i14 | 70) & (~i15);
        int i17 = -(-(i15 << 1));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        int i19 = ~length;
        int i20 = (-2) ^ i19;
        int i21 = i19 & (-2);
        int i22 = (i21 & i20) | (i20 ^ i21) | iIdentityHashCode;
        int i23 = (i22 | (~i22)) & (~i22);
        int i24 = length & 1;
        int i25 = (~i24) & (length | 1);
        int i26 = ~length;
        int i27 = (i24 & i25) | (i25 ^ i24);
        int i28 = ~((i27 & iIdentityHashCode) | (i27 ^ iIdentityHashCode));
        int i29 = i23 & i28;
        int i30 = (i23 | i28) & (~i29);
        int i31 = ((i30 & i29) | (i30 ^ i29)) * 69;
        int i32 = i18 & i31;
        int i33 = ((i18 ^ i31) | i32) << 1;
        int i34 = -((i31 | i18) & (~i32));
        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
        int i36 = ~(((-2) ^ length) | ((-2) & length));
        int i37 = (-2) & iIdentityHashCode;
        int i38 = ((-2) | iIdentityHashCode) & (~i37);
        int i39 = (i38 & i37) | (i38 ^ i37);
        int i40 = (i39 | (~i39)) & (~i39);
        int i41 = (i36 & i40) | ((~i40) & i36) | ((~i36) & i40);
        int i42 = length & iIdentityHashCode;
        int i43 = ~(((iIdentityHashCode | length) & (~i42)) | i42);
        int i44 = ((i43 & i41) | ((~i43) & i41) | ((~i41) & i43)) * (-69);
        int i45 = ((i35 ^ i44) - (~((i44 & i35) << 1))) - 1;
        int i46 = (~((i26 ^ 1) | (i26 & 1))) * 69;
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        int i48 = f52529w0;
        int i49 = ((i48 | 39) << 1) - (i48 ^ 39);
        while (true) {
            v0 = i49 % 128;
            int i50 = i49 % 2;
            int i51 = length & (-73);
            int i52 = (length | (-73)) & (~i51);
            int i53 = i51 << 1;
            int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
            int i55 = i54 & 72;
            length = (i55 - (~(-(-((i54 ^ 72) | i55))))) - 1;
            if (length < 0) {
                int i56 = f52529w0;
                int i57 = (i56 & 1) + (i56 | 1);
                v0 = i57 % 128;
                int i58 = i57 % 2;
                return i47;
            }
            int i59 = v0;
            int i60 = (i59 & (-34)) | ((~i59) & 33);
            int i61 = -(-((i59 & 33) << 1));
            int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
            f52529w0 = i62 % 128;
            int i63 = i62 % 2;
            int i64 = i47 * 257;
            int iHashCode = this.f52530t0[length].UiMessageCallbackKtWhenMappings().hashCode();
            i47 = (~(i64 & iHashCode)) & (iHashCode | i64);
            int i65 = f52529w0;
            i49 = ((i65 & 118) + (i65 | 118)) - 1;
        }
    }

    public abstract adl i();

    @Override // java.lang.Iterable
    public Iterator<add> iterator() {
        bek.setDividerPadding setdividerpadding = new bek.setDividerPadding(this.f52530t0);
        int i10 = f52529w0;
        int i11 = ((i10 | 85) << 1) - (i10 ^ 85);
        v0 = i11 % 128;
        if (i11 % 2 == 0) {
            return setdividerpadding;
        }
        throw null;
    }

    public final ads[] j() {
        return (ads[]) setY(new Object[]{this}, 786550476, -786550474, System.identityHashCode(this));
    }

    public final add[] k() {
        int i10 = f52529w0;
        int i11 = i10 ^ 53;
        int i12 = (i10 & 53) << 1;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        v0 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        add[] addVarArr = this.f52530t0;
        int i14 = i10 & 41;
        int i15 = ((i10 | 41) & (~i14)) + (i14 << 1);
        v0 = i15 % 128;
        int i16 = i15 % 2;
        return addVarArr;
    }

    public int setCompoundDrawableTintBlendMode() {
        int i10 = f52529w0;
        int i11 = i10 & 65;
        int i12 = (((~i11) & (i10 | 65)) - (~(-(-(i11 << 1))))) - 1;
        v0 = i12 % 128;
        int i13 = i12 % 2;
        int length = this.f52530t0.length;
        int i14 = i10 & 33;
        int i15 = ((i10 | 33) & (~i14)) + (i14 << 1);
        v0 = i15 % 128;
        int i16 = i15 % 2;
        return length;
    }

    public Enumeration setDividerPadding() {
        a aVar = new a();
        aVar.f52534b = this;
        aVar.f52533a = 0;
        int i10 = v0;
        int i11 = ((i10 ^ 106) + ((i10 & 106) << 1)) - 1;
        f52529w0 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 29 / 0;
        }
        return aVar;
    }

    public abstract acz setOnFocusChangeListener();

    public add setX(int i10) {
        int i11 = f52529w0;
        int i12 = i11 + 33;
        v0 = i12 % 128;
        int i13 = i12 % 2;
        add addVar = this.f52530t0[i10];
        int i14 = ((i11 ^ 21) | (i11 & 21)) << 1;
        int i15 = -(((~i11) & 21) | (i11 & (-22)));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        v0 = i16 % 128;
        int i17 = i16 % 2;
        return addVar;
    }

    public String toString() {
        int i10 = v0;
        int i11 = ((i10 | 69) << 1) - (i10 ^ 69);
        f52529w0 = i11 % 128;
        if (i11 % 2 == 0) {
            setCompoundDrawableTintBlendMode();
            throw null;
        }
        int compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode();
        int i12 = 0;
        if (compoundDrawableTintBlendMode == 0) {
            int i13 = f52529w0;
            int i14 = ((i13 ^ 19) | (i13 & 19)) << 1;
            int i15 = -(((~i13) & 19) | (i13 & (-20)));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            int i17 = i16 % 128;
            v0 = i17;
            int i18 = i16 % 2;
            int i19 = i17 & 85;
            int i20 = i19 + ((i17 ^ 85) | i19);
            f52529w0 = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 42 / 0;
            }
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer(Constant.BRACKET_OPEN);
        int i22 = v0;
        int i23 = i22 & 51;
        int i24 = (((i22 ^ 51) | i23) << 1) - ((i22 | 51) & (~i23));
        while (true) {
            f52529w0 = i24 % 128;
            int i25 = i24 % 2;
            stringBuffer.append(this.f52530t0[i12]);
            int i26 = i12 & 27;
            int i27 = (i12 | 27) & (~i26);
            int i28 = i26 << 1;
            int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
            int i30 = i29 & (-26);
            int i31 = (~i30) & (i29 | (-26));
            int i32 = -(-(i30 << 1));
            i12 = (i32 | i31) + (i31 & i32);
            if (i12 >= compoundDrawableTintBlendMode) {
                break;
            }
            int i33 = f52529w0;
            int i34 = ((i33 & 120) + (i33 | 120)) - 1;
            v0 = i34 % 128;
            int i35 = i34 % 2;
            stringBuffer.append(", ");
            int i36 = v0;
            i24 = ((i36 & 68) + (i36 | 68)) - 1;
        }
        stringBuffer.append(AbstractJsonLexerKt.END_LIST);
        String string = stringBuffer.toString();
        int i37 = v0;
        int i38 = i37 & 99;
        int i39 = -(-(i37 | 99));
        int i40 = (i38 & i39) + (i39 | i38);
        f52529w0 = i40 % 128;
        if (i40 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public aed(add[] addVarArr) {
        if (((Boolean) bek.setOnFocusChangeListener(new Object[]{addVarArr}, -1223043475, 1223043478, (int) System.currentTimeMillis())).booleanValue()) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        this.f52530t0 = (add[]) adh.setCompoundDrawableTintBlendMode(new Object[]{addVarArr}, -558945811, 558945816, (int) System.currentTimeMillis());
    }

    public static aed setCompoundDrawableTintBlendMode(Object obj) {
        return (aed) setY(new Object[]{obj}, 691787085, -691787084, (int) System.currentTimeMillis());
    }

    public aed(adh adhVar) {
        if (adhVar == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f52530t0 = (add[]) adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar}, -497700352, 497700355, System.identityHashCode(adhVar));
    }

    public aed(add addVar) {
        if (addVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f52530t0 = new add[]{addVar};
    }

    public aed() {
        this.f52530t0 = adh.f52466d;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setY(new Object[]{this}, 1342407963, -1342407960, System.identityHashCode(this))).booleanValue();
    }
}
