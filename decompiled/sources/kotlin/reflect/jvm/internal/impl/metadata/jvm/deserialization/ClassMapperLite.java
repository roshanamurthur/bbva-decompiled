package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import ad.d;
import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.core.JsonPointer;
import com.mypinpad.tsdk.isolation.y2;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ClassMapperLite.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ClassMapperLite {

    @NotNull
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f81308a = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f81309b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", ExifInterface.LATITUDE_SOUTH, "Int", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Float", "F", "Long", "J", "Double", "D"});
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, listListOf.size() - 1, 2);
        if (progressionLastElement >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f81308a;
                sb2.append(str);
                sb2.append(JsonPointer.SEPARATOR);
                sb2.append((String) listListOf.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listListOf.get(i11));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(JsonPointer.SEPARATOR);
                linkedHashMap.put(d.f(sb3, (String) listListOf.get(i10), "Array"), Constant.BRACKET_OPEN + ((String) listListOf.get(i11)));
                if (i10 == progressionLastElement) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f81308a + "/Unit", ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            a(linkedHashMap, f.d("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            String strC = g0.c("Function", i12);
            StringBuilder sb4 = new StringBuilder();
            String str4 = f81308a;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i12);
            a(linkedHashMap, strC, sb4.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            a(linkedHashMap, u.f(str5, ".Companion"), c.b(new StringBuilder(), f81308a, "/jvm/internal/", str5, "CompanionObject"));
        }
        f81309b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f81308a + JsonPointer.SEPARATOR + str, "L" + str2 + ';');
    }

    @JvmStatic
    @NotNull
    public static final String mapClass(@NotNull String classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        String str = (String) f81309b.get(classId);
        return str == null ? y2.b(new StringBuilder("L"), l.replace$default(classId, '.', Typography.dollar, false, 4, (Object) null), ';') : str;
    }
}
