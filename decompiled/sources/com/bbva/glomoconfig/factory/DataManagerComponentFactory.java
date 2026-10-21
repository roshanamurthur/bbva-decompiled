package com.bbva.glomoconfig.factory;

import bk.q;
import com.bbva.glomohybrid.base.file.constants.FileConstants;
import com.bbva.glomohybrid.documents.common.repository.dataSource.DiskFileDataSource;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DataManagerComponentFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomoconfig/factory/DataManagerComponentFactory;", "", "()V", "fileFetcher", "", "", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DataManagerComponentFactory {

    @NotNull
    public static final DataManagerComponentFactory INSTANCE = new DataManagerComponentFactory();

    @NotNull
    public final Map<String, Object> fileFetcher() {
        return q.mapOf(TuplesKt.to("file", "document.pdf"), TuplesKt.to("folder", FileConstants.FILE_PROVIDER_SHARED_FOLDER_NAME), TuplesKt.to("headers", q.mapOf(TuplesKt.to(DigipassManagerConstants.KEY_CONTENT_TYPE, DiskFileDataSource.APPLICATION_PDF), TuplesKt.to("enabled", "true"))));
    }
}
