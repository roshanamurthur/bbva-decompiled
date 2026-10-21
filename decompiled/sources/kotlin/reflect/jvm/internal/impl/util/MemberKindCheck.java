package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class MemberKindCheck implements Check {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f82075a;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class Member extends MemberKindCheck {

        @NotNull
        public static final Member INSTANCE = new Member();

        public Member() {
            super("must be a member function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getDispatchReceiverParameter() != null;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class MemberOrExtension extends MemberKindCheck {

        @NotNull
        public static final MemberOrExtension INSTANCE = new MemberOrExtension();

        public MemberOrExtension() {
            super("must be a member or an extension function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.getDispatchReceiverParameter() == null && functionDescriptor.getExtensionReceiverParameter() == null) ? false : true;
        }
    }

    public MemberKindCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f82075a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.f82075a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
