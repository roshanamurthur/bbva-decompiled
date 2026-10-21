package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConstantValueFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nConstantValueFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1603#2,9:104\n1855#2:113\n1856#2:115\n1612#2:116\n1#3:114\n*S KotlinDebug\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n*L\n64#1:104,9\n64#1:113\n64#1:115\n64#1:116\n64#1:114\n*E\n"})
public final class ConstantValueFactory {

    @NotNull
    public static final ConstantValueFactory INSTANCE = new ConstantValueFactory();

    /* JADX INFO: compiled from: ConstantValueFactory.kt */
    public static final class a extends Lambda implements Function1<ModuleDescriptor, KotlinType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PrimitiveType f81543p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PrimitiveType primitiveType) {
            super(1);
            this.f81543p0 = primitiveType;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KotlinType invoke(@NotNull ModuleDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SimpleType primitiveArrayKotlinType = it.getBuiltIns().getPrimitiveArrayKotlinType(this.f81543p0);
            Intrinsics.checkNotNullExpressionValue(primitiveArrayKotlinType, "getPrimitiveArrayKotlinType(...)");
            return primitiveArrayKotlinType;
        }
    }

    public static /* synthetic */ ConstantValue createConstantValue$default(ConstantValueFactory constantValueFactory, Object obj, ModuleDescriptor moduleDescriptor, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            moduleDescriptor = null;
        }
        return constantValueFactory.createConstantValue(obj, moduleDescriptor);
    }

    public final ArrayValue a(List<?> list, ModuleDescriptor moduleDescriptor, PrimitiveType primitiveType) {
        List list2 = CollectionsKt___CollectionsKt.toList(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ConstantValue constantValueCreateConstantValue$default = createConstantValue$default(this, it.next(), null, 2, null);
            if (constantValueCreateConstantValue$default != null) {
                arrayList.add(constantValueCreateConstantValue$default);
            }
        }
        if (moduleDescriptor == null) {
            return new ArrayValue(arrayList, new a(primitiveType));
        }
        SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
        Intrinsics.checkNotNullExpressionValue(primitiveArrayKotlinType, "getPrimitiveArrayKotlinType(...)");
        return new TypedArrayValue(arrayList, primitiveArrayKotlinType);
    }

    @NotNull
    public final ArrayValue createArrayValue(@NotNull List<? extends ConstantValue<?>> value, @NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        return new TypedArrayValue(value, type);
    }

    @Nullable
    public final ConstantValue<?> createConstantValue(@Nullable Object obj, @Nullable ModuleDescriptor moduleDescriptor) {
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        if (obj instanceof byte[]) {
            return a(ArraysKt___ArraysKt.toList((byte[]) obj), moduleDescriptor, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return a(ArraysKt___ArraysKt.toList((short[]) obj), moduleDescriptor, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return a(ArraysKt___ArraysKt.toList((int[]) obj), moduleDescriptor, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return a(ArraysKt___ArraysKt.toList((long[]) obj), moduleDescriptor, PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return a(ArraysKt___ArraysKt.toList((char[]) obj), moduleDescriptor, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return a(ArraysKt___ArraysKt.toList((float[]) obj), moduleDescriptor, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return a(ArraysKt___ArraysKt.toList((double[]) obj), moduleDescriptor, PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return a(ArraysKt___ArraysKt.toList((boolean[]) obj), moduleDescriptor, PrimitiveType.BOOLEAN);
        }
        if (obj == null) {
            return new NullValue();
        }
        return null;
    }
}
