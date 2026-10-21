package androidx.databinding;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableField<T> extends a implements Serializable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public T f20538q0;

    public ObservableField(T t10) {
        this.f20538q0 = t10;
    }

    @Nullable
    public T get() {
        return this.f20538q0;
    }

    public void set(T t10) {
        if (t10 != this.f20538q0) {
            this.f20538q0 = t10;
            notifyChange();
        }
    }

    public ObservableField() {
    }

    public ObservableField(Observable... observableArr) {
        super(observableArr);
    }
}
