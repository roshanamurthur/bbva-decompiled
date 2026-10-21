package com.bbva.glomohybrid.featureflags.domain.observer;

import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlagsObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/domain/observer/FeatureFlagsObserver;", "", "onReceive", "", "featureFlags", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "(Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FeatureFlagsObserver {
    @Nullable
    Object onReceive(@Nullable FeatureFlags featureFlags, @NotNull Continuation<? super Unit> continuation);
}
