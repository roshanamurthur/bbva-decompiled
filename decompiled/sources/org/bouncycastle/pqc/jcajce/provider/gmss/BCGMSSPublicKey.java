package org.bouncycastle.pqc.jcajce.provider.gmss;

import ad.d;
import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.security.PublicKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.asn1.GMSSPublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.ParSet;
import org.bouncycastle.pqc.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.crypto.gmss.GMSSPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class BCGMSSPublicKey implements CipherParameters, PublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f91441p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final GMSSParameters f91442q0;

    public BCGMSSPublicKey(GMSSPublicKeyParameters gMSSPublicKeyParameters) {
        this(gMSSPublicKeyParameters.getPublicKey(), gMSSPublicKeyParameters.getParameters());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PQCObjectIdentifiers.gmss;
        GMSSParameters gMSSParameters = this.f91442q0;
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, new ParSet(gMSSParameters.getNumOfLayers(), gMSSParameters.getHeightOfTrees(), gMSSParameters.getWinternitzParameter(), gMSSParameters.getK()).toASN1Primitive()), new GMSSPublicKey(this.f91441p0));
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    public GMSSParameters getParameterSet() {
        return this.f91442q0;
    }

    public byte[] getPublicKeyBytes() {
        return this.f91441p0;
    }

    public String toString() {
        String strF = d.f(new StringBuilder("GMSS public key : "), new String(Hex.encode(this.f91441p0)), "\nHeight of Trees: \n");
        int i10 = 0;
        while (true) {
            GMSSParameters gMSSParameters = this.f91442q0;
            if (i10 >= gMSSParameters.getHeightOfTrees().length) {
                return strF;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strF);
            sb2.append("Layer ");
            sb2.append(i10);
            sb2.append(" : ");
            sb2.append(gMSSParameters.getHeightOfTrees()[i10]);
            sb2.append(" WinternitzParameter: ");
            sb2.append(gMSSParameters.getWinternitzParameter()[i10]);
            sb2.append(" K: ");
            strF = a.c(sb2, gMSSParameters.getK()[i10], RootService.LINE_BREAK);
            i10++;
        }
    }

    public BCGMSSPublicKey(byte[] bArr, GMSSParameters gMSSParameters) {
        this.f91442q0 = gMSSParameters;
        this.f91441p0 = bArr;
    }
}
