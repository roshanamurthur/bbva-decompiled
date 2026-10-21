package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,138:1\n63#2,5:139\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2\n*L\n109#1:139,5\n*E\n"})
public final class e extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory.a f5085p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LazyLayoutItemContentFactory.a aVar) {
        super(1);
        this.f5085p0 = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        DisposableEffectScope DisposableEffect = disposableEffectScope;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LazyLayoutItemContentFactory.a aVar = this.f5085p0;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                aVar.f4979d = null;
            }
        };
    }
}
