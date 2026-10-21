package zm;

import java.util.HashMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f95098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f95099b;

    static {
        HashMap map = new HashMap();
        f95098a = map;
        HashMap map2 = new HashMap();
        f95099b = map2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        map.put("SHA-256", aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        map.put("SHA-512", aSN1ObjectIdentifier2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        map.put("SHAKE128", aSN1ObjectIdentifier3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        map.put("SHAKE256", aSN1ObjectIdentifier4);
        map2.put(aSN1ObjectIdentifier, "SHA-256");
        map2.put(aSN1ObjectIdentifier2, "SHA-512");
        map2.put(aSN1ObjectIdentifier3, "SHAKE128");
        map2.put(aSN1ObjectIdentifier4, "SHAKE256");
    }

    public static ExtendedDigest a(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return new SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return new SHAKEDigest(128);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return new SHAKEDigest(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier b(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) f95098a.get(str);
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException(androidx.camera.core.processing.f.d("unrecognized digest name: ", str));
    }
}
