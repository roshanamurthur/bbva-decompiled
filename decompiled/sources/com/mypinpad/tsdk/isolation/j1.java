package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j1 extends X509Certificate {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f56580w0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final aoz f56581p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final aiy f56582q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final aiu f56583r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean[] f56584s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f56585t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f56586u0;

    public class a implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ String f56587a;

        @Override // com.mypinpad.tsdk.isolation.e1
        public final Signature setCompoundDrawableTintBlendMode(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
            Object[] objArr = {this, str};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            String str2 = (String) objArr[1];
            String str3 = aVar.f56587a;
            return str3 != null ? Signature.getInstance(str2, str3) : Signature.getInstance(str2);
        }
    }

    public class b implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ j1 f56588a;

        @Override // com.mypinpad.tsdk.isolation.e1
        public final Signature setCompoundDrawableTintBlendMode(String str) throws NoSuchAlgorithmException {
            Object[] objArr = {this, str};
            System.identityHashCode(this);
            b bVar = (b) objArr[0];
            String str2 = (String) objArr[1];
            try {
                return bVar.f56588a.f56581p0.setY(str2);
            } catch (Exception unused) {
                return Signature.getInstance(str2);
            }
        }
    }

    public class c implements e1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f56589b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f56590c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Provider f56591a;

        @Override // com.mypinpad.tsdk.isolation.e1
        public final Signature setCompoundDrawableTintBlendMode(String str) throws NoSuchAlgorithmException {
            Object[] objArr = {this, str};
            System.identityHashCode(this);
            c cVar = (c) objArr[0];
            String str2 = (String) objArr[1];
            int i10 = f56590c;
            int i11 = i10 + 69;
            f56589b = i11 % 128;
            int i12 = i11 % 2;
            Provider provider = cVar.f56591a;
            if (i12 != 0) {
                throw null;
            }
            if (provider == null) {
                Signature signature = Signature.getInstance(str2);
                int i13 = f56589b + 39;
                f56590c = i13 % 128;
                if (i13 % 2 != 0) {
                    return signature;
                }
                int i14 = 32 / 0;
                return signature;
            }
            int i15 = (i10 & 23) + (i10 | 23);
            f56589b = i15 % 128;
            int i16 = i15 % 2;
            Signature signature2 = Signature.getInstance(str2, provider);
            int i17 = f56589b;
            int i18 = (i17 ^ 75) + ((i17 & 75) << 1);
            f56590c = i18 % 128;
            int i19 = i18 % 2;
            return signature2;
        }
    }

    public j1(aoz aozVar, aiy aiyVar, aiu aiuVar, boolean[] zArr, String str, byte[] bArr) {
        this.f56581p0 = aozVar;
        this.f56582q0 = aiyVar;
        this.f56583r0 = aiuVar;
        this.f56584s0 = zArr;
        this.f56585t0 = str;
        this.f56586u0 = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x075d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0727 A[LOOP:1: B:62:0x060b->B:97:0x0727, LOOP_END] */
    public static /* synthetic */ void a(Object[] objArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        e1 e1Var;
        aed aedVar;
        List list;
        aed aedVar2;
        boolean z10;
        j1 j1Var;
        char c10 = 0;
        j1 j1Var2 = (j1) objArr[0];
        PublicKey publicKey = (PublicKey) objArr[1];
        e1 e1Var2 = (e1) objArr[2];
        int iIdentityHashCode = System.identityHashCode(j1Var2);
        int i10 = (-815497034) ^ iIdentityHashCode;
        int i11 = (-815497034) & iIdentityHashCode;
        int i12 = ~((i10 ^ i11) | (i10 & i11));
        int i13 = 1145665 ^ i12;
        int i14 = i12 & 1145665;
        int i15 = (((i14 & i13) | (i13 ^ i14)) * (-814)) - 2146394966;
        int i16 = ~iIdentityHashCode;
        int i17 = (-1407960) ^ i16;
        int i18 = i16 & (-1407960);
        int i19 = ~((i18 & i17) | (i17 ^ i18));
        int i20 = (i19 & (-815759328)) | (i19 ^ (-815759328));
        int i21 = i11 | i10;
        int i22 = ~i21;
        int i23 = (i21 | i22) & i22;
        int i24 = i20 ^ i23;
        int i25 = i23 & i20;
        int i26 = -(-(((i25 & i24) | (i24 ^ i25)) * 407));
        int i27 = (i15 & i26) + (i26 | i15);
        int i28 = ~((815497033 & iIdentityHashCode) | (815497033 ^ iIdentityHashCode));
        int i29 = (-815759328) & i28;
        int i30 = (i28 | (-815759328)) & (~i29);
        int i31 = (i30 & i29) | (i30 ^ i29);
        int i32 = ~((iIdentityHashCode & 1407959) | (1407959 ^ iIdentityHashCode));
        int i33 = ((i32 & i31) | (i31 ^ i32)) * 407;
        int i34 = ((~i33) & i27) | ((~i27) & i33);
        int i35 = (i33 & i27) << 1;
        int i36 = (i34 & i35) + (i35 | i34);
        int iIdentityHashCode2 = System.identityHashCode(j1Var2);
        int i37 = ~iIdentityHashCode2;
        int i38 = ~((1119946713 ^ i37) | (1119946713 & i37));
        int i39 = (2023201181 & i37) | ((-2023201182) & iIdentityHashCode2) | (2023201181 & iIdentityHashCode2);
        int i40 = ~i39;
        int i41 = (i39 | i40) & i40;
        int i42 = i38 ^ i41;
        int i43 = i38 & i41;
        int i44 = (-2) - ((2123235096 - (~(((i43 & i42) | (i42 ^ i43)) * (-370)))) ^ (-1));
        int i45 = i37 & (i37 | iIdentityHashCode2);
        int i46 = 2023201181 & i45;
        int i47 = (i45 | 2023201181) & (~i46);
        int i48 = (i47 & i46) | (i47 ^ i46);
        int i49 = ~i48;
        int i50 = (i48 | i49) & i49;
        int i51 = 1119946713 ^ iIdentityHashCode2;
        int i52 = iIdentityHashCode2 & 1119946713;
        int i53 = ~((i52 & i51) | (i51 ^ i52));
        int i54 = i50 & i53;
        int i55 = (i53 | i50) & (~i54);
        int i56 = (i55 & i54) | (i55 ^ i54);
        int i57 = i56 ^ 1082196377;
        int i58 = i56 & 1082196377;
        int i59 = ((i58 & i57) | (i57 ^ i58)) * (-370);
        int i60 = i44 ^ i59;
        int i61 = ((i59 & i44) | i60) << 1;
        int i62 = -i60;
        int i63 = (((i61 | i62) << 1) - (i61 ^ i62)) - (-980700962);
        boolean z11 = publicKey instanceof aoe;
        if (i36 > i63) {
            throw null;
        }
        if (!z11) {
            e1Var = e1Var2;
        } else {
            aiy aiyVar = j1Var2.f56582q0;
            e1Var = e1Var2;
            if (((Boolean) l1.a(new Object[]{(aiw) aiy.setDividerPadding(new Object[]{aiyVar}, -434839086, 434839093, System.identityHashCode(aiyVar))}, 1549599507, -1549599506, (int) System.currentTimeMillis())).booleanValue()) {
                System.identityHashCode(j1Var2);
                int iIdentityHashCode3 = System.identityHashCode(j1Var2);
                int i64 = ~((-615989969) | iIdentityHashCode3);
                int i65 = -(-(((i64 & (-1326412461)) | ((-1326412461) ^ i64)) * (-465)));
                int i66 = ((-251027279) & (~i65)) | (i65 & 251027278);
                int i67 = ((-251027279) & i65) << 1;
                int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                int i69 = (-1326412461) & iIdentityHashCode3;
                int i70 = (~i69) & ((-1326412461) | iIdentityHashCode3);
                int i71 = ~((i70 ^ i69) | (i69 & i70));
                int i72 = ((~i71) & (-615989969)) | (i71 & 615989968);
                int i73 = i71 & (-615989969);
                int i74 = -(-(((i72 ^ i73) | (i73 & i72)) * 930));
                int i75 = i68 & i74;
                int i76 = (i68 ^ i74) | i75;
                int i77 = (i75 & i76) + (i76 | i75);
                int i78 = (iIdentityHashCode3 & (-615989969)) | ((~iIdentityHashCode3) & (-615989969)) | (iIdentityHashCode3 & 615989968);
                int i79 = (1326412460 & i78) | ((~i78) & (-1326412461));
                int i80 = i78 & (-1326412461);
                int i81 = ((i80 & i79) | (i79 ^ i80)) * 465;
                int i82 = i77 & i81;
                int i83 = ((i77 ^ i81) | i82) << 1;
                int i84 = -((i77 | i81) & (~i82));
                int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                aiy aiyVar2 = j1Var2.f56582q0;
                aoe aoeVar = (aoe) publicKey;
                if (-1046462292 > i85) {
                    List list2 = (List) aoe.setY(new Object[]{aoeVar}, 1903915007, -1903915004, System.identityHashCode(aoeVar));
                    aiw aiwVar = (aiw) aiy.setDividerPadding(new Object[]{aiyVar2}, -434839086, 434839093, System.identityHashCode(aiyVar2));
                    aed aedVar3 = (aed) aed.setY(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -513456911, 513456913, System.identityHashCode(aiwVar))}, 691787085, -691787084, (int) System.currentTimeMillis());
                    acz aczVar = (acz) acz.setDividerPadding(new Object[]{(acz) aiy.setDividerPadding(new Object[]{aiyVar2}, -1548652488, 1548652492, System.identityHashCode(aiyVar2))}, 1095238957, -1095238954, (int) System.currentTimeMillis());
                    aedVar = aedVar3;
                    list = list2;
                    aedVar2 = (aed) aed.setY(new Object[]{(byte[]) acz.setDividerPadding(new Object[]{aczVar}, -2004692391, 2004692392, System.identityHashCode(aczVar))}, 691787085, -691787084, (int) System.currentTimeMillis());
                    z10 = true;
                } else {
                    List list3 = (List) aoe.setY(new Object[]{aoeVar}, 1903915007, -1903915004, System.identityHashCode(aoeVar));
                    aiw aiwVar2 = (aiw) aiy.setDividerPadding(new Object[]{aiyVar2}, -434839086, 434839093, System.identityHashCode(aiyVar2));
                    aed aedVar4 = (aed) aed.setY(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -513456911, 513456913, System.identityHashCode(aiwVar2))}, 691787085, -691787084, (int) System.currentTimeMillis());
                    acz aczVar2 = (acz) acz.setDividerPadding(new Object[]{(acz) aiy.setDividerPadding(new Object[]{aiyVar2}, -1548652488, 1548652492, System.identityHashCode(aiyVar2))}, 1095238957, -1095238954, (int) System.currentTimeMillis());
                    aedVar = aedVar4;
                    list = list3;
                    aedVar2 = (aed) aed.setY(new Object[]{(byte[]) acz.setDividerPadding(new Object[]{aczVar2}, -2004692391, 2004692392, System.identityHashCode(aczVar2))}, 691787085, -691787084, (int) System.currentTimeMillis());
                    z10 = false;
                }
                boolean z12 = z10;
                int i86 = 0;
                while (i86 != list.size()) {
                    int i87 = v0 + 105;
                    f56580w0 = i87 % 128;
                    if (i87 % 2 == 0) {
                        list.get(i86);
                        throw null;
                    }
                    if (list.get(i86) != null) {
                        Object[] objArr2 = new Object[1];
                        objArr2[c10] = aedVar.setX(i86);
                        aiw aiwVar3 = (aiw) aiw.setOnFocusChangeListener(objArr2, 866360717, -866360713, (int) System.currentTimeMillis());
                        Object[] objArr3 = new Object[1];
                        objArr3[c10] = aiwVar3;
                        Signature compoundDrawableTintBlendMode = e1Var.setCompoundDrawableTintBlendMode((String) l1.a(objArr3, 1362494079, -1362494077, (int) System.currentTimeMillis()));
                        try {
                            PublicKey publicKey2 = (PublicKey) list.get(i86);
                            Object[] objArr4 = new Object[1];
                            objArr4[c10] = aiwVar3;
                            add addVar = (add) aiw.setOnFocusChangeListener(objArr4, -513456911, 513456913, System.identityHashCode(aiwVar3));
                            Object[] objArr5 = new Object[1];
                            objArr5[c10] = aedVar2.setX(i86);
                            j1Var = j1Var2;
                            try {
                                acz aczVar3 = (acz) acz.setDividerPadding(objArr5, 1095238957, -1095238954, (int) System.currentTimeMillis());
                                d(new Object[]{j1Var, publicKey2, compoundDrawableTintBlendMode, addVar, (byte[]) acz.setDividerPadding(new Object[]{aczVar3}, -2004692391, 2004692392, System.identityHashCode(aczVar3))}, -1381844797, 1381844803, System.identityHashCode(j1Var));
                                int i88 = v0;
                                int i89 = (i88 & 97) + (i88 | 97);
                                f56580w0 = i89 % 128;
                                int i90 = i89 % 2;
                                z12 = true;
                                e = null;
                            } catch (SignatureException e5) {
                                e = e5;
                            }
                        } catch (SignatureException e7) {
                            e = e7;
                            j1Var = j1Var2;
                        }
                        if (e != null) {
                            int i91 = f56580w0;
                            int i92 = (((i91 | 55) << 1) - (~(-(((~i91) & 55) | (i91 & (-56)))))) - 1;
                            v0 = i92 % 128;
                            if (i92 % 2 == 0) {
                                throw e;
                            }
                            throw null;
                        }
                    } else {
                        j1Var = j1Var2;
                    }
                    int i93 = (i86 | 1) << 1;
                    int i94 = -((i86 & (-2)) | ((~i86) & 1));
                    i86 = (i93 ^ i94) + ((i93 & i94) << 1);
                    System.identityHashCode(j1Var);
                    System.identityHashCode(j1Var);
                    j1Var2 = j1Var;
                    c10 = 0;
                }
                if (!z12) {
                    throw new InvalidKeyException("no matching key found");
                }
                int i95 = f56580w0 + 96;
                int i96 = (i95 ^ (-1)) + (i95 << 1);
                v0 = i96 % 128;
                int i97 = i96 % 2;
                return;
            }
        }
        aiy aiyVar3 = j1Var2.f56582q0;
        boolean zBooleanValue = ((Boolean) l1.a(new Object[]{(aiw) aiy.setDividerPadding(new Object[]{aiyVar3}, -434839086, 434839093, System.identityHashCode(aiyVar3))}, 1549599507, -1549599506, (int) System.currentTimeMillis())).booleanValue();
        aiy aiyVar4 = j1Var2.f56582q0;
        if (!zBooleanValue) {
            Signature compoundDrawableTintBlendMode2 = e1Var.setCompoundDrawableTintBlendMode((String) l1.a(new Object[]{(aiw) aiy.setDividerPadding(new Object[]{aiyVar4}, -434839086, 434839093, System.identityHashCode(aiyVar4))}, 1362494079, -1362494077, (int) System.currentTimeMillis()));
            if (!z11) {
                aiw aiwVar4 = (aiw) aiy.setDividerPadding(new Object[]{aiyVar4}, -434839086, 434839093, System.identityHashCode(aiyVar4));
                d(new Object[]{j1Var2, publicKey, compoundDrawableTintBlendMode2, (add) aiw.setOnFocusChangeListener(new Object[]{aiwVar4}, -513456911, 513456913, System.identityHashCode(aiwVar4)), j1Var2.getSignature()}, -1381844797, 1381844803, System.identityHashCode(j1Var2));
                int i98 = f56580w0;
                int i99 = i98 & 111;
                int i100 = -(-((i98 ^ 111) | i99));
                int i101 = (i99 & i100) + (i100 | i99);
                v0 = i101 % 128;
                int i102 = i101 % 2;
                return;
            }
            int i103 = v0;
            int i104 = i103 & 31;
            int i105 = (i103 | 31) & (~i104);
            int i106 = i104 << 1;
            int i107 = ((i105 | i106) << 1) - (i105 ^ i106);
            f56580w0 = i107 % 128;
            int i108 = i107 % 2;
            aoe aoeVar2 = (aoe) publicKey;
            List list4 = (List) aoe.setY(new Object[]{aoeVar2}, 1903915007, -1903915004, System.identityHashCode(aoeVar2));
            System.identityHashCode(j1Var2);
            System.identityHashCode(j1Var2);
            int i109 = 0;
            while (i109 != list4.size()) {
                int i110 = v0;
                int i111 = i110 & 95;
                int i112 = ((i110 ^ 95) | i111) << 1;
                int i113 = -((i110 | 95) & (~i111));
                int i114 = (i112 & i113) + (i113 | i112);
                f56580w0 = i114 % 128;
                int i115 = i114 % 2;
                try {
                    PublicKey publicKey3 = (PublicKey) list4.get(i109);
                    aiw aiwVar5 = (aiw) aiy.setDividerPadding(new Object[]{aiyVar4}, -434839086, 434839093, System.identityHashCode(aiyVar4));
                    d(new Object[]{j1Var2, publicKey3, compoundDrawableTintBlendMode2, (add) aiw.setOnFocusChangeListener(new Object[]{aiwVar5}, -513456911, 513456913, System.identityHashCode(aiwVar5)), j1Var2.getSignature()}, -1381844797, 1381844803, System.identityHashCode(j1Var2));
                    int i116 = f56580w0;
                    int i117 = ((i116 ^ 122) + ((i116 & 122) << 1)) - 1;
                    v0 = i117 % 128;
                    int i118 = i117 % 2;
                    return;
                } catch (InvalidKeyException unused) {
                    int i119 = (-2) - (((i109 ^ 61) + ((i109 & 61) << 1)) ^ (-1));
                    int i120 = i119 & (-59);
                    i109 = (((i119 ^ (-59)) | i120) << 1) - ((i119 | (-59)) & (~i120));
                }
            }
            throw new InvalidKeyException("no matching signature found");
        }
        int i121 = f56580w0;
        int i122 = (i121 & 79) + (i121 | 79);
        v0 = i122 % 128;
        int i123 = i122 % 2;
        aiw aiwVar6 = (aiw) aiy.setDividerPadding(new Object[]{aiyVar4}, -434839086, 434839093, System.identityHashCode(aiyVar4));
        aed aedVar5 = (aed) aed.setY(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar6}, -513456911, 513456913, System.identityHashCode(aiwVar6))}, 691787085, -691787084, (int) System.currentTimeMillis());
        acz aczVar4 = (acz) acz.setDividerPadding(new Object[]{(acz) aiy.setDividerPadding(new Object[]{aiyVar4}, -1548652488, 1548652492, System.identityHashCode(aiyVar4))}, 1095238957, -1095238954, (int) System.currentTimeMillis());
        aed aedVar6 = (aed) aed.setY(new Object[]{(byte[]) acz.setDividerPadding(new Object[]{aczVar4}, -2004692391, 2004692392, System.identityHashCode(aczVar4))}, 691787085, -691787084, (int) System.currentTimeMillis());
        int i124 = f56580w0 + 49;
        v0 = i124 % 128;
        int i125 = i124 % 2;
        boolean z13 = false;
        int i126 = 0;
        while (i126 != aedVar6.setCompoundDrawableTintBlendMode()) {
            int i127 = v0;
            int i128 = i127 ^ 103;
            int i129 = ((((i127 & 103) | i128) << 1) - (~(-i128))) - 1;
            f56580w0 = i129 % 128;
            int i130 = i129 % 2;
            aiw aiwVar7 = (aiw) aiw.setOnFocusChangeListener(new Object[]{aedVar5.setX(i126)}, 866360717, -866360713, (int) System.currentTimeMillis());
            try {
                Signature compoundDrawableTintBlendMode3 = e1Var.setCompoundDrawableTintBlendMode((String) l1.a(new Object[]{aiwVar7}, 1362494079, -1362494077, (int) System.currentTimeMillis()));
                try {
                    add addVar2 = (add) aiw.setOnFocusChangeListener(new Object[]{aiwVar7}, -513456911, 513456913, System.identityHashCode(aiwVar7));
                    Object[] objArr6 = new Object[1];
                    try {
                        objArr6[0] = aedVar6.setX(i126);
                        acz aczVar5 = (acz) acz.setDividerPadding(objArr6, 1095238957, -1095238954, (int) System.currentTimeMillis());
                        try {
                            try {
                                try {
                                    d(new Object[]{j1Var2, publicKey, compoundDrawableTintBlendMode3, addVar2, (byte[]) acz.setDividerPadding(new Object[]{aczVar5}, -2004692391, 2004692392, System.identityHashCode(aczVar5))}, -1381844797, 1381844803, System.identityHashCode(j1Var2));
                                    int i131 = f56580w0;
                                    int i132 = i131 ^ 97;
                                    int i133 = ((i131 & 97) | i132) << 1;
                                    int i134 = -i132;
                                    int i135 = ((i133 | i134) << 1) - (i133 ^ i134);
                                    v0 = i135 % 128;
                                    int i136 = i135 % 2;
                                    z13 = true;
                                } catch (InvalidKeyException | NoSuchAlgorithmException unused2) {
                                } catch (SignatureException e10) {
                                    e = e10;
                                }
                            } catch (InvalidKeyException | NoSuchAlgorithmException unused3) {
                            } catch (SignatureException e11) {
                                e = e11;
                            }
                        } catch (InvalidKeyException | NoSuchAlgorithmException unused4) {
                        } catch (SignatureException e12) {
                            e = e12;
                        }
                    } catch (InvalidKeyException | NoSuchAlgorithmException unused5) {
                        e = null;
                        if (e != null) {
                            int i137 = v0;
                            int i138 = (((i137 | 68) << 1) - (i137 ^ 68)) - 1;
                            f56580w0 = i138 % 128;
                            int i139 = i138 % 2;
                            throw e;
                        }
                        int i140 = i126 & 93;
                        int i141 = -(-((i126 ^ 93) | i140));
                        int i142 = (i140 ^ i141) + ((i140 & i141) << 1);
                        int i143 = i142 ^ (-92);
                        int i144 = (i142 & (-92)) << 1;
                        i126 = ((i143 | i144) << 1) - (i143 ^ i144);
                        int i145 = f56580w0;
                        int i146 = ((i145 ^ 35) | (i145 & 35)) << 1;
                        int i147 = -((i145 & (-36)) | (35 & (~i145)));
                        int i148 = (i146 & i147) + (i147 | i146);
                        v0 = i148 % 128;
                        int i149 = i148 % 2;
                    } catch (SignatureException e13) {
                        e = e13;
                        if (e != null) {
                            int i1310 = v0;
                            int i1311 = (((i1310 | 68) << 1) - (i1310 ^ 68)) - 1;
                            f56580w0 = i1311 % 128;
                            int i1312 = i1311 % 2;
                            throw e;
                        }
                        int i1410 = i126 & 93;
                        int i1411 = -(-((i126 ^ 93) | i1410));
                        int i1412 = (i1410 ^ i1411) + ((i1410 & i1411) << 1);
                        int i1413 = i1412 ^ (-92);
                        int i1414 = (i1412 & (-92)) << 1;
                        i126 = ((i1413 | i1414) << 1) - (i1413 ^ i1414);
                        int i1415 = f56580w0;
                        int i1416 = ((i1415 ^ 35) | (i1415 & 35)) << 1;
                        int i1417 = -((i1415 & (-36)) | (35 & (~i1415)));
                        int i1418 = (i1416 & i1417) + (i1417 | i1416);
                        v0 = i1418 % 128;
                        int i1419 = i1418 % 2;
                    }
                } catch (InvalidKeyException | NoSuchAlgorithmException unused6) {
                } catch (SignatureException e14) {
                    e = e14;
                }
            } catch (InvalidKeyException | NoSuchAlgorithmException unused7) {
            } catch (SignatureException e15) {
                e = e15;
            }
            e = null;
            if (e != null) {
                int i1313 = v0;
                int i1314 = (((i1313 | 68) << 1) - (i1313 ^ 68)) - 1;
                f56580w0 = i1314 % 128;
                int i1315 = i1314 % 2;
                throw e;
            }
            int i14110 = i126 & 93;
            int i14111 = -(-((i126 ^ 93) | i14110));
            int i14112 = (i14110 ^ i14111) + ((i14110 & i14111) << 1);
            int i14113 = i14112 ^ (-92);
            int i14114 = (i14112 & (-92)) << 1;
            i126 = ((i14113 | i14114) << 1) - (i14113 ^ i14114);
            int i14115 = f56580w0;
            int i14116 = ((i14115 ^ 35) | (i14115 & 35)) << 1;
            int i14117 = -((i14115 & (-36)) | (35 & (~i14115)));
            int i14118 = (i14116 & i14117) + (i14117 | i14116);
            v0 = i14118 % 128;
            int i14119 = i14118 % 2;
        }
        if (!z13) {
            throw new InvalidKeyException("no matching key found");
        }
        int i150 = v0;
        int i151 = ((i150 ^ 33) | (i150 & 33)) << 1;
        int i152 = -(((~i150) & 33) | (i150 & (-34)));
        int i153 = (i151 & i152) + (i152 | i151);
        f56580w0 = i153 % 128;
        int i154 = i153 % 2;
    }

    public static /* synthetic */ Collection b(Object[] objArr) throws CertificateParsingException {
        int i10;
        int i11;
        int i12;
        aiy aiyVar = (aiy) objArr[0];
        String str = (String) objArr[1];
        int i13 = v0;
        int i14 = i13 & 39;
        int i15 = ((i13 ^ 39) | i14) << 1;
        int i16 = -((i13 | 39) & (~i14));
        int i17 = (i15 & i16) + (i16 | i15);
        f56580w0 = i17 % 128;
        int i18 = i17 % 2;
        byte[] bArr = (byte[]) d(new Object[]{aiyVar, str}, -1797988991, 1797988999, (int) System.currentTimeMillis());
        if (bArr == null) {
            int i19 = v0;
            int i20 = i19 ^ 67;
            int i21 = ((((i19 & 67) | i20) << 1) - (~(-i20))) - 1;
            int i22 = i21 % 128;
            f56580w0 = i22;
            if (i21 % 2 == 0) {
                throw null;
            }
            int i23 = i22 & 85;
            int i24 = (((i22 ^ 85) | i23) << 1) - ((i22 | 85) & (~i23));
            v0 = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration dividerPadding = ((aed) aed.setY(new Object[]{bArr}, 691787085, -691787084, (int) System.currentTimeMillis())).setDividerPadding();
            int i26 = f56580w0;
            int i27 = i26 & 29;
            int i28 = ((i26 | 29) & (~i27)) + (i27 << 1);
            v0 = i28 % 128;
            while (true) {
                int i29 = i28 % 2;
                while (true) {
                    if (!dividerPadding.hasMoreElements()) {
                        if (arrayList.size() != 0) {
                            Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
                            int i30 = v0;
                            int i31 = i30 & 21;
                            int i32 = i30 | 21;
                            int i33 = (i31 & i32) + (i32 | i31);
                            f56580w0 = i33 % 128;
                            int i34 = i33 % 2;
                            return collectionUnmodifiableCollection;
                        }
                        int i35 = f56580w0;
                        int i36 = (i35 ^ 71) + ((i35 & 71) << 1);
                        int i37 = i36 % 128;
                        v0 = i37;
                        int i38 = i36 % 2;
                        int i39 = (-2) - ((i37 + 92) ^ (-1));
                        f56580w0 = i39 % 128;
                        int i40 = i39 % 2;
                        return null;
                    }
                    ajg ajgVar = (ajg) ajg.setY(new Object[]{dividerPadding.nextElement()}, -614136404, 614136407, (int) System.currentTimeMillis());
                    ArrayList arrayList2 = new ArrayList();
                    int iIntValue = ((Integer) ajg.setY(new Object[]{ajgVar}, -1465077207, 1465077209, System.identityHashCode(ajgVar))).intValue();
                    arrayList2.add((Integer) beq.setY(new Object[]{Integer.valueOf(iIntValue)}, 843618426, -843618423, iIntValue));
                    switch (((Integer) ajg.setY(new Object[]{ajgVar}, -1465077207, 1465077209, System.identityHashCode(ajgVar))).intValue()) {
                        case 0:
                        case 3:
                        case 5:
                            arrayList2.add(ajgVar.setAlwaysDrawnWithCacheEnabled());
                            int i41 = f56580w0;
                            i10 = i41 & 33;
                            i11 = -(-((i41 ^ 33) | i10));
                            i12 = (i10 - (~i11)) - 1;
                            v0 = i12 % 128;
                            int i42 = i12 % 2;
                            arrayList.add(Collections.unmodifiableList(arrayList2));
                            i28 = v0 + 23;
                            f56580w0 = i28 % 128;
                            break;
                        case 1:
                        case 2:
                        case 6:
                            arrayList2.add(((aei) ((add) ajg.setY(new Object[]{ajgVar}, -1317152162, 1317152162, System.identityHashCode(ajgVar)))).setOnFocusChangeListener());
                            int i43 = f56580w0;
                            int i44 = i43 & 5;
                            int i45 = (i43 | 5) & (~i44);
                            int i46 = i44 << 1;
                            int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
                            v0 = i47 % 128;
                            int i48 = i47 % 2;
                            arrayList.add(Collections.unmodifiableList(arrayList2));
                            i28 = v0 + 23;
                            f56580w0 = i28 % 128;
                            break;
                        case 4:
                            arrayList2.add(ain.setX(aiv.setDividerPadding, (add) ajg.setY(new Object[]{ajgVar}, -1317152162, 1317152162, System.identityHashCode(ajgVar))).toString());
                            int i49 = f56580w0;
                            i10 = i49 ^ 109;
                            i11 = (i49 & 109) << 1;
                            i12 = (i10 - (~i11)) - 1;
                            v0 = i12 % 128;
                            int i410 = i12 % 2;
                            arrayList.add(Collections.unmodifiableList(arrayList2));
                            i28 = v0 + 23;
                            f56580w0 = i28 % 128;
                            break;
                        case 7:
                            ads adsVar = (ads) ads.setDividerPadding(new Object[]{(add) ajg.setY(new Object[]{ajgVar}, -1317152162, 1317152162, System.identityHashCode(ajgVar))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                            try {
                                String hostAddress = InetAddress.getByAddress((byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))).getHostAddress();
                                int i50 = f56580w0;
                                int i51 = i50 & 99;
                                int i52 = ((i50 ^ 99) | i51) << 1;
                                int i53 = -((i50 | 99) & (~i51));
                                int i54 = (i52 & i53) + (i53 | i52);
                                v0 = i54 % 128;
                                int i55 = i54 % 2;
                                arrayList2.add(hostAddress);
                                int i56 = f56580w0;
                                int i57 = (i56 & 20) + (i56 | 20);
                                int i58 = (i57 ^ (-1)) + (i57 << 1);
                                v0 = i58 % 128;
                                int i59 = i58 % 2;
                                arrayList.add(Collections.unmodifiableList(arrayList2));
                                i28 = v0 + 23;
                                f56580w0 = i28 % 128;
                            } catch (UnknownHostException unused) {
                            }
                            break;
                        case 8:
                            adu aduVar = (adu) adu.setCompoundDrawableTintBlendMode(new Object[]{(add) ajg.setY(new Object[]{ajgVar}, -1317152162, 1317152162, System.identityHashCode(ajgVar))}, -892573455, 892573460, (int) System.currentTimeMillis());
                            arrayList2.add((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                            int i60 = v0;
                            i12 = ((i60 & 74) + (i60 | 74)) - 1;
                            f56580w0 = i12 % 128;
                            int i411 = i12 % 2;
                            arrayList.add(Collections.unmodifiableList(arrayList2));
                            i28 = v0 + 23;
                            f56580w0 = i28 % 128;
                            break;
                        default:
                            StringBuilder sb2 = new StringBuilder("Bad tag number: ");
                            sb2.append(ajgVar.setX());
                            throw new IOException(sb2.toString());
                    }
                }
            }
        } catch (Exception e5) {
            throw new CertificateParsingException(e5.getMessage());
        }
    }

    public static byte[] c(aiy aiyVar, String str) {
        return (byte[]) d(new Object[]{aiyVar, str}, -1797988991, 1797988999, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:102:0x0514  */
    /* JADX WARN: Code duplicated, block: B:104:0x0524  */
    /* JADX WARN: Code duplicated, block: B:106:0x0568  */
    /* JADX WARN: Code duplicated, block: B:107:0x056c  */
    /* JADX WARN: Code duplicated, block: B:115:0x05e5 A[PHI: r1
      0x05e5: PHI (r1v8 com.mypinpad.tsdk.i.aje) = (r1v7 com.mypinpad.tsdk.i.aje), (r1v24 com.mypinpad.tsdk.i.aje) binds: [B:114:0x05e3, B:111:0x05c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0602  */
    /* JADX WARN: Code duplicated, block: B:119:0x0647  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x035c  */
    /* JADX WARN: Code duplicated, block: B:64:0x037f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0381  */
    /* JADX WARN: Code duplicated, block: B:68:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:70:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x03db  */
    /* JADX WARN: Code duplicated, block: B:74:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x0405  */
    /* JADX WARN: Code duplicated, block: B:84:0x0439  */
    /* JADX WARN: Code duplicated, block: B:86:0x043b  */
    /* JADX WARN: Code duplicated, block: B:88:0x044b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0467  */
    /* JADX WARN: Code duplicated, block: B:92:0x0486  */
    /* JADX WARN: Code duplicated, block: B:94:0x049f  */
    /* JADX WARN: Code duplicated, block: B:96:0x04af  */
    /* JADX WARN: Code duplicated, block: B:98:0x04c0  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0402, code lost:
    
        if ((!r0) != true) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0419, code lost:
    
        if (((com.mypinpad.tsdk.isolation.add) com.mypinpad.tsdk.isolation.aiw.setOnFocusChangeListener(new java.lang.Object[]{r1}, -513456911, 513456913, java.lang.System.identityHashCode(r1))).equals(com.mypinpad.tsdk.isolation.afq.setY) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x041b, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.j1.f56580w0;
        r1 = r0 ^ 21;
        r0 = r0 & 21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(java.lang.Object[] r16, int r17, int r18, int r19) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException, java.security.cert.CertificateException, java.security.NoSuchProviderException {
        /*
            Method dump skipped, instruction units count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.j1.d(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        int i10 = v0;
        int i11 = i10 & 117;
        int i12 = ((((i10 ^ 117) | i11) << 1) - (~(-((i10 | 117) & (~i11))))) - 1;
        f56580w0 = i12 % 128;
        int i13 = i12 % 2;
        long time = date.getTime();
        long time2 = getNotAfter().getTime();
        aiy aiyVar = this.f56582q0;
        if (time > time2) {
            StringBuilder sb2 = new StringBuilder("certificate expired on ");
            ajo navBarTitleString = aiyVar.getNavBarTitleString();
            sb2.append((String) ajo.setCompoundDrawableTintBlendMode(new Object[]{navBarTitleString}, 509972914, -509972911, System.identityHashCode(navBarTitleString)));
            throw new CertificateExpiredException(sb2.toString());
        }
        if (date.getTime() >= getNotBefore().getTime()) {
            System.identityHashCode(this);
            System.identityHashCode(this);
        } else {
            StringBuilder sb3 = new StringBuilder("certificate not valid till ");
            ajo y7 = aiyVar.setY();
            sb3.append((String) ajo.setCompoundDrawableTintBlendMode(new Object[]{y7}, 509972914, -509972911, System.identityHashCode(y7)));
            throw new CertificateNotYetValidException(sb3.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        int i10 = f56580w0;
        int i11 = (i10 & 83) + (i10 | 83);
        v0 = i11 % 128;
        int i12 = i11 % 2;
        aiu aiuVar = this.f56583r0;
        if (aiuVar != null) {
            int i13 = (i10 & 59) + (i10 | 59);
            v0 = i13 % 128;
            int i14 = i13 % 2;
            if (((Boolean) aiu.setOnFocusChangeListener(new Object[]{aiuVar}, 137517095, -137517093, System.identityHashCode(aiuVar))).booleanValue()) {
                adp adpVar = (adp) aiu.setOnFocusChangeListener(new Object[]{aiuVar}, 1851547541, -1851547540, System.identityHashCode(aiuVar));
                if (adpVar != null) {
                    int iIntValue = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -910726606, 910726613, System.identityHashCode(adpVar))).intValue();
                    int i15 = v0;
                    int i16 = (i15 ^ 56) + ((i15 & 56) << 1);
                    int i17 = (i16 ^ (-1)) + (i16 << 1);
                    f56580w0 = i17 % 128;
                    int i18 = i17 % 2;
                    return iIntValue;
                }
                int i19 = f56580w0;
                int i20 = ((-1) << 1) - ((i19 + 88) ^ (-1));
                v0 = i20 % 128;
                int i21 = i20 % 2;
                int i22 = i19 & 85;
                int i23 = (i22 - (~(-(-((i19 ^ 85) | i22))))) - 1;
                v0 = i23 % 128;
                int i24 = i23 % 2;
                return Integer.MAX_VALUE;
            }
        }
        int i25 = v0;
        int i26 = i25 & 95;
        int i27 = ((i25 | 95) & (~i26)) + (i26 << 1);
        f56580w0 = i27 % 128;
        if (i27 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0111 A[PHI: r7
      0x0111: PHI (r7v22 com.mypinpad.tsdk.i.adu) = (r7v16 com.mypinpad.tsdk.i.adu), (r7v28 com.mypinpad.tsdk.i.adu) binds: [B:22:0x010f, B:19:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        adu aduVar;
        int i10 = v0;
        int i11 = i10 & 93;
        int i12 = ((((i10 ^ 93) | i11) << 1) - (~(-((i10 | 93) & (~i11))))) - 1;
        f56580w0 = i12 % 128;
        if (i12 % 2 != 0 ? getVersion() == 3 : getVersion() == 2) {
            HashSet hashSet = new HashSet();
            aiy aiyVar = this.f56582q0;
            ajm ajmVar = (ajm) aiy.setDividerPadding(new Object[]{aiyVar}, -1226305897, 1226305905, System.identityHashCode(aiyVar));
            aje ajeVar = (aje) ajm.setOnFocusChangeListener(new Object[]{ajmVar}, -1752564356, 1752564363, System.identityHashCode(ajmVar));
            if (ajeVar != null) {
                int i13 = v0;
                int i14 = i13 & 25;
                int i15 = (((i13 | 25) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
                f56580w0 = i15 % 128;
                if (i15 % 2 == 0) {
                    throw null;
                }
                Enumeration enumeration = (Enumeration) aje.setY(new Object[]{ajeVar}, -851154266, 851154268, System.identityHashCode(ajeVar));
                int i16 = f56580w0;
                int i17 = i16 & 23;
                int i18 = (i16 | 23) & (~i17);
                int i19 = i17 << 1;
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                v0 = i20 % 128;
                int i21 = i20 % 2;
                while (!(!enumeration.hasMoreElements())) {
                    int i22 = v0;
                    int i23 = ((i22 | 37) << 1) - (i22 ^ 37);
                    f56580w0 = i23 % 128;
                    if (i23 % 2 == 0) {
                        aduVar = (adu) enumeration.nextElement();
                        ajc ajcVar = (ajc) aje.setY(new Object[]{ajeVar, aduVar}, -814074534, 814074535, System.identityHashCode(ajeVar));
                        int i24 = 53 / 0;
                        if (((Boolean) ajc.setX(new Object[]{ajcVar}, -1985615408, 1985615412, System.identityHashCode(ajcVar))).booleanValue()) {
                            hashSet.add((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                            int i25 = v0;
                            int i26 = i25 & 11;
                            int i27 = ((i25 ^ 11) | i26) << 1;
                            int i28 = -((i25 | 11) & (~i26));
                            int i29 = (i27 & i28) + (i28 | i27);
                            f56580w0 = i29 % 128;
                            int i30 = i29 % 2;
                        }
                    } else {
                        aduVar = (adu) enumeration.nextElement();
                        ajc ajcVar2 = (ajc) aje.setY(new Object[]{ajeVar, aduVar}, -814074534, 814074535, System.identityHashCode(ajeVar));
                        if (!(!((Boolean) ajc.setX(new Object[]{ajcVar2}, -1985615408, 1985615412, System.identityHashCode(ajcVar2))).booleanValue())) {
                            hashSet.add((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                            int i210 = v0;
                            int i211 = i210 & 11;
                            int i212 = ((i210 ^ 11) | i211) << 1;
                            int i213 = -((i210 | 11) & (~i211));
                            int i214 = (i212 & i213) + (i213 | i212);
                            f56580w0 = i214 % 128;
                            int i31 = i214 % 2;
                        }
                    }
                    int i32 = f56580w0;
                    int i33 = (((i32 | 92) << 1) - (i32 ^ 92)) - 1;
                    v0 = i33 % 128;
                    int i34 = i33 % 2;
                }
                int i35 = f56580w0 + 75;
                v0 = i35 % 128;
                int i36 = i35 % 2;
                return hashSet;
            }
        }
        int i37 = v0;
        int i38 = (i37 & (-32)) | ((~i37) & 31);
        int i39 = (i37 & 31) << 1;
        int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
        f56580w0 = i40 % 128;
        if (i40 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
    
        if ((r3 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        r1 = (com.mypinpad.tsdk.isolation.aed) com.mypinpad.tsdk.isolation.aed.setY(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.ady) com.mypinpad.tsdk.isolation.ady.setNavigationOnClickListener(new java.lang.Object[]{r1}, -1692126728, 1692126730, (int) java.lang.System.currentTimeMillis())}, 691787085, -691787084, (int) java.lang.System.currentTimeMillis());
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0092, code lost:
    
        r4 = com.mypinpad.tsdk.isolation.j1.f56580w0;
        r5 = (r4 & 67) + (r4 | 67);
        com.mypinpad.tsdk.isolation.j1.v0 = r5 % 128;
        r5 = r5 % 2;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (r4 == r1.setCompoundDrawableTintBlendMode()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r5 = com.mypinpad.tsdk.isolation.j1.f56580w0 + 125;
        com.mypinpad.tsdk.isolation.j1.v0 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
    
        if ((r5 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b6, code lost:
    
        r5 = (com.mypinpad.tsdk.isolation.adu) r1.setX(r4);
        r3.add((java.lang.String) com.mypinpad.tsdk.isolation.adu.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5}, 412071809, -412071801, java.lang.System.identityHashCode(r5)));
        r4 = r4 + 61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d0, code lost:
    
        r5 = (com.mypinpad.tsdk.isolation.adu) r1.setX(r4);
        r3.add((java.lang.String) com.mypinpad.tsdk.isolation.adu.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5}, 412071809, -412071801, java.lang.System.identityHashCode(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e7, code lost:
    
        r5 = r4 & (-67);
        r4 = ((r4 | (-67)) & (~r5)) + (r5 << 1);
        r5 = r4 & 68;
        r4 = r5 + ((r4 ^ 68) | r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f6, code lost:
    
        r5 = com.mypinpad.tsdk.isolation.j1.f56580w0 + 69;
        com.mypinpad.tsdk.isolation.j1.v0 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0100, code lost:
    
        r1 = java.util.Collections.unmodifiableList(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0104, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.j1.v0;
        r4 = (r3 ^ 123) + ((r3 & 123) << 1);
        com.mypinpad.tsdk.isolation.j1.f56580w0 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0112, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011a, code lost:
    
        throw new java.security.cert.CertificateParsingException("error processing extended key usage extension");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.j1.f56580w0;
        r3 = ((((r1 ^ 11) | (r1 & 11)) << 1) - (~(-(((~r1) & 11) | (r1 & (-12)))))) - 1;
        com.mypinpad.tsdk.isolation.j1.v0 = r3 % 128;
     */
    @Override // java.security.cert.X509Certificate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getExtendedKeyUsage() throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.j1.getExtendedKeyUsage():java.util.List");
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        int i10 = f56580w0;
        int i11 = ((i10 & (-44)) | ((~i10) & 43)) + ((i10 & 43) << 1);
        v0 = i11 % 128;
        int i12 = i11 % 2;
        ads adsVar = (ads) d(new Object[]{this.f56582q0, str}, 548699810, -548699807, (int) System.currentTimeMillis());
        if (adsVar == null) {
            int i13 = v0;
            int i14 = ((-1) << 1) - ((-1) ^ ((i13 & 28) + (i13 | 28)));
            f56580w0 = i14 % 128;
            if (i14 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i15 = f56580w0;
        int i16 = ((i15 | 105) << 1) - (i15 ^ 105);
        v0 = i16 % 128;
        try {
            if (i16 % 2 != 0) {
                adsVar.setAlwaysDrawnWithCacheEnabled();
                throw null;
            }
            byte[] alwaysDrawnWithCacheEnabled = adsVar.setAlwaysDrawnWithCacheEnabled();
            int i17 = ((-1) << 1) - ((-1) ^ (f56580w0 + 40));
            v0 = i17 % 128;
            if (i17 % 2 == 0) {
                return alwaysDrawnWithCacheEnabled;
            }
            throw null;
        } catch (Exception e5) {
            StringBuilder sb2 = new StringBuilder("error parsing ");
            sb2.append(e5.getMessage());
            throw ((IllegalStateException) beo.setCompoundDrawableTintBlendMode(new Object[]{sb2.toString(), e5}, -1445130895, 1445130896, (int) System.currentTimeMillis()));
        }
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getIssuerAlternativeNames() throws CertificateParsingException {
        int i10 = v0 + 27;
        f56580w0 = i10 % 128;
        int i11 = i10 % 2;
        aiy aiyVar = this.f56582q0;
        if (i11 == 0) {
            adu aduVar = ajc.setX;
            throw null;
        }
        adu aduVar2 = ajc.setX;
        Collection collection = (Collection) d(new Object[]{aiyVar, (String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar2}, 412071809, -412071801, System.identityHashCode(aduVar2))}, -616722774, 616722775, (int) System.currentTimeMillis());
        int i12 = f56580w0;
        int i13 = (((i12 | 90) << 1) - (i12 ^ 90)) - 1;
        v0 = i13 % 128;
        int i14 = i13 % 2;
        return collection;
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        apd apdVar = new apd(this.f56582q0.setX());
        int i10 = f56580w0;
        int i11 = i10 & 75;
        int i12 = (i10 ^ 75) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        v0 = i13 % 128;
        if (i13 % 2 == 0) {
            return apdVar;
        }
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        byte[] bArr;
        boolean[] zArr;
        int i10;
        boolean z10;
        int i11 = v0 + 113;
        f56580w0 = i11 % 128;
        int i12 = i11 % 2;
        aiy aiyVar = this.f56582q0;
        if (i12 == 0) {
            ajm ajmVar = (ajm) aiy.setDividerPadding(new Object[]{aiyVar}, -1226305897, 1226305905, System.identityHashCode(aiyVar));
            throw null;
        }
        ajm ajmVar2 = (ajm) aiy.setDividerPadding(new Object[]{aiyVar}, -1226305897, 1226305905, System.identityHashCode(aiyVar));
        acz aczVar = (acz) ajm.setOnFocusChangeListener(new Object[]{ajmVar2}, 122086851, -122086840, System.identityHashCode(ajmVar2));
        if (aczVar == null) {
            int i13 = v0;
            int i14 = ((-1) << 1) - ((-1) ^ ((i13 ^ 20) + ((i13 & 20) << 1)));
            f56580w0 = i14 % 128;
            int i15 = i14 % 2;
            return null;
        }
        int i16 = v0;
        int i17 = i16 & 35;
        int i18 = i17 + ((i16 ^ 35) | i17);
        f56580w0 = i18 % 128;
        if (i18 % 2 == 0) {
            bArr = (byte[]) acz.setDividerPadding(new Object[]{aczVar}, -2004692391, 2004692392, System.identityHashCode(aczVar));
            zArr = new boolean[((bArr.length << 2) - (~(-(-((Integer) acz.setDividerPadding(new Object[]{aczVar}, 2120330947, -2120330940, System.identityHashCode(aczVar))).intValue())))) - 1];
            i10 = 1;
        } else {
            bArr = (byte[]) acz.setDividerPadding(new Object[]{aczVar}, -2004692391, 2004692392, System.identityHashCode(aczVar));
            zArr = new boolean[(bArr.length << 3) - ((Integer) acz.setDividerPadding(new Object[]{aczVar}, 2120330947, -2120330940, System.identityHashCode(aczVar))).intValue()];
            i10 = 0;
        }
        int i19 = v0;
        int i20 = (i19 ^ 77) + ((i19 & 77) << 1);
        f56580w0 = i20 % 128;
        int i21 = i20 % 2;
        while (i10 != zArr.length) {
            int i22 = v0;
            int i23 = i22 & 79;
            int i24 = i22 | 79;
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            f56580w0 = i25 % 128;
            int i26 = i25 % 2;
            if ((bArr[i10 / 8] & (128 >>> (i10 % 8))) != 0) {
                int i27 = i22 & 89;
                int i28 = -(-((i22 ^ 89) | i27));
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                f56580w0 = i29 % 128;
                z10 = i29 % 2 != 0;
                int i30 = ((i22 ^ 90) + ((i22 & 90) << 1)) - 1;
                f56580w0 = i30 % 128;
                int i31 = i30 % 2;
            } else {
                int i32 = i22 & 101;
                int i33 = (i32 - (~((i22 ^ 101) | i32))) - 1;
                f56580w0 = i33 % 128;
                int i34 = i33 % 2;
                z10 = false;
            }
            zArr[i10] = z10;
            i10 = (i10 | 1) + (i10 & 1);
            int i35 = f56580w0;
            int i36 = (i35 & (-60)) | ((~i35) & 59);
            int i37 = (i35 & 59) << 1;
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            v0 = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = v0;
        int i41 = (i40 ^ 81) + ((i40 & 81) << 1);
        f56580w0 = i41 % 128;
        if (i41 % 2 != 0) {
            return zArr;
        }
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            aiy aiyVar = this.f56582q0;
            ain ainVar = (ain) aiy.setDividerPadding(new Object[]{aiyVar}, 405204446, -405204435, System.identityHashCode(aiyVar));
            X500Principal x500Principal = new X500Principal((byte[]) adw.setOnLongClickListener(new Object[]{ainVar, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(ainVar)));
            int i10 = f56580w0;
            int i11 = ((i10 & 78) + (i10 | 78)) - 1;
            v0 = i11 % 128;
            int i12 = i11 % 2;
            return x500Principal;
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        int i10 = v0 + 23;
        f56580w0 = i10 % 128;
        int i11 = i10 % 2;
        boolean[] zArr = (boolean[]) bek.setOnFocusChangeListener(new Object[]{this.f56584s0}, 1612495211, -1612495201, (int) System.currentTimeMillis());
        int i12 = v0;
        int i13 = i12 & 15;
        int i14 = (i12 | 15) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = (i14 & i15) + (i15 | i14);
        f56580w0 = i16 % 128;
        if (i16 % 2 != 0) {
            return zArr;
        }
        throw null;
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        int i10 = f56580w0;
        int i11 = i10 & 13;
        int i12 = -(-(i10 | 13));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        v0 = i13 % 128;
        int i14 = i13 % 2;
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            aiy aiyVar = this.f56582q0;
            ajm ajmVar = (ajm) aiy.setDividerPadding(new Object[]{aiyVar}, -1226305897, 1226305905, System.identityHashCode(aiyVar));
            aje ajeVar = (aje) ajm.setOnFocusChangeListener(new Object[]{ajmVar}, -1752564356, 1752564363, System.identityHashCode(ajmVar));
            if (ajeVar != null) {
                int i15 = f56580w0;
                int i16 = ((i15 & 26) + (i15 | 26)) - 1;
                v0 = i16 % 128;
                int i17 = i16 % 2;
                Enumeration enumeration = (Enumeration) aje.setY(new Object[]{ajeVar}, -851154266, 851154268, System.identityHashCode(ajeVar));
                int i18 = v0 + 9;
                while (true) {
                    f56580w0 = i18 % 128;
                    int i19 = i18 % 2;
                    if (!enumeration.hasMoreElements()) {
                        int i20 = f56580w0 + 15;
                        v0 = i20 % 128;
                        int i21 = i20 % 2;
                        return hashSet;
                    }
                    int i22 = v0 + 19;
                    f56580w0 = i22 % 128;
                    int i23 = i22 % 2;
                    adu aduVar = (adu) enumeration.nextElement();
                    ajc ajcVar = (ajc) aje.setY(new Object[]{ajeVar, aduVar}, -814074534, 814074535, System.identityHashCode(ajeVar));
                    if (!((Boolean) ajc.setX(new Object[]{ajcVar}, -1985615408, 1985615412, System.identityHashCode(ajcVar))).booleanValue()) {
                        int i24 = f56580w0;
                        int i25 = ((i24 | 23) << 1) - (i24 ^ 23);
                        v0 = i25 % 128;
                        int i26 = i25 % 2;
                        hashSet.add((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                        int i27 = v0;
                        int i28 = i27 & 57;
                        int i29 = -(-((i27 ^ 57) | i28));
                        int i30 = (i28 & i29) + (i29 | i28);
                        f56580w0 = i30 % 128;
                        int i31 = i30 % 2;
                    }
                    i18 = v0 + 67;
                }
            }
        }
        System.identityHashCode(this);
        System.identityHashCode(this);
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        int i10 = f56580w0;
        int i11 = (i10 ^ 39) + ((i10 & 39) << 1);
        v0 = i11 % 128;
        int i12 = i11 % 2;
        aiy aiyVar = this.f56582q0;
        if (i12 != 0) {
            ajo ajoVar = (ajo) aiy.setDividerPadding(new Object[]{aiyVar}, -664066555, 664066561, System.identityHashCode(aiyVar));
            throw null;
        }
        ajo ajoVar2 = (ajo) aiy.setDividerPadding(new Object[]{aiyVar}, -664066555, 664066561, System.identityHashCode(aiyVar));
        Date date = (Date) ajo.setCompoundDrawableTintBlendMode(new Object[]{ajoVar2}, 1704230957, -1704230955, System.identityHashCode(ajoVar2));
        int i13 = v0;
        int i14 = ((i13 ^ 80) + ((i13 & 80) << 1)) - 1;
        f56580w0 = i14 % 128;
        int i15 = i14 % 2;
        return date;
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        int i10 = v0;
        int i11 = i10 ^ 27;
        int i12 = ((i10 & 27) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f56580w0 = i14 % 128;
        int i15 = i14 % 2;
        aiy aiyVar = this.f56582q0;
        ajo ajoVar = (ajo) aiy.setDividerPadding(new Object[]{aiyVar}, -125844688, 125844688, System.identityHashCode(aiyVar));
        Date date = (Date) ajo.setCompoundDrawableTintBlendMode(new Object[]{ajoVar}, 1704230957, -1704230955, System.identityHashCode(ajoVar));
        int i16 = v0;
        int i17 = ((i16 & (-72)) | ((~i16) & 71)) + ((i16 & 71) << 1);
        f56580w0 = i17 % 128;
        if (i17 % 2 != 0) {
            return date;
        }
        throw null;
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        int i10 = f56580w0;
        int i11 = ((i10 & (-76)) | ((~i10) & 75)) + ((i10 & 75) << 1);
        v0 = i11 % 128;
        int i12 = i11 % 2;
        aiy aiyVar = this.f56582q0;
        try {
            if (i12 != 0) {
                throw null;
            }
            PublicKey publicKey = (PublicKey) apc.setOnFocusChangeListener(new Object[]{(ajj) aiy.setDividerPadding(new Object[]{aiyVar}, 639043811, -639043802, System.identityHashCode(aiyVar))}, -334014382, 334014390, (int) System.currentTimeMillis());
            int i13 = f56580w0;
            int i14 = ((i13 | 17) << 1) - (i13 ^ 17);
            v0 = i14 % 128;
            int i15 = i14 % 2;
            return publicKey;
        } catch (IOException e5) {
            StringBuilder sb2 = new StringBuilder("failed to recover public key: ");
            sb2.append(e5.getMessage());
            throw ((IllegalStateException) beo.setCompoundDrawableTintBlendMode(new Object[]{sb2.toString(), e5}, -1445130895, 1445130896, (int) System.currentTimeMillis()));
        }
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        int i10 = v0;
        int i11 = i10 & 51;
        int i12 = ((i10 ^ 51) | i11) << 1;
        int i13 = -((i10 | 51) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f56580w0 = i14 % 128;
        int i15 = i14 % 2;
        aiy aiyVar = this.f56582q0;
        if (i15 == 0) {
            adp adpVar = (adp) aiy.setDividerPadding(new Object[]{aiyVar}, -1898177481, 1898177491, System.identityHashCode(aiyVar));
            throw null;
        }
        adp adpVar2 = (adp) aiy.setDividerPadding(new Object[]{aiyVar}, -1898177481, 1898177491, System.identityHashCode(aiyVar));
        BigInteger bigInteger = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar2}, 1599682974, -1599682960, System.identityHashCode(adpVar2));
        int i16 = v0;
        int i17 = ((-1) << 1) - ((-1) ^ (((i16 | 94) << 1) - (i16 ^ 94)));
        f56580w0 = i17 % 128;
        if (i17 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        int i10 = v0;
        int i11 = ((i10 & 98) + (i10 | 98)) - 1;
        f56580w0 = i11 % 128;
        if (i11 % 2 != 0) {
            return this.f56585t0;
        }
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        String str;
        int i10 = v0;
        int i11 = i10 & 13;
        int i12 = -(-(i10 | 13));
        int i13 = (i11 & i12) + (i12 | i11);
        f56580w0 = i13 % 128;
        int i14 = i13 % 2;
        aiy aiyVar = this.f56582q0;
        if (i14 == 0) {
            aiw aiwVar = (aiw) aiy.setDividerPadding(new Object[]{aiyVar}, -434839086, 434839093, System.identityHashCode(aiyVar));
            adu aduVar = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar));
            str = (String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar));
            int i15 = 61 / 0;
        } else {
            aiw aiwVar2 = (aiw) aiy.setDividerPadding(new Object[]{aiyVar}, -434839086, 434839093, System.identityHashCode(aiyVar));
            adu aduVar2 = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -661220858, 661220861, System.identityHashCode(aiwVar2));
            str = (String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar2}, 412071809, -412071801, System.identityHashCode(aduVar2));
        }
        int i16 = v0;
        int i17 = i16 | 63;
        int i18 = i17 << 1;
        int i19 = -((~(i16 & 63)) & i17);
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        f56580w0 = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 28 / 0;
        }
        return str;
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        int i10 = v0;
        int i11 = i10 & 109;
        int i12 = (i10 | 109) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f56580w0 = i14 % 128;
        int i15 = i14 % 2;
        byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{this.f56586u0}, -150521869, 150521882, (int) System.currentTimeMillis());
        int i16 = v0 + 9;
        f56580w0 = i16 % 128;
        int i17 = i16 % 2;
        return bArr;
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        int i10 = f56580w0;
        int i11 = ((i10 ^ 6) + ((i10 & 6) << 1)) - 1;
        v0 = i11 % 128;
        int i12 = i11 % 2;
        aiy aiyVar = this.f56582q0;
        acz aczVar = (acz) aiy.setDividerPadding(new Object[]{aiyVar}, -1548652488, 1548652492, System.identityHashCode(aiyVar));
        byte[] bArr = (byte[]) acz.setDividerPadding(new Object[]{aczVar}, 541981427, -541981422, System.identityHashCode(aczVar));
        int i13 = v0 + 67;
        f56580w0 = i13 % 128;
        if (i13 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getSubjectAlternativeNames() throws CertificateParsingException {
        int i10 = f56580w0;
        int i11 = ((i10 ^ 5) | (i10 & 5)) << 1;
        int i12 = -(((~i10) & 5) | (i10 & (-6)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        v0 = i13 % 128;
        int i14 = i13 % 2;
        aiy aiyVar = this.f56582q0;
        if (i14 == 0) {
            adu aduVar = ajc.setCompoundDrawableTintBlendMode;
            return (Collection) d(new Object[]{aiyVar, (String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar))}, -616722774, 616722775, (int) System.currentTimeMillis());
        }
        adu aduVar2 = ajc.setCompoundDrawableTintBlendMode;
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        apd apdVar = new apd(this.f56582q0.setLayoutAnimation());
        int i10 = f56580w0;
        int i11 = ((i10 & 105) - (~(-(-(i10 | 105))))) - 1;
        v0 = i11 % 128;
        if (i11 % 2 == 0) {
            return apdVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c1, code lost:
    
        if (r3 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c3, code lost:
    
        r4 = com.mypinpad.tsdk.isolation.j1.f56580w0;
        r5 = r4 & 47;
        r5 = r5 + ((r4 ^ 47) | r5);
        r8 = r5 % 128;
        com.mypinpad.tsdk.isolation.j1.v0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d1, code lost:
    
        if ((r5 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00dc, code lost:
    
        if ((r1[r3 % 115] & ((r3 >>> 108) * 26788)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ea, code lost:
    
        if ((r1[r3 / 8] & (128 >>> (r3 % 8))) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ec, code lost:
    
        r4 = ((r8 ^ 92) + ((r8 & 92) << 1)) - 1;
        com.mypinpad.tsdk.isolation.j1.f56580w0 = r4 % 128;
        r4 = r4 % 2;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fc, code lost:
    
        r5 = ((r4 ^ 5) | (r4 & 5)) << 1;
        r4 = -(((~r4) & 5) | (r4 & (-6)));
        r8 = (r5 ^ r4) + ((r4 & r5) << 1);
        com.mypinpad.tsdk.isolation.j1.v0 = r8 % 128;
        r8 = r8 % 2;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0115, code lost:
    
        r0[r3] = r4;
        r3 = r3 + 1;
        r4 = com.mypinpad.tsdk.isolation.j1.v0;
        r5 = (r4 & (-62)) | ((~r4) & 61);
        r4 = -(-((r4 & 61) << 1));
        r8 = ((r5 | r4) << 1) - (r4 ^ r5);
        com.mypinpad.tsdk.isolation.j1.f56580w0 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0132, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.j1.v0 + 97;
        com.mypinpad.tsdk.isolation.j1.f56580w0 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x013c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x013d, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.j1.f56580w0;
        r1 = r0 & 77;
        r1 = r1 + ((r0 ^ 77) | r1);
        com.mypinpad.tsdk.isolation.j1.v0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014c, code lost:
    
        if ((r1 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x014e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x014f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005a, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.j1.v0;
        r3 = r1 & 7;
        r2 = (((r1 ^ 7) | r3) << 1) - ((r1 | 7) & (~r3));
        com.mypinpad.tsdk.isolation.j1.f56580w0 = r2 % 128;
        r2 = r2 % 2;
        r1 = (byte[]) com.mypinpad.tsdk.isolation.acz.setDividerPadding(new java.lang.Object[]{r0}, -2004692391, 2004692392, java.lang.System.identityHashCode(r0));
        r2 = r1.length << 3;
        r0 = -((java.lang.Integer) com.mypinpad.tsdk.isolation.acz.setDividerPadding(new java.lang.Object[]{r0}, 2120330947, -2120330940, java.lang.System.identityHashCode(r0))).intValue();
        r4 = r2 & r0;
        r3 = ((r2 ^ r0) | r4) << 1;
        r0 = -((r0 | r2) & (~r4));
        r2 = (r3 ^ r0) + ((r0 & r3) << 1);
        r0 = new boolean[r2];
        r3 = com.mypinpad.tsdk.isolation.j1.v0;
        r4 = r3 & 95;
        r4 = (r4 - (~((r3 ^ 95) | r4))) - 1;
        com.mypinpad.tsdk.isolation.j1.f56580w0 = r4 % 128;
        r4 = r4 % 2;
        r3 = 0;
     */
    @Override // java.security.cert.X509Certificate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean[] getSubjectUniqueID() {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.j1.getSubjectUniqueID():boolean[]");
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            aiy aiyVar = this.f56582q0;
            ain ainVar = (ain) aiy.setDividerPadding(new Object[]{aiyVar}, 1424751201, -1424751200, System.identityHashCode(aiyVar));
            X500Principal x500Principal = new X500Principal((byte[]) adw.setOnLongClickListener(new Object[]{ainVar, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(ainVar)));
            int i10 = f56580w0;
            int i11 = ((i10 ^ 33) - (~((i10 & 33) << 1))) - 1;
            v0 = i11 % 128;
            int i12 = i11 % 2;
            return x500Principal;
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode subject DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        int i10 = v0 + 5;
        f56580w0 = i10 % 128;
        int i11 = i10 % 2;
        aiy aiyVar = this.f56582q0;
        try {
            if (i11 != 0) {
                ajm ajmVar = (ajm) aiy.setDividerPadding(new Object[]{aiyVar}, -1226305897, 1226305905, System.identityHashCode(aiyVar));
                return (byte[]) adw.setOnLongClickListener(new Object[]{ajmVar, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(ajmVar));
            }
            ajm ajmVar2 = (ajm) aiy.setDividerPadding(new Object[]{aiyVar}, -1226305897, 1226305905, System.identityHashCode(aiyVar));
            throw null;
        } catch (IOException e5) {
            throw new CertificateEncodingException(e5.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        int i10 = f56580w0 + 67;
        v0 = i10 % 128;
        int i11 = i10 % 2;
        aiy aiyVar = this.f56582q0;
        if (i11 == 0) {
            return ((Integer) aiy.setDividerPadding(new Object[]{aiyVar}, -411877937, 411877940, System.identityHashCode(aiyVar))).intValue();
        }
        ((Integer) aiy.setDividerPadding(new Object[]{aiyVar}, -411877937, 411877940, System.identityHashCode(aiyVar))).intValue();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x019f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0242  */
    /* JADX WARN: Code duplicated, block: B:63:0x02a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:86:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x028c A[SYNTHETIC] */
    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Enumeration enumeration;
        int i10;
        int i11;
        ajc ajcVar;
        int i12;
        int i13 = f56580w0;
        int i14 = i13 | 119;
        int i15 = i14 << 1;
        int i16 = -((~(i13 & 119)) & i14);
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        v0 = i17 % 128;
        if (i17 % 2 == 0 ? getVersion() == 3 : getVersion() == 4) {
            aiy aiyVar = this.f56582q0;
            ajm ajmVar = (ajm) aiy.setDividerPadding(new Object[]{aiyVar}, -1226305897, 1226305905, System.identityHashCode(aiyVar));
            aje ajeVar = (aje) ajm.setOnFocusChangeListener(new Object[]{ajmVar}, -1752564356, 1752564363, System.identityHashCode(ajmVar));
            if (ajeVar != null) {
                int i18 = f56580w0;
                int i19 = i18 & 9;
                int i20 = (i18 ^ 9) | i19;
                int i21 = (i19 & i20) + (i20 | i19);
                v0 = i21 % 128;
                if (i21 % 2 != 0) {
                    enumeration = (Enumeration) aje.setY(new Object[]{ajeVar}, -851154266, 851154268, System.identityHashCode(ajeVar));
                    int i22 = 68 / 0;
                } else {
                    enumeration = (Enumeration) aje.setY(new Object[]{ajeVar}, -851154266, 851154268, System.identityHashCode(ajeVar));
                }
                while (enumeration.hasMoreElements()) {
                    int i23 = f56580w0;
                    int i24 = i23 & 51;
                    int i25 = (i23 | 51) & (~i24);
                    int i26 = i24 << 1;
                    int i27 = (i25 & i26) + (i25 | i26);
                    v0 = i27 % 128;
                    if (i27 % 2 != 0) {
                        adu aduVar = (adu) enumeration.nextElement();
                        ((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setOnFocusChangeListener}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue();
                        throw null;
                    }
                    adu aduVar2 = (adu) enumeration.nextElement();
                    if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setOnFocusChangeListener}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                        int i28 = f56580w0;
                        int i29 = i28 & 87;
                        int i30 = ((i28 | 87) & (~i29)) + (i29 << 1);
                        v0 = i30 % 128;
                        if (i30 % 2 != 0) {
                            ((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setIncludeFontPadding}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue();
                            throw null;
                        }
                        if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setIncludeFontPadding}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue() && !((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.UiMessageCallbackKtWhenMappings}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                            int i31 = f56580w0;
                            int i32 = i31 & 81;
                            int i33 = i31 | 81;
                            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                            v0 = i34 % 128;
                            int i35 = i34 % 2;
                            adu aduVar3 = ajc.setCompoundDrawablePadding;
                            Object[] objArr = new Object[2];
                            if (i35 != 0) {
                                objArr[0] = aduVar2;
                                objArr[1] = aduVar3;
                                boolean zBooleanValue = ((Boolean) ady.setNavigationOnClickListener(objArr, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue();
                                int i36 = 2 / 0;
                                if (zBooleanValue) {
                                    continue;
                                } else if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setAlwaysDrawnWithCacheEnabled}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                                    continue;
                                } else {
                                    int i37 = f56580w0;
                                    int i38 = ((i37 & 92) + (i37 | 92)) - 1;
                                    v0 = i38 % 128;
                                    int i39 = i38 % 2;
                                    if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setOnLongClickListener}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                                        int i40 = f56580w0;
                                        int i41 = i40 & 63;
                                        i10 = i41 + ((i40 ^ 63) | i41);
                                        v0 = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            ((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setOnDragListener}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue();
                                            throw null;
                                        }
                                        if (!(!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setOnDragListener}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) && !((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setTextAlignment}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                                            int i42 = v0;
                                            int i43 = i42 & 87;
                                            int i44 = -(-((i42 ^ 87) | i43));
                                            int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                                            f56580w0 = i45 % 128;
                                            int i46 = i45 % 2;
                                            if (!(!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setDividerPadding}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue())) {
                                                continue;
                                            } else {
                                                int i47 = v0;
                                                int i48 = ((i47 ^ 79) | (i47 & 79)) << 1;
                                                int i49 = -(((~i47) & 79) | (i47 & (-80)));
                                                int i50 = (i48 & i49) + (i49 | i48);
                                                f56580w0 = i50 % 128;
                                                int i51 = i50 % 2;
                                                if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setCompoundDrawableTintBlendMode}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                                                    continue;
                                                } else {
                                                    int i52 = v0;
                                                    int i53 = i52 ^ 85;
                                                    i11 = (((i52 & 85) | i53) << 1) - i53;
                                                    f56580w0 = i11 % 128;
                                                    if (i11 % 2 != 0) {
                                                        ((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setLayoutAnimation}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue();
                                                        throw null;
                                                    }
                                                    if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setLayoutAnimation}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                                                        continue;
                                                    } else {
                                                        ajcVar = (ajc) aje.setY(new Object[]{ajeVar, aduVar2}, -814074534, 814074535, System.identityHashCode(ajeVar));
                                                        if (((Boolean) ajc.setX(new Object[]{ajcVar}, -1985615408, 1985615412, System.identityHashCode(ajcVar))).booleanValue()) {
                                                            int i54 = v0;
                                                            int i55 = ((i54 ^ 55) - (~(-(-((i54 & 55) << 1))))) - 1;
                                                            int i56 = i55 % 128;
                                                            f56580w0 = i56;
                                                            int i57 = i55 % 2;
                                                            i12 = (i56 & 119) + (i56 | 119);
                                                            v0 = i12 % 128;
                                                            if (i12 % 2 == 0) {
                                                                return true;
                                                            }
                                                            throw null;
                                                        }
                                                        int i58 = v0 + 123;
                                                        f56580w0 = i58 % 128;
                                                        int i59 = i58 % 2;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                objArr[0] = aduVar2;
                                objArr[1] = aduVar3;
                                if (((Boolean) ady.setNavigationOnClickListener(objArr, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                                    continue;
                                } else if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setAlwaysDrawnWithCacheEnabled}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                                    int i310 = f56580w0;
                                    int i311 = ((i310 & 92) + (i310 | 92)) - 1;
                                    v0 = i311 % 128;
                                    int i312 = i311 % 2;
                                    if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setOnLongClickListener}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                                        int i410 = f56580w0;
                                        int i411 = i410 & 63;
                                        i10 = i411 + ((i410 ^ 63) | i411);
                                        v0 = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            ((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setOnDragListener}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue();
                                            throw null;
                                        }
                                        if (!(!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setOnDragListener}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue())) {
                                            continue;
                                        } else {
                                            int i412 = v0;
                                            int i413 = i412 & 87;
                                            int i414 = -(-((i412 ^ 87) | i413));
                                            int i415 = ((i413 | i414) << 1) - (i414 ^ i413);
                                            f56580w0 = i415 % 128;
                                            int i416 = i415 % 2;
                                            if (!(!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setDividerPadding}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue())) {
                                                continue;
                                            } else {
                                                int i417 = v0;
                                                int i418 = ((i417 ^ 79) | (i417 & 79)) << 1;
                                                int i419 = -(((~i417) & 79) | (i417 & (-80)));
                                                int i510 = (i418 & i419) + (i419 | i418);
                                                f56580w0 = i510 % 128;
                                                int i511 = i510 % 2;
                                                if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setCompoundDrawableTintBlendMode}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                                                    continue;
                                                } else {
                                                    int i512 = v0;
                                                    int i513 = i512 ^ 85;
                                                    i11 = (((i512 & 85) | i513) << 1) - i513;
                                                    f56580w0 = i11 % 128;
                                                    if (i11 % 2 != 0) {
                                                        ((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setLayoutAnimation}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue();
                                                        throw null;
                                                    }
                                                    if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, ajc.setLayoutAnimation}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                                                        continue;
                                                    } else {
                                                        ajcVar = (ajc) aje.setY(new Object[]{ajeVar, aduVar2}, -814074534, 814074535, System.identityHashCode(ajeVar));
                                                        if (((Boolean) ajc.setX(new Object[]{ajcVar}, -1985615408, 1985615412, System.identityHashCode(ajcVar))).booleanValue()) {
                                                            int i514 = v0;
                                                            int i515 = ((i514 ^ 55) - (~(-(-((i514 & 55) << 1))))) - 1;
                                                            int i516 = i515 % 128;
                                                            f56580w0 = i516;
                                                            int i517 = i515 % 2;
                                                            i12 = (i516 & 119) + (i516 | 119);
                                                            v0 = i12 % 128;
                                                            if (i12 % 2 == 0) {
                                                                return true;
                                                            }
                                                            throw null;
                                                        }
                                                        int i518 = v0 + 123;
                                                        f56580w0 = i518 % 128;
                                                        int i519 = i518 % 2;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i60 = v0;
        int i61 = (i60 & (-50)) | ((~i60) & 49);
        int i62 = (i60 & 49) << 1;
        int i63 = (i61 & i62) + (i62 | i61);
        f56580w0 = i63 % 128;
        if (i63 % 2 == 0) {
            int i64 = 80 / 0;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x01a6 A[PHI: r8 r10
      0x01a6: PHI (r8v22 com.mypinpad.tsdk.i.ajc) = (r8v17 com.mypinpad.tsdk.i.ajc), (r8v80 com.mypinpad.tsdk.i.ajc) binds: [B:18:0x01a4, B:15:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r10v6 com.mypinpad.tsdk.i.adu) = (r10v5 com.mypinpad.tsdk.i.adu), (r10v14 com.mypinpad.tsdk.i.adu) binds: [B:18:0x01a4, B:15:0x017d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0216 A[Catch: Exception -> 0x03b6, TRY_LEAVE, TryCatch #0 {Exception -> 0x03b6, blocks: (B:20:0x01f2, B:22:0x0216, B:25:0x023e, B:28:0x027b, B:30:0x0293, B:34:0x02b7, B:36:0x02cf, B:38:0x02e7, B:40:0x02ff, B:42:0x031b, B:45:0x037f), top: B:51:0x01f2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x02b7 A[Catch: Exception -> 0x03b6, TRY_ENTER, TryCatch #0 {Exception -> 0x03b6, blocks: (B:20:0x01f2, B:22:0x0216, B:25:0x023e, B:28:0x027b, B:30:0x0293, B:34:0x02b7, B:36:0x02cf, B:38:0x02e7, B:40:0x02ff, B:42:0x031b, B:45:0x037f), top: B:51:0x01f2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x02e7 A[Catch: Exception -> 0x03b6, TRY_ENTER, TryCatch #0 {Exception -> 0x03b6, blocks: (B:20:0x01f2, B:22:0x0216, B:25:0x023e, B:28:0x027b, B:30:0x0293, B:34:0x02b7, B:36:0x02cf, B:38:0x02e7, B:40:0x02ff, B:42:0x031b, B:45:0x037f), top: B:51:0x01f2 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x031b A[SYNTHETIC] */
    @Override // java.security.cert.Certificate
    public final String toString() throws NoSuchAlgorithmException, SignatureException {
        adu aduVar;
        ajc ajcVar;
        int i10;
        adq adqVar;
        int i11;
        int i12;
        int i13;
        StringBuffer stringBuffer = new StringBuffer();
        String str = (String) bez.setX(new Object[0], 464644689, -464644689, (int) System.currentTimeMillis());
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(str);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(str);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(str);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(str);
        l1.a(new Object[]{getSignature(), stringBuffer, str}, -1977226259, 1977226259, (int) System.currentTimeMillis());
        aiy aiyVar = this.f56582q0;
        ajm ajmVar = (ajm) aiy.setDividerPadding(new Object[]{aiyVar}, -1226305897, 1226305905, System.identityHashCode(aiyVar));
        aje ajeVar = (aje) ajm.setOnFocusChangeListener(new Object[]{ajmVar}, -1752564356, 1752564363, System.identityHashCode(ajmVar));
        if (ajeVar != null) {
            int i14 = f56580w0;
            int i15 = (i14 & 5) + (i14 | 5);
            v0 = i15 % 128;
            int i16 = i15 % 2;
            Enumeration enumeration = (Enumeration) aje.setY(new Object[]{ajeVar}, -851154266, 851154268, System.identityHashCode(ajeVar));
            if (enumeration.hasMoreElements()) {
                int i17 = v0;
                int i18 = i17 & 21;
                int i19 = ((i17 ^ 21) | i18) << 1;
                int i20 = -((i17 | 21) & (~i18));
                int i21 = (i19 & i20) + (i20 | i19);
                f56580w0 = i21 % 128;
                int i22 = i21 % 2;
                stringBuffer.append("       Extensions: \n");
                int i23 = f56580w0;
                int i24 = i23 & 75;
                int i25 = -(-(i23 | 75));
                int i26 = (i24 & i25) + (i25 | i24);
                v0 = i26 % 128;
                int i27 = i26 % 2;
            }
            while (!(!enumeration.hasMoreElements())) {
                int i28 = v0;
                int i29 = i28 & 51;
                int i30 = (i28 ^ 51) | i29;
                int i31 = (i29 & i30) + (i30 | i29);
                f56580w0 = i31 % 128;
                if (i31 % 2 == 0) {
                    aduVar = (adu) enumeration.nextElement();
                    ajcVar = (ajc) aje.setY(new Object[]{ajeVar, aduVar}, -814074534, 814074535, System.identityHashCode(ajeVar));
                    int i32 = 66 / 0;
                    if (((ads) ajc.setX(new Object[]{ajcVar}, -1225763701, 1225763708, System.identityHashCode(ajcVar))) != null) {
                        ads adsVar = (ads) ajc.setX(new Object[]{ajcVar}, -1225763701, 1225763708, System.identityHashCode(ajcVar));
                        adqVar = new adq((byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar)));
                        stringBuffer.append("                       critical(");
                        stringBuffer.append(((Boolean) ajc.setX(new Object[]{ajcVar}, -1985615408, 1985615412, System.identityHashCode(ajcVar))).booleanValue());
                        stringBuffer.append(") ");
                        try {
                            if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setDividerPadding}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                int i33 = f56580w0;
                                int i34 = i33 ^ 97;
                                int i35 = ((i33 & 97) | i34) << 1;
                                int i36 = -i34;
                                int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
                                v0 = i37 % 128;
                                int i38 = i37 % 2;
                                stringBuffer.append((aiu) aiu.setOnFocusChangeListener(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1955515662, 1955515666, (int) System.currentTimeMillis()));
                                stringBuffer.append(str);
                                int i39 = v0;
                                i11 = ((-1) << 1) - (((i39 & 52) + (i39 | 52)) ^ (-1));
                            } else if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setOnFocusChangeListener}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                int i40 = v0;
                                int i41 = i40 & 117;
                                int i42 = i40 | 117;
                                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                                f56580w0 = i43 % 128;
                                int i44 = i43 % 2;
                                stringBuffer.append((ajk) ajk.setDividerPadding(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1521535284, 1521535286, (int) System.currentTimeMillis()));
                                stringBuffer.append(str);
                                int i45 = f56580w0;
                                i10 = ((i45 | 91) << 1) - (((~i45) & 91) | (i45 & (-92)));
                                v0 = i10 % 128;
                                int i46 = i10 % 2;
                            } else {
                                if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ahm.setDividerPadding}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                    stringBuffer.append(new ahj(acz.setX(adqVar.setX())));
                                    stringBuffer.append(str);
                                    int i47 = v0;
                                    i12 = i47 & 7;
                                    i13 = (i47 | 7) & (~i12);
                                } else if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ahm.setX}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                    stringBuffer.append(new ahk(adn.setY(adqVar.setX())));
                                    stringBuffer.append(str);
                                    i11 = v0 + 63;
                                } else if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ahm.setOnFocusChangeListener}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                    stringBuffer.append(new aho(adn.setY(adqVar.setX())));
                                    stringBuffer.append(str);
                                    int i48 = f56580w0;
                                    int i49 = i48 & 97;
                                    int i50 = -(-((i48 ^ 97) | i49));
                                    int i51 = (i49 & i50) + (i50 | i49);
                                    v0 = i51 % 128;
                                    int i52 = i51 % 2;
                                } else {
                                    stringBuffer.append((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                                    stringBuffer.append(" value = ");
                                    stringBuffer.append((String) ail.setX(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, 495554292, -495554289, (int) System.currentTimeMillis()));
                                    stringBuffer.append(str);
                                    int i53 = v0;
                                    i12 = ((i53 | 106) << 1) - (i53 ^ 106);
                                    i13 = i12 ^ (-1);
                                }
                                i11 = i13 + (i12 << 1);
                            }
                            f56580w0 = i11 % 128;
                            int i54 = i11 % 2;
                        } catch (Exception unused) {
                            stringBuffer.append((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                            stringBuffer.append(" value = *****");
                            stringBuffer.append(str);
                        }
                    } else {
                        stringBuffer.append(str);
                        int i55 = f56580w0;
                        i10 = (i55 ^ 1) + ((i55 & 1) << 1);
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
                        if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setDividerPadding}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                            int i310 = f56580w0;
                            int i311 = i310 ^ 97;
                            int i312 = ((i310 & 97) | i311) << 1;
                            int i313 = -i311;
                            int i314 = (i312 ^ i313) + ((i312 & i313) << 1);
                            v0 = i314 % 128;
                            int i315 = i314 % 2;
                            stringBuffer.append((aiu) aiu.setOnFocusChangeListener(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1955515662, 1955515666, (int) System.currentTimeMillis()));
                            stringBuffer.append(str);
                            int i316 = v0;
                            i11 = ((-1) << 1) - (((i316 & 52) + (i316 | 52)) ^ (-1));
                        } else if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ajc.setOnFocusChangeListener}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                            int i411 = v0;
                            int i412 = i411 & 117;
                            int i413 = i411 | 117;
                            int i414 = ((i412 | i413) << 1) - (i413 ^ i412);
                            f56580w0 = i414 % 128;
                            int i415 = i414 % 2;
                            stringBuffer.append((ajk) ajk.setDividerPadding(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, -1521535284, 1521535286, (int) System.currentTimeMillis()));
                            stringBuffer.append(str);
                            int i416 = f56580w0;
                            i10 = ((i416 | 91) << 1) - (((~i416) & 91) | (i416 & (-92)));
                            v0 = i10 % 128;
                            int i417 = i10 % 2;
                        } else {
                            if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ahm.setDividerPadding}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                stringBuffer.append(new ahj(acz.setX(adqVar.setX())));
                                stringBuffer.append(str);
                                int i418 = v0;
                                i12 = i418 & 7;
                                i13 = (i418 | 7) & (~i12);
                            } else if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ahm.setX}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                stringBuffer.append(new ahk(adn.setY(adqVar.setX())));
                                stringBuffer.append(str);
                                i11 = v0 + 63;
                            } else if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ahm.setOnFocusChangeListener}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                                stringBuffer.append(new aho(adn.setY(adqVar.setX())));
                                stringBuffer.append(str);
                                int i419 = f56580w0;
                                int i420 = i419 & 97;
                                int i56 = -(-((i419 ^ 97) | i420));
                                int i57 = (i420 & i56) + (i56 | i420);
                                v0 = i57 % 128;
                                int i58 = i57 % 2;
                            } else {
                                stringBuffer.append((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                                stringBuffer.append(" value = ");
                                stringBuffer.append((String) ail.setX(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, 495554292, -495554289, (int) System.currentTimeMillis()));
                                stringBuffer.append(str);
                                int i59 = v0;
                                i12 = ((i59 | 106) << 1) - (i59 ^ 106);
                                i13 = i12 ^ (-1);
                            }
                            i11 = i13 + (i12 << 1);
                        }
                        f56580w0 = i11 % 128;
                        int i510 = i11 % 2;
                    } else {
                        stringBuffer.append(str);
                        int i511 = f56580w0;
                        i10 = (i511 ^ 1) + ((i511 & 1) << 1);
                        v0 = i10 % 128;
                        int i4110 = i10 % 2;
                    }
                }
            }
        }
        String string = stringBuffer.toString();
        int i60 = f56580w0;
        int i61 = (((i60 & (-94)) | ((~i60) & 93)) - (~(-(-((i60 & 93) << 1))))) - 1;
        v0 = i61 % 128;
        int i62 = i61 % 2;
        return string;
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        d(new Object[]{this, publicKey, provider}, -841351188, 841351195, System.identityHashCode(this));
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
        int i10 = f56580w0;
        int i11 = i10 & 95;
        int i12 = ((i10 ^ 95) | i11) << 1;
        int i13 = -((i10 | 95) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        v0 = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 54 / 0;
        }
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        d(new Object[]{this, publicKey, str}, -1875950815, 1875950820, System.identityHashCode(this));
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        d(new Object[]{this, publicKey}, 1695205913, -1695205913, System.identityHashCode(this));
    }
}
