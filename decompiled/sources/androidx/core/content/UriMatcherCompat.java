package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes.dex */
public class UriMatcherCompat {
    private UriMatcherCompat() {
    }

    @NonNull
    public static Predicate<Uri> asPredicate(@NonNull final UriMatcher uriMatcher) {
        return new Predicate() { // from class: androidx.core.content.x
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
                return UriMatcherCompat.lambda$asPredicate$0(uriMatcher, (Uri) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$asPredicate$0(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }
}
