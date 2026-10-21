package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class JvmType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Primitive f80905a = new Primitive(JvmPrimitiveType.BOOLEAN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Primitive f80906b = new Primitive(JvmPrimitiveType.CHAR);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Primitive f80907c = new Primitive(JvmPrimitiveType.BYTE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Primitive f80908d = new Primitive(JvmPrimitiveType.SHORT);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Primitive f80909e = new Primitive(JvmPrimitiveType.INT);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Primitive f80910f = new Primitive(JvmPrimitiveType.FLOAT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Primitive f80911g = new Primitive(JvmPrimitiveType.LONG);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Primitive f80912h = new Primitive(JvmPrimitiveType.DOUBLE);

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public static final class Array extends JvmType {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final JvmType f80913i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(@NotNull JvmType elementType) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            this.f80913i = elementType;
        }

        @NotNull
        public final JvmType getElementType() {
            return this.f80913i;
        }
    }

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Primitive getBOOLEAN$descriptors_jvm() {
            return JvmType.f80905a;
        }

        @NotNull
        public final Primitive getBYTE$descriptors_jvm() {
            return JvmType.f80907c;
        }

        @NotNull
        public final Primitive getCHAR$descriptors_jvm() {
            return JvmType.f80906b;
        }

        @NotNull
        public final Primitive getDOUBLE$descriptors_jvm() {
            return JvmType.f80912h;
        }

        @NotNull
        public final Primitive getFLOAT$descriptors_jvm() {
            return JvmType.f80910f;
        }

        @NotNull
        public final Primitive getINT$descriptors_jvm() {
            return JvmType.f80909e;
        }

        @NotNull
        public final Primitive getLONG$descriptors_jvm() {
            return JvmType.f80911g;
        }

        @NotNull
        public final Primitive getSHORT$descriptors_jvm() {
            return JvmType.f80908d;
        }
    }

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public static final class Object extends JvmType {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final String f80914i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Object(@NotNull String internalName) {
            super(null);
            Intrinsics.checkNotNullParameter(internalName, "internalName");
            this.f80914i = internalName;
        }

        @NotNull
        public final String getInternalName() {
            return this.f80914i;
        }
    }

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public static final class Primitive extends JvmType {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final JvmPrimitiveType f80915i;

        public Primitive(@Nullable JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.f80915i = jvmPrimitiveType;
        }

        @Nullable
        public final JvmPrimitiveType getJvmPrimitiveType() {
            return this.f80915i;
        }
    }

    public JvmType() {
    }

    public /* synthetic */ JvmType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        return JvmTypeFactoryImpl.f80916a.toString(this);
    }
}
