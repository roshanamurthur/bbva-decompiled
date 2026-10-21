package org.bouncycastle.jcajce.spec;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;

/* JADX INFO: loaded from: classes8.dex */
public class DHDomainParameterSpec extends DHParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f90256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f90257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DHValidationParameters f90259d;

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, null, 0);
    }

    public DHParameters getDomainParameters() {
        return new DHParameters(getP(), getG(), this.f90256a, this.f90258c, getL(), this.f90257b, this.f90259d);
    }

    public BigInteger getJ() {
        return this.f90257b;
    }

    public int getM() {
        return this.f90258c;
    }

    public BigInteger getQ() {
        return this.f90256a;
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, null, i10);
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i10);
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10, int i11) {
        super(bigInteger, bigInteger3, i11);
        this.f90256a = bigInteger2;
        this.f90257b = bigInteger4;
        this.f90258c = i10;
    }

    public DHDomainParameterSpec(DHParameters dHParameters) {
        this(dHParameters.getP(), dHParameters.getQ(), dHParameters.getG(), dHParameters.getJ(), dHParameters.getM(), dHParameters.getL());
        this.f90259d = dHParameters.getValidationParameters();
    }
}
