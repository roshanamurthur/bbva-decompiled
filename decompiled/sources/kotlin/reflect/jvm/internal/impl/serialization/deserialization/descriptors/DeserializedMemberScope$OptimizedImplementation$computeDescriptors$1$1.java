package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeserializedMemberScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1\n*L\n1#1,512:1\n*E\n"})
public final class DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Parser f81816p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ByteArrayInputStream f81817q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ DeserializedMemberScope f81818r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(Parser parser, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.f81816p0 = parser;
        this.f81817q0 = byteArrayInputStream;
        this.f81818r0 = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final MessageLite invoke() {
        return (MessageLite) this.f81816p0.parseDelimitedFrom(this.f81817q0, this.f81818r0.getC().getComponents().getExtensionRegistryLite());
    }
}
