package pk;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.ExperimentalStdlibApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@ExperimentalStdlibApi
public final class a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Type f92691p0;

    public a(@NotNull Type elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f92691p0 = elementType;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof GenericArrayType) && Intrinsics.areEqual(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @NotNull
    public Type getGenericComponentType() {
        return this.f92691p0;
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public String getTypeName() {
        return TypesJVMKt.access$typeToString(this.f92691p0) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
