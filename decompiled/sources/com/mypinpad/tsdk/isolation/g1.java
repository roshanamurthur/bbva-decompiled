package com.mypinpad.tsdk.isolation;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g1 extends X509CRL {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f55593u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final aoz f55594p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final aix f55595q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f55596r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f55597s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f55598t0;

    public class a implements e1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f55599c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f55600d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Provider f55601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ g1 f55602b;

        @Override // com.mypinpad.tsdk.isolation.e1
        public final Signature setCompoundDrawableTintBlendMode(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
            Signature signature;
            Object[] objArr = {this, str};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            int i10 = f55600d;
            int i11 = (i10 & 85) + (i10 | 85);
            f55599c = i11 % 128;
            int i12 = i11 % 2;
            Provider provider = aVar.f55601a;
            g1 g1Var = aVar.f55602b;
            if (provider != null) {
                int i13 = (((i10 ^ 35) | (i10 & 35)) << 1) - (((~i10) & 35) | (i10 & (-36)));
                f55599c = i13 % 128;
                int i14 = i13 % 2;
                signature = Signature.getInstance(g1Var.getSigAlgName(), provider);
                if (i14 != 0) {
                    int i15 = 45 / 0;
                }
            } else {
                signature = Signature.getInstance(g1Var.getSigAlgName());
                int i16 = f55599c + 65;
                f55600d = i16 % 128;
                if (i16 % 2 == 0) {
                    throw null;
                }
            }
            return signature;
        }
    }

    public class b implements e1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55603b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f55604c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ String f55605a;

        @Override // com.mypinpad.tsdk.isolation.e1
        public final Signature setCompoundDrawableTintBlendMode(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
            Signature signature;
            Object[] objArr = {this, str};
            System.identityHashCode(this);
            b bVar = (b) objArr[0];
            String str2 = (String) objArr[1];
            int i10 = f55603b;
            int i11 = ((i10 | 39) << 1) - (i10 ^ 39);
            f55604c = i11 % 128;
            int i12 = i11 % 2;
            String str3 = bVar.f55605a;
            if (str3 != null) {
                int i13 = ((i10 | 55) << 1) - (i10 ^ 55);
                f55604c = i13 % 128;
                int i14 = i13 % 2;
                signature = Signature.getInstance(str2, str3);
                if (i14 == 0) {
                    int i15 = 30 / 0;
                }
                int i16 = f55603b;
                int i17 = (i16 & 49) + (i16 | 49);
                f55604c = i17 % 128;
                int i18 = i17 % 2;
            } else {
                signature = Signature.getInstance(str2);
                int i19 = f55604c;
                int i20 = i19 & 19;
                int i21 = ((i19 | 19) & (~i20)) + (i20 << 1);
                f55603b = i21 % 128;
                if (i21 % 2 != 0) {
                    throw null;
                }
            }
            return signature;
        }
    }

    public class c implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ g1 f55606a;

        @Override // com.mypinpad.tsdk.isolation.e1
        public final Signature setCompoundDrawableTintBlendMode(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
            Object[] objArr = {this, str};
            System.identityHashCode(this);
            c cVar = (c) objArr[0];
            String str2 = (String) objArr[1];
            try {
                return cVar.f55606a.f55594p0.setY(str2);
            } catch (Exception unused) {
                return Signature.getInstance(str2);
            }
        }
    }

    public g1(aoz aozVar, aix aixVar, String str, byte[] bArr, boolean z10) {
        this.f55594p0 = aozVar;
        this.f55595q0 = aixVar;
        this.f55596r0 = str;
        this.f55597s0 = bArr;
        this.f55598t0 = z10;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x07a7 A[LOOP:1: B:111:0x06c3->B:142:0x07a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x07cc A[SYNTHETIC] */
    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException, NoSuchProviderException {
        g1 g1Var;
        aed aedVar;
        aed aedVar2;
        aed aedVar3;
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArr;
        ajc ajcVar;
        int i13 = ~i10;
        int i14 = (((~(i10 | (~i11))) | (~(i11 | i13 | i12))) * 235) + (((~(i13 | i12)) | i11) * (-470)) + (((~((~i12) | i13)) | i11) * (-235)) + (i11 * 471) + (i10 * 236);
        if (i14 == 1) {
            return b(objArr);
        }
        char c10 = 0;
        if (i14 != 2) {
            if (i14 == 3) {
                g1 g1Var2 = (g1) objArr[0];
                HashSet hashSet = new HashSet();
                Enumeration compoundDrawableTintBlendMode = g1Var2.f55595q0.setCompoundDrawableTintBlendMode();
                int i15 = v0;
                int i16 = i15 & 29;
                int i17 = (i15 | 29) & (~i16);
                int i18 = i16 << 1;
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                f55593u0 = i19 % 128;
                int i20 = i19 % 2;
                ain compoundDrawableTintBlendMode2 = null;
                while (compoundDrawableTintBlendMode.hasMoreElements()) {
                    ajn.setDividerPadding setdividerpadding = (ajn.setDividerPadding) compoundDrawableTintBlendMode.nextElement();
                    boolean z13 = g1Var2.f55598t0;
                    hashSet.add(new f1(setdividerpadding, z13, compoundDrawableTintBlendMode2));
                    if (z13) {
                        int i21 = f55593u0 + 115;
                        v0 = i21 % 128;
                        int i22 = i21 % 2;
                        if (((Boolean) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 1915526143, -1915526142, System.identityHashCode(setdividerpadding))).booleanValue()) {
                            int i23 = v0;
                            int i24 = i23 & 31;
                            int i25 = (i24 - (~((i23 ^ 31) | i24))) - 1;
                            f55593u0 = i25 % 128;
                            if (i25 % 2 != 0) {
                                aje ajeVar = (aje) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 654586412, -654586409, System.identityHashCode(setdividerpadding));
                                throw null;
                            }
                            aje ajeVar2 = (aje) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 654586412, -654586409, System.identityHashCode(setdividerpadding));
                            ajc ajcVar2 = (ajc) aje.setY(new Object[]{ajeVar2, ajc.getNavBarTitleString}, -814074534, 814074535, System.identityHashCode(ajeVar2));
                            if (ajcVar2 != null) {
                                ajh ajhVar = (ajh) ajh.setDividerPadding(new Object[]{(add) ajc.setX(new Object[]{ajcVar2}, -663497588, 663497591, System.identityHashCode(ajcVar2))}, 1669444485, -1669444480, (int) System.currentTimeMillis());
                                ajg ajgVar = ((ajg[]) ajh.setDividerPadding(new Object[]{ajhVar}, -1505918645, 1505918645, System.identityHashCode(ajhVar)))[0];
                                compoundDrawableTintBlendMode2 = ain.setCompoundDrawableTintBlendMode((add) ajg.setY(new Object[]{ajgVar}, -1317152162, 1317152162, System.identityHashCode(ajgVar)));
                                int i26 = v0 + 84;
                                int i27 = (i26 ^ (-1)) + (i26 << 1);
                                f55593u0 = i27 % 128;
                                int i28 = i27 % 2;
                            }
                        } else {
                            continue;
                        }
                    }
                    int i29 = f55593u0;
                    int i30 = (i29 & 7) + (i29 | 7);
                    v0 = i30 % 128;
                    int i31 = i30 % 2;
                }
                int i32 = v0;
                int i33 = ((((i32 ^ 83) | (i32 & 83)) << 1) - (~(-(((~i32) & 83) | (i32 & (-84)))))) - 1;
                f55593u0 = i33 % 128;
                if (i33 % 2 != 0) {
                    int i34 = 29 / 0;
                }
                return hashSet;
            }
            if (i14 == 4) {
                aix aixVar = (aix) objArr[0];
                String str = (String) objArr[1];
                int i35 = v0;
                int i36 = (((i35 & (-124)) | ((~i35) & 123)) - (~(-(-((i35 & 123) << 1))))) - 1;
                f55593u0 = i36 % 128;
                int i37 = i36 % 2;
                ads adsVar = (ads) a(new Object[]{aixVar, str}, -534151798, 534151803, (int) System.currentTimeMillis());
                if (adsVar == null) {
                    int i38 = (-2) - ((f55593u0 + 92) ^ (-1));
                    v0 = i38 % 128;
                    int i39 = i38 % 2;
                    return null;
                }
                int i40 = v0;
                int i41 = i40 & 35;
                int i42 = (((i40 ^ 35) | i41) << 1) - ((i40 | 35) & (~i41));
                f55593u0 = i42 % 128;
                if (i42 % 2 != 0) {
                    bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
                    int i43 = 63 / 0;
                } else {
                    bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
                }
                byte[] bArr2 = bArr;
                int i44 = v0;
                int i45 = i44 & 103;
                int i46 = (i44 | 103) & (~i45);
                int i47 = i45 << 1;
                int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
                f55593u0 = i48 % 128;
                if (i48 % 2 == 0) {
                    return bArr2;
                }
                int i49 = 1 / 0;
                return bArr2;
            }
            if (i14 == 5) {
                aix aixVar2 = (aix) objArr[0];
                String str2 = (String) objArr[1];
                int i50 = v0;
                int i51 = (i50 ^ 21) + ((i50 & 21) << 1);
                f55593u0 = i51 % 128;
                int i52 = i51 % 2;
                ajn x4 = aixVar2.setX();
                if (i52 != 0) {
                    throw null;
                }
                aje ajeVar3 = (aje) ajn.setY(new Object[]{x4}, -345970549, 345970550, System.identityHashCode(x4));
                if (ajeVar3 == null || (ajcVar = (ajc) aje.setY(new Object[]{ajeVar3, new adu(str2)}, -814074534, 814074535, System.identityHashCode(ajeVar3))) == null) {
                    int i53 = v0;
                    int i54 = i53 & 101;
                    int i55 = (i53 ^ 101) | i54;
                    int i56 = (i54 & i55) + (i55 | i54);
                    f55593u0 = i56 % 128;
                    if (i56 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                int i57 = f55593u0;
                int i58 = ((i57 ^ 49) | (i57 & 49)) << 1;
                int i59 = -(((~i57) & 49) | (i57 & (-50)));
                int i60 = (i58 & i59) + (i59 | i58);
                v0 = i60 % 128;
                int i61 = i60 % 2;
                ads adsVar2 = (ads) ajc.setX(new Object[]{ajcVar}, -1225763701, 1225763708, System.identityHashCode(ajcVar));
                int i62 = f55593u0;
                int i63 = (i62 & (-102)) | ((~i62) & 101);
                int i64 = (i62 & 101) << 1;
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                v0 = i65 % 128;
                if (i65 % 2 != 0) {
                    return adsVar2;
                }
                throw null;
            }
            g1 g1Var3 = (g1) objArr[0];
            PublicKey publicKey = (PublicKey) objArr[1];
            Signature signature = (Signature) objArr[2];
            add addVar = (add) objArr[3];
            byte[] bArr3 = (byte[]) objArr[4];
            int i66 = v0 + 109;
            int i67 = i66 % 128;
            f55593u0 = i67;
            int i68 = i66 % 2;
            if (addVar != null) {
                int i69 = i67 ^ 105;
                int i70 = ((i67 & 105) | i69) << 1;
                int i71 = -i69;
                int i72 = (i70 & i71) + (i71 | i70);
                v0 = i72 % 128;
                int i73 = i72 % 2;
                l1.a(new Object[]{signature, addVar}, -1850672950, 1850672954, (int) System.currentTimeMillis());
                int i74 = v0;
                int i75 = ((i74 ^ 97) - (~((i74 & 97) << 1))) - 1;
                f55593u0 = i75 % 128;
                int i76 = i75 % 2;
            }
            signature.initVerify(publicKey);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(aof.setY(signature), 512);
                g1Var3.f55595q0.setX().setDividerPadding(bufferedOutputStream, ASN1Encoding.DER);
                bufferedOutputStream.close();
                int i77 = v0;
                int i78 = i77 & 17;
                int i79 = -(-((i77 ^ 17) | i78));
                int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
                f55593u0 = i80 % 128;
                int i81 = i80 % 2;
                System.identityHashCode(g1Var3);
                System.identityHashCode(g1Var3);
                if (!signature.verify(bArr3)) {
                    throw new SignatureException("CRL does not verify with supplied public key.");
                }
                int i82 = v0;
                int i83 = i82 ^ 67;
                int i84 = ((i82 & 67) | i83) << 1;
                int i85 = -i83;
                int i86 = ((i84 | i85) << 1) - (i84 ^ i85);
                f55593u0 = i86 % 128;
                int i87 = i86 % 2;
                return null;
            } catch (IOException e5) {
                throw new CRLException(e5.toString());
            }
        }
        g1 g1Var4 = (g1) objArr[0];
        PublicKey publicKey2 = (PublicKey) objArr[1];
        e1 e1Var = (e1) objArr[2];
        int i88 = f55593u0;
        int i89 = i88 & 11;
        int i90 = ((i88 | 11) & (~i89)) + (i89 << 1);
        v0 = i90 % 128;
        int i91 = i90 % 2;
        aiw dividerPadding = g1Var4.f55595q0.setDividerPadding();
        aix aixVar3 = g1Var4.f55595q0;
        ajn x6 = aixVar3.setX();
        if (!dividerPadding.equals((aiw) ajn.setY(new Object[]{x6}, -2060024391, 2060024395, System.identityHashCode(x6)))) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        int i92 = 513456913;
        int i93 = -513456911;
        if (!(!(publicKey2 instanceof aoe))) {
            int i94 = f55593u0;
            int i95 = i94 & 35;
            int i96 = ((i94 ^ 35) | i95) << 1;
            int i97 = -((i94 | 35) & (~i95));
            int i98 = ((i96 | i97) << 1) - (i96 ^ i97);
            v0 = i98 % 128;
            int i99 = i98 % 2;
            aiw dividerPadding2 = aixVar3.setDividerPadding();
            if (i99 == 0) {
                ((Boolean) l1.a(new Object[]{dividerPadding2}, 1549599507, -1549599506, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            g1Var = g1Var4;
            if (((Boolean) l1.a(new Object[]{dividerPadding2}, 1549599507, -1549599506, (int) System.currentTimeMillis())).booleanValue()) {
                aoe aoeVar = (aoe) publicKey2;
                List list = (List) aoe.setY(new Object[]{aoeVar}, 1903915007, -1903915004, System.identityHashCode(aoeVar));
                aiw dividerPadding3 = aixVar3.setDividerPadding();
                aed aedVar4 = (aed) aed.setY(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{dividerPadding3}, -513456911, 513456913, System.identityHashCode(dividerPadding3))}, 691787085, -691787084, (int) System.currentTimeMillis());
                acz aczVar = (acz) acz.setDividerPadding(new Object[]{aixVar3.setOnFocusChangeListener()}, 1095238957, -1095238954, (int) System.currentTimeMillis());
                aed aedVar5 = (aed) aed.setY(new Object[]{(byte[]) acz.setDividerPadding(new Object[]{aczVar}, -2004692391, 2004692392, System.identityHashCode(aczVar))}, 691787085, -691787084, (int) System.currentTimeMillis());
                int i100 = v0 + 1;
                f55593u0 = i100 % 128;
                int i101 = 2;
                int i102 = i100 % 2;
                int i103 = 0;
                boolean z14 = false;
                while (i103 != list.size()) {
                    int i104 = v0 + 95;
                    f55593u0 = i104 % 128;
                    int i105 = i104 % i101;
                    if (list.get(i103) != null) {
                        int i106 = f55593u0;
                        int i107 = i106 & 1;
                        int i108 = (i106 ^ 1) | i107;
                        int i109 = ((i107 | i108) << 1) - (i108 ^ i107);
                        v0 = i109 % 128;
                        int i110 = i109 % 2;
                        aiw aiwVar = (aiw) aiw.setOnFocusChangeListener(new Object[]{aedVar4.setX(i103)}, 866360717, -866360713, (int) System.currentTimeMillis());
                        Signature compoundDrawableTintBlendMode3 = e1Var.setCompoundDrawableTintBlendMode((String) l1.a(new Object[]{aiwVar}, 1362494079, -1362494077, (int) System.currentTimeMillis()));
                        try {
                            PublicKey publicKey3 = (PublicKey) list.get(i103);
                            add addVar2 = (add) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, i93, 513456913, System.identityHashCode(aiwVar));
                            aedVar = aedVar4;
                            try {
                                acz aczVar2 = (acz) acz.setDividerPadding(new Object[]{aedVar5.setX(i103)}, 1095238957, -1095238954, (int) System.currentTimeMillis());
                                a(new Object[]{g1Var, publicKey3, compoundDrawableTintBlendMode3, addVar2, (byte[]) acz.setDividerPadding(new Object[]{aczVar2}, -2004692391, 2004692392, System.identityHashCode(aczVar2))}, 1974004040, -1974004040, System.identityHashCode(g1Var));
                                int i111 = v0;
                                int i112 = i111 & 85;
                                int i113 = (i112 - (~((i111 ^ 85) | i112))) - 1;
                                f55593u0 = i113 % 128;
                                int i114 = i113 % 2;
                                z14 = true;
                                e = null;
                            } catch (SignatureException e7) {
                                e = e7;
                            }
                        } catch (SignatureException e10) {
                            e = e10;
                            aedVar = aedVar4;
                        }
                        if (e != null) {
                            int i115 = f55593u0;
                            int i116 = ((i115 & (-72)) | ((~i115) & 71)) + ((i115 & 71) << 1);
                            v0 = i116 % 128;
                            if (i116 % 2 == 0) {
                                throw null;
                            }
                            throw e;
                        }
                    } else {
                        aedVar = aedVar4;
                    }
                    int i117 = i103 + 27;
                    int i118 = (i117 | (-26)) << 1;
                    int i119 = -(i117 ^ (-26));
                    i103 = ((i118 | i119) << 1) - (i118 ^ i119);
                    int i120 = f55593u0 + 85;
                    v0 = i120 % 128;
                    int i121 = i120 % 2;
                    aedVar4 = aedVar;
                    i93 = -513456911;
                    i101 = 2;
                }
                if (!z14) {
                    throw new InvalidKeyException("no matching key found");
                }
                int i122 = f55593u0;
                int i123 = (i122 & 43) + (i122 | 43);
                v0 = i123 % 128;
                int i124 = i123 % 2;
            }
            return null;
        }
        g1Var = g1Var4;
        if (((Boolean) l1.a(new Object[]{aixVar3.setDividerPadding()}, 1549599507, -1549599506, (int) System.currentTimeMillis())).booleanValue()) {
            int i125 = f55593u0;
            int i126 = i125 & 13;
            int i127 = (i125 | 13) & (~i126);
            int i128 = -(-(i126 << 1));
            int i129 = (i127 ^ i128) + ((i127 & i128) << 1);
            v0 = i129 % 128;
            int i130 = i129 % 2;
            aiw dividerPadding4 = aixVar3.setDividerPadding();
            Object[] objArr2 = new Object[1];
            if (i130 == 0) {
                objArr2[0] = dividerPadding4;
                aed aedVar6 = (aed) aed.setY(new Object[]{(add) aiw.setOnFocusChangeListener(objArr2, -513456911, 513456913, System.identityHashCode(dividerPadding4))}, 691787085, -691787084, (int) System.currentTimeMillis());
                acz aczVar3 = (acz) acz.setDividerPadding(new Object[]{aixVar3.setOnFocusChangeListener()}, 1095238957, -1095238954, (int) System.currentTimeMillis());
                aedVar2 = (aed) aed.setY(new Object[]{(byte[]) acz.setDividerPadding(new Object[]{aczVar3}, -2004692391, 2004692392, System.identityHashCode(aczVar3))}, 691787085, -691787084, (int) System.currentTimeMillis());
                aedVar3 = aedVar6;
                z10 = true;
            } else {
                objArr2[0] = dividerPadding4;
                aed aedVar7 = (aed) aed.setY(new Object[]{(add) aiw.setOnFocusChangeListener(objArr2, -513456911, 513456913, System.identityHashCode(dividerPadding4))}, 691787085, -691787084, (int) System.currentTimeMillis());
                acz aczVar4 = (acz) acz.setDividerPadding(new Object[]{aixVar3.setOnFocusChangeListener()}, 1095238957, -1095238954, (int) System.currentTimeMillis());
                aedVar2 = (aed) aed.setY(new Object[]{(byte[]) acz.setDividerPadding(new Object[]{aczVar4}, -2004692391, 2004692392, System.identityHashCode(aczVar4))}, 691787085, -691787084, (int) System.currentTimeMillis());
                aedVar3 = aedVar7;
                z10 = false;
            }
            int i131 = v0;
            int i132 = i131 & 21;
            int i133 = (((i131 | 21) & (~i132)) - (~(-(-(i132 << 1))))) - 1;
            f55593u0 = i133 % 128;
            int i134 = i133 % 2;
            boolean z15 = z10;
            int i135 = 0;
            while (i135 != aedVar2.setCompoundDrawableTintBlendMode()) {
                int i136 = v0;
                int i137 = ((i136 | 75) << 1) - (i136 ^ 75);
                f55593u0 = i137 % 128;
                int i138 = i137 % 2;
                Object[] objArr3 = new Object[1];
                objArr3[c10] = aedVar3.setX(i135);
                aiw aiwVar2 = (aiw) aiw.setOnFocusChangeListener(objArr3, 866360717, -866360713, (int) System.currentTimeMillis());
                Object[] objArr4 = new Object[1];
                objArr4[c10] = aiwVar2;
                try {
                    Signature compoundDrawableTintBlendMode4 = e1Var.setCompoundDrawableTintBlendMode((String) l1.a(objArr4, 1362494079, -1362494077, (int) System.currentTimeMillis()));
                    Object[] objArr5 = new Object[1];
                    objArr5[c10] = aiwVar2;
                    try {
                        add addVar3 = (add) aiw.setOnFocusChangeListener(objArr5, -513456911, i92, System.identityHashCode(aiwVar2));
                        Object[] objArr6 = new Object[1];
                        objArr6[c10] = aedVar2.setX(i135);
                        z11 = z15;
                        try {
                            try {
                                acz aczVar5 = (acz) acz.setDividerPadding(objArr6, 1095238957, -1095238954, (int) System.currentTimeMillis());
                                try {
                                    a(new Object[]{g1Var, publicKey2, compoundDrawableTintBlendMode4, addVar3, (byte[]) acz.setDividerPadding(new Object[]{aczVar5}, -2004692391, 2004692392, System.identityHashCode(aczVar5))}, 1974004040, -1974004040, System.identityHashCode(g1Var));
                                    int i139 = v0 + 103;
                                    f55593u0 = i139 % 128;
                                    int i140 = i139 % 2;
                                    z12 = true;
                                } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                                    z12 = z11;
                                } catch (SignatureException e11) {
                                    e = e11;
                                    z12 = z11;
                                    if (e == null) {
                                        int i141 = f55593u0;
                                        int i142 = (i141 | 5) << 1;
                                        int i143 = -(((~i141) & 5) | (i141 & (-6)));
                                        int i144 = (i142 ^ i143) + ((i143 & i142) << 1);
                                        v0 = i144 % 128;
                                        int i145 = i144 % 2;
                                        throw e;
                                    }
                                    i135 = ((((i135 ^ 1) | (i135 & 1)) << 1) - (~(-((i135 & (-2)) | ((~i135) & 1))))) - 1;
                                    int i146 = f55593u0 + 120;
                                    int i147 = (i146 ^ (-1)) + (i146 << 1);
                                    v0 = i147 % 128;
                                    int i148 = i147 % 2;
                                    z15 = z12;
                                    i92 = 513456913;
                                    c10 = 0;
                                }
                            } catch (InvalidKeyException | NoSuchAlgorithmException unused2) {
                                z12 = z11;
                                e = null;
                                if (e == null) {
                                    int i149 = f55593u0;
                                    int i1410 = (i149 | 5) << 1;
                                    int i1411 = -(((~i149) & 5) | (i149 & (-6)));
                                    int i1412 = (i1410 ^ i1411) + ((i1411 & i1410) << 1);
                                    v0 = i1412 % 128;
                                    int i1413 = i1412 % 2;
                                    throw e;
                                }
                                i135 = ((((i135 ^ 1) | (i135 & 1)) << 1) - (~(-((i135 & (-2)) | ((~i135) & 1))))) - 1;
                                int i1414 = f55593u0 + 120;
                                int i1415 = (i1414 ^ (-1)) + (i1414 << 1);
                                v0 = i1415 % 128;
                                int i1416 = i1415 % 2;
                                z15 = z12;
                                i92 = 513456913;
                                c10 = 0;
                            } catch (SignatureException e12) {
                                e = e12;
                                z12 = z11;
                                if (e == null) {
                                    int i1417 = f55593u0;
                                    int i1418 = (i1417 | 5) << 1;
                                    int i1419 = -(((~i1417) & 5) | (i1417 & (-6)));
                                    int i14110 = (i1418 ^ i1419) + ((i1419 & i1418) << 1);
                                    v0 = i14110 % 128;
                                    int i14111 = i14110 % 2;
                                    throw e;
                                }
                                i135 = ((((i135 ^ 1) | (i135 & 1)) << 1) - (~(-((i135 & (-2)) | ((~i135) & 1))))) - 1;
                                int i14112 = f55593u0 + 120;
                                int i14113 = (i14112 ^ (-1)) + (i14112 << 1);
                                v0 = i14113 % 128;
                                int i14114 = i14113 % 2;
                                z15 = z12;
                                i92 = 513456913;
                                c10 = 0;
                            }
                        } catch (InvalidKeyException | NoSuchAlgorithmException unused3) {
                            z12 = z11;
                            e = null;
                            if (e == null) {
                                int i14115 = f55593u0;
                                int i14116 = (i14115 | 5) << 1;
                                int i14117 = -(((~i14115) & 5) | (i14115 & (-6)));
                                int i14118 = (i14116 ^ i14117) + ((i14117 & i14116) << 1);
                                v0 = i14118 % 128;
                                int i14119 = i14118 % 2;
                                throw e;
                            }
                            i135 = ((((i135 ^ 1) | (i135 & 1)) << 1) - (~(-((i135 & (-2)) | ((~i135) & 1))))) - 1;
                            int i141110 = f55593u0 + 120;
                            int i141111 = (i141110 ^ (-1)) + (i141110 << 1);
                            v0 = i141111 % 128;
                            int i141112 = i141111 % 2;
                            z15 = z12;
                            i92 = 513456913;
                            c10 = 0;
                        } catch (SignatureException e13) {
                            e = e13;
                            z12 = z11;
                            if (e == null) {
                                int i141113 = f55593u0;
                                int i141114 = (i141113 | 5) << 1;
                                int i141115 = -(((~i141113) & 5) | (i141113 & (-6)));
                                int i141116 = (i141114 ^ i141115) + ((i141115 & i141114) << 1);
                                v0 = i141116 % 128;
                                int i141117 = i141116 % 2;
                                throw e;
                            }
                            i135 = ((((i135 ^ 1) | (i135 & 1)) << 1) - (~(-((i135 & (-2)) | ((~i135) & 1))))) - 1;
                            int i141118 = f55593u0 + 120;
                            int i141119 = (i141118 ^ (-1)) + (i141118 << 1);
                            v0 = i141119 % 128;
                            int i1411110 = i141119 % 2;
                            z15 = z12;
                            i92 = 513456913;
                            c10 = 0;
                        }
                    } catch (InvalidKeyException | NoSuchAlgorithmException unused4) {
                        z11 = z15;
                    } catch (SignatureException e14) {
                        e = e14;
                        z11 = z15;
                    }
                } catch (InvalidKeyException | NoSuchAlgorithmException unused5) {
                    z11 = z15;
                } catch (SignatureException e15) {
                    e = e15;
                    z11 = z15;
                }
                e = null;
                if (e == null) {
                    int i1411111 = f55593u0;
                    int i1411112 = (i1411111 | 5) << 1;
                    int i1411113 = -(((~i1411111) & 5) | (i1411111 & (-6)));
                    int i1411114 = (i1411112 ^ i1411113) + ((i1411113 & i1411112) << 1);
                    v0 = i1411114 % 128;
                    int i1411115 = i1411114 % 2;
                    throw e;
                }
                i135 = ((((i135 ^ 1) | (i135 & 1)) << 1) - (~(-((i135 & (-2)) | ((~i135) & 1))))) - 1;
                int i1411116 = f55593u0 + 120;
                int i1411117 = (i1411116 ^ (-1)) + (i1411116 << 1);
                v0 = i1411117 % 128;
                int i1411118 = i1411117 % 2;
                z15 = z12;
                i92 = 513456913;
                c10 = 0;
            }
            if (!z15) {
                throw new InvalidKeyException("no matching key found");
            }
            int i150 = f55593u0;
            int i151 = (i150 ^ 67) + ((i150 & 67) << 1);
            v0 = i151 % 128;
            int i152 = i151 % 2;
        } else {
            Signature compoundDrawableTintBlendMode5 = e1Var.setCompoundDrawableTintBlendMode(g1Var.getSigAlgName());
            g1 g1Var5 = g1Var;
            byte[] bArr4 = g1Var5.f55597s0;
            if (bArr4 == null) {
                int i153 = v0;
                int i154 = i153 & 49;
                int i155 = (i153 ^ 49) | i154;
                int i156 = (i154 ^ i155) + ((i155 & i154) << 1);
                f55593u0 = i156 % 128;
                int i157 = i156 % 2;
                a(new Object[]{g1Var5, publicKey2, compoundDrawableTintBlendMode5, null, g1Var5.getSignature()}, 1974004040, -1974004040, System.identityHashCode(g1Var5));
                int i158 = f55593u0;
                int i159 = (i158 ^ 29) + ((i158 & 29) << 1);
                v0 = i159 % 128;
                if (i159 % 2 == 0) {
                    throw null;
                }
            } else {
                try {
                    a(new Object[]{g1Var5, publicKey2, compoundDrawableTintBlendMode5, (ady) ady.setNavigationOnClickListener(new Object[]{bArr4}, -1692126728, 1692126730, (int) System.currentTimeMillis()), g1Var5.getSignature()}, 1974004040, -1974004040, System.identityHashCode(g1Var5));
                    int i160 = v0;
                    int i161 = i160 ^ 87;
                    int i162 = (((i160 & 87) | i161) << 1) - i161;
                    f55593u0 = i162 % 128;
                    if (i162 % 2 != 0) {
                        throw null;
                    }
                } catch (IOException e16) {
                    StringBuilder sb2 = new StringBuilder("cannot decode signature parameters: ");
                    sb2.append(e16.getMessage());
                    throw new SignatureException(sb2.toString());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ HashSet b(Object[] objArr) {
        g1 g1Var = (g1) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = f55593u0;
        int i11 = i10 & 79;
        int i12 = -(-((i10 ^ 79) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        v0 = i13 % 128;
        int i14 = i13 % 2;
        if (g1Var.getVersion() == 2) {
            int i15 = f55593u0;
            int i16 = i15 & 85;
            int i17 = (i15 | 85) & (~i16);
            int i18 = -(-(i16 << 1));
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            v0 = i19 % 128;
            int i20 = i19 % 2;
            aix aixVar = g1Var.f55595q0;
            if (i20 == 0) {
                ajn x4 = aixVar.setX();
                throw null;
            }
            ajn x6 = aixVar.setX();
            aje ajeVar = (aje) ajn.setY(new Object[]{x6}, -345970549, 345970550, System.identityHashCode(x6));
            if (ajeVar != null) {
                HashSet hashSet = new HashSet();
                Enumeration enumeration = (Enumeration) aje.setY(new Object[]{ajeVar}, -851154266, 851154268, System.identityHashCode(ajeVar));
                int i21 = v0;
                int i22 = i21 ^ 59;
                int i23 = (i21 & 59) << 1;
                while (true) {
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    f55593u0 = i24 % 128;
                    int i25 = i24 % 2;
                    if (!enumeration.hasMoreElements()) {
                        int i26 = v0 + 17;
                        f55593u0 = i26 % 128;
                        int i27 = i26 % 2;
                        return hashSet;
                    }
                    int i28 = v0 + 71;
                    f55593u0 = i28 % 128;
                    int i29 = i28 % 2;
                    adu aduVar = (adu) enumeration.nextElement();
                    ajc ajcVar = (ajc) aje.setY(new Object[]{ajeVar, aduVar}, -814074534, 814074535, System.identityHashCode(ajeVar));
                    if (zBooleanValue == ((Boolean) ajc.setX(new Object[]{ajcVar}, -1985615408, 1985615412, System.identityHashCode(ajcVar))).booleanValue()) {
                        int i30 = f55593u0;
                        int i31 = i30 & 9;
                        int i32 = (i31 - (~((i30 ^ 9) | i31))) - 1;
                        v0 = i32 % 128;
                        if (i32 % 2 == 0) {
                            hashSet.add((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                            int i33 = 74 / 0;
                        } else {
                            hashSet.add((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                        }
                    }
                    int i34 = v0;
                    i22 = i34 & 73;
                    i23 = (i34 ^ 73) | i22;
                }
            }
        }
        int i35 = v0;
        int i36 = i35 & 9;
        int i37 = -(-((i35 ^ 9) | i36));
        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
        f55593u0 = i38 % 128;
        int i39 = i38 % 2;
        return null;
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        int i10 = v0;
        int i11 = i10 ^ 77;
        int i12 = (i10 & 77) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f55593u0 = i13 % 128;
        Set set = (Set) (i13 % 2 != 0 ? a(new Object[]{this, Boolean.TRUE}, 1735684138, -1735684137, System.identityHashCode(this)) : a(new Object[]{this, Boolean.TRUE}, 1735684138, -1735684137, System.identityHashCode(this)));
        int i14 = v0;
        int i15 = i14 & 63;
        int i16 = i15 + ((i14 ^ 63) | i15);
        f55593u0 = i16 % 128;
        if (i16 % 2 == 0) {
            return set;
        }
        throw null;
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        int i10 = f55593u0;
        int i11 = i10 & 105;
        int i12 = ((i10 ^ 105) | i11) << 1;
        int i13 = -((i10 | 105) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        v0 = i14 % 128;
        int i15 = i14 % 2;
        ads adsVar = (ads) a(new Object[]{this.f55595q0, str}, -534151798, 534151803, (int) System.currentTimeMillis());
        if (adsVar == null) {
            int i16 = v0 + 71;
            f55593u0 = i16 % 128;
            int i17 = i16 % 2;
            return null;
        }
        int i18 = f55593u0;
        int i19 = (i18 ^ 33) + ((i18 & 33) << 1);
        v0 = i19 % 128;
        int i20 = i19 % 2;
        try {
            byte[] alwaysDrawnWithCacheEnabled = adsVar.setAlwaysDrawnWithCacheEnabled();
            int i21 = v0 + 95;
            f55593u0 = i21 % 128;
            int i22 = i21 % 2;
            return alwaysDrawnWithCacheEnabled;
        } catch (Exception e5) {
            StringBuilder sb2 = new StringBuilder("error parsing ");
            sb2.append(e5.toString());
            throw new IllegalStateException(sb2.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public final Principal getIssuerDN() {
        apd apdVar = new apd(ain.setCompoundDrawableTintBlendMode(this.f55595q0.getNavBarTitleString().UiMessageCallbackKtWhenMappings()));
        int i10 = f55593u0;
        int i11 = i10 & 33;
        int i12 = (i11 - (~((i10 ^ 33) | i11))) - 1;
        v0 = i12 % 128;
        if (i12 % 2 != 0) {
            return apdVar;
        }
        throw null;
    }

    @Override // java.security.cert.X509CRL
    public final X500Principal getIssuerX500Principal() {
        try {
            X500Principal x500Principal = new X500Principal(this.f55595q0.getNavBarTitleString().setAlwaysDrawnWithCacheEnabled());
            int i10 = f55593u0;
            int i11 = (((i10 & (-2)) | ((~i10) & 1)) - (~(-(-((i10 & 1) << 1))))) - 1;
            v0 = i11 % 128;
            int i12 = i11 % 2;
            return x500Principal;
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getNextUpdate() {
        int i10 = f55593u0;
        int i11 = ((-1) << 1) - (((i10 & 88) + (i10 | 88)) ^ (-1));
        v0 = i11 % 128;
        int i12 = i11 % 2;
        ajo onLongClickListener = this.f55595q0.setOnLongClickListener();
        if (onLongClickListener != null) {
            Date date = (Date) ajo.setCompoundDrawableTintBlendMode(new Object[]{onLongClickListener}, 1704230957, -1704230955, System.identityHashCode(onLongClickListener));
            int i13 = f55593u0;
            int i14 = (i13 & 11) + (i13 | 11);
            v0 = i14 % 128;
            int i15 = i14 % 2;
            return date;
        }
        int i16 = f55593u0;
        int i17 = i16 & 101;
        int i18 = -(-((i16 ^ 101) | i17));
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        v0 = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
        int i20 = i16 & 89;
        int i21 = ((i16 ^ 89) | i20) << 1;
        int i22 = -((i16 | 89) & (~i20));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        v0 = i23 % 128;
        if (i23 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        int i10 = f55593u0;
        int i11 = (i10 ^ 13) + ((i10 & 13) << 1);
        v0 = i11 % 128;
        int i12 = i11 % 2;
        Set set = (Set) a(new Object[]{this, Boolean.FALSE}, 1735684138, -1735684137, System.identityHashCode(this));
        int i13 = f55593u0;
        int i14 = i13 & 95;
        int i15 = i14 + ((i13 ^ 95) | i14);
        v0 = i15 % 128;
        int i16 = i15 % 2;
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:25:0x0117  */
    /* JADX WARN: Code duplicated, block: B:27:0x0145  */
    /* JADX WARN: Code duplicated, block: B:29:0x0185  */
    /* JADX WARN: Code duplicated, block: B:41:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x01e2 A[SYNTHETIC] */
    @Override // java.security.cert.X509CRL
    public final X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        boolean z10;
        ajn.setDividerPadding setdividerpadding;
        int i10;
        ajc ajcVar;
        int i11;
        Object y7;
        int i12 = v0;
        int i13 = ((i12 & 28) + (i12 | 28)) - 1;
        f55593u0 = i13 % 128;
        int i14 = i13 % 2;
        aix aixVar = this.f55595q0;
        if (i14 != 0) {
            aixVar.setCompoundDrawableTintBlendMode();
            throw null;
        }
        Enumeration compoundDrawableTintBlendMode = aixVar.setCompoundDrawableTintBlendMode();
        ain compoundDrawableTintBlendMode2 = null;
        while (true) {
            if (!compoundDrawableTintBlendMode.hasMoreElements()) {
                int i15 = v0;
                int i16 = (((i15 & (-86)) | ((~i15) & 85)) - (~((i15 & 85) << 1))) - 1;
                f55593u0 = i16 % 128;
                int i17 = i16 % 2;
                return null;
            }
            int i18 = v0;
            int i19 = (i18 ^ 3) + ((i18 & 3) << 1);
            f55593u0 = i19 % 128;
            int i20 = i19 % 2;
            z10 = this.f55598t0;
            if (i20 != 0) {
                setdividerpadding = (ajn.setDividerPadding) compoundDrawableTintBlendMode.nextElement();
                adp adpVar = (adp) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 376058552, -376058547, System.identityHashCode(setdividerpadding));
                int i21 = 27 / 0;
                if (((Boolean) adp.setOnFocusChangeListener(new Object[]{adpVar, bigInteger}, 1361074046, -1361074044, System.identityHashCode(adpVar))).booleanValue()) {
                    break;
                }
                if (z10) {
                    int i22 = f55593u0;
                    int i23 = i22 & 83;
                    i10 = ((i22 | 83) & (~i23)) + (i23 << 1);
                    v0 = i10 % 128;
                    if (i10 % 2 != 0) {
                        ((Boolean) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 1915526143, -1915526142, System.identityHashCode(setdividerpadding))).booleanValue();
                        throw null;
                    }
                    if (!(!((Boolean) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 1915526143, -1915526142, System.identityHashCode(setdividerpadding))).booleanValue())) {
                        int i24 = v0;
                        int i25 = (i24 ^ 79) + ((i24 & 79) << 1);
                        f55593u0 = i25 % 128;
                        int i26 = i25 % 2;
                        aje ajeVar = (aje) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 654586412, -654586409, System.identityHashCode(setdividerpadding));
                        ajcVar = (ajc) aje.setY(new Object[]{ajeVar, ajc.getNavBarTitleString}, -814074534, 814074535, System.identityHashCode(ajeVar));
                        if (ajcVar != null) {
                            int i27 = f55593u0;
                            int i28 = i27 & 29;
                            int i29 = (i27 | 29) & (~i28);
                            int i30 = -(-(i28 << 1));
                            i11 = (i29 & i30) + (i29 | i30);
                            v0 = i11 % 128;
                            if (i11 % 2 == 0) {
                                ajh ajhVar = (ajh) ajh.setDividerPadding(new Object[]{(add) ajc.setX(new Object[]{ajcVar}, -663497588, 663497591, System.identityHashCode(ajcVar))}, 1669444485, -1669444480, (int) System.currentTimeMillis());
                                ajg ajgVar = ((ajg[]) ajh.setDividerPadding(new Object[]{ajhVar}, -1505918645, 1505918645, System.identityHashCode(ajhVar)))[0];
                                y7 = ajg.setY(new Object[]{ajgVar}, -1317152162, 1317152162, System.identityHashCode(ajgVar));
                            } else {
                                ajh ajhVar2 = (ajh) ajh.setDividerPadding(new Object[]{(add) ajc.setX(new Object[]{ajcVar}, -663497588, 663497591, System.identityHashCode(ajcVar))}, 1669444485, -1669444480, (int) System.currentTimeMillis());
                                ajg ajgVar2 = ((ajg[]) ajh.setDividerPadding(new Object[]{ajhVar2}, -1505918645, 1505918645, System.identityHashCode(ajhVar2)))[0];
                                y7 = ajg.setY(new Object[]{ajgVar2}, -1317152162, 1317152162, System.identityHashCode(ajgVar2));
                            }
                            compoundDrawableTintBlendMode2 = ain.setCompoundDrawableTintBlendMode((add) y7);
                            int i31 = v0;
                            int i32 = i31 | 59;
                            int i33 = (i32 << 1) - ((~(i31 & 59)) & i32);
                            f55593u0 = i33 % 128;
                            int i34 = i33 % 2;
                        }
                    }
                }
                int i35 = v0 + 7;
                f55593u0 = i35 % 128;
                int i36 = i35 % 2;
            } else {
                setdividerpadding = (ajn.setDividerPadding) compoundDrawableTintBlendMode.nextElement();
                adp adpVar2 = (adp) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 376058552, -376058547, System.identityHashCode(setdividerpadding));
                if (((Boolean) adp.setOnFocusChangeListener(new Object[]{adpVar2, bigInteger}, 1361074046, -1361074044, System.identityHashCode(adpVar2))).booleanValue()) {
                    break;
                }
                if (z10) {
                    int i210 = f55593u0;
                    int i211 = i210 & 83;
                    i10 = ((i210 | 83) & (~i211)) + (i211 << 1);
                    v0 = i10 % 128;
                    if (i10 % 2 != 0) {
                        ((Boolean) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 1915526143, -1915526142, System.identityHashCode(setdividerpadding))).booleanValue();
                        throw null;
                    }
                    if (!(!((Boolean) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 1915526143, -1915526142, System.identityHashCode(setdividerpadding))).booleanValue())) {
                        int i212 = v0;
                        int i213 = (i212 ^ 79) + ((i212 & 79) << 1);
                        f55593u0 = i213 % 128;
                        int i214 = i213 % 2;
                        aje ajeVar2 = (aje) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 654586412, -654586409, System.identityHashCode(setdividerpadding));
                        ajcVar = (ajc) aje.setY(new Object[]{ajeVar2, ajc.getNavBarTitleString}, -814074534, 814074535, System.identityHashCode(ajeVar2));
                        if (ajcVar != null) {
                            int i215 = f55593u0;
                            int i216 = i215 & 29;
                            int i217 = (i215 | 29) & (~i216);
                            int i37 = -(-(i216 << 1));
                            i11 = (i217 & i37) + (i217 | i37);
                            v0 = i11 % 128;
                            if (i11 % 2 == 0) {
                                ajh ajhVar3 = (ajh) ajh.setDividerPadding(new Object[]{(add) ajc.setX(new Object[]{ajcVar}, -663497588, 663497591, System.identityHashCode(ajcVar))}, 1669444485, -1669444480, (int) System.currentTimeMillis());
                                ajg ajgVar3 = ((ajg[]) ajh.setDividerPadding(new Object[]{ajhVar3}, -1505918645, 1505918645, System.identityHashCode(ajhVar3)))[0];
                                y7 = ajg.setY(new Object[]{ajgVar3}, -1317152162, 1317152162, System.identityHashCode(ajgVar3));
                            } else {
                                ajh ajhVar4 = (ajh) ajh.setDividerPadding(new Object[]{(add) ajc.setX(new Object[]{ajcVar}, -663497588, 663497591, System.identityHashCode(ajcVar))}, 1669444485, -1669444480, (int) System.currentTimeMillis());
                                ajg ajgVar4 = ((ajg[]) ajh.setDividerPadding(new Object[]{ajhVar4}, -1505918645, 1505918645, System.identityHashCode(ajhVar4)))[0];
                                y7 = ajg.setY(new Object[]{ajgVar4}, -1317152162, 1317152162, System.identityHashCode(ajgVar4));
                            }
                            compoundDrawableTintBlendMode2 = ain.setCompoundDrawableTintBlendMode((add) y7);
                            int i38 = v0;
                            int i39 = i38 | 59;
                            int i310 = (i39 << 1) - ((~(i38 & 59)) & i39);
                            f55593u0 = i310 % 128;
                            int i311 = i310 % 2;
                        }
                    }
                }
                int i312 = v0 + 7;
                f55593u0 = i312 % 128;
                int i313 = i312 % 2;
            }
        }
        f1 f1Var = new f1(setdividerpadding, z10, compoundDrawableTintBlendMode2);
        int i40 = v0;
        int i41 = (i40 ^ 53) + ((i40 & 53) << 1);
        f55593u0 = i41 % 128;
        if (i41 % 2 == 0) {
            return f1Var;
        }
        throw null;
    }

    @Override // java.security.cert.X509CRL
    public final Set getRevokedCertificates() {
        int i10 = v0;
        int i11 = ((i10 ^ 3) | (i10 & 3)) << 1;
        int i12 = -(((~i10) & 3) | (i10 & (-4)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f55593u0 = i13 % 128;
        Object[] objArr = new Object[1];
        if (i13 % 2 != 0) {
            objArr[0] = this;
            ((Set) a(objArr, -503590447, 503590450, System.identityHashCode(this))).isEmpty();
            throw null;
        }
        objArr[0] = this;
        Set set = (Set) a(objArr, -503590447, 503590450, System.identityHashCode(this));
        if (!set.isEmpty()) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(set);
            int i14 = v0 + 89;
            f55593u0 = i14 % 128;
            int i15 = i14 % 2;
            return setUnmodifiableSet;
        }
        int i16 = v0;
        int i17 = i16 & 27;
        int i18 = -(-((i16 ^ 27) | i17));
        int i19 = (i17 & i18) + (i18 | i17);
        f55593u0 = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 57 / 0;
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgName() {
        int i10 = v0;
        int i11 = ((i10 | 101) << 1) - (i10 ^ 101);
        int i12 = i11 % 128;
        f55593u0 = i12;
        int i13 = i11 % 2;
        int i14 = i12 & 11;
        int i15 = i12 | 11;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        v0 = i16 % 128;
        int i17 = i16 % 2;
        return this.f55596r0;
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgOID() {
        String str;
        int i10 = f55593u0;
        int i11 = ((i10 ^ 67) | (i10 & 67)) << 1;
        int i12 = -(((~i10) & 67) | (i10 & (-68)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        v0 = i13 % 128;
        int i14 = i13 % 2;
        aix aixVar = this.f55595q0;
        if (i14 == 0) {
            aiw dividerPadding = aixVar.setDividerPadding();
            adu aduVar = (adu) aiw.setOnFocusChangeListener(new Object[]{dividerPadding}, -661220858, 661220861, System.identityHashCode(dividerPadding));
            str = (String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar));
            int i15 = 60 / 0;
        } else {
            aiw dividerPadding2 = aixVar.setDividerPadding();
            adu aduVar2 = (adu) aiw.setOnFocusChangeListener(new Object[]{dividerPadding2}, -661220858, 661220861, System.identityHashCode(dividerPadding2));
            str = (String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar2}, 412071809, -412071801, System.identityHashCode(aduVar2));
        }
        int i16 = v0;
        int i17 = i16 & 13;
        int i18 = ((i16 | 13) & (~i17)) + (i17 << 1);
        f55593u0 = i18 % 128;
        if (i18 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSigAlgParams() {
        int i10 = f55593u0 + 115;
        v0 = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{this.f55597s0}, -150521869, 150521882, (int) System.currentTimeMillis());
        int i12 = v0;
        int i13 = i12 | 19;
        int i14 = i13 << 1;
        int i15 = -((~(i12 & 19)) & i13);
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f55593u0 = i16 % 128;
        int i17 = i16 % 2;
        return bArr;
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSignature() {
        byte[] bArr;
        int i10 = v0;
        int i11 = ((i10 | 63) << 1) - (i10 ^ 63);
        f55593u0 = i11 % 128;
        int i12 = i11 % 2;
        aix aixVar = this.f55595q0;
        if (i12 != 0) {
            acz onFocusChangeListener = aixVar.setOnFocusChangeListener();
            bArr = (byte[]) acz.setDividerPadding(new Object[]{onFocusChangeListener}, 541981427, -541981422, System.identityHashCode(onFocusChangeListener));
            int i13 = 45 / 0;
        } else {
            acz onFocusChangeListener2 = aixVar.setOnFocusChangeListener();
            bArr = (byte[]) acz.setDividerPadding(new Object[]{onFocusChangeListener2}, 541981427, -541981422, System.identityHashCode(onFocusChangeListener2));
        }
        int i14 = v0;
        int i15 = ((i14 ^ 33) | (i14 & 33)) << 1;
        int i16 = -(((~i14) & 33) | (i14 & (-34)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f55593u0 = i17 % 128;
        if (i17 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getTBSCertList() throws CRLException {
        byte[] bArr;
        int i10 = f55593u0;
        int i11 = (i10 ^ 89) + ((i10 & 89) << 1);
        v0 = i11 % 128;
        int i12 = i11 % 2;
        aix aixVar = this.f55595q0;
        try {
            if (i12 == 0) {
                ajn x4 = aixVar.setX();
                bArr = (byte[]) adw.setOnLongClickListener(new Object[]{x4, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(x4));
                int i13 = 42 / 0;
            } else {
                ajn x6 = aixVar.setX();
                bArr = (byte[]) adw.setOnLongClickListener(new Object[]{x6, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(x6));
            }
            int i14 = f55593u0;
            int i15 = i14 & 3;
            int i16 = ((i14 ^ 3) | i15) << 1;
            int i17 = -((i14 | 3) & (~i15));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            v0 = i18 % 128;
            if (i18 % 2 != 0) {
                return bArr;
            }
            throw null;
        } catch (IOException e5) {
            throw new CRLException(e5.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getThisUpdate() {
        int i10 = f55593u0;
        int i11 = i10 ^ 81;
        int i12 = (i10 & 81) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        v0 = i13 % 128;
        int i14 = i13 % 2;
        ajo navigationOnClickListener = this.f55595q0.setNavigationOnClickListener();
        Date date = (Date) ajo.setCompoundDrawableTintBlendMode(new Object[]{navigationOnClickListener}, 1704230957, -1704230955, System.identityHashCode(navigationOnClickListener));
        int i15 = v0;
        int i16 = i15 & 15;
        int i17 = (((i15 ^ 15) | i16) << 1) - ((i15 | 15) & (~i16));
        f55593u0 = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 95 / 0;
        }
        return date;
    }

    @Override // java.security.cert.X509CRL
    public final int getVersion() {
        int i10 = v0 + 19;
        f55593u0 = i10 % 128;
        int i11 = i10 % 2;
        aix aixVar = this.f55595q0;
        if (i11 == 0) {
            return aixVar.setY();
        }
        aixVar.setY();
        throw null;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        int i10 = f55593u0;
        int i11 = ((i10 & 64) + (i10 | 64)) - 1;
        v0 = i11 % 128;
        int i12 = i11 % 2;
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            int i13 = v0;
            int i14 = i13 ^ 21;
            int i15 = ((i13 & 21) | i14) << 1;
            int i16 = -i14;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            int i18 = i17 % 128;
            f55593u0 = i18;
            int i19 = i17 % 2;
            int i20 = i18 & 41;
            int i21 = ((i18 ^ 41) | i20) << 1;
            int i22 = -((i18 | 41) & (~i20));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            v0 = i23 % 128;
            if (i23 % 2 != 0) {
                return false;
            }
            throw null;
        }
        adu aduVar = ajc.setOnLongClickListener;
        criticalExtensionOIDs.remove((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
        adu aduVar2 = ajc.setOnDragListener;
        criticalExtensionOIDs.remove((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar2}, 412071809, -412071801, System.identityHashCode(aduVar2)));
        if (!(!criticalExtensionOIDs.isEmpty())) {
            int i24 = v0;
            int i25 = i24 & 95;
            int i26 = ((i24 ^ 95) | i25) << 1;
            int i27 = -((i24 | 95) & (~i25));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            f55593u0 = i28 % 128;
            int i29 = i28 % 2;
            return false;
        }
        int i30 = f55593u0;
        int i31 = (i30 & (-126)) | ((~i30) & 125);
        int i32 = -(-((i30 & 125) << 1));
        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
        v0 = i33 % 128;
        boolean z10 = i33 % 2 != 0;
        int i34 = ((i30 | 36) << 1) - (i30 ^ 36);
        int i35 = (i34 ^ (-1)) + (i34 << 1);
        v0 = i35 % 128;
        if (i35 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r5.hasMoreElements() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.g1.f55593u0 + 45;
        com.mypinpad.tsdk.isolation.g1.v0 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if ((r7 % 2) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r7 = ((java.security.cert.X509Certificate) r17).getSerialNumber();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r5.hasMoreElements() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.g1.v0;
        r10 = r9 & 19;
        r9 = (r9 ^ 19) | r10;
        r11 = ((r10 | r9) << 1) - (r9 ^ r10);
        com.mypinpad.tsdk.isolation.g1.f55593u0 = r11 % 128;
        r11 = r11 % r2;
        r9 = r16.f55598t0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r11 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r10 = (com.mypinpad.tsdk.i.ajn.setDividerPadding) com.mypinpad.tsdk.i.ajn.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r5.nextElement()}, 411722105, -411722101, (int) java.lang.System.currentTimeMillis());
        r11 = 94 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if ((!r9) == true) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        r10 = (com.mypinpad.tsdk.i.ajn.setDividerPadding) com.mypinpad.tsdk.i.ajn.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r5.nextElement()}, 411722105, -411722101, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        if (r9 == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.g1.f55593u0;
        r11 = ((r9 & 2) + (r9 | r2)) - 1;
        com.mypinpad.tsdk.isolation.g1.v0 = r11 % 128;
        r11 = r11 % r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
    
        if ((!((java.lang.Boolean) com.mypinpad.tsdk.i.ajn.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r10}, 1915526143, -1915526142, java.lang.System.identityHashCode(r10))).booleanValue()) == true) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cd, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.g1.v0;
        r11 = ((r9 | 53) << 1) - (r9 ^ 53);
        com.mypinpad.tsdk.isolation.g1.f55593u0 = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e6, code lost:
    
        if ((r11 % r2) != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
    
        r11 = (com.mypinpad.tsdk.isolation.aje) com.mypinpad.tsdk.i.ajn.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r10}, 654586412, -654586409, java.lang.System.identityHashCode(r10));
        r13 = com.mypinpad.tsdk.isolation.ajc.getNavBarTitleString;
        r14 = new java.lang.Object[r2];
        r14[0] = r11;
        r14[1] = r13;
        r9 = (com.mypinpad.tsdk.isolation.ajc) com.mypinpad.tsdk.isolation.aje.setY(r14, -814074534, 814074535, java.lang.System.identityHashCode(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0108, code lost:
    
        if (r9 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010a, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.g1.v0;
        r3 = ((-1) << 1) - (((r3 & 44) + (r3 | 44)) ^ (-1));
        com.mypinpad.tsdk.isolation.g1.f55593u0 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0130, code lost:
    
        if ((r3 % r2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0132, code lost:
    
        r2 = (com.mypinpad.tsdk.isolation.ajh) com.mypinpad.tsdk.isolation.ajh.setDividerPadding(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.add) com.mypinpad.tsdk.isolation.ajc.setX(new java.lang.Object[]{r9}, -663497588, 663497591, java.lang.System.identityHashCode(r9))}, 1669444485, -1669444480, (int) java.lang.System.currentTimeMillis());
        r2 = ((com.mypinpad.tsdk.isolation.ajg[]) com.mypinpad.tsdk.isolation.ajh.setDividerPadding(new java.lang.Object[]{r2}, -1505918645, 1505918645, java.lang.System.identityHashCode(r2)))[1];
        r2 = com.mypinpad.tsdk.isolation.ajg.setY(new java.lang.Object[]{r2}, -1317152162, 1317152162, java.lang.System.identityHashCode(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0175, code lost:
    
        r2 = (com.mypinpad.tsdk.isolation.ajh) com.mypinpad.tsdk.isolation.ajh.setDividerPadding(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.add) com.mypinpad.tsdk.isolation.ajc.setX(new java.lang.Object[]{r9}, -663497588, 663497591, java.lang.System.identityHashCode(r9))}, 1669444485, -1669444480, (int) java.lang.System.currentTimeMillis());
        r2 = ((com.mypinpad.tsdk.isolation.ajg[]) com.mypinpad.tsdk.isolation.ajh.setDividerPadding(new java.lang.Object[]{r2}, -1505918645, 1505918645, java.lang.System.identityHashCode(r2)))[0];
        r2 = com.mypinpad.tsdk.isolation.ajg.setY(new java.lang.Object[]{r2}, -1317152162, 1317152162, java.lang.System.identityHashCode(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01b2, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.ain.setCompoundDrawableTintBlendMode((com.mypinpad.tsdk.isolation.add) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01b4, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.aje) com.mypinpad.tsdk.i.ajn.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r10}, 654586412, -654586409, java.lang.System.identityHashCode(r10));
        r0 = (com.mypinpad.tsdk.isolation.ajc) com.mypinpad.tsdk.isolation.aje.setY(new java.lang.Object[]{r0, com.mypinpad.tsdk.isolation.ajc.getNavBarTitleString}, -814074534, 814074535, java.lang.System.identityHashCode(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d7, code lost:
    
        r2 = (com.mypinpad.tsdk.isolation.adp) com.mypinpad.tsdk.i.ajn.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r10}, 376058552, -376058547, java.lang.System.identityHashCode(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0207, code lost:
    
        if ((!((java.lang.Boolean) com.mypinpad.tsdk.isolation.adp.setOnFocusChangeListener(new java.lang.Object[]{r2, r7}, 1361074046, -1361074044, java.lang.System.identityHashCode(r2))).booleanValue()) == true) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0209, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.g1.v0;
        r5 = r2 & 81;
        r7 = (r2 ^ 81) | r5;
        r8 = (r5 & r7) + (r5 | r7);
        com.mypinpad.tsdk.isolation.g1.f55593u0 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021c, code lost:
    
        if ((r17 instanceof java.security.cert.X509Certificate) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021e, code lost:
    
        r5 = ((r2 ^ 119) | (r2 & 119)) << 1;
        r2 = -(((~r2) & 119) | (r2 & (-120)));
        r7 = (r5 ^ r2) + ((r2 & r5) << 1);
        com.mypinpad.tsdk.isolation.g1.f55593u0 = r7 % 128;
        r7 = r7 % 2;
        r0 = ((java.security.cert.X509Certificate) r17).getIssuerX500Principal().getEncoded();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0240, code lost:
    
        if (r7 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0242, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.ain.setCompoundDrawableTintBlendMode(r0);
        r2 = com.mypinpad.tsdk.isolation.g1.v0;
        r5 = r2 ^ 61;
        r2 = ((r2 & 61) | r5) << 1;
        r5 = -r5;
        r7 = (r2 & r5) + (r2 | r5);
        com.mypinpad.tsdk.isolation.g1.f55593u0 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x025a, code lost:
    
        com.mypinpad.tsdk.isolation.ain.setCompoundDrawableTintBlendMode(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x025e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x025f, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.aiy) com.mypinpad.tsdk.isolation.aiy.setDividerPadding(new java.lang.Object[]{r17.getEncoded()}, 1670345764, -1670345759, (int) java.lang.System.currentTimeMillis());
        r0 = (com.mypinpad.tsdk.isolation.ain) com.mypinpad.tsdk.isolation.aiy.setDividerPadding(new java.lang.Object[]{r0}, 405204446, -405204435, java.lang.System.identityHashCode(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x028c, code lost:
    
        r5 = ((-1) << 1) - ((com.mypinpad.tsdk.isolation.g1.v0 + 24) ^ (-1));
        com.mypinpad.tsdk.isolation.g1.f55593u0 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x029f, code lost:
    
        if (r3.equals(r0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02a1, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.g1.f55593u0;
        r2 = ((r0 & 28) + (r0 | 28)) - 1;
        com.mypinpad.tsdk.isolation.g1.v0 = r2 % 128;
        r2 = r2 % 2;
        r2 = (r0 & 111) + (r0 | 111);
        com.mypinpad.tsdk.isolation.g1.v0 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02b9, code lost:
    
        if ((r2 % 2) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02bb, code lost:
    
        r0 = 47 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02be, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02bf, code lost:
    
        r2 = ((-1) << 1) - ((com.mypinpad.tsdk.isolation.g1.v0 + 54) ^ (-1));
        com.mypinpad.tsdk.isolation.g1.f55593u0 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02ce, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02cf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02d0, code lost:
    
        r3 = new java.lang.StringBuilder("Cannot process certificate: ");
        r3.append(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02e7, code lost:
    
        throw new java.lang.IllegalArgumentException(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r17.getType().equals(com.bbva.ethermobilesdk.pinning.constant.ConstantKt.CERTIFICATE_TYPE_X509) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02e8, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.g1.f55593u0;
        r8 = r2 & 81;
        r8 = (r8 - (~((r2 ^ 81) | r8))) - 1;
        com.mypinpad.tsdk.isolation.g1.v0 = r8 % 128;
        r8 = r8 % 2;
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02fb, code lost:
    
        ((java.security.cert.X509Certificate) r17).getSerialNumber();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0301, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0302, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.g1.f55593u0;
        r2 = (r0 | 117) << 1;
        r0 = -(((~r0) & 117) | (r0 & (-118)));
        r3 = (r2 & r0) + (r0 | r2);
        com.mypinpad.tsdk.isolation.g1.v0 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0319, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0321, code lost:
    
        throw new java.lang.IllegalArgumentException("X.509 CRL used with non X.509 Cert");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r17.getType().equals(com.bbva.ethermobilesdk.pinning.constant.ConstantKt.CERTIFICATE_TYPE_X509) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r3 = r16.f55595q0;
        r5 = r3.setCompoundDrawableTintBlendMode();
        r3 = r3.getNavBarTitleString();
     */
    @Override // java.security.cert.CRL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isRevoked(java.security.cert.Certificate r17) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.g1.isRevoked(java.security.cert.Certificate):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x02df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0376 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x042a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x03ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x00e2 A[PHI: r8
      0x00e2: PHI (r8v13 java.util.Enumeration) = (r8v11 java.util.Enumeration), (r8v15 java.util.Enumeration) binds: [B:10:0x00df, B:7:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0177 A[PHI: r9 r10
      0x0177: PHI (r9v17 com.mypinpad.tsdk.i.adu) = (r9v15 com.mypinpad.tsdk.i.adu), (r9v41 com.mypinpad.tsdk.i.adu) binds: [B:22:0x0175, B:19:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r10v10 com.mypinpad.tsdk.i.ajc) = (r10v9 com.mypinpad.tsdk.i.ajc), (r10v50 com.mypinpad.tsdk.i.ajc) binds: [B:22:0x0175, B:19:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0257 A[Catch: Exception -> 0x044f, TRY_ENTER, TryCatch #0 {Exception -> 0x044f, blocks: (B:24:0x01c3, B:26:0x01e1, B:28:0x0208, B:30:0x0220, B:33:0x0257, B:35:0x0275, B:40:0x02ac, B:43:0x02df, B:45:0x0303, B:49:0x0307, B:51:0x0322, B:55:0x0389, B:58:0x03bd, B:60:0x03e7, B:66:0x03ff, B:68:0x0424, B:73:0x042a), top: B:94:0x01c3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x02ac A[Catch: Exception -> 0x044f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x044f, blocks: (B:24:0x01c3, B:26:0x01e1, B:28:0x0208, B:30:0x0220, B:33:0x0257, B:35:0x0275, B:40:0x02ac, B:43:0x02df, B:45:0x0303, B:49:0x0307, B:51:0x0322, B:55:0x0389, B:58:0x03bd, B:60:0x03e7, B:66:0x03ff, B:68:0x0424, B:73:0x042a), top: B:94:0x01c3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0307 A[Catch: Exception -> 0x044f, TRY_ENTER, TryCatch #0 {Exception -> 0x044f, blocks: (B:24:0x01c3, B:26:0x01e1, B:28:0x0208, B:30:0x0220, B:33:0x0257, B:35:0x0275, B:40:0x02ac, B:43:0x02df, B:45:0x0303, B:49:0x0307, B:51:0x0322, B:55:0x0389, B:58:0x03bd, B:60:0x03e7, B:66:0x03ff, B:68:0x0424, B:73:0x042a), top: B:94:0x01c3 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0389 A[Catch: Exception -> 0x044f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x044f, blocks: (B:24:0x01c3, B:26:0x01e1, B:28:0x0208, B:30:0x0220, B:33:0x0257, B:35:0x0275, B:40:0x02ac, B:43:0x02df, B:45:0x0303, B:49:0x0307, B:51:0x0322, B:55:0x0389, B:58:0x03bd, B:60:0x03e7, B:66:0x03ff, B:68:0x0424, B:73:0x042a), top: B:94:0x01c3 }] */
    @Override // java.security.cert.CRL
    public final String toString() throws NoSuchAlgorithmException, SignatureException {
        Enumeration enumeration;
        adu aduVar;
        ajc ajcVar;
        int i10;
        adq adqVar;
        int i11;
        int i12;
        int i13;
        int i14;
        StringBuffer stringBuffer = new StringBuffer();
        String str = (String) bez.setX(new Object[0], 464644689, -464644689, (int) System.currentTimeMillis());
        stringBuffer.append("              Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(str);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(str);
        l1.a(new Object[]{getSignature(), stringBuffer, str}, -1977226259, 1977226259, (int) System.currentTimeMillis());
        ajn x4 = this.f55595q0.setX();
        aje ajeVar = (aje) ajn.setY(new Object[]{x4}, -345970549, 345970550, System.identityHashCode(x4));
        if (ajeVar != null) {
            int i15 = f55593u0 + 30;
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            v0 = i16 % 128;
            if (i16 % 2 == 0) {
                enumeration = (Enumeration) aje.setY(new Object[]{ajeVar}, -851154266, 851154268, System.identityHashCode(ajeVar));
                int i17 = 51 / 0;
                if (enumeration.hasMoreElements()) {
                    stringBuffer.append("           Extensions: ");
                    stringBuffer.append(str);
                    int i18 = f55593u0;
                    int i19 = (i18 & (-82)) | ((~i18) & 81);
                    int i20 = -(-((i18 & 81) << 1));
                    int i21 = (i19 & i20) + (i20 | i19);
                    v0 = i21 % 128;
                    int i22 = i21 % 2;
                }
            } else {
                enumeration = (Enumeration) aje.setY(new Object[]{ajeVar}, -851154266, 851154268, System.identityHashCode(ajeVar));
                if (!(!enumeration.hasMoreElements())) {
                    stringBuffer.append("           Extensions: ");
                    stringBuffer.append(str);
                    int i110 = f55593u0;
                    int i111 = (i110 & (-82)) | ((~i110) & 81);
                    int i23 = -(-((i110 & 81) << 1));
                    int i24 = (i111 & i23) + (i23 | i111);
                    v0 = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
            while (enumeration.hasMoreElements()) {
                int i26 = v0;
                int i27 = i26 & 5;
                int i28 = (((i26 | 5) & (~i27)) - (~(-(-(i27 << 1))))) - 1;
                f55593u0 = i28 % 128;
                if (i28 % 2 != 0) {
                    aduVar = (adu) enumeration.nextElement();
                    ajcVar = (ajc) aje.setY(new Object[]{ajeVar, aduVar}, -814074534, 814074535, System.identityHashCode(ajeVar));
                    int i29 = 65 / 0;
                    if (((ads) ajc.setX(new Object[]{ajcVar}, -1225763701, 1225763708, System.identityHashCode(ajcVar))) != null) {
                        ads adsVar = (ads) ajc.setX(new Object[]{ajcVar}, -1225763701, 1225763708, System.identityHashCode(ajcVar));
                        adqVar = new adq((byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar)));
                        stringBuffer.append("                       critical(");
                        stringBuffer.append(((Boolean) ajc.setX(new Object[]{ajcVar}, -1985615408, 1985615412, System.identityHashCode(ajcVar))).booleanValue());
                        stringBuffer.append(") ");
                        try {
                            if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setY}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                stringBuffer.append(new ait(adp.setCompoundDrawableTintBlendMode((Object) adqVar.setX()).setOnFocusChangeListener()));
                                stringBuffer.append(str);
                                int i30 = f55593u0;
                                int i31 = i30 & 15;
                                int i32 = -(-((i30 ^ 15) | i31));
                                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                                v0 = i33 % 128;
                                int i34 = i33 % 2;
                            } else {
                                if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setOnDragListener}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                    StringBuilder sb2 = new StringBuilder("Base CRL: ");
                                    sb2.append(new ait(adp.setCompoundDrawableTintBlendMode((Object) adqVar.setX()).setOnFocusChangeListener()));
                                    stringBuffer.append(sb2.toString());
                                    stringBuffer.append(str);
                                    int i35 = v0;
                                    int i36 = (i35 & 6) + (i35 | 6);
                                    i11 = (i36 ^ (-1)) + (i36 << 1);
                                    f55593u0 = i11 % 128;
                                } else if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setOnLongClickListener}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                    if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setAlwaysDrawnWithCacheEnabled}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                        int i37 = f55593u0;
                                        int i38 = (i37 | 69) << 1;
                                        int i39 = -((i37 & (-70)) | ((~i37) & 69));
                                        i12 = (i38 & i39) + (i39 | i38);
                                        v0 = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            stringBuffer.append((ais) ais.setDividerPadding(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1830307896, 1830307897, (int) System.currentTimeMillis()));
                                            stringBuffer.append(str);
                                            throw null;
                                        }
                                        stringBuffer.append((ais) ais.setDividerPadding(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1830307896, 1830307897, (int) System.currentTimeMillis()));
                                        stringBuffer.append(str);
                                        int i40 = v0;
                                        int i41 = i40 & 77;
                                        i11 = (i41 - (~((i40 ^ 77) | i41))) - 1;
                                    } else if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setZ}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                        stringBuffer.append((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                                        stringBuffer.append(" value = ");
                                        stringBuffer.append((String) ail.setX(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, 495554292, -495554289, (int) System.currentTimeMillis()));
                                        stringBuffer.append(str);
                                        int i42 = v0;
                                        int i43 = i42 & 71;
                                        i11 = (((i42 ^ 71) | i43) << 1) - ((i42 | 71) & (~i43));
                                    } else {
                                        int i44 = v0;
                                        int i45 = i44 & 95;
                                        int i46 = (i44 ^ 95) | i45;
                                        i13 = (i45 ^ i46) + ((i46 & i45) << 1);
                                        f55593u0 = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            stringBuffer.append((ais) ais.setDividerPadding(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1830307896, 1830307897, (int) System.currentTimeMillis()));
                                            stringBuffer.append(str);
                                            throw null;
                                        }
                                        stringBuffer.append((ais) ais.setDividerPadding(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1830307896, 1830307897, (int) System.currentTimeMillis()));
                                        stringBuffer.append(str);
                                        i10 = f55593u0 + 69;
                                        v0 = i10 % 128;
                                        int i47 = i10 % 2;
                                    }
                                    f55593u0 = i11 % 128;
                                } else {
                                    int i48 = f55593u0;
                                    i14 = (i48 & 107) + (i48 | 107);
                                    v0 = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        stringBuffer.append((aji) aji.setCompoundDrawableTintBlendMode(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1073045403, 1073045404, (int) System.currentTimeMillis()));
                                        stringBuffer.append(str);
                                        int i49 = 79 / 0;
                                    } else {
                                        stringBuffer.append((aji) aji.setCompoundDrawableTintBlendMode(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1073045403, 1073045404, (int) System.currentTimeMillis()));
                                        stringBuffer.append(str);
                                    }
                                }
                                int i50 = i11 % 2;
                            }
                        } catch (Exception unused) {
                            stringBuffer.append((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                            stringBuffer.append(" value = *****");
                            stringBuffer.append(str);
                        }
                    } else {
                        stringBuffer.append(str);
                        i10 = f55593u0 + 39;
                        v0 = i10 % 128;
                        int i410 = i10 % 2;
                    }
                } else {
                    aduVar = (adu) enumeration.nextElement();
                    ajcVar = (ajc) aje.setY(new Object[]{ajeVar, aduVar}, -814074534, 814074535, System.identityHashCode(ajeVar));
                    if (((ads) ajc.setX(new Object[]{ajcVar}, -1225763701, 1225763708, System.identityHashCode(ajcVar))) != null) {
                        ads adsVar2 = (ads) ajc.setX(new Object[]{ajcVar}, -1225763701, 1225763708, System.identityHashCode(ajcVar));
                        adqVar = new adq((byte[]) ads.setDividerPadding(new Object[]{adsVar2}, -952512304, 952512305, System.identityHashCode(adsVar2)));
                        stringBuffer.append("                       critical(");
                        stringBuffer.append(((Boolean) ajc.setX(new Object[]{ajcVar}, -1985615408, 1985615412, System.identityHashCode(ajcVar))).booleanValue());
                        stringBuffer.append(") ");
                        if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setY}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                            stringBuffer.append(new ait(adp.setCompoundDrawableTintBlendMode((Object) adqVar.setX()).setOnFocusChangeListener()));
                            stringBuffer.append(str);
                            int i310 = f55593u0;
                            int i311 = i310 & 15;
                            int i312 = -(-((i310 ^ 15) | i311));
                            int i313 = ((i311 | i312) << 1) - (i312 ^ i311);
                            v0 = i313 % 128;
                            int i314 = i313 % 2;
                        } else {
                            if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setOnDragListener}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                StringBuilder sb3 = new StringBuilder("Base CRL: ");
                                sb3.append(new ait(adp.setCompoundDrawableTintBlendMode((Object) adqVar.setX()).setOnFocusChangeListener()));
                                stringBuffer.append(sb3.toString());
                                stringBuffer.append(str);
                                int i315 = v0;
                                int i316 = (i315 & 6) + (i315 | 6);
                                i11 = (i316 ^ (-1)) + (i316 << 1);
                                f55593u0 = i11 % 128;
                            } else if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setOnLongClickListener}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setAlwaysDrawnWithCacheEnabled}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                    int i317 = f55593u0;
                                    int i318 = (i317 | 69) << 1;
                                    int i319 = -((i317 & (-70)) | ((~i317) & 69));
                                    i12 = (i318 & i319) + (i319 | i318);
                                    v0 = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        stringBuffer.append((ais) ais.setDividerPadding(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1830307896, 1830307897, (int) System.currentTimeMillis()));
                                        stringBuffer.append(str);
                                        throw null;
                                    }
                                    stringBuffer.append((ais) ais.setDividerPadding(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1830307896, 1830307897, (int) System.currentTimeMillis()));
                                    stringBuffer.append(str);
                                    int i411 = v0;
                                    int i412 = i411 & 77;
                                    i11 = (i412 - (~((i411 ^ 77) | i412))) - 1;
                                } else if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setZ}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                    stringBuffer.append((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                                    stringBuffer.append(" value = ");
                                    stringBuffer.append((String) ail.setX(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, 495554292, -495554289, (int) System.currentTimeMillis()));
                                    stringBuffer.append(str);
                                    int i413 = v0;
                                    int i414 = i413 & 71;
                                    i11 = (((i413 ^ 71) | i414) << 1) - ((i413 | 71) & (~i414));
                                } else {
                                    int i415 = v0;
                                    int i416 = i415 & 95;
                                    int i417 = (i415 ^ 95) | i416;
                                    i13 = (i416 ^ i417) + ((i417 & i416) << 1);
                                    f55593u0 = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        stringBuffer.append((ais) ais.setDividerPadding(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1830307896, 1830307897, (int) System.currentTimeMillis()));
                                        stringBuffer.append(str);
                                        throw null;
                                    }
                                    stringBuffer.append((ais) ais.setDividerPadding(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1830307896, 1830307897, (int) System.currentTimeMillis()));
                                    stringBuffer.append(str);
                                    i10 = f55593u0 + 69;
                                    v0 = i10 % 128;
                                    int i418 = i10 % 2;
                                }
                                f55593u0 = i11 % 128;
                            } else {
                                int i419 = f55593u0;
                                i14 = (i419 & 107) + (i419 | 107);
                                v0 = i14 % 128;
                                if (i14 % 2 == 0) {
                                    stringBuffer.append((aji) aji.setCompoundDrawableTintBlendMode(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1073045403, 1073045404, (int) System.currentTimeMillis()));
                                    stringBuffer.append(str);
                                    int i420 = 79 / 0;
                                } else {
                                    stringBuffer.append((aji) aji.setCompoundDrawableTintBlendMode(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1073045403, 1073045404, (int) System.currentTimeMillis()));
                                    stringBuffer.append(str);
                                }
                            }
                            int i51 = i11 % 2;
                        }
                    } else {
                        stringBuffer.append(str);
                        i10 = f55593u0 + 39;
                        v0 = i10 % 128;
                        int i4110 = i10 % 2;
                    }
                }
            }
        }
        Set revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            int i52 = f55593u0;
            int i53 = (i52 ^ 93) + ((i52 & 93) << 1);
            v0 = i53 % 128;
            if (i53 % 2 == 0) {
                revokedCertificates.iterator();
                throw null;
            }
            Iterator it = revokedCertificates.iterator();
            while (it.hasNext()) {
                int i54 = f55593u0;
                int i55 = ((i54 & 72) + (i54 | 72)) - 1;
                v0 = i55 % 128;
                int i56 = i55 % 2;
                stringBuffer.append(it.next());
                stringBuffer.append(str);
                if (i56 == 0) {
                    int i57 = 65 / 0;
                }
            }
        }
        String string = stringBuffer.toString();
        int i58 = v0;
        int i59 = (i58 & 87) + (i58 | 87);
        f55593u0 = i59 % 128;
        if (i59 % 2 == 0) {
            return string;
        }
        throw null;
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        try {
            a aVar = new a();
            aVar.f55602b = this;
            aVar.f55601a = provider;
            a(new Object[]{this, publicKey, aVar}, -1129998824, 1129998826, System.identityHashCode(this));
            int i10 = v0 + 85;
            f55593u0 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (NoSuchProviderException e5) {
            StringBuilder sb2 = new StringBuilder("provider issue: ");
            sb2.append(e5.getMessage());
            throw new NoSuchAlgorithmException(sb2.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException, NoSuchProviderException {
        b bVar = new b();
        bVar.f55605a = str;
        a(new Object[]{this, publicKey, bVar}, -1129998824, 1129998826, System.identityHashCode(this));
        int i10 = f55593u0;
        int i11 = i10 ^ 81;
        int i12 = ((i10 & 81) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        v0 = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException, NoSuchProviderException {
        c cVar = new c();
        cVar.f55606a = this;
        a(new Object[]{this, publicKey, cVar}, -1129998824, 1129998826, System.identityHashCode(this));
        int i10 = f55593u0;
        int i11 = (i10 ^ 87) + ((i10 & 87) << 1);
        v0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }
}
