package androidx.compose.ui.platform.coreshims;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ViewStructureCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewStructure f17392a;

    @RequiresApi(23)
    public static class a {
        @DoNotInline
        public static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @DoNotInline
        public static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        @DoNotInline
        public static void c(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
            viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
        }

        @DoNotInline
        public static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    public ViewStructureCompat(@NonNull ViewStructure viewStructure) {
        this.f17392a = viewStructure;
    }

    @NonNull
    @RequiresApi(23)
    public static ViewStructureCompat toViewStructureCompat(@NonNull ViewStructure viewStructure) {
        return new ViewStructureCompat(viewStructure);
    }

    public void setClassName(@NonNull String str) {
        a.a(this.f17392a, str);
    }

    public void setContentDescription(@NonNull CharSequence charSequence) {
        a.b(this.f17392a, charSequence);
    }

    public void setDimens(int i10, int i11, int i12, int i13, int i14, int i15) {
        a.c(this.f17392a, i10, i11, i12, i13, i14, i15);
    }

    public void setText(@NonNull CharSequence charSequence) {
        a.d(this.f17392a, charSequence);
    }

    @NonNull
    @RequiresApi(23)
    public ViewStructure toViewStructure() {
        return this.f17392a;
    }
}
