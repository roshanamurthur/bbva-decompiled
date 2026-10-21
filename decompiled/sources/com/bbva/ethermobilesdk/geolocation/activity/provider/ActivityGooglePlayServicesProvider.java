package com.bbva.ethermobilesdk.geolocation.activity.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.geolocation.activity.model.ActivityParams;
import com.bbva.ethermobilesdk.geolocation.activity.model.ActivityResponse;
import com.bbva.ethermobilesdk.geolocation.receiver.JobServiceReceiver;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.geolocation.utils.extension.LoggerKt;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.nulabinc.zxcvbn.Guess;
import f7.a;
import f7.c;
import f7.e;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActivityGooglePlayServicesProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\b\u0010\t\u001a\u00020\bH\u0017R\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/activity/provider/ActivityGooglePlayServicesProvider;", "Lcom/bbva/ethermobilesdk/geolocation/activity/provider/ActivityProvider;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/ethermobilesdk/geolocation/activity/model/ActivityParams;", "params", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobilesdk/geolocation/activity/model/ActivityResponse;", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "stop", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class ActivityGooglePlayServicesProvider implements ActivityProvider, CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29780p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Context f29781q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<ActivityResponse> f29782r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final ActivityRecognitionClient f29783s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final ActivityGooglePlayServicesProvider$activityReceiver$1 f29784t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final PendingIntent f29785u0;

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bbva.ethermobilesdk.geolocation.activity.provider.ActivityGooglePlayServicesProvider$activityReceiver$1] */
    public ActivityGooglePlayServicesProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29780p0 = CoroutineScopeKt.MainScope();
        this.f29781q0 = context;
        this.f29782r0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        ActivityRecognitionClient client = ActivityRecognition.getClient(context);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        this.f29783s0 = client;
        this.f29784t0 = new BroadcastReceiver() { // from class: com.bbva.ethermobilesdk.geolocation.activity.provider.ActivityGooglePlayServicesProvider$activityReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent != null && Intrinsics.areEqual(ConstantsKt.getBROADCAST_INTENT_ACTION(), intent.getAction()) && intent.hasExtra(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID)) {
                    LoggerKt.log("sending new activity");
                    int i10 = Build.VERSION.SDK_INT;
                    ActivityGooglePlayServicesProvider activityGooglePlayServicesProvider = this.f29786a;
                    if (i10 >= 33) {
                        ActivityResponse activityResponse = (ActivityResponse) intent.getParcelableExtra(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, ActivityResponse.class);
                        if (activityResponse != null) {
                            ActivityGooglePlayServicesProvider.access$notifyActivity(activityGooglePlayServicesProvider, activityResponse);
                            return;
                        }
                        return;
                    }
                    ActivityResponse activityResponse2 = (ActivityResponse) intent.getParcelableExtra(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
                    if (activityResponse2 != null) {
                        ActivityGooglePlayServicesProvider.access$notifyActivity(activityGooglePlayServicesProvider, activityResponse2);
                    }
                }
            }
        };
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) JobServiceReceiver.class);
        intent.putExtra(ConstantsKt.TYPE, ConstantsKt.ACTIVITY_TYPE);
        intent.setAction(ConstantsKt.JOB_SERVICE_ACTION);
        this.f29785u0 = PendingIntent.getBroadcast(context.getApplicationContext(), Guess.REFERENCE_YEAR, intent, ConstantsKt.isEqualOrGreaterThanS() ? 167772160 : 134217728);
    }

    public static final void access$notifyActivity(ActivityGooglePlayServicesProvider activityGooglePlayServicesProvider, ActivityResponse activityResponse) {
        activityGooglePlayServicesProvider.getClass();
        BuildersKt__Builders_commonKt.launch$default(activityGooglePlayServicesProvider, null, null, new e(activityGooglePlayServicesProvider, activityResponse, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f29780p0.getCoroutineContext();
    }

    @Override // com.bbva.ethermobilesdk.geolocation.activity.provider.ActivityProvider
    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    @NotNull
    public Flow<ActivityResponse> start(@NotNull ActivityParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        IntentFilter intentFilter = new IntentFilter(ConstantsKt.getBROADCAST_INTENT_ACTION());
        int i10 = Build.VERSION.SDK_INT;
        ActivityGooglePlayServicesProvider$activityReceiver$1 activityGooglePlayServicesProvider$activityReceiver$1 = this.f29784t0;
        Context context = this.f29781q0;
        if (i10 >= 34) {
            context.getApplicationContext().registerReceiver(activityGooglePlayServicesProvider$activityReceiver$1, intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(activityGooglePlayServicesProvider$activityReceiver$1, intentFilter);
        }
        Task<Void> taskRequestActivityUpdates = this.f29783s0.requestActivityUpdates(params.getInterval(), this.f29785u0);
        final a aVar = new a();
        taskRequestActivityUpdates.addOnSuccessListener(new OnSuccessListener() { // from class: f7.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                aVar.invoke(obj);
            }
        }).addOnFailureListener(new c());
        return this.f29782r0;
    }

    @Override // com.bbva.ethermobilesdk.geolocation.activity.provider.ActivityProvider
    @SuppressLint({"MissingPermission"})
    public void stop() {
        LoggerKt.log("stop");
        this.f29783s0.removeActivityUpdates(this.f29785u0);
        try {
            this.f29781q0.getApplicationContext().unregisterReceiver(this.f29784t0);
        } catch (IllegalArgumentException e5) {
            LoggerKt.logError("Calling stop more times than necessary", e5);
        }
    }
}
