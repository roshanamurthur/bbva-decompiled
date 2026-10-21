package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JvmBuiltInsCustomizerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Name f80188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Name f80189b;

    static {
        Name nameIdentifier = Name.identifier("getFirst");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        f80188a = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("getLast");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        f80189b = nameIdentifier2;
    }
}
