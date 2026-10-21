package com.google.android.play.core.ktx;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010 \u001a\u0002H!\"\u0004\b\u0000\u0010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0#2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010'\u001a\u0015\u0010(\u001a\u00020\u0002*\u00020)H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*\u001a\u0015\u0010+\u001a\u00020&*\u00020)H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*\u001a\u0010\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-*\u00020)\u001a*\u0010/\u001a\u00020\f*\u00020)2\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\b\u001a%\u00106\u001a\u00020\f\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u0002H7082\u0006\u00109\u001a\u0002H7H\u0000¢\u0006\u0002\u0010:\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0016\u0010\u000b\u001a\u00020\f*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0016\u0010\u000f\u001a\u00020\b*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\b*\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0016\u0010\u0012\u001a\u00020\b*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\"\u0016\u0010\u0015\u001a\u00020\f*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0016\u0010\u0017\u001a\u00020\f*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016\"\u0016\u0010\u0018\u001a\u00020\u0019*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0016\u0010\u001c\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0004\"\u0016\u0010\u001c\u001a\u00020\u0001*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0006\"\u0016\u0010\u001e\u001a\u00020\b*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"bytesDownloaded", "", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "getBytesDownloaded", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)J", "Lcom/google/android/play/core/install/InstallState;", "(Lcom/google/android/play/core/install/InstallState;)J", "clientVersionStalenessDays", "", "getClientVersionStalenessDays", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)Ljava/lang/Integer;", "hasTerminalStatus", "", "getHasTerminalStatus", "(Lcom/google/android/play/core/install/InstallState;)Z", "installErrorCode", "getInstallErrorCode", "(Lcom/google/android/play/core/install/InstallState;)I", "installStatus", "getInstallStatus", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)I", "isFlexibleUpdateAllowed", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)Z", "isImmediateUpdateAllowed", "packageName", "", "getPackageName", "(Lcom/google/android/play/core/install/InstallState;)Ljava/lang/String;", "totalBytesToDownload", "getTotalBytesToDownload", "updatePriority", "getUpdatePriority", "runTask", ExifInterface.GPS_DIRECTION_TRUE, "task", "Lcom/google/android/gms/tasks/Task;", "onCanceled", "Lkotlin/Function0;", "", "(Lcom/google/android/gms/tasks/Task;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestAppUpdateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestCompleteUpdate", "requestUpdateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "startUpdateFlowForResult", "appUpdateInfo", "fragment", "Landroidx/fragment/app/Fragment;", "options", "Lcom/google/android/play/core/appupdate/AppUpdateOptions;", "requestCode", "tryOffer", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/SendChannel;", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Z", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AppUpdateManagerKtxKt {

    /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @DebugMetadata(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt", f = "AppUpdateManagerKtx.kt", i = {}, l = {226}, m = "requestAppUpdateInfo", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f46137p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f46138q0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46137p0 = obj;
            this.f46138q0 |= Integer.MIN_VALUE;
            return AppUpdateManagerKtxKt.requestAppUpdateInfo(null, this);
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @DebugMetadata(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1", f = "AppUpdateManagerKtx.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<ProducerScope<? super AppUpdateResult>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f46139p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f46140q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AppUpdateManager f46141r0;

        /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
        public static final class a<TResult> implements OnSuccessListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ProducerScope<AppUpdateResult> f46142a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppUpdateManager f46143b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ue.a f46144c;

            /* JADX WARN: Multi-variable type inference failed */
            public a(ProducerScope<? super AppUpdateResult> producerScope, AppUpdateManager appUpdateManager, ue.a aVar) {
                this.f46142a = producerScope;
                this.f46143b = appUpdateManager;
                this.f46144c = aVar;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                AppUpdateInfo updateInfo = (AppUpdateInfo) obj;
                int iUpdateAvailability = updateInfo.updateAvailability();
                ProducerScope<AppUpdateResult> producerScope = this.f46142a;
                if (iUpdateAvailability == 0) {
                    producerScope.close(new InstallException(-2));
                    return;
                }
                if (iUpdateAvailability == 1) {
                    AppUpdateManagerKtxKt.tryOffer(producerScope, AppUpdateResult.NotAvailable.INSTANCE);
                    SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
                    return;
                }
                if (iUpdateAvailability == 2 || iUpdateAvailability == 3) {
                    Intrinsics.checkNotNullExpressionValue(updateInfo, "updateInfo");
                    int iInstallStatus = updateInfo.installStatus();
                    AppUpdateManager appUpdateManager = this.f46143b;
                    if (iInstallStatus == 11) {
                        AppUpdateManagerKtxKt.tryOffer(producerScope, new AppUpdateResult.Downloaded(appUpdateManager));
                        SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
                    } else {
                        appUpdateManager.registerListener(this.f46144c);
                        AppUpdateManagerKtxKt.tryOffer(producerScope, new AppUpdateResult.Available(appUpdateManager, updateInfo));
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
        public static final class C0200b implements OnFailureListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ProducerScope<AppUpdateResult> f46145a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0200b(ProducerScope<? super AppUpdateResult> producerScope) {
                this.f46145a = producerScope;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(@NotNull Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f46145a.close(exception);
            }
        }

        /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
        public static final class c extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AppUpdateManager f46146p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ ue.a f46147q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AppUpdateManager appUpdateManager, ue.a aVar) {
                super(0);
                this.f46146p0 = appUpdateManager;
                this.f46147q0 = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f46146p0.unregisterListener(this.f46147q0);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
        public static final class d implements InstallStateUpdatedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ProducerScope<AppUpdateResult> f46148a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppUpdateManager f46149b;

            /* JADX WARN: Multi-variable type inference failed */
            public d(ProducerScope<? super AppUpdateResult> producerScope, AppUpdateManager appUpdateManager) {
                this.f46148a = producerScope;
                this.f46149b = appUpdateManager;
            }

            @Override // com.google.android.play.core.listener.StateUpdatedListener
            public final void onStateUpdate(InstallState installState) {
                InstallState installState2 = installState;
                Intrinsics.checkNotNullParameter(installState2, "installState");
                int iInstallStatus = installState2.installStatus();
                ProducerScope<AppUpdateResult> producerScope = this.f46148a;
                if (iInstallStatus == 11) {
                    AppUpdateManagerKtxKt.tryOffer(producerScope, new AppUpdateResult.Downloaded(this.f46149b));
                } else {
                    AppUpdateManagerKtxKt.tryOffer(producerScope, new AppUpdateResult.InProgress(installState2));
                }
            }
        }

        /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
        public static final class e extends Lambda implements Function1<ue.a, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ ProducerScope<AppUpdateResult> f46150p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public e(ProducerScope<? super AppUpdateResult> producerScope) {
                super(1);
                this.f46150p0 = producerScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(ue.a aVar) {
                ue.a $receiver = aVar;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                SendChannel.DefaultImpls.close$default(this.f46150p0, null, 1, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AppUpdateManager appUpdateManager, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f46141r0 = appUpdateManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f46141r0, continuation);
            bVar.f46140q0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super AppUpdateResult> producerScope, Continuation<? super Unit> continuation) {
            return ((b) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f46139p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.f46140q0;
                AppUpdateManager appUpdateManager = this.f46141r0;
                ue.a aVar = new ue.a(new d(producerScope, appUpdateManager), new e(producerScope));
                appUpdateManager.getAppUpdateInfo().addOnSuccessListener(new a(producerScope, appUpdateManager, aVar)).addOnFailureListener(new C0200b(producerScope));
                c cVar = new c(appUpdateManager, aVar);
                this.f46139p0 = 1;
                if (ProduceKt.awaitClose(producerScope, cVar, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f46151p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    public static final class d extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46152p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0<Unit> function0) {
            super(1);
            this.f46152p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            this.f46152p0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    public static final class e<TResult> implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<T> f46153a;

        public e(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f46153a = cancellableContinuationImpl;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(T t10) {
            this.f46153a.resumeWith(Result.m5535constructorimpl(t10));
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    public static final class f implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<T> f46154a;

        public f(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f46154a = cancellableContinuationImpl;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(@NotNull Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f46154a.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(exception)));
        }
    }

    public static final long getBytesDownloaded(@NotNull AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.bytesDownloaded();
    }

    @Nullable
    public static final Integer getClientVersionStalenessDays(@NotNull AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.clientVersionStalenessDays();
    }

    public static final boolean getHasTerminalStatus(@NotNull InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        int iInstallStatus = installState.installStatus();
        return iInstallStatus == 0 || iInstallStatus == 11 || iInstallStatus == 5 || iInstallStatus == 6;
    }

    @InstallErrorCode
    public static final int getInstallErrorCode(@NotNull InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        return installState.installErrorCode();
    }

    @InstallStatus
    public static final int getInstallStatus(@NotNull AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.installStatus();
    }

    @NotNull
    public static final String getPackageName(@NotNull InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        String strPackageName = installState.packageName();
        Intrinsics.checkNotNullExpressionValue(strPackageName, "packageName()");
        return strPackageName;
    }

    public static final long getTotalBytesToDownload(@NotNull AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.totalBytesToDownload();
    }

    public static final int getUpdatePriority(@NotNull AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.updatePriority();
    }

    public static final boolean isFlexibleUpdateAllowed(@NotNull AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.isUpdateTypeAllowed(0);
    }

    public static final boolean isImmediateUpdateAllowed(@NotNull AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.isUpdateTypeAllowed(1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object requestAppUpdateInfo(@NotNull AppUpdateManager appUpdateManager, @NotNull Continuation<? super AppUpdateInfo> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f46138q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f46138q0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objRunTask$default = aVar.f46137p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f46138q0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objRunTask$default);
            Task<AppUpdateInfo> appUpdateInfo = appUpdateManager.getAppUpdateInfo();
            Intrinsics.checkNotNullExpressionValue(appUpdateInfo, "appUpdateInfo");
            aVar.f46138q0 = 1;
            objRunTask$default = runTask$default(appUpdateInfo, null, aVar, 2, null);
            if (objRunTask$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRunTask$default);
        }
        Intrinsics.checkNotNullExpressionValue(objRunTask$default, "runTask(appUpdateInfo)");
        return objRunTask$default;
    }

    @Nullable
    public static final Object requestCompleteUpdate(@NotNull AppUpdateManager appUpdateManager, @NotNull Continuation<? super Unit> continuation) {
        Task<Void> taskCompleteUpdate = appUpdateManager.completeUpdate();
        Intrinsics.checkNotNullExpressionValue(taskCompleteUpdate, "completeUpdate()");
        Object objRunTask$default = runTask$default(taskCompleteUpdate, null, continuation, 2, null);
        return objRunTask$default == ek.a.getCOROUTINE_SUSPENDED() ? objRunTask$default : Unit.INSTANCE;
    }

    @NotNull
    public static final Flow<AppUpdateResult> requestUpdateFlow(@NotNull AppUpdateManager appUpdateManager) throws InstallException {
        Intrinsics.checkNotNullParameter(appUpdateManager, "<this>");
        return FlowKt.conflate(FlowKt.callbackFlow(new b(appUpdateManager, null)));
    }

    @Nullable
    public static final <T> Object runTask(@NotNull Task<T> task, @NotNull Function0<Unit> function0, @NotNull Continuation<? super T> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new d(function0));
        if (!task.isComplete()) {
            task.addOnSuccessListener(new e(cancellableContinuationImpl));
            task.addOnFailureListener(new f(cancellableContinuationImpl));
        } else if (task.isSuccessful()) {
            cancellableContinuationImpl.resumeWith(Result.m5535constructorimpl(task.getResult()));
        } else {
            Exception exception = task.getException();
            Intrinsics.checkNotNull(exception);
            cancellableContinuationImpl.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(exception)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ Object runTask$default(Task task, Function0 function0, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = c.f46151p0;
        }
        return runTask(task, function0, continuation);
    }

    public static final boolean startUpdateFlowForResult(@NotNull AppUpdateManager appUpdateManager, @NotNull AppUpdateInfo appUpdateInfo, @NotNull final Fragment fragment, @NotNull AppUpdateOptions options, int i10) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(appUpdateManager, "<this>");
        Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(options, "options");
        return appUpdateManager.startUpdateFlowForResult(appUpdateInfo, new IntentSenderForResultStarter() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt.g
            @Override // com.google.android.play.core.common.IntentSenderForResultStarter
            public final void startIntentSenderForResult(@NotNull IntentSender p4, int i11, @Nullable Intent intent, int i12, int i13, int i14, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
                Intrinsics.checkNotNullParameter(p4, "p0");
                fragment.startIntentSenderForResult(p4, i11, intent, i12, i13, i14, bundle);
            }
        }, options, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(@NotNull SendChannel<? super E> sendChannel, E e5) {
        Intrinsics.checkNotNullParameter(sendChannel, "<this>");
        return ChannelResult.m5973isSuccessimpl(sendChannel.mo5953trySendJP2dKIU(e5));
    }

    public static final long getBytesDownloaded(@NotNull InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        return installState.bytesDownloaded();
    }

    @InstallStatus
    public static final int getInstallStatus(@NotNull InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        return installState.installStatus();
    }

    public static final long getTotalBytesToDownload(@NotNull InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        return installState.totalBytesToDownload();
    }
}
