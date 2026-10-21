package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InlineTextContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0014\u0010\u0006\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "id", "alternateText", "", "appendInlineContent", "INLINE_CONTENT_TAG", "Ljava/lang/String;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class InlineTextContentKt {

    @NotNull
    public static final String INLINE_CONTENT_TAG = "androidx.compose.foundation.text.inlineContent";

    public static final void appendInlineContent(@NotNull AnnotatedString.Builder builder, @NotNull String id, @NotNull String alternateText) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alternateText, "alternateText");
        if (alternateText.length() <= 0) {
            throw new IllegalArgumentException("alternateText can't be an empty string.".toString());
        }
        builder.pushStringAnnotation(INLINE_CONTENT_TAG, id);
        builder.append(alternateText);
        builder.pop();
    }

    public static /* synthetic */ void appendInlineContent$default(AnnotatedString.Builder builder, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "�";
        }
        appendInlineContent(builder, str, str2);
    }
}
