package com.bbva.discreetmode.proximity;

import androidx.lifecycle.LifecycleOwner;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.discreetmode.BaseDiscreetModeController;
import com.bbva.discreetmode.DiscreetMode;
import com.bbva.discreetmode.SensorTypeConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p6.a;

/* JADX INFO: compiled from: DiscreetModeProximityController.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/bbva/discreetmode/proximity/DiscreetModeProximityController;", "Lcom/bbva/discreetmode/BaseDiscreetModeController;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/bbva/discreetmode/DiscreetMode$State;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "Lcom/bbva/discreetmode/DiscreetMode$Type;", "u0", "Lcom/bbva/discreetmode/DiscreetMode$Type;", "getType", "()Lcom/bbva/discreetmode/DiscreetMode$Type;", "type", "Lcom/bbva/discreetmode/proximity/DiscreetModeProximitySensor;", SensorTypeConstants.proximity, "<init>", "(Lcom/bbva/discreetmode/proximity/DiscreetModeProximitySensor;)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class DiscreetModeProximityController extends BaseDiscreetModeController {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final DiscreetModeProximitySensor f29090t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DiscreetMode.Type type;

    public DiscreetModeProximityController(@NotNull DiscreetModeProximitySensor proximitySensor) {
        Intrinsics.checkNotNullParameter(proximitySensor, "proximitySensor");
        this.f29090t0 = proximitySensor;
        this.type = DiscreetMode.Type.PROXIMITY;
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(this, null), 3, null);
    }

    public static final Object access$processSensorActivity(final DiscreetModeProximityController discreetModeProximityController, Channel channel, Continuation continuation) {
        discreetModeProximityController.getClass();
        Object objCollect = FlowKt.distinctUntilChanged(FlowKt.receiveAsFlow(channel)).collect(new FlowCollector<Boolean>() { // from class: com.bbva.discreetmode.proximity.DiscreetModeProximityController$processSensorActivity$$inlined$collect$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public Object emit(Boolean bool, @NotNull Continuation<? super Unit> continuation2) {
                if (bool.booleanValue()) {
                    DiscreetModeProximityController.access$updateState(this.f29092p0);
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public static final void access$updateState(DiscreetModeProximityController discreetModeProximityController) {
        DiscreetMode.State inactive;
        DiscreetMode.State currentState = discreetModeProximityController.getCurrentState();
        if (currentState instanceof DiscreetMode.State.Inactive) {
            inactive = new DiscreetMode.State.Active(SensorTypeConstants.proximity);
        } else {
            if (!(currentState instanceof DiscreetMode.State.Active)) {
                throw new NoWhenBranchMatchedException();
            }
            inactive = new DiscreetMode.State.Inactive(SensorTypeConstants.proximity);
        }
        BaseDiscreetModeController.notifyState$default(discreetModeProximityController, inactive, 0L, 2, null);
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
        this.f29090t0.startAnalyzing();
    }

    @Override // com.bbva.discreetmode.BaseDiscreetModeController, com.bbva.discreetmode.DiscreetModeController
    public void stop() {
        super.stop();
        this.f29090t0.stopAnalyzing();
    }
}
