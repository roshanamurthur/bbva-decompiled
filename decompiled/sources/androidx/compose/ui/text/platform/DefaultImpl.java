package androidx.compose.ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s1.c;

/* JADX INFO: compiled from: EmojiCompatStatus.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultImpl implements EmojiCompatStatusDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public State<Boolean> f18206a;

    public DefaultImpl() {
        this.f18206a = EmojiCompat.isConfigured() ? a() : null;
    }

    public final State<Boolean> a() {
        EmojiCompat emojiCompat = EmojiCompat.get();
        Intrinsics.checkNotNullExpressionValue(emojiCompat, "get()");
        if (emojiCompat.getLoadState() == 1) {
            return new c(true);
        }
        final MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        emojiCompat.registerInitCallback(new EmojiCompat.InitCallback() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
            @Override // androidx.emoji2.text.EmojiCompat.InitCallback
            public void onFailed(@Nullable Throwable throwable) {
                this.f18206a = EmojiCompatStatusKt.f18210a;
            }

            @Override // androidx.emoji2.text.EmojiCompat.InitCallback
            public void onInitialized() {
                mutableStateMutableStateOf$default.setValue(Boolean.TRUE);
                this.f18206a = new c(true);
            }
        });
        return mutableStateMutableStateOf$default;
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    @NotNull
    public final State<Boolean> getFontLoaded() {
        State<Boolean> state = this.f18206a;
        if (state != null) {
            Intrinsics.checkNotNull(state);
            return state;
        }
        if (!EmojiCompat.isConfigured()) {
            return EmojiCompatStatusKt.f18210a;
        }
        State<Boolean> stateA = a();
        this.f18206a = stateA;
        Intrinsics.checkNotNull(stateA);
        return stateA;
    }
}
