package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import al.c;
import al.d;
import al.e;
import al.f;
import al.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nsignatureEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1549#2:283\n1620#2,3:284\n1549#2:287\n1620#2,3:288\n1549#2:292\n1620#2,3:293\n1747#2,3:296\n1747#2,3:299\n1559#2:302\n1590#2,4:303\n1549#2:307\n1620#2,3:308\n1549#2:311\n1620#2,3:312\n1#3:291\n*S KotlinDebug\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n*L\n55#1:283\n55#1:284,3\n66#1:287\n66#1:288,3\n117#1:292\n117#1:293,3\n138#1:296,3\n144#1:299,3\n150#1:302\n150#1:303,4\n164#1:307\n164#1:308,3\n214#1:311\n214#1:312,3\n*E\n"})
public final class SignatureEnhancement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JavaTypeEnhancement f80831a;

    /* JADX INFO: compiled from: signatureEnhancement.kt */
    public static final class a extends Lambda implements Function1<UnwrappedType, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80832p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull UnwrappedType it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof RawType);
        }
    }

    public SignatureEnhancement(@NotNull JavaTypeEnhancement typeEnhancement) {
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        this.f80831a = typeEnhancement;
    }

    public final KotlinType a(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z10, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z11, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        g gVar = new g(annotated, z10, lazyJavaResolverContext, annotationQualifierApplicabilityType, false, 16, null);
        KotlinType kotlinTypeInvoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            Intrinsics.checkNotNull(callableMemberDescriptor2);
            arrayList.add(function1.invoke(callableMemberDescriptor2));
        }
        return this.f80831a.enhance(kotlinTypeInvoke, gVar.computeIndexedQualifiers(kotlinTypeInvoke, arrayList, typeEnhancementInfo, z11), gVar.getSkipRawTypeArguments());
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:146:0x02cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:150:0x02da  */
    /* JADX WARN: Code duplicated, block: B:151:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:155:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:157:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:160:0x0304  */
    /* JADX WARN: Code duplicated, block: B:163:0x031c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0150  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(@NotNull LazyJavaResolverContext c10, @NotNull Collection<? extends D> platformSignatures) {
        Annotations annotations;
        CallableMemberDescriptor callableMemberDescriptor;
        JavaMethodDescriptor javaMethodDescriptor;
        KotlinType kotlinTypeA;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo;
        Pair<CallableDescriptor.UserDataKey<?>, ?> pair;
        KotlinType type;
        ArrayList arrayList;
        int i10;
        int i11;
        KotlinType type2;
        ReceiverParameterDescriptor extensionReceiverParameter;
        ReceiverParameterDescriptor extensionReceiverParameter2;
        KotlinType type3;
        LazyJavaResolverContext lazyJavaResolverContext;
        LazyJavaResolverContext lazyJavaResolverContext2;
        List<TypeEnhancementInfo> parametersInfo;
        LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers;
        JavaPropertyDescriptor javaPropertyDescriptor;
        PropertyGetterDescriptorImpl getter;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        Collection<? extends D> collection = platformSignatures;
        int i12 = 10;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            CallableMemberDescriptor callableMemberDescriptorEnhance = (CallableMemberDescriptor) it.next();
            if (callableMemberDescriptorEnhance instanceof JavaCallableMemberDescriptor) {
                JavaCallableMemberDescriptor javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) callableMemberDescriptorEnhance;
                if (javaCallableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && javaCallableMemberDescriptor.getOriginal().getOverriddenDescriptors().size() == 1) {
                    i10 = i12;
                } else {
                    ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier(callableMemberDescriptorEnhance);
                    if (topLevelContainingClassifier == null) {
                        annotations = callableMemberDescriptorEnhance.getAnnotations();
                    } else {
                        LazyJavaClassDescriptor lazyJavaClassDescriptor = topLevelContainingClassifier instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) topLevelContainingClassifier : null;
                        List<JavaAnnotation> moduleAnnotations = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.getModuleAnnotations() : null;
                        List<JavaAnnotation> list = moduleAnnotations;
                        if (list == null || list.isEmpty()) {
                            annotations = callableMemberDescriptorEnhance.getAnnotations();
                        } else {
                            List<JavaAnnotation> list2 = moduleAnnotations;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, i12));
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(new LazyJavaAnnotationDescriptor(c10, (JavaAnnotation) it2.next(), true));
                            }
                            annotations = Annotations.Companion.create(CollectionsKt___CollectionsKt.plus((Iterable) callableMemberDescriptorEnhance.getAnnotations(), (Iterable) arrayList3));
                        }
                    }
                    LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers2 = ContextKt.copyWithNewDefaultTypeQualifiers(c10, annotations);
                    if (!(callableMemberDescriptorEnhance instanceof JavaPropertyDescriptor) || (getter = (javaPropertyDescriptor = (JavaPropertyDescriptor) callableMemberDescriptorEnhance).getGetter()) == null || getter.isDefault()) {
                        callableMemberDescriptor = callableMemberDescriptorEnhance;
                    } else {
                        CallableMemberDescriptor getter2 = javaPropertyDescriptor.getGetter();
                        Intrinsics.checkNotNull(getter2);
                        callableMemberDescriptor = getter2;
                    }
                    if (javaCallableMemberDescriptor.getExtensionReceiverParameter() != null) {
                        FunctionDescriptor functionDescriptor = callableMemberDescriptor instanceof FunctionDescriptor ? (FunctionDescriptor) callableMemberDescriptor : null;
                        Annotated annotated = functionDescriptor != null ? (ValueParameterDescriptor) functionDescriptor.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER) : null;
                        javaMethodDescriptor = null;
                        kotlinTypeA = a(callableMemberDescriptorEnhance, annotated, false, (annotated == null || (lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers2, annotated.getAnnotations())) == null) ? lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers2 : lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, null, false, d.f263p0);
                    } else {
                        javaMethodDescriptor = null;
                        kotlinTypeA = null;
                    }
                    JavaMethodDescriptor javaMethodDescriptor2 = callableMemberDescriptorEnhance instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) callableMemberDescriptorEnhance : javaMethodDescriptor;
                    int i13 = 0;
                    if (javaMethodDescriptor2 != null) {
                        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                        DeclarationDescriptor containingDeclaration = javaMethodDescriptor2.getContainingDeclaration();
                        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String strSignature = MethodSignatureBuildingUtilsKt.signature(signatureBuildingComponents, (ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor2, false, false, 3, javaMethodDescriptor));
                        if (strSignature != null) {
                            predefinedFunctionEnhancementInfo = PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(strSignature);
                        } else {
                            predefinedFunctionEnhancementInfo = javaMethodDescriptor;
                        }
                    } else {
                        predefinedFunctionEnhancementInfo = javaMethodDescriptor;
                    }
                    if (predefinedFunctionEnhancementInfo != 0) {
                        predefinedFunctionEnhancementInfo.getParametersInfo().size();
                        javaCallableMemberDescriptor.getValueParameters().size();
                    }
                    boolean z10 = (UtilsKt.isJspecifyEnabledInStrictMode(c10.getComponents().getJavaTypeEnhancementState()) || lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers2.getComponents().getSettings().getIgnoreNullabilityForErasedValueParameters()) && UtilsKt.hasErasedValueParameters(callableMemberDescriptorEnhance);
                    List<ValueParameterDescriptor> valueParameters = callableMemberDescriptor.getValueParameters();
                    String str = "getValueParameters(...)";
                    Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                    List<ValueParameterDescriptor> list3 = valueParameters;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, i12));
                    for (ValueParameterDescriptor valueParameterDescriptor : list3) {
                        Object obj = (predefinedFunctionEnhancementInfo == 0 || (parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo()) == null) ? javaMethodDescriptor : (TypeEnhancementInfo) CollectionsKt___CollectionsKt.getOrNull(parametersInfo, valueParameterDescriptor.getIndex());
                        Function1<? super CallableMemberDescriptor, ? extends KotlinType> fVar = new f(valueParameterDescriptor);
                        if (valueParameterDescriptor != null) {
                            lazyJavaResolverContext = lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers2;
                            LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers3 = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations());
                            if (lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers3 != null) {
                                lazyJavaResolverContext2 = lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers3;
                            }
                            ArrayList arrayList5 = arrayList4;
                            arrayList5.add(a(callableMemberDescriptorEnhance, valueParameterDescriptor, false, lazyJavaResolverContext2, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, obj, z10, fVar));
                            str = str;
                            arrayList4 = arrayList5;
                            i13 = i13;
                            lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers2 = lazyJavaResolverContext;
                            javaMethodDescriptor = null;
                        } else {
                            lazyJavaResolverContext = lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers2;
                        }
                        lazyJavaResolverContext2 = lazyJavaResolverContext;
                        ArrayList arrayList6 = arrayList4;
                        arrayList6.add(a(callableMemberDescriptorEnhance, valueParameterDescriptor, false, lazyJavaResolverContext2, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, obj, z10, fVar));
                        str = str;
                        arrayList4 = arrayList6;
                        i13 = i13;
                        lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers2 = lazyJavaResolverContext;
                        javaMethodDescriptor = null;
                    }
                    LazyJavaResolverContext lazyJavaResolverContext3 = lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers2;
                    ArrayList arrayList7 = arrayList4;
                    int i14 = i13;
                    String str2 = str;
                    PropertyDescriptor propertyDescriptor = callableMemberDescriptorEnhance instanceof PropertyDescriptor ? (PropertyDescriptor) callableMemberDescriptorEnhance : null;
                    KotlinType kotlinTypeA2 = a(callableMemberDescriptorEnhance, callableMemberDescriptor, true, lazyJavaResolverContext3, (propertyDescriptor == null || !JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) ? AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE : AnnotationQualifierApplicabilityType.FIELD, predefinedFunctionEnhancementInfo != 0 ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null, false, e.f264p0);
                    KotlinType returnType = javaCallableMemberDescriptor.getReturnType();
                    Intrinsics.checkNotNull(returnType);
                    c cVar = c.f262p0;
                    if (TypeUtils.contains(returnType, cVar) || !((extensionReceiverParameter2 = javaCallableMemberDescriptor.getExtensionReceiverParameter()) == null || (type3 = extensionReceiverParameter2.getType()) == null || !TypeUtils.contains(type3, cVar))) {
                        pair = TuplesKt.to(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(callableMemberDescriptorEnhance));
                    } else {
                        List<ValueParameterDescriptor> valueParameters2 = javaCallableMemberDescriptor.getValueParameters();
                        Intrinsics.checkNotNullExpressionValue(valueParameters2, str2);
                        List<ValueParameterDescriptor> list4 = valueParameters2;
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator<T> it3 = list4.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    KotlinType type4 = ((ValueParameterDescriptor) it3.next()).getType();
                                    Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                                    if (TypeUtils.contains(type4, c.f262p0)) {
                                        pair = TuplesKt.to(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(callableMemberDescriptorEnhance));
                                    }
                                }
                            }
                        }
                        pair = null;
                    }
                    if (kotlinTypeA != null || kotlinTypeA2 != null) {
                        if (kotlinTypeA == null) {
                            extensionReceiverParameter = javaCallableMemberDescriptor.getExtensionReceiverParameter();
                            if (extensionReceiverParameter != null) {
                                type = extensionReceiverParameter.getType();
                            } else {
                                type = null;
                            }
                        } else {
                            type = kotlinTypeA;
                        }
                        i10 = 10;
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                        i11 = i14;
                        for (Object obj2 : arrayList7) {
                            int i15 = i11 + 1;
                            if (i11 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            type2 = (KotlinType) obj2;
                            if (type2 == null) {
                                type2 = javaCallableMemberDescriptor.getValueParameters().get(i11).getType();
                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                            }
                            arrayList.add(type2);
                            i11 = i15;
                        }
                        if (kotlinTypeA2 == null) {
                            kotlinTypeA2 = javaCallableMemberDescriptor.getReturnType();
                            Intrinsics.checkNotNull(kotlinTypeA2);
                        }
                        callableMemberDescriptorEnhance = javaCallableMemberDescriptor.enhance(type, arrayList, kotlinTypeA2, pair);
                        Intrinsics.checkNotNull(callableMemberDescriptorEnhance, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                    } else if (!arrayList7.isEmpty()) {
                        Iterator it4 = arrayList7.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (((KotlinType) it4.next()) != null) {
                                }
                            } else if (pair == null) {
                                i10 = 10;
                            }
                            if (kotlinTypeA == null) {
                                extensionReceiverParameter = javaCallableMemberDescriptor.getExtensionReceiverParameter();
                                if (extensionReceiverParameter != null) {
                                    type = extensionReceiverParameter.getType();
                                } else {
                                    type = null;
                                }
                            } else {
                                type = kotlinTypeA;
                            }
                            i10 = 10;
                            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                            i11 = i14;
                            while (r7.hasNext()) {
                                int i16 = i11 + 1;
                                if (i11 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                }
                                type2 = (KotlinType) obj2;
                                if (type2 == null) {
                                    type2 = javaCallableMemberDescriptor.getValueParameters().get(i11).getType();
                                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                }
                                arrayList.add(type2);
                                i11 = i16;
                            }
                            if (kotlinTypeA2 == null) {
                                kotlinTypeA2 = javaCallableMemberDescriptor.getReturnType();
                                Intrinsics.checkNotNull(kotlinTypeA2);
                            }
                            callableMemberDescriptorEnhance = javaCallableMemberDescriptor.enhance(type, arrayList, kotlinTypeA2, pair);
                            Intrinsics.checkNotNull(callableMemberDescriptorEnhance, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                        }
                    } else if (pair == null) {
                        if (kotlinTypeA == null) {
                            extensionReceiverParameter = javaCallableMemberDescriptor.getExtensionReceiverParameter();
                            if (extensionReceiverParameter != null) {
                                type = extensionReceiverParameter.getType();
                            } else {
                                type = null;
                            }
                        } else {
                            type = kotlinTypeA;
                        }
                        i10 = 10;
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                        i11 = i14;
                        while (r7.hasNext()) {
                            int i17 = i11 + 1;
                            if (i11 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            type2 = (KotlinType) obj2;
                            if (type2 == null) {
                                type2 = javaCallableMemberDescriptor.getValueParameters().get(i11).getType();
                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                            }
                            arrayList.add(type2);
                            i11 = i17;
                        }
                        if (kotlinTypeA2 == null) {
                            kotlinTypeA2 = javaCallableMemberDescriptor.getReturnType();
                            Intrinsics.checkNotNull(kotlinTypeA2);
                        }
                        callableMemberDescriptorEnhance = javaCallableMemberDescriptor.enhance(type, arrayList, kotlinTypeA2, pair);
                        Intrinsics.checkNotNull(callableMemberDescriptorEnhance, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                    } else {
                        i10 = 10;
                    }
                }
            } else {
                i10 = i12;
            }
            arrayList2.add(callableMemberDescriptorEnhance);
            i12 = i10;
        }
        return arrayList2;
    }

    @NotNull
    public final KotlinType enhanceSuperType(@NotNull KotlinType type, @NotNull LazyJavaResolverContext context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        g gVar = new g(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true);
        KotlinType kotlinTypeEnhance = this.f80831a.enhance(type, gVar.computeIndexedQualifiers(type, CollectionsKt__CollectionsKt.emptyList(), null, false), gVar.getSkipRawTypeArguments());
        return kotlinTypeEnhance == null ? type : kotlinTypeEnhance;
    }

    @NotNull
    public final List<KotlinType> enhanceTypeParameterBounds(@NotNull TypeParameterDescriptor typeParameter, @NotNull List<? extends KotlinType> bounds, @NotNull LazyJavaResolverContext context) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        List<? extends KotlinType> list = bounds;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (KotlinType kotlinType : list) {
            if (!TypeUtilsKt.contains(kotlinType, a.f80832p0)) {
                g gVar = new g(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null);
                KotlinType kotlinTypeEnhance = this.f80831a.enhance(kotlinType, gVar.computeIndexedQualifiers(kotlinType, CollectionsKt__CollectionsKt.emptyList(), null, false), gVar.getSkipRawTypeArguments());
                if (kotlinTypeEnhance != null) {
                    kotlinType = kotlinTypeEnhance;
                }
            }
            arrayList.add(kotlinType);
        }
        return arrayList;
    }
}
