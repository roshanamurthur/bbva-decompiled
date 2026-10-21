package cl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DescriptorRendererImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c extends Lambda implements Function1<KotlinType, CharSequence> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DescriptorRendererImpl f25452p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.f25452p0 = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(KotlinType kotlinType) {
        Intrinsics.checkNotNull(kotlinType);
        return this.f25452p0.renderType(kotlinType);
    }
}
