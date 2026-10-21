package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import com.bbva.slidemenuview.usecase.DefaultIsTokenActiveUseCase;
import com.bbva.softtokenbase.SoftToken;
import com.bbva.softtokenbase.ethertoken.GloMoEtherToken;
import com.bbva.softtokenbase.ethertoken.GlomoEtherTokenCompat;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1$2\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,85:1\n44#2:86\n154#3,5:87\n154#3,5:92\n*S KotlinDebug\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1$2\n*L\n39#1:86\n40#1:87,5\n41#1:92,5\n*E\n"})
public final class f extends Lambda implements Function2<Scope, ParametersHolder, SuspendUseCase<Boolean>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f f34284p0 = new f(2);

    @Override // kotlin.jvm.functions.Function2
    public final SuspendUseCase<Boolean> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        RememberedUser rememberedUser = (RememberedUser) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", RememberedUser.class));
        return new DefaultIsTokenActiveUseCase(CollectionsKt__CollectionsKt.listOf((Object[]) new SoftToken[]{(GlomoEtherTokenCompat) scope2.getOrNull(Reflection.getOrCreateKotlinClass(GlomoEtherTokenCompat.class), null, new e(rememberedUser)), (GloMoEtherToken) scope2.getOrNull(Reflection.getOrCreateKotlinClass(GloMoEtherToken.class), null, new d(rememberedUser))}));
    }
}
