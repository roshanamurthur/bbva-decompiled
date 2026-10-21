package com.mypinpad.tsdk.isolation;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes10.dex */
public class apf implements aoz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53456b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53457c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f53458a;

    public apf(Provider provider) {
        this.f53458a = provider;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, CertificateException {
        int i13 = ~i11;
        int i14 = ~i12;
        if ((((~(i10 | i11)) | (~(i12 | i13))) * 49) + (((~((~i10) | i14)) | i13 | (~(i10 | i12))) * (-49)) + (((~(i13 | i14)) | (~(i13 | i10))) * 98) + (i11 * (-97)) + (i10 * 50) == 1) {
            apf apfVar = (apf) objArr[0];
            String str = (String) objArr[1];
            int i15 = f53456b;
            int i16 = (i15 & 35) + (i15 | 35);
            f53457c = i16 % 128;
            int i17 = i16 % 2;
            Provider provider = apfVar.f53458a;
            if (i17 != 0) {
                return Signature.getInstance(str, provider);
            }
            Signature.getInstance(str, provider);
            throw null;
        }
        apf apfVar2 = (apf) objArr[0];
        String str2 = (String) objArr[1];
        int i18 = f53457c;
        int i19 = ((i18 & 24) + (i18 | 24)) - 1;
        f53456b = i19 % 128;
        int i20 = i19 % 2;
        CertificateFactory certificateFactory = CertificateFactory.getInstance(str2, apfVar2.f53458a);
        int i21 = f53457c + 1;
        f53456b = i21 % 128;
        if (i21 % 2 == 0) {
            return certificateFactory;
        }
        int i22 = 47 / 0;
        return certificateFactory;
    }

    @Override // com.mypinpad.tsdk.isolation.aoz
    public final Signature setY(String str) throws NoSuchAlgorithmException {
        return (Signature) setDividerPadding(new Object[]{this, str}, 1881933003, -1881933002, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aoz
    public final CertificateFactory setDividerPadding(String str) throws CertificateException {
        return (CertificateFactory) setDividerPadding(new Object[]{this, str}, 1688409919, -1688409919, System.identityHashCode(this));
    }
}
