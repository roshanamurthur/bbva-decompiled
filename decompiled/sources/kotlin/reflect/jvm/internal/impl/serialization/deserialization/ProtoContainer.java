package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProtoContainer.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class ProtoContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NameResolver f81733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TypeTable f81734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final SourceElement f81735c;

    /* JADX INFO: compiled from: ProtoContainer.kt */
    public static final class Class extends ProtoContainer {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ProtoBuf.Class f81736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Class f81737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final ClassId f81738f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final ProtoBuf.Class.Kind f81739g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f81740h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(@NotNull ProtoBuf.Class classProto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement, @Nullable Class r10) {
            super(nameResolver, typeTable, sourceElement, null);
            Intrinsics.checkNotNullParameter(classProto, "classProto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f81736d = classProto;
            this.f81737e = r10;
            this.f81738f = NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName());
            ProtoBuf.Class.Kind kind = Flags.CLASS_KIND.get(classProto.getFlags());
            this.f81739g = kind == null ? ProtoBuf.Class.Kind.CLASS : kind;
            Boolean bool = Flags.IS_INNER.get(classProto.getFlags());
            Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
            this.f81740h = bool.booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        public FqName debugFqName() {
            FqName fqNameAsSingleFqName = this.f81738f.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName, "asSingleFqName(...)");
            return fqNameAsSingleFqName;
        }

        @NotNull
        public final ClassId getClassId() {
            return this.f81738f;
        }

        @NotNull
        public final ProtoBuf.Class getClassProto() {
            return this.f81736d;
        }

        @NotNull
        public final ProtoBuf.Class.Kind getKind() {
            return this.f81739g;
        }

        @Nullable
        public final Class getOuterClass() {
            return this.f81737e;
        }

        public final boolean isInner() {
            return this.f81740h;
        }
    }

    /* JADX INFO: compiled from: ProtoContainer.kt */
    public static final class Package extends ProtoContainer {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final FqName f81741d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(@NotNull FqName fqName, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f81741d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        public FqName debugFqName() {
            return this.f81741d;
        }
    }

    public ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this.f81733a = nameResolver;
        this.f81734b = typeTable;
        this.f81735c = sourceElement;
    }

    @NotNull
    public abstract FqName debugFqName();

    @NotNull
    public final NameResolver getNameResolver() {
        return this.f81733a;
    }

    @Nullable
    public final SourceElement getSource() {
        return this.f81735c;
    }

    @NotNull
    public final TypeTable getTypeTable() {
        return this.f81734b;
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + ": " + debugFqName();
    }
}
