package org.koin.core.logger;

import androidx.core.app.NotificationCompat;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.mastercard.mpsdk.mcbp.mcmlite.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H&J\u0015\u0010\t\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0086\bJ\u0015\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0086\bJ\u0015\u0010\u000b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0086\bJ\u0015\u0010\f\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0086\bJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002J\u0019\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\bJ\"\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0086\bø\u0001\u0000R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Lorg/koin/core/logger/Logger;", "", "Lorg/koin/core/logger/Level;", "level", "", "Lorg/koin/core/logger/MESSAGE;", NotificationCompat.CATEGORY_MESSAGE, "", "display", BuildConfig.BUILD_TYPE, "info", "warn", "error", "lvl", "", "isAt", LogKeysKt.LOG, "Lkotlin/Function0;", "a", "Lorg/koin/core/logger/Level;", "getLevel", "()Lorg/koin/core/logger/Level;", "setLevel", "(Lorg/koin/core/logger/Level;)V", "<init>", "koin-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\norg/koin/core/logger/Logger\n*L\n1#1,60:1\n46#1,2:61\n46#1,2:63\n46#1,2:65\n46#1,2:67\n*S KotlinDebug\n*F\n+ 1 Logger.kt\norg/koin/core/logger/Logger\n*L\n28#1:61,2\n32#1:63,2\n36#1:65,2\n40#1:67,2\n*E\n"})
public abstract class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Level level;

    /* JADX WARN: Multi-variable type inference failed */
    public Logger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void debug(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Level level = Level.DEBUG;
        if (isAt(level)) {
            display(level, msg);
        }
    }

    public abstract void display(@NotNull Level level, @NotNull String msg);

    public final void error(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Level level = Level.ERROR;
        if (isAt(level)) {
            display(level, msg);
        }
    }

    @NotNull
    public final Level getLevel() {
        return this.level;
    }

    public final void info(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Level level = Level.INFO;
        if (isAt(level)) {
            display(level, msg);
        }
    }

    public final boolean isAt(@NotNull Level lvl) {
        Intrinsics.checkNotNullParameter(lvl, "lvl");
        return this.level.compareTo(lvl) <= 0;
    }

    public final void log(@NotNull Level lvl, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(lvl, "lvl");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (isAt(lvl)) {
            display(lvl, msg);
        }
    }

    public final void setLevel(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "<set-?>");
        this.level = level;
    }

    public final void warn(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Level level = Level.WARNING;
        if (isAt(level)) {
            display(level, msg);
        }
    }

    public Logger(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.level = level;
    }

    public final void log(@NotNull Level lvl, @NotNull Function0<String> msg) {
        Intrinsics.checkNotNullParameter(lvl, "lvl");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (isAt(lvl)) {
            display(lvl, msg.invoke());
        }
    }

    public /* synthetic */ Logger(Level level, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Level.INFO : level);
    }
}
