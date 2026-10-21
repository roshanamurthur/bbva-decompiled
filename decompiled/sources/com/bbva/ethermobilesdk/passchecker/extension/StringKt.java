package com.bbva.ethermobilesdk.passchecker.extension;

import bk.k;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.Grouping;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000\u001a\f\u0010\t\u001a\u00020\u0007*\u00020\u0000H\u0000\u001a\f\u0010\n\u001a\u00020\u0007*\u00020\u0000H\u0000\u001a\f\u0010\u000b\u001a\u00020\u0007*\u00020\u0000H\u0000\u001a\u0016\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007H\u0000¨\u0006\u000e"}, d2 = {"", "", "validateLetters", "validateNumbers", "validateSpecials", "extraChars", "validateSpecialsMatches", "", "countLetters", "countLettersLowercase", "countLettersUppercase", "countNumbers", "countSpecials", "appearances", "passchecker_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 String.kt\ncom/bbva/ethermobilesdk/passchecker/extension/StringKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,47:1\n957#2:48\n200#3,4:49\n*S KotlinDebug\n*F\n+ 1 String.kt\ncom/bbva/ethermobilesdk/passchecker/extension/StringKt\n*L\n34#1:48\n35#1:49,4\n*E\n"})
public final class StringKt {
    public static final int appearances(@NotNull final String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Map mapEachCount = k.eachCount(new Grouping<Character, Character>() { // from class: com.bbva.ethermobilesdk.passchecker.extension.StringKt$appearances$$inlined$groupingBy$1
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Character, java.lang.Object] */
            @Override // kotlin.collections.Grouping
            public /* bridge */ /* synthetic */ Character keyOf(Character ch2) {
                return keyOf(ch2.charValue());
            }

            @Override // kotlin.collections.Grouping
            @NotNull
            public Iterator<Character> sourceIterator() {
                return StringsKt__StringsKt.iterator(str);
            }

            public Character keyOf(char element) {
                return Character.valueOf(element);
            }
        });
        int i11 = 0;
        if (!mapEachCount.isEmpty()) {
            Iterator it = mapEachCount.entrySet().iterator();
            while (it.hasNext()) {
                if (((Number) ((Map.Entry) it.next()).getValue()).intValue() > i10) {
                    i11++;
                }
            }
        }
        return i11;
    }

    public static final int countLetters(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return SequencesKt___SequencesKt.count(Regex.findAll$default(new Regex("(?=[a-zA-Z])"), str, 0, 2, null));
    }

    public static final int countLettersLowercase(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return SequencesKt___SequencesKt.count(Regex.findAll$default(new Regex("(?=[a-z])"), str, 0, 2, null));
    }

    public static final int countLettersUppercase(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return SequencesKt___SequencesKt.count(Regex.findAll$default(new Regex("(?=[A-Z])"), str, 0, 2, null));
    }

    public static final int countNumbers(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return SequencesKt___SequencesKt.count(Regex.findAll$default(new Regex("(?=\\d)"), str, 0, 2, null));
    }

    public static final int countSpecials(@NotNull String str, @NotNull String extraChars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(extraChars, "extraChars");
        return SequencesKt___SequencesKt.count(Regex.findAll$default(new Regex(l.replace$default("(?=[!\"#$%&'()\\\\*+,-./\\[\\]:;<=>?@^_`{|}~{replace}])", "{replace}", extraChars, false, 4, (Object) null)), str, 0, 2, null));
    }

    public static /* synthetic */ int countSpecials$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        return countSpecials(str, str2);
    }

    public static final boolean validateLetters(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("(?=[a-zA-Z])").containsMatchIn(str);
    }

    public static final boolean validateNumbers(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("(?=\\d)").containsMatchIn(str);
    }

    public static final boolean validateSpecials(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("[!\"#$%&'()\\\\*+,-./\\[\\]:;<=>?@^_`{|}~]+").containsMatchIn(str);
    }

    public static final boolean validateSpecialsMatches(@NotNull String str, @NotNull String extraChars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(extraChars, "extraChars");
        return new Regex(l.replace$default("[!\"#$%&'()\\\\*+,-./\\[\\]:;<=>?@^_`{|}~{replace}]+", "{replace}", extraChars, false, 4, (Object) null)).matches(str);
    }

    public static /* synthetic */ boolean validateSpecialsMatches$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        return validateSpecialsMatches(str, str2);
    }
}
