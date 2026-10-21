package com.bbva.component.dm.settings.domain.usecase;

import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FetchQuickLoginConfigUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/settings/domain/usecase/FetchQuickLoginConfigUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "", "", "params", "execute", "(Lkotlin/Unit;)Ljava/lang/Boolean;", "Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;", "repository", "<init>", "(Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final class FetchQuickLoginConfigUseCase implements UseCaseWithParams<Unit, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AppSettingsRepository f28025a;

    public FetchQuickLoginConfigUseCase(@NotNull AppSettingsRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f28025a = repository;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    @NotNull
    public Boolean execute(@NotNull Unit params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Boolean.valueOf(this.f28025a.getSettings(SettingsPolicy.Local).getData().getQuickLoginEnabled());
    }
}
