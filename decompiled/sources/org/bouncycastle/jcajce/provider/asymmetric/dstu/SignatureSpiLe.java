package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.security.SignatureException;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;

/* JADX INFO: loaded from: classes8.dex */
public class SignatureSpiLe extends SignatureSpi {
    public static void b(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[(bArr.length - 1) - i10];
            bArr[(bArr.length - 1) - i10] = b10;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] octets = ASN1OctetString.getInstance(super.engineSign()).getOctets();
        b(octets);
        try {
            return new DEROctetString(octets).getEncoded();
        } catch (Exception e5) {
            throw new SignatureException(e5.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            byte[] octets = ((ASN1OctetString) ASN1Primitive.fromByteArray(bArr)).getOctets();
            b(octets);
            try {
                return super.engineVerify(new DEROctetString(octets).getEncoded());
            } catch (SignatureException e5) {
                throw e5;
            } catch (Exception e7) {
                throw new SignatureException(e7.toString());
            }
        } catch (IOException unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
