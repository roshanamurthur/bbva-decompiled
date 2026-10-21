package kotlin.reflect.jvm.internal.impl.renderer;

import bk.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class DescriptorRenderer {

    @JvmField
    @NotNull
    public static final DescriptorRenderer COMPACT;

    @JvmField
    @NotNull
    public static final DescriptorRenderer COMPACT_WITHOUT_SUPERTYPES;

    @JvmField
    @NotNull
    public static final DescriptorRenderer COMPACT_WITH_MODIFIERS;

    @JvmField
    @NotNull
    public static final DescriptorRenderer COMPACT_WITH_SHORT_TYPES;

    @NotNull
    public static final Companion Companion;

    @JvmField
    @NotNull
    public static final DescriptorRenderer DEBUG_TEXT;

    @JvmField
    @NotNull
    public static final DescriptorRenderer FQ_NAMES_IN_TYPES;

    @JvmField
    @NotNull
    public static final DescriptorRenderer FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS;

    @JvmField
    @NotNull
    public static final DescriptorRenderer HTML;

    @JvmField
    @NotNull
    public static final DescriptorRenderer ONLY_NAMES_WITH_SHORT_TYPES;

    @JvmField
    @NotNull
    public static final DescriptorRenderer SHORT_NAMES_IN_TYPES;

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: DescriptorRenderer.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClassKind.values().length];
                try {
                    iArr[ClassKind.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClassKind.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClassKind.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getClassifierKindPrefix(@NotNull ClassifierDescriptorWithTypeParameters classifier) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            if (classifier instanceof TypeAliasDescriptor) {
                return "typealias";
            }
            if (!(classifier instanceof ClassDescriptor)) {
                throw new AssertionError("Unexpected classifier: " + classifier);
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) classifier;
            if (classDescriptor.isCompanionObject()) {
                return "companion object";
            }
            switch (WhenMappings.$EnumSwitchMapping$0[classDescriptor.getKind().ordinal()]) {
                case 1:
                    return Name.LABEL;
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @NotNull
        public final DescriptorRenderer withOptions(@NotNull Function1<? super DescriptorRendererOptions, Unit> changeOptions) {
            Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            changeOptions.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.lock();
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public interface ValueParametersHandler {

        /* JADX INFO: compiled from: DescriptorRenderer.kt */
        public static final class DEFAULT implements ValueParametersHandler {

            @NotNull
            public static final DEFAULT INSTANCE = new DEFAULT();

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendAfterValueParameter(@NotNull ValueParameterDescriptor parameter, int i10, int i11, @NotNull StringBuilder builder) {
                Intrinsics.checkNotNullParameter(parameter, "parameter");
                Intrinsics.checkNotNullParameter(builder, "builder");
                if (i10 != i11 - 1) {
                    builder.append(", ");
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendAfterValueParameters(int i10, @NotNull StringBuilder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.append(")");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendBeforeValueParameter(@NotNull ValueParameterDescriptor parameter, int i10, int i11, @NotNull StringBuilder builder) {
                Intrinsics.checkNotNullParameter(parameter, "parameter");
                Intrinsics.checkNotNullParameter(builder, "builder");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendBeforeValueParameters(int i10, @NotNull StringBuilder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.append("(");
            }
        }

        void appendAfterValueParameter(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i10, int i11, @NotNull StringBuilder sb2);

        void appendAfterValueParameters(int i10, @NotNull StringBuilder sb2);

        void appendBeforeValueParameter(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i10, int i11, @NotNull StringBuilder sb2);

        void appendBeforeValueParameters(int i10, @NotNull StringBuilder sb2);
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class a extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f81460p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            invoke2(descriptorRendererOptions);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DescriptorRendererOptions withOptions) {
            Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
            withOptions.setWithDefinedIn(false);
            withOptions.setModifiers(w.emptySet());
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class b extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f81461p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            invoke2(descriptorRendererOptions);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DescriptorRendererOptions withOptions) {
            Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
            withOptions.setWithDefinedIn(false);
            withOptions.setModifiers(w.emptySet());
            withOptions.setWithoutSuperTypes(true);
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class c extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f81462p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            invoke2(descriptorRendererOptions);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DescriptorRendererOptions withOptions) {
            Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
            withOptions.setWithDefinedIn(false);
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class d extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f81463p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            invoke2(descriptorRendererOptions);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DescriptorRendererOptions withOptions) {
            Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
            withOptions.setModifiers(w.emptySet());
            withOptions.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
            withOptions.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class e extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f81464p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            invoke2(descriptorRendererOptions);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DescriptorRendererOptions withOptions) {
            Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
            withOptions.setDebugMode(true);
            withOptions.setClassifierNamePolicy(ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
            withOptions.setModifiers(DescriptorRendererModifier.ALL);
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class f extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f81465p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            invoke2(descriptorRendererOptions);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DescriptorRendererOptions withOptions) {
            Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
            withOptions.setModifiers(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class g extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f81466p0 = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            invoke2(descriptorRendererOptions);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DescriptorRendererOptions withOptions) {
            Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
            withOptions.setModifiers(DescriptorRendererModifier.ALL);
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class h extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f81467p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            invoke2(descriptorRendererOptions);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DescriptorRendererOptions withOptions) {
            Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
            withOptions.setTextFormat(RenderingFormat.HTML);
            withOptions.setModifiers(DescriptorRendererModifier.ALL);
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class i extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f81468p0 = new i(1);

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            invoke2(descriptorRendererOptions);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DescriptorRendererOptions withOptions) {
            Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
            withOptions.setWithDefinedIn(false);
            withOptions.setModifiers(w.emptySet());
            withOptions.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
            withOptions.setWithoutTypeParameters(true);
            withOptions.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.NONE);
            withOptions.setReceiverAfterName(true);
            withOptions.setRenderCompanionObjectName(true);
            withOptions.setWithoutSuperTypes(true);
            withOptions.setStartFromName(true);
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class j extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f81469p0 = new j(1);

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            invoke2(descriptorRendererOptions);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DescriptorRendererOptions withOptions) {
            Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
            withOptions.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
            withOptions.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        COMPACT_WITH_MODIFIERS = companion.withOptions(c.f81462p0);
        COMPACT = companion.withOptions(a.f81460p0);
        COMPACT_WITHOUT_SUPERTYPES = companion.withOptions(b.f81461p0);
        COMPACT_WITH_SHORT_TYPES = companion.withOptions(d.f81463p0);
        ONLY_NAMES_WITH_SHORT_TYPES = companion.withOptions(i.f81468p0);
        FQ_NAMES_IN_TYPES = companion.withOptions(f.f81465p0);
        FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS = companion.withOptions(g.f81466p0);
        SHORT_NAMES_IN_TYPES = companion.withOptions(j.f81469p0);
        DEBUG_TEXT = companion.withOptions(e.f81464p0);
        HTML = companion.withOptions(h.f81467p0);
    }

    public static /* synthetic */ String renderAnnotation$default(DescriptorRenderer descriptorRenderer, AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i10 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return descriptorRenderer.renderAnnotation(annotationDescriptor, annotationUseSiteTarget);
    }

    @NotNull
    public abstract String render(@NotNull DeclarationDescriptor declarationDescriptor);

    @NotNull
    public abstract String renderAnnotation(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget);

    @NotNull
    public abstract String renderFlexibleType(@NotNull String str, @NotNull String str2, @NotNull KotlinBuiltIns kotlinBuiltIns);

    @NotNull
    public abstract String renderFqName(@NotNull FqNameUnsafe fqNameUnsafe);

    @NotNull
    public abstract String renderName(@NotNull kotlin.reflect.jvm.internal.impl.name.Name name, boolean z10);

    @NotNull
    public abstract String renderType(@NotNull KotlinType kotlinType);

    @NotNull
    public abstract String renderTypeProjection(@NotNull TypeProjection typeProjection);

    @NotNull
    public final DescriptorRenderer withOptions(@NotNull Function1<? super DescriptorRendererOptions, Unit> changeOptions) {
        Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImplCopy = ((DescriptorRendererImpl) this).getOptions().copy();
        changeOptions.invoke(descriptorRendererOptionsImplCopy);
        descriptorRendererOptionsImplCopy.lock();
        return new DescriptorRendererImpl(descriptorRendererOptionsImplCopy);
    }
}
