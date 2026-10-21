package com.bbva.glomo.semaas.data;

import com.bbva.glomo.securesharing.SecureSharingConstantsKt;
import com.bbva.glomo.semaas.span.SpanIdProvider;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomoutils.time.TimeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemaasInterceptorDataProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomo/semaas/data/SemaasInterceptorDataProvider;", "", "Lcom/bbva/glomoutils/time/TimeProvider;", "c", "Lcom/bbva/glomoutils/time/TimeProvider;", "getClock", "()Lcom/bbva/glomoutils/time/TimeProvider;", "clock", "", "getTraceId", "()Ljava/lang/String;", "traceId", "getSpanId", "spanId", "Lcom/bbva/glomo/semaas/span/SpanIdProvider;", "spanIdProvider", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/semaas/span/SpanIdProvider;Lcom/bbva/glomo/storage/MainStorage;)V", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0})
public final class SemaasInterceptorDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SpanIdProvider f30752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MainStorage f30753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TimeProvider clock;

    public SemaasInterceptorDataProvider(@NotNull SpanIdProvider spanIdProvider, @NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(spanIdProvider, "spanIdProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30752a = spanIdProvider;
        this.f30753b = storage;
        this.clock = new TimeProvider();
    }

    @NotNull
    public final TimeProvider getClock() {
        return this.clock;
    }

    @NotNull
    public final String getSpanId() {
        return this.f30752a.getSpanId();
    }

    @NotNull
    public final String getTraceId() {
        String string$default = MainStorage.getString$default(this.f30753b, SecureSharingConstantsKt.KEY_CUSTOMER_BIOCATCH, null, false, TargetStorage.Shared, 6, null);
        return string$default == null ? "" : string$default;
    }
}
