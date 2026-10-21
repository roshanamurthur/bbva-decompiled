package com.bbva.discreetmode.camera;

import androidx.lifecycle.LifecycleOwner;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.discreetmode.BaseDiscreetModeController;
import com.bbva.discreetmode.DiscreetMode;
import com.bbva.discreetmode.extensions.NumberExtensionsKt;
import com.bbva.plugin.media.capture.util.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ek.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DiscreetModeCameraController.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/bbva/discreetmode/camera/DiscreetModeCameraController;", "Lcom/bbva/discreetmode/BaseDiscreetModeController;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/bbva/discreetmode/DiscreetMode$State;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "Lcom/bbva/discreetmode/DiscreetMode$Type;", "w0", "Lcom/bbva/discreetmode/DiscreetMode$Type;", "getType", "()Lcom/bbva/discreetmode/DiscreetMode$Type;", "type", "Lcom/bbva/discreetmode/camera/DiscreetModeCamera;", Constants.CAMERA_SRC, "", "notificationDelay", "<init>", "(Lcom/bbva/discreetmode/camera/DiscreetModeCamera;J)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class DiscreetModeCameraController extends BaseDiscreetModeController {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final DiscreetModeCamera f29052t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final long f29053u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DiscreetMode.Type type;

    public /* synthetic */ DiscreetModeCameraController(DiscreetModeCamera discreetModeCamera, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(discreetModeCamera, (i10 & 2) != 0 ? 0L : j10);
    }

    public static final Object access$processFacesCount(final DiscreetModeCameraController discreetModeCameraController, Channel channel, Continuation continuation) {
        discreetModeCameraController.getClass();
        final Flow flowReceiveAsFlow = FlowKt.receiveAsFlow(channel);
        Object objCollect = FlowKt.distinctUntilChanged(new Flow<DiscreetMode.State>() { // from class: com.bbva.discreetmode.camera.DiscreetModeCameraController$processFacesCount$$inlined$map$1

            /* JADX INFO: renamed from: com.bbva.discreetmode.camera.DiscreetModeCameraController$processFacesCount$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$lambda-1$$inlined$collect$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class AnonymousClass2 implements FlowCollector<Integer> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f29058p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ DiscreetModeCameraController f29059q0;

                /* JADX INFO: renamed from: com.bbva.discreetmode.camera.DiscreetModeCameraController$processFacesCount$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                @DebugMetadata(c = "com.bbva.discreetmode.camera.DiscreetModeCameraController$processFacesCount$$inlined$map$1$2", f = "DiscreetModeCameraController.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public /* synthetic */ Object f29060p0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public int f29061q0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f29060p0 = obj;
                        this.f29061q0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, DiscreetModeCameraController discreetModeCameraController) {
                    this.f29058p0 = flowCollector;
                    this.f29059q0 = discreetModeCameraController;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Integer num, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i10 = anonymousClass1.f29061q0;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f29061q0 = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.f29060p0;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i11 = anonymousClass1.f29061q0;
                    if (i11 == 0) {
                        ResultKt.throwOnFailure(obj);
                        DiscreetMode.State stateAccess$transformFacesCountToState = DiscreetModeCameraController.access$transformFacesCountToState(this.f29059q0, num.intValue());
                        anonymousClass1.f29061q0 = 1;
                        if (this.f29058p0.emit(stateAccess$transformFacesCountToState, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super DiscreetMode.State> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect2 = flowReceiveAsFlow.collect(new AnonymousClass2(flowCollector, discreetModeCameraController), continuation2);
                return objCollect2 == a.getCOROUTINE_SUSPENDED() ? objCollect2 : Unit.INSTANCE;
            }
        }).collect(new FlowCollector<DiscreetMode.State>() { // from class: com.bbva.discreetmode.camera.DiscreetModeCameraController$processFacesCount$$inlined$collect$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public Object emit(DiscreetMode.State state, @NotNull Continuation<? super Unit> continuation2) {
                DiscreetModeCameraController discreetModeCameraController2 = this.f29055p0;
                discreetModeCameraController2.notifyState(state, NumberExtensionsKt.toMilliSeconds(discreetModeCameraController2.f29053u0));
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public static final DiscreetMode.State access$transformFacesCountToState(DiscreetModeCameraController discreetModeCameraController, int i10) {
        boolean z10 = i10 > discreetModeCameraController.v0;
        if (z10) {
            return new DiscreetMode.State.Active("face");
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        return new DiscreetMode.State.Inactive("face");
    }

    @Override // com.bbva.discreetmode.DiscreetModeController
    @NotNull
    public DiscreetMode.Type getType() {
        return this.type;
    }

    @Override // com.bbva.discreetmode.BaseDiscreetModeController, com.bbva.discreetmode.DiscreetModeController
    public void start(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super DiscreetMode.State, Unit> listener) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.start(lifecycleOwner, listener);
        this.f29052t0.startAnalyzing(lifecycleOwner);
    }

    @Override // com.bbva.discreetmode.BaseDiscreetModeController, com.bbva.discreetmode.DiscreetModeController
    public void stop() {
        super.stop();
        this.f29052t0.stopAnalyzing();
    }

    public DiscreetModeCameraController(@NotNull DiscreetModeCamera camera, long j10) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        this.f29052t0 = camera;
        this.f29053u0 = j10;
        this.v0 = 1;
        this.type = DiscreetMode.Type.CAMERA;
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new m6.a(this, null), 3, null);
    }
}
