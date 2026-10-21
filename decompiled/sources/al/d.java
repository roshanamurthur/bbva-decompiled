package al;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d extends Lambda implements Function1<CallableMemberDescriptor, KotlinType> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d f263p0 = new d(1);

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final KotlinType invoke(@NotNull CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ReceiverParameterDescriptor extensionReceiverParameter = it.getExtensionReceiverParameter();
        Intrinsics.checkNotNull(extensionReceiverParameter);
        KotlinType type = extensionReceiverParameter.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }
}
