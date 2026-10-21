package kotlin.reflect.jvm.internal.impl.util;

import androidx.appcompat.widget.o1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class ValueParameterCountCheck implements Check {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f82092a;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class AtLeast extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f82093b;

        /* JADX WARN: Illegal instructions before constructor call */
        public AtLeast(int i10) {
            StringBuilder sbC = o1.c("must have at least ", i10, " value parameter");
            sbC.append(i10 > 1 ? "s" : "");
            super(sbC.toString(), null);
            this.f82093b = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() >= this.f82093b;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class Equals extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f82094b;

        public Equals(int i10) {
            super(androidx.camera.core.impl.utils.b.a("must have exactly ", i10, " value parameters"), null);
            this.f82094b = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == this.f82094b;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class NoValueParameters extends ValueParameterCountCheck {

        @NotNull
        public static final NoValueParameters INSTANCE = new NoValueParameters();

        public NoValueParameters() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().isEmpty();
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class SingleValueParameter extends ValueParameterCountCheck {

        @NotNull
        public static final SingleValueParameter INSTANCE = new SingleValueParameter();

        public SingleValueParameter() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == 1;
        }
    }

    public ValueParameterCountCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f82092a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.f82092a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
