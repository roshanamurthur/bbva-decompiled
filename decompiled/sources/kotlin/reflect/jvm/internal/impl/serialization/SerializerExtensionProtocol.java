package kotlin.reflect.jvm.internal.impl.serialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SerializerExtensionProtocol.kt */
/* JADX INFO: loaded from: classes12.dex */
public class SerializerExtensionProtocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ExtensionRegistryLite f81626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> f81627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> f81628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f81629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f81630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f81631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f81632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f81633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f81634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f81635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f81636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> f81637l;

    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> f81638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f81639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f81640p;

    public SerializerExtensionProtocol(@NotNull ExtensionRegistryLite extensionRegistry, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageFqName, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> constructorAnnotation, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> classAnnotation, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> functionAnnotation, @Nullable GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> generatedExtension, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyAnnotation, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyGetterAnnotation, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertySetterAnnotation, @Nullable GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension2, @Nullable GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension3, @Nullable GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension4, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> enumEntryAnnotation, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> compileTimeValue, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> parameterAnnotation, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> typeAnnotation, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> typeParameterAnnotation) {
        Intrinsics.checkNotNullParameter(extensionRegistry, "extensionRegistry");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(constructorAnnotation, "constructorAnnotation");
        Intrinsics.checkNotNullParameter(classAnnotation, "classAnnotation");
        Intrinsics.checkNotNullParameter(functionAnnotation, "functionAnnotation");
        Intrinsics.checkNotNullParameter(propertyAnnotation, "propertyAnnotation");
        Intrinsics.checkNotNullParameter(propertyGetterAnnotation, "propertyGetterAnnotation");
        Intrinsics.checkNotNullParameter(propertySetterAnnotation, "propertySetterAnnotation");
        Intrinsics.checkNotNullParameter(enumEntryAnnotation, "enumEntryAnnotation");
        Intrinsics.checkNotNullParameter(compileTimeValue, "compileTimeValue");
        Intrinsics.checkNotNullParameter(parameterAnnotation, "parameterAnnotation");
        Intrinsics.checkNotNullParameter(typeAnnotation, "typeAnnotation");
        Intrinsics.checkNotNullParameter(typeParameterAnnotation, "typeParameterAnnotation");
        this.f81626a = extensionRegistry;
        this.f81627b = constructorAnnotation;
        this.f81628c = classAnnotation;
        this.f81629d = functionAnnotation;
        this.f81630e = generatedExtension;
        this.f81631f = propertyAnnotation;
        this.f81632g = propertyGetterAnnotation;
        this.f81633h = propertySetterAnnotation;
        this.f81634i = generatedExtension2;
        this.f81635j = generatedExtension3;
        this.f81636k = generatedExtension4;
        this.f81637l = enumEntryAnnotation;
        this.m = compileTimeValue;
        this.f81638n = parameterAnnotation;
        this.f81639o = typeAnnotation;
        this.f81640p = typeParameterAnnotation;
    }

    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> getClassAnnotation() {
        return this.f81628c;
    }

    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> getCompileTimeValue() {
        return this.m;
    }

    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> getConstructorAnnotation() {
        return this.f81627b;
    }

    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> getEnumEntryAnnotation() {
        return this.f81637l;
    }

    @NotNull
    public final ExtensionRegistryLite getExtensionRegistry() {
        return this.f81626a;
    }

    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> getFunctionAnnotation() {
        return this.f81629d;
    }

    @Nullable
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> getFunctionExtensionReceiverAnnotation() {
        return this.f81630e;
    }

    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> getParameterAnnotation() {
        return this.f81638n;
    }

    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyAnnotation() {
        return this.f81631f;
    }

    @Nullable
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyBackingFieldAnnotation() {
        return this.f81635j;
    }

    @Nullable
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyDelegatedFieldAnnotation() {
        return this.f81636k;
    }

    @Nullable
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyExtensionReceiverAnnotation() {
        return this.f81634i;
    }

    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyGetterAnnotation() {
        return this.f81632g;
    }

    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertySetterAnnotation() {
        return this.f81633h;
    }

    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> getTypeAnnotation() {
        return this.f81639o;
    }

    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> getTypeParameterAnnotation() {
        return this.f81640p;
    }
}
