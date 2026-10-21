package com.bbva.glomohybrid.profiling.repository.datasource;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomohybrid.profiling.domain.model.Profiling;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProfilingMemoryDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/profiling/repository/datasource/ProfilingMemoryDataSource;", "", "Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;", "a", "Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;", "getProfiling", "()Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;", "setProfiling", "(Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;)V", LocalStorageConstantsKt.KEY_PROFILING, "<init>", "()V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
public final class ProfilingMemoryDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Profiling profiling;

    @Nullable
    public final Profiling getProfiling() {
        return this.profiling;
    }

    public final void setProfiling(@Nullable Profiling profiling) {
        this.profiling = profiling;
    }
}
