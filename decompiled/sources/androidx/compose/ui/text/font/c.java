package androidx.compose.ui.text.font;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function1<TypefaceResult.Immutable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f18040p0 = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TypefaceResult.Immutable immutable) {
        TypefaceResult.Immutable it = immutable;
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
