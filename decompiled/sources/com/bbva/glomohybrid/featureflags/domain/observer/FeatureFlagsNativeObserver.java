package com.bbva.glomohybrid.featureflags.domain.observer;

import bk.q;
import com.bbva.cells.component.kit.featureflag.FlagState;
import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlagsNativeObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/domain/observer/FeatureFlagsNativeObserver;", "Lcom/bbva/glomohybrid/featureflags/domain/observer/FeatureFlagsObserver;", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "featureFlags", "", "onReceive", "(Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "version", "Lcom/bbva/cellscore/featureflag/FeatureFlagManager;", "featureFlagManager", "<init>", "(Ljava/lang/String;Lcom/bbva/cellscore/featureflag/FeatureFlagManager;)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFeatureFlagsNativeObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlagsNativeObserver.kt\ncom/bbva/glomohybrid/featureflags/domain/observer/FeatureFlagsNativeObserver\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n125#2:29\n152#2,3:30\n1#3:33\n*S KotlinDebug\n*F\n+ 1 FeatureFlagsNativeObserver.kt\ncom/bbva/glomohybrid/featureflags/domain/observer/FeatureFlagsNativeObserver\n*L\n16#1:29\n16#1:30,3\n*E\n"})
public final class FeatureFlagsNativeObserver implements FeatureFlagsObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f32135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FeatureFlagManager f32136b;

    public FeatureFlagsNativeObserver(@NotNull String version, @NotNull FeatureFlagManager featureFlagManager) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        this.f32135a = version;
        this.f32136b = featureFlagManager;
    }

    @Override // com.bbva.glomohybrid.featureflags.domain.observer.FeatureFlagsObserver
    @Nullable
    public Object onReceive(@Nullable FeatureFlags featureFlags, @NotNull Continuation<? super Unit> continuation) {
        if (featureFlags != null) {
            Map<String, List<String>> disabledFeatureFlags = featureFlags.getDisabledFeatureFlags();
            if (disabledFeatureFlags == null) {
                return Unit.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(disabledFeatureFlags.size());
            for (Map.Entry<String, List<String>> entry : disabledFeatureFlags.entrySet()) {
                String key = entry.getKey();
                FlagState flagState = FlagState.Hide;
                List<String> value = entry.getValue();
                if (value == null || !value.contains(this.f32135a)) {
                    flagState = null;
                }
                if (flagState == null) {
                    flagState = FlagState.Enable;
                }
                arrayList.add(new Pair(key, flagState));
            }
            this.f32136b.setFlags(q.toMap(arrayList));
        }
        return Unit.INSTANCE;
    }
}
