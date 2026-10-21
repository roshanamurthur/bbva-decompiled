package org.bouncycastle.asn1.eac;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes12.dex */
public class CertificateHolderReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87178c;

    public CertificateHolderReference(String str, String str2, String str3) {
        this.f87176a = str;
        this.f87177b = str2;
        this.f87178c = str3;
    }

    public String getCountryCode() {
        return this.f87176a;
    }

    public byte[] getEncoded() {
        try {
            return (this.f87176a + this.f87177b + this.f87178c).getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e5) {
            throw new IllegalStateException(e5.toString());
        }
    }

    public String getHolderMnemonic() {
        return this.f87177b;
    }

    public String getSequenceNumber() {
        return this.f87178c;
    }

    public CertificateHolderReference(byte[] bArr) {
        try {
            String str = new String(bArr, "ISO-8859-1");
            this.f87176a = str.substring(0, 2);
            this.f87177b = str.substring(2, str.length() - 5);
            this.f87178c = str.substring(str.length() - 5);
        } catch (UnsupportedEncodingException e5) {
            throw new IllegalStateException(e5.toString());
        }
    }
}
