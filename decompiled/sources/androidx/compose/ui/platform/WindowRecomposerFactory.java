package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.InternalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory;", "", "createRecomposer", "Landroidx/compose/runtime/Recomposer;", "windowRootView", "Landroid/view/View;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalComposeUiApi
public interface WindowRecomposerFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f17347a;

    @NotNull
    Recomposer createRecomposer(@NotNull View windowRootView);

    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR\u001d\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory$Companion;", "", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "b", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "getLifecycleAware", "()Landroidx/compose/ui/platform/WindowRecomposerFactory;", "getLifecycleAware$annotations", "()V", "LifecycleAware", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f17347a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f17348b = a.f17349a;

        /* JADX INFO: compiled from: WindowRecomposer.android.kt */
        public static final class a implements WindowRecomposerFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f17349a = new a();

            @Override // androidx.compose.ui.platform.WindowRecomposerFactory
            @NotNull
            public final Recomposer createRecomposer(@NotNull View rootView) {
                Intrinsics.checkNotNullParameter(rootView, "rootView");
                return WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer$default(rootView, null, null, 3, null);
            }
        }

        @NotNull
        public final WindowRecomposerFactory getLifecycleAware() {
            return f17348b;
        }

        public static /* synthetic */ void getLifecycleAware$annotations() {
        }
    }
}
