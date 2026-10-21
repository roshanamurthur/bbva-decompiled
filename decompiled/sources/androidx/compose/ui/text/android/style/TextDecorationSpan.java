package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextDecorationSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/android/style/TextDecorationSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "", "a", "Z", "isUnderlineText", "()Z", "b", "isStrikethroughText", "<init>", "(ZZ)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TextDecorationSpan extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isUnderlineText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isStrikethroughText;

    public TextDecorationSpan(boolean z10, boolean z11) {
        this.isUnderlineText = z10;
        this.isStrikethroughText = z11;
    }

    /* JADX INFO: renamed from: isStrikethroughText, reason: from getter */
    public final boolean getIsStrikethroughText() {
        return this.isStrikethroughText;
    }

    /* JADX INFO: renamed from: isUnderlineText, reason: from getter */
    public final boolean getIsUnderlineText() {
        return this.isUnderlineText;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setUnderlineText(this.isUnderlineText);
        textPaint.setStrikeThruText(this.isStrikethroughText);
    }
}
