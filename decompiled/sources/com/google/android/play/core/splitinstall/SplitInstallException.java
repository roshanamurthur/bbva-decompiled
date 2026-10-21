package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.zza;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class SplitInstallException extends ApiException {
    public SplitInstallException(@SplitInstallErrorCode int i10) {
        super(new Status(i10, String.format("Split Install Error(%d): %s", Integer.valueOf(i10), zza.zzb(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    @SplitInstallErrorCode
    public int getErrorCode() {
        return super.getStatusCode();
    }
}
