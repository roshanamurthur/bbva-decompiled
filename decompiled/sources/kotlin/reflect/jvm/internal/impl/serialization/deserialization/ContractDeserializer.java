package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContractDeserializer.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface ContractDeserializer {

    @NotNull
    public static final Companion Companion = Companion.f81660a;

    /* JADX INFO: compiled from: ContractDeserializer.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f81660a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final ContractDeserializer$Companion$DEFAULT$1 f81661b = new ContractDeserializer() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer$Companion$DEFAULT$1
            @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer
            @Nullable
            public Pair deserializeContractFromFunction(@NotNull ProtoBuf.Function proto, @NotNull FunctionDescriptor ownerFunction, @NotNull TypeTable typeTable, @NotNull TypeDeserializer typeDeserializer) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                Intrinsics.checkNotNullParameter(ownerFunction, "ownerFunction");
                Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
                return null;
            }
        };

        @NotNull
        public final ContractDeserializer getDEFAULT() {
            return f81661b;
        }
    }

    @Nullable
    Pair<CallableDescriptor.UserDataKey<?>, Object> deserializeContractFromFunction(@NotNull ProtoBuf.Function function, @NotNull FunctionDescriptor functionDescriptor, @NotNull TypeTable typeTable, @NotNull TypeDeserializer typeDeserializer);
}
