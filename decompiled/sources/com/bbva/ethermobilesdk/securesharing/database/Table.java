package com.bbva.ethermobilesdk.securesharing.database;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EntryDatabase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/database/Table;", "", "idColumn", "", "getIdColumn", "()Ljava/lang/String;", "name", "getName", "path", "getPath", "securesharing_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Table {
    @NotNull
    String getIdColumn();

    @NotNull
    String getName();

    @NotNull
    String getPath();
}
