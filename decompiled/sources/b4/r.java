package b4;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends Observable implements TextWatcher {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f24835p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f24836q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f24837r0 = false;

    public r(int i10) {
        this.f24835p0 = i10;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (charSequence.length() - this.f24836q0 > 1) {
            this.f24837r0 = true;
        } else {
            this.f24837r0 = false;
        }
        setChanged();
        notifyObservers(new g(Long.valueOf(SystemClock.uptimeMillis()).longValue(), "2", this.f24835p0, this.f24837r0));
        this.f24836q0 = charSequence.length();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
