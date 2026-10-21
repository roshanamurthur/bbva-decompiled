package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnumEntrySyntheticClassDescriptor.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends NonReportingOverrideStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f80402a;

    public a(LinkedHashSet linkedHashSet) {
        this.f80402a = linkedHashSet;
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void addFakeOverride(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            a(0);
            throw null;
        }
        OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
        this.f80402a.add(callableMemberDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
    public final void conflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
        if (callableMemberDescriptor == null) {
            a(1);
            throw null;
        }
        if (callableMemberDescriptor2 != null) {
            return;
        }
        a(2);
        throw null;
    }
}
