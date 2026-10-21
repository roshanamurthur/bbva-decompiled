package com.bbva.ethermobilesdk.securesharing.database;

import android.provider.BaseColumns;
import com.bbva.ethermobilesdk.sharedstorage.extension.CustomCursor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InfoTable.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/database/InfoTable;", "Lcom/bbva/ethermobilesdk/securesharing/database/Table;", "Landroid/provider/BaseColumns;", "", "URI_TYPE_FORMAT", "Ljava/lang/String;", "URI_ITEM_TYPE_FORMAT", "CONTENT_TYPE", "CONTENT_ITEM_TYPE", "PATH", "AUTHORITY", "PRIORITY", "a", "getName", "()Ljava/lang/String;", "name", "b", "getIdColumn", "idColumn", "c", "getPath", "path", "<init>", "()V", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class InfoTable implements Table, BaseColumns {

    @NotNull
    public static final String AUTHORITY = "providerName";

    @NotNull
    public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.com.bbva.sl.ar.proInfo";

    @NotNull
    public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.com.bbva.sl.ar.proInfo";

    @NotNull
    public static final String PRIORITY = "priority";

    @NotNull
    public static final String URI_ITEM_TYPE_FORMAT = "^content://.+/proInfo/\\d+$";

    @NotNull
    public static final String URI_TYPE_FORMAT = "^content://.+/proInfo$";

    @NotNull
    public static final InfoTable INSTANCE = new InfoTable();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String name = "provInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String idColumn = CustomCursor.ID;

    @NotNull
    public static final String PATH = "proInfo";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String path = PATH;

    @Override // com.bbva.ethermobilesdk.securesharing.database.Table
    @NotNull
    public String getIdColumn() {
        return idColumn;
    }

    @Override // com.bbva.ethermobilesdk.securesharing.database.Table
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.bbva.ethermobilesdk.securesharing.database.Table
    @NotNull
    public String getPath() {
        return path;
    }
}
