package kotlin.text;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExperimentalStdlibApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringBuilderJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
public class h extends g {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder appendRange(StringBuilder sb2, char[] value, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append(value, i10, i11 - i10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}))
    @NotNull
    public static final Appendable appendln(@NotNull Appendable appendable) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(n.f82370b);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendableAppend;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static StringBuilder clear(@NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.setLength(0);
        return sb2;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder deleteAt(StringBuilder sb2, int i10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        StringBuilder sbDeleteCharAt = sb2.deleteCharAt(i10);
        Intrinsics.checkNotNullExpressionValue(sbDeleteCharAt, "deleteCharAt(...)");
        return sbDeleteCharAt;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder deleteRange(StringBuilder sb2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        StringBuilder sbDelete = sb2.delete(i10, i11);
        Intrinsics.checkNotNullExpressionValue(sbDelete, "delete(...)");
        return sbDelete;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder insertRange(StringBuilder sb2, int i10, char[] value, int i11, int i12) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbInsert = sb2.insert(i10, value, i11, i12 - i11);
        Intrinsics.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    @InlineOnly
    private static final void set(StringBuilder sb2, int i10, char c10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.setCharAt(i10, c10);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder setRange(StringBuilder sb2, int i10, int i11, String value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbReplace = sb2.replace(i10, i11, value);
        Intrinsics.checkNotNullExpressionValue(sbReplace, "replace(...)");
        return sbReplace;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final void toCharArray(StringBuilder sb2, char[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        sb2.getChars(i11, i12, destination, i10);
    }

    public static /* synthetic */ void toCharArray$default(StringBuilder sb2, char[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sb2.length();
        }
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        sb2.getChars(i11, i12, destination, i10);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, StringBuilder sb3) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder appendRange(StringBuilder sb2, CharSequence value, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append(value, i10, i11);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final Appendable appendln(Appendable appendable, CharSequence charSequence) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendln(appendableAppend);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder insertRange(StringBuilder sb2, int i10, CharSequence value, int i11, int i12) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbInsert = sb2.insert(i10, value, i11, i12);
        Intrinsics.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, int i10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(i10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final Appendable appendln(Appendable appendable, char c10) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c10);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendln(appendableAppend);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, short s4) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) s4);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}))
    @NotNull
    public static final StringBuilder appendln(@NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(n.f82370b);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, byte b10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) b10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, long j10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(j10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, float f6) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(f6);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, String str) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(str);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, double d2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(d2);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, Object obj) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(obj);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, StringBuilder sb3) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, char[] value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append(value);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, char c10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(c10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, boolean z10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(z10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, int i10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(i10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, short s4) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) s4);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, byte b10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) b10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, long j10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(j10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, float f6) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(f6);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, double d2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(d2);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }
}
