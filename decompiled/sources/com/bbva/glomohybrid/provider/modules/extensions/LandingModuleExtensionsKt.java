package com.bbva.glomohybrid.provider.modules.extensions;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.base.usecase.UseCaseConstants;
import com.bbva.glomohybrid.landing.domain.aem.filters.BaseLandingConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsNotOpenPayUserFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsOpenPayUserFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsSoftTokenAvailableConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsSoftTokenNotAvailableConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingUserConditionFilter;
import com.bbva.glomohybrid.landing.presentation.router.handler.CustomNavigationHandler;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LandingModuleExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"createNavigationHandlers", "", "Lcom/bbva/glomohybrid/landing/presentation/router/handler/CustomNavigationHandler;", "Lorg/koin/core/scope/Scope;", "pageId", "", "getCountryConditionFilters", "Lcom/bbva/glomohybrid/landing/domain/aem/filters/LandingAEMConditionFilter;", "rememberedUser", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLandingModuleExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingModuleExtensions.kt\ncom/bbva/glomohybrid/provider/modules/extensions/LandingModuleExtensionsKt\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,38:1\n158#2:39\n158#2:40\n129#2,5:41\n129#2,5:46\n*S KotlinDebug\n*F\n+ 1 LandingModuleExtensions.kt\ncom/bbva/glomohybrid/provider/modules/extensions/LandingModuleExtensionsKt\n*L\n28#1:39\n31#1:40\n34#1:41,5\n35#1:46,5\n*E\n"})
public final class LandingModuleExtensionsKt {

    /* JADX INFO: compiled from: LandingModuleExtensions.kt */
    public static final class a extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RememberedUser f34282p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RememberedUser rememberedUser) {
            super(0);
            this.f34282p0 = rememberedUser;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(this.f34282p0);
        }
    }

    /* JADX INFO: compiled from: LandingModuleExtensions.kt */
    public static final class b extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RememberedUser f34283p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RememberedUser rememberedUser) {
            super(0);
            this.f34283p0 = rememberedUser;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(this.f34283p0);
        }
    }

    @NotNull
    public static final List<CustomNavigationHandler> createNavigationHandlers(@NotNull Scope scope, int i10) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<LandingAEMConditionFilter> getCountryConditionFilters(@NotNull Scope scope, @Nullable RememberedUser rememberedUser) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new BaseLandingConditionFilter[]{new LandingIsSoftTokenAvailableConditionFilter((SuspendUseCase) scope.getOrNull(Reflection.getOrCreateKotlinClass(SuspendUseCase.class), QualifierKt.named(UseCaseConstants.isTokenActiveUseCase), new a(rememberedUser))), new LandingIsSoftTokenNotAvailableConditionFilter((SuspendUseCase) scope.getOrNull(Reflection.getOrCreateKotlinClass(SuspendUseCase.class), QualifierKt.named(UseCaseConstants.isTokenActiveUseCase), new b(rememberedUser))), new LandingUserConditionFilter(), new LandingIsOpenPayUserFilter((MainStorage) scope.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)), new LandingIsNotOpenPayUserFilter((MainStorage) scope.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null))});
    }
}
