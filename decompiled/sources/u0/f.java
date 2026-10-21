package u0;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f {
    public static boolean a(Modifier.Element element, @NotNull Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(element)).booleanValue();
    }

    public static boolean b(Modifier.Element element, @NotNull Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(element)).booleanValue();
    }

    public static Object c(Modifier.Element element, Object obj, @NotNull Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, element);
    }

    public static Object d(Modifier.Element element, Object obj, @NotNull Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(element, obj);
    }
}
