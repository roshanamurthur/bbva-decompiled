package kotlin.reflect.jvm.internal.impl.renderer;

import bk.w;
import java.lang.reflect.Field;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DescriptorRendererOptionsImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nDescriptorRendererOptionsImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,136:1\n1#2:137\n51#3,3:138\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n*L\n61#1:138,3\n*E\n"})
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {
    public static final /* synthetic */ KProperty<Object>[] X = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withDefinedIn", "getWithDefinedIn()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "modifiers", "getModifiers()Ljava/util/Set;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "startFromName", "getStartFromName()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "debugMode", "getDebugMode()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "verbose", "getVerbose()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "unitReturnType", "getUnitReturnType()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withoutReturnType", "getWithoutReturnType()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "enhancedTypes", "getEnhancedTypes()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderDefaultModality", "getRenderDefaultModality()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "receiverAfterName", "getReceiverAfterName()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 A;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 B;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 C;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 D;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 E;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 F;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 G;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 H;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 I;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 J;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 K;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 L;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 M;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 N;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 O;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 P;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 Q;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 R;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 S;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 T;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 U;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 V;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f81476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81477b = a(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.INSTANCE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81487l;

    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81489o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81491q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81495u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81496v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81499y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f81500z;

    /* JADX INFO: compiled from: DescriptorRendererOptionsImpl.kt */
    public static final class a extends Lambda implements Function1<ValueParameterDescriptor, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f81501p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull ValueParameterDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return "...";
        }
    }

    /* JADX INFO: compiled from: DescriptorRendererOptionsImpl.kt */
    public static final class b extends Lambda implements Function1<KotlinType, KotlinType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f81502p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KotlinType invoke(@NotNull KotlinType it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f81478c = a(bool);
        this.f81479d = a(bool);
        this.f81480e = a(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f81481f = a(bool2);
        this.f81482g = a(bool2);
        this.f81483h = a(bool2);
        this.f81484i = a(bool2);
        this.f81485j = a(bool2);
        this.f81486k = a(bool);
        this.f81487l = a(bool2);
        this.m = a(bool2);
        this.f81488n = a(bool2);
        this.f81489o = a(bool);
        this.f81490p = a(bool);
        this.f81491q = a(bool2);
        this.f81492r = a(bool2);
        this.f81493s = a(bool2);
        this.f81494t = a(bool2);
        this.f81495u = a(bool2);
        this.f81496v = a(null);
        this.f81497w = a(bool2);
        this.f81498x = a(bool2);
        this.f81499y = a(b.f81502p0);
        this.f81500z = a(a.f81501p0);
        this.A = a(bool);
        this.B = a(OverrideRenderingPolicy.RENDER_OPEN);
        this.C = a(DescriptorRenderer.ValueParametersHandler.DEFAULT.INSTANCE);
        this.D = a(RenderingFormat.PLAIN);
        this.E = a(ParameterNameRenderingPolicy.ALL);
        this.F = a(bool2);
        this.G = a(bool2);
        this.H = a(PropertyAccessorRenderingPolicy.DEBUG);
        this.I = a(bool2);
        this.J = a(bool2);
        this.K = a(w.emptySet());
        this.L = a(ExcludedTypeAnnotations.INSTANCE.getInternalAnnotationsForResolve());
        this.M = a(null);
        this.N = a(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.O = a(bool2);
        this.P = a(bool);
        this.Q = a(bool);
        this.R = a(bool2);
        this.S = a(bool);
        this.T = a(bool);
        a(bool2);
        this.U = a(bool2);
        this.V = a(bool2);
        this.W = a(bool);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1] */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 a(final Object obj) {
        Delegates delegates = Delegates.INSTANCE;
        return new ObservableProperty<Object>(obj) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1
            @Override // kotlin.properties.ObservableProperty
            public boolean beforeChange(@NotNull KProperty<?> property, Object obj2, Object obj3) {
                Intrinsics.checkNotNullParameter(property, "property");
                if (this.isLocked()) {
                    throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
                }
                return true;
            }
        };
    }

    @NotNull
    public final DescriptorRendererOptionsImpl copy() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        Field[] declaredFields = DescriptorRendererOptionsImpl.class.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                if (observableProperty != null) {
                    String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    l.startsWith$default(name, "is", false, 2, null);
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder("get");
                    String name3 = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb2.append(name3);
                    field.set(descriptorRendererOptionsImpl, descriptorRendererOptionsImpl.a(observableProperty.getValue(this, new PropertyReference1Impl(orCreateKotlinClass, name2, sb2.toString()))));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return ((Boolean) getValue(this, X[17])).booleanValue();
    }

    public boolean getAlwaysRenderModifiers() {
        return ((Boolean) getValue(this, X[39])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return (AnnotationArgumentsRenderingPolicy) getValue(this, X[38]);
    }

    @Nullable
    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return (Function1) getValue(this, X[37]);
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return ((Boolean) getValue(this, X[47])).booleanValue();
    }

    public boolean getClassWithPrimaryConstructor() {
        return ((Boolean) getValue(this, X[7])).booleanValue();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return (ClassifierNamePolicy) getValue(this, X[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return ((Boolean) getValue(this, X[6])).booleanValue();
    }

    @Nullable
    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return (Function1) getValue(this, X[24]);
    }

    public boolean getEachAnnotationOnNewLine() {
        return ((Boolean) getValue(this, X[34])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return ((Boolean) getValue(this, X[11])).booleanValue();
    }

    @NotNull
    public Set<FqName> getExcludedAnnotationClasses() {
        return (Set) getValue(this, X[35]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return (Set) getValue(this, X[36]);
    }

    public boolean getIncludeAdditionalModifiers() {
        return ((Boolean) getValue(this, X[43])).booleanValue();
    }

    public boolean getIncludeAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeAnnotationArguments(this);
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeEmptyAnnotationArguments(this);
    }

    public boolean getIncludePropertyConstant() {
        return ((Boolean) getValue(this, X[19])).booleanValue();
    }

    public boolean getInformativeErrorType() {
        return ((Boolean) getValue(this, X[48])).booleanValue();
    }

    @NotNull
    public Set<DescriptorRendererModifier> getModifiers() {
        return (Set) getValue(this, X[3]);
    }

    public boolean getNormalizedVisibilities() {
        return ((Boolean) getValue(this, X[12])).booleanValue();
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return (OverrideRenderingPolicy) getValue(this, X[26]);
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return (ParameterNameRenderingPolicy) getValue(this, X[29]);
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return ((Boolean) getValue(this, X[44])).booleanValue();
    }

    public boolean getPresentableUnresolvedTypes() {
        return ((Boolean) getValue(this, X[46])).booleanValue();
    }

    @NotNull
    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return (PropertyAccessorRenderingPolicy) getValue(this, X[32]);
    }

    @Nullable
    public Function1<ConstantValue<?>, String> getPropertyConstantRenderer() {
        return (Function1) getValue(this, X[20]);
    }

    public boolean getReceiverAfterName() {
        return ((Boolean) getValue(this, X[30])).booleanValue();
    }

    public boolean getRenderCompanionObjectName() {
        return ((Boolean) getValue(this, X[31])).booleanValue();
    }

    public boolean getRenderConstructorDelegation() {
        return ((Boolean) getValue(this, X[15])).booleanValue();
    }

    public boolean getRenderConstructorKeyword() {
        return ((Boolean) getValue(this, X[40])).booleanValue();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return ((Boolean) getValue(this, X[33])).booleanValue();
    }

    public boolean getRenderDefaultModality() {
        return ((Boolean) getValue(this, X[14])).booleanValue();
    }

    public boolean getRenderDefaultVisibility() {
        return ((Boolean) getValue(this, X[13])).booleanValue();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return ((Boolean) getValue(this, X[16])).booleanValue();
    }

    public boolean getRenderTypeExpansions() {
        return ((Boolean) getValue(this, X[42])).booleanValue();
    }

    public boolean getRenderUnabbreviatedType() {
        return ((Boolean) getValue(this, X[41])).booleanValue();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return ((Boolean) getValue(this, X[25])).booleanValue();
    }

    public boolean getStartFromDeclarationKeyword() {
        return ((Boolean) getValue(this, X[5])).booleanValue();
    }

    public boolean getStartFromName() {
        return ((Boolean) getValue(this, X[4])).booleanValue();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return (RenderingFormat) getValue(this, X[28]);
    }

    @NotNull
    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return (Function1) getValue(this, X[23]);
    }

    public boolean getUninferredTypeParameterAsName() {
        return ((Boolean) getValue(this, X[18])).booleanValue();
    }

    public boolean getUnitReturnType() {
        return ((Boolean) getValue(this, X[9])).booleanValue();
    }

    @NotNull
    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return (DescriptorRenderer.ValueParametersHandler) getValue(this, X[27]);
    }

    public boolean getVerbose() {
        return ((Boolean) getValue(this, X[8])).booleanValue();
    }

    public boolean getWithDefinedIn() {
        return ((Boolean) getValue(this, X[1])).booleanValue();
    }

    public boolean getWithSourceFileForTopLevel() {
        return ((Boolean) getValue(this, X[2])).booleanValue();
    }

    public boolean getWithoutReturnType() {
        return ((Boolean) getValue(this, X[10])).booleanValue();
    }

    public boolean getWithoutSuperTypes() {
        return ((Boolean) getValue(this, X[22])).booleanValue();
    }

    public boolean getWithoutTypeParameters() {
        return ((Boolean) getValue(this, X[21])).booleanValue();
    }

    public final boolean isLocked() {
        return this.f81476a;
    }

    public final void lock() {
        this.f81476a = true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy, "<set-?>");
        setValue(this, X[38], annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        Intrinsics.checkNotNullParameter(classifierNamePolicy, "<set-?>");
        setValue(this, X[0], classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z10) {
        setValue(this, X[6], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(@NotNull Set<FqName> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        setValue(this, X[36], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(@NotNull Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        setValue(this, X[3], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "<set-?>");
        setValue(this, X[29], parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z10) {
        setValue(this, X[30], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z10) {
        setValue(this, X[31], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z10) {
        setValue(this, X[4], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(@NotNull RenderingFormat renderingFormat) {
        Intrinsics.checkNotNullParameter(renderingFormat, "<set-?>");
        setValue(this, X[28], renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z10) {
        setValue(this, X[8], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z10) {
        setValue(this, X[1], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z10) {
        setValue(this, X[22], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z10) {
        setValue(this, X[21], Boolean.valueOf(z10));
    }
}
