package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setOnGroupExpandListener;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "p0", "<init>", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setOnGroupExpandListener extends RuntimeException {
    public setOnGroupExpandListener(@Nullable Throwable th2) {
        super(th2);
    }

    public /* synthetic */ setOnGroupExpandListener(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setOnGroupExpandListener() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
