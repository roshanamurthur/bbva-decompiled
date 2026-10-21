package kotlin.reflect;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\u001b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl;", "Ljava/lang/reflect/WildcardType;", "", "", "Ljava/lang/reflect/Type;", "getUpperBounds", "()[Ljava/lang/reflect/Type;", "getLowerBounds", "", "getTypeName", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "toString", "upperBound", "lowerBound", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "r0", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@ExperimentalStdlibApi
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n26#2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n*L\n163#1:231\n*E\n"})
final class WildcardTypeImpl implements WildcardType, Type {

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final WildcardTypeImpl f79827s0 = new WildcardTypeImpl(null, null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final Type f79828p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final Type f79829q0;

    /* JADX INFO: compiled from: TypesJVM.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl$Companion;", "", "()V", "STAR", "Lkotlin/reflect/WildcardTypeImpl;", "getSTAR", "()Lkotlin/reflect/WildcardTypeImpl;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WildcardTypeImpl getSTAR() {
            return WildcardTypeImpl.f79827s0;
        }
    }

    public WildcardTypeImpl(@Nullable Type type, @Nullable Type type2) {
        this.f79828p0 = type;
        this.f79829q0 = type2;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) other;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getLowerBounds() {
        Type type = this.f79829q0;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public String getTypeName() {
        Type type = this.f79829q0;
        if (type != null) {
            return "? super " + TypesJVMKt.access$typeToString(type);
        }
        Type type2 = this.f79828p0;
        if (type2 == null || Intrinsics.areEqual(type2, Object.class)) {
            return "?";
        }
        return "? extends " + TypesJVMKt.access$typeToString(type2);
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f79828p0;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
