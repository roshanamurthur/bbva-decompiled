package v2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: EmojiCompatInitializer.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f93953p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f93954q0;

    public d(EmojiCompatInitializer emojiCompatInitializer, Lifecycle lifecycle) {
        this.f93954q0 = emojiCompatInitializer;
        this.f93953p0 = lifecycle;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(@NonNull LifecycleOwner lifecycleOwner) {
        this.f93954q0.getClass();
        (Build.VERSION.SDK_INT >= 28 ? c.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new EmojiCompatInitializer.c(), 500L);
        this.f93953p0.removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.f(this, lifecycleOwner);
    }
}
