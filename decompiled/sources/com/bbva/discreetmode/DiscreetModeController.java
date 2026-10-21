package com.bbva.discreetmode;

import androidx.lifecycle.LifecycleOwner;
import com.adobe.marketing.mobile.EventDataKeys;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DiscreetModeController.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&J$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0012H&J\b\u0010\u0013\u001a\u00020\rH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/bbva/discreetmode/DiscreetModeController;", "", "currentState", "Lcom/bbva/discreetmode/DiscreetMode$State;", "getCurrentState", "()Lcom/bbva/discreetmode/DiscreetMode$State;", "setCurrentState", "(Lcom/bbva/discreetmode/DiscreetMode$State;)V", "type", "Lcom/bbva/discreetmode/DiscreetMode$Type;", "getType", "()Lcom/bbva/discreetmode/DiscreetMode$Type;", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "", EventDataKeys.Lifecycle.LIFECYCLE_START, "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "stop", "discreetmode_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface DiscreetModeController {
    void cancel();

    @NotNull
    DiscreetMode.State getCurrentState();

    @NotNull
    DiscreetMode.Type getType();

    void setCurrentState(@NotNull DiscreetMode.State state);

    void start(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super DiscreetMode.State, Unit> listener);

    void stop();
}
