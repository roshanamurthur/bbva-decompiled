package com.bbva.plugin.media.capture.model;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TempFile.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/media/capture/model/TempFile;", "", "Ljava/io/File;", "a", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "file", "Landroid/net/Uri;", "b", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "<init>", "(Ljava/io/File;Landroid/net/Uri;)V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class TempFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Uri uri;

    public TempFile(@NotNull File file, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.file = file;
        this.uri = uri;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TempFile(File file, Uri uri, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            uri = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(uri, "Uri.EMPTY");
        }
        this(file, uri);
    }
}
