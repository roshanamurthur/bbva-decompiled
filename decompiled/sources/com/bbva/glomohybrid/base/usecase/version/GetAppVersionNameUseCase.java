package com.bbva.glomohybrid.base.usecase.version;

import com.bbva.glomohybrid.base.datasource.AppVersionDataSource;
import com.bbva.glomoutils.usecase.UseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetAppVersionNameUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/base/usecase/version/GetAppVersionNameUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "execute", "Lcom/bbva/glomohybrid/base/datasource/AppVersionDataSource;", "appVersionDataSource", "<init>", "(Lcom/bbva/glomohybrid/base/datasource/AppVersionDataSource;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class GetAppVersionNameUseCase implements UseCase<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AppVersionDataSource f31586a;

    public GetAppVersionNameUseCase(@NotNull AppVersionDataSource appVersionDataSource) {
        Intrinsics.checkNotNullParameter(appVersionDataSource, "appVersionDataSource");
        this.f31586a = appVersionDataSource;
    }

    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public String execute() {
        return this.f31586a.getCurrentAppVersionName();
    }
}
