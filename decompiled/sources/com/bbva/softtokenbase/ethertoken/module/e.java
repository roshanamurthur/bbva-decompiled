package com.bbva.softtokenbase.ethertoken.module;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.softtokenbase.SoftToken;
import com.bbva.softtokenbase.store.TOTPTokenDataStore;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: EtherTokenModule.kt */
/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nEtherTokenModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherTokenModule.kt\ncom/bbva/softtokenbase/ethertoken/module/EtherTokenModuleKt$getEtherTokenCompatModule$1$4\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,103:1\n44#2:104\n129#3,5:105\n*S KotlinDebug\n*F\n+ 1 EtherTokenModule.kt\ncom/bbva/softtokenbase/ethertoken/module/EtherTokenModuleKt$getEtherTokenCompatModule$1$4\n*L\n97#1:104\n99#1:105,5\n*E\n"})
public final class e extends Lambda implements Function2<Scope, ParametersHolder, TOTPTokenDataStore> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e f36879p0 = new e(2);

    @Override // kotlin.jvm.functions.Function2
    public final TOTPTokenDataStore invoke(Scope scope, ParametersHolder parametersHolder) {
        RememberedUser rememberedUser;
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        UserProfileConfiguration userProfileConfiguration = (UserProfileConfiguration) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", UserProfileConfiguration.class));
        if (userProfileConfiguration == null || (rememberedUser = userProfileConfiguration.getRememberedUser()) == null) {
            return null;
        }
        return new TOTPTokenDataStore((SoftToken) scope2.get(Reflection.getOrCreateKotlinClass(SoftToken.class), null, new d(rememberedUser)));
    }
}
