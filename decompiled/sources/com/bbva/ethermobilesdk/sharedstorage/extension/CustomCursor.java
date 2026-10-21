package com.bbva.ethermobilesdk.sharedstorage.extension;

import android.database.MatrixCursor;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Cursor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/extension/CustomCursor;", "Landroid/database/MatrixCursor;", "key", "", "entry", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;)V", "Companion", "shared-storage_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CustomCursor extends MatrixCursor {

    @NotNull
    public static final String CREATED = "created";

    @NotNull
    public static final String ID = "_id";

    @NotNull
    public static final String MODIFIED = "modified";

    @NotNull
    public static final String VALUE = "value";

    @NotNull
    public static final String VERSION = "version";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCursor(@NotNull String key, @Nullable StorageEntry storageEntry) {
        super(new String[]{ID, "value", "created", "modified", "version"});
        Intrinsics.checkNotNullParameter(key, "key");
        String[] strArr = new String[5];
        strArr[0] = key;
        strArr[1] = storageEntry != null ? storageEntry.getValue() : null;
        strArr[2] = storageEntry != null ? storageEntry.getCreated() : null;
        strArr[3] = storageEntry != null ? storageEntry.getModified() : null;
        strArr[4] = storageEntry != null ? storageEntry.getVersion() : null;
        addRow(strArr);
    }
}
