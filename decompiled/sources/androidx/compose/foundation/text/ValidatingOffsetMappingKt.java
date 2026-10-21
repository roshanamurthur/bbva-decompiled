package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ValidatingOffsetMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/input/VisualTransformation;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", "filterWithValidation", "Landroidx/compose/ui/text/input/OffsetMapping;", "a", "Landroidx/compose/ui/text/input/OffsetMapping;", "getValidatingEmptyOffsetMappingIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;", "ValidatingEmptyOffsetMappingIdentity", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class ValidatingOffsetMappingKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0.m f6081a = new e0.m(OffsetMapping.INSTANCE.getIdentity(), 0, 0);

    @NotNull
    public static final TransformedText filterWithValidation(@NotNull VisualTransformation visualTransformation, @NotNull AnnotatedString text) {
        Intrinsics.checkNotNullParameter(visualTransformation, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        TransformedText transformedTextFilter = visualTransformation.filter(text);
        return new TransformedText(transformedTextFilter.getText(), new e0.m(transformedTextFilter.getOffsetMapping(), text.length(), transformedTextFilter.getText().length()));
    }

    @NotNull
    public static final OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return f6081a;
    }
}
