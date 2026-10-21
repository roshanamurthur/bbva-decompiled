package com.bbva.glomo.user.repository.datasource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FlowmeterDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomo/user/repository/datasource/FlowmeterDataSource;", "", "getLastNumber", "", "persistLastNumber", "", "lastNumber", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FlowmeterDataSource {
    @Nullable
    String getLastNumber();

    void persistLastNumber(@NotNull String lastNumber);
}
