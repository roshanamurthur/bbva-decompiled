package org.bouncycastle.pqc.crypto.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.asn1.XMSSKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.asn1.XMSSPublicKey;
import org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters;
import org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public class PublicKeyFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f91267a;

    public static class a extends e {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.e
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            byte[] octets = ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets();
            return Pack.bigEndianToInt(octets, 0) == 1 ? LMSPublicKeyParameters.getInstance(Arrays.copyOfRange(octets, 4, octets.length)) : HSSPublicKeyParameters.getInstance(Arrays.copyOfRange(octets, 4, octets.length));
        }
    }

    public static class b extends e {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.e
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            return new NHPublicKeyParameters(subjectPublicKeyInfo.getPublicKeyData().getBytes());
        }
    }

    public static class c extends e {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.e
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            return new QTESLAPublicKeyParameters(((Integer) ym.a.f94882i.get(subjectPublicKeyInfo.getAlgorithm().getAlgorithm())).intValue(), subjectPublicKeyInfo.getPublicKeyData().getOctets());
        }
    }

    public static class d extends e {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.e
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            return new SPHINCSPublicKeyParameters(subjectPublicKeyInfo.getPublicKeyData().getBytes(), ym.a.d(SPHINCS256KeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters())));
        }
    }

    public static abstract class e {
        public abstract AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException;
    }

    public static class f extends e {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.e
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            XMSSPublicKeyParameters.Builder builderWithPublicKey;
            XMSSKeyParams xMSSKeyParams = XMSSKeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (xMSSKeyParams != null) {
                ASN1ObjectIdentifier algorithm = xMSSKeyParams.getTreeDigest().getAlgorithm();
                XMSSPublicKey xMSSPublicKey = XMSSPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
                builderWithPublicKey = new XMSSPublicKeyParameters.Builder(new XMSSParameters(xMSSKeyParams.getHeight(), ym.a.a(algorithm))).withPublicSeed(xMSSPublicKey.getPublicSeed()).withRoot(xMSSPublicKey.getRoot());
            } else {
                byte[] octets = ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets();
                builderWithPublicKey = new XMSSPublicKeyParameters.Builder(XMSSParameters.lookupByOID(Pack.bigEndianToInt(octets, 0))).withPublicKey(octets);
            }
            return builderWithPublicKey.build();
        }
    }

    public static class g extends e {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.e
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            XMSSMTPublicKeyParameters.Builder builderWithPublicKey;
            XMSSMTKeyParams xMSSMTKeyParams = XMSSMTKeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (xMSSMTKeyParams != null) {
                ASN1ObjectIdentifier algorithm = xMSSMTKeyParams.getTreeDigest().getAlgorithm();
                XMSSPublicKey xMSSPublicKey = XMSSPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
                builderWithPublicKey = new XMSSMTPublicKeyParameters.Builder(new XMSSMTParameters(xMSSMTKeyParams.getHeight(), xMSSMTKeyParams.getLayers(), ym.a.a(algorithm))).withPublicSeed(xMSSPublicKey.getPublicSeed()).withRoot(xMSSPublicKey.getRoot());
            } else {
                byte[] octets = ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets();
                builderWithPublicKey = new XMSSMTPublicKeyParameters.Builder(XMSSMTParameters.lookupByOID(Pack.bigEndianToInt(octets, 0))).withPublicKey(octets);
            }
            return builderWithPublicKey.build();
        }
    }

    static {
        HashMap map = new HashMap();
        f91267a = map;
        map.put(PQCObjectIdentifiers.qTESLA_p_I, new c());
        map.put(PQCObjectIdentifiers.qTESLA_p_III, new c());
        map.put(PQCObjectIdentifiers.sphincs256, new d());
        map.put(PQCObjectIdentifiers.newHope, new b());
        map.put(PQCObjectIdentifiers.xmss, new f());
        map.put(PQCObjectIdentifiers.xmss_mt, new g());
        map.put(IsaraObjectIdentifiers.id_alg_xmss, new f());
        map.put(IsaraObjectIdentifiers.id_alg_xmssmt, new g());
        map.put(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, new a());
    }

    public static AsymmetricKeyParameter createKey(InputStream inputStream) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(new ASN1InputStream(inputStream).readObject()));
    }

    public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        return createKey(subjectPublicKeyInfo, null);
    }

    public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
        AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
        e eVar = (e) f91267a.get(algorithm.getAlgorithm());
        if (eVar != null) {
            return eVar.a(subjectPublicKeyInfo);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + algorithm.getAlgorithm());
    }

    public static AsymmetricKeyParameter createKey(byte[] bArr) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }
}
