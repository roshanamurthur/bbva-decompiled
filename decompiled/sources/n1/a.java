package n1;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.android.selection.WordBoundary;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidParagraph.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function0<WordBoundary> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AndroidParagraph f84402p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AndroidParagraph androidParagraph) {
        super(0);
        this.f84402p0 = androidParagraph;
    }

    @Override // kotlin.jvm.functions.Function0
    public final WordBoundary invoke() {
        AndroidParagraph androidParagraph = this.f84402p0;
        return new WordBoundary(androidParagraph.getTextLocale$ui_text_release(), androidParagraph.f17576e.getText());
    }
}
