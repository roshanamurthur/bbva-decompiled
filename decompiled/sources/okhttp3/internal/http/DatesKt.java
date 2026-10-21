package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: dates.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000\"\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Ljava/util/Date;", "toHttpDateOrNull", "toHttpDateString", "", "MAX_DATE", "J", "okhttp"}, k = 2, mv = {1, 8, 0})
public final class DatesKt {
    public static final long MAX_DATE = 253402300799999L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final DatesKt$STANDARD_DATE_FORMAT$1 f85867a = new ThreadLocal<DateFormat>() { // from class: okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1
        @Override // java.lang.ThreadLocal
        @NotNull
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(Util.UTC);
            return simpleDateFormat;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String[] f85868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final DateFormat[] f85869c;

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1] */
    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f85868b = strArr;
        f85869c = new DateFormat[strArr.length];
    }

    @Nullable
    public static final Date toHttpDateOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f85867a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f85868b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    DateFormat[] dateFormatArr = f85869c;
                    DateFormat simpleDateFormat = dateFormatArr[i10];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f85868b[i10], Locale.US);
                        simpleDateFormat.setTimeZone(Util.UTC);
                        dateFormatArr[i10] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                Unit unit = Unit.INSTANCE;
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public static final String toHttpDateString(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String str = f85867a.get().format(date);
        Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
