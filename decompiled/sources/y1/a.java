package y1;

import android.content.Context;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function0<LayoutNode> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Context f94725p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<Context, Object> f94726q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CompositionContext f94727r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistry f94728s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f94729t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, Function1<? super Context, Object> function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i10) {
        super(0);
        this.f94725p0 = context;
        this.f94726q0 = function1;
        this.f94727r0 = compositionContext;
        this.f94728s0 = saveableStateRegistry;
        this.f94729t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LayoutNode invoke() {
        return new ViewFactoryHolder(this.f94725p0, this.f94726q0, this.f94727r0, this.f94728s0, this.f94729t0).getLayoutNode();
    }
}
