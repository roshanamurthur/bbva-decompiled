package com.bbva.softtokenbase.ethertoken.module;

import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.shared.storage.TokenSharedStorage;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.softtokenbase.ethertoken.GloMoEtherToken;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: EtherTokenModule.kt */
/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nEtherTokenModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherTokenModule.kt\ncom/bbva/softtokenbase/ethertoken/module/EtherTokenModuleKt$getEtherTokenModule$1$1\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,103:1\n44#2:104\n*S KotlinDebug\n*F\n+ 1 EtherTokenModule.kt\ncom/bbva/softtokenbase/ethertoken/module/EtherTokenModuleKt$getEtherTokenModule$1$1\n*L\n35#1:104\n*E\n"})
public final class f extends Lambda implements Function2<Scope, ParametersHolder, GloMoEtherToken> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f36880p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(2);
        this.f36880p0 = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final GloMoEtherToken invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        RememberedUser rememberedUser = (RememberedUser) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", RememberedUser.class));
        String customerId = rememberedUser != null ? rememberedUser.getCustomerId() : null;
        return new GloMoEtherToken(customerId != null ? new EtherToken(new TokenSharedStorage(ModuleExtKt.androidContext(scope2), this.f36880p0, customerId)) : null);
    }
}
