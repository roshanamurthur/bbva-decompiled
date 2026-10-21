package com.bbva.glomo.user.repository.datasource;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalFlowmeterDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomo/user/repository/datasource/LocalFlowmeterDataSource;", "Lcom/bbva/glomo/user/repository/datasource/FlowmeterDataSource;", "", "getLastNumber", "lastNumber", "", "persistLastNumber", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class LocalFlowmeterDataSource implements FlowmeterDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f30876a;

    public LocalFlowmeterDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30876a = storage;
    }

    @Override // com.bbva.glomo.user.repository.datasource.FlowmeterDataSource
    @Nullable
    public String getLastNumber() {
        return MainStorage.getString$default(this.f30876a, LocalStorageConstantsKt.LAST_NUMBER_PHONE, null, true, TargetStorage.Local, 2, null);
    }

    @Override // com.bbva.glomo.user.repository.datasource.FlowmeterDataSource
    public void persistLastNumber(@NotNull String lastNumber) {
        Intrinsics.checkNotNullParameter(lastNumber, "lastNumber");
        this.f30876a.put(LocalStorageConstantsKt.LAST_NUMBER_PHONE, lastNumber, true, TargetStorage.Local);
    }
}
