package org.koin.android.logger;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.logger.LoggerKt;

/* JADX INFO: compiled from: AndroidLogger.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016¨\u0006\n"}, d2 = {"Lorg/koin/android/logger/AndroidLogger;", "Lorg/koin/core/logger/Logger;", "level", "Lorg/koin/core/logger/Level;", "(Lorg/koin/core/logger/Level;)V", "display", "", NotificationCompat.CATEGORY_MESSAGE, "", "Lorg/koin/core/logger/MESSAGE;", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AndroidLogger extends Logger {

    /* JADX INFO: compiled from: AndroidLogger.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Level.values().length];
            try {
                iArr[Level.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Level.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Level.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Level.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // org.koin.core.logger.Logger
    public void display(@NotNull Level level, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (WhenMappings.$EnumSwitchMapping$0[level.ordinal()] != 3) {
            return;
        }
        Log.w(LoggerKt.KOIN_TAG, msg);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLogger(@NotNull Level level) {
        super(level);
        Intrinsics.checkNotNullParameter(level, "level");
    }

    public /* synthetic */ AndroidLogger(Level level, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Level.INFO : level);
    }
}
