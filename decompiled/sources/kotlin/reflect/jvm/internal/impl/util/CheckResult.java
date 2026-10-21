package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class CheckResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82066a;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class IllegalFunctionName extends CheckResult {

        @NotNull
        public static final IllegalFunctionName INSTANCE = new IllegalFunctionName();

        public IllegalFunctionName() {
            super(false, null);
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class IllegalSignature extends CheckResult {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalSignature(@NotNull String error) {
            super(false, null);
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class SuccessCheck extends CheckResult {

        @NotNull
        public static final SuccessCheck INSTANCE = new SuccessCheck();

        public SuccessCheck() {
            super(true, null);
        }
    }

    public CheckResult(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this.f82066a = z10;
    }

    public final boolean isSuccess() {
        return this.f82066a;
    }
}
