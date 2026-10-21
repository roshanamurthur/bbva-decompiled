package com.google.android.play.core.ktx;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.core.os.LocaleListCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import kotlinx.coroutines.flow.FlowKt__ContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\f\u001aô\u0001\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a\u001f\u0010\u0013\u001a\u00020\u0002*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u0002*\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001c\u001a\u00020\u0002*\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019\u001a%\u0010\u001d\u001a\u00020\u0002*\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0019\u001a%\u0010\u001e\u001a\u00020\u0002*\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0019\u001a7\u0010 \u001a\u00020\u0011*\u00020\u00102\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0014\u001a\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015*\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a7\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0080@ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u0010\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010+*\u00020\u0010\u001a\"\u00102\u001a\u000201*\u00020\u00102\u0006\u0010-\u001a\u00020\u00012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0011\u001a'\u00106\u001a\u000201\"\u0004\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u0000042\u0006\u00105\u001a\u00028\u0000H\u0000¢\u0006\u0004\b6\u00107\"\u0016\u0010:\u001a\u00020\u0011*\u00020\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b;\u00109\"\u0016\u0010=\u001a\u00020\u0011*\u00020\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b<\u00109\"\u0016\u0010A\u001a\u00020>*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b?\u0010@\"\u0016\u0010C\u001a\u00020>*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\bB\u0010@\"\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\bD\u0010E\"\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\bF\u0010E\"\u0016\u0010I\u001a\u000201*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\bG\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;", "", "onRequiresConfirmation", "onInstalled", "onFailed", "onPending", "onDownloaded", "onDownloading", "onInstalling", "onCanceling", "onCanceled", "onNonTerminalStatus", "onTerminalStatus", "Lcom/google/android/play/core/splitinstall/SplitInstallStateUpdatedListener;", "SplitInstallStateUpdatedListener", "Lcom/google/android/play/core/splitinstall/SplitInstallManager;", "", AuthConstants.SESSION_ID, "requestCancelInstall", "(Lcom/google/android/play/core/splitinstall/SplitInstallManager;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "moduleNames", "requestDeferredInstall", "(Lcom/google/android/play/core/splitinstall/SplitInstallManager;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/Locale;", com.huawei.hms.feature.model.b.f50443n, "requestDeferredLanguageInstall", "requestDeferredLanguageUninstall", "requestDeferredUninstall", "modules", "requestInstall", "(Lcom/google/android/play/core/splitinstall/SplitInstallManager;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestSessionState", "requestSessionStates", "(Lcom/google/android/play/core/splitinstall/SplitInstallManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/android/gms/tasks/Task;", "task", "Lkotlin/Function0;", "runTask", "(Lcom/google/android/gms/tasks/Task;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "requestProgressFlow", "sessionState", "Landroidx/fragment/app/Fragment;", "fragment", "requestCode", "", "startConfirmationDialogForResult", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/SendChannel;", "element", "tryOffer", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Z", "getErrorCode", "(Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;)I", "errorCode", "getSessionId", "getStatus", "status", "", "getBytesDownloaded", "(Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;)J", "bytesDownloaded", "getTotalBytesToDownload", "totalBytesToDownload", "getLanguages", "(Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;)Ljava/util/List;", "getModuleNames", "getHasTerminalStatus", "(Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;)Z", "hasTerminalStatus", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_feature_delivery_ktx"}, k = 2, mv = {1, 8, 0})
public final class SplitInstallManagerKtxKt {

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class a implements SplitInstallStateUpdatedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1<SplitInstallSessionState, Unit> f46166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function1<SplitInstallSessionState, Unit> f46167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function1<SplitInstallSessionState, Unit> f46168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function1<SplitInstallSessionState, Unit> f46169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function1<SplitInstallSessionState, Unit> f46170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function1<SplitInstallSessionState, Unit> f46171f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Function1<SplitInstallSessionState, Unit> f46172g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Function1<SplitInstallSessionState, Unit> f46173h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function1<SplitInstallSessionState, Unit> f46174i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Function1<SplitInstallSessionState, Unit> f46175j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Function1<SplitInstallSessionState, Unit> f46176k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super SplitInstallSessionState, Unit> function1, Function1<? super SplitInstallSessionState, Unit> function2, Function1<? super SplitInstallSessionState, Unit> function3, Function1<? super SplitInstallSessionState, Unit> function4, Function1<? super SplitInstallSessionState, Unit> function5, Function1<? super SplitInstallSessionState, Unit> function6, Function1<? super SplitInstallSessionState, Unit> function7, Function1<? super SplitInstallSessionState, Unit> function8, Function1<? super SplitInstallSessionState, Unit> function9, Function1<? super SplitInstallSessionState, Unit> function10, Function1<? super SplitInstallSessionState, Unit> function11) {
            this.f46166a = function1;
            this.f46167b = function2;
            this.f46168c = function3;
            this.f46169d = function4;
            this.f46170e = function5;
            this.f46171f = function6;
            this.f46172g = function7;
            this.f46173h = function8;
            this.f46174i = function9;
            this.f46175j = function10;
            this.f46176k = function11;
        }

        @Override // com.google.android.play.core.listener.StateUpdatedListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onStateUpdate(@NotNull SplitInstallSessionState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            switch (state.status()) {
                case 0:
                case 6:
                    this.f46166a.invoke(state);
                    break;
                case 1:
                    this.f46167b.invoke(state);
                    break;
                case 2:
                    this.f46169d.invoke(state);
                    break;
                case 3:
                    this.f46170e.invoke(state);
                    break;
                case 4:
                    this.f46171f.invoke(state);
                    break;
                case 5:
                    this.f46172g.invoke(state);
                    break;
                case 7:
                    this.f46174i.invoke(state);
                    break;
                case 8:
                    this.f46168c.invoke(state);
                    break;
                case 9:
                    this.f46173h.invoke(state);
                    break;
            }
            if (state.hasTerminalStatus()) {
                this.f46175j.invoke(state);
            } else {
                this.f46176k.invoke(state);
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class b extends Lambda implements Function1<SplitInstallSessionState, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f46177p0 = new b(1);

        public b() {
            super(1);
        }

        public final void a(@NotNull SplitInstallSessionState it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(SplitInstallSessionState splitInstallSessionState) {
            a(splitInstallSessionState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class c extends Lambda implements Function1<SplitInstallSessionState, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f46178p0 = new c(1);

        public c() {
            super(1);
        }

        public final void a(@NotNull SplitInstallSessionState it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(SplitInstallSessionState splitInstallSessionState) {
            a(splitInstallSessionState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class d extends Lambda implements Function1<SplitInstallSessionState, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f46179p0 = new d(1);

        public d() {
            super(1);
        }

        public final void a(@NotNull SplitInstallSessionState it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(SplitInstallSessionState splitInstallSessionState) {
            a(splitInstallSessionState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class e extends Lambda implements Function1<SplitInstallSessionState, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f46180p0 = new e(1);

        public e() {
            super(1);
        }

        public final void a(@NotNull SplitInstallSessionState it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(SplitInstallSessionState splitInstallSessionState) {
            a(splitInstallSessionState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class f extends Lambda implements Function1<SplitInstallSessionState, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f46181p0 = new f(1);

        public f() {
            super(1);
        }

        public final void a(@NotNull SplitInstallSessionState it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(SplitInstallSessionState splitInstallSessionState) {
            a(splitInstallSessionState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class g extends Lambda implements Function1<SplitInstallSessionState, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f46182p0 = new g(1);

        public g() {
            super(1);
        }

        public final void a(@NotNull SplitInstallSessionState it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(SplitInstallSessionState splitInstallSessionState) {
            a(splitInstallSessionState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class h extends Lambda implements Function1<SplitInstallSessionState, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f46183p0 = new h(1);

        public h() {
            super(1);
        }

        public final void a(@NotNull SplitInstallSessionState it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(SplitInstallSessionState splitInstallSessionState) {
            a(splitInstallSessionState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class i extends Lambda implements Function1<SplitInstallSessionState, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f46184p0 = new i(1);

        public i() {
            super(1);
        }

        public final void a(@NotNull SplitInstallSessionState it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(SplitInstallSessionState splitInstallSessionState) {
            a(splitInstallSessionState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class j extends Lambda implements Function1<SplitInstallSessionState, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f46185p0 = new j(1);

        public j() {
            super(1);
        }

        public final void a(@NotNull SplitInstallSessionState it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(SplitInstallSessionState splitInstallSessionState) {
            a(splitInstallSessionState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    @DebugMetadata(c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt", f = "SplitInstallManagerKtx.kt", i = {}, l = {46}, m = "requestInstall", n = {}, s = {})
    public static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f46186p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f46187q0;

        public k() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46186p0 = obj;
            this.f46187q0 |= Integer.MIN_VALUE;
            return SplitInstallManagerKtxKt.requestInstall(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    @DebugMetadata(c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1", f = "SplitInstallManagerKtx.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<ProducerScope<? super SplitInstallSessionState>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f46188p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f46189q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SplitInstallManager f46190r0;

        /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
        public static final class a<TResult> implements OnSuccessListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Set<Integer> f46191a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProducerScope<SplitInstallSessionState> f46192b;

            public a(LinkedHashSet linkedHashSet, ProducerScope producerScope) {
                this.f46191a = linkedHashSet;
                this.f46192b = producerScope;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void onSuccess(@NotNull List<? extends SplitInstallSessionState> sessionList) {
                Intrinsics.checkNotNullParameter(sessionList, "sessionList");
                ArrayList arrayList = new ArrayList();
                for (Object obj : sessionList) {
                    if (!this.f46191a.contains(Integer.valueOf(((SplitInstallSessionState) obj).sessionId()))) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SplitInstallManagerKtxKt.tryOffer(this.f46192b, (SplitInstallSessionState) it.next());
                }
            }
        }

        /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
        public static final class b implements OnFailureListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ProducerScope<SplitInstallSessionState> f46193a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(ProducerScope<? super SplitInstallSessionState> producerScope) {
                this.f46193a = producerScope;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(@NotNull Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f46193a.close(exception);
            }
        }

        /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
        public static final class c extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ SplitInstallManager f46194p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ SplitInstallStateUpdatedListener f46195q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SplitInstallManager splitInstallManager, d dVar) {
                super(0);
                this.f46194p0 = splitInstallManager;
                this.f46195q0 = dVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f46194p0.unregisterListener(this.f46195q0);
            }
        }

        /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
        public static final class d implements SplitInstallStateUpdatedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Set<Integer> f46196a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProducerScope<SplitInstallSessionState> f46197b;

            public d(LinkedHashSet linkedHashSet, ProducerScope producerScope) {
                this.f46196a = linkedHashSet;
                this.f46197b = producerScope;
            }

            @Override // com.google.android.play.core.listener.StateUpdatedListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void onStateUpdate(@NotNull SplitInstallSessionState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                this.f46196a.add(Integer.valueOf(state.sessionId()));
                SplitInstallManagerKtxKt.tryOffer(this.f46197b, state);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(SplitInstallManager splitInstallManager, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f46190r0 = splitInstallManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            l lVar = new l(this.f46190r0, continuation);
            lVar.f46189q0 = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super SplitInstallSessionState> producerScope, Continuation<? super Unit> continuation) {
            return ((l) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f46188p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.f46189q0;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                d dVar = new d(linkedHashSet, producerScope);
                SplitInstallManager splitInstallManager = this.f46190r0;
                splitInstallManager.registerListener(dVar);
                splitInstallManager.getSessionStates().addOnSuccessListener(new a(linkedHashSet, producerScope)).addOnFailureListener(new b(producerScope));
                c cVar = new c(splitInstallManager, dVar);
                this.f46188p0 = 1;
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

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    @DebugMetadata(c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt", f = "SplitInstallManagerKtx.kt", i = {}, l = {120}, m = "requestSessionState", n = {}, s = {})
    public static final class m extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f46198p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f46199q0;

        public m() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46198p0 = obj;
            this.f46199q0 |= Integer.MIN_VALUE;
            return SplitInstallManagerKtxKt.requestSessionState(null, 0, this);
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    @DebugMetadata(c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt", f = "SplitInstallManagerKtx.kt", i = {}, l = {94}, m = "requestSessionStates", n = {}, s = {})
    public static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f46200p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f46201q0;

        public n() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46200p0 = obj;
            this.f46201q0 |= Integer.MIN_VALUE;
            return SplitInstallManagerKtxKt.requestSessionStates(null, this);
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f46202p0 = new o(0);

        public o() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class p extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46203p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Function0<Unit> function0) {
            super(1);
            this.f46203p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th2) {
            this.f46203p0.invoke();
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class q<TResult> implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<T> f46204a;

        public q(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f46204a = cancellableContinuationImpl;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(T t10) {
            this.f46204a.resumeWith(Result.m5535constructorimpl(t10));
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
    public static final class r implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<T> f46205a;

        public r(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f46205a = cancellableContinuationImpl;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(@NotNull Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f46205a.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(exception)));
        }
    }

    @NotNull
    public static final SplitInstallStateUpdatedListener SplitInstallStateUpdatedListener(@NotNull Function1<? super SplitInstallSessionState, Unit> onRequiresConfirmation, @NotNull Function1<? super SplitInstallSessionState, Unit> onInstalled, @NotNull Function1<? super SplitInstallSessionState, Unit> onFailed, @NotNull Function1<? super SplitInstallSessionState, Unit> onPending, @NotNull Function1<? super SplitInstallSessionState, Unit> onDownloaded, @NotNull Function1<? super SplitInstallSessionState, Unit> onDownloading, @NotNull Function1<? super SplitInstallSessionState, Unit> onInstalling, @NotNull Function1<? super SplitInstallSessionState, Unit> onCanceling, @NotNull Function1<? super SplitInstallSessionState, Unit> onCanceled, @NotNull Function1<? super SplitInstallSessionState, Unit> onNonTerminalStatus, @NotNull Function1<? super SplitInstallSessionState, Unit> onTerminalStatus) {
        Intrinsics.checkNotNullParameter(onRequiresConfirmation, "onRequiresConfirmation");
        Intrinsics.checkNotNullParameter(onInstalled, "onInstalled");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        Intrinsics.checkNotNullParameter(onPending, "onPending");
        Intrinsics.checkNotNullParameter(onDownloaded, "onDownloaded");
        Intrinsics.checkNotNullParameter(onDownloading, "onDownloading");
        Intrinsics.checkNotNullParameter(onInstalling, "onInstalling");
        Intrinsics.checkNotNullParameter(onCanceling, "onCanceling");
        Intrinsics.checkNotNullParameter(onCanceled, "onCanceled");
        Intrinsics.checkNotNullParameter(onNonTerminalStatus, "onNonTerminalStatus");
        Intrinsics.checkNotNullParameter(onTerminalStatus, "onTerminalStatus");
        return new a(onFailed, onPending, onRequiresConfirmation, onDownloading, onDownloaded, onInstalling, onInstalled, onCanceling, onCanceled, onTerminalStatus, onNonTerminalStatus);
    }

    public static final long getBytesDownloaded(@NotNull SplitInstallSessionState splitInstallSessionState) {
        Intrinsics.checkNotNullParameter(splitInstallSessionState, "<this>");
        return splitInstallSessionState.bytesDownloaded();
    }

    @SplitInstallErrorCode
    public static final int getErrorCode(@NotNull SplitInstallSessionState splitInstallSessionState) {
        Intrinsics.checkNotNullParameter(splitInstallSessionState, "<this>");
        return splitInstallSessionState.errorCode();
    }

    public static final boolean getHasTerminalStatus(@NotNull SplitInstallSessionState splitInstallSessionState) {
        Intrinsics.checkNotNullParameter(splitInstallSessionState, "<this>");
        return splitInstallSessionState.hasTerminalStatus();
    }

    @NotNull
    public static final List<String> getLanguages(@NotNull SplitInstallSessionState splitInstallSessionState) {
        Intrinsics.checkNotNullParameter(splitInstallSessionState, "<this>");
        List<String> listLanguages = splitInstallSessionState.languages();
        Intrinsics.checkNotNullExpressionValue(listLanguages, "languages()");
        return listLanguages;
    }

    @NotNull
    public static final List<String> getModuleNames(@NotNull SplitInstallSessionState splitInstallSessionState) {
        Intrinsics.checkNotNullParameter(splitInstallSessionState, "<this>");
        List<String> listModuleNames = splitInstallSessionState.moduleNames();
        Intrinsics.checkNotNullExpressionValue(listModuleNames, "moduleNames()");
        return listModuleNames;
    }

    public static final int getSessionId(@NotNull SplitInstallSessionState splitInstallSessionState) {
        Intrinsics.checkNotNullParameter(splitInstallSessionState, "<this>");
        return splitInstallSessionState.sessionId();
    }

    @SplitInstallSessionStatus
    public static final int getStatus(@NotNull SplitInstallSessionState splitInstallSessionState) {
        Intrinsics.checkNotNullParameter(splitInstallSessionState, "<this>");
        return splitInstallSessionState.status();
    }

    public static final long getTotalBytesToDownload(@NotNull SplitInstallSessionState splitInstallSessionState) {
        Intrinsics.checkNotNullParameter(splitInstallSessionState, "<this>");
        return splitInstallSessionState.totalBytesToDownload();
    }

    @Nullable
    public static final Object requestCancelInstall(@NotNull SplitInstallManager splitInstallManager, int i10, @NotNull Continuation<? super Unit> continuation) {
        Task<Void> taskCancelInstall = splitInstallManager.cancelInstall(i10);
        Intrinsics.checkNotNullExpressionValue(taskCancelInstall, "cancelInstall(sessionId)");
        Object objRunTask$default = runTask$default(taskCancelInstall, null, continuation, 2, null);
        return objRunTask$default == ek.a.getCOROUTINE_SUSPENDED() ? objRunTask$default : Unit.INSTANCE;
    }

    @Nullable
    public static final Object requestDeferredInstall(@NotNull SplitInstallManager splitInstallManager, @NotNull List<String> list, @NotNull Continuation<? super Unit> continuation) {
        Task<Void> taskDeferredInstall = splitInstallManager.deferredInstall(list);
        Intrinsics.checkNotNullExpressionValue(taskDeferredInstall, "deferredInstall(moduleNames)");
        Object objRunTask$default = runTask$default(taskDeferredInstall, null, continuation, 2, null);
        return objRunTask$default == ek.a.getCOROUTINE_SUSPENDED() ? objRunTask$default : Unit.INSTANCE;
    }

    @Nullable
    public static final Object requestDeferredLanguageInstall(@NotNull SplitInstallManager splitInstallManager, @NotNull List<Locale> list, @NotNull Continuation<? super Unit> continuation) {
        Task<Void> taskDeferredLanguageInstall = splitInstallManager.deferredLanguageInstall(list);
        Intrinsics.checkNotNullExpressionValue(taskDeferredLanguageInstall, "deferredLanguageInstall(languages)");
        Object objRunTask$default = runTask$default(taskDeferredLanguageInstall, null, continuation, 2, null);
        return objRunTask$default == ek.a.getCOROUTINE_SUSPENDED() ? objRunTask$default : Unit.INSTANCE;
    }

    @Nullable
    public static final Object requestDeferredLanguageUninstall(@NotNull SplitInstallManager splitInstallManager, @NotNull List<Locale> list, @NotNull Continuation<? super Unit> continuation) {
        Task<Void> taskDeferredLanguageUninstall = splitInstallManager.deferredLanguageUninstall(list);
        Intrinsics.checkNotNullExpressionValue(taskDeferredLanguageUninstall, "deferredLanguageUninstall(languages)");
        Object objRunTask$default = runTask$default(taskDeferredLanguageUninstall, null, continuation, 2, null);
        return objRunTask$default == ek.a.getCOROUTINE_SUSPENDED() ? objRunTask$default : Unit.INSTANCE;
    }

    @Nullable
    public static final Object requestDeferredUninstall(@NotNull SplitInstallManager splitInstallManager, @NotNull List<String> list, @NotNull Continuation<? super Unit> continuation) {
        Task<Void> taskDeferredInstall = splitInstallManager.deferredInstall(list);
        Intrinsics.checkNotNullExpressionValue(taskDeferredInstall, "deferredInstall(moduleNames)");
        Object objRunTask$default = runTask$default(taskDeferredInstall, null, continuation, 2, null);
        return objRunTask$default == ek.a.getCOROUTINE_SUSPENDED() ? objRunTask$default : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object requestInstall(@NotNull SplitInstallManager splitInstallManager, @NotNull List<String> list, @NotNull List<String> list2, @NotNull Continuation<? super Integer> continuation) {
        k kVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i10 = kVar.f46187q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f46187q0 = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objRunTask$default = kVar.f46186p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = kVar.f46187q0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objRunTask$default);
            SplitInstallRequest.Builder builderNewBuilder = SplitInstallRequest.newBuilder();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                builderNewBuilder.addModule((String) it.next());
            }
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                builderNewBuilder.addLanguage(LocaleListCompat.forLanguageTags((String) it2.next()).get(0));
            }
            SplitInstallRequest splitInstallRequestBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(splitInstallRequestBuild, "newBuilder()\n    .apply …(0)) }\n    }\n    .build()");
            Task<Integer> taskStartInstall = splitInstallManager.startInstall(splitInstallRequestBuild);
            Intrinsics.checkNotNullExpressionValue(taskStartInstall, "startInstall(buildSplitI…uest(modules, languages))");
            kVar.f46187q0 = 1;
            objRunTask$default = runTask$default(taskStartInstall, null, kVar, 2, null);
            if (objRunTask$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRunTask$default);
        }
        Intrinsics.checkNotNullExpressionValue(objRunTask$default, "runTask(startInstall(bui…est(modules, languages)))");
        return objRunTask$default;
    }

    public static /* synthetic */ Object requestInstall$default(SplitInstallManager splitInstallManager, List list, List list2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        if ((i10 & 2) != 0) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        return requestInstall(splitInstallManager, list, list2, continuation);
    }

    @NotNull
    public static final Flow<SplitInstallSessionState> requestProgressFlow(@NotNull SplitInstallManager splitInstallManager) {
        Intrinsics.checkNotNullParameter(splitInstallManager, "<this>");
        return FlowKt__ContextKt.buffer$default(FlowKt.callbackFlow(new l(splitInstallManager, null)), Integer.MAX_VALUE, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object requestSessionState(@NotNull SplitInstallManager splitInstallManager, int i10, @NotNull Continuation<? super SplitInstallSessionState> continuation) {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i11 = mVar.f46199q0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f46199q0 = i11 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objRunTask$default = mVar.f46198p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i12 = mVar.f46199q0;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objRunTask$default);
            Task<SplitInstallSessionState> sessionState = splitInstallManager.getSessionState(i10);
            Intrinsics.checkNotNullExpressionValue(sessionState, "getSessionState(sessionId)");
            mVar.f46199q0 = 1;
            objRunTask$default = runTask$default(sessionState, null, mVar, 2, null);
            if (objRunTask$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRunTask$default);
        }
        Intrinsics.checkNotNullExpressionValue(objRunTask$default, "runTask(getSessionState(sessionId))");
        return objRunTask$default;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object requestSessionStates(@NotNull SplitInstallManager splitInstallManager, @NotNull Continuation<? super List<? extends SplitInstallSessionState>> continuation) {
        n nVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i10 = nVar.f46201q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f46201q0 = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        } else {
            nVar = new n(continuation);
        }
        Object objRunTask$default = nVar.f46200p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = nVar.f46201q0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objRunTask$default);
            Task<List<SplitInstallSessionState>> sessionStates = splitInstallManager.getSessionStates();
            Intrinsics.checkNotNullExpressionValue(sessionStates, "sessionStates");
            nVar.f46201q0 = 1;
            objRunTask$default = runTask$default(sessionStates, null, nVar, 2, null);
            if (objRunTask$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRunTask$default);
        }
        Intrinsics.checkNotNullExpressionValue(objRunTask$default, "runTask(sessionStates)");
        return objRunTask$default;
    }

    @Nullable
    public static final <T> Object runTask(@NotNull Task<T> task, @NotNull Function0<Unit> function0, @NotNull Continuation<? super T> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new p(function0));
        if (!task.isComplete()) {
            task.addOnSuccessListener(new q(cancellableContinuationImpl));
            task.addOnFailureListener(new r(cancellableContinuationImpl));
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
            function0 = o.f46202p0;
        }
        return runTask(task, function0, continuation);
    }

    public static final boolean startConfirmationDialogForResult(@NotNull SplitInstallManager splitInstallManager, @NotNull SplitInstallSessionState sessionState, @NotNull final Fragment fragment, int i10) {
        Intrinsics.checkNotNullParameter(splitInstallManager, "<this>");
        Intrinsics.checkNotNullParameter(sessionState, "sessionState");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return splitInstallManager.startConfirmationDialogForResult(sessionState, new IntentSenderForResultStarter() { // from class: com.google.android.play.core.ktx.SplitInstallManagerKtxKt.s
            @Override // com.google.android.play.core.common.IntentSenderForResultStarter
            public final void startIntentSenderForResult(@NotNull IntentSender p4, int i11, @Nullable Intent intent, int i12, int i13, int i14, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
                Intrinsics.checkNotNullParameter(p4, "p0");
                fragment.startIntentSenderForResult(p4, i11, intent, i12, i13, i14, bundle);
            }
        }, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(@NotNull SendChannel<? super E> sendChannel, E e5) {
        Intrinsics.checkNotNullParameter(sendChannel, "<this>");
        return ChannelResult.m5973isSuccessimpl(sendChannel.mo5953trySendJP2dKIU(e5));
    }
}
