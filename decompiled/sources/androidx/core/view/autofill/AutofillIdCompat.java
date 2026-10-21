package androidx.core.view.autofill;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.i;

/* JADX INFO: loaded from: classes2.dex */
public class AutofillIdCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20388a;

    @RequiresApi(26)
    public AutofillIdCompat(@NonNull AutofillId autofillId) {
        this.f20388a = autofillId;
    }

    @NonNull
    @RequiresApi(26)
    public static AutofillIdCompat toAutofillIdCompat(@NonNull AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    @NonNull
    @RequiresApi(26)
    public AutofillId toAutofillId() {
        return i.d(this.f20388a);
    }
}
