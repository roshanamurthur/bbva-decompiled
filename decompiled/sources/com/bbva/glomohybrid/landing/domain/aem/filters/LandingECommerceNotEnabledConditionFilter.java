package com.bbva.glomohybrid.landing.domain.aem.filters;

import com.bbva.glomohybrid.landing.data.datasource.LandingSettingsDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingECommerceConditionFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/filters/LandingECommerceNotEnabledConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/filters/BaseLandingConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "aemItemModel", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "user", "", "meetCondition", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;Lcom/bbva/glomo/user/domain/model/RememberedUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/glomohybrid/landing/data/datasource/LandingSettingsDataSource;", "dataSource", "<init>", "(Lcom/bbva/glomohybrid/landing/data/datasource/LandingSettingsDataSource;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingECommerceConditionFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingECommerceConditionFilter.kt\ncom/bbva/glomohybrid/landing/domain/aem/filters/LandingECommerceNotEnabledConditionFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
public final class LandingECommerceNotEnabledConditionFilter extends BaseLandingConditionFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LandingSettingsDataSource f32558a;

    public LandingECommerceNotEnabledConditionFilter(@NotNull LandingSettingsDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f32558a = dataSource;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @NotNull
    public String getId() {
        return "isEcommerceNotEnabled";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r2.getHasCards() == false) goto L14;
     */
    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object meetCondition(@org.jetbrains.annotations.NotNull com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel r1, @org.jetbrains.annotations.Nullable com.bbva.glomo.user.domain.model.RememberedUser r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r3) {
        /*
            r0 = this;
            com.bbva.glomohybrid.landing.data.datasource.LandingSettingsDataSource r2 = r0.f32558a
            com.bbva.glomohybrid.landing.domain.sections.model.LandingSettingsModel r2 = r2.get()
            com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceSettingsModel r2 = r2.getECommerce()
            com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel r1 = r0.checkConditions(r1)
            r3 = 1
            if (r1 == 0) goto L2c
            java.lang.Boolean r1 = r2.isActive()
            if (r1 == 0) goto L1e
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2b
            goto L24
        L1e:
            boolean r1 = r2.isActiveByDefault()
            if (r1 != 0) goto L2b
        L24:
            boolean r1 = r2.getHasCards()
            if (r1 == 0) goto L2b
            goto L2c
        L2b:
            r3 = 0
        L2c:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.glomohybrid.landing.domain.aem.filters.LandingECommerceNotEnabledConditionFilter.meetCondition(com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel, com.bbva.glomo.user.domain.model.RememberedUser, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
