package com.bbva.glomohybrid.landing.domain.sections.filters;

import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.domain.model.StorePolicy;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardButtonModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingSectionsFeatureFlagsFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsFeatureFlagsFilter;", "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", "section", "", "areFeaturesEnabled", "Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;", "featureFlagsRepository", "<init>", "(Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingSectionsFeatureFlagsFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingSectionsFeatureFlagsFilter.kt\ncom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsFeatureFlagsFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1726#2,3:42\n*S KotlinDebug\n*F\n+ 1 LandingSectionsFeatureFlagsFilter.kt\ncom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsFeatureFlagsFilter\n*L\n23#1:42,3\n*E\n"})
public final class LandingSectionsFeatureFlagsFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FeatureFlagsRepository f32742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f32743b;

    /* JADX INFO: compiled from: LandingSectionsFeatureFlagsFilter.kt */
    public static final class a extends Lambda implements Function0<Map<String, ? extends Boolean>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends Boolean> invoke() {
            FeatureFlags featureFlags = LandingSectionsFeatureFlagsFilter.this.f32742a.get(StorePolicy.Local);
            if (featureFlags != null) {
                return featureFlags.getLanding();
            }
            return null;
        }
    }

    public LandingSectionsFeatureFlagsFilter(@NotNull FeatureFlagsRepository featureFlagsRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "featureFlagsRepository");
        this.f32742a = featureFlagsRepository;
        this.f32743b = LazyKt__LazyJVMKt.lazy(new a());
    }

    public final boolean a(LandingMessageCardButtonModel landingMessageCardButtonModel) {
        Boolean bool;
        String navigationType = landingMessageCardButtonModel.getNavigationType();
        if (Intrinsics.areEqual(navigationType, LandingAEMModel.Navigation.ACTION.getValue()) || Intrinsics.areEqual(navigationType, LandingAEMModel.Navigation.SYSTEM.getValue())) {
            return true;
        }
        Map map = (Map) this.f32743b.getValue();
        if (map == null || (bool = (Boolean) map.get(landingMessageCardButtonModel.getAction())) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean areFeaturesEnabled(@NotNull LandingMessageCardModel section) {
        Intrinsics.checkNotNullParameter(section, "section");
        LandingMessageCardButtonModel link = section.getLink();
        if (link == null || a(link)) {
            List<LandingMessageCardButtonModel> buttons = section.getButtons();
            if (buttons != null) {
                List<LandingMessageCardButtonModel> list = buttons;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (!a((LandingMessageCardButtonModel) it.next())) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
