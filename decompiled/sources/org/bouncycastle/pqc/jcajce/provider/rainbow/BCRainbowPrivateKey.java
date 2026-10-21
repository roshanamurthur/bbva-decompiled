package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.RainbowPrivateKey;
import org.bouncycastle.pqc.crypto.rainbow.Layer;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil;
import org.bouncycastle.pqc.jcajce.spec.RainbowPrivateKeySpec;

/* JADX INFO: loaded from: classes13.dex */
public class BCRainbowPrivateKey implements PrivateKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final short[][] f91487p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final short[] f91488q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final short[][] f91489r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final short[] f91490s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Layer[] f91491t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int[] f91492u0;

    public BCRainbowPrivateKey(RainbowPrivateKeyParameters rainbowPrivateKeyParameters) {
        this(rainbowPrivateKeyParameters.getInvA1(), rainbowPrivateKeyParameters.getB1(), rainbowPrivateKeyParameters.getInvA2(), rainbowPrivateKeyParameters.getB2(), rainbowPrivateKeyParameters.getVi(), rainbowPrivateKeyParameters.getLayers());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPrivateKey)) {
            return false;
        }
        BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) obj;
        boolean zEquals = RainbowUtil.equals(this.f91487p0, bCRainbowPrivateKey.getInvA1()) && RainbowUtil.equals(this.f91489r0, bCRainbowPrivateKey.getInvA2()) && RainbowUtil.equals(this.f91488q0, bCRainbowPrivateKey.getB1()) && RainbowUtil.equals(this.f91490s0, bCRainbowPrivateKey.getB2()) && Arrays.equals(this.f91492u0, bCRainbowPrivateKey.getVi());
        Layer[] layerArr = this.f91491t0;
        if (layerArr.length != bCRainbowPrivateKey.getLayers().length) {
            return false;
        }
        for (int length = layerArr.length - 1; length >= 0; length--) {
            zEquals &= layerArr[length].equals(bCRainbowPrivateKey.getLayers()[length]);
        }
        return zEquals;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[] getB1() {
        return this.f91488q0;
    }

    public short[] getB2() {
        return this.f91490s0;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.rainbow, DERNull.INSTANCE), new RainbowPrivateKey(this.f91487p0, this.f91488q0, this.f91489r0, this.f91490s0, this.f91492u0, this.f91491t0)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public short[][] getInvA1() {
        return this.f91487p0;
    }

    public short[][] getInvA2() {
        return this.f91489r0;
    }

    public Layer[] getLayers() {
        return this.f91491t0;
    }

    public int[] getVi() {
        return this.f91492u0;
    }

    public int hashCode() {
        Layer[] layerArr = this.f91491t0;
        int iHashCode = org.bouncycastle.util.Arrays.hashCode(this.f91492u0) + ((org.bouncycastle.util.Arrays.hashCode(this.f91490s0) + ((org.bouncycastle.util.Arrays.hashCode(this.f91489r0) + ((org.bouncycastle.util.Arrays.hashCode(this.f91488q0) + ((org.bouncycastle.util.Arrays.hashCode(this.f91487p0) + (layerArr.length * 37)) * 37)) * 37)) * 37)) * 37);
        for (int length = layerArr.length - 1; length >= 0; length--) {
            iHashCode = (iHashCode * 37) + layerArr[length].hashCode();
        }
        return iHashCode;
    }

    public BCRainbowPrivateKey(RainbowPrivateKeySpec rainbowPrivateKeySpec) {
        this(rainbowPrivateKeySpec.getInvA1(), rainbowPrivateKeySpec.getB1(), rainbowPrivateKeySpec.getInvA2(), rainbowPrivateKeySpec.getB2(), rainbowPrivateKeySpec.getVi(), rainbowPrivateKeySpec.getLayers());
    }

    public BCRainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Layer[] layerArr) {
        this.f91487p0 = sArr;
        this.f91488q0 = sArr2;
        this.f91489r0 = sArr3;
        this.f91490s0 = sArr4;
        this.f91492u0 = iArr;
        this.f91491t0 = layerArr;
    }
}
