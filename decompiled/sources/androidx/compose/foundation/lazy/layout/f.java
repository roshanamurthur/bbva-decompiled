package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,138:1\n169#2,9:139\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1\n*L\n100#1:139,9\n*E\n"})
public final class f extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory f5086p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory.a f5087q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutItemContentFactory.a aVar) {
        super(2);
        this.f5086p0 = lazyLayoutItemContentFactory;
        this.f5087q0 = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1403994769, iIntValue, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:90)");
            }
            LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.f5086p0;
            LazyLayoutItemProvider lazyLayoutItemProviderInvoke = lazyLayoutItemContentFactory.getItemProvider().invoke();
            LazyLayoutItemContentFactory.a aVar = this.f5087q0;
            int index = aVar.f4978c;
            int itemCount = lazyLayoutItemProviderInvoke.getItemCount();
            Object obj = aVar.f4976a;
            if ((index >= itemCount || !Intrinsics.areEqual(lazyLayoutItemProviderInvoke.getKey(index), obj)) && (index = lazyLayoutItemProviderInvoke.getIndex(obj)) != -1) {
                aVar.f4978c = index;
            }
            boolean z10 = index != -1;
            composer2.startReusableGroup(207, Boolean.valueOf(z10));
            boolean zChanged = composer2.changed(z10);
            if (z10) {
                LazyLayoutItemContentFactoryKt.m402access$SkippableItemJVlU9Rs(lazyLayoutItemProviderInvoke, lazyLayoutItemContentFactory.f4972a, index, aVar.f4976a, composer2, 0);
            } else {
                composer2.deactivateToEndGroup(zChanged);
            }
            composer2.endReusableGroup();
            EffectsKt.DisposableEffect(obj, new e(aVar), composer2, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
