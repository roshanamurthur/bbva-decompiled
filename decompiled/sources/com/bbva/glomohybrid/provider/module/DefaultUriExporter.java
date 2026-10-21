package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.file.common.FileExporter;
import com.bbva.glomohybrid.documents.plugin.UriExporter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActionLauncherModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/provider/module/DefaultUriExporter;", "Lcom/bbva/glomohybrid/documents/plugin/UriExporter;", "", "filePath", "export", "Lcom/bbva/glomohybrid/base/file/common/FileExporter;", "fileExporter", "<init>", "(Lcom/bbva/glomohybrid/base/file/common/FileExporter;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class DefaultUriExporter implements UriExporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FileExporter f33959a;

    public DefaultUriExporter(@NotNull FileExporter fileExporter) {
        Intrinsics.checkNotNullParameter(fileExporter, "fileExporter");
        this.f33959a = fileExporter;
    }

    @Override // com.bbva.glomohybrid.documents.plugin.UriExporter
    @NotNull
    public String export(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return this.f33959a.export(filePath);
    }
}
