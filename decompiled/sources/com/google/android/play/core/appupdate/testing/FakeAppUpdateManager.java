package com.google.android.play.core.appupdate.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.zzc;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class FakeAppUpdateManager implements AppUpdateManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzc f46094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f46096c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InstallStatus
    public int f46097d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InstallErrorCode
    public int f46098e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46099f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46100g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Integer f46101h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46102i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f46103j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f46104k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f46105l = false;
    public boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f46106n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    @AppUpdateType
    public Integer f46107o;

    public FakeAppUpdateManager(Context context) {
        this.f46094a = new zzc(context);
        this.f46095b = context;
    }

    public final void a() {
        this.f46094a.zzd(InstallState.zza(this.f46097d, this.f46103j, this.f46104k, this.f46098e, this.f46095b.getPackageName()));
    }

    public final boolean b(AppUpdateInfo appUpdateInfo, AppUpdateOptions appUpdateOptions) {
        if (!appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions) && (!AppUpdateOptions.defaultOptions(appUpdateOptions.appUpdateType()).equals(appUpdateOptions) || !appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions.appUpdateType()))) {
            return false;
        }
        if (appUpdateOptions.appUpdateType() == 1) {
            this.m = true;
            this.f46107o = 1;
        } else {
            this.f46105l = true;
            this.f46107o = 0;
        }
        return true;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public Task<Void> completeUpdate() {
        if (this.f46098e != 0) {
            return Tasks.forException(new InstallException(this.f46098e));
        }
        int i10 = this.f46097d;
        if (i10 != 11) {
            return i10 == 3 ? Tasks.forException(new InstallException(-8)) : Tasks.forException(new InstallException(-7));
        }
        this.f46097d = 3;
        this.f46106n = true;
        Integer num = 0;
        if (num.equals(this.f46107o)) {
            a();
        }
        return Tasks.forResult(null);
    }

    public void downloadCompletes() {
        int i10 = this.f46097d;
        if (i10 == 2 || i10 == 1) {
            this.f46097d = 11;
            this.f46103j = 0L;
            this.f46104k = 0L;
            Integer num = 0;
            if (num.equals(this.f46107o)) {
                a();
                return;
            }
            Integer num2 = 1;
            if (num2.equals(this.f46107o)) {
                completeUpdate();
            }
        }
    }

    public void downloadFails() {
        int i10 = this.f46097d;
        if (i10 == 1 || i10 == 2) {
            this.f46097d = 5;
            Integer num = 0;
            if (num.equals(this.f46107o)) {
                a();
            }
            this.f46107o = null;
            this.m = false;
            this.f46097d = 0;
        }
    }

    public void downloadStarts() {
        if (this.f46097d == 1) {
            this.f46097d = 2;
            Integer num = 0;
            if (num.equals(this.f46107o)) {
                a();
            }
        }
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public Task<AppUpdateInfo> getAppUpdateInfo() {
        char c10;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent broadcast;
        PendingIntent pendingIntent3;
        int i10;
        PendingIntent broadcast2;
        PendingIntent broadcast3;
        if (this.f46098e != 0) {
            return Tasks.forException(new InstallException(this.f46098e));
        }
        if (this.f46099f) {
            int i11 = this.f46097d;
            c10 = (i11 == 0 || i11 == 4 || i11 == 5 || i11 == 6) ? (char) 2 : (char) 3;
        } else {
            c10 = 1;
        }
        Context context = this.f46095b;
        if (c10 == 2) {
            ArrayList arrayList = this.f46096c;
            if (arrayList.contains(0)) {
                broadcast2 = PendingIntent.getBroadcast(context, 0, new Intent(), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                broadcast3 = PendingIntent.getBroadcast(context, 0, new Intent(), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            } else {
                broadcast2 = null;
                broadcast3 = null;
            }
            if (arrayList.contains(1)) {
                PendingIntent broadcast4 = PendingIntent.getBroadcast(context, 0, new Intent(), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                broadcast = PendingIntent.getBroadcast(context, 0, new Intent(), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                pendingIntent = broadcast4;
            } else {
                pendingIntent = null;
                broadcast = null;
            }
            pendingIntent2 = broadcast2;
            pendingIntent3 = broadcast3;
        } else {
            pendingIntent = null;
            pendingIntent2 = null;
            broadcast = null;
            pendingIntent3 = null;
        }
        String packageName = context.getPackageName();
        int i12 = this.f46100g;
        if (this.f46099f) {
            int i13 = this.f46097d;
            i10 = (i13 == 0 || i13 == 4 || i13 == 5 || i13 == 6) ? 2 : 3;
        } else {
            i10 = 1;
        }
        return Tasks.forResult(AppUpdateInfo.zzb(packageName, i12, i10, this.f46097d, this.f46101h, this.f46102i, this.f46103j, this.f46104k, 0L, 0L, pendingIntent, pendingIntent2, broadcast, pendingIntent3, new HashMap()));
    }

    @Nullable
    @AppUpdateType
    public Integer getTypeForUpdateInProgress() {
        return this.f46107o;
    }

    public void installCompletes() {
        if (this.f46097d == 3) {
            this.f46097d = 4;
            this.f46099f = false;
            this.f46100g = 0;
            this.f46101h = null;
            this.f46102i = 0;
            this.f46103j = 0L;
            this.f46104k = 0L;
            this.m = false;
            this.f46106n = false;
            Integer num = 0;
            if (num.equals(this.f46107o)) {
                a();
            }
            this.f46107o = null;
            this.f46097d = 0;
        }
    }

    public void installFails() {
        if (this.f46097d == 3) {
            this.f46097d = 5;
            Integer num = 0;
            if (num.equals(this.f46107o)) {
                a();
            }
            this.f46107o = null;
            this.f46106n = false;
            this.m = false;
            this.f46097d = 0;
        }
    }

    public boolean isConfirmationDialogVisible() {
        return this.f46105l;
    }

    public boolean isImmediateFlowVisible() {
        return this.m;
    }

    public boolean isInstallSplashScreenVisible() {
        return this.f46106n;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public void registerListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f46094a.zzb(installStateUpdatedListener);
    }

    public void setBytesDownloaded(long j10) {
        if (this.f46097d != 2 || j10 > this.f46104k) {
            return;
        }
        this.f46103j = j10;
        Integer num = 0;
        if (num.equals(this.f46107o)) {
            a();
        }
    }

    public void setClientVersionStalenessDays(@Nullable Integer num) {
        if (this.f46099f) {
            this.f46101h = num;
        }
    }

    public void setInstallErrorCode(@InstallErrorCode int i10) {
        this.f46098e = i10;
    }

    public void setTotalBytesToDownload(long j10) {
        if (this.f46097d == 2) {
            this.f46104k = j10;
            Integer num = 0;
            if (num.equals(this.f46107o)) {
                a();
            }
        }
    }

    public void setUpdateAvailable(int i10) {
        this.f46099f = true;
        ArrayList arrayList = this.f46096c;
        arrayList.clear();
        arrayList.add(0);
        arrayList.add(1);
        this.f46100g = i10;
    }

    public void setUpdateNotAvailable() {
        this.f46099f = false;
        this.f46101h = null;
    }

    public void setUpdatePriority(int i10) {
        if (this.f46099f) {
            this.f46102i = i10;
        }
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task<Integer> startUpdateFlow(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions) {
        return b(appUpdateInfo, appUpdateOptions) ? Tasks.forResult(-1) : Tasks.forException(new InstallException(-6));
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, @AppUpdateType int i10, Activity activity, int i11) {
        return b(appUpdateInfo, AppUpdateOptions.newBuilder(i10).build());
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f46094a.zzc(installStateUpdatedListener);
    }

    public void userAcceptsUpdate() {
        if (this.f46105l || this.m) {
            this.f46105l = false;
            this.f46097d = 1;
            Integer num = 0;
            if (num.equals(this.f46107o)) {
                a();
            }
        }
    }

    public void userCancelsDownload() {
        int i10 = this.f46097d;
        if (i10 == 1 || i10 == 2) {
            this.f46097d = 6;
            Integer num = 0;
            if (num.equals(this.f46107o)) {
                a();
            }
            this.f46107o = null;
            this.m = false;
            this.f46097d = 0;
        }
    }

    public void userRejectsUpdate() {
        if (this.f46105l || this.m) {
            this.f46105l = false;
            this.m = false;
            this.f46107o = null;
            this.f46097d = 0;
        }
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, @AppUpdateType int i10, IntentSenderForResultStarter intentSenderForResultStarter, int i11) {
        return b(appUpdateInfo, AppUpdateOptions.newBuilder(i10).build());
    }

    public void setUpdateAvailable(int i10, @AppUpdateType int i11) {
        this.f46099f = true;
        ArrayList arrayList = this.f46096c;
        arrayList.clear();
        arrayList.add(Integer.valueOf(i11));
        this.f46100g = i10;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions, int i10) {
        return b(appUpdateInfo, appUpdateOptions);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher, AppUpdateOptions appUpdateOptions) {
        return b(appUpdateInfo, appUpdateOptions);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int i10) {
        return b(appUpdateInfo, appUpdateOptions);
    }
}
