package org.koin.core.logger;

import androidx.core.app.NotificationCompat;
import java.io.PrintStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrintLogger.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lorg/koin/core/logger/PrintLogger;", "Lorg/koin/core/logger/Logger;", "Lorg/koin/core/logger/Level;", "level", "", "Lorg/koin/core/logger/MESSAGE;", NotificationCompat.CATEGORY_MESSAGE, "", "display", "<init>", "(Lorg/koin/core/logger/Level;)V", "koin-core"}, k = 1, mv = {1, 8, 0})
public final class PrintLogger extends Logger {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PrintStream f92350b;

    /* JADX WARN: Multi-variable type inference failed */
    public PrintLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // org.koin.core.logger.Logger
    public void display(@NotNull Level level, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f92350b.println(Constant.BRACKET_OPEN + level + "] [Koin] " + msg);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrintLogger(@NotNull Level level) {
        super(level);
        Intrinsics.checkNotNullParameter(level, "level");
        this.f92350b = level.compareTo(Level.WARNING) >= 0 ? System.err : System.out;
    }

    public /* synthetic */ PrintLogger(Level level, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Level.INFO : level);
    }
}
