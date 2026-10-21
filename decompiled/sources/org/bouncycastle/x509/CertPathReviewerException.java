package org.bouncycastle.x509;

import java.security.cert.CertPath;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocalizedException;

/* JADX INFO: loaded from: classes13.dex */
public class CertPathReviewerException extends LocalizedException {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f91686q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final CertPath f91687r0;

    public CertPathReviewerException(ErrorBundle errorBundle) {
        super(errorBundle);
        this.f91686q0 = -1;
        this.f91687r0 = null;
    }

    public CertPath getCertPath() {
        return this.f91687r0;
    }

    public int getIndex() {
        return this.f91686q0;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th2) {
        super(errorBundle, th2);
        this.f91686q0 = -1;
        this.f91687r0 = null;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th2, CertPath certPath, int i10) {
        super(errorBundle, th2);
        this.f91686q0 = -1;
        this.f91687r0 = null;
        if (certPath == null || i10 == -1) {
            throw new IllegalArgumentException();
        }
        if (i10 < -1 || i10 >= certPath.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.f91687r0 = certPath;
        this.f91686q0 = i10;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, CertPath certPath, int i10) {
        super(errorBundle);
        this.f91686q0 = -1;
        this.f91687r0 = null;
        if (certPath == null || i10 == -1) {
            throw new IllegalArgumentException();
        }
        if (i10 < -1 || i10 >= certPath.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.f91687r0 = certPath;
        this.f91686q0 = i10;
    }
}
