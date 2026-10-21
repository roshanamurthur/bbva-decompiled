package org.bouncycastle.pqc.crypto.util;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.asn1.XMSSKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTPrivateKey;
import org.bouncycastle.pqc.asn1.XMSSPrivateKey;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import ym.a;

/* JADX INFO: loaded from: classes13.dex */
public class PrivateKeyFactory {
    public static AsymmetricKeyParameter createKey(InputStream inputStream) throws IOException {
        return createKey(PrivateKeyInfo.getInstance(new ASN1InputStream(inputStream).readObject()));
    }

    public static AsymmetricKeyParameter createKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.on(BCObjectIdentifiers.qTESLA)) {
            return new QTESLAPrivateKeyParameters(((Integer) a.f94882i.get(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm())).intValue(), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.equals((ASN1Primitive) BCObjectIdentifiers.sphincs256)) {
            return new SPHINCSPrivateKeyParameters(ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets(), a.d(SPHINCS256KeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters())));
        }
        if (algorithm.equals((ASN1Primitive) BCObjectIdentifiers.newHope)) {
            byte[] octets = ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
            int length = octets.length / 2;
            short[] sArr = new short[length];
            for (int i10 = 0; i10 != length; i10++) {
                sArr[i10] = Pack.littleEndianToShort(octets, i10 * 2);
            }
            return new NHPrivateKeyParameters(sArr);
        }
        if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_alg_hss_lms_hashsig)) {
            byte[] octets2 = ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
            ASN1BitString publicKeyData = privateKeyInfo.getPublicKeyData();
            if (Pack.bigEndianToInt(octets2, 0) != 1) {
                return HSSPrivateKeyParameters.getInstance(Arrays.copyOfRange(octets2, 4, octets2.length));
            }
            if (publicKeyData == null) {
                return LMSPrivateKeyParameters.getInstance(Arrays.copyOfRange(octets2, 4, octets2.length));
            }
            byte[] octets3 = publicKeyData.getOctets();
            return LMSPrivateKeyParameters.getInstance(Arrays.copyOfRange(octets2, 4, octets2.length), Arrays.copyOfRange(octets3, 4, octets3.length));
        }
        if (algorithm.equals((ASN1Primitive) BCObjectIdentifiers.xmss)) {
            XMSSKeyParams xMSSKeyParams = XMSSKeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
            ASN1ObjectIdentifier algorithm2 = xMSSKeyParams.getTreeDigest().getAlgorithm();
            XMSSPrivateKey xMSSPrivateKey = XMSSPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            try {
                XMSSPrivateKeyParameters.Builder builderWithRoot = new XMSSPrivateKeyParameters.Builder(new XMSSParameters(xMSSKeyParams.getHeight(), a.a(algorithm2))).withIndex(xMSSPrivateKey.getIndex()).withSecretKeySeed(xMSSPrivateKey.getSecretKeySeed()).withSecretKeyPRF(xMSSPrivateKey.getSecretKeyPRF()).withPublicSeed(xMSSPrivateKey.getPublicSeed()).withRoot(xMSSPrivateKey.getRoot());
                if (xMSSPrivateKey.getVersion() != 0) {
                    builderWithRoot.withMaxIndex(xMSSPrivateKey.getMaxIndex());
                }
                if (xMSSPrivateKey.getBdsState() != null) {
                    builderWithRoot.withBDSState(((BDS) XMSSUtil.deserialize(xMSSPrivateKey.getBdsState(), BDS.class)).withWOTSDigest(algorithm2));
                }
                return builderWithRoot.build();
            } catch (ClassNotFoundException e5) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e5.getMessage());
            }
        }
        if (!algorithm.equals((ASN1Primitive) PQCObjectIdentifiers.xmss_mt)) {
            throw new RuntimeException("algorithm identifier in private key not recognised");
        }
        XMSSMTKeyParams xMSSMTKeyParams = XMSSMTKeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        ASN1ObjectIdentifier algorithm3 = xMSSMTKeyParams.getTreeDigest().getAlgorithm();
        try {
            XMSSMTPrivateKey xMSSMTPrivateKey = XMSSMTPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            XMSSMTPrivateKeyParameters.Builder builderWithRoot2 = new XMSSMTPrivateKeyParameters.Builder(new XMSSMTParameters(xMSSMTKeyParams.getHeight(), xMSSMTKeyParams.getLayers(), a.a(algorithm3))).withIndex(xMSSMTPrivateKey.getIndex()).withSecretKeySeed(xMSSMTPrivateKey.getSecretKeySeed()).withSecretKeyPRF(xMSSMTPrivateKey.getSecretKeyPRF()).withPublicSeed(xMSSMTPrivateKey.getPublicSeed()).withRoot(xMSSMTPrivateKey.getRoot());
            if (xMSSMTPrivateKey.getVersion() != 0) {
                builderWithRoot2.withMaxIndex(xMSSMTPrivateKey.getMaxIndex());
            }
            if (xMSSMTPrivateKey.getBdsState() != null) {
                builderWithRoot2.withBDSState(((BDSStateMap) XMSSUtil.deserialize(xMSSMTPrivateKey.getBdsState(), BDSStateMap.class)).withWOTSDigest(algorithm3));
            }
            return builderWithRoot2.build();
        } catch (ClassNotFoundException e7) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e7.getMessage());
        }
    }

    public static AsymmetricKeyParameter createKey(byte[] bArr) throws IOException {
        return createKey(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }
}
