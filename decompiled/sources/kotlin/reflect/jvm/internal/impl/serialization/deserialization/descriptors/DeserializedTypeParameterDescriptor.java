package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import bk.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeserializedTypeParameterDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nDeserializedTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedTypeParameterDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1549#2:59\n1620#2,3:60\n*S KotlinDebug\n*F\n+ 1 DeserializedTypeParameterDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedTypeParameterDescriptor\n*L\n51#1:59\n51#1:60,3\n*E\n"})
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    @NotNull
    public final DeserializationContext E0;

    @NotNull
    public final ProtoBuf.TypeParameter F0;

    @NotNull
    public final DeserializedAnnotations G0;

    /* JADX INFO: compiled from: DeserializedTypeParameterDescriptor.kt */
    public static final class a extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends AnnotationDescriptor> invoke() {
            DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor = DeserializedTypeParameterDescriptor.this;
            return CollectionsKt___CollectionsKt.toList(deserializedTypeParameterDescriptor.E0.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(deserializedTypeParameterDescriptor.getProto(), deserializedTypeParameterDescriptor.E0.getNameResolver()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(@NotNull DeserializationContext c10, @NotNull ProtoBuf.TypeParameter proto, int i10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(proto, "proto");
        StorageManager storageManager = c10.getStorageManager();
        DeclarationDescriptor containingDeclaration = c10.getContainingDeclaration();
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = NameResolverUtilKt.getName(c10.getNameResolver(), proto.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.TypeParameter.Variance variance = proto.getVariance();
        Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
        super(storageManager, containingDeclaration, empty, name, protoEnumFlags.variance(variance), proto.getReified(), i10, SourceElement.NO_SOURCE, SupertypeLoopChecker.EMPTY.INSTANCE);
        this.E0 = c10;
        this.F0 = proto;
        this.G0 = new DeserializedAnnotations(c10.getStorageManager(), new a());
    }

    @NotNull
    public final ProtoBuf.TypeParameter getProto() {
        return this.F0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List<KotlinType> resolveUpperBounds() {
        DeserializationContext deserializationContext = this.E0;
        List<ProtoBuf.Type> listUpperBounds = ProtoTypeTableUtilKt.upperBounds(this.F0, deserializationContext.getTypeTable());
        if (listUpperBounds.isEmpty()) {
            return d.listOf(DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        List<ProtoBuf.Type> list = listUpperBounds;
        TypeDeserializer typeDeserializer = deserializationContext.getTypeDeserializer();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializer.type((ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public DeserializedAnnotations getAnnotations() {
        return this.G0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: reportSupertypeLoopError, reason: merged with bridge method [inline-methods] */
    public Void mo5780reportSupertypeLoopError(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
