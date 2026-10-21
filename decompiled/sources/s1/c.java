package s1;

import androidx.compose.runtime.State;

/* JADX INFO: compiled from: EmojiCompatStatus.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements State<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f93137p0;

    public c(boolean z10) {
        this.f93137p0 = z10;
    }

    @Override // androidx.compose.runtime.State
    public final Boolean getValue() {
        return Boolean.valueOf(this.f93137p0);
    }
}
