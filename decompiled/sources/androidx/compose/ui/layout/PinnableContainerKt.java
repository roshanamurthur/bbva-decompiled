package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PinnableContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/layout/PinnableContainer;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPinnableContainer", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPinnableContainer", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class PinnableContainerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<PinnableContainer> f16642a = CompositionLocalKt.compositionLocalOf$default(null, a.f16643p0, 1, null);

    /* JADX INFO: compiled from: PinnableContainer.kt */
    public static final class a extends Lambda implements Function0<PinnableContainer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16643p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ PinnableContainer invoke() {
            return null;
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<PinnableContainer> getLocalPinnableContainer() {
        return f16642a;
    }
}
