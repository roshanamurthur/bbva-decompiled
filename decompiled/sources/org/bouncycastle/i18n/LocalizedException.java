package org.bouncycastle.i18n;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class LocalizedException extends Exception {
    protected ErrorBundle message;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f89654p0;

    public LocalizedException(ErrorBundle errorBundle) {
        super(errorBundle.getText(Locale.getDefault()));
        this.message = errorBundle;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f89654p0;
    }

    public ErrorBundle getErrorMessage() {
        return this.message;
    }

    public LocalizedException(ErrorBundle errorBundle, Throwable th2) {
        super(errorBundle.getText(Locale.getDefault()));
        this.message = errorBundle;
        this.f89654p0 = th2;
    }
}
