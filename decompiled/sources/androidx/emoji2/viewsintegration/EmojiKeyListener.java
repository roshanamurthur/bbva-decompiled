package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class EmojiKeyListener implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f21402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmojiCompatHandleKeyDownHelper f21403b;

    public static class EmojiCompatHandleKeyDownHelper {
        public boolean handleKeyDown(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
            return EmojiCompat.handleOnKeyDown(editable, i10, keyEvent);
        }
    }

    public EmojiKeyListener(KeyListener keyListener) {
        EmojiCompatHandleKeyDownHelper emojiCompatHandleKeyDownHelper = new EmojiCompatHandleKeyDownHelper();
        this.f21402a = keyListener;
        this.f21403b = emojiCompatHandleKeyDownHelper;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f21402a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f21402a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f21403b.handleKeyDown(editable, i10, keyEvent) || this.f21402a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f21402a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f21402a.onKeyUp(view, editable, i10, keyEvent);
    }
}
