package com.bbva.glomohybrid.featureflags.repository.datasource;

import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MemoryDatasource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/repository/datasource/MemoryDatasource;", "", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "a", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "getFeatureFlags", "()Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "setFeatureFlags", "(Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;)V", "featureFlags", "<init>", "()V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
public final class MemoryDatasource {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public FeatureFlags featureFlags;

    @Nullable
    public final FeatureFlags getFeatureFlags() {
        return this.featureFlags;
    }

    public final void setFeatureFlags(@Nullable FeatureFlags featureFlags) {
        this.featureFlags = featureFlags;
    }
}
