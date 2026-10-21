package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.Target;
import org.bouncycastle.asn1.x509.TargetInformation;
import org.bouncycastle.asn1.x509.Targets;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes13.dex */
public class X509AttributeCertStoreSelector implements Selector {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AttributeCertificateHolder f91703p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AttributeCertificateIssuer f91704q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public BigInteger f91705r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Date f91706s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public X509AttributeCertificate f91707t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Collection f91708u0 = new HashSet();
    public Collection v0 = new HashSet();

    public static HashSet a(Collection collection) throws IOException {
        if (collection == null || collection.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (Object generalName : collection) {
            if (!(generalName instanceof GeneralName)) {
                generalName = GeneralName.getInstance(ASN1Primitive.fromByteArray((byte[]) generalName));
            }
            hashSet.add(generalName);
        }
        return hashSet;
    }

    public void addTargetGroup(GeneralName generalName) {
        this.v0.add(generalName);
    }

    public void addTargetName(GeneralName generalName) {
        this.f91708u0.add(generalName);
    }

    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        X509AttributeCertStoreSelector x509AttributeCertStoreSelector = new X509AttributeCertStoreSelector();
        x509AttributeCertStoreSelector.f91707t0 = this.f91707t0;
        x509AttributeCertStoreSelector.f91706s0 = getAttributeCertificateValid();
        x509AttributeCertStoreSelector.f91703p0 = this.f91703p0;
        x509AttributeCertStoreSelector.f91704q0 = this.f91704q0;
        x509AttributeCertStoreSelector.f91705r0 = this.f91705r0;
        x509AttributeCertStoreSelector.v0 = getTargetGroups();
        x509AttributeCertStoreSelector.f91708u0 = getTargetNames();
        return x509AttributeCertStoreSelector;
    }

    public X509AttributeCertificate getAttributeCert() {
        return this.f91707t0;
    }

    public Date getAttributeCertificateValid() {
        if (this.f91706s0 != null) {
            return new Date(this.f91706s0.getTime());
        }
        return null;
    }

    public AttributeCertificateHolder getHolder() {
        return this.f91703p0;
    }

    public AttributeCertificateIssuer getIssuer() {
        return this.f91704q0;
    }

    public BigInteger getSerialNumber() {
        return this.f91705r0;
    }

    public Collection getTargetGroups() {
        return Collections.unmodifiableCollection(this.v0);
    }

    public Collection getTargetNames() {
        return Collections.unmodifiableCollection(this.f91708u0);
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        byte[] extensionValue;
        if (!(obj instanceof X509AttributeCertificate)) {
            return false;
        }
        X509AttributeCertificate x509AttributeCertificate = (X509AttributeCertificate) obj;
        X509AttributeCertificate x509AttributeCertificate2 = this.f91707t0;
        if (x509AttributeCertificate2 != null && !x509AttributeCertificate2.equals(x509AttributeCertificate)) {
            return false;
        }
        if (this.f91705r0 != null && !x509AttributeCertificate.getSerialNumber().equals(this.f91705r0)) {
            return false;
        }
        if (this.f91703p0 != null && !x509AttributeCertificate.getHolder().equals(this.f91703p0)) {
            return false;
        }
        if (this.f91704q0 != null && !x509AttributeCertificate.getIssuer().equals(this.f91704q0)) {
            return false;
        }
        Date date = this.f91706s0;
        if (date != null) {
            try {
                x509AttributeCertificate.checkValidity(date);
            } catch (CertificateExpiredException | CertificateNotYetValidException unused) {
                return false;
            }
        }
        if ((!this.f91708u0.isEmpty() || !this.v0.isEmpty()) && (extensionValue = x509AttributeCertificate.getExtensionValue(Extension.targetInformation.getId())) != null) {
            try {
                Targets[] targetsObjects = TargetInformation.getInstance(new ASN1InputStream(((DEROctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()).readObject()).getTargetsObjects();
                if (!this.f91708u0.isEmpty()) {
                    boolean z10 = false;
                    for (Targets targets : targetsObjects) {
                        for (Target target : targets.getTargets()) {
                            if (this.f91708u0.contains(GeneralName.getInstance(target.getTargetName()))) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    if (!z10) {
                        return false;
                    }
                }
                if (!this.v0.isEmpty()) {
                    boolean z11 = false;
                    for (Targets targets2 : targetsObjects) {
                        for (Target target2 : targets2.getTargets()) {
                            if (this.v0.contains(GeneralName.getInstance(target2.getTargetGroup()))) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    if (!z11) {
                        return false;
                    }
                }
            } catch (IOException | IllegalArgumentException unused2) {
            }
        }
        return true;
    }

    public void setAttributeCert(X509AttributeCertificate x509AttributeCertificate) {
        this.f91707t0 = x509AttributeCertificate;
    }

    public void setAttributeCertificateValid(Date date) {
        if (date != null) {
            this.f91706s0 = new Date(date.getTime());
        } else {
            this.f91706s0 = null;
        }
    }

    public void setHolder(AttributeCertificateHolder attributeCertificateHolder) {
        this.f91703p0 = attributeCertificateHolder;
    }

    public void setIssuer(AttributeCertificateIssuer attributeCertificateIssuer) {
        this.f91704q0 = attributeCertificateIssuer;
    }

    public void setSerialNumber(BigInteger bigInteger) {
        this.f91705r0 = bigInteger;
    }

    public void setTargetGroups(Collection collection) throws IOException {
        this.v0 = a(collection);
    }

    public void setTargetNames(Collection collection) throws IOException {
        this.f91708u0 = a(collection);
    }

    public void addTargetGroup(byte[] bArr) throws IOException {
        addTargetGroup(GeneralName.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }

    public void addTargetName(byte[] bArr) throws IOException {
        addTargetName(GeneralName.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }
}
