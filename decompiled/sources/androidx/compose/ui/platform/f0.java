package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,166:1\n63#2,5:167\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n*L\n156#1:167,5\n*E\n"})
public final class f0 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Context f17401p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 f17402q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) {
        super(1);
        this.f17401p0 = context;
        this.f17402q0 = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        DisposableEffectScope DisposableEffect = disposableEffectScope;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Context context = this.f17401p0;
        Context applicationContext = context.getApplicationContext();
        final AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 = this.f17402q0;
        applicationContext.registerComponentCallbacks(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1);
        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                context.getApplicationContext().unregisterComponentCallbacks(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1);
            }
        };
    }
}
