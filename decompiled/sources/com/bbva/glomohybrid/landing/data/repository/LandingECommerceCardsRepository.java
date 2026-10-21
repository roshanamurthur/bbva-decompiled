package com.bbva.glomohybrid.landing.data.repository;

import com.bbva.component.dm.settings.domain.model.LandingSectionConfiguration;
import com.bbva.glomohybrid.landing.data.datasource.LandingEcommerceCardsDataSource;
import com.bbva.glomohybrid.landing.data.datasource.LandingSettingsDataSource;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardsModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingECommerceCardsRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/repository/LandingECommerceCardsRepository;", "", "Lcom/bbva/component/dm/settings/domain/model/LandingSectionConfiguration;", "sectionConfiguration", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardsModel;", "get", "Lcom/bbva/glomohybrid/landing/data/datasource/LandingEcommerceCardsDataSource;", "eCommerceCardsDataSource", "Lcom/bbva/glomohybrid/landing/data/datasource/LandingSettingsDataSource;", "landingSettingsDataSource", "<init>", "(Lcom/bbva/glomohybrid/landing/data/datasource/LandingEcommerceCardsDataSource;Lcom/bbva/glomohybrid/landing/data/datasource/LandingSettingsDataSource;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingECommerceCardsRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LandingEcommerceCardsDataSource f32542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LandingSettingsDataSource f32543b;

    public LandingECommerceCardsRepository(@NotNull LandingEcommerceCardsDataSource eCommerceCardsDataSource, @NotNull LandingSettingsDataSource landingSettingsDataSource) {
        Intrinsics.checkNotNullParameter(eCommerceCardsDataSource, "eCommerceCardsDataSource");
        Intrinsics.checkNotNullParameter(landingSettingsDataSource, "landingSettingsDataSource");
        this.f32542a = eCommerceCardsDataSource;
        this.f32543b = landingSettingsDataSource;
    }

    @Nullable
    public final LandingECommerceCardsModel get(@Nullable LandingSectionConfiguration sectionConfiguration) {
        if (sectionConfiguration == null) {
            return null;
        }
        this.f32543b.updateECommerce(sectionConfiguration.isVisibleByDefault());
        return new LandingECommerceCardsModel(this.f32542a.get(), sectionConfiguration.getPriority());
    }
}
