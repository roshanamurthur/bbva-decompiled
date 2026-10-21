package com.mastercard.sonic.utils;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Vibrator;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mastercard.sonic.SonicInternalConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mastercard/sonic/utils/Utils;", "", "()V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Utils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fJ\u001e\u0010\u0013\u001a\u0002H\u0014\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0086\b¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n¨\u0006\u001b"}, d2 = {"Lcom/mastercard/sonic/utils/Utils$Companion;", "", "()V", "convertFormattedToDate", "Ljava/util/Date;", "formattedTime", "", "deviceHapticSupport", "", "context", "Landroid/content/Context;", "getCurrentTimestampInUtc", "", "getNextMonthDayOneFromTheDate", "Ljava/util/Calendar;", "calendarInstance", "getNextQuarterDayOneFromTheDate", "getTimeInFormattedString", "timeInMillis", "parseJson", ExifInterface.GPS_DIRECTION_TRUE, "json", "(Ljava/lang/String;)Ljava/lang/Object;", "removeTimeFromCalendar", "", "volumeLevel", "", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Date convertFormattedToDate(@NotNull String formattedTime) throws ParseException {
            Intrinsics.checkNotNullParameter(formattedTime, "formattedTime");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SonicInternalConstants.DEFAULT_DATETIME_FORMAT, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = simpleDateFormat.parse(formattedTime);
            Intrinsics.checkNotNull(date);
            return date;
        }

        public final boolean deviceHapticSupport(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int i10 = Build.VERSION.SDK_INT;
            Vibrator vibrator = (Vibrator) context.getSystemService(Vibrator.class);
            return i10 >= 26 && vibrator != null && vibrator.hasVibrator() && vibrator.hasAmplitudeControl();
        }

        public final long getCurrentTimestampInUtc() {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.setTime(new Date());
            return calendar.getTimeInMillis();
        }

        @NotNull
        public final Calendar getNextMonthDayOneFromTheDate(@NotNull Calendar calendarInstance) {
            Intrinsics.checkNotNullParameter(calendarInstance, "calendarInstance");
            Calendar nextMonthCalendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            nextMonthCalendar.setTime(calendarInstance.getTime());
            nextMonthCalendar.set(5, 1);
            boolean z10 = calendarInstance.get(2) == 11;
            nextMonthCalendar.set(2, z10 ? 0 : calendarInstance.get(2) + 1);
            nextMonthCalendar.set(1, z10 ? calendarInstance.get(1) + 1 : calendarInstance.get(1));
            Intrinsics.checkNotNullExpressionValue(nextMonthCalendar, "nextMonthCalendar");
            removeTimeFromCalendar(nextMonthCalendar);
            return nextMonthCalendar;
        }

        @NotNull
        public final Calendar getNextQuarterDayOneFromTheDate(@NotNull Calendar calendarInstance) {
            Intrinsics.checkNotNullParameter(calendarInstance, "calendarInstance");
            Calendar nextQuarterCalendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            nextQuarterCalendar.setTime(calendarInstance.getTime());
            nextQuarterCalendar.set(5, 1);
            boolean z10 = ((calendarInstance.get(2) / 3) * 3) + 3 > 11;
            nextQuarterCalendar.set(2, z10 ? 0 : ((calendarInstance.get(2) / 3) * 3) + 3);
            nextQuarterCalendar.set(1, z10 ? calendarInstance.get(1) + 1 : calendarInstance.get(1));
            Intrinsics.checkNotNullExpressionValue(nextQuarterCalendar, "nextQuarterCalendar");
            removeTimeFromCalendar(nextQuarterCalendar);
            return nextQuarterCalendar;
        }

        @NotNull
        public final String getTimeInFormattedString(long timeInMillis) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SonicInternalConstants.DEFAULT_DATETIME_FORMAT, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String str = simpleDateFormat.format(Long.valueOf(timeInMillis));
            Intrinsics.checkNotNullExpressionValue(str, "simpleDateFormat.format(timeInMillis)");
            return str;
        }

        public final /* synthetic */ <T> T parseJson(String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.needClassReification();
            return (T) new Gson().fromJson(json, new TypeToken<T>() { // from class: com.mastercard.sonic.utils.Utils$Companion$parseJson$type$1
            }.getType());
        }

        public final void removeTimeFromCalendar(@NotNull Calendar calendarInstance) {
            Intrinsics.checkNotNullParameter(calendarInstance, "calendarInstance");
            calendarInstance.set(11, 0);
            calendarInstance.set(12, 0);
            calendarInstance.set(13, 0);
            calendarInstance.set(14, 0);
        }

        public final int volumeLevel(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return ((AudioManager) systemService).getStreamVolume(3);
        }
    }
}
