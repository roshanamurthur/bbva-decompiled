package com.bbva.component.dm.settings.repository;

import bk.q;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.repository.datasource.NetworkSettingsDataSource;
import com.bbva.component.dm.settings.repository.datasource.StorageDataSource;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppSettingsRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;", "", "Lcom/bbva/component/dm/settings/repository/SettingsPolicy;", Constants.policy, "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "getSettings", "Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "e", "Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "getAppSettings$cmp_dm_appsettings_release", "()Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "setAppSettings$cmp_dm_appsettings_release", "(Lcom/bbva/component/dm/settings/domain/model/AppSettings;)V", "appSettings", "Lcom/bbva/component/dm/settings/repository/datasource/NetworkSettingsDataSource;", "networkDataSource", "Lcom/bbva/component/dm/settings/repository/datasource/StorageDataSource;", "storageDataSource", "Lcom/bbva/glomo/storage/MainStorage;", "localStorage", "", "isAppUpdated", "<init>", "(Lcom/bbva/component/dm/settings/repository/datasource/NetworkSettingsDataSource;Lcom/bbva/component/dm/settings/repository/datasource/StorageDataSource;Lcom/bbva/glomo/storage/MainStorage;Z)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAppSettingsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSettingsRepository.kt\ncom/bbva/component/dm/settings/repository/AppSettingsRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class AppSettingsRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkSettingsDataSource f28034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StorageDataSource f28035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MainStorage f28036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f28037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public AppSettings appSettings;

    /* JADX INFO: compiled from: AppSettingsRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingsPolicy.values().length];
            try {
                iArr[SettingsPolicy.LocalFirst.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettingsPolicy.Local.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SettingsPolicy.Remote.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AppSettingsRepository(@NotNull NetworkSettingsDataSource networkDataSource, @NotNull StorageDataSource storageDataSource, @NotNull MainStorage localStorage, boolean z10) {
        Intrinsics.checkNotNullParameter(networkDataSource, "networkDataSource");
        Intrinsics.checkNotNullParameter(storageDataSource, "storageDataSource");
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f28034a = networkDataSource;
        this.f28035b = storageDataSource;
        this.f28036c = localStorage;
        this.f28037d = z10;
    }

    public final AppSettings a() {
        AppSettings appSettings = this.appSettings;
        AppSettings appSettings2 = null;
        if (appSettings == null || !(!appSettings.getData().isEmpty())) {
            appSettings = null;
        }
        if (appSettings != null) {
            return appSettings;
        }
        AppSettings appSettings3 = this.f28035b.get();
        if (appSettings3 != null && (!appSettings3.getData().isEmpty())) {
            appSettings2 = appSettings3;
        }
        this.appSettings = appSettings2;
        return appSettings2;
    }

    public final AppSettingsResult b() {
        if (a() == null) {
            this.f28036c.remove(TargetStorage.Local, LocalStorageConstantsKt.ETAG_APPSETTINGS);
            Unit unit = Unit.INSTANCE;
        }
        AppSettingsResult settings = this.f28034a.getSettings();
        if (settings instanceof AppSettingsResult.FreshResult) {
            AppSettingsResult.FreshResult freshResult = (AppSettingsResult.FreshResult) settings;
            this.f28035b.save(freshResult.getData());
            this.appSettings = freshResult.getData();
        } else {
            AppSettings appSettingsA = a();
            if (appSettingsA == null) {
                appSettingsA = new AppSettings(q.emptyMap());
            }
            settings = new AppSettingsResult.CachedResult(appSettingsA);
        }
        return settings;
    }

    @Nullable
    /* JADX INFO: renamed from: getAppSettings$cmp_dm_appsettings_release, reason: from getter */
    public final AppSettings getAppSettings() {
        return this.appSettings;
    }

    @NotNull
    public final AppSettingsResult getSettings(@NotNull SettingsPolicy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        if (this.f28037d) {
            this.f28036c.remove(TargetStorage.Local, LocalStorageConstantsKt.ETAG_APPSETTINGS);
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[policy.ordinal()];
        if (i10 == 1) {
            AppSettings appSettingsA = a();
            return appSettingsA != null ? new AppSettingsResult.CachedResult(appSettingsA) : b();
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return b();
            }
            throw new NoWhenBranchMatchedException();
        }
        AppSettings appSettingsA2 = a();
        if (appSettingsA2 == null) {
            appSettingsA2 = new AppSettings(q.emptyMap());
        }
        return new AppSettingsResult.CachedResult(appSettingsA2);
    }

    public final void setAppSettings$cmp_dm_appsettings_release(@Nullable AppSettings appSettings) {
        this.appSettings = appSettings;
    }
}
