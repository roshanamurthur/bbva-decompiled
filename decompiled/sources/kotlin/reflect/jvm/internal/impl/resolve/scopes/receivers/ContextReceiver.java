package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContextReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ContextReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CallableDescriptor f81621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Name f81622c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextReceiver(@NotNull CallableDescriptor declarationDescriptor, @NotNull KotlinType receiverType, @Nullable Name name, @Nullable ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f81621b = declarationDescriptor;
        this.f81622c = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    @Nullable
    public Name getCustomLabelName() {
        return this.f81622c;
    }

    @NotNull
    public CallableDescriptor getDeclarationDescriptor() {
        return this.f81621b;
    }

    @NotNull
    public String toString() {
        return "Cxt { " + getDeclarationDescriptor() + " }";
    }
}
