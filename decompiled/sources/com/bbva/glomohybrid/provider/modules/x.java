package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.featureflags.repository.datasource.LocalDataSource;
import com.bbva.slidemenuview.MenuItemOpenWebFlagsConfigKt;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper;
import com.bbva.slidemenuview.decorator.GlomoMiniorDecorator;
import com.bbva.slidemenuview.decorator.MonoEnterpriseDebitCardUserDecorator;
import com.bbva.slidemenuview.decorator.MonoProductDecorator;
import com.bbva.slidemenuview.decorator.OpenWebFeatureFlagsMenuDecorator;
import com.bbva.slidemenuview.decorator.StandInMenuDecorator;
import com.bbva.slidemenuview.decorator.SustainabilityDecorator;
import com.bbva.slidemenuview.domain.usecase.GetFeaturedMenuUseCase;
import com.bbva.slidemenuview.presentation.decorator.FeatureFlagsMenuDecorator;
import com.bbva.slidemenuview.presentation.decorator.MenuDecorator;
import com.bbva.slidemenuview.presentation.decorator.VisibilityMenuDecorator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryPresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,110:1\n129#2,5:111\n129#2,5:116\n129#2,5:121\n129#2,5:126\n129#2,5:131\n129#2,5:136\n129#2,5:141\n*S KotlinDebug\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$3\n*L\n54#1:111,5\n55#1:116,5\n56#1:121,5\n57#1:126,5\n58#1:131,5\n60#1:136,5\n61#1:141,5\n*E\n"})
public final class x extends Lambda implements Function2<Scope, ParametersHolder, List<? extends MenuDecorator>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x f34355p0 = new x(2);

    @Override // kotlin.jvm.functions.Function2
    public final List<? extends MenuDecorator> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new MenuDecorator[]{new FeatureFlagsMenuDecorator((GetFeaturedMenuUseCase) factory.get(Reflection.getOrCreateKotlinClass(GetFeaturedMenuUseCase.class), null, null), null, 2, null), new StandInMenuDecorator((FeatureFlagsRepository) factory.get(Reflection.getOrCreateKotlinClass(FeatureFlagsRepository.class), null, null)), new MonoEnterpriseDebitCardUserDecorator((MainStorage) factory.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)), new MonoProductDecorator((MainStorage) factory.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)), new OpenWebFeatureFlagsMenuDecorator((LocalDataSource) factory.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (MenuIdentifierMapper) factory.get(Reflection.getOrCreateKotlinClass(MenuIdentifierMapper.class), null, null), MenuItemOpenWebFlagsConfigKt.getMenuItemsFeatureFlagsConfig()), new VisibilityMenuDecorator(), new GlomoMiniorDecorator((MainStorage) factory.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)), new SustainabilityDecorator((FeatureFlagsRepository) factory.get(Reflection.getOrCreateKotlinClass(FeatureFlagsRepository.class), null, null))});
    }
}
