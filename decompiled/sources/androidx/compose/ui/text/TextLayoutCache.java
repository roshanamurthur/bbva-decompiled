package androidx.compose.ui.text;

import androidx.compose.ui.text.caches.LruCache;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextMeasurer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "Landroidx/compose/ui/text/TextLayoutInput;", "key", "Landroidx/compose/ui/text/TextLayoutResult;", "get", "value", PutCommand.ID, RemoveCommand.ID, "", "capacity", "<init>", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TextLayoutCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LruCache<CacheTextLayoutInput, TextLayoutResult> f17745a;

    public TextLayoutCache() {
        this(0, 1, null);
    }

    @Nullable
    public final TextLayoutResult get(@NotNull TextLayoutInput key) {
        Intrinsics.checkNotNullParameter(key, "key");
        TextLayoutResult textLayoutResult = this.f17745a.get(new CacheTextLayoutInput(key));
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    @Nullable
    public final TextLayoutResult put(@NotNull TextLayoutInput key, @NotNull TextLayoutResult value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f17745a.put(new CacheTextLayoutInput(key), value);
    }

    @Nullable
    public final TextLayoutResult remove(@NotNull TextLayoutInput key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f17745a.remove(new CacheTextLayoutInput(key));
    }

    public TextLayoutCache(int i10) {
        this.f17745a = new LruCache<>(i10);
    }

    public /* synthetic */ TextLayoutCache(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? TextMeasurerKt.access$getDefaultCacheSize$p() : i10);
    }
}
