package com.bbva.glomo.user.domain.mapper.mobileservices;

import com.google.gson.Gson;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MobileServicesTypeMapperProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/bbva/glomo/user/domain/mapper/mobileservices/MobileServicesTypeMapperProvider;", "", "Lcom/bbva/glomo/user/domain/mapper/mobileservices/MobileServicesTypeMapper;", "getMapper", "()Lcom/bbva/glomo/user/domain/mapper/mobileservices/MobileServicesTypeMapper;", "mapper", "<init>", "()V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class MobileServicesTypeMapperProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f30782a = LazyKt__LazyJVMKt.lazy(a.f30783p0);

    /* JADX INFO: compiled from: MobileServicesTypeMapperProvider.kt */
    public static final class a extends Lambda implements Function0<Gson> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f30783p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    @NotNull
    public final MobileServicesTypeMapper getMapper() {
        return new MobileServicesTypeMapper((Gson) this.f30782a.getValue());
    }
}
