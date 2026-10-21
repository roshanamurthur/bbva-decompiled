package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConstUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ConstUtil {

    @NotNull
    public static final ConstUtil INSTANCE = new ConstUtil();

    @JvmStatic
    public static final boolean canBeUsedForConstVal(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return ConstUtilKt.canBeUsedForConstVal(type);
    }
}
