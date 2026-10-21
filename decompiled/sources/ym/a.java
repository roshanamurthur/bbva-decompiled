package ym;

import androidx.appcompat.widget.g0;
import java.util.HashMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AlgorithmIdentifier f94874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AlgorithmIdentifier f94875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AlgorithmIdentifier f94876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AlgorithmIdentifier f94877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AlgorithmIdentifier f94878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AlgorithmIdentifier f94879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AlgorithmIdentifier f94880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AlgorithmIdentifier f94881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f94882i;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PQCObjectIdentifiers.qTESLA_p_I;
        f94874a = new AlgorithmIdentifier(aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PQCObjectIdentifiers.qTESLA_p_III;
        f94875b = new AlgorithmIdentifier(aSN1ObjectIdentifier2);
        f94876c = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha3_256);
        f94877d = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_256);
        f94878e = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        f94879f = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
        f94880g = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake128);
        f94881h = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake256);
        HashMap map = new HashMap();
        f94882i = map;
        map.put(aSN1ObjectIdentifier, Integers.valueOf(5));
        map.put(aSN1ObjectIdentifier2, Integers.valueOf(6));
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

    public static AlgorithmIdentifier b(int i10) {
        if (i10 == 5) {
            return f94874a;
        }
        if (i10 == 6) {
            return f94875b;
        }
        throw new IllegalArgumentException(g0.c("unknown security category: ", i10));
    }

    public static AlgorithmIdentifier c(String str) {
        if (str.equals("SHA3-256")) {
            return f94876c;
        }
        if (str.equals(SPHINCSKeyParameters.SHA512_256)) {
            return f94877d;
        }
        throw new IllegalArgumentException("unknown tree digest: ".concat(str));
    }

    public static String d(SPHINCS256KeyParams sPHINCS256KeyParams) {
        AlgorithmIdentifier treeDigest = sPHINCS256KeyParams.getTreeDigest();
        if (treeDigest.getAlgorithm().equals((ASN1Primitive) f94876c.getAlgorithm())) {
            return "SHA3-256";
        }
        if (treeDigest.getAlgorithm().equals((ASN1Primitive) f94877d.getAlgorithm())) {
            return SPHINCSKeyParameters.SHA512_256;
        }
        throw new IllegalArgumentException("unknown tree digest: " + treeDigest.getAlgorithm());
    }

    public static AlgorithmIdentifier e(String str) {
        if (str.equals("SHA-256")) {
            return f94878e;
        }
        if (str.equals("SHA-512")) {
            return f94879f;
        }
        if (str.equals("SHAKE128")) {
            return f94880g;
        }
        if (str.equals("SHAKE256")) {
            return f94881h;
        }
        throw new IllegalArgumentException("unknown tree digest: ".concat(str));
    }
}
