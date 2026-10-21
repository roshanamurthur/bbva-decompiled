package com.bbva.component.ay.catalyst.di;

import com.bbva.component.ay.catalyst.data.AnalyticsDataSource;
import com.bbva.component.ay.catalyst.data.IdentityDataSource;
import com.bbva.component.ay.catalyst.usecase.GetExperienceCloudIdUseCase;
import com.bbva.component.ay.catalyst.usecase.GetTrackingIdentifierUseCase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/bbva/component/ay/catalyst/di/Injector;", "", "Lcom/bbva/component/ay/catalyst/usecase/GetTrackingIdentifierUseCase;", "trackingIdentifierUseCase", "Lcom/bbva/component/ay/catalyst/usecase/GetExperienceCloudIdUseCase;", "experienceCloudIdUseCase", "<init>", "()V", "component-ay-catalyst_release"}, k = 1, mv = {1, 5, 1})
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AnalyticsDataSource f27334a = new AnalyticsDataSource();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final IdentityDataSource f27335b = new IdentityDataSource();

    @NotNull
    public final GetExperienceCloudIdUseCase experienceCloudIdUseCase() {
        return new GetExperienceCloudIdUseCase(f27335b);
    }

    @NotNull
    public final GetTrackingIdentifierUseCase trackingIdentifierUseCase() {
        return new GetTrackingIdentifierUseCase(f27334a);
    }
}
