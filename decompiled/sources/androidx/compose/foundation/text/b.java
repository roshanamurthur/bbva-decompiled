package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidCursorHandle.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1<CacheDrawScope, DrawResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ long f6085p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j10) {
        super(1);
        this.f6085p0 = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
        CacheDrawScope drawWithCache = cacheDrawScope;
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float fM2344getWidthimpl = Size.m2344getWidthimpl(drawWithCache.m2200getSizeNHjbRc()) / 2.0f;
        return drawWithCache.onDrawWithContent(new a(fM2344getWidthimpl, AndroidSelectionHandles_androidKt.createHandleImage(drawWithCache, fM2344getWidthimpl), ColorFilter.Companion.m2549tintxETnrds$default(ColorFilter.INSTANCE, this.f6085p0, 0, 2, null)));
    }
}
