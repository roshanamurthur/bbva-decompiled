package com.bbva.glomohybrid.landing.domain.aem.filters;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.landing.data.datasource.LandingSettingsDataSource;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceSettingsModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingECommerceConditionFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/filters/LandingECommerceEnabledConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/filters/BaseLandingConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "aemItemModel", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "user", "", "meetCondition", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;Lcom/bbva/glomo/user/domain/model/RememberedUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/glomohybrid/landing/data/datasource/LandingSettingsDataSource;", "dataSource", "<init>", "(Lcom/bbva/glomohybrid/landing/data/datasource/LandingSettingsDataSource;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingECommerceConditionFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingECommerceConditionFilter.kt\ncom/bbva/glomohybrid/landing/domain/aem/filters/LandingECommerceEnabledConditionFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
public final class LandingECommerceEnabledConditionFilter extends BaseLandingConditionFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LandingSettingsDataSource f32556a;

    public LandingECommerceEnabledConditionFilter(@NotNull LandingSettingsDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f32556a = dataSource;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @NotNull
    public String getId() {
        return "isEcommerceEnabled";
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @Nullable
    public Object meetCondition(@NotNull LandingAEMModel landingAEMModel, @Nullable RememberedUser rememberedUser, @NotNull Continuation<? super Boolean> continuation) {
        LandingECommerceSettingsModel eCommerce = this.f32556a.get().getECommerce();
        boolean z10 = true;
        if (checkConditions(landingAEMModel) != null) {
            Boolean boolIsActive = eCommerce.isActive();
            if (!(boolIsActive != null ? boolIsActive.booleanValue() : eCommerce.isActiveByDefault()) || !eCommerce.getHasCards()) {
                z10 = false;
            }
        }
        return Boxing.boxBoolean(z10);
    }
}
