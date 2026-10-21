package ak;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import kotlin.SinceKotlin;
import kotlin.internal.HidesMembers;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes12.dex */
public class b {
    @SinceKotlin(version = "1.1")
    @HidesMembers
    public static void addSuppressed(@NotNull Throwable th2, @NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (th2 != exception) {
            PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(th2, exception);
        }
    }

    @NotNull
    public static final StackTraceElement[] getStackTrace(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNull(stackTrace);
        return stackTrace;
    }

    @NotNull
    public static final List<Throwable> getSuppressedExceptions(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        return PlatformImplementationsKt.IMPLEMENTATIONS.getSuppressed(th2);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static String stackTraceToString(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ void getStackTrace$annotations(Throwable th2) {
    }

    @SinceKotlin(version = "1.4")
    public static /* synthetic */ void getSuppressedExceptions$annotations(Throwable th2) {
    }
}
