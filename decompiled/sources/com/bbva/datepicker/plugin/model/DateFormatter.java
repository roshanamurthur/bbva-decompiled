package com.bbva.datepicker.plugin.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DateFormatter.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/datepicker/plugin/model/DateFormatter;", "", "Ljava/util/Date;", "value", "", "dateToString", "", "default", "toDate", "b", "Ljava/lang/String;", "getFormat", "()Ljava/lang/String;", "format", "<init>", "(Ljava/lang/String;)V", "datepicker-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class DateFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f29008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String format;

    /* JADX WARN: Multi-variable type inference failed */
    public DateFormatter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String dateToString(@NotNull Date value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String str = this.f29008a.format(value);
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(value)");
        return str;
    }

    @NotNull
    public final String getFormat() {
        return this.format;
    }

    public final long toDate(@Nullable String value, long j10) throws ParseException {
        Date date;
        return (value == null || value.length() == 0 || (date = this.f29008a.parse(value)) == null) ? j10 : date.getTime();
    }

    public DateFormatter(@NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.format = format;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.getDefault());
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Unit unit = Unit.INSTANCE;
        this.f29008a = simpleDateFormat;
    }

    public /* synthetic */ DateFormatter(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "yyyy-MM-dd" : str);
    }
}
