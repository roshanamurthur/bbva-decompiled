package com.bbva.glomohybrid.provider.modules;

import android.content.SharedPreferences;
import com.bbva.component.dm.storage.PrefsStorageDataManager;
import com.bbva.glomohybrid.base.datasource.UserStoredDatasource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InterceptorsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nInterceptorsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$19$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,294:1\n129#2,5:295\n*S KotlinDebug\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$19$1\n*L\n289#1:295,5\n*E\n"})
public final class u0 extends Lambda implements Function0<UserStoredDatasource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Scope f34346p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Scope scope) {
        super(0);
        this.f34346p0 = scope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final UserStoredDatasource invoke() {
        StringQualifier stringQualifierNamed = QualifierKt.named(PrefsStorageDataManager.ID);
        return new UserStoredDatasource((SharedPreferences) this.f34346p0.get(Reflection.getOrCreateKotlinClass(SharedPreferences.class), stringQualifierNamed, null));
    }
}
