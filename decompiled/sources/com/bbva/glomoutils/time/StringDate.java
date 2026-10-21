package com.bbva.glomoutils.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringDate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomoutils/time/StringDate;", "", "()V", "SIMPLE_FORMAT", "", "getToday", "format", "gl-utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StringDate {

    @NotNull
    public static final StringDate INSTANCE = new StringDate();

    @NotNull
    public static final String SIMPLE_FORMAT = "yyyy-MM-dd";

    public static /* synthetic */ String getToday$default(StringDate stringDate, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "yyyy-MM-dd";
        }
        return stringDate.getToday(str);
    }

    @NotNull
    public final String getToday(@NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = new SimpleDateFormat(format, Locale.getDefault()).format(Calendar.getInstance().getTime());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
