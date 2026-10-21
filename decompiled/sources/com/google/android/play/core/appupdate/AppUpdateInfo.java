package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class AppUpdateInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f46011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @UpdateAvailability
    public final int f46013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InstallStatus
    public final int f46014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f46015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f46017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f46018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f46019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f46020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final PendingIntent f46021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final PendingIntent f46022l;

    @Nullable
    public final PendingIntent m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final PendingIntent f46023n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f46024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f46025p = false;

    public AppUpdateInfo(@NonNull String str, int i10, @UpdateAvailability int i11, @InstallStatus int i12, @Nullable Integer num, int i13, long j10, long j11, long j12, long j13, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4, Map map) {
        this.f46011a = str;
        this.f46012b = i10;
        this.f46013c = i11;
        this.f46014d = i12;
        this.f46015e = num;
        this.f46016f = i13;
        this.f46017g = j10;
        this.f46018h = j11;
        this.f46019i = j12;
        this.f46020j = j13;
        this.f46021k = pendingIntent;
        this.f46022l = pendingIntent2;
        this.m = pendingIntent3;
        this.f46023n = pendingIntent4;
        this.f46024o = map;
    }

    public static AppUpdateInfo zzb(@NonNull String str, int i10, @UpdateAvailability int i11, @InstallStatus int i12, @Nullable Integer num, int i13, long j10, long j11, long j12, long j13, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4, Map map) {
        return new AppUpdateInfo(str, i10, i11, i12, num, i13, j10, j11, j12, j13, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    @Nullable
    public final PendingIntent a(AppUpdateOptions appUpdateOptions) {
        int iAppUpdateType = appUpdateOptions.appUpdateType();
        long j10 = this.f46020j;
        long j11 = this.f46019i;
        if (iAppUpdateType == 0) {
            PendingIntent pendingIntent = this.f46022l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (!appUpdateOptions.allowAssetPackDeletion() || j11 > j10) {
                return null;
            }
            return this.f46023n;
        }
        if (appUpdateOptions.appUpdateType() == 1) {
            PendingIntent pendingIntent2 = this.f46021k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (appUpdateOptions.allowAssetPackDeletion() && j11 <= j10) {
                return this.m;
            }
        }
        return null;
    }

    public int availableVersionCode() {
        return this.f46012b;
    }

    public long bytesDownloaded() {
        return this.f46017g;
    }

    @Nullable
    public Integer clientVersionStalenessDays() {
        return this.f46015e;
    }

    public Set<Integer> getFailedUpdatePreconditions(AppUpdateOptions appUpdateOptions) {
        boolean zAllowAssetPackDeletion = appUpdateOptions.allowAssetPackDeletion();
        Map map = this.f46024o;
        if (zAllowAssetPackDeletion) {
            if (appUpdateOptions.appUpdateType() == 0) {
                Set<Integer> set = (Set) map.get("nonblocking.destructive.intent");
                return set == null ? new HashSet() : set;
            }
            Set<Integer> set2 = (Set) map.get("blocking.destructive.intent");
            return set2 == null ? new HashSet() : set2;
        }
        if (appUpdateOptions.appUpdateType() == 0) {
            Set<Integer> set3 = (Set) map.get("nonblocking.intent");
            return set3 == null ? new HashSet() : set3;
        }
        Set<Integer> set4 = (Set) map.get("blocking.intent");
        return set4 == null ? new HashSet() : set4;
    }

    @InstallStatus
    public int installStatus() {
        return this.f46014d;
    }

    public boolean isUpdateTypeAllowed(@AppUpdateType int i10) {
        return a(AppUpdateOptions.defaultOptions(i10)) != null;
    }

    @NonNull
    public String packageName() {
        return this.f46011a;
    }

    public long totalBytesToDownload() {
        return this.f46018h;
    }

    @UpdateAvailability
    public int updateAvailability() {
        return this.f46013c;
    }

    public int updatePriority() {
        return this.f46016f;
    }

    public boolean isUpdateTypeAllowed(@NonNull AppUpdateOptions appUpdateOptions) {
        return a(appUpdateOptions) != null;
    }
}
