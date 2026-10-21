package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.core.view.PointerIconCompat;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeMappingMode.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class TypeMappingMode {

    @JvmField
    @NotNull
    public static final TypeMappingMode CLASS_DECLARATION;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final TypeMappingMode DEFAULT;

    @JvmField
    @NotNull
    public static final TypeMappingMode DEFAULT_UAST;

    @JvmField
    @NotNull
    public static final TypeMappingMode GENERIC_ARGUMENT;

    @JvmField
    @NotNull
    public static final TypeMappingMode GENERIC_ARGUMENT_UAST;

    @JvmField
    @NotNull
    public static final TypeMappingMode RETURN_TYPE_BOXED;

    @JvmField
    @NotNull
    public static final TypeMappingMode SUPER_TYPE;

    @JvmField
    @NotNull
    public static final TypeMappingMode SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;

    @JvmField
    @NotNull
    public static final TypeMappingMode VALUE_FOR_ANNOTATION;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f80922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f80925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f80926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final TypeMappingMode f80927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f80928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final TypeMappingMode f80929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final TypeMappingMode f80930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f80931j;

    /* JADX INFO: compiled from: TypeMappingMode.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: TypeMappingMode.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        TypeMappingMode typeMappingMode = null;
        boolean z14 = false;
        TypeMappingMode typeMappingMode2 = null;
        TypeMappingMode typeMappingMode3 = null;
        boolean z15 = false;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TypeMappingMode typeMappingMode4 = new TypeMappingMode(z10, false, z11, z12, z13, typeMappingMode, z14, typeMappingMode2, typeMappingMode3, z15, 1023, defaultConstructorMarker);
        GENERIC_ARGUMENT = typeMappingMode4;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        TypeMappingMode typeMappingMode5 = null;
        TypeMappingMode typeMappingMode6 = null;
        boolean z22 = true;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        TypeMappingMode typeMappingMode7 = new TypeMappingMode(z16, z17, z18, z19, z20, null, z21, typeMappingMode5, typeMappingMode6, z22, 511, defaultConstructorMarker2);
        GENERIC_ARGUMENT_UAST = typeMappingMode7;
        RETURN_TYPE_BOXED = new TypeMappingMode(z10, true, z11, z12, z13, typeMappingMode, z14, typeMappingMode2, typeMappingMode3, z15, PointerIconCompat.TYPE_GRABBING, defaultConstructorMarker);
        int i10 = 988;
        DEFAULT = new TypeMappingMode(z10, false, z11, z12, z13, typeMappingMode4, z14, typeMappingMode2, typeMappingMode3, z15, i10, defaultConstructorMarker);
        DEFAULT_UAST = new TypeMappingMode(z16, z17, z18, z19, z20, typeMappingMode7, z21, typeMappingMode5, typeMappingMode6, z22, 476, defaultConstructorMarker2);
        CLASS_DECLARATION = new TypeMappingMode(z10, true, z11, z12, z13, typeMappingMode4, z14, typeMappingMode2, typeMappingMode3, z15, i10, defaultConstructorMarker);
        boolean z23 = false;
        boolean z24 = true;
        SUPER_TYPE = new TypeMappingMode(z10, z23, z11, z24, z13, typeMappingMode4, z14, typeMappingMode2, typeMappingMode3, z15, 983, defaultConstructorMarker);
        SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new TypeMappingMode(z10, z23, z11, z24, z13, typeMappingMode4, z14, typeMappingMode2, typeMappingMode3, z15, 919, defaultConstructorMarker);
        VALUE_FOR_ANNOTATION = new TypeMappingMode(z10, z23, true, false, z13, typeMappingMode4, z14, typeMappingMode2, typeMappingMode3, z15, 984, defaultConstructorMarker);
    }

    public TypeMappingMode() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.f80928g;
    }

    public final boolean getMapTypeAliases() {
        return this.f80931j;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.f80923b;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.f80922a;
    }

    public final boolean isForAnnotationParameter() {
        return this.f80924c;
    }

    @NotNull
    public final TypeMappingMode toGenericArgumentMode(@NotNull Variance effectiveVariance, boolean z10) {
        Intrinsics.checkNotNullParameter(effectiveVariance, "effectiveVariance");
        if (!z10 || !this.f80924c) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
            if (i10 == 1) {
                TypeMappingMode typeMappingMode = this.f80929h;
                if (typeMappingMode != null) {
                    return typeMappingMode;
                }
            } else if (i10 != 2) {
                TypeMappingMode typeMappingMode2 = this.f80927f;
                if (typeMappingMode2 != null) {
                    return typeMappingMode2;
                }
            } else {
                TypeMappingMode typeMappingMode3 = this.f80930i;
                if (typeMappingMode3 != null) {
                    return typeMappingMode3;
                }
            }
        }
        return this;
    }

    @NotNull
    public final TypeMappingMode wrapInlineClassesMode() {
        return new TypeMappingMode(this.f80922a, true, this.f80924c, this.f80925d, this.f80926e, this.f80927f, this.f80928g, this.f80929h, this.f80930i, false, 512, null);
    }

    public TypeMappingMode(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, @Nullable TypeMappingMode typeMappingMode, boolean z15, @Nullable TypeMappingMode typeMappingMode2, @Nullable TypeMappingMode typeMappingMode3, boolean z16) {
        this.f80922a = z10;
        this.f80923b = z11;
        this.f80924c = z12;
        this.f80925d = z13;
        this.f80926e = z14;
        this.f80927f = typeMappingMode;
        this.f80928g = z15;
        this.f80929h = typeMappingMode2;
        this.f80930i = typeMappingMode3;
        this.f80931j = z16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TypeMappingMode(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, TypeMappingMode typeMappingMode, boolean z15, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z17 = (i10 & 1) != 0 ? true : z10;
        boolean z18 = (i10 & 2) != 0 ? true : z11;
        boolean z19 = (i10 & 4) != 0 ? false : z12;
        boolean z20 = (i10 & 8) != 0 ? false : z13;
        boolean z21 = (i10 & 16) != 0 ? false : z14;
        TypeMappingMode typeMappingMode4 = (i10 & 32) != 0 ? null : typeMappingMode;
        this(z17, z18, z19, z20, z21, typeMappingMode4, (i10 & 64) == 0 ? z15 : true, (i10 & 128) != 0 ? typeMappingMode4 : typeMappingMode2, (i10 & 256) != 0 ? typeMappingMode4 : typeMappingMode3, (i10 & 512) == 0 ? z16 : false);
    }
}
