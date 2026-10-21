package com.bbva.ethermobilesdk.devicechecker.debug;

import android.content.Context;
import android.os.Debug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DebugApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/debug/DebugApi;", "", "", "isDebuggable", "isDebuggerConnected$devicechecker_release", "()Z", "isDebuggerConnected", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
public final class DebugApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29402a;

    public DebugApi(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29402a = context;
    }

    public final boolean isDebuggable() {
        return isDebuggerConnected$devicechecker_release() || (this.f29402a.getApplicationInfo().flags & 2) != 0;
    }

    public final boolean isDebuggerConnected$devicechecker_release() {
        return Debug.isDebuggerConnected();
    }
}
