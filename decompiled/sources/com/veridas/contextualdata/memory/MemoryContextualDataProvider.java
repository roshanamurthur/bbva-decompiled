package com.veridas.contextualdata.memory;

import android.app.ActivityManager;
import android.content.Context;
import android.os.StatFs;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MemoryContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/veridas/contextualdata/memory/MemoryContextualDataProvider;", "Lcom/veridas/contextualdata/memory/IMemoryContextualDataProvider;", "", "getRamSizeBytes", "getInternalStorageSizeBytes", "()Ljava/lang/Float;", "getExternalStorageSizeBytes", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class MemoryContextualDataProvider implements IMemoryContextualDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    public MemoryContextualDataProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.veridas.contextualdata.memory.IMemoryContextualDataProvider
    @Nullable
    public Float getExternalStorageSizeBytes() {
        String absolutePath;
        File externalFilesDir = this.context.getApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir == null || (absolutePath = externalFilesDir.getAbsolutePath()) == null) {
            return null;
        }
        return Float.valueOf(new StatFs(absolutePath).getTotalBytes());
    }

    @Override // com.veridas.contextualdata.memory.IMemoryContextualDataProvider
    @Nullable
    public Float getInternalStorageSizeBytes() {
        String absolutePath;
        File filesDir = this.context.getApplicationContext().getFilesDir();
        if (filesDir == null || (absolutePath = filesDir.getAbsolutePath()) == null) {
            return null;
        }
        return Float.valueOf(new StatFs(absolutePath).getTotalBytes());
    }

    @Override // com.veridas.contextualdata.memory.IMemoryContextualDataProvider
    public float getRamSizeBytes() {
        Object systemService = this.context.getApplicationContext().getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
