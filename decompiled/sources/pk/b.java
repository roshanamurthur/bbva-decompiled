package pk;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.TypesJVMKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@ExperimentalStdlibApi
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
public final class b implements ParameterizedType, Type {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Class<?> f92692p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final Type f92693q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Type[] f92694r0;

    /* JADX INFO: compiled from: TypesJVM.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Type, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f92695p0 = new a();

        public a() {
            super(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull Type p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return TypesJVMKt.access$typeToString(p4);
        }
    }

    public b(@NotNull Class<?> rawType, @Nullable Type type, @NotNull List<? extends Type> typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.f92692p0 = rawType;
        this.f92693q0 = type;
        this.f92694r0 = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (Intrinsics.areEqual(this.f92692p0, parameterizedType.getRawType()) && Intrinsics.areEqual(this.f92693q0, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type[] getActualTypeArguments() {
        return this.f92694r0;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Nullable
    public Type getOwnerType() {
        return this.f92693q0;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type getRawType() {
        return this.f92692p0;
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public String getTypeName() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Class<?> cls = this.f92692p0;
        Type type = this.f92693q0;
        if (type != null) {
            sb2.append(TypesJVMKt.access$typeToString(type));
            sb2.append(Constant.MXN_SYMBOL);
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(TypesJVMKt.access$typeToString(cls));
        }
        Type[] typeArr = this.f92694r0;
        if (!(typeArr.length == 0)) {
            ArraysKt___ArraysKt.joinTo(typeArr, sb2, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : a.f92695p0);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public int hashCode() {
        int iHashCode = this.f92692p0.hashCode();
        Type type = this.f92693q0;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
