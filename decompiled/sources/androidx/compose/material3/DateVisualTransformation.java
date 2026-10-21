package androidx.compose.material3;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DateInput.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,358:1\n1183#2,3:359\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n*L\n339#1:359,3\n*E\n"})
public final class DateVisualTransformation implements VisualTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DateInputFormat f10174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final DateVisualTransformation$dateOffsetTranslator$1 f10178e;

    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(@NotNull DateInputFormat dateInputFormat) {
        Intrinsics.checkNotNullParameter(dateInputFormat, "dateInputFormat");
        this.f10174a = dateInputFormat;
        this.f10175b = StringsKt__StringsKt.indexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.f10176c = StringsKt__StringsKt.lastIndexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.f10177d = dateInputFormat.getPatternWithoutDelimiters().length();
        this.f10178e = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                DateVisualTransformation dateVisualTransformation = this.f10179a;
                if (offset < dateVisualTransformation.f10175b) {
                    return offset;
                }
                if (offset < dateVisualTransformation.f10176c) {
                    return offset + 1;
                }
                int i10 = dateVisualTransformation.f10177d;
                return offset <= i10 ? offset + 2 : i10 + 2;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int transformedToOriginal(int offset) {
                DateVisualTransformation dateVisualTransformation = this.f10179a;
                if (offset <= dateVisualTransformation.f10175b - 1) {
                    return offset;
                }
                if (offset <= dateVisualTransformation.f10176c - 1) {
                    return offset - 1;
                }
                int i10 = dateVisualTransformation.f10177d;
                return offset <= i10 + 1 ? offset - 2 : i10;
            }
        };
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    @NotNull
    public final TransformedText filter(@NotNull AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.getText().length();
        int i10 = 0;
        int i11 = this.f10177d;
        String strSubstring = length > i11 ? StringsKt__StringsKt.substring(text.getText(), kotlin.ranges.c.until(0, i11)) : text.getText();
        String string = "";
        int i12 = 0;
        while (i10 < strSubstring.length()) {
            int i13 = i12 + 1;
            String str = string + strSubstring.charAt(i10);
            if (i13 == this.f10175b || i12 + 2 == this.f10176c) {
                StringBuilder sbD = androidx.camera.core.impl.utils.c.d(str);
                sbD.append(this.f10174a.getDelimiter());
                string = sbD.toString();
            } else {
                string = str;
            }
            i10++;
            i12 = i13;
        }
        return new TransformedText(new AnnotatedString(string, null, null, 6, null), this.f10178e);
    }
}
