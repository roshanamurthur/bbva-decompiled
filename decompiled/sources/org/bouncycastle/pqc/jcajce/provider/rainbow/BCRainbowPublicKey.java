package org.bouncycastle.pqc.jcajce.provider.rainbow;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.security.PublicKey;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.RainbowPublicKey;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.RainbowPublicKeySpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCRainbowPublicKey implements PublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final short[][] f91493p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final short[][] f91494q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final short[] f91495r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f91496s0;

    public BCRainbowPublicKey(int i10, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f91496s0 = i10;
        this.f91493p0 = sArr;
        this.f91494q0 = sArr2;
        this.f91495r0 = sArr3;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPublicKey)) {
            return false;
        }
        BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) obj;
        return this.f91496s0 == bCRainbowPublicKey.getDocLength() && RainbowUtil.equals(this.f91493p0, bCRainbowPublicKey.getCoeffQuadratic()) && RainbowUtil.equals(this.f91494q0, bCRainbowPublicKey.getCoeffSingular()) && RainbowUtil.equals(this.f91495r0, bCRainbowPublicKey.getCoeffScalar());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[][] getCoeffQuadratic() {
        return this.f91493p0;
    }

    public short[] getCoeffScalar() {
        return Arrays.clone(this.f91495r0);
    }

    public short[][] getCoeffSingular() {
        short[][] sArr = this.f91494q0;
        short[][] sArr2 = new short[sArr.length][];
        for (int i10 = 0; i10 != sArr.length; i10++) {
            sArr2[i10] = Arrays.clone(sArr[i10]);
        }
        return sArr2;
    }

    public int getDocLength() {
        return this.f91496s0;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.rainbow, DERNull.INSTANCE), new RainbowPublicKey(this.f91496s0, this.f91493p0, this.f91494q0, this.f91495r0));
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f91495r0) + ((Arrays.hashCode(this.f91494q0) + ((Arrays.hashCode(this.f91493p0) + (this.f91496s0 * 37)) * 37)) * 37);
    }

    public BCRainbowPublicKey(RainbowPublicKeyParameters rainbowPublicKeyParameters) {
        this(rainbowPublicKeyParameters.getDocLength(), rainbowPublicKeyParameters.getCoeffQuadratic(), rainbowPublicKeyParameters.getCoeffSingular(), rainbowPublicKeyParameters.getCoeffScalar());
    }

    public BCRainbowPublicKey(RainbowPublicKeySpec rainbowPublicKeySpec) {
        this(rainbowPublicKeySpec.getDocLength(), rainbowPublicKeySpec.getCoeffQuadratic(), rainbowPublicKeySpec.getCoeffSingular(), rainbowPublicKeySpec.getCoeffScalar());
    }
}
