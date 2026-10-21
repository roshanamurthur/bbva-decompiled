package w2;

import android.text.Editable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.SpannableBuilder;

/* JADX INFO: compiled from: EmojiEditableFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f94117a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("INSTANCE_LOCK")
    public static volatile a f94118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static Class<?> f94119c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f94119c;
        return cls != null ? SpannableBuilder.create(cls, charSequence) : super.newEditable(charSequence);
    }
}
