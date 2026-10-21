package com.bbva.push.salesforce.extension;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Boolean.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"toInt", "", "", "(Ljava/lang/Boolean;)I", "salesforce-push_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BooleanKt {
    public static final int toInt(@Nullable Boolean bool) {
        return Intrinsics.areEqual(bool, Boolean.TRUE) ? 1 : 0;
    }
}
