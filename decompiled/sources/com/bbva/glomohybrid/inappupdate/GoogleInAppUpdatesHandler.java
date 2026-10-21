package com.bbva.glomohybrid.inappupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.camera2.interop.c;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler;
import com.bbva.glomohybrid.base.models.InAppUpdateInfo;
import com.bbva.glomohybrid.base.models.InAppUpdateType;
import com.bbva.glomohybrid.inappupdate.GoogleInAppUpdatesHandler;
import com.bbva.glomohybrid.inappupdate.extensions.InAppUpdateInfoExtensionsKt;
import com.bbva.glomohybrid.inappupdate.extensions.InappUpdateTypeExtensionsKt;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GoogleInAppUpdatesHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/bbva/glomohybrid/inappupdate/GoogleInAppUpdatesHandler;", "Lcom/bbva/glomohybrid/base/inappupdate/InAppUpdatesHandler;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/glomohybrid/base/models/InAppUpdateType;", "inAppUpdateType", "Lcom/bbva/glomohybrid/base/models/InAppUpdateInfo;", "infoUpdate", "", "startFlow", "", EventDataKeys.Acquisition.ACQUISITION_TYPE_INSTALL, "installationRequired", "getInfoForInstall", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateType", "getInfoForDownload", "(Lcom/bbva/glomohybrid/base/models/InAppUpdateType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/appcompat/app/AppCompatActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "configure", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/bbva/glomohybrid/base/inappupdate/InAppUpdatesHandler$InstallState;", "x0", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getFlexibleUpdateAlreadyShown", "()Z", "flexibleUpdateAlreadyShown", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGoogleInAppUpdatesHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleInAppUpdatesHandler.kt\ncom/bbva/glomohybrid/inappupdate/GoogleInAppUpdatesHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n1#2:216\n*E\n"})
public final class GoogleInAppUpdatesHandler implements InAppUpdatesHandler, DefaultLifecycleObserver, CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f32184p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final AppUpdateManager f32185q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public ActivityResultLauncher<IntentSenderRequest> f32186r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final u8.a f32187s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public Lifecycle f32188t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f32189u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InAppUpdatesHandler.InstallState> f32190w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f32191x0;

    /* JADX INFO: compiled from: GoogleInAppUpdatesHandler.kt */
    @SourceDebugExtension({"SMAP\nGoogleInAppUpdatesHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleInAppUpdatesHandler.kt\ncom/bbva/glomohybrid/inappupdate/GoogleInAppUpdatesHandler$getInfoForInstall$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n1#2:216\n*E\n"})
    public static final class a<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Continuation<InAppUpdateInfo> f32193b;

        public a(SafeContinuation safeContinuation) {
            this.f32193b = safeContinuation;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(@NotNull Task<AppUpdateInfo> updateInfo) {
            Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
            AppUpdateInfo appUpdateInfoAccess$getOrNull = GoogleInAppUpdatesHandler.access$getOrNull(GoogleInAppUpdatesHandler.this, updateInfo);
            if (appUpdateInfoAccess$getOrNull == null || appUpdateInfoAccess$getOrNull.installStatus() != 11) {
                appUpdateInfoAccess$getOrNull = null;
            }
            this.f32193b.resumeWith(Result.m5535constructorimpl(appUpdateInfoAccess$getOrNull != null ? new InAppUpdateInfo(appUpdateInfoAccess$getOrNull.availableVersionCode(), appUpdateInfoAccess$getOrNull) : null));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [u8.a] */
    public GoogleInAppUpdatesHandler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32184p0 = CoroutineScopeKt.MainScope();
        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(context);
        Intrinsics.checkNotNullExpressionValue(appUpdateManagerCreate, "create(...)");
        this.f32185q0 = appUpdateManagerCreate;
        this.f32187s0 = new InstallStateUpdatedListener() { // from class: u8.a
            @Override // com.google.android.play.core.listener.StateUpdatedListener
            public final void onStateUpdate(InstallState installState) {
                InstallState it = installState;
                GoogleInAppUpdatesHandler this$0 = this.f93746a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.installStatus() == 11) {
                    this$0.f32190w0.setValue(InAppUpdatesHandler.InstallState.READY);
                    this$0.f32185q0.unregisterListener(this$0.f32187s0);
                }
            }
        };
        MutableStateFlow<InAppUpdatesHandler.InstallState> MutableStateFlow = StateFlowKt.MutableStateFlow(InAppUpdatesHandler.InstallState.NONE);
        this.f32190w0 = MutableStateFlow;
        this.f32191x0 = MutableStateFlow;
    }

    public static final AppUpdateInfo access$getFlexibleUpdateData(GoogleInAppUpdatesHandler googleInAppUpdatesHandler, AppUpdateInfo appUpdateInfo) {
        googleInAppUpdatesHandler.getClass();
        if (appUpdateInfo != null && appUpdateInfo.isUpdateTypeAllowed(0) && ((appUpdateInfo != null && appUpdateInfo.updateAvailability() == 2) || (appUpdateInfo != null && appUpdateInfo.updateAvailability() == 3))) {
            if (appUpdateInfo != null && appUpdateInfo.installStatus() == 0) {
                return appUpdateInfo;
            }
            if (appUpdateInfo != null && appUpdateInfo.installStatus() == 6) {
                return appUpdateInfo;
            }
            if (appUpdateInfo != null && appUpdateInfo.installStatus() == 5) {
                return appUpdateInfo;
            }
        }
        return null;
    }

    public static final AppUpdateInfo access$getImmediateUpdateData(GoogleInAppUpdatesHandler googleInAppUpdatesHandler, AppUpdateInfo appUpdateInfo) {
        googleInAppUpdatesHandler.getClass();
        if (appUpdateInfo != null && appUpdateInfo.isUpdateTypeAllowed(1)) {
            if (appUpdateInfo != null && appUpdateInfo.updateAvailability() == 2) {
                return appUpdateInfo;
            }
            if (appUpdateInfo != null && appUpdateInfo.updateAvailability() == 3) {
                return appUpdateInfo;
            }
        }
        return null;
    }

    public static final AppUpdateInfo access$getOrNull(GoogleInAppUpdatesHandler googleInAppUpdatesHandler, Task task) {
        googleInAppUpdatesHandler.getClass();
        if (task.isSuccessful()) {
            return (AppUpdateInfo) task.getResult();
        }
        return null;
    }

    @Override // com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler
    public void configure(@NotNull AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f32189u0 = false;
        this.f32188t0 = null;
        this.f32186r0 = null;
        Lifecycle lifecycle = activity.getLifecycle();
        lifecycle.addObserver(this);
        this.f32188t0 = lifecycle;
        ActivityResultRegistry activityResultRegistry = activity.getActivityResultRegistry();
        String strValueOf = String.valueOf(Reflection.getOrCreateKotlinClass(GoogleInAppUpdatesHandler.class).getSimpleName());
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        this.f32186r0 = activityResultRegistry.register(strValueOf, activity, new ActivityResultContracts.StartIntentSenderForResult(), new c(this));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f32184p0.getCoroutineContext();
    }

    @Override // com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler
    /* JADX INFO: renamed from: getFlexibleUpdateAlreadyShown, reason: from getter */
    public boolean getV0() {
        return this.v0;
    }

    @Override // com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler
    @Nullable
    public Object getInfoForDownload(@NotNull final InAppUpdateType inAppUpdateType, @NotNull Continuation<? super InAppUpdateInfo> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        this.f32185q0.getAppUpdateInfo().addOnCompleteListener(new OnCompleteListener() { // from class: com.bbva.glomohybrid.inappupdate.GoogleInAppUpdatesHandler$getInfoForDownload$2$1

            /* JADX INFO: compiled from: GoogleInAppUpdatesHandler.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[InAppUpdateType.values().length];
                    try {
                        iArr[InAppUpdateType.IMMEDIATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InAppUpdateType.FLEXIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(@NotNull Task<AppUpdateInfo> updateInfo) {
                AppUpdateInfo appUpdateInfoAccess$getImmediateUpdateData;
                Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
                GoogleInAppUpdatesHandler googleInAppUpdatesHandler = this.f32194a;
                AppUpdateInfo appUpdateInfoAccess$getOrNull = GoogleInAppUpdatesHandler.access$getOrNull(googleInAppUpdatesHandler, updateInfo);
                int i10 = WhenMappings.$EnumSwitchMapping$0[inAppUpdateType.ordinal()];
                if (i10 == 1) {
                    appUpdateInfoAccess$getImmediateUpdateData = GoogleInAppUpdatesHandler.access$getImmediateUpdateData(googleInAppUpdatesHandler, appUpdateInfoAccess$getOrNull);
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    appUpdateInfoAccess$getImmediateUpdateData = GoogleInAppUpdatesHandler.access$getFlexibleUpdateData(googleInAppUpdatesHandler, appUpdateInfoAccess$getOrNull);
                }
                safeContinuation.resumeWith(Result.m5535constructorimpl(appUpdateInfoAccess$getImmediateUpdateData != null ? new InAppUpdateInfo(appUpdateInfoAccess$getImmediateUpdateData.availableVersionCode(), appUpdateInfoAccess$getImmediateUpdateData) : null));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler
    @Nullable
    public Object getInfoForInstall(@NotNull Continuation<? super InAppUpdateInfo> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        this.f32185q0.getAppUpdateInfo().addOnCompleteListener(new a(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler
    @NotNull
    public StateFlow<InAppUpdatesHandler.InstallState> getState() {
        return this.f32191x0;
    }

    @Override // com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler
    public void install() {
        this.f32185q0.completeUpdate();
        this.f32189u0 = false;
    }

    @Override // com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler
    public void installationRequired() {
        this.f32189u0 = false;
        this.f32190w0.setValue(InAppUpdatesHandler.InstallState.REQUIRED);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        androidx.lifecycle.c.b(this, owner);
        this.f32189u0 = false;
        this.f32188t0 = null;
        this.f32186r0 = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.f(this, lifecycleOwner);
    }

    @Override // com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler
    public boolean startFlow(@NotNull InAppUpdateType inAppUpdateType, @NotNull InAppUpdateInfo infoUpdate) throws IntentSender.SendIntentException {
        Lifecycle lifecycle;
        Lifecycle.State f21906d;
        Intrinsics.checkNotNullParameter(inAppUpdateType, "inAppUpdateType");
        Intrinsics.checkNotNullParameter(infoUpdate, "infoUpdate");
        AppUpdateInfo validData = InAppUpdateInfoExtensionsKt.getValidData(infoUpdate);
        if (validData == null || (lifecycle = this.f32188t0) == null || (f21906d = lifecycle.getF21906d()) == null || !f21906d.isAtLeast(Lifecycle.State.RESUMED)) {
            return false;
        }
        InAppUpdateType inAppUpdateType2 = InAppUpdateType.FLEXIBLE;
        AppUpdateManager appUpdateManager = this.f32185q0;
        if (inAppUpdateType == inAppUpdateType2) {
            appUpdateManager.registerListener(this.f32187s0);
        }
        this.f32189u0 = inAppUpdateType == inAppUpdateType2;
        appUpdateManager.startUpdateFlowForResult(validData, InappUpdateTypeExtensionsKt.getValue(inAppUpdateType), new IntentSenderForResultStarter() { // from class: u8.b
            @Override // com.google.android.play.core.common.IntentSenderForResultStarter
            public final void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) {
                GoogleInAppUpdatesHandler this$0 = this.f93747a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(intent, "intent");
                IntentSenderRequest intentSenderRequestBuild = new IntentSenderRequest.Builder(intent).setFillInIntent(intent2).setFlags(i12, i11).build();
                ActivityResultLauncher<IntentSenderRequest> activityResultLauncher = this$0.f32186r0;
                if (activityResultLauncher != null) {
                    activityResultLauncher.launch(intentSenderRequestBuild);
                }
            }
        }, 23478);
        return true;
    }
}
