package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import com.huawei.hms.feature.model.b;
import java.util.ArrayList;
import java.util.List;
import xe.a;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class SplitInstallSessionState {
    public static SplitInstallSessionState create(int i10, @SplitInstallSessionStatus int i11, @SplitInstallErrorCode int i12, long j10, long j11, List<String> list, List<String> list2) {
        if (i11 != 8) {
            return new a(i10, i11, i12, j10, j11, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static SplitInstallSessionState zzd(Bundle bundle) {
        return new a(bundle.getInt(b.f50436f), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong(b.f50433c), bundle.getLong(b.f50437g), bundle.getStringArrayList(b.f50440j), bundle.getStringArrayList(b.f50443n), (PendingIntent) bundle.getParcelable(b.f50438h), bundle.getParcelableArrayList(b.f50439i));
    }

    @Nullable
    public abstract List a();

    @Nullable
    public abstract List b();

    public abstract long bytesDownloaded();

    @Nullable
    public abstract List c();

    @SplitInstallErrorCode
    public abstract int errorCode();

    public boolean hasTerminalStatus() {
        int iStatus = status();
        return iStatus == 0 || iStatus == 5 || iStatus == 6 || iStatus == 7;
    }

    @NonNull
    public List<String> languages() {
        return a() != null ? new ArrayList(a()) : new ArrayList();
    }

    @NonNull
    public List<String> moduleNames() {
        return b() != null ? new ArrayList(b()) : new ArrayList();
    }

    @Nullable
    @Deprecated
    public abstract PendingIntent resolutionIntent();

    public abstract int sessionId();

    @SplitInstallSessionStatus
    public abstract int status();

    public abstract long totalBytesToDownload();
}
