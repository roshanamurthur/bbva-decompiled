package com.bbva.discreetmode.combined;

import androidx.lifecycle.LifecycleOwner;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.discreetmode.BaseDiscreetModeController;
import com.bbva.discreetmode.DiscreetMode;
import com.bbva.discreetmode.SensorTypeConstants;
import com.bbva.discreetmode.camera.DiscreetModeCamera;
import com.bbva.discreetmode.proximity.DiscreetModeProximitySensor;
import com.bbva.plugin.media.capture.util.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ek.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o6.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CombinedController.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bbva/discreetmode/combined/CombinedController;", "Lcom/bbva/discreetmode/BaseDiscreetModeController;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/bbva/discreetmode/DiscreetMode$State;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "Lcom/bbva/discreetmode/DiscreetMode$Type;", "w0", "Lcom/bbva/discreetmode/DiscreetMode$Type;", "getType", "()Lcom/bbva/discreetmode/DiscreetMode$Type;", "type", "Lcom/bbva/discreetmode/camera/DiscreetModeCamera;", Constants.CAMERA_SRC, "Lcom/bbva/discreetmode/proximity/DiscreetModeProximitySensor;", SensorTypeConstants.proximity, "", "notificationDelay", "<init>", "(Lcom/bbva/discreetmode/camera/DiscreetModeCamera;Lcom/bbva/discreetmode/proximity/DiscreetModeProximitySensor;J)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class CombinedController extends BaseDiscreetModeController {

    @NotNull
    public DiscreetMode.State E0;

    @NotNull
    public DiscreetMode.State F0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final DiscreetModeCamera f29077t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final DiscreetModeProximitySensor f29078u0;
    public final long v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DiscreetMode.Type type;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public LifecycleOwner f29080x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f29081y0;

    public /* synthetic */ CombinedController(DiscreetModeCamera discreetModeCamera, DiscreetModeProximitySensor discreetModeProximitySensor, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(discreetModeCamera, discreetModeProximitySensor, (i10 & 4) != 0 ? 100L : j10);
    }

    public static final void access$handleCameraSensorState(CombinedController combinedController) {
        if (combinedController.E0 instanceof DiscreetMode.State.Inactive) {
            combinedController.notifyState(combinedController.F0, combinedController.v0);
        }
    }

    public static final void access$handleProximitySensorState(CombinedController combinedController) {
        DiscreetMode.State state = combinedController.E0;
        boolean z10 = state instanceof DiscreetMode.State.Active;
        long j10 = combinedController.v0;
        DiscreetModeCamera discreetModeCamera = combinedController.f29077t0;
        if (z10) {
            discreetModeCamera.stopAnalyzing();
            combinedController.notifyState(new DiscreetMode.State.Active(SensorTypeConstants.proximity), j10);
        } else if (state instanceof DiscreetMode.State.Inactive) {
            LifecycleOwner lifecycleOwner = combinedController.f29080x0;
            if (lifecycleOwner != null) {
                discreetModeCamera.startAnalyzing(lifecycleOwner);
            }
            combinedController.notifyState(combinedController.F0, j10);
        }
    }

    public static final Object access$processCameraSensorResponses(final CombinedController combinedController, Channel channel, Continuation continuation) {
        combinedController.getClass();
        Object objCollect = FlowKt.distinctUntilChanged(FlowKt.receiveAsFlow(channel)).collect(new FlowCollector<Integer>() { // from class: com.bbva.discreetmode.combined.CombinedController$processCameraSensorResponses$$inlined$collect$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public Object emit(Integer num, @NotNull Continuation<? super Unit> continuation2) {
                int iIntValue = num.intValue();
                CombinedController combinedController2 = this.f29082p0;
                CombinedController.access$updateCameraSensorState(combinedController2, iIntValue);
                CombinedController.access$handleCameraSensorState(combinedController2);
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public static final Object access$processProximitySensorResponses(final CombinedController combinedController, Channel channel, Continuation continuation) {
        combinedController.getClass();
        Object objCollect = FlowKt.distinctUntilChanged(FlowKt.receiveAsFlow(channel)).collect(new FlowCollector<Boolean>() { // from class: com.bbva.discreetmode.combined.CombinedController$processProximitySensorResponses$$inlined$collect$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public Object emit(Boolean bool, @NotNull Continuation<? super Unit> continuation2) {
                if (bool.booleanValue()) {
                    CombinedController combinedController2 = this.f29083p0;
                    CombinedController.access$updateProximitySensorState(combinedController2);
                    CombinedController.access$handleProximitySensorState(combinedController2);
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public static final void access$updateCameraSensorState(CombinedController combinedController, int i10) {
        DiscreetMode.State inactive;
        boolean z10 = i10 > combinedController.f29081y0;
        if (z10) {
            inactive = new DiscreetMode.State.Active("face");
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            inactive = new DiscreetMode.State.Inactive("face");
        }
        combinedController.F0 = inactive;
    }

    public static final void access$updateProximitySensorState(CombinedController combinedController) {
        DiscreetMode.State inactive;
        DiscreetMode.State state = combinedController.E0;
        if (state instanceof DiscreetMode.State.Inactive) {
            inactive = new DiscreetMode.State.Active(SensorTypeConstants.proximity);
        } else {
            if (!(state instanceof DiscreetMode.State.Active)) {
                throw new NoWhenBranchMatchedException();
            }
            inactive = new DiscreetMode.State.Inactive(SensorTypeConstants.proximity);
        }
        combinedController.E0 = inactive;
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
        this.f29080x0 = lifecycleOwner;
        this.f29077t0.startAnalyzing(lifecycleOwner);
        this.f29078u0.startAnalyzing();
    }

    @Override // com.bbva.discreetmode.BaseDiscreetModeController, com.bbva.discreetmode.DiscreetModeController
    public void stop() {
        super.stop();
        this.f29077t0.stopAnalyzing();
        this.f29078u0.stopAnalyzing();
        this.f29080x0 = null;
    }

    public CombinedController(@NotNull DiscreetModeCamera camera, @NotNull DiscreetModeProximitySensor proximitySensor, long j10) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(proximitySensor, "proximitySensor");
        this.f29077t0 = camera;
        this.f29078u0 = proximitySensor;
        this.v0 = j10;
        this.type = DiscreetMode.Type.BOTH;
        this.f29081y0 = 1;
        this.E0 = new DiscreetMode.State.Inactive(SensorTypeConstants.proximity);
        this.F0 = new DiscreetMode.State.Inactive("face");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new o6.a(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(this, null), 3, null);
    }
}
