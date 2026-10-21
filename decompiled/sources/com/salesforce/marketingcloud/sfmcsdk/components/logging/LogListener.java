package com.salesforce.marketingcloud.sfmcsdk.components.logging;

import android.util.Log;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogListener;", "", "out", "", "level", "Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogLevel;", LogKeysKt.TAG, "", "message", "throwable", "", "AndroidLogger", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface LogListener {

    /* JADX INFO: compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogListener$AndroidLogger;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogListener;", "()V", "out", "", "level", "Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogLevel;", LogKeysKt.TAG, "", "message", "throwable", "", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class AndroidLogger implements LogListener {

        /* JADX INFO: compiled from: Logger.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LogLevel.values().length];
                iArr[LogLevel.DEBUG.ordinal()] = 1;
                iArr[LogLevel.WARN.ordinal()] = 2;
                iArr[LogLevel.ERROR.ordinal()] = 3;
                iArr[LogLevel.NONE.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // com.salesforce.marketingcloud.sfmcsdk.components.logging.LogListener
        public void out(@NotNull LogLevel level, @NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            int i10 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i10 == 1 || i10 != 2) {
                return;
            }
            if (throwable == null) {
                Log.w(tag, message);
            } else {
                Log.w(tag, message, throwable);
            }
        }
    }

    void out(@NotNull LogLevel level, @NotNull String tag, @NotNull String message, @Nullable Throwable throwable);
}
