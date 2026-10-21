package com.veridas.lang;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AggregateException.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/veridas/lang/AggregateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "", "p0", "Ljava/util/List;", "getExceptions", "()Ljava/util/List;", "exceptions", "<init>", "(Ljava/util/List;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class AggregateException extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Throwable> exceptions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AggregateException(@NotNull List<? extends Throwable> exceptions) {
        super("One or more exceptions have occurred.");
        Intrinsics.checkNotNullParameter(exceptions, "exceptions");
        this.exceptions = exceptions;
    }

    @NotNull
    public final List<Throwable> getExceptions() {
        return this.exceptions;
    }
}
