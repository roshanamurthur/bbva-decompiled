package kotlin.reflect.jvm.internal.impl.name;

import bl.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FqNamesUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nFqNamesUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FqNamesUtil.kt\norg/jetbrains/kotlin/name/FqNamesUtilKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n526#2:87\n511#2,6:88\n1#3:94\n*S KotlinDebug\n*F\n+ 1 FqNamesUtil.kt\norg/jetbrains/kotlin/name/FqNamesUtilKt\n*L\n73#1:87\n73#1:88,6\n*E\n"})
public final class FqNamesUtilKt {

    /* JADX INFO: compiled from: FqNamesUtil.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final <V> V findValueForMostSpecificFqname(@NotNull FqName fqName, @NotNull Map<FqName, ? extends V> values) {
        Object next;
        Intrinsics.checkNotNullParameter(fqName, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<FqName, ? extends V> entry : values.entrySet()) {
            FqName key = entry.getKey();
            if (Intrinsics.areEqual(fqName, key) || isChildOf(fqName, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = tail((FqName) ((Map.Entry) next).getKey(), fqName).asString().length();
                do {
                    Object next2 = it.next();
                    int length2 = tail((FqName) ((Map.Entry) next2).getKey(), fqName).asString().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    public static final boolean isChildOf(@NotNull FqName fqName, @NotNull FqName packageName) {
        Intrinsics.checkNotNullParameter(fqName, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return Intrinsics.areEqual(parentOrNull(fqName), packageName);
    }

    public static final boolean isSubpackageOf(@NotNull FqName fqName, @NotNull FqName packageName) {
        Intrinsics.checkNotNullParameter(fqName, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Intrinsics.areEqual(fqName, packageName) || packageName.isRoot()) {
            return true;
        }
        String strAsString = fqName.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        String strAsString2 = packageName.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString2, "asString(...)");
        return l.startsWith$default(strAsString, strAsString2, false, 2, null) && strAsString.charAt(strAsString2.length()) == '.';
    }

    public static final boolean isValidJavaFqName(@Nullable String str) {
        if (str == null) {
            return false;
        }
        a aVar = a.BEGINNING;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                aVar = a.MIDDLE;
            } else if (i11 != 3) {
                continue;
            } else if (cCharAt == '.') {
                aVar = a.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                return false;
            }
        }
        return aVar != a.AFTER_DOT;
    }

    @Nullable
    public static final FqName parentOrNull(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "<this>");
        if (fqName.isRoot()) {
            return null;
        }
        return fqName.parent();
    }

    @NotNull
    public static final FqName tail(@NotNull FqName fqName, @NotNull FqName prefix) {
        Intrinsics.checkNotNullParameter(fqName, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!isSubpackageOf(fqName, prefix) || prefix.isRoot()) {
            return fqName;
        }
        if (Intrinsics.areEqual(fqName, prefix)) {
            FqName ROOT = FqName.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            return ROOT;
        }
        String strAsString = fqName.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        String strSubstring = strAsString.substring(prefix.asString().length() + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new FqName(strSubstring);
    }
}
