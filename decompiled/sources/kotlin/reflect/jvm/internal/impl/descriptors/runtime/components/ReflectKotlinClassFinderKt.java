package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.Typography;
import kotlin.text.l;

/* JADX INFO: compiled from: ReflectKotlinClassFinder.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ReflectKotlinClassFinderKt {
    public static final String access$toRuntimeFqName(ClassId classId) {
        String strAsString = classId.getRelativeClassName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        String strReplace$default = l.replace$default(strAsString, '.', Typography.dollar, false, 4, (Object) null);
        if (classId.getPackageFqName().isRoot()) {
            return strReplace$default;
        }
        return classId.getPackageFqName() + '.' + strReplace$default;
    }
}
