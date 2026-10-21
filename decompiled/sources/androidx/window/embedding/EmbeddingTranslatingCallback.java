package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EmbeddingTranslatingCallback.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\r"}, d2 = {"Landroidx/window/embedding/EmbeddingTranslatingCallback;", "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfoList", "", "accept", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "callback", "Landroidx/window/embedding/EmbeddingAdapter;", "adapter", "<init>", "(Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;Landroidx/window/embedding/EmbeddingAdapter;)V", "window_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"NewApi"})
public final class EmbeddingTranslatingCallback implements Consumer<List<? extends androidx.window.extensions.embedding.SplitInfo>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final EmbeddingInterfaceCompat.EmbeddingCallbackInterface f24128p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final EmbeddingAdapter f24129q0;

    public EmbeddingTranslatingCallback(@NotNull EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback, @NotNull EmbeddingAdapter adapter) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f24128p0 = callback;
        this.f24129q0 = adapter;
    }

    @Override // java.util.function.Consumer
    public void accept(@NotNull List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
        this.f24128p0.onSplitInfoChanged(this.f24129q0.translate(splitInfoList));
    }
}
