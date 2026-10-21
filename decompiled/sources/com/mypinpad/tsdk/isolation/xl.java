package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/xl;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class xl extends Exception {

    @NotNull
    public static final xl INSTANCE = new xl();

    static {
        int i10 = 1 + 65;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
    }

    private xl() {
    }
}
