package kotlin.jvm.internal;

import androidx.webkit.ProxyConfig;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlinx.serialization.internal.CollectionDescriptorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeReference.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.4")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u001b\n\u0002\b\t\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B1\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*B'\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b)\u0010+J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010#\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0015R\u0014\u0010'\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Lkotlin/reflect/KClassifier;", "p0", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "q0", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "arguments", "r0", "Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "()V", "platformTypeUpperBound", "s0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFlags$kotlin_stdlib", "()I", "getFlags$kotlin_stdlib$annotations", "flags", "", "getAnnotations", "annotations", "isMarkedNullable", "()Z", "<init>", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class TypeReference implements KType {
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final KClassifier classifier;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<KTypeProjection> arguments;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final KType platformTypeUpperBound;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final int flags;

    /* JADX INFO: compiled from: TypeReference.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: TypeReference.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/reflect/KTypeProjection;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<KTypeProjection, CharSequence> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final CharSequence invoke(@NotNull KTypeProjection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TypeReference.access$asString(TypeReference.this, it);
        }
    }

    @SinceKotlin(version = "1.6")
    public TypeReference(@NotNull KClassifier classifier, @NotNull List<KTypeProjection> arguments, @Nullable KType kType, int i10) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.platformTypeUpperBound = kType;
        this.flags = i10;
    }

    public static final String access$asString(TypeReference typeReference, KTypeProjection kTypeProjection) {
        String strValueOf;
        typeReference.getClass();
        if (kTypeProjection.getVariance() == null) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        KType type = kTypeProjection.getType();
        TypeReference typeReference2 = type instanceof TypeReference ? (TypeReference) type : null;
        if (typeReference2 == null || (strValueOf = typeReference2.a(true)) == null) {
            strValueOf = String.valueOf(kTypeProjection.getType());
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[kTypeProjection.getVariance().ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in ".concat(strValueOf);
        }
        if (i10 == 3) {
            return "out ".concat(strValueOf);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String a(boolean z10) {
        String name;
        KClassifier classifier = getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        Class javaClass = kClass != null ? JvmClassMappingKt.getJavaClass(kClass) : null;
        if (javaClass == null) {
            name = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (javaClass.isArray()) {
            if (Intrinsics.areEqual(javaClass, boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (Intrinsics.areEqual(javaClass, char[].class)) {
                name = "kotlin.CharArray";
            } else if (Intrinsics.areEqual(javaClass, byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (Intrinsics.areEqual(javaClass, short[].class)) {
                name = "kotlin.ShortArray";
            } else if (Intrinsics.areEqual(javaClass, int[].class)) {
                name = "kotlin.IntArray";
            } else if (Intrinsics.areEqual(javaClass, float[].class)) {
                name = "kotlin.FloatArray";
            } else if (Intrinsics.areEqual(javaClass, long[].class)) {
                name = "kotlin.LongArray";
            } else {
                name = Intrinsics.areEqual(javaClass, double[].class) ? "kotlin.DoubleArray" : CollectionDescriptorsKt.ARRAY_NAME;
            }
        } else if (z10 && javaClass.isPrimitive()) {
            KClassifier classifier2 = getClassifier();
            Intrinsics.checkNotNull(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = JvmClassMappingKt.getJavaObjectType((KClass) classifier2).getName();
        } else {
            name = javaClass.getName();
        }
        String strB = androidx.camera.core.impl.utils.a.b(name, getArguments().isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new a(), 24, null), isMarkedNullable() ? "?" : "");
        KType kType = this.platformTypeUpperBound;
        if (!(kType instanceof TypeReference)) {
            return strB;
        }
        String strA = ((TypeReference) kType).a(true);
        if (Intrinsics.areEqual(strA, strB)) {
            return strB;
        }
        if (Intrinsics.areEqual(strA, strB + '?')) {
            return strB + '!';
        }
        return "(" + strB + ".." + strA + RootService.CLOSE_BRACKET;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) other;
            if (Intrinsics.areEqual(getClassifier(), typeReference.getClassifier()) && Intrinsics.areEqual(getArguments(), typeReference.getArguments()) && Intrinsics.areEqual(this.platformTypeUpperBound, typeReference.platformTypeUpperBound) && this.flags == typeReference.flags) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public List<KTypeProjection> getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public KClassifier getClassifier() {
        return this.classifier;
    }

    /* JADX INFO: renamed from: getFlags$kotlin_stdlib, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    @Nullable
    /* JADX INFO: renamed from: getPlatformTypeUpperBound$kotlin_stdlib, reason: from getter */
    public final KType getPlatformTypeUpperBound() {
        return this.platformTypeUpperBound;
    }

    public int hashCode() {
        return ((getArguments().hashCode() + (getClassifier().hashCode() * 31)) * 31) + this.flags;
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return (this.flags & 1) != 0;
    }

    @NotNull
    public String toString() {
        return a(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(@NotNull KClassifier classifier, @NotNull List<KTypeProjection> arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }

    @SinceKotlin(version = "1.6")
    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    @SinceKotlin(version = "1.6")
    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }
}
