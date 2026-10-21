package org.bouncycastle.jcajce;

import java.security.InvalidParameterException;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class PKIXExtendedBuilderParameters implements CertPathParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PKIXExtendedParameters f89710p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Set<X509Certificate> f89711q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f89712r0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PKIXExtendedParameters f89713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f89714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashSet f89715c;

        public Builder(PKIXBuilderParameters pKIXBuilderParameters) {
            this.f89714b = 5;
            this.f89715c = new HashSet();
            this.f89713a = new PKIXExtendedParameters.Builder(pKIXBuilderParameters).build();
            this.f89714b = pKIXBuilderParameters.getMaxPathLength();
        }

        public Builder addExcludedCerts(Set<X509Certificate> set) {
            this.f89715c.addAll(set);
            return this;
        }

        public PKIXExtendedBuilderParameters build() {
            return new PKIXExtendedBuilderParameters(this);
        }

        public Builder setMaxPathLength(int i10) {
            if (i10 < -1) {
                throw new InvalidParameterException("The maximum path length parameter can not be less than -1.");
            }
            this.f89714b = i10;
            return this;
        }

        public Builder(PKIXExtendedParameters pKIXExtendedParameters) {
            this.f89714b = 5;
            this.f89715c = new HashSet();
            this.f89713a = pKIXExtendedParameters;
        }
    }

    public PKIXExtendedBuilderParameters(Builder builder) {
        this.f89710p0 = builder.f89713a;
        this.f89711q0 = Collections.unmodifiableSet(builder.f89715c);
        this.f89712r0 = builder.f89714b;
    }

    public PKIXExtendedParameters getBaseParameters() {
        return this.f89710p0;
    }

    public Set getExcludedCerts() {
        return this.f89711q0;
    }

    public int getMaxPathLength() {
        return this.f89712r0;
    }

    @Override // java.security.cert.CertPathParameters
    public Object clone() {
        return this;
    }
}
