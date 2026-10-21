package com.mypinpad.tsdk.api.callbacks;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/TerminalCreationFailure;", "", "Lcom/mypinpad/tsdk/api/callbacks/TerminalCreationFailureCause;", "getCause", "()Lcom/mypinpad/tsdk/api/callbacks/TerminalCreationFailureCause;", "cause", "", "getException", "()Ljava/lang/Throwable;", "exception"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TerminalCreationFailure {
    @JvmName(name = "getCause")
    @NotNull
    TerminalCreationFailureCause getCause();

    @JvmName(name = "getException")
    @Nullable
    Throwable getException();
}
