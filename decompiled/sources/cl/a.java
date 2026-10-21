package cl;

import androidx.webkit.ProxyConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DescriptorRendererImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function1<TypeProjection, CharSequence> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DescriptorRendererImpl f25450p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.f25450p0 = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull TypeProjection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isStarProjection()) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        KotlinType type = it.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        String strRenderType = this.f25450p0.renderType(type);
        if (it.getProjectionKind() == Variance.INVARIANT) {
            return strRenderType;
        }
        return it.getProjectionKind() + ' ' + strRenderType;
    }
}
