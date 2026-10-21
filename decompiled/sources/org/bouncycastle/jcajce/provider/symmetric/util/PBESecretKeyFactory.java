package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: loaded from: classes8.dex */
public class PBESecretKeyFactory extends BaseSecretKeyFactory {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f90235p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f90236q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f90237r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f90238s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f90239t0;

    public PBESecretKeyFactory(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, int i10, int i11, int i12, int i13) {
        super(str, aSN1ObjectIdentifier);
        this.f90235p0 = z10;
        this.f90236q0 = i10;
        this.f90237r0 = i11;
        this.f90238s0 = i12;
        this.f90239t0 = i13;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PBEKeySpec)) {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
        PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
        if (pBEKeySpec.getSalt() == null) {
            return new BCPBEKey(this.algName, this.algOid, this.f90236q0, this.f90237r0, this.f90238s0, this.f90239t0, pBEKeySpec, null);
        }
        boolean z10 = this.f90235p0;
        int i10 = this.f90238s0;
        int i11 = this.f90237r0;
        int i12 = this.f90236q0;
        return new BCPBEKey(this.algName, this.algOid, this.f90236q0, this.f90237r0, this.f90238s0, this.f90239t0, pBEKeySpec, z10 ? PBE.Util.makePBEParameters(pBEKeySpec, i12, i11, i10, this.f90239t0) : PBE.Util.makePBEMacParameters(pBEKeySpec, i12, i11, i10));
    }
}
