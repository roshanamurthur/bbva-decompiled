package com.bbva.ethermobilesdk.geolocation.geofencing.provider;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import androidx.core.content.ContextCompat;
import bk.d;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.geolocation.geofencing.model.GeofenceModel;
import com.bbva.ethermobilesdk.geolocation.geofencing.model.TransitionGeofence;
import com.bbva.ethermobilesdk.geolocation.geofencing.store.GeofencingStore;
import com.bbva.ethermobilesdk.geolocation.receiver.JobServiceReceiver;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.geolocation.utils.extension.LoggerKt;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import i7.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GeofencingGooglePlayServicesProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000e\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0013\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/geofencing/provider/GeofencingGooglePlayServicesProvider;", "Lcom/bbva/ethermobilesdk/geolocation/geofencing/provider/GeofencingProvider;", "Lcom/google/android/gms/common/api/ResultCallback;", "Lcom/google/android/gms/common/api/Status;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/TransitionGeofence;", EventDataKeys.Lifecycle.LIFECYCLE_START, "Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/GeofenceModel;", "geofence", "", "addGeofence", "", "geofenceList", "addGeofences", "", "geofenceId", "removeGeofence", "geofenceIds", "removeGeofences", "stop", "status", "onResult", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"UnspecifiedRegisterReceiverFlag"})
@SourceDebugExtension({"SMAP\nGeofencingGooglePlayServicesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeofencingGooglePlayServicesProvider.kt\ncom/bbva/ethermobilesdk/geolocation/geofencing/provider/GeofencingGooglePlayServicesProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n1863#2,2:196\n1863#2,2:198\n*S KotlinDebug\n*F\n+ 1 GeofencingGooglePlayServicesProvider.kt\ncom/bbva/ethermobilesdk/geolocation/geofencing/provider/GeofencingGooglePlayServicesProvider\n*L\n128#1:196,2\n159#1:198,2\n*E\n"})
public final class GeofencingGooglePlayServicesProvider implements GeofencingProvider, ResultCallback<Status>, CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29810p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Context f29811q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<TransitionGeofence> f29812r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final GeofencingStore f29813s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final GeofencingClient f29814t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final List<Geofence> f29815u0;
    public final List<String> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final GeofencingGooglePlayServicesProvider$geofencingReceiver$1 f29816w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final PendingIntent f29817x0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.content.BroadcastReceiver, com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingGooglePlayServicesProvider$geofencingReceiver$1] */
    public GeofencingGooglePlayServicesProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29810p0 = CoroutineScopeKt.MainScope();
        this.f29811q0 = context;
        this.f29812r0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f29813s0 = new GeofencingStore(context);
        GeofencingClient geofencingClient = LocationServices.getGeofencingClient(context);
        Intrinsics.checkNotNullExpressionValue(geofencingClient, "getGeofencingClient(...)");
        this.f29814t0 = geofencingClient;
        this.f29815u0 = Collections.synchronizedList(new ArrayList());
        this.v0 = Collections.synchronizedList(new ArrayList());
        ?? r1 = new BroadcastReceiver() { // from class: com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingGooglePlayServicesProvider$geofencingReceiver$1

            /* JADX INFO: compiled from: GeofencingGooglePlayServicesProvider.kt */
            @DebugMetadata(c = "com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingGooglePlayServicesProvider$geofencingReceiver$1$onReceive$1$1$1$1", f = "GeofencingGooglePlayServicesProvider.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f29819p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ GeofencingGooglePlayServicesProvider f29820q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ GeofenceModel f29821r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ int f29822s0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(GeofencingGooglePlayServicesProvider geofencingGooglePlayServicesProvider, GeofenceModel geofenceModel, int i10, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f29820q0 = geofencingGooglePlayServicesProvider;
                    this.f29821r0 = geofenceModel;
                    this.f29822s0 = i10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f29820q0, this.f29821r0, this.f29822s0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f29819p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        MutableSharedFlow mutableSharedFlow = this.f29820q0.f29812r0;
                        TransitionGeofence transitionGeofence = new TransitionGeofence(this.f29821r0, this.f29822s0);
                        this.f29819p0 = 1;
                        if (mutableSharedFlow.emit(transitionGeofence, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent != null) {
                    GeofencingGooglePlayServicesProvider geofencingGooglePlayServicesProvider = this.f29818a;
                    if (Intrinsics.areEqual(ConstantsKt.getGEOFENCE_BROADCAST_INTENT_ACTION(), intent.getAction()) && intent.hasExtra(ConstantsKt.GEOFENCES_EXTRA_ID)) {
                        LoggerKt.log("Received geofencing event");
                        int intExtra = intent.getIntExtra(ConstantsKt.TRANSITION_EXTRA_ID, -1);
                        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(ConstantsKt.GEOFENCES_EXTRA_ID);
                        if (stringArrayListExtra != null) {
                            for (String str : stringArrayListExtra) {
                                GeofencingStore geofencingStore = geofencingGooglePlayServicesProvider.f29813s0;
                                Intrinsics.checkNotNull(str);
                                GeofenceModel geofenceModel = geofencingStore.get(str);
                                if (geofenceModel != null) {
                                    BuildersKt__Builders_commonKt.launch$default(geofencingGooglePlayServicesProvider, null, null, new a(geofencingGooglePlayServicesProvider, geofenceModel, intExtra, null), 3, null);
                                } else {
                                    LoggerKt.log(str + " not present in store");
                                }
                            }
                        }
                    }
                }
            }
        };
        this.f29816w0 = r1;
        Intent intent = new Intent(context, (Class<?>) JobServiceReceiver.class);
        intent.putExtra(ConstantsKt.TYPE, ConstantsKt.GEOFENCING_TYPE);
        intent.setAction(ConstantsKt.JOB_SERVICE_ACTION);
        this.f29817x0 = PendingIntent.getBroadcast(context.getApplicationContext(), 0, intent, ConstantsKt.isEqualOrGreaterThanS() ? 167772160 : 134217728);
        IntentFilter intentFilter = new IntentFilter(ConstantsKt.getGEOFENCE_BROADCAST_INTENT_ACTION());
        if (Build.VERSION.SDK_INT >= 34) {
            context.registerReceiver(r1, intentFilter, 4);
        } else {
            context.registerReceiver(r1, intentFilter);
        }
    }

    @Override // com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingProvider
    public void addGeofence(@NotNull GeofenceModel geofence) {
        Intrinsics.checkNotNullParameter(geofence, "geofence");
        addGeofences(d.listOf(geofence));
    }

    @Override // com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingProvider
    public void addGeofences(@NotNull List<GeofenceModel> geofenceList) {
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        ArrayList arrayList = new ArrayList();
        for (GeofenceModel geofenceModel : geofenceList) {
            this.f29813s0.put(geofenceModel.getRequestId(), geofenceModel);
            arrayList.add(geofenceModel.toGeofence());
        }
        List<Geofence> geofencesToAdd = this.f29815u0;
        Intrinsics.checkNotNullExpressionValue(geofencesToAdd, "geofencesToAdd");
        List<Geofence> list = geofencesToAdd;
        if (!list.isEmpty()) {
            arrayList.addAll(list);
            geofencesToAdd.clear();
        }
        if (ContextCompat.checkSelfPermission(this.f29811q0, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        GeofencingRequest geofencingRequestBuild = new GeofencingRequest.Builder().setInitialTrigger(1).addGeofences(arrayList).build();
        Intrinsics.checkNotNullExpressionValue(geofencingRequestBuild, "build(...)");
        Task<Void> taskAddGeofences = this.f29814t0.addGeofences(geofencingRequestBuild, this.f29817x0);
        final a aVar = new a();
        taskAddGeofences.addOnSuccessListener(new OnSuccessListener() { // from class: i7.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                aVar.invoke(obj);
            }
        });
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f29810p0.getCoroutineContext();
    }

    @Override // com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingProvider
    public void removeGeofence(@NotNull String geofenceId) {
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        removeGeofences(d.listOf(geofenceId));
    }

    @Override // com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingProvider
    public void removeGeofences(@NotNull List<String> geofenceIds) {
        Intrinsics.checkNotNullParameter(geofenceIds, "geofenceIds");
        List<String> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) geofenceIds);
        Iterator it = mutableList.iterator();
        while (it.hasNext()) {
            this.f29813s0.remove((String) it.next());
        }
        List<String> geofencesToRemove = this.v0;
        Intrinsics.checkNotNullExpressionValue(geofencesToRemove, "geofencesToRemove");
        if (!geofencesToRemove.isEmpty()) {
            Intrinsics.checkNotNullExpressionValue(geofencesToRemove, "geofencesToRemove");
            mutableList.addAll(geofencesToRemove);
            geofencesToRemove.clear();
        }
        this.f29814t0.removeGeofences(mutableList);
    }

    @Override // com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingProvider
    public void stop() {
        LoggerKt.log("stop");
        try {
            this.f29811q0.unregisterReceiver(this.f29816w0);
        } catch (IllegalArgumentException e5) {
            LoggerKt.logError("Calling stop more times than necessary", e5);
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public void onResult(@NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (status.isSuccess()) {
            LoggerKt.log("Geofencing update request successful");
            return;
        }
        if (status.hasResolution()) {
            Context context = this.f29811q0;
            if (context instanceof Activity) {
                LoggerKt.log("Unable to register - startActivityForResult expecting 10003");
                try {
                    status.startResolutionForResult((Activity) context, ConstantsKt.RESULT_CODE);
                    return;
                } catch (IntentSender.SendIntentException e5) {
                    LoggerKt.logError("problem with startResolutionForResult", e5);
                    return;
                }
            }
        }
        LoggerKt.logError$default("Registering failed: " + status.getStatusMessage(), null, 2, null);
    }

    @Override // com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingProvider
    @NotNull
    public MutableSharedFlow<TransitionGeofence> start() {
        return this.f29812r0;
    }
}
