package com.bbva.glomohybrid.documents.common.repository.dataSource;

import android.webkit.MimeTypeMap;
import androidx.camera.core.impl.utils.a;
import com.bbva.glomohybrid.documents.common.model.FileResponse;
import com.bbva.io.file.FileIOKt;
import com.bbva.io.file.Source;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DiskFileDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/repository/dataSource/DiskFileDataSource;", "", "Lcom/bbva/glomohybrid/documents/common/model/FileResponse;", "fileResponse", "", "name", "mimeType", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/FilenameFormatter;", "formatter", "Ljava/io/File;", "save", "destination", "<init>", "(Ljava/io/File;)V", "Companion", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDiskFileDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskFileDataSource.kt\ncom/bbva/glomohybrid/documents/common/repository/dataSource/DiskFileDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
public final class DiskFileDataSource {

    @NotNull
    public static final String APPLICATION_PDF = "application/pdf";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final File f32077a;

    public DiskFileDataSource(@NotNull File destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f32077a = destination;
    }

    @NotNull
    public final File save(@NotNull FileResponse fileResponse, @NotNull String name, @NotNull String mimeType, @NotNull FilenameFormatter formatter) {
        Intrinsics.checkNotNullParameter(fileResponse, "fileResponse");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        File file = new File(this.f32077a, a.b(formatter.format(name), Constant.DOT_STRING, MimeTypeMap.getSingleton().getExtensionFromMimeType(mimeType)));
        if (Intrinsics.areEqual(fileResponse.getContentType(), APPLICATION_PDF)) {
            FileIOKt.write(file, new Source.InputStreamSource(fileResponse.getFileContent()));
        } else {
            StringBuilder sb2 = new StringBuilder();
            TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(fileResponse.getFileContent())), new o8.a(sb2));
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FileIOKt.write(file, new Source.Base64Source(string));
        }
        return file;
    }
}
