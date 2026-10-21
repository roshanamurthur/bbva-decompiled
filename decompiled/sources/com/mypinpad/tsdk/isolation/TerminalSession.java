package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/TerminalSession;", "", "Lcom/mypinpad/tsdk/i/getPinPadConfiguration;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/getPinPadConfiguration;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TerminalSession {

    @NotNull
    public static final TerminalSession INSTANCE = new TerminalSession();

    static {
        int i10 = (1 - (-96)) - 1;
        int i11 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @NotNull
    public static getPinPadConfiguration setCompoundDrawableTintBlendMode() {
        return (getPinPadConfiguration) setX(new Object[0], 1006508601, -1006508601, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return new setFilterText();
    }
}
