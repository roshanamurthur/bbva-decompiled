package com.bbva.cells.componentkit.tracking;

import bk.q;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Tracker.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bbva/cells/componentkit/tracking/TrackingEvent;", "", "", "", "toMap", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getType", "()I", "type", "<init>", "(Ljava/lang/String;I)V", "componentkit_release"}, k = 1, mv = {1, 6, 0})
public class TrackingEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int type;

    public TrackingEvent(@NotNull String id, int i10) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.type = i10;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final Map<String, Object> toMap() {
        return q.mapOf(TuplesKt.to("id", this.id), TuplesKt.to("type", Integer.valueOf(this.type)));
    }
}
