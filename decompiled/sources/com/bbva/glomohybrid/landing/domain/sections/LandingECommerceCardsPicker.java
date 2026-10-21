package com.bbva.glomohybrid.landing.domain.sections;

import com.bbva.glomohybrid.landing.data.datasource.LandingSettingsDataSource;
import com.bbva.glomohybrid.landing.data.repository.DeviceInfoRepository;
import com.bbva.glomohybrid.landing.domain.sections.filters.LandingEcommerceSectionFeatureFlagFilter;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardsModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceSettingsModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingECommerceCardsPicker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/LandingECommerceCardsPicker;", "", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardsModel;", "digitalCards", "pickIfIsAvailable", "Lcom/bbva/glomohybrid/landing/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/bbva/glomohybrid/landing/data/datasource/LandingSettingsDataSource;", "settingsDataSource", "Lcom/bbva/glomohybrid/landing/domain/sections/filters/LandingEcommerceSectionFeatureFlagFilter;", "featureFlagFilter", "<init>", "(Lcom/bbva/glomohybrid/landing/data/repository/DeviceInfoRepository;Lcom/bbva/glomohybrid/landing/data/datasource/LandingSettingsDataSource;Lcom/bbva/glomohybrid/landing/domain/sections/filters/LandingEcommerceSectionFeatureFlagFilter;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingECommerceCardsPicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingECommerceCardsPicker.kt\ncom/bbva/glomohybrid/landing/domain/sections/LandingECommerceCardsPicker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class LandingECommerceCardsPicker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeviceInfoRepository f32707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LandingSettingsDataSource f32708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LandingEcommerceSectionFeatureFlagFilter f32709c;

    public LandingECommerceCardsPicker(@NotNull DeviceInfoRepository deviceInfoRepository, @NotNull LandingSettingsDataSource settingsDataSource, @NotNull LandingEcommerceSectionFeatureFlagFilter featureFlagFilter) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(settingsDataSource, "settingsDataSource");
        Intrinsics.checkNotNullParameter(featureFlagFilter, "featureFlagFilter");
        this.f32707a = deviceInfoRepository;
        this.f32708b = settingsDataSource;
        this.f32709c = featureFlagFilter;
    }

    @Nullable
    public final LandingECommerceCardsModel pickIfIsAvailable(@Nullable LandingECommerceCardsModel digitalCards) {
        LandingECommerceSettingsModel eCommerce = this.f32708b.get().getECommerce();
        boolean isDeviceSecure$default = DeviceInfoRepository.getIsDeviceSecure$default(this.f32707a, false, 1, null);
        if (digitalCards != null && (!digitalCards.getItems().isEmpty())) {
            Boolean boolIsActive = eCommerce.isActive();
            if (boolIsActive == null) {
                boolIsActive = null;
            }
            if ((boolIsActive != null ? boolIsActive.booleanValue() : eCommerce.isActiveByDefault()) && isDeviceSecure$default && this.f32709c.isEnabled()) {
                return digitalCards;
            }
        }
        return null;
    }
}
