package el;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function1<KotlinType, CharSequence> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f68365p0 = new a(1);

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull KotlinType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }
}
