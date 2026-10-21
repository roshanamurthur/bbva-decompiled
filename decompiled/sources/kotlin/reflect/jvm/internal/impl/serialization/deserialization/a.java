package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MemberDeserializer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MemberDeserializer f81757p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MessageLite f81758q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ AnnotatedCallableKind f81759r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        super(0);
        this.f81757p0 = memberDeserializer;
        this.f81758q0 = messageLite;
        this.f81759r0 = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<? extends AnnotationDescriptor> invoke() {
        MemberDeserializer memberDeserializer = this.f81757p0;
        ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.f81703a.getContainingDeclaration());
        List<AnnotationDescriptor> listLoadExtensionReceiverParameterAnnotations = protoContainerA != null ? memberDeserializer.f81703a.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(protoContainerA, this.f81758q0, this.f81759r0) : null;
        return listLoadExtensionReceiverParameterAnnotations == null ? CollectionsKt__CollectionsKt.emptyList() : listLoadExtensionReceiverParameterAnnotations;
    }
}
