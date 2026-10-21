package org.bouncycastle.jcajce.spec;

import java.security.spec.ECParameterSpec;
import org.bouncycastle.asn1.ua.DSTU4145Params;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class DSTU4145ParameterSpec extends ECParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f90264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ECDomainParameters f90265b;

    /* JADX WARN: Illegal instructions before constructor call */
    public DSTU4145ParameterSpec(ECDomainParameters eCDomainParameters) {
        ECParameterSpec eCParameterSpecConvertToSpec = EC5Util.convertToSpec(eCDomainParameters);
        byte[] defaultDKE = DSTU4145Params.getDefaultDKE();
        super(eCParameterSpecConvertToSpec.getCurve(), eCParameterSpecConvertToSpec.getGenerator(), eCParameterSpecConvertToSpec.getOrder(), eCParameterSpecConvertToSpec.getCofactor());
        this.f90265b = eCDomainParameters;
        this.f90264a = Arrays.clone(defaultDKE);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DSTU4145ParameterSpec) {
            return this.f90265b.equals(((DSTU4145ParameterSpec) obj).f90265b);
        }
        return false;
    }

    public byte[] getDKE() {
        return Arrays.clone(this.f90264a);
    }

    public int hashCode() {
        return this.f90265b.hashCode();
    }
}
