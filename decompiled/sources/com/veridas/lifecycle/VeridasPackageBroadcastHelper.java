package com.veridas.lifecycle;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.veridas.lifecycle.VeridasPackageBroadcastHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VeridasPackageBroadcastHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nJ$\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\fJ*\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0013J&\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00132\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001a\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bJ \u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¨\u0006\u0018"}, d2 = {"Lcom/veridas/lifecycle/VeridasPackageBroadcastHelper;", "", "()V", "register", "", "context", "Landroid/content/Context;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "intentFilter", "Landroid/content/IntentFilter;", "intentName", "", "intentNames", "", "send", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "intent", "Landroid/content/Intent;", "after", "Ljava/lang/Runnable;", UnregisterCommand.ID, "broadcastReceivers", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VeridasPackageBroadcastHelper {

    @NotNull
    public static final VeridasPackageBroadcastHelper INSTANCE = new VeridasPackageBroadcastHelper();

    public final void register(@NonNull @NotNull Context context, @NonNull @NotNull BroadcastReceiver broadcastReceiver, @NonNull @NotNull IntentFilter intentFilter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(broadcastReceiver, "broadcastReceiver");
        Intrinsics.checkNotNullParameter(intentFilter, "intentFilter");
        ContextCompat.registerReceiver(context, broadcastReceiver, intentFilter, 4);
    }

    public final void send(@NonNull @NotNull Activity activity, @NonNull @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(intent, "intent");
        send(activity, intent, null);
    }

    public final void unregister(@NonNull @NotNull Context context, @NonNull @NotNull BroadcastReceiver broadcastReceiver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(broadcastReceiver, "broadcastReceiver");
        context.unregisterReceiver(broadcastReceiver);
    }

    public final void register(@NonNull @NotNull Context context, @NonNull @NotNull BroadcastReceiver broadcastReceiver, @NonNull @NotNull String intentName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(broadcastReceiver, "broadcastReceiver");
        Intrinsics.checkNotNullParameter(intentName, "intentName");
        register(context, broadcastReceiver, new IntentFilter(intentName));
    }

    public final void send(@NonNull @NotNull Activity activity, @NonNull @NotNull final Intent intent, @Nullable @org.jetbrains.annotations.Nullable final Runnable after) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(intent, "intent");
        final Context applicationContext = activity.getApplicationContext();
        intent.setPackage(applicationContext.getPackageName());
        activity.runOnUiThread(new Runnable() { // from class: bj.a
            @Override // java.lang.Runnable
            public final void run() {
                VeridasPackageBroadcastHelper veridasPackageBroadcastHelper = VeridasPackageBroadcastHelper.INSTANCE;
                Intent intent2 = intent;
                Intrinsics.checkNotNullParameter(intent2, "$intent");
                applicationContext.sendBroadcast(intent2);
                Runnable runnable = after;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    public final void unregister(@NonNull @NotNull Context context, @NonNull @NotNull List<? extends BroadcastReceiver> broadcastReceivers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(broadcastReceivers, "broadcastReceivers");
        Iterator<? extends BroadcastReceiver> it = broadcastReceivers.iterator();
        while (it.hasNext()) {
            unregister(context, it.next());
        }
    }

    public final void register(@NonNull @NotNull Context context, @NonNull @NotNull BroadcastReceiver broadcastReceiver, @NonNull @NotNull List<String> intentNames) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(broadcastReceiver, "broadcastReceiver");
        Intrinsics.checkNotNullParameter(intentNames, "intentNames");
        Iterator<String> it = intentNames.iterator();
        while (it.hasNext()) {
            register(context, broadcastReceiver, it.next());
        }
    }

    public final void send(@NonNull @NotNull Context context, @NonNull @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.setPackage(context.getApplicationContext().getPackageName());
        context.sendBroadcast(intent);
    }
}
