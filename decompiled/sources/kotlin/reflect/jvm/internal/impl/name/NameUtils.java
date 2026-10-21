package kotlin.reflect.jvm.internal.impl.name;

import com.bbva.notifications.constants.PushConstants;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NameUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class NameUtils {

    @NotNull
    public static final NameUtils INSTANCE = new NameUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Regex f81339a = new Regex("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f81340b = "$context_receiver";

    @JvmStatic
    @NotNull
    public static final Name contextReceiverName(int i10) {
        Name nameIdentifier = Name.identifier(f81340b + '_' + i10);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    @JvmStatic
    @NotNull
    public static final String sanitizeAsJavaIdentifier(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f81339a.replace(name, PushConstants.GE_PARAMS_SEPARATOR);
    }
}
