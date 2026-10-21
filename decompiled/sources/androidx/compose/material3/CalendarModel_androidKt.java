package androidx.compose.material3;

import android.content.res.Configuration;
import android.os.Build;
import android.text.format.DateFormat;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.os.ConfigurationCompat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CalendarModel.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0003H\u0001¨\u0006\u000b"}, d2 = {"CalendarModel", "Landroidx/compose/material3/CalendarModel;", "defaultLocale", "Ljava/util/Locale;", "(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;", "formatWithSkeleton", "", "utcTimeMillis", "", "skeleton", "locale", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCalendarModel.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModel.android.kt\nandroidx/compose/material3/CalendarModel_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,76:1\n76#2:77\n*S KotlinDebug\n*F\n+ 1 CalendarModel.android.kt\nandroidx/compose/material3/CalendarModel_androidKt\n*L\n74#1:77\n*E\n"})
public final class CalendarModel_androidKt {
    @ExperimentalMaterial3Api
    @NotNull
    public static final CalendarModel CalendarModel() {
        return Build.VERSION.SDK_INT >= 26 ? new CalendarModelImpl() : new LegacyCalendarModelImpl();
    }

    @ExperimentalMaterial3Api
    @NotNull
    @Composable
    @ReadOnlyComposable
    public static final Locale defaultLocale(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(895332416, i10, -1, "androidx.compose.material3.defaultLocale (CalendarModel.android.kt:72)");
        }
        Locale locale = ConfigurationCompat.getLocales((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).get(0);
        if (locale == null) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return locale;
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final String formatWithSkeleton(long j10, @NotNull String skeleton, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(skeleton, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String pattern = DateFormat.getBestDateTimePattern(locale, skeleton);
        if (Build.VERSION.SDK_INT >= 26) {
            CalendarModelImpl.Companion companion = CalendarModelImpl.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(pattern, "pattern");
            return companion.formatWithPattern(j10, pattern, locale);
        }
        LegacyCalendarModelImpl.Companion companion2 = LegacyCalendarModelImpl.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(pattern, "pattern");
        return companion2.formatWithPattern(j10, pattern, locale);
    }

    public static /* synthetic */ String formatWithSkeleton$default(long j10, String str, Locale locale, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "m epoch)\n * ");
        }
        return formatWithSkeleton(j10, str, locale);
    }
}
