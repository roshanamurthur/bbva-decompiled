package com.bbva.glomohybrid.documents.common;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.ViewValue;
import com.bbva.glomohybrid.documents.common.model.LocalFile;
import com.bbva.glomohybrid.documents.plugin.UriExporter;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OpenFileUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/OpenFileUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomohybrid/documents/common/model/LocalFile;", "", "params", "execute", "(Lcom/bbva/glomohybrid/documents/common/model/LocalFile;)Ljava/lang/Boolean;", "Lcom/bbva/glomohybrid/documents/plugin/UriExporter;", "uriExporter", "Lcom/bbva/actionlauncher/ActionLauncher;", "actionLauncher", "<init>", "(Lcom/bbva/glomohybrid/documents/plugin/UriExporter;Lcom/bbva/actionlauncher/ActionLauncher;)V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public final class OpenFileUseCase implements UseCaseWithParams<LocalFile, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UriExporter f32055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ActionLauncher f32056b;

    public OpenFileUseCase(@NotNull UriExporter uriExporter, @NotNull ActionLauncher actionLauncher) {
        Intrinsics.checkNotNullParameter(uriExporter, "uriExporter");
        Intrinsics.checkNotNullParameter(actionLauncher, "actionLauncher");
        this.f32055a = uriExporter;
        this.f32056b = actionLauncher;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    @NotNull
    public Boolean execute(@NotNull LocalFile params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (!params.getFile().exists()) {
            return Boolean.FALSE;
        }
        String absolutePath = params.getFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return Boolean.valueOf(this.f32056b.launchView(new ViewValue.Uri(params.getMimeType(), this.f32055a.export(absolutePath), 0, 4, null)));
    }
}
