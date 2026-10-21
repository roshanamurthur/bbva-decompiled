package androidx.compose.foundation.text.selection;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function1<CacheDrawScope, DrawResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ long f6465p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f6466q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ResolvedTextDirection f6467r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f6468s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j10, boolean z10, ResolvedTextDirection resolvedTextDirection, boolean z11) {
        super(1);
        this.f6465p0 = j10;
        this.f6466q0 = z10;
        this.f6467r0 = resolvedTextDirection;
        this.f6468s0 = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
        CacheDrawScope drawWithCache = cacheDrawScope;
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        return drawWithCache.onDrawWithContent(new b(this.f6466q0, this.f6467r0, this.f6468s0, AndroidSelectionHandles_androidKt.createHandleImage(drawWithCache, Size.m2344getWidthimpl(drawWithCache.m2200getSizeNHjbRc()) / 2.0f), ColorFilter.Companion.m2549tintxETnrds$default(ColorFilter.INSTANCE, this.f6465p0, 0, 2, null)));
    }
}
