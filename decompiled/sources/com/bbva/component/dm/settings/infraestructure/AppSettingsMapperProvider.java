package com.bbva.component.dm.settings.infraestructure;

import com.google.gson.Gson;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppSettingsMapperProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/settings/infraestructure/AppSettingsMapperProvider;", "", "Lcom/bbva/component/dm/settings/infraestructure/AppSettingsMapper;", "getMapper", "()Lcom/bbva/component/dm/settings/infraestructure/AppSettingsMapper;", "mapper", "<init>", "()V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final class AppSettingsMapperProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f28032a = LazyKt__LazyJVMKt.lazy(a.f28033p0);

    /* JADX INFO: compiled from: AppSettingsMapperProvider.kt */
    public static final class a extends Lambda implements Function0<Gson> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28033p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    @NotNull
    public final AppSettingsMapper getMapper() {
        return new AppSettingsMapper((Gson) this.f28032a.getValue());
    }
}
