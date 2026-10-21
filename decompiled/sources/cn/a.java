package cn;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static ASN1ObjectIdentifier a(String str) {
        if (str.equals("SHA-256")) {
            return NISTObjectIdentifiers.id_sha256;
        }
        if (str.equals("SHA-512")) {
            return NISTObjectIdentifiers.id_sha512;
        }
        if (str.equals("SHAKE128")) {
            return NISTObjectIdentifiers.id_shake128;
        }
        if (str.equals("SHAKE256")) {
            return NISTObjectIdentifiers.id_shake256;
        }
        throw new IllegalArgumentException("unrecognized digest: ".concat(str));
    }

    public static byte[] b(Digest digest) {
        int digestSize = digest instanceof Xof ? digest.getDigestSize() * 2 : digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        if (digest instanceof Xof) {
            ((Xof) digest).doFinal(bArr, 0, digestSize);
        } else {
            digest.doFinal(bArr, 0);
        }
        return bArr;
    }

    public static String c(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return "SHA256";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return "SHA512";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return "SHAKE128";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return "SHAKE256";
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + aSN1ObjectIdentifier);
    }
}
