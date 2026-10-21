package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.zza;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class InstallException extends ApiException {
    public InstallException(@InstallErrorCode int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i10), zza.zza(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    @InstallErrorCode
    public int getErrorCode() {
        return super.getStatusCode();
    }
}
