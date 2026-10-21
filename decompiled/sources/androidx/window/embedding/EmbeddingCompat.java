package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l3.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EmbeddingCompat.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u0012"}, d2 = {"Landroidx/window/embedding/EmbeddingCompat;", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "", "Landroidx/window/embedding/EmbeddingRule;", "rules", "", "setSplitRules", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "embeddingCallback", "setEmbeddingCallback", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "embeddingExtension", "Landroidx/window/embedding/EmbeddingAdapter;", "adapter", "<init>", "(Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;Landroidx/window/embedding/EmbeddingAdapter;)V", "()V", "Companion", "window_release"}, k = 1, mv = {1, 6, 0})
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final boolean DEBUG = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ActivityEmbeddingComponent f24126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final EmbeddingAdapter f24127b;

    /* JADX INFO: compiled from: EmbeddingCompat.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\r\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/window/embedding/EmbeddingCompat$Companion;", "", "()V", "DEBUG", "", "TAG", "", "embeddingComponent", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "getExtensionApiLevel", "", "()Ljava/lang/Integer;", "isEmbeddingAvailable", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActivityEmbeddingComponent embeddingComponent() {
            if (!isEmbeddingAvailable()) {
                return new f();
            }
            ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
            return activityEmbeddingComponent == null ? new f() : activityEmbeddingComponent;
        }

        @Nullable
        public final Integer getExtensionApiLevel() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public final boolean isEmbeddingAvailable() {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return false;
            }
        }
    }

    public EmbeddingCompat(@NotNull ActivityEmbeddingComponent embeddingExtension, @NotNull EmbeddingAdapter adapter) {
        Intrinsics.checkNotNullParameter(embeddingExtension, "embeddingExtension");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f24126a = embeddingExtension;
        this.f24127b = adapter;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setEmbeddingCallback(@NotNull EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallback) {
        Intrinsics.checkNotNullParameter(embeddingCallback, "embeddingCallback");
        this.f24126a.setSplitInfoCallback(new EmbeddingTranslatingCallback(embeddingCallback, this.f24127b));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setSplitRules(@NotNull Set<? extends EmbeddingRule> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f24126a.setEmbeddingRules(this.f24127b.translate(rules));
    }

    public EmbeddingCompat() {
        this(INSTANCE.embeddingComponent(), new EmbeddingAdapter());
    }
}
