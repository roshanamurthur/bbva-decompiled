package com.bbva.push.salesforce.extension;

import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Date.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"timeToString", "", "Ljava/util/Date;", "salesforce-push_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DateKt {
    @NotNull
    public static final String timeToString(@Nullable Date date) {
        return String.valueOf(date != null ? date.getTime() : 0L);
    }
}
