package com.bbva.component.ay.catalyst.usecase;

import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.ay.catalyst.data.AnalyticsDataSource;
import io.reactivex.Flowable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetTrackingIdentifierUseCase.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/ay/catalyst/usecase/GetTrackingIdentifierUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "", "Ljava/lang/Void;", "params", "Lio/reactivex/Flowable;", "create", "Lcom/bbva/component/ay/catalyst/data/AnalyticsDataSource;", "analyticsDataSource", "<init>", "(Lcom/bbva/component/ay/catalyst/data/AnalyticsDataSource;)V", "component-ay-catalyst_release"}, k = 1, mv = {1, 5, 1})
public final class GetTrackingIdentifierUseCase extends UseCase<String, Void> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AnalyticsDataSource f27337d;

    public GetTrackingIdentifierUseCase(@NotNull AnalyticsDataSource analyticsDataSource) {
        Intrinsics.checkNotNullParameter(analyticsDataSource, "analyticsDataSource");
        this.f27337d = analyticsDataSource;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    @NotNull
    public Flowable<String> create(@Nullable Void params) {
        return this.f27337d.getTrackingIdentifier();
    }
}
