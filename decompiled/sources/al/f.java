package al;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class f extends Lambda implements Function1<CallableMemberDescriptor, KotlinType> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ValueParameterDescriptor f265p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ValueParameterDescriptor valueParameterDescriptor) {
        super(1);
        this.f265p0 = valueParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final KotlinType invoke(@NotNull CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KotlinType type = it.getValueParameters().get(this.f265p0.getIndex()).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }
}
