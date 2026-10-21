package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/setIndeterminateDrawable;", "Lcom/mypinpad/tsdk/i/component22;", "", "p0", "", "p1", "", "p2", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class setIndeterminateDrawable extends component22 {
    public /* synthetic */ setIndeterminateDrawable(int i10, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : th2);
    }

    public setIndeterminateDrawable(int i10, @Nullable String str, @Nullable Throwable th2) {
        super(i10, str, th2);
    }
}
