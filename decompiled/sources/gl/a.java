package gl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a extends FunctionReference implements Function1<ProtoBuf.Type, SimpleType> {
    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "simpleType";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @NotNull
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(Intrinsics.Kotlin.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @NotNull
    public final String getSignature() {
        return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final SimpleType invoke(@NotNull ProtoBuf.Type p4) {
        Intrinsics.checkNotNullParameter(p4, "p0");
        return TypeDeserializer.simpleType$default((TypeDeserializer) this.receiver, p4, false, 2, null);
    }
}
