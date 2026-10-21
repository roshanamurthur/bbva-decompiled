package androidx.core.content;

import android.content.ComponentName;
import androidx.core.util.Predicate;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Predicate {
    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return androidx.core.util.i.a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        return androidx.core.util.i.b(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        return androidx.core.util.i.c(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        return IntentSanitizer.Builder.lambda$allowAnyComponent$10((ComponentName) obj);
    }
}
