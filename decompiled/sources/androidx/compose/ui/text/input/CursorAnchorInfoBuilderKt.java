package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CursorAnchorInfoBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\t"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Landroid/view/inputmethod/CursorAnchorInfo;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "ui_release"}, k = 2, mv = {1, 8, 0})
public final class CursorAnchorInfoBuilderKt {
    @NotNull
    public static final CursorAnchorInfo build(@NotNull CursorAnchorInfo.Builder builder, @NotNull TextFieldValue textFieldValue, @NotNull TextLayoutResult textLayoutResult, @NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        builder.reset();
        builder.setMatrix(matrix);
        int iM3965getMinimpl = TextRange.m3965getMinimpl(textFieldValue.getSelection());
        builder.setSelectionRange(iM3965getMinimpl, TextRange.m3964getMaximpl(textFieldValue.getSelection()));
        if (iM3965getMinimpl >= 0) {
            Rect cursorRect = textLayoutResult.getCursorRect(iM3965getMinimpl);
            builder.setInsertionMarkerLocation(cursorRect.getLeft(), cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), textLayoutResult.getBidiRunDirection(iM3965getMinimpl) == ResolvedTextDirection.Rtl ? 4 : 0);
        }
        TextRange composition = textFieldValue.getComposition();
        int iM3965getMinimpl2 = composition != null ? TextRange.m3965getMinimpl(composition.getF17768a()) : -1;
        TextRange composition2 = textFieldValue.getComposition();
        int iM3964getMaximpl = composition2 != null ? TextRange.m3964getMaximpl(composition2.getF17768a()) : -1;
        if (iM3965getMinimpl2 >= 0 && iM3965getMinimpl2 < iM3964getMaximpl) {
            builder.setComposingText(iM3965getMinimpl2, textFieldValue.getText().subSequence(iM3965getMinimpl2, iM3964getMaximpl));
        }
        CursorAnchorInfo cursorAnchorInfoBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(cursorAnchorInfoBuild, "build()");
        return cursorAnchorInfoBuild;
    }
}
