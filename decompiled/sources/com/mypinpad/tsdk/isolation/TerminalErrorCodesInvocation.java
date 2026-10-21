package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/TerminalErrorCodesInvocation;", "Lcom/mypinpad/tsdk/i/setFastScrollAlwaysVisible;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TerminalErrorCodesInvocation extends setFastScrollAlwaysVisible {

    @NotNull
    public static final TerminalErrorCodesInvocation INSTANCE = new TerminalErrorCodesInvocation();

    static {
        int i10 = (((1 | 74) << 1) - (1 ^ 74)) - 1;
        int i11 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public TerminalErrorCodesInvocation() {
        super(null);
    }
}
