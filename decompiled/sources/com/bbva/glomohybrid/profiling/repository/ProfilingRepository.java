package com.bbva.glomohybrid.profiling.repository;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomohybrid.profiling.domain.model.Profiling;
import com.bbva.glomohybrid.profiling.domain.model.ProfilingStorePolicy;
import com.bbva.glomohybrid.profiling.repository.datasource.NetworkProfilingDataSource;
import com.bbva.glomohybrid.profiling.repository.datasource.ProfilingLocalDataSource;
import com.bbva.glomohybrid.profiling.repository.datasource.ProfilingMemoryDataSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProfilingRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/profiling/repository/ProfilingRepository;", "", "Lcom/bbva/glomohybrid/profiling/domain/model/ProfilingStorePolicy;", Constants.policy, "Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;", "getProfiling", "Lcom/bbva/glomohybrid/profiling/repository/datasource/NetworkProfilingDataSource;", DeepLinkListenerAdapter.Constants.ERROR_NETWORK, "Lcom/bbva/glomohybrid/profiling/repository/datasource/ProfilingLocalDataSource;", "local", "Lcom/bbva/glomohybrid/profiling/repository/datasource/ProfilingMemoryDataSource;", "memoryDataSource", "Lcom/bbva/glomo/storage/MainStorage;", "localStorage", "<init>", "(Lcom/bbva/glomohybrid/profiling/repository/datasource/NetworkProfilingDataSource;Lcom/bbva/glomohybrid/profiling/repository/datasource/ProfilingLocalDataSource;Lcom/bbva/glomohybrid/profiling/repository/datasource/ProfilingMemoryDataSource;Lcom/bbva/glomo/storage/MainStorage;)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nProfilingRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfilingRepository.kt\ncom/bbva/glomohybrid/profiling/repository/ProfilingRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class ProfilingRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkProfilingDataSource f33838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ProfilingLocalDataSource f33839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ProfilingMemoryDataSource f33840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MainStorage f33841d;

    /* JADX INFO: compiled from: ProfilingRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfilingStorePolicy.values().length];
            try {
                iArr[ProfilingStorePolicy.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfilingStorePolicy.CHECK_LOCAL_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProfilingRepository(@NotNull NetworkProfilingDataSource network, @NotNull ProfilingLocalDataSource local, @NotNull ProfilingMemoryDataSource memoryDataSource, @NotNull MainStorage localStorage) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(memoryDataSource, "memoryDataSource");
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f33838a = network;
        this.f33839b = local;
        this.f33840c = memoryDataSource;
        this.f33841d = localStorage;
    }

    public static Profiling b(Profiling profiling) {
        if (profiling == null || !(!profiling.getFeatures().isEmpty())) {
            return null;
        }
        return profiling;
    }

    public final Profiling a() {
        if (b(this.f33839b.getFeatureFlags()) == null) {
            this.f33841d.remove(TargetStorage.Local, LocalStorageConstantsKt.ETAG_PROFILING);
            Unit unit = Unit.INSTANCE;
        }
        return this.f33838a.fetch();
    }

    @Nullable
    public final Profiling getProfiling(@NotNull ProfilingStorePolicy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i10 = WhenMappings.$EnumSwitchMapping$0[policy.ordinal()];
        ProfilingLocalDataSource profilingLocalDataSource = this.f33839b;
        ProfilingMemoryDataSource profilingMemoryDataSource = this.f33840c;
        if (i10 == 1) {
            Profiling profilingB = b(profilingMemoryDataSource.getCom.bbva.glomo.localstorage.LocalStorageConstantsKt.KEY_PROFILING java.lang.String());
            return profilingB == null ? b(profilingLocalDataSource.getFeatureFlags()) : profilingB;
        }
        if (i10 != 2) {
            return a();
        }
        Profiling profilingB2 = b(profilingMemoryDataSource.getCom.bbva.glomo.localstorage.LocalStorageConstantsKt.KEY_PROFILING java.lang.String());
        if (profilingB2 == null) {
            profilingB2 = b(profilingLocalDataSource.getFeatureFlags());
        }
        return profilingB2 == null ? a() : profilingB2;
    }
}
