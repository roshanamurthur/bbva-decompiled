package org.bouncycastle.jce;

import androidx.appcompat.view.menu.b;
import java.io.IOException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;

/* JADX INFO: loaded from: classes8.dex */
public class PKCS12Util {
    public static byte[] convertToDefiniteLength(byte[] bArr) throws IOException {
        return Pfx.getInstance(bArr).getEncoded(ASN1Encoding.DER);
    }

    public static byte[] convertToDefiniteLength(byte[] bArr, char[] cArr, String str) throws IOException {
        Pfx pfx = Pfx.getInstance(bArr);
        ContentInfo authSafe = pfx.getAuthSafe();
        ContentInfo contentInfo = new ContentInfo(authSafe.getContentType(), new DEROctetString(ASN1Primitive.fromByteArray(ASN1OctetString.getInstance(authSafe.getContent()).getOctets()).getEncoded(ASN1Encoding.DER)));
        MacData macData = pfx.getMacData();
        try {
            int iIntValue = macData.getIterationCount().intValue();
            byte[] octets = ASN1OctetString.getInstance(contentInfo.getContent()).getOctets();
            ASN1ObjectIdentifier algorithm = macData.getMac().getAlgorithmId().getAlgorithm();
            byte[] salt = macData.getSalt();
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(algorithm.getId(), str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(salt, iIntValue);
            SecretKey secretKeyGenerateSecret = secretKeyFactory.generateSecret(new PBEKeySpec(cArr));
            Mac mac = Mac.getInstance(algorithm.getId(), str);
            mac.init(secretKeyGenerateSecret, pBEParameterSpec);
            mac.update(octets);
            return new Pfx(contentInfo, new MacData(new DigestInfo(new AlgorithmIdentifier(macData.getMac().getAlgorithmId().getAlgorithm(), DERNull.INSTANCE), mac.doFinal()), macData.getSalt(), iIntValue)).getEncoded(ASN1Encoding.DER);
        } catch (Exception e5) {
            throw new IOException(b.c(e5, new StringBuilder("error constructing MAC: ")));
        }
    }
}
