package org.bouncycastle.jce.provider;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.NameConstraintValidatorException;

/* JADX INFO: loaded from: classes8.dex */
public class PKIXNameConstraintValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.bouncycastle.asn1.x509.PKIXNameConstraintValidator f90437a = new org.bouncycastle.asn1.x509.PKIXNameConstraintValidator();

    public void addExcludedSubtree(GeneralSubtree generalSubtree) {
        this.f90437a.addExcludedSubtree(generalSubtree);
    }

    public void checkExcluded(GeneralName generalName) throws PKIXNameConstraintValidatorException {
        try {
            this.f90437a.checkExcluded(generalName);
        } catch (NameConstraintValidatorException e5) {
            throw new PKIXNameConstraintValidatorException(e5.getMessage(), e5);
        }
    }

    public void checkExcludedDN(ASN1Sequence aSN1Sequence) throws PKIXNameConstraintValidatorException {
        try {
            this.f90437a.checkExcludedDN(X500Name.getInstance(aSN1Sequence));
        } catch (NameConstraintValidatorException e5) {
            throw new PKIXNameConstraintValidatorException(e5.getMessage(), e5);
        }
    }

    public void checkPermitted(GeneralName generalName) throws PKIXNameConstraintValidatorException {
        try {
            this.f90437a.checkPermitted(generalName);
        } catch (NameConstraintValidatorException e5) {
            throw new PKIXNameConstraintValidatorException(e5.getMessage(), e5);
        }
    }

    public void checkPermittedDN(ASN1Sequence aSN1Sequence) throws PKIXNameConstraintValidatorException {
        try {
            this.f90437a.checkPermittedDN(X500Name.getInstance(aSN1Sequence));
        } catch (NameConstraintValidatorException e5) {
            throw new PKIXNameConstraintValidatorException(e5.getMessage(), e5);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof PKIXNameConstraintValidator) {
            return this.f90437a.equals(((PKIXNameConstraintValidator) obj).f90437a);
        }
        return false;
    }

    public int hashCode() {
        return this.f90437a.hashCode();
    }

    public void intersectEmptyPermittedSubtree(int i10) {
        this.f90437a.intersectEmptyPermittedSubtree(i10);
    }

    public void intersectPermittedSubtree(GeneralSubtree generalSubtree) {
        this.f90437a.intersectPermittedSubtree(generalSubtree);
    }

    public String toString() {
        return this.f90437a.toString();
    }

    public void intersectPermittedSubtree(GeneralSubtree[] generalSubtreeArr) {
        this.f90437a.intersectPermittedSubtree(generalSubtreeArr);
    }
}
