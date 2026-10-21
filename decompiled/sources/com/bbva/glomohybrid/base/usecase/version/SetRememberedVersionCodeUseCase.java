package com.bbva.glomohybrid.base.usecase.version;

import com.bbva.glomohybrid.base.datasource.AppVersionDataSource;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SetRememberedVersionCodeUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/base/usecase/version/SetRememberedVersionCodeUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomohybrid/base/usecase/version/RememberedVersionCodeParams;", "", "params", "execute", "Lcom/bbva/glomohybrid/base/datasource/AppVersionDataSource;", "appVersionDataSource", "<init>", "(Lcom/bbva/glomohybrid/base/datasource/AppVersionDataSource;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class SetRememberedVersionCodeUseCase implements UseCaseWithParams<RememberedVersionCodeParams, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AppVersionDataSource f31593a;

    public SetRememberedVersionCodeUseCase(@NotNull AppVersionDataSource appVersionDataSource) {
        Intrinsics.checkNotNullParameter(appVersionDataSource, "appVersionDataSource");
        this.f31593a = appVersionDataSource;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    public /* bridge */ /* synthetic */ Unit execute(RememberedVersionCodeParams rememberedVersionCodeParams) {
        execute2(rememberedVersionCodeParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public void execute2(@NotNull RememberedVersionCodeParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f31593a.storeVersionCode(params.getVersionCode());
    }
}
