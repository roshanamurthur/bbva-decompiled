package pk;

import androidx.camera.core.processing.f;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.TypesJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@ExperimentalStdlibApi
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n1549#2:231\n1620#2,3:232\n37#3,2:235\n26#4:237\n26#4:238\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n134#1:237\n137#1:238\n*E\n"})
public final class c implements TypeVariable<GenericDeclaration>, Type {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final KTypeParameter f92696p0;

    public c(@NotNull KTypeParameter typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f92696p0 = typeParameter;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (Intrinsics.areEqual(getName(), typeVariable.getName()) && Intrinsics.areEqual(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public Type[] getBounds() {
        List<KType> upperBounds = this.f92696p0.getUpperBounds();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(TypesJVMKt.a((KType) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError(f.d("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f92696p0));
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public String getName() {
        return this.f92696p0.getName();
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
