package s8;

import com.bbva.glomohybrid.featureflags.domain.usecase.SyncFeatureFlagsUseCase;
import com.bbva.glomohybrid.profiling.domain.model.Profiling;
import com.bbva.glomohybrid.profiling.domain.model.ProfilingStorePolicy;
import com.bbva.glomohybrid.profiling.repository.ProfilingRepository;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SyncFeatureFlagsUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function1<ProfilingStorePolicy, Profiling> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SyncFeatureFlagsUseCase f93148p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SyncFeatureFlagsUseCase syncFeatureFlagsUseCase) {
        super(1);
        this.f93148p0 = syncFeatureFlagsUseCase;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Profiling invoke(ProfilingStorePolicy profilingStorePolicy) {
        ProfilingStorePolicy it = profilingStorePolicy;
        Intrinsics.checkNotNullParameter(it, "it");
        ProfilingRepository profilingRepository = this.f93148p0.f32141e;
        if (profilingRepository != null) {
            return profilingRepository.getProfiling(it);
        }
        return null;
    }
}
