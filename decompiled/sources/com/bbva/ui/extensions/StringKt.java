package com.bbva.ui.extensions;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0001¨\u0006\u0007"}, d2 = {"initials", "", "number", "", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "toImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 String.kt\ncom/bbva/ui/extensions/StringKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1549#2:33\n1620#2,2:34\n1622#2:42\n766#2:43\n857#2,2:44\n1549#2:46\n1620#2,3:47\n429#3:36\n502#3,5:37\n1#4:50\n*S KotlinDebug\n*F\n+ 1 String.kt\ncom/bbva/ui/extensions/StringKt\n*L\n25#1:33\n25#1:34,2\n25#1:42\n26#1:43\n26#1:44,2\n27#1:46\n27#1:47,3\n25#1:36\n25#1:37,5\n*E\n"})
public final class StringKt {
    @NotNull
    public static final String initials(@NotNull String str, @Nullable Integer num) throws IOException {
        String strTake;
        Intrinsics.checkNotNullParameter(str, "<this>");
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
        for (String str2 : listSplit$default) {
            StringBuilder sb2 = new StringBuilder();
            int length = str2.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str2.charAt(i10);
                if (Character.isLetter(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(string);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Character.valueOf(StringsKt___StringsKt.first((String) it.next())));
        }
        String upperCase = CollectionsKt___CollectionsKt.joinToString$default(arrayList3, "", null, null, 0, null, null, 62, null).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return (num == null || (strTake = StringsKt___StringsKt.take(upperCase, num.intValue())) == null) ? upperCase : strTake;
    }

    public static /* synthetic */ String initials$default(String str, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        return initials(str, num);
    }

    @NotNull
    public static final ImageBitmap toImageBitmap(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArrDecode = Base64.decode(str, 0);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        Intrinsics.checkNotNull(bitmapDecodeByteArray);
        return AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray);
    }
}
