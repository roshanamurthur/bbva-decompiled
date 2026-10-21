package com.bbva.glomohybrid.featureflags.repository;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.domain.model.StorePolicy;
import com.bbva.glomohybrid.featureflags.repository.datasource.LocalDataSource;
import com.bbva.glomohybrid.featureflags.repository.datasource.MemoryDatasource;
import com.bbva.glomohybrid.featureflags.repository.datasource.NetworkDataSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlagsRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;", "", "Lcom/bbva/glomohybrid/featureflags/domain/model/StorePolicy;", Constants.policy, "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "get", "Lcom/bbva/glomohybrid/featureflags/repository/datasource/MemoryDatasource;", "memoryDatasource", "Lcom/bbva/glomohybrid/featureflags/repository/datasource/LocalDataSource;", "local", "Lcom/bbva/glomohybrid/featureflags/repository/datasource/NetworkDataSource;", DeepLinkListenerAdapter.Constants.ERROR_NETWORK, "Lcom/bbva/glomo/storage/MainStorage;", "localStorage", "", "isAppUpdated", "<init>", "(Lcom/bbva/glomohybrid/featureflags/repository/datasource/MemoryDatasource;Lcom/bbva/glomohybrid/featureflags/repository/datasource/LocalDataSource;Lcom/bbva/glomohybrid/featureflags/repository/datasource/NetworkDataSource;Lcom/bbva/glomo/storage/MainStorage;Z)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFeatureFlagsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlagsRepository.kt\ncom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class FeatureFlagsRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MemoryDatasource f32153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LocalDataSource f32154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NetworkDataSource f32155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MainStorage f32156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32157e;

    /* JADX INFO: compiled from: FeatureFlagsRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StorePolicy.values().length];
            try {
                iArr[StorePolicy.LocalFirst.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StorePolicy.Local.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FeatureFlagsRepository(@NotNull MemoryDatasource memoryDatasource, @NotNull LocalDataSource local, @NotNull NetworkDataSource network, @NotNull MainStorage localStorage, boolean z10) {
        Intrinsics.checkNotNullParameter(memoryDatasource, "memoryDatasource");
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f32153a = memoryDatasource;
        this.f32154b = local;
        this.f32155c = network;
        this.f32156d = localStorage;
        this.f32157e = z10;
    }

    public static FeatureFlags b(FeatureFlags featureFlags) {
        if (featureFlags == null || !(!featureFlags.getFeatures().isEmpty())) {
            return null;
        }
        return featureFlags;
    }

    public final FeatureFlags a() {
        LocalDataSource localDataSource = this.f32154b;
        if (b(localDataSource.getFeatureFlags()) == null) {
            this.f32156d.remove(TargetStorage.Local, LocalStorageConstantsKt.ETAG_FEATUREFLAGS);
            Unit unit = Unit.INSTANCE;
        }
        FeatureFlags featureFlagsFetch = this.f32155c.fetch();
        if (featureFlagsFetch != null) {
            this.f32153a.setFeatureFlags(featureFlagsFetch);
            localDataSource.setFeatureFlags(featureFlagsFetch);
        }
        return featureFlagsFetch;
    }

    @Nullable
    public final FeatureFlags get(@NotNull StorePolicy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        if (this.f32157e) {
            this.f32156d.remove(TargetStorage.Local, LocalStorageConstantsKt.ETAG_FEATUREFLAGS);
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[policy.ordinal()];
        LocalDataSource localDataSource = this.f32154b;
        MemoryDatasource memoryDatasource = this.f32153a;
        if (i10 != 1) {
            if (i10 != 2) {
                return a();
            }
            FeatureFlags featureFlagsB = b(memoryDatasource.getFeatureFlags());
            return featureFlagsB == null ? b(localDataSource.getFeatureFlags()) : featureFlagsB;
        }
        FeatureFlags featureFlagsB2 = b(memoryDatasource.getFeatureFlags());
        if (featureFlagsB2 == null) {
            featureFlagsB2 = b(localDataSource.getFeatureFlags());
        }
        return featureFlagsB2 == null ? a() : featureFlagsB2;
    }
}
