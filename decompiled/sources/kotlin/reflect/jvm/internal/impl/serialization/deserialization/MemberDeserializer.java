package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import bk.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MemberDeserializer.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nMemberDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n1#2:372\n1#2:391\n1559#3:373\n1590#3,4:374\n1569#3,11:378\n1864#3,2:389\n1866#3:392\n1580#3:393\n1549#3:394\n1620#3,3:395\n1559#3:398\n1590#3,4:399\n*S KotlinDebug\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n*L\n215#1:391\n63#1:373\n63#1:374,4\n215#1:378,11\n215#1:389,2\n215#1:392\n215#1:393\n243#1:394\n243#1:395,3\n327#1:398\n327#1:399,4\n*E\n"})
public final class MemberDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeserializationContext f81703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AnnotationDeserializer f81704b;

    /* JADX INFO: compiled from: MemberDeserializer.kt */
    public static final class a extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MessageLite f81706q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AnnotatedCallableKind f81707r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
            super(0);
            this.f81706q0 = messageLite;
            this.f81707r0 = annotatedCallableKind;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends AnnotationDescriptor> invoke() {
            MemberDeserializer memberDeserializer = MemberDeserializer.this;
            ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.f81703a.getContainingDeclaration());
            List<? extends AnnotationDescriptor> list = protoContainerA != null ? CollectionsKt___CollectionsKt.toList(memberDeserializer.f81703a.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(protoContainerA, this.f81706q0, this.f81707r0)) : null;
            return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        }
    }

    /* JADX INFO: compiled from: MemberDeserializer.kt */
    public static final class b extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f81709q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ProtoBuf.Property f81710r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, ProtoBuf.Property property) {
            super(0);
            this.f81709q0 = z10;
            this.f81710r0 = property;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends AnnotationDescriptor> invoke() {
            List<? extends AnnotationDescriptor> list;
            MemberDeserializer memberDeserializer = MemberDeserializer.this;
            ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.f81703a.getContainingDeclaration());
            if (protoContainerA != null) {
                boolean z10 = this.f81709q0;
                ProtoBuf.Property property = this.f81710r0;
                list = z10 ? CollectionsKt___CollectionsKt.toList(memberDeserializer.f81703a.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(protoContainerA, property)) : CollectionsKt___CollectionsKt.toList(memberDeserializer.f81703a.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(protoContainerA, property));
            } else {
                list = null;
            }
            return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        }
    }

    /* JADX INFO: compiled from: MemberDeserializer.kt */
    public static final class c extends Lambda implements Function0<NullableLazyValue<? extends ConstantValue<?>>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ProtoBuf.Property f81712q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DeserializedPropertyDescriptor f81713r0;

        /* JADX INFO: compiled from: MemberDeserializer.kt */
        public static final class a extends Lambda implements Function0<ConstantValue<?>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ MemberDeserializer f81714p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ ProtoBuf.Property f81715q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ DeserializedPropertyDescriptor f81716r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
                super(0);
                this.f81714p0 = memberDeserializer;
                this.f81715q0 = property;
                this.f81716r0 = deserializedPropertyDescriptor;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final ConstantValue<?> invoke() {
                MemberDeserializer memberDeserializer = this.f81714p0;
                ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.f81703a.getContainingDeclaration());
                Intrinsics.checkNotNull(protoContainerA);
                AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = memberDeserializer.f81703a.getComponents().getAnnotationAndConstantLoader();
                KotlinType returnType = this.f81716r0.getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                return annotationAndConstantLoader.loadPropertyConstant(protoContainerA, this.f81715q0, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
            super(0);
            this.f81712q0 = property;
            this.f81713r0 = deserializedPropertyDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        public final NullableLazyValue<? extends ConstantValue<?>> invoke() {
            MemberDeserializer memberDeserializer = MemberDeserializer.this;
            return memberDeserializer.f81703a.getStorageManager().createNullableLazyValue(new a(memberDeserializer, this.f81712q0, this.f81713r0));
        }
    }

    /* JADX INFO: compiled from: MemberDeserializer.kt */
    public static final class d extends Lambda implements Function0<NullableLazyValue<? extends ConstantValue<?>>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ProtoBuf.Property f81718q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DeserializedPropertyDescriptor f81719r0;

        /* JADX INFO: compiled from: MemberDeserializer.kt */
        public static final class a extends Lambda implements Function0<ConstantValue<?>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ MemberDeserializer f81720p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ ProtoBuf.Property f81721q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ DeserializedPropertyDescriptor f81722r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
                super(0);
                this.f81720p0 = memberDeserializer;
                this.f81721q0 = property;
                this.f81722r0 = deserializedPropertyDescriptor;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final ConstantValue<?> invoke() {
                MemberDeserializer memberDeserializer = this.f81720p0;
                ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.f81703a.getContainingDeclaration());
                Intrinsics.checkNotNull(protoContainerA);
                AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = memberDeserializer.f81703a.getComponents().getAnnotationAndConstantLoader();
                KotlinType returnType = this.f81722r0.getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                return annotationAndConstantLoader.loadAnnotationDefaultValue(protoContainerA, this.f81721q0, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
            super(0);
            this.f81718q0 = property;
            this.f81719r0 = deserializedPropertyDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        public final NullableLazyValue<? extends ConstantValue<?>> invoke() {
            MemberDeserializer memberDeserializer = MemberDeserializer.this;
            return memberDeserializer.f81703a.getStorageManager().createNullableLazyValue(new a(memberDeserializer, this.f81718q0, this.f81719r0));
        }
    }

    /* JADX INFO: compiled from: MemberDeserializer.kt */
    public static final class e extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ProtoContainer f81724q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MessageLite f81725r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ AnnotatedCallableKind f81726s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f81727t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ ProtoBuf.ValueParameter f81728u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf.ValueParameter valueParameter) {
            super(0);
            this.f81724q0 = protoContainer;
            this.f81725r0 = messageLite;
            this.f81726s0 = annotatedCallableKind;
            this.f81727t0 = i10;
            this.f81728u0 = valueParameter;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends AnnotationDescriptor> invoke() {
            return CollectionsKt___CollectionsKt.toList(MemberDeserializer.this.f81703a.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(this.f81724q0, this.f81725r0, this.f81726s0, this.f81727t0, this.f81728u0));
        }
    }

    public MemberDeserializer(@NotNull DeserializationContext c10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f81703a = c10;
        this.f81704b = new AnnotationDeserializer(c10.getComponents().getModuleDescriptor(), c10.getComponents().getNotFoundClasses());
    }

    public final ProtoContainer a(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) declarationDescriptor).getFqName();
            DeserializationContext deserializationContext = this.f81703a;
            return new ProtoContainer.Package(fqName, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    public final Annotations b(MessageLite messageLite, int i10, AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.HAS_ANNOTATIONS.get(i10).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f81703a.getStorageManager(), new a(messageLite, annotatedCallableKind));
    }

    public final Annotations c(ProtoBuf.Property property, boolean z10) {
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f81703a.getStorageManager(), new b(z10, property));
    }

    public final List<ValueParameterDescriptor> d(List<ProtoBuf.ValueParameter> list, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        DeserializationContext deserializationContext = this.f81703a;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
        ProtoContainer protoContainerA = a(containingDeclaration2);
        List<ProtoBuf.ValueParameter> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            Annotations empty = (protoContainerA == null || !androidx.databinding.c.f(Flags.HAS_ANNOTATIONS, flags, "get(...)")) ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(deserializationContext.getStorageManager(), new e(protoContainerA, messageLite, annotatedCallableKind, i10, valueParameter));
            Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), valueParameter.getName());
            KotlinType kotlinTypeType = deserializationContext.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, deserializationContext.getTypeTable()));
            boolean zF = androidx.databinding.c.f(Flags.DECLARES_DEFAULT_VALUE, flags, "get(...)");
            boolean zF2 = androidx.databinding.c.f(Flags.IS_CROSSINLINE, flags, "get(...)");
            boolean zF3 = androidx.databinding.c.f(Flags.IS_NOINLINE, flags, "get(...)");
            ProtoBuf.Type typeVarargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, deserializationContext.getTypeTable());
            KotlinType kotlinTypeType2 = typeVarargElementType != null ? deserializationContext.getTypeDeserializer().type(typeVarargElementType) : null;
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i10, empty, name, kotlinTypeType, zF, zF2, zF3, kotlinTypeType2, NO_SOURCE));
            arrayList = arrayList2;
            i10 = i11;
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    @NotNull
    public final ClassConstructorDescriptor loadConstructor(@NotNull ProtoBuf.Constructor proto, boolean z10) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        DeserializationContext deserializationContext = this.f81703a;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        int flags = proto.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, b(proto, flags, annotatedCallableKind), z10, CallableMemberDescriptor.Kind.DECLARATION, proto, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource(), null, 1024, null);
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.f81703a, deserializedClassConstructorDescriptor, CollectionsKt__CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.d(valueParameterList, proto, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setExpect(classDescriptor.isExpect());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(proto.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    @NotNull
    public final SimpleFunctionDescriptor loadFunction(@NotNull ProtoBuf.Function proto) {
        int flags;
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor;
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable;
        KotlinType kotlinTypeType;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (proto.hasFlags()) {
            flags = proto.getFlags();
        } else {
            int oldFlags = proto.getOldFlags();
            flags = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        int i10 = flags;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotationsB = b(proto, i10, annotatedCallableKind);
        boolean zHasReceiver = ProtoTypeTableUtilKt.hasReceiver(proto);
        DeserializationContext deserializationContext = this.f81703a;
        Annotations deserializedAnnotations = zHasReceiver ? new DeserializedAnnotations(deserializationContext.getStorageManager(), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.a(this, proto, annotatedCallableKind)) : Annotations.Companion.getEMPTY();
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor2 = new DeserializedSimpleFunctionDescriptor(deserializationContext.getContainingDeclaration(), null, annotationsB, NameResolverUtilKt.getName(deserializationContext.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.memberKind(ProtoEnumFlags.INSTANCE, Flags.MEMBER_KIND.get(i10)), proto, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(deserializationContext.getContainingDeclaration()).child(NameResolverUtilKt.getName(deserializationContext.getNameResolver(), proto.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource(), null, 1024, null);
        DeserializationContext deserializationContext2 = this.f81703a;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext2, deserializedSimpleFunctionDescriptor2, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(proto, deserializationContext.getTypeTable());
        if (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) {
            deserializedSimpleFunctionDescriptor = deserializedSimpleFunctionDescriptor2;
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = null;
        } else {
            deserializedSimpleFunctionDescriptor = deserializedSimpleFunctionDescriptor2;
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, kotlinTypeType, deserializedAnnotations);
        }
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        ReceiverParameterDescriptor thisAsReceiverParameter = classDescriptor != null ? classDescriptor.getThisAsReceiverParameter() : null;
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, deserializationContext.getTypeTable());
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listContextReceiverTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ReceiverParameterDescriptor receiverParameterDescriptorCreateContextReceiverParameterForCallable = DescriptorFactory.createContextReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, deserializationContextChildContext$default.getTypeDeserializer().type((ProtoBuf.Type) obj), null, Annotations.Companion.getEMPTY(), i11);
            if (receiverParameterDescriptorCreateContextReceiverParameterForCallable != null) {
                arrayList.add(receiverParameterDescriptorCreateContextReceiverParameterForCallable);
            }
            i11 = i12;
        }
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer = deserializationContextChildContext$default.getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        List<ValueParameterDescriptor> listD = memberDeserializer.d(valueParameterList, proto, AnnotatedCallableKind.FUNCTION);
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, deserializationContext.getTypeTable()));
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, thisAsReceiverParameter, arrayList, ownTypeParameters, listD, kotlinTypeType2, protoEnumFlags.modality(Flags.MODALITY.get(i10)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(i10)), q.emptyMap());
        Boolean bool = Flags.IS_OPERATOR.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        deserializedSimpleFunctionDescriptor.setOperator(bool.booleanValue());
        Boolean bool2 = Flags.IS_INFIX.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
        deserializedSimpleFunctionDescriptor.setInfix(bool2.booleanValue());
        Boolean bool3 = Flags.IS_EXTERNAL_FUNCTION.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool3, "get(...)");
        deserializedSimpleFunctionDescriptor.setExternal(bool3.booleanValue());
        Boolean bool4 = Flags.IS_INLINE.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool4, "get(...)");
        deserializedSimpleFunctionDescriptor.setInline(bool4.booleanValue());
        Boolean bool5 = Flags.IS_TAILREC.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool5, "get(...)");
        deserializedSimpleFunctionDescriptor.setTailrec(bool5.booleanValue());
        Boolean bool6 = Flags.IS_SUSPEND.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool6, "get(...)");
        deserializedSimpleFunctionDescriptor.setSuspend(bool6.booleanValue());
        Boolean bool7 = Flags.IS_EXPECT_FUNCTION.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool7, "get(...)");
        deserializedSimpleFunctionDescriptor.setExpect(bool7.booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(i10).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> pairDeserializeContractFromFunction = deserializationContext.getComponents().getContractDeserializer().deserializeContractFromFunction(proto, deserializedSimpleFunctionDescriptor, deserializationContext.getTypeTable(), deserializationContextChildContext$default.getTypeDeserializer());
        if (pairDeserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap(pairDeserializeContractFromFunction.getFirst(), pairDeserializeContractFromFunction.getSecond());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    @NotNull
    public final PropertyDescriptor loadProperty(@NotNull ProtoBuf.Property proto) {
        int flags;
        ProtoBuf.Property property;
        Annotations empty;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor;
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable;
        Flags.FlagField<ProtoBuf.Modality> flagField;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImplCreateDefaultSetter;
        MemberDeserializer memberDeserializer;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2;
        KotlinType kotlinTypeType;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (proto.hasFlags()) {
            flags = proto.getFlags();
        } else {
            int oldFlags = proto.getOldFlags();
            flags = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        int i10 = flags;
        DeserializationContext deserializationContext = this.f81703a;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Annotations annotationsB = b(proto, i10, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor3 = new DeserializedPropertyDescriptor(containingDeclaration, null, annotationsB, protoEnumFlags.modality(Flags.MODALITY.get(i10)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(i10)), androidx.databinding.c.f(Flags.IS_VAR, i10, "get(...)"), NameResolverUtilKt.getName(deserializationContext.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(i10)), androidx.databinding.c.f(Flags.IS_LATEINIT, i10, "get(...)"), androidx.databinding.c.f(Flags.IS_CONST, i10, "get(...)"), androidx.databinding.c.f(Flags.IS_EXTERNAL_PROPERTY, i10, "get(...)"), androidx.databinding.c.f(Flags.IS_DELEGATED, i10, "get(...)"), androidx.databinding.c.f(Flags.IS_EXPECT_PROPERTY, i10, "get(...)"), proto, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource());
        DeserializationContext deserializationContext2 = this.f81703a;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext2, deserializedPropertyDescriptor3, typeParameterList, null, null, null, null, 60, null);
        boolean zF = androidx.databinding.c.f(Flags.HAS_GETTER, i10, "get(...)");
        if (zF && ProtoTypeTableUtilKt.hasReceiver(proto)) {
            property = proto;
            empty = new DeserializedAnnotations(deserializationContext.getStorageManager(), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.a(this, property, AnnotatedCallableKind.PROPERTY_GETTER));
        } else {
            property = proto;
            empty = Annotations.Companion.getEMPTY();
        }
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(property, deserializationContext.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        DeclarationDescriptor containingDeclaration2 = deserializationContext.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration2 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration2 : null;
        ReceiverParameterDescriptor thisAsReceiverParameter = classDescriptor != null ? classDescriptor.getThisAsReceiverParameter() : null;
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(property, deserializationContext.getTypeTable());
        if (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) {
            deserializedPropertyDescriptor = deserializedPropertyDescriptor3;
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = null;
        } else {
            deserializedPropertyDescriptor = deserializedPropertyDescriptor3;
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, kotlinTypeType, empty);
        }
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(property, deserializationContext.getTypeTable());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listContextReceiverTypes, 10));
        int i11 = 0;
        for (Object obj : listContextReceiverTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(DescriptorFactory.createContextReceiverParameterForCallable(deserializedPropertyDescriptor, deserializationContextChildContext$default.getTypeDeserializer().type((ProtoBuf.Type) obj), null, Annotations.Companion.getEMPTY(), i11));
            i11 = i12;
        }
        deserializedPropertyDescriptor.setType(kotlinTypeType2, ownTypeParameters, thisAsReceiverParameter, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, arrayList);
        boolean zF2 = androidx.databinding.c.f(Flags.HAS_ANNOTATIONS, i10, "get(...)");
        Flags.FlagField<ProtoBuf.Visibility> flagField2 = Flags.VISIBILITY;
        ProtoBuf.Visibility visibility = flagField2.get(i10);
        Flags.FlagField<ProtoBuf.Modality> flagField3 = Flags.MODALITY;
        int accessorFlags = Flags.getAccessorFlags(zF2, visibility, flagField3.get(i10), false, false, false);
        if (zF) {
            int getterFlags = proto.hasGetterFlags() ? proto.getGetterFlags() : accessorFlags;
            boolean zF3 = androidx.databinding.c.f(Flags.IS_NOT_DEFAULT, getterFlags, "get(...)");
            boolean zF4 = androidx.databinding.c.f(Flags.IS_EXTERNAL_ACCESSOR, getterFlags, "get(...)");
            boolean zF5 = androidx.databinding.c.f(Flags.IS_INLINE_ACCESSOR, getterFlags, "get(...)");
            Annotations annotationsB2 = b(property, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zF3) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
                flagField = flagField3;
                deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                propertyGetterDescriptorImpl2 = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotationsB2, protoEnumFlags2.modality(flagField3.get(getterFlags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField2.get(getterFlags)), !zF3, zF4, zF5, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                flagField = flagField3;
                deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor2, annotationsB2);
                Intrinsics.checkNotNull(propertyGetterDescriptorImplCreateDefaultGetter);
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImplCreateDefaultGetter;
            }
            propertyGetterDescriptorImpl2.initialize(deserializedPropertyDescriptor2.getReturnType());
            propertyGetterDescriptorImpl = propertyGetterDescriptorImpl2;
        } else {
            flagField = flagField3;
            flagField2 = flagField2;
            deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
            propertyGetterDescriptorImpl = null;
        }
        if (androidx.databinding.c.f(Flags.HAS_SETTER, i10, "get(...)")) {
            if (proto.hasSetterFlags()) {
                accessorFlags = proto.getSetterFlags();
            }
            int i13 = accessorFlags;
            boolean zF6 = androidx.databinding.c.f(Flags.IS_NOT_DEFAULT, i13, "get(...)");
            boolean zF7 = androidx.databinding.c.f(Flags.IS_EXTERNAL_ACCESSOR, i13, "get(...)");
            boolean zF8 = androidx.databinding.c.f(Flags.IS_INLINE_ACCESSOR, i13, "get(...)");
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotationsB3 = b(property, i13, annotatedCallableKind);
            if (zF6) {
                ProtoEnumFlags protoEnumFlags3 = ProtoEnumFlags.INSTANCE;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor2, annotationsB3, protoEnumFlags3.modality(flagField.get(i13)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags3, flagField2.get(i13)), !zF6, zF7, zF8, deserializedPropertyDescriptor2.getKind(), null, SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) CollectionsKt___CollectionsKt.single((List) DeserializationContext.childContext$default(deserializationContextChildContext$default, propertySetterDescriptorImpl, CollectionsKt__CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer().d(bk.d.listOf(proto.getSetterValueParameter()), property, annotatedCallableKind)));
                propertySetterDescriptorImplCreateDefaultSetter = propertySetterDescriptorImpl;
            } else {
                propertySetterDescriptorImplCreateDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor2, annotationsB3, Annotations.Companion.getEMPTY());
                Intrinsics.checkNotNull(propertySetterDescriptorImplCreateDefaultSetter);
            }
        } else {
            propertySetterDescriptorImplCreateDefaultSetter = null;
        }
        if (androidx.databinding.c.f(Flags.HAS_CONSTANT, i10, "get(...)")) {
            memberDeserializer = this;
            deserializedPropertyDescriptor2.setCompileTimeInitializerFactory(memberDeserializer.new c(property, deserializedPropertyDescriptor2));
        } else {
            memberDeserializer = this;
        }
        DeclarationDescriptor containingDeclaration3 = deserializationContext.getContainingDeclaration();
        ClassDescriptor classDescriptor2 = containingDeclaration3 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration3 : null;
        if ((classDescriptor2 != null ? classDescriptor2.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            deserializedPropertyDescriptor2.setCompileTimeInitializerFactory(memberDeserializer.new d(property, deserializedPropertyDescriptor2));
        }
        deserializedPropertyDescriptor2.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImplCreateDefaultSetter, new FieldDescriptorImpl(memberDeserializer.c(property, false), deserializedPropertyDescriptor2), new FieldDescriptorImpl(memberDeserializer.c(property, true), deserializedPropertyDescriptor2));
        return deserializedPropertyDescriptor2;
    }

    @NotNull
    public final TypeAliasDescriptor loadTypeAlias(@NotNull ProtoBuf.TypeAlias proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<ProtoBuf.Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            DeserializationContext deserializationContext = this.f81703a;
            if (!zHasNext) {
                DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(deserializationContext.getStorageManager(), deserializationContext.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(deserializationContext.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())), proto, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource());
                DeserializationContext deserializationContext2 = this.f81703a;
                List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
                Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
                DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext2, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
                deserializedTypeAliasDescriptor.initialize(deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters(), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(proto, deserializationContext.getTypeTable()), false), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(proto, deserializationContext.getTypeTable()), false));
                return deserializedTypeAliasDescriptor;
            }
            ProtoBuf.Annotation annotation = (ProtoBuf.Annotation) it.next();
            Intrinsics.checkNotNull(annotation);
            arrayList.add(this.f81704b.deserializeAnnotation(annotation, deserializationContext.getNameResolver()));
        }
    }
}
