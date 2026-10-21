package com.bbva.localstorage.extension;

import androidx.camera.core.processing.f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0000*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "obfuscate", "deobfuscate", "local-storage_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 String.kt\ncom/bbva/localstorage/extension/StringKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,25:1\n980#2:26\n1011#2,4:27\n980#2:31\n1011#2,4:32\n*S KotlinDebug\n*F\n+ 1 String.kt\ncom/bbva/localstorage/extension/StringKt\n*L\n13#1:26\n13#1:27,4\n21#1:31\n21#1:32,4\n*E\n"})
public final class StringKt {
    @NotNull
    public static final String deobfuscate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i10 = 0;
        if (!l.startsWith$default(str, "__private_key_local_storage_", false, 2, null)) {
            throw new IllegalArgumentException();
        }
        String strRemovePrefix = StringsKt__StringsKt.removePrefix(str, (CharSequence) "__private_key_local_storage_");
        ArrayList arrayList = new ArrayList(strRemovePrefix.length());
        int i11 = 0;
        while (i10 < strRemovePrefix.length()) {
            arrayList.add(Character.valueOf((char) (strRemovePrefix.charAt(i10) - "wfmpybsof".charAt(i11 % 9))));
            i10++;
            i11++;
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final String obfuscate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayList = new ArrayList(str.length());
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            arrayList.add(Character.valueOf((char) ("wfmpybsof".charAt(i11 % 9) + str.charAt(i10))));
            i10++;
            i11++;
        }
        return f.d("__private_key_local_storage_", CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null));
    }
}
