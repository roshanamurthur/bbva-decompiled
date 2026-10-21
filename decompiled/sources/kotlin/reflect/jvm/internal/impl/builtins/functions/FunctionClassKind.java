package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FunctionClassKind.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class FunctionClassKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FunctionClassKind[] $VALUES;

    @NotNull
    public static final Companion Companion;
    public static final FunctionClassKind Function;
    public static final FunctionClassKind KFunction;
    public static final FunctionClassKind KSuspendFunction;
    public static final FunctionClassKind SuspendFunction;
    public static final FunctionClassKind UNKNOWN;

    /* JADX INFO: compiled from: FunctionClassKind.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FunctionClassKind getFunctionClassKind(@NotNull FunctionTypeKind functionTypeKind) {
            Intrinsics.checkNotNullParameter(functionTypeKind, "functionTypeKind");
            if (Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.Function.INSTANCE)) {
                return FunctionClassKind.Function;
            }
            if (Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE)) {
                return FunctionClassKind.SuspendFunction;
            }
            if (Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.KFunction.INSTANCE)) {
                return FunctionClassKind.KFunction;
            }
            return Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.KSuspendFunction.INSTANCE) ? FunctionClassKind.KSuspendFunction : FunctionClassKind.UNKNOWN;
        }
    }

    static {
        FunctionClassKind functionClassKind = new FunctionClassKind("Function", 0);
        Function = functionClassKind;
        FunctionClassKind functionClassKind2 = new FunctionClassKind("SuspendFunction", 1);
        SuspendFunction = functionClassKind2;
        FunctionClassKind functionClassKind3 = new FunctionClassKind("KFunction", 2);
        KFunction = functionClassKind3;
        FunctionClassKind functionClassKind4 = new FunctionClassKind("KSuspendFunction", 3);
        KSuspendFunction = functionClassKind4;
        FunctionClassKind functionClassKind5 = new FunctionClassKind("UNKNOWN", 4);
        UNKNOWN = functionClassKind5;
        FunctionClassKind[] functionClassKindArr = {functionClassKind, functionClassKind2, functionClassKind3, functionClassKind4, functionClassKind5};
        $VALUES = functionClassKindArr;
        $ENTRIES = EnumEntriesKt.enumEntries(functionClassKindArr);
        Companion = new Companion(null);
    }

    public FunctionClassKind() {
        throw null;
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) $VALUES.clone();
    }
}
