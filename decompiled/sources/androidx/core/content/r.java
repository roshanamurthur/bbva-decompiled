package androidx.core.content;

import androidx.core.util.Predicate;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19871a;

    public /* synthetic */ r(int i10) {
        this.f19871a = i10;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i10 = this.f19871a;
        return androidx.core.util.i.a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f19871a) {
            case 0:
                break;
        }
        return androidx.core.util.i.b(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i10 = this.f19871a;
        return androidx.core.util.i.c(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f19871a) {
            case 0:
                return IntentSanitizer.Builder.lambda$new$3((String) obj);
            default:
                return androidx.core.util.i.h(obj);
        }
    }
}
