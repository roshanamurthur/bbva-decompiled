package wk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractAnnotationTypeQualifierResolver.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function1<Object, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f94284p0 = new a(1);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Object extractNullability) {
        Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
        return Boolean.FALSE;
    }
}
