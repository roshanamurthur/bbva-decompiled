package org.bouncycastle.pqc.crypto.util;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.asn1.XMSSKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTPrivateKey;
import org.bouncycastle.pqc.asn1.XMSSPrivateKey;
import org.bouncycastle.pqc.crypto.lms.Composer;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;
import org.bouncycastle.util.Pack;
import ym.a;

/* JADX INFO: loaded from: classes13.dex */
public class PrivateKeyInfoFactory {
    public static PrivateKeyInfo createPrivateKeyInfo(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException {
        return createPrivateKeyInfo(asymmetricKeyParameter, null);
    }

    public static PrivateKeyInfo createPrivateKeyInfo(AsymmetricKeyParameter asymmetricKeyParameter, ASN1Set aSN1Set) throws IOException {
        if (asymmetricKeyParameter instanceof QTESLAPrivateKeyParameters) {
            QTESLAPrivateKeyParameters qTESLAPrivateKeyParameters = (QTESLAPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(a.b(qTESLAPrivateKeyParameters.getSecurityCategory()), new DEROctetString(qTESLAPrivateKeyParameters.getSecret()), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof SPHINCSPrivateKeyParameters) {
            SPHINCSPrivateKeyParameters sPHINCSPrivateKeyParameters = (SPHINCSPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.sphincs256, new SPHINCS256KeyParams(a.c(sPHINCSPrivateKeyParameters.getTreeDigest()))), new DEROctetString(sPHINCSPrivateKeyParameters.getKeyData()));
        }
        if (asymmetricKeyParameter instanceof NHPrivateKeyParameters) {
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.newHope);
            short[] secData = ((NHPrivateKeyParameters) asymmetricKeyParameter).getSecData();
            byte[] bArr = new byte[secData.length * 2];
            for (int i10 = 0; i10 != secData.length; i10++) {
                Pack.shortToLittleEndian(secData[i10], bArr, i10 * 2);
            }
            return new PrivateKeyInfo(algorithmIdentifier, new DEROctetString(bArr));
        }
        if (asymmetricKeyParameter instanceof LMSPrivateKeyParameters) {
            LMSPrivateKeyParameters lMSPrivateKeyParameters = (LMSPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig), new DEROctetString(Composer.compose().u32str(1).bytes(lMSPrivateKeyParameters).build()), aSN1Set, Composer.compose().u32str(1).bytes(lMSPrivateKeyParameters.getPublicKey()).build());
        }
        if (asymmetricKeyParameter instanceof HSSPrivateKeyParameters) {
            HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig), new DEROctetString(Composer.compose().u32str(hSSPrivateKeyParameters.getL()).bytes(hSSPrivateKeyParameters).build()), aSN1Set, Composer.compose().u32str(hSSPrivateKeyParameters.getL()).bytes(hSSPrivateKeyParameters.getPublicKey()).build());
        }
        if (asymmetricKeyParameter instanceof XMSSPrivateKeyParameters) {
            XMSSPrivateKeyParameters xMSSPrivateKeyParameters = (XMSSPrivateKeyParameters) asymmetricKeyParameter;
            AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier(PQCObjectIdentifiers.xmss, new XMSSKeyParams(xMSSPrivateKeyParameters.getParameters().getHeight(), a.e(xMSSPrivateKeyParameters.getTreeDigest())));
            byte[] encoded = xMSSPrivateKeyParameters.getEncoded();
            int treeDigestSize = xMSSPrivateKeyParameters.getParameters().getTreeDigestSize();
            int height = xMSSPrivateKeyParameters.getParameters().getHeight();
            int iBytesToXBigEndian = (int) XMSSUtil.bytesToXBigEndian(encoded, 0, 4);
            if (!XMSSUtil.isIndexValid(height, iBytesToXBigEndian)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            byte[] bArrExtractBytesAtOffset = XMSSUtil.extractBytesAtOffset(encoded, 4, treeDigestSize);
            int i11 = 4 + treeDigestSize;
            byte[] bArrExtractBytesAtOffset2 = XMSSUtil.extractBytesAtOffset(encoded, i11, treeDigestSize);
            int i12 = i11 + treeDigestSize;
            byte[] bArrExtractBytesAtOffset3 = XMSSUtil.extractBytesAtOffset(encoded, i12, treeDigestSize);
            int i13 = i12 + treeDigestSize;
            byte[] bArrExtractBytesAtOffset4 = XMSSUtil.extractBytesAtOffset(encoded, i13, treeDigestSize);
            int i14 = i13 + treeDigestSize;
            byte[] bArrExtractBytesAtOffset5 = XMSSUtil.extractBytesAtOffset(encoded, i14, encoded.length - i14);
            try {
                BDS bds = (BDS) XMSSUtil.deserialize(bArrExtractBytesAtOffset5, BDS.class);
                return new PrivateKeyInfo(algorithmIdentifier2, bds.getMaxIndex() != (1 << height) - 1 ? new XMSSPrivateKey(iBytesToXBigEndian, bArrExtractBytesAtOffset, bArrExtractBytesAtOffset2, bArrExtractBytesAtOffset3, bArrExtractBytesAtOffset4, bArrExtractBytesAtOffset5, bds.getMaxIndex()) : new XMSSPrivateKey(iBytesToXBigEndian, bArrExtractBytesAtOffset, bArrExtractBytesAtOffset2, bArrExtractBytesAtOffset3, bArrExtractBytesAtOffset4, bArrExtractBytesAtOffset5), aSN1Set);
            } catch (ClassNotFoundException e5) {
                throw new IOException("cannot parse BDS: " + e5.getMessage());
            }
        }
        if (!(asymmetricKeyParameter instanceof XMSSMTPrivateKeyParameters)) {
            throw new IOException("key parameters not recognized");
        }
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = (XMSSMTPrivateKeyParameters) asymmetricKeyParameter;
        AlgorithmIdentifier algorithmIdentifier3 = new AlgorithmIdentifier(PQCObjectIdentifiers.xmss_mt, new XMSSMTKeyParams(xMSSMTPrivateKeyParameters.getParameters().getHeight(), xMSSMTPrivateKeyParameters.getParameters().getLayers(), a.e(xMSSMTPrivateKeyParameters.getTreeDigest())));
        byte[] encoded2 = xMSSMTPrivateKeyParameters.getEncoded();
        int treeDigestSize2 = xMSSMTPrivateKeyParameters.getParameters().getTreeDigestSize();
        int height2 = xMSSMTPrivateKeyParameters.getParameters().getHeight();
        int i15 = (height2 + 7) / 8;
        long jBytesToXBigEndian = (int) XMSSUtil.bytesToXBigEndian(encoded2, 0, i15);
        if (!XMSSUtil.isIndexValid(height2, jBytesToXBigEndian)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] bArrExtractBytesAtOffset6 = XMSSUtil.extractBytesAtOffset(encoded2, i15, treeDigestSize2);
        int i16 = i15 + treeDigestSize2;
        byte[] bArrExtractBytesAtOffset7 = XMSSUtil.extractBytesAtOffset(encoded2, i16, treeDigestSize2);
        int i17 = i16 + treeDigestSize2;
        byte[] bArrExtractBytesAtOffset8 = XMSSUtil.extractBytesAtOffset(encoded2, i17, treeDigestSize2);
        int i18 = i17 + treeDigestSize2;
        byte[] bArrExtractBytesAtOffset9 = XMSSUtil.extractBytesAtOffset(encoded2, i18, treeDigestSize2);
        int i19 = i18 + treeDigestSize2;
        byte[] bArrExtractBytesAtOffset10 = XMSSUtil.extractBytesAtOffset(encoded2, i19, encoded2.length - i19);
        try {
            BDSStateMap bDSStateMap = (BDSStateMap) XMSSUtil.deserialize(bArrExtractBytesAtOffset10, BDSStateMap.class);
            return new PrivateKeyInfo(algorithmIdentifier3, bDSStateMap.getMaxIndex() != (1 << height2) - 1 ? new XMSSMTPrivateKey(jBytesToXBigEndian, bArrExtractBytesAtOffset6, bArrExtractBytesAtOffset7, bArrExtractBytesAtOffset8, bArrExtractBytesAtOffset9, bArrExtractBytesAtOffset10, bDSStateMap.getMaxIndex()) : new XMSSMTPrivateKey(jBytesToXBigEndian, bArrExtractBytesAtOffset6, bArrExtractBytesAtOffset7, bArrExtractBytesAtOffset8, bArrExtractBytesAtOffset9, bArrExtractBytesAtOffset10), aSN1Set);
        } catch (ClassNotFoundException e7) {
            throw new IOException("cannot parse BDSStateMap: " + e7.getMessage());
        }
    }
}
