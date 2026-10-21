package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DescriptorVisibility.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Visibility f80197a;

    public DelegatedDescriptorVisibility(@NotNull Visibility delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f80197a = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    public Visibility getDelegate() {
        return this.f80197a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    public String getInternalDisplayName() {
        return getDelegate().getInternalDisplayName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    public DescriptorVisibility normalize() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.toDescriptorVisibility(getDelegate().normalize());
        Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "toDescriptorVisibility(...)");
        return descriptorVisibility;
    }
}
