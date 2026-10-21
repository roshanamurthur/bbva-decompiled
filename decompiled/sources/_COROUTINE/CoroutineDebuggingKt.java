package _COROUTINE;

import androidx.camera.core.processing.f;
import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CoroutineDebugging.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "ARTIFICIAL_FRAME_PACKAGE_NAME", "Ljava/lang/String;", "getARTIFICIAL_FRAME_PACKAGE_NAME", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoroutineDebugging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineDebugging.kt\n_COROUTINE/CoroutineDebuggingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class CoroutineDebuggingKt {
    public static final StackTraceElement access$artificialFrame(Throwable th2, String str) {
        StackTraceElement stackTraceElement = th2.getStackTrace()[0];
        return new StackTraceElement(f.d("_COROUTINE.", str), PushConstants.GE_PARAMS_SEPARATOR, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    @NotNull
    public static final String getARTIFICIAL_FRAME_PACKAGE_NAME() {
        return "_COROUTINE";
    }
}
