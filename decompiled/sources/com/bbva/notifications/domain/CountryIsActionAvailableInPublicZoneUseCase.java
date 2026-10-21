package com.bbva.notifications.domain;

import com.bbva.glomohybrid.base.datasource.UserStoredDatasource;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.notifications.constants.NotificationAction;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CountryIsActionAvailableInPublicZoneUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/notifications/domain/CountryIsActionAvailableInPublicZoneUseCase;", "Lcom/bbva/notifications/domain/IsActionAvailableInPublicZoneUseCase;", "", "params", "", "execute", "(Ljava/lang/String;)Ljava/lang/Boolean;", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryIsActionAvailableInPublicZoneUseCase implements IsActionAvailableInPublicZoneUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f35346a;

    /* JADX INFO: compiled from: CountryIsActionAvailableInPublicZoneUseCase.kt */
    public static final class a extends Lambda implements Function0<UserStoredDatasource> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentsProviders f35347p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelComponentsProviders viewModelComponentsProviders) {
            super(0);
            this.f35347p0 = viewModelComponentsProviders;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserStoredDatasource invoke() {
            return (UserStoredDatasource) this.f35347p0.provide(UserStoredDatasource.ID);
        }
    }

    public CountryIsActionAvailableInPublicZoneUseCase(@NotNull ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f35346a = LazyKt__LazyJVMKt.lazy(new a(provider));
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    @NotNull
    public Boolean execute(@Nullable String params) {
        NotificationAction notificationActionFromValue = NotificationAction.INSTANCE.fromValue(params);
        boolean z10 = false;
        boolean isAvailableInPublicZone = notificationActionFromValue != null ? notificationActionFromValue.getIsAvailableInPublicZone() : false;
        UserStoredDatasource userStoredDatasource = (UserStoredDatasource) this.f35346a.getValue();
        if ((userStoredDatasource == null || !userStoredDatasource.isLogged()) && isAvailableInPublicZone) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
