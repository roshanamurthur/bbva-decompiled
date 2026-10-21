package com.bbva.ethermobilesdk.token.time;

import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobilesdk.token.logger.EtherTokenLoggerKt;
import com.instacart.library.truetime.TrueTime;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimeProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\nJ\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\r\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/token/time/TimeProvider;", "", "()V", "initialize", "", "initializeWith", "ntpHost", "", "initializeWith$ethertoken_release", "initializeWithNtp", "initializeWithNtp$ethertoken_release", "isInitialized", "", "isInitialized$ethertoken_release", "now", "", "nowFromDevice", "nowFromDevice$ethertoken_release", "Companion", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimeProvider {

    @NotNull
    public static final String AMAZON_NTP = "0.amazon.pool.ntp.org";

    @NotNull
    public static final String GOOGLE_NTP = "time.google.com";

    public final void initialize() {
        initializeWith$ethertoken_release("0.amazon.pool.ntp.org");
        initializeWith$ethertoken_release("time.google.com");
    }

    public final synchronized void initializeWith$ethertoken_release(@NotNull String ntpHost) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(ntpHost, "ntpHost");
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!isInitialized$ethertoken_release()) {
                EtherLogger etherLogger = EtherLogger.INSTANCE;
                EtherTokenLoggerKt.logTime$default(etherLogger, null, "syncing with " + ntpHost, 1, null);
                initializeWithNtp$ethertoken_release(ntpHost);
                EtherTokenLoggerKt.logTime$default(etherLogger, null, "synced to " + ntpHost + " after " + (Calendar.getInstance().getTimeInMillis() - timeInMillis) + " millis", 1, null);
            }
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            long timeInMillis2 = Calendar.getInstance().getTimeInMillis() - timeInMillis;
            EtherLogger etherLogger2 = EtherLogger.INSTANCE;
            EtherTokenLoggerKt.logTime$default(etherLogger2, null, "failed to sync to " + ntpHost + " after " + timeInMillis2 + " millis", 1, null);
            EtherTokenLoggerKt.logEtherTokenError(etherLogger2, thM5538exceptionOrNullimpl, TimeProvider.class);
        }
    }

    public final void initializeWithNtp$ethertoken_release(@NotNull String ntpHost) throws Exception {
        Intrinsics.checkNotNullParameter(ntpHost, "ntpHost");
        TrueTime.build().withConnectionTimeout(5000).withNtpHost(ntpHost).initialize();
    }

    public final boolean isInitialized$ethertoken_release() {
        return TrueTime.isInitialized();
    }

    public final long now() {
        if (!isInitialized$ethertoken_release()) {
            return nowFromDevice$ethertoken_release();
        }
        Date dateNow = TrueTime.now();
        return dateNow != null ? dateNow.getTime() : nowFromDevice$ethertoken_release();
    }

    public final long nowFromDevice$ethertoken_release() {
        return Calendar.getInstance().getTimeInMillis();
    }
}
