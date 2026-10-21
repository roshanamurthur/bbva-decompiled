package org.bouncycastle.jcajce;

import java.security.cert.CertPathParameters;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes6.dex */
public class PKIXExtendedParameters implements CertPathParameters {
    public static final int CHAIN_VALIDITY_MODEL = 1;
    public static final int PKIX_VALIDITY_MODEL = 0;
    public final Set<TrustAnchor> E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PKIXParameters f89716p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final PKIXCertStoreSelector f89717q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Date f89718r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final List<PKIXCertStore> f89719s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Map<GeneralName, PKIXCertStore> f89720t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final List<PKIXCRLStore> f89721u0;
    public final Map<GeneralName, PKIXCRLStore> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f89722w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f89723x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f89724y0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PKIXParameters f89725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Date f89726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public PKIXCertStoreSelector f89727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f89728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final HashMap f89729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f89730f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HashMap f89731g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f89732h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f89733i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f89734j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Set<TrustAnchor> f89735k;

        public Builder(PKIXParameters pKIXParameters) {
            this.f89728d = new ArrayList();
            this.f89729e = new HashMap();
            this.f89730f = new ArrayList();
            this.f89731g = new HashMap();
            this.f89733i = 0;
            this.f89734j = false;
            this.f89725a = (PKIXParameters) pKIXParameters.clone();
            CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
            if (targetCertConstraints != null) {
                this.f89727c = new PKIXCertStoreSelector.Builder(targetCertConstraints).build();
            }
            Date date = pKIXParameters.getDate();
            this.f89726b = date == null ? new Date() : date;
            this.f89732h = pKIXParameters.isRevocationEnabled();
            this.f89735k = pKIXParameters.getTrustAnchors();
        }

        public Builder addCRLStore(PKIXCRLStore pKIXCRLStore) {
            this.f89730f.add(pKIXCRLStore);
            return this;
        }

        public Builder addCertificateStore(PKIXCertStore pKIXCertStore) {
            this.f89728d.add(pKIXCertStore);
            return this;
        }

        public Builder addNamedCRLStore(GeneralName generalName, PKIXCRLStore pKIXCRLStore) {
            this.f89731g.put(generalName, pKIXCRLStore);
            return this;
        }

        public Builder addNamedCertificateStore(GeneralName generalName, PKIXCertStore pKIXCertStore) {
            this.f89729e.put(generalName, pKIXCertStore);
            return this;
        }

        public PKIXExtendedParameters build() {
            return new PKIXExtendedParameters(this);
        }

        public void setRevocationEnabled(boolean z10) {
            this.f89732h = z10;
        }

        public Builder setTargetConstraints(PKIXCertStoreSelector pKIXCertStoreSelector) {
            this.f89727c = pKIXCertStoreSelector;
            return this;
        }

        public Builder setTrustAnchor(TrustAnchor trustAnchor) {
            this.f89735k = Collections.singleton(trustAnchor);
            return this;
        }

        public Builder setTrustAnchors(Set<TrustAnchor> set) {
            this.f89735k = set;
            return this;
        }

        public Builder setUseDeltasEnabled(boolean z10) {
            this.f89734j = z10;
            return this;
        }

        public Builder setValidityModel(int i10) {
            this.f89733i = i10;
            return this;
        }

        public Builder(PKIXExtendedParameters pKIXExtendedParameters) {
            this.f89728d = new ArrayList();
            this.f89729e = new HashMap();
            this.f89730f = new ArrayList();
            this.f89731g = new HashMap();
            this.f89733i = 0;
            this.f89734j = false;
            this.f89725a = pKIXExtendedParameters.f89716p0;
            this.f89726b = pKIXExtendedParameters.f89718r0;
            this.f89727c = pKIXExtendedParameters.f89717q0;
            this.f89728d = new ArrayList(pKIXExtendedParameters.f89719s0);
            this.f89729e = new HashMap(pKIXExtendedParameters.f89720t0);
            this.f89730f = new ArrayList(pKIXExtendedParameters.f89721u0);
            this.f89731g = new HashMap(pKIXExtendedParameters.v0);
            this.f89734j = pKIXExtendedParameters.f89723x0;
            this.f89733i = pKIXExtendedParameters.f89724y0;
            this.f89732h = pKIXExtendedParameters.isRevocationEnabled();
            this.f89735k = pKIXExtendedParameters.getTrustAnchors();
        }
    }

    public PKIXExtendedParameters(Builder builder) {
        this.f89716p0 = builder.f89725a;
        this.f89718r0 = builder.f89726b;
        this.f89719s0 = Collections.unmodifiableList(builder.f89728d);
        this.f89720t0 = Collections.unmodifiableMap(new HashMap(builder.f89729e));
        this.f89721u0 = Collections.unmodifiableList(builder.f89730f);
        this.v0 = Collections.unmodifiableMap(new HashMap(builder.f89731g));
        this.f89717q0 = builder.f89727c;
        this.f89722w0 = builder.f89732h;
        this.f89723x0 = builder.f89734j;
        this.f89724y0 = builder.f89733i;
        this.E0 = Collections.unmodifiableSet(builder.f89735k);
    }

    public List<PKIXCRLStore> getCRLStores() {
        return this.f89721u0;
    }

    public List getCertPathCheckers() {
        return this.f89716p0.getCertPathCheckers();
    }

    public List<CertStore> getCertStores() {
        return this.f89716p0.getCertStores();
    }

    public List<PKIXCertStore> getCertificateStores() {
        return this.f89719s0;
    }

    public Date getDate() {
        return new Date(this.f89718r0.getTime());
    }

    public Set getInitialPolicies() {
        return this.f89716p0.getInitialPolicies();
    }

    public Map<GeneralName, PKIXCRLStore> getNamedCRLStoreMap() {
        return this.v0;
    }

    public Map<GeneralName, PKIXCertStore> getNamedCertificateStoreMap() {
        return this.f89720t0;
    }

    public boolean getPolicyQualifiersRejected() {
        return this.f89716p0.getPolicyQualifiersRejected();
    }

    public String getSigProvider() {
        return this.f89716p0.getSigProvider();
    }

    public PKIXCertStoreSelector getTargetConstraints() {
        return this.f89717q0;
    }

    public Set getTrustAnchors() {
        return this.E0;
    }

    public int getValidityModel() {
        return this.f89724y0;
    }

    public boolean isAnyPolicyInhibited() {
        return this.f89716p0.isAnyPolicyInhibited();
    }

    public boolean isExplicitPolicyRequired() {
        return this.f89716p0.isExplicitPolicyRequired();
    }

    public boolean isPolicyMappingInhibited() {
        return this.f89716p0.isPolicyMappingInhibited();
    }

    public boolean isRevocationEnabled() {
        return this.f89722w0;
    }

    public boolean isUseDeltasEnabled() {
        return this.f89723x0;
    }

    @Override // java.security.cert.CertPathParameters
    public Object clone() {
        return this;
    }
}
