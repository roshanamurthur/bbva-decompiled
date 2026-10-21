package com.bbva.ethermobilesdk.deviceinfo.component;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.bbva.ethermobilesdk.deviceinfo.data.Storage;
import com.bbva.ethermobilesdk.deviceinfo.utils.extension.LongKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/component/FileSystem;", "", "Lcom/bbva/ethermobilesdk/deviceinfo/data/Storage;", "getStorage", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/Storage;", "storage", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "deviceinfo_release"}, k = 1, mv = {1, 8, 0})
public final class FileSystem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29526a;

    public FileSystem(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29526a = context;
    }

    @NotNull
    public final Storage getStorage() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        long freeBlocksLong = statFs.getFreeBlocksLong() * blockSizeLong;
        Context context = this.f29526a;
        File externalFilesDir = context.getExternalFilesDir(null);
        StatFs statFs2 = new StatFs(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null);
        long blockSizeLong2 = statFs2.getBlockSizeLong();
        long blockCountLong2 = statFs2.getBlockCountLong() * blockSizeLong2;
        long freeBlocksLong2 = statFs2.getFreeBlocksLong() * blockSizeLong2;
        return new Storage(LongKt.formatResultFileSizeToString(freeBlocksLong, context), LongKt.formatResultFileSizeToString(blockCountLong - freeBlocksLong, context), LongKt.formatResultFileSizeToString(blockCountLong, context), LongKt.formatResultFileSizeToString(freeBlocksLong2, context), LongKt.formatResultFileSizeToString(blockCountLong2 - freeBlocksLong2, context), LongKt.formatResultFileSizeToString(blockCountLong2, context));
    }
}
