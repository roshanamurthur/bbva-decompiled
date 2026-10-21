package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.BuildConfig;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.Unit;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f19858p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f19859q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f19858p0 = i10;
        this.f19859q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f19858p0) {
            case 0:
                ActivityCompat.lambda$recreate$0((Activity) this.f19859q0);
                return;
            case 1:
                InvalidationTracker invalidationTracker = (InvalidationTracker) this.f19859q0;
                synchronized (invalidationTracker.f23218o) {
                    invalidationTracker.f23212h = false;
                    invalidationTracker.f23214j.resetTriggerState();
                    SupportSQLiteStatement supportSQLiteStatement = invalidationTracker.cleanupStatement;
                    if (supportSQLiteStatement != null) {
                        supportSQLiteStatement.close();
                        Unit unit = Unit.INSTANCE;
                    }
                    break;
                }
                return;
            case 2:
                DocumentFragment.e((DocumentFragment) this.f19859q0);
                return;
            default:
                Context context = ((FirebaseMessaging) this.f19859q0).f48553d;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                if (applicationContext.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0).getBoolean("proxy_notification_initialized", false)) {
                    return;
                }
                try {
                    Context applicationContext2 = context.getApplicationContext();
                    PackageManager packageManager = applicationContext2.getPackageManager();
                    z10 = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled") : true;
                    break;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (!PlatformVersion.isAtLeastQ()) {
                    Tasks.forResult(null);
                    return;
                }
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                new com.google.firebase.messaging.m(context, z10, taskCompletionSource).run();
                taskCompletionSource.getTask();
                return;
        }
    }
}
