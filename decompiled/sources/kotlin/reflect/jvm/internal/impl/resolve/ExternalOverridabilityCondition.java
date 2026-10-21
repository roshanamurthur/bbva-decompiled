package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface ExternalOverridabilityCondition {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Contract {
        private static final /* synthetic */ Contract[] $VALUES;
        public static final Contract BOTH;
        public static final Contract CONFLICTS_ONLY;
        public static final Contract SUCCESS_ONLY;

        static {
            Contract contract = new Contract("CONFLICTS_ONLY", 0);
            CONFLICTS_ONLY = contract;
            Contract contract2 = new Contract("SUCCESS_ONLY", 1);
            SUCCESS_ONLY = contract2;
            Contract contract3 = new Contract("BOTH", 2);
            BOTH = contract3;
            $VALUES = new Contract[]{contract, contract2, contract3};
        }

        public Contract() {
            throw null;
        }

        public static Contract valueOf(String str) {
            return (Contract) Enum.valueOf(Contract.class, str);
        }

        public static Contract[] values() {
            return (Contract[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Result {
        private static final /* synthetic */ Result[] $VALUES;
        public static final Result CONFLICT;
        public static final Result INCOMPATIBLE;
        public static final Result OVERRIDABLE;
        public static final Result UNKNOWN;

        static {
            Result result = new Result("OVERRIDABLE", 0);
            OVERRIDABLE = result;
            Result result2 = new Result("CONFLICT", 1);
            CONFLICT = result2;
            Result result3 = new Result("INCOMPATIBLE", 2);
            INCOMPATIBLE = result3;
            Result result4 = new Result("UNKNOWN", 3);
            UNKNOWN = result4;
            $VALUES = new Result[]{result, result2, result3, result4};
        }

        public Result() {
            throw null;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    @NotNull
    Contract getContract();

    @NotNull
    Result isOverridable(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor);
}
