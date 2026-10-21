package com.bbva.glomohybrid.base.file.common;

import android.content.Context;
import androidx.camera.camera2.internal.compat.u;
import androidx.core.content.FileProvider;
import com.bbva.glomohybrid.base.file.constants.FileConstants;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileExporter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/base/file/common/FileExporter;", "", "", "filePath", "export", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class FileExporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f31346a;

    public FileExporter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31346a = context;
    }

    @NotNull
    public final String export(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Context context = this.f31346a;
        String string = FileProvider.getUriForFile(context, u.f(context.getPackageName(), FileConstants.FILE_PROVIDER_SUFFIX), new File(filePath)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
