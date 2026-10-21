package androidx.compose.ui.text.platform;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EmojiCompatStatus.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/platform/EmojiCompatStatus;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "newDelegate", "", "setDelegateForTesting$ui_text_release", "(Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;)V", "setDelegateForTesting", "Landroidx/compose/runtime/State;", "", "getFontLoaded", "()Landroidx/compose/runtime/State;", "fontLoaded", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {

    @NotNull
    public static final EmojiCompatStatus INSTANCE = new EmojiCompatStatus();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static EmojiCompatStatusDelegate f18209a = new DefaultImpl();

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    @NotNull
    public State<Boolean> getFontLoaded() {
        return f18209a.getFontLoaded();
    }

    @VisibleForTesting
    public final void setDelegateForTesting$ui_text_release(@Nullable EmojiCompatStatusDelegate newDelegate) {
        if (newDelegate == null) {
            newDelegate = new DefaultImpl();
        }
        f18209a = newDelegate;
    }
}
