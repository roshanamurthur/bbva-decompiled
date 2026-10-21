package com.bbva.cellswidgets.edittext;

import com.bbva.cellswidgets.MaskTextWatcher;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextMask.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/bbva/cellswidgets/edittext/TextMask;", "", "", "textToMask", "", "selectionEnd", "Lcom/bbva/cellswidgets/edittext/MaskResult;", "mask", "", "maskFormat", "", "wildcard", "<init>", "(Ljava/lang/String;C)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTextMask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMask.kt\ncom/bbva/cellswidgets/edittext/TextMask\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,64:1\n451#2:65\n462#2:66\n1183#2,2:67\n463#2,2:69\n1185#2:71\n465#2:72\n970#2:73\n1041#2,3:74\n151#2,6:77\n*S KotlinDebug\n*F\n+ 1 TextMask.kt\ncom/bbva/cellswidgets/edittext/TextMask\n*L\n17#1:65\n17#1:66\n17#1:67,2\n17#1:69,2\n17#1:71\n17#1:72\n31#1:73\n31#1:74,3\n46#1:77,6\n*E\n"})
public final class TextMask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f27293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f27294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27295c;

    public TextMask(@NotNull String maskFormat, char c10) {
        Intrinsics.checkNotNullParameter(maskFormat, "maskFormat");
        this.f27293a = maskFormat;
        this.f27294b = c10;
        this.f27295c = -1;
    }

    public static /* synthetic */ MaskResult mask$default(TextMask textMask, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return textMask.mask(charSequence, i10);
    }

    @NotNull
    public final MaskResult mask(@NotNull CharSequence textToMask, int selectionEnd) {
        char c10;
        Intrinsics.checkNotNullParameter(textToMask, "textToMask");
        if (!l.isBlank(textToMask)) {
            String str = this.f27293a;
            if (!l.isBlank(str)) {
                ArrayList arrayList = new ArrayList(str.length());
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int length = str.length();
                    c10 = this.f27294b;
                    if (i10 >= length) {
                        break;
                    }
                    char cCharAt = str.charAt(i10);
                    if (i11 >= i12 && i11 < textToMask.length()) {
                        i12++;
                    }
                    if (cCharAt == c10 && i11 < textToMask.length()) {
                        cCharAt = textToMask.charAt(i11);
                        i11++;
                    }
                    arrayList.add(Character.valueOf(cCharAt));
                    i10++;
                }
                MaskResult maskResult = new MaskResult(CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null), i12);
                CharSequence text = maskResult.getText();
                int length2 = text.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i13 = -1;
                        break;
                    }
                    if (text.charAt(i13) == c10) {
                        break;
                    }
                    i13++;
                }
                int length3 = i13;
                int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(text, textToMask.charAt(textToMask.length() - 1), 0, false, 6, (Object) null);
                if (length3 == this.f27295c) {
                    length3 = text.length();
                } else if (text.charAt(length3 - 1) != textToMask.charAt(textToMask.length() - 1)) {
                    length3 = iLastIndexOf$default + 1;
                }
                String strSubstring = str.substring(0, length3);
                StringBuilder sbC = a.c(strSubstring, "substring(...)");
                int i14 = 0;
                int i15 = 0;
                while (i14 < strSubstring.length()) {
                    char cCharAt2 = strSubstring.charAt(i14);
                    int i16 = i15 + 1;
                    if (i15 <= selectionEnd && cCharAt2 != c10) {
                        sbC.append(cCharAt2);
                    }
                    i14++;
                    i15 = i16;
                }
                String string = sbC.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return new MaskResult(maskResult.getText().subSequence(0, length3).toString(), string.length() + selectionEnd);
            }
        }
        return new MaskResult(textToMask, selectionEnd);
    }

    public /* synthetic */ TextMask(String str, char c10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? MaskTextWatcher.WILDCARD : c10);
    }
}
