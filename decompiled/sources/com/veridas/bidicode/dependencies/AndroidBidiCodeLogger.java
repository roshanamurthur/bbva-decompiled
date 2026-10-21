package com.veridas.bidicode.dependencies;

import com.bbva.glomohybrid.logs.LogKeysKt;
import com.veridas.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidBidiCodeLogger.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/veridas/bidicode/dependencies/AndroidBidiCodeLogger;", "Lcom/veridas/bidicode/dependencies/BidiCodeLogger;", "", "message", "", LogKeysKt.LOG, "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", LogKeysKt.TAG, "<init>", "(Ljava/lang/String;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class AndroidBidiCodeLogger implements BidiCodeLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tag;

    public AndroidBidiCodeLogger(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @Override // com.veridas.bidicode.dependencies.BidiCodeLogger
    public void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(this.tag, message);
    }
}
