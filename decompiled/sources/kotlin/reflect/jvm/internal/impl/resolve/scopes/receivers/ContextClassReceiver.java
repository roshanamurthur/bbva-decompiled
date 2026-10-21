package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContextClassReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ContextClassReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ClassDescriptor f81619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Name f81620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextClassReceiver(@NotNull ClassDescriptor classDescriptor, @NotNull KotlinType receiverType, @Nullable Name name, @Nullable ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f81619b = classDescriptor;
        this.f81620c = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    @Nullable
    public Name getCustomLabelName() {
        return this.f81620c;
    }

    @NotNull
    public String toString() {
        return getType() + ": Ctx { " + this.f81619b + " }";
    }
}
