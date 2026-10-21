package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.u;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ContentCaptureSessionCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f17388b;

    @RequiresApi(23)
    public static class a {
        @DoNotInline
        public static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    @RequiresApi(29)
    public static class b {
        @DoNotInline
        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newAutofillId(autofillId, j10);
        }

        @DoNotInline
        public static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        @DoNotInline
        public static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
        }

        @DoNotInline
        public static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        @DoNotInline
        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        @DoNotInline
        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    @RequiresApi(29)
    public ContentCaptureSessionCompat(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        this.f17387a = contentCaptureSession;
        this.f17388b = view;
    }

    @NonNull
    @RequiresApi(29)
    public static ContentCaptureSessionCompat toContentCaptureSessionCompat(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        return new ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    @Nullable
    public AutofillId newAutofillId(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionC = u.c(this.f17387a);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(this.f17388b);
        Objects.requireNonNull(autofillId);
        return b.a(contentCaptureSessionC, autofillId.toAutofillId(), j10);
    }

    @Nullable
    public ViewStructureCompat newVirtualViewStructure(@NonNull AutofillId autofillId, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ViewStructureCompat.toViewStructureCompat(b.c(u.c(this.f17387a), autofillId, j10));
        }
        return null;
    }

    public void notifyViewTextChanged(@NonNull AutofillId autofillId, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(u.c(this.f17387a), autofillId, charSequence);
        }
    }

    public void notifyViewsAppeared(@NonNull List<ViewStructure> list) {
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f17387a;
        if (i10 >= 34) {
            c.a(u.c(obj), list);
            return;
        }
        if (i10 >= 29) {
            ContentCaptureSession contentCaptureSessionC = u.c(obj);
            View view = this.f17388b;
            ViewStructure viewStructureB = b.b(contentCaptureSessionC, view);
            a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(u.c(obj), viewStructureB);
            for (int i11 = 0; i11 < list.size(); i11++) {
                b.d(u.c(obj), list.get(i11));
            }
            ViewStructure viewStructureB2 = b.b(u.c(obj), view);
            a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(u.c(obj), viewStructureB2);
        }
    }

    public void notifyViewsDisappeared(@NonNull long[] jArr) {
        int i10 = Build.VERSION.SDK_INT;
        View view = this.f17388b;
        Object obj = this.f17387a;
        if (i10 >= 34) {
            ContentCaptureSession contentCaptureSessionC = u.c(obj);
            AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(view);
            Objects.requireNonNull(autofillId);
            b.f(contentCaptureSessionC, autofillId.toAutofillId(), jArr);
            return;
        }
        if (i10 >= 29) {
            ViewStructure viewStructureB = b.b(u.c(obj), view);
            a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(u.c(obj), viewStructureB);
            ContentCaptureSession contentCaptureSessionC2 = u.c(obj);
            AutofillIdCompat autofillId2 = ViewCompatShims.getAutofillId(view);
            Objects.requireNonNull(autofillId2);
            b.f(contentCaptureSessionC2, autofillId2.toAutofillId(), jArr);
            ViewStructure viewStructureB2 = b.b(u.c(obj), view);
            a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(u.c(obj), viewStructureB2);
        }
    }

    @NonNull
    @RequiresApi(29)
    public ContentCaptureSession toContentCaptureSession() {
        return u.c(this.f17387a);
    }

    @RequiresApi(34)
    public static class c {
        @DoNotInline
        public static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
        }
    }
}
