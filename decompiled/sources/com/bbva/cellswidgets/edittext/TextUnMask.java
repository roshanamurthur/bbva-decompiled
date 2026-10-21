package com.bbva.cellswidgets.edittext;

import com.bbva.cellswidgets.MaskTextWatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextUnMask.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Lcom/bbva/cellswidgets/edittext/TextUnMask;", "", "", "text", "", "cursorPosition", "deletedChars", "Lcom/bbva/cellswidgets/edittext/UnmaskResult;", "unmask", "", "mask", "", "wildcard", "<init>", "(Ljava/lang/String;C)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTextUnMask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnMask.kt\ncom/bbva/cellswidgets/edittext/TextUnMask\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,69:1\n1183#2,3:70\n*S KotlinDebug\n*F\n+ 1 TextUnMask.kt\ncom/bbva/cellswidgets/edittext/TextUnMask\n*L\n20#1:70,3\n*E\n"})
public final class TextUnMask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f27296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f27297b;

    public TextUnMask(@NotNull String mask, char c10) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.f27296a = mask;
        this.f27297b = c10;
    }

    public static /* synthetic */ UnmaskResult unmask$default(TextUnMask textUnMask, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return textUnMask.unmask(charSequence, i10, i11);
    }

    @NotNull
    public final UnmaskResult unmask(@NotNull CharSequence text, int cursorPosition, int deletedChars) {
        Intrinsics.checkNotNullParameter(text, "text");
        StringBuilder sb2 = new StringBuilder();
        int length = text.length();
        String str = this.f27296a;
        int iMin = Math.min(length, str.length());
        int iMin2 = Math.min(text.length(), str.length());
        String strSubstring = str.substring(0, iMin2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string = text.subSequence(0, iMin2).toString();
        for (int i10 = 0; i10 < iMin2; i10++) {
            char cCharAt = strSubstring.charAt(i10);
            char cCharAt2 = string.charAt(i10);
            if (cCharAt != '#' && cCharAt != cCharAt2) {
                sb2.append(text);
                String strSubstring2 = str.substring(0, Math.min(cursorPosition, str.length()));
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                int length2 = cursorPosition - l.replace$default(strSubstring2, "#", "", false, 4, (Object) null).length();
                String strSubstring3 = str.substring(Math.min(cursorPosition, str.length()), Math.min(cursorPosition + deletedChars, str.length()));
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                int length3 = deletedChars - l.replace$default(strSubstring3, "#", "", false, 4, (Object) null).length();
                String string2 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return new UnmaskResult(string2, length2, length3);
            }
        }
        String strSubstring4 = str.substring(0, iMin);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        String string3 = text.subSequence(0, iMin).toString();
        int i11 = 0;
        int i12 = 0;
        while (i11 < strSubstring4.length()) {
            int i13 = i12 + 1;
            if (strSubstring4.charAt(i11) == this.f27297b) {
                sb2.append(string3.charAt(i12));
            }
            i11++;
            i12 = i13;
        }
        String strSubstring5 = str.substring(0, Math.min(cursorPosition, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        int length4 = cursorPosition - l.replace$default(strSubstring5, "#", "", false, 4, (Object) null).length();
        String strSubstring6 = str.substring(Math.min(cursorPosition, str.length()), Math.min(cursorPosition + deletedChars, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
        int length5 = deletedChars - l.replace$default(strSubstring6, "#", "", false, 4, (Object) null).length();
        String string4 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        return new UnmaskResult(string4, length4, length5);
    }

    public /* synthetic */ TextUnMask(String str, char c10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? MaskTextWatcher.WILDCARD : c10);
    }
}
