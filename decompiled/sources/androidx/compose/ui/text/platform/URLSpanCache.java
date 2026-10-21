package androidx.compose.ui.text.platform;

import android.text.style.URLSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.UrlAnnotation;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: URLSpanCache.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/platform/URLSpanCache;", "", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "Landroid/text/style/URLSpan;", "toURLSpan", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@InternalTextApi
@SourceDebugExtension({"SMAP\nURLSpanCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLSpanCache.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,46:1\n361#2,7:47\n*S KotlinDebug\n*F\n+ 1 URLSpanCache.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n*L\n45#1:47,7\n*E\n"})
public final class URLSpanCache {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WeakHashMap<UrlAnnotation, URLSpan> f18211a = new WeakHashMap<>();

    @NotNull
    public final URLSpan toURLSpan(@NotNull UrlAnnotation urlAnnotation) {
        Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
        WeakHashMap<UrlAnnotation, URLSpan> weakHashMap = this.f18211a;
        URLSpan uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return uRLSpan;
    }
}
