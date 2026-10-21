package com.bbva.glomohybrid.landing.domain.aem.filters;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.landing.domain.aem.extensions.LandingAEMItemModelExtensionsKt;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomoutils.semanticversion.GlomoSemanticVersion;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingVersionConditionFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/filters/LandingMinVersionConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/filters/BaseLandingConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "aemItemModel", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "user", "", "meetCondition", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;Lcom/bbva/glomo/user/domain/model/RememberedUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "versionName", "<init>", "(Ljava/lang/String;)V", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingMinVersionConditionFilter extends BaseLandingConditionFilter {

    @NotNull
    public static final String ID = "minVersionAndroid";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f32618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    public LandingMinVersionConditionFilter(@NotNull String versionName) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        this.f32618a = versionName;
        this.id = ID;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @Nullable
    public Object meetCondition(@NotNull LandingAEMModel landingAEMModel, @Nullable RememberedUser rememberedUser, @NotNull Continuation<? super Boolean> continuation) {
        GlomoSemanticVersion minVersion;
        LandingAEMModel landingAEMModelCheckConditions = checkConditions(landingAEMModel);
        boolean z10 = true;
        if (landingAEMModelCheckConditions != null && (minVersion = LandingAEMItemModelExtensionsKt.getMinVersion(landingAEMModelCheckConditions)) != null && (!minVersion.getCom.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID java.lang.String() || minVersion.compareTo(new GlomoSemanticVersion(this.f32618a)) == 1)) {
            z10 = false;
        }
        return Boxing.boxBoolean(z10);
    }
}
