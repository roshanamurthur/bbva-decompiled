package xk;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DescriptorResolverUtils.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends NonReportingOverrideStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ErrorReporter f94678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f94679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f94680c;

    /* JADX INFO: renamed from: xk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DescriptorResolverUtils.java */
    public class C0508a implements Function1<CallableMemberDescriptor, Unit> {
        public C0508a() {
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }
            a.this.f94678a.reportCannotInferVisibility(callableMemberDescriptor);
            return Unit.INSTANCE;
        }
    }

    public a(ErrorReporter errorReporter, LinkedHashSet linkedHashSet, boolean z10) {
        this.f94678a = errorReporter;
        this.f94679b = linkedHashSet;
        this.f94680c = z10;
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i10 == 3) {
            objArr[0] = "member";
        } else if (i10 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else if (i10 == 3 || i10 == 4) {
            objArr[2] = "setOverriddenDescriptors";
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
        OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, new C0508a());
        this.f94679b.add(callableMemberDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
    public void conflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
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

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void setOverriddenDescriptors(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Collection<? extends CallableMemberDescriptor> collection) {
        if (callableMemberDescriptor == null) {
            a(3);
            throw null;
        }
        if (collection == null) {
            a(4);
            throw null;
        }
        if (!this.f94680c || callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            super.setOverriddenDescriptors(callableMemberDescriptor, collection);
        }
    }
}
