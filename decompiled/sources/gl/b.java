package gl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b extends FunctionReference implements Function1<Name, SimpleType> {
    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "getValueClassPropertyType";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @NotNull
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(DeserializedClassDescriptor.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @NotNull
    public final String getSignature() {
        return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final SimpleType invoke(@NotNull Name p4) {
        Intrinsics.checkNotNullParameter(p4, "p0");
        return ((DeserializedClassDescriptor) this.receiver).c(p4);
    }
}
