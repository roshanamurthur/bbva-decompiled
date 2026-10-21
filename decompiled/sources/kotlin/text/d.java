package kotlin.text;

import java.io.IOException;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Appendable.kt */
/* JADX INFO: loaded from: classes12.dex */
public class d {
    @NotNull
    public static final <T extends Appendable> T append(@NotNull T t10, @NotNull CharSequence... value) throws IOException {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        for (CharSequence charSequence : value) {
            t10.append(charSequence);
        }
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void appendElement(@NotNull Appendable appendable, T t10, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        if (function1 != null) {
            appendable.append(function1.invoke(t10));
            return;
        }
        if (t10 == 0 || (t10 instanceof CharSequence)) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable appendLine(Appendable appendable) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendableAppend;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T extends Appendable> T appendRange(@NotNull T t10, @NotNull CharSequence value, int i10, int i11) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        T t11 = (T) t10.append(value, i10, i11);
        Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t11;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable appendLine(Appendable appendable, CharSequence charSequence) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        Appendable appendableAppend2 = appendableAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendableAppend2, "append(...)");
        return appendableAppend2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable appendLine(Appendable appendable, char c10) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c10);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        Appendable appendableAppend2 = appendableAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendableAppend2, "append(...)");
        return appendableAppend2;
    }
}
