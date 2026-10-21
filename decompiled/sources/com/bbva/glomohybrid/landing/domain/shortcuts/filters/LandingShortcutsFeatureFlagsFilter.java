package com.bbva.glomohybrid.landing.domain.shortcuts.filters;

import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.domain.model.StorePolicy;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingShortcutsFeatureFlagsFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/shortcuts/filters/LandingShortcutsFeatureFlagsFilter;", "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingShortcutItemModel;", "shortcut", "", "isFeatureEnable", "Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;", "featureFlagsRepository", "<init>", "(Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingShortcutsFeatureFlagsFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FeatureFlagsRepository f32789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f32790b;

    /* JADX INFO: compiled from: LandingShortcutsFeatureFlagsFilter.kt */
    public static final class a extends Lambda implements Function0<Map<String, ? extends Boolean>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends Boolean> invoke() {
            FeatureFlags featureFlags = LandingShortcutsFeatureFlagsFilter.this.f32789a.get(StorePolicy.Local);
            if (featureFlags != null) {
                return featureFlags.getLanding();
            }
            return null;
        }
    }

    public LandingShortcutsFeatureFlagsFilter(@NotNull FeatureFlagsRepository featureFlagsRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "featureFlagsRepository");
        this.f32789a = featureFlagsRepository;
        this.f32790b = LazyKt__LazyJVMKt.lazy(new a());
    }

    public final boolean isFeatureEnable(@NotNull LandingShortcutItemModel shortcut) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(shortcut, "shortcut");
        String navigationType = shortcut.getNavigationType();
        if (Intrinsics.areEqual(navigationType, LandingAEMModel.Navigation.ACTION.getValue()) || Intrinsics.areEqual(navigationType, LandingAEMModel.Navigation.SYSTEM.getValue())) {
            return true;
        }
        Map map = (Map) this.f32790b.getValue();
        if (map == null || (bool = (Boolean) map.get(shortcut.getRoute())) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
