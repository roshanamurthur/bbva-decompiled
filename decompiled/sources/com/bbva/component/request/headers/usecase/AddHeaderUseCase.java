package com.bbva.component.request.headers.usecase;

import com.bbva.component.request.headers.HeaderInterceptor;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AddHeaderUseCase.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/request/headers/usecase/AddHeaderUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "", "", "", "params", "execute", "Lcom/bbva/component/request/headers/HeaderInterceptor;", "headerInterceptor", "<init>", "(Lcom/bbva/component/request/headers/HeaderInterceptor;)V", "request-headers_release"}, k = 1, mv = {1, 9, 0})
public final class AddHeaderUseCase implements UseCaseWithParams<Map<String, ? extends String>, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HeaderInterceptor f28227a;

    public AddHeaderUseCase(@NotNull HeaderInterceptor headerInterceptor) {
        Intrinsics.checkNotNullParameter(headerInterceptor, "headerInterceptor");
        this.f28227a = headerInterceptor;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    public /* bridge */ /* synthetic */ Unit execute(Map<String, ? extends String> map) {
        execute2((Map<String, String>) map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public void execute2(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f28227a.addHeader(params);
    }
}
