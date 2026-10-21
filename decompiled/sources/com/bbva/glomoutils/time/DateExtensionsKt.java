package com.bbva.glomoutils.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DateExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0001\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\t\u001a\u0014\u0010\b\u001a\u00020\u0005*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001\u001a\u0011\u0010\n\u001a\u00020\u0003*\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"FORMAT_YYYY_MM_DD", "", "ONE_SECOND_AS_MILLIS", "", "now", "Ljava/util/Date;", "asString", "pattern", "toDate", "", "toMillis", "", "(Ljava/lang/Double;)I", "gl-utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DateExtensionsKt {

    @NotNull
    public static final String FORMAT_YYYY_MM_DD = "yyyy/MM/dd";
    public static final int ONE_SECOND_AS_MILLIS = 1000;

    @NotNull
    public static final String asString(@NotNull Date date, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        String str = new SimpleDateFormat(pattern, Locale.getDefault()).format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static /* synthetic */ String asString$default(Date date, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "yyyy/MM/dd";
        }
        return asString(date, str);
    }

    @NotNull
    public static final Date now() {
        return new Date();
    }

    @NotNull
    public static final Date toDate(@NotNull String str, @NotNull String pattern) throws ParseException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Date date = new SimpleDateFormat(pattern, Locale.getDefault()).parse(str);
        Intrinsics.checkNotNull(date);
        return date;
    }

    public static /* synthetic */ Date toDate$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "yyyy/MM/dd";
        }
        return toDate(str, str2);
    }

    public static final int toMillis(@Nullable Double d2) {
        if (d2 != null) {
            return ((int) d2.doubleValue()) * 1000;
        }
        return 0;
    }

    @NotNull
    public static final Date toDate(long j10) {
        return new Date(j10);
    }
}
