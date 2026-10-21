package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ViewCompatShims {
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    @RequiresApi(26)
    public static class a {
        @DoNotInline
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    @RequiresApi(29)
    public static class b {
        @DoNotInline
        public static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    @RequiresApi(30)
    public static class c {
        @DoNotInline
        public static void a(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }
    }

    @Nullable
    public static AutofillIdCompat getAutofillId(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AutofillIdCompat.toAutofillIdCompat(a.a(view));
        }
        return null;
    }

    @Nullable
    public static ContentCaptureSessionCompat getContentCaptureSession(@NonNull View view) {
        ContentCaptureSession contentCaptureSessionA;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionA = b.a(view)) == null) {
            return null;
        }
        return ContentCaptureSessionCompat.toContentCaptureSessionCompat(contentCaptureSessionA, view);
    }

    public static void setImportantForContentCapture(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i10);
        }
    }
}
