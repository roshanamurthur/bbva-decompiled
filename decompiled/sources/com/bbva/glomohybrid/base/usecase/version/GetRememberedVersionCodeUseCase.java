package com.bbva.glomohybrid.base.usecase.version;

import com.bbva.glomohybrid.base.datasource.AppVersionDataSource;
import com.bbva.glomoutils.usecase.UseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetRememberedVersionCodeUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/base/usecase/version/GetRememberedVersionCodeUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "execute", "()Ljava/lang/Long;", "Lcom/bbva/glomohybrid/base/datasource/AppVersionDataSource;", "appVersionDataSource", "<init>", "(Lcom/bbva/glomohybrid/base/datasource/AppVersionDataSource;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class GetRememberedVersionCodeUseCase implements UseCase<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AppVersionDataSource f31587a;

    public GetRememberedVersionCodeUseCase(@NotNull AppVersionDataSource appVersionDataSource) {
        Intrinsics.checkNotNullParameter(appVersionDataSource, "appVersionDataSource");
        this.f31587a = appVersionDataSource;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public Long execute() {
        return Long.valueOf(this.f31587a.getStoredVersionCode());
    }
}
