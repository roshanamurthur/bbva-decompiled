package com.salesforce.marketingcloud.sfmcsdk.components.logging;

import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SFMCSdkLogger.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J(\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016¨\u0006\r"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/SFMCSdkLogger;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/Logger;", "()V", "d", "", LogKeysKt.TAG, "", "lazyMsg", "Lkotlin/Function0;", "throwable", "", "e", "w", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SFMCSdkLogger extends Logger {

    @NotNull
    public static final SFMCSdkLogger INSTANCE = new SFMCSdkLogger();

    private SFMCSdkLogger() {
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.logging.Logger
    public void d(@NotNull String tag, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        d(tag, null, lazyMsg);
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.logging.Logger
    public void e(@NotNull String tag, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        e(tag, null, lazyMsg);
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.logging.Logger
    public void w(@NotNull String tag, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        w(tag, null, lazyMsg);
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.logging.Logger
    public void d(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        log$sfmcsdk_release(LogLevel.DEBUG, tag, throwable, lazyMsg);
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.logging.Logger
    public void e(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        log$sfmcsdk_release(LogLevel.ERROR, tag, throwable, lazyMsg);
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.logging.Logger
    public void w(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        log$sfmcsdk_release(LogLevel.WARN, tag, throwable, lazyMsg);
    }
}
