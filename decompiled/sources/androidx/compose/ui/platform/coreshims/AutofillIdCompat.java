package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.i;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AutofillIdCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17386a;

    @RequiresApi(26)
    public AutofillIdCompat(@NonNull AutofillId autofillId) {
        this.f17386a = autofillId;
    }

    @NonNull
    @RequiresApi(26)
    public static AutofillIdCompat toAutofillIdCompat(@NonNull AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    @NonNull
    @RequiresApi(26)
    public AutofillId toAutofillId() {
        return i.d(this.f17386a);
    }
}
