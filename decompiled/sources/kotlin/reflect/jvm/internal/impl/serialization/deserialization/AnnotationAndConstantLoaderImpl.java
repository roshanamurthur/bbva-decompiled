package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnnotationAndConstantLoaderImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAnnotationAndConstantLoaderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationAndConstantLoaderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n1549#2:144\n1620#2,3:145\n1549#2:148\n1620#2,3:149\n1549#2:153\n1620#2,3:154\n1549#2:157\n1620#2,3:158\n1549#2:161\n1620#2,3:162\n1549#2:165\n1620#2,3:166\n1549#2:169\n1620#2,3:170\n1549#2:173\n1620#2,3:174\n1549#2:177\n1620#2,3:178\n1#3:152\n*S KotlinDebug\n*F\n+ 1 AnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationAndConstantLoaderImpl\n*L\n39#1:144\n39#1:145,3\n62#1:148\n62#1:149,3\n69#1:153\n69#1:154,3\n76#1:157\n76#1:158,3\n83#1:161\n83#1:162,3\n96#1:165\n96#1:166,3\n116#1:169\n116#1:170,3\n122#1:173\n122#1:174,3\n126#1:177\n126#1:178,3\n*E\n"})
public final class AnnotationAndConstantLoaderImpl implements AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SerializerExtensionProtocol f81646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AnnotationDeserializer f81647b;

    /* JADX INFO: compiled from: AnnotationAndConstantLoaderImpl.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor module, @NotNull NotFoundClasses notFoundClasses, @NotNull SerializerExtensionProtocol protocol) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.f81646a = protocol;
        this.f81647b = new AnnotationDeserializer(module, notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    public ConstantValue<?> loadAnnotationDefaultValue(@NotNull ProtoContainer container, @NotNull ProtoBuf.Property proto, @NotNull KotlinType expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<AnnotationDescriptor> loadCallableAnnotations(@NotNull ProtoContainer container, @NotNull MessageLite proto, @NotNull AnnotatedCallableKind kind) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        boolean z10 = proto instanceof ProtoBuf.Constructor;
        SerializerExtensionProtocol serializerExtensionProtocol = this.f81646a;
        if (z10) {
            listEmptyList = (List) ((ProtoBuf.Constructor) proto).getExtension(serializerExtensionProtocol.getConstructorAnnotation());
        } else if (proto instanceof ProtoBuf.Function) {
            listEmptyList = (List) ((ProtoBuf.Function) proto).getExtension(serializerExtensionProtocol.getFunctionAnnotation());
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i10 == 1) {
                listEmptyList = (List) ((ProtoBuf.Property) proto).getExtension(serializerExtensionProtocol.getPropertyAnnotation());
            } else if (i10 == 2) {
                listEmptyList = (List) ((ProtoBuf.Property) proto).getExtension(serializerExtensionProtocol.getPropertyGetterAnnotation());
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                }
                listEmptyList = (List) ((ProtoBuf.Property) proto).getExtension(serializerExtensionProtocol.getPropertySetterAnnotation());
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f81647b.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<AnnotationDescriptor> loadClassAnnotations(@NotNull ProtoContainer.Class container) {
        Intrinsics.checkNotNullParameter(container, "container");
        List listEmptyList = (List) container.getClassProto().getExtension(this.f81646a.getClassAnnotation());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f81647b.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<AnnotationDescriptor> loadEnumEntryAnnotations(@NotNull ProtoContainer container, @NotNull ProtoBuf.EnumEntry proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        List listEmptyList = (List) proto.getExtension(this.f81646a.getEnumEntryAnnotation());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f81647b.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<AnnotationDescriptor> loadExtensionReceiverParameterAnnotations(@NotNull ProtoContainer container, @NotNull MessageLite proto, @NotNull AnnotatedCallableKind kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        boolean z10 = proto instanceof ProtoBuf.Function;
        List listEmptyList = null;
        SerializerExtensionProtocol serializerExtensionProtocol = this.f81646a;
        if (z10) {
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> functionExtensionReceiverAnnotation = serializerExtensionProtocol.getFunctionExtensionReceiverAnnotation();
            if (functionExtensionReceiverAnnotation != null) {
                listEmptyList = (List) ((ProtoBuf.Function) proto).getExtension(functionExtensionReceiverAnnotation);
            }
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyExtensionReceiverAnnotation = serializerExtensionProtocol.getPropertyExtensionReceiverAnnotation();
            if (propertyExtensionReceiverAnnotation != null) {
                listEmptyList = (List) ((ProtoBuf.Property) proto).getExtension(propertyExtensionReceiverAnnotation);
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f81647b.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<AnnotationDescriptor> loadPropertyBackingFieldAnnotations(@NotNull ProtoContainer container, @NotNull ProtoBuf.Property proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyBackingFieldAnnotation = this.f81646a.getPropertyBackingFieldAnnotation();
        List listEmptyList = propertyBackingFieldAnnotation != null ? (List) proto.getExtension(propertyBackingFieldAnnotation) : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f81647b.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<AnnotationDescriptor> loadPropertyDelegateFieldAnnotations(@NotNull ProtoContainer container, @NotNull ProtoBuf.Property proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyDelegatedFieldAnnotation = this.f81646a.getPropertyDelegatedFieldAnnotation();
        List listEmptyList = propertyDelegatedFieldAnnotation != null ? (List) proto.getExtension(propertyDelegatedFieldAnnotation) : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f81647b.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<AnnotationDescriptor> loadTypeAnnotations(@NotNull ProtoBuf.Type proto, @NotNull NameResolver nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        List listEmptyList = (List) proto.getExtension(this.f81646a.getTypeAnnotation());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f81647b.deserializeAnnotation((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<AnnotationDescriptor> loadTypeParameterAnnotations(@NotNull ProtoBuf.TypeParameter proto, @NotNull NameResolver nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        List listEmptyList = (List) proto.getExtension(this.f81646a.getTypeParameterAnnotation());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f81647b.deserializeAnnotation((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<AnnotationDescriptor> loadValueParameterAnnotations(@NotNull ProtoContainer container, @NotNull MessageLite callableProto, @NotNull AnnotatedCallableKind kind, int i10, @NotNull ProtoBuf.ValueParameter proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        List listEmptyList = (List) proto.getExtension(this.f81646a.getParameterAnnotation());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f81647b.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    public ConstantValue<?> loadPropertyConstant(@NotNull ProtoContainer container, @NotNull ProtoBuf.Property proto, @NotNull KotlinType expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) ProtoBufUtilKt.getExtensionOrNull(proto, this.f81646a.getCompileTimeValue());
        if (value == null) {
            return null;
        }
        return this.f81647b.resolveValue(expectedType, value, container.getNameResolver());
    }
}
