package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class IntegrityServiceException extends ApiException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f46128p0;

    public IntegrityServiceException(int i10, Throwable th2) {
        super(new Status(i10, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i10), com.google.android.play.core.integrity.model.a.a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f46128p0 = th2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f46128p0;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
