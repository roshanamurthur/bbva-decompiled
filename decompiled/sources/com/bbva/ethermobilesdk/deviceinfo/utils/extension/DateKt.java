package com.bbva.ethermobilesdk.deviceinfo.utils.extension;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Date.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Ljava/util/Date;", "", "asISODate", "deviceinfo_release"}, k = 2, mv = {1, 8, 0})
public final class DateKt {
    @NotNull
    public static final String asISODate(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Zulu"));
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "it.format(this)");
        return str;
    }
}
