package kotlin.reflect.jvm.internal;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReflectionObjectRenderer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderFunction", "invoke", "renderLambda", "Lkotlin/reflect/jvm/internal/KParameterImpl;", "parameter", "renderParameter", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "renderType", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
public final class ReflectionObjectRenderer {

    @NotNull
    public static final ReflectionObjectRenderer INSTANCE = new ReflectionObjectRenderer();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final DescriptorRenderer f80033a = DescriptorRenderer.FQ_NAMES_IN_TYPES;

    /* JADX INFO: compiled from: ReflectionObjectRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            try {
                iArr[KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KParameter.Kind.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KParameter.Kind.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: ReflectionObjectRenderer.kt */
    public static final class a extends Lambda implements Function1<ValueParameterDescriptor, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80034p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final CharSequence invoke(ValueParameterDescriptor valueParameterDescriptor) {
            ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.INSTANCE;
            KotlinType type = valueParameterDescriptor.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return reflectionObjectRenderer.renderType(type);
        }
    }

    /* JADX INFO: compiled from: ReflectionObjectRenderer.kt */
    public static final class b extends Lambda implements Function1<ValueParameterDescriptor, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f80035p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final CharSequence invoke(ValueParameterDescriptor valueParameterDescriptor) {
            ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.INSTANCE;
            KotlinType type = valueParameterDescriptor.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return reflectionObjectRenderer.renderType(type);
        }
    }

    public final void a(StringBuilder sb2, CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(callableDescriptor);
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        if (instanceReceiverParameter != null) {
            KotlinType type = instanceReceiverParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(renderType(type));
            sb2.append(Constant.DOT_STRING);
        }
        boolean z10 = (instanceReceiverParameter == null || extensionReceiverParameter == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        if (extensionReceiverParameter != null) {
            KotlinType type2 = extensionReceiverParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            sb2.append(renderType(type2));
            sb2.append(Constant.DOT_STRING);
        }
        if (z10) {
            sb2.append(")");
        }
    }

    @NotNull
    public final String renderFunction(@NotNull FunctionDescriptor descriptor) throws IOException {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.a(sb2, descriptor);
        Name name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(f80033a.renderName(name, true));
        List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        CollectionsKt___CollectionsKt.joinTo(valueParameters, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : a.f80034p0);
        sb2.append(": ");
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        sb2.append(reflectionObjectRenderer.renderType(returnType));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String renderLambda(@NotNull FunctionDescriptor invoke) throws IOException {
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.a(sb2, invoke);
        List<ValueParameterDescriptor> valueParameters = invoke.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        CollectionsKt___CollectionsKt.joinTo(valueParameters, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : b.f80035p0);
        sb2.append(" -> ");
        KotlinType returnType = invoke.getReturnType();
        Intrinsics.checkNotNull(returnType);
        sb2.append(reflectionObjectRenderer.renderType(returnType));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String renderParameter(@NotNull KParameterImpl parameter) throws IOException {
        String strRenderFunction;
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = WhenMappings.$EnumSwitchMapping$0[parameter.getKind().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else if (i10 == 3) {
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        CallableMemberDescriptor descriptor = parameter.getCallable().getDescriptor();
        reflectionObjectRenderer.getClass();
        if (descriptor instanceof PropertyDescriptor) {
            strRenderFunction = reflectionObjectRenderer.renderProperty((PropertyDescriptor) descriptor);
        } else {
            if (!(descriptor instanceof FunctionDescriptor)) {
                throw new IllegalStateException(("Illegal callable: " + descriptor).toString());
            }
            strRenderFunction = reflectionObjectRenderer.renderFunction((FunctionDescriptor) descriptor);
        }
        sb2.append(strRenderFunction);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String renderProperty(@NotNull PropertyDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.isVar() ? "var " : "val ");
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.a(sb2, descriptor);
        Name name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(f80033a.renderName(name, true));
        sb2.append(": ");
        KotlinType type = descriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb2.append(reflectionObjectRenderer.renderType(type));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String renderType(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return f80033a.renderType(type);
    }
}
