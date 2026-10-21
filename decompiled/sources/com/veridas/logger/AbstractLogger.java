package com.veridas.logger;

import ai.a;
import android.os.Bundle;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractLogger.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\rJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000fJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/veridas/logger/AbstractLogger;", "Lcom/veridas/logger/Logger;", "", LogKeysKt.TAG, "message", "Landroid/os/Bundle;", "params", "", LogKeysKt.LOG, "", "", "args", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;[Ljava/lang/Object;)V", "Lcom/veridas/logger/Logger$Tag;", "(Lcom/veridas/logger/Logger$Tag;Ljava/lang/String;[Ljava/lang/Object;)V", "(Lcom/veridas/logger/Logger$Tag;Ljava/lang/String;Landroid/os/Bundle;[Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "lock", "", "b", "Z", "isSessionStarted", "()Z", "setSessionStarted", "(Z)V", "<init>", "()V", "common-logger_release"}, k = 1, mv = {1, 9, 0})
public abstract class AbstractLogger implements Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public volatile boolean isSessionStarted;

    @NotNull
    public final Object getLock() {
        return this.lock;
    }

    /* JADX INFO: renamed from: isSessionStarted, reason: from getter */
    public final boolean getIsSessionStarted() {
        return this.isSessionStarted;
    }

    @Override // com.veridas.logger.Logger
    public void log(@NotNull String tag, @NotNull String message, @NotNull Bundle params) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(params, "params");
        log(tag, message);
    }

    public final void setSessionStarted(boolean z10) {
        this.isSessionStarted = z10;
    }

    @Override // com.veridas.logger.Logger
    public void log(@NotNull String tag, @NotNull String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        log(tag, a.i(objArrCopyOf, objArrCopyOf.length, message, "format(...)"));
    }

    @Override // com.veridas.logger.Logger
    public void log(@NotNull String tag, @NotNull String message, @NotNull Bundle params, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        log(tag, a.i(objArrCopyOf, objArrCopyOf.length, message, "format(...)"), params);
    }

    @Override // com.veridas.logger.Logger
    public void log(@NotNull Logger.Tag tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        log(tag.name(), message);
    }

    @Override // com.veridas.logger.Logger
    public void log(@NotNull Logger.Tag tag, @NotNull String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
        log(tag.name(), message, Arrays.copyOf(args, args.length));
    }

    @Override // com.veridas.logger.Logger
    public void log(@NotNull Logger.Tag tag, @NotNull String message, @NotNull Bundle params) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(params, "params");
        log(tag.name(), message, params);
    }

    @Override // com.veridas.logger.Logger
    public void log(@NotNull Logger.Tag tag, @NotNull String message, @NotNull Bundle params, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(args, "args");
        log(tag.name(), message, params, Arrays.copyOf(args, args.length));
    }
}
