package org.bouncycastle.x509;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

/* JADX INFO: loaded from: classes13.dex */
public class ExtendedPKIXParameters extends PKIXParameters {
    public static final int CHAIN_VALIDITY_MODEL = 1;
    public static final int PKIX_VALIDITY_MODEL = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ArrayList f91688p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Selector f91689q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f91690r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ArrayList f91691s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public HashSet f91692t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public HashSet f91693u0;
    public HashSet v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public HashSet f91694w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f91695x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f91696y0;

    public ExtendedPKIXParameters(Set set) throws InvalidAlgorithmParameterException {
        super((Set<TrustAnchor>) set);
        this.f91695x0 = 0;
        this.f91696y0 = false;
        this.f91688p0 = new ArrayList();
        this.f91691s0 = new ArrayList();
        this.f91692t0 = new HashSet();
        this.f91693u0 = new HashSet();
        this.v0 = new HashSet();
        this.f91694w0 = new HashSet();
    }

    public static ExtendedPKIXParameters getInstance(PKIXParameters pKIXParameters) {
        try {
            ExtendedPKIXParameters extendedPKIXParameters = new ExtendedPKIXParameters(pKIXParameters.getTrustAnchors());
            extendedPKIXParameters.setParams(pKIXParameters);
            return extendedPKIXParameters;
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage());
        }
    }

    public void addAddionalStore(Store store) {
        addAdditionalStore(store);
    }

    public void addAdditionalStore(Store store) {
        if (store != null) {
            this.f91691s0.add(store);
        }
    }

    public void addStore(Store store) {
        if (store != null) {
            this.f91688p0.add(store);
        }
    }

    @Override // java.security.cert.PKIXParameters, java.security.cert.CertPathParameters
    public Object clone() {
        try {
            ExtendedPKIXParameters extendedPKIXParameters = new ExtendedPKIXParameters(getTrustAnchors());
            extendedPKIXParameters.setParams(this);
            return extendedPKIXParameters;
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage());
        }
    }

    public List getAdditionalStores() {
        return Collections.unmodifiableList(this.f91691s0);
    }

    public Set getAttrCertCheckers() {
        return Collections.unmodifiableSet(this.f91694w0);
    }

    public Set getNecessaryACAttributes() {
        return Collections.unmodifiableSet(this.f91693u0);
    }

    public Set getProhibitedACAttributes() {
        return Collections.unmodifiableSet(this.v0);
    }

    public List getStores() {
        return Collections.unmodifiableList(new ArrayList(this.f91688p0));
    }

    public Selector getTargetConstraints() {
        Selector selector = this.f91689q0;
        if (selector != null) {
            return (Selector) selector.clone();
        }
        return null;
    }

    public Set getTrustedACIssuers() {
        return Collections.unmodifiableSet(this.f91692t0);
    }

    public int getValidityModel() {
        return this.f91695x0;
    }

    public boolean isAdditionalLocationsEnabled() {
        return this.f91690r0;
    }

    public boolean isUseDeltasEnabled() {
        return this.f91696y0;
    }

    public void setAdditionalLocationsEnabled(boolean z10) {
        this.f91690r0 = z10;
    }

    public void setAttrCertCheckers(Set set) {
        if (set == null) {
            this.f91694w0.clear();
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof PKIXAttrCertChecker)) {
                throw new ClassCastException(androidx.datastore.preferences.protobuf.e.e(PKIXAttrCertChecker.class, new StringBuilder("All elements of set must be of type "), Constant.DOT_STRING));
            }
        }
        this.f91694w0.clear();
        this.f91694w0.addAll(set);
    }

    @Override // java.security.cert.PKIXParameters
    public void setCertStores(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                addCertStore((CertStore) it.next());
            }
        }
    }

    public void setNecessaryACAttributes(Set set) {
        if (set == null) {
            this.f91693u0.clear();
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                throw new ClassCastException("All elements of set must be of type String.");
            }
        }
        this.f91693u0.clear();
        this.f91693u0.addAll(set);
    }

    public void setParams(PKIXParameters pKIXParameters) {
        setDate(pKIXParameters.getDate());
        setCertPathCheckers(pKIXParameters.getCertPathCheckers());
        setCertStores(pKIXParameters.getCertStores());
        setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
        setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
        setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
        setRevocationEnabled(pKIXParameters.isRevocationEnabled());
        setInitialPolicies(pKIXParameters.getInitialPolicies());
        setPolicyQualifiersRejected(pKIXParameters.getPolicyQualifiersRejected());
        setSigProvider(pKIXParameters.getSigProvider());
        setTargetCertConstraints(pKIXParameters.getTargetCertConstraints());
        try {
            setTrustAnchors(pKIXParameters.getTrustAnchors());
            if (pKIXParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) pKIXParameters;
                this.f91695x0 = extendedPKIXParameters.f91695x0;
                this.f91696y0 = extendedPKIXParameters.f91696y0;
                this.f91690r0 = extendedPKIXParameters.f91690r0;
                Selector selector = extendedPKIXParameters.f91689q0;
                this.f91689q0 = selector == null ? null : (Selector) selector.clone();
                this.f91688p0 = new ArrayList(extendedPKIXParameters.f91688p0);
                this.f91691s0 = new ArrayList(extendedPKIXParameters.f91691s0);
                this.f91692t0 = new HashSet(extendedPKIXParameters.f91692t0);
                this.v0 = new HashSet(extendedPKIXParameters.v0);
                this.f91693u0 = new HashSet(extendedPKIXParameters.f91693u0);
                this.f91694w0 = new HashSet(extendedPKIXParameters.f91694w0);
            }
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage());
        }
    }

    public void setProhibitedACAttributes(Set set) {
        if (set == null) {
            this.v0.clear();
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                throw new ClassCastException("All elements of set must be of type String.");
            }
        }
        this.v0.clear();
        this.v0.addAll(set);
    }

    public void setStores(List list) {
        if (list == null) {
            this.f91688p0 = new ArrayList();
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof Store)) {
                throw new ClassCastException("All elements of list must be of type org.bouncycastle.util.Store.");
            }
        }
        this.f91688p0 = new ArrayList(list);
    }

    @Override // java.security.cert.PKIXParameters
    public void setTargetCertConstraints(CertSelector certSelector) {
        super.setTargetCertConstraints(certSelector);
        this.f91689q0 = certSelector != null ? X509CertStoreSelector.getInstance((X509CertSelector) certSelector) : null;
    }

    public void setTargetConstraints(Selector selector) {
        this.f91689q0 = selector != null ? (Selector) selector.clone() : null;
    }

    public void setTrustedACIssuers(Set set) {
        if (set == null) {
            this.f91692t0.clear();
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof TrustAnchor)) {
                throw new ClassCastException(androidx.datastore.preferences.protobuf.e.e(TrustAnchor.class, new StringBuilder("All elements of set must be of type "), Constant.DOT_STRING));
            }
        }
        this.f91692t0.clear();
        this.f91692t0.addAll(set);
    }

    public void setUseDeltasEnabled(boolean z10) {
        this.f91696y0 = z10;
    }

    public void setValidityModel(int i10) {
        this.f91695x0 = i10;
    }
}
