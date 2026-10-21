package com.bbva.ethermobilesdk.devicechecker.util;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherFile.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/util/EtherFile;", "", "", "exists", "canRead", "Ljava/io/File;", "a", "Ljava/io/File;", "getFile$devicechecker_release", "()Ljava/io/File;", "file", "", "path", "<init>", "(Ljava/lang/String;)V", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
public final class EtherFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File file;

    public EtherFile(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.file = new File(path);
    }

    public final boolean canRead() {
        return this.file.canRead();
    }

    public final boolean exists() {
        return this.file.exists();
    }

    @NotNull
    /* JADX INFO: renamed from: getFile$devicechecker_release, reason: from getter */
    public final File getFile() {
        return this.file;
    }
}
