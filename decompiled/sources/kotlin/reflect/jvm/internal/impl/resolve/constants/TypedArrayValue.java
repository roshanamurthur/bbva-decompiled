package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class TypedArrayValue extends ArrayValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final KotlinType f81555c;

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class a extends Lambda implements Function1<ModuleDescriptor, KotlinType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KotlinType f81556p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KotlinType kotlinType) {
            super(1);
            this.f81556p0 = kotlinType;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KotlinType invoke(@NotNull ModuleDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f81556p0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(@NotNull List<? extends ConstantValue<?>> value, @NotNull KotlinType type) {
        super(value, new a(type));
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f81555c = type;
    }

    @NotNull
    public final KotlinType getType() {
        return this.f81555c;
    }
}
