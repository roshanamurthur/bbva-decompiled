package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: BuiltinSpecialProperties.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class BuiltinSpecialPropertiesKt {
    public static final FqName access$child(FqName fqName, String str) {
        FqName fqNameChild = fqName.child(Name.identifier(str));
        Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(...)");
        return fqNameChild;
    }

    public static final FqName access$childSafe(FqNameUnsafe fqNameUnsafe, String str) {
        FqName safe = fqNameUnsafe.child(Name.identifier(str)).toSafe();
        Intrinsics.checkNotNullExpressionValue(safe, "toSafe(...)");
        return safe;
    }
}
