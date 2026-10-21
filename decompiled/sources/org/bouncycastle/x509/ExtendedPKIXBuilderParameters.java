package org.bouncycastle.x509;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CertSelector;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes13.dex */
public class ExtendedPKIXBuilderParameters extends ExtendedPKIXParameters {
    public int E0;
    public Set F0;

    public ExtendedPKIXBuilderParameters(Set set, Selector selector) throws InvalidAlgorithmParameterException {
        super(set);
        this.E0 = 5;
        this.F0 = Collections.EMPTY_SET;
        setTargetConstraints(selector);
    }

    public static ExtendedPKIXParameters getInstance(PKIXParameters pKIXParameters) {
        try {
            ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = new ExtendedPKIXBuilderParameters(pKIXParameters.getTrustAnchors(), X509CertStoreSelector.getInstance((X509CertSelector) pKIXParameters.getTargetCertConstraints()));
            extendedPKIXBuilderParameters.setParams(pKIXParameters);
            return extendedPKIXBuilderParameters;
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage());
        }
    }

    @Override // org.bouncycastle.x509.ExtendedPKIXParameters, java.security.cert.PKIXParameters, java.security.cert.CertPathParameters
    public Object clone() {
        try {
            ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = new ExtendedPKIXBuilderParameters(getTrustAnchors(), getTargetConstraints());
            extendedPKIXBuilderParameters.setParams(this);
            return extendedPKIXBuilderParameters;
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage());
        }
    }

    public Set getExcludedCerts() {
        return Collections.unmodifiableSet(this.F0);
    }

    public int getMaxPathLength() {
        return this.E0;
    }

    public void setExcludedCerts(Set set) {
        if (set == null) {
            Set set2 = Collections.EMPTY_SET;
        } else {
            this.F0 = new HashSet(set);
        }
    }

    public void setMaxPathLength(int i10) {
        if (i10 < -1) {
            throw new InvalidParameterException("The maximum path length parameter can not be less than -1.");
        }
        this.E0 = i10;
    }

    @Override // org.bouncycastle.x509.ExtendedPKIXParameters
    public void setParams(PKIXParameters pKIXParameters) {
        super.setParams(pKIXParameters);
        if (pKIXParameters instanceof ExtendedPKIXBuilderParameters) {
            ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = (ExtendedPKIXBuilderParameters) pKIXParameters;
            this.E0 = extendedPKIXBuilderParameters.E0;
            this.F0 = new HashSet(extendedPKIXBuilderParameters.F0);
        }
        if (pKIXParameters instanceof PKIXBuilderParameters) {
            this.E0 = ((PKIXBuilderParameters) pKIXParameters).getMaxPathLength();
        }
    }
}
