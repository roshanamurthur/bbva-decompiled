package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import w2.c;

/* JADX INFO: loaded from: classes2.dex */
public final class EmojiEditTextHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21397c;

    @RequiresApi(19)
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f21398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f21399b;

        public a(@NonNull EditText editText, boolean z10) {
            this.f21398a = editText;
            c cVar = new c(editText, z10);
            this.f21399b = cVar;
            editText.addTextChangedListener(cVar);
            if (w2.a.f94118b == null) {
                synchronized (w2.a.f94117a) {
                    try {
                        if (w2.a.f94118b == null) {
                            w2.a aVar = new w2.a();
                            try {
                                w2.a.f94119c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, w2.a.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            w2.a.f94118b = aVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            editText.setEditableFactory(w2.a.f94118b);
        }
    }

    public static class b {
    }

    public EmojiEditTextHelper(@NonNull EditText editText) {
        this(editText, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getEmojiReplaceStrategy() {
        return this.f21397c;
    }

    @Nullable
    public KeyListener getKeyListener(@Nullable KeyListener keyListener) {
        this.f21395a.getClass();
        if (keyListener instanceof EmojiKeyListener) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new EmojiKeyListener(keyListener);
    }

    public int getMaxEmojiCount() {
        return this.f21396b;
    }

    public boolean isEnabled() {
        return this.f21395a.f21399b.f94129u0;
    }

    @Nullable
    public InputConnection onCreateInputConnection(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        a aVar = this.f21395a;
        aVar.getClass();
        return inputConnection instanceof EmojiInputConnection ? inputConnection : new EmojiInputConnection(aVar.f21398a, inputConnection, editorInfo);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setEmojiReplaceStrategy(int i10) {
        this.f21397c = i10;
        this.f21395a.f21399b.f94128t0 = i10;
    }

    public void setEnabled(boolean z10) {
        c cVar = this.f21395a.f21399b;
        if (cVar.f94129u0 != z10) {
            if (cVar.f94126r0 != null) {
                EmojiCompat.get().unregisterInitCallback(cVar.f94126r0);
            }
            cVar.f94129u0 = z10;
            if (z10) {
                c.b(cVar.f94124p0, EmojiCompat.get().getLoadState());
            }
        }
    }

    public void setMaxEmojiCount(@IntRange(from = 0) int i10) {
        Preconditions.checkArgumentNonnegative(i10, "maxEmojiCount should be greater than 0");
        this.f21396b = i10;
        this.f21395a.f21399b.f94127s0 = i10;
    }

    public EmojiEditTextHelper(@NonNull EditText editText, boolean z10) {
        this.f21396b = Integer.MAX_VALUE;
        this.f21397c = 0;
        Preconditions.checkNotNull(editText, "editText cannot be null");
        this.f21395a = new a(editText, z10);
    }
}
