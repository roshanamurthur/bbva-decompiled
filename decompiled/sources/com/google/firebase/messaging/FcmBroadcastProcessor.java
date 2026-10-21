package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class FcmBroadcastProcessor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f48542c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("lock")
    public static b0 f48543d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f48545b;

    public FcmBroadcastProcessor(Context context) {
        this.f48544a = context;
        this.f48545b = new a3.f(1);
    }

    public static Task<Integer> a(Context context, Intent intent) {
        if (ServiceStarter.a().c(context)) {
            b0 b0VarB = b(context);
            synchronized (x.f48731b) {
                try {
                    int i10 = 1;
                    if (x.f48732c == null) {
                        WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                        x.f48732c = wakeLock;
                        wakeLock.setReferenceCounted(true);
                    }
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        x.f48732c.acquire(x.f48730a);
                    }
                    b0VarB.b(intent).addOnCompleteListener(new pb.a(intent, i10));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            b(context).b(intent);
        }
        return Tasks.forResult(-1);
    }

    public static b0 b(Context context) {
        b0 b0Var;
        synchronized (f48542c) {
            try {
                if (f48543d == null) {
                    f48543d = new b0(context);
                }
                b0Var = f48543d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b0Var;
    }

    @VisibleForTesting
    public static void reset() {
        synchronized (f48542c) {
            f48543d = null;
        }
    }

    @KeepForSdk
    public Task<Integer> process(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra(Constants.MessagePayloadKeys.RAW_DATA, Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return startMessagingService(this.f48544a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> startMessagingService(final Context context, final Intent intent) {
        boolean z10 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & 268435456) != 0;
        if (z10 && !z11) {
            return a(context, intent);
        }
        Callable callable = new Callable() { // from class: com.google.firebase.messaging.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj = FcmBroadcastProcessor.f48542c;
                return Integer.valueOf(ServiceStarter.a().startMessagingService(context, intent));
            }
        };
        Executor executor = this.f48545b;
        return Tasks.call(executor, callable).continueWithTask(executor, new androidx.camera.lifecycle.c(context, intent));
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.f48544a = context;
        this.f48545b = executorService;
    }
}
