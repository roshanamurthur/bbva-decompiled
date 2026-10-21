package mx.openpay.library.domain.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CalendarUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/domain/util/CalendarUtils;", "", "", "getTodayDateFormatted", "<init>", "()V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class CalendarUtils {

    @NotNull
    public static final CalendarUtils INSTANCE = new CalendarUtils();

    @NotNull
    public final String getTodayDateFormatted() {
        String str = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(Calendar.getInstance().getTime());
        Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(DATE_FO…()).format(calendar.time)");
        return str;
    }
}
