package androidx.compose.ui.text.input;

import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformTextInputAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&\u0082\u0001\u0001\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInput;", "", "", "requestInputFocus", "releaseInputFocus", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$a;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public interface PlatformTextInput {
    void releaseInputFocus();

    void requestInputFocus();
}
