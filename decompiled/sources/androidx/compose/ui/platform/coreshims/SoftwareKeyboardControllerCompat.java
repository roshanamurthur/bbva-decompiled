package androidx.compose.ui.platform.coreshims;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.bbva.nativesettings.common.Constants;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class SoftwareKeyboardControllerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17389a;

    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final View f17390a;

        public a(@Nullable View view) {
            this.f17390a = view;
        }

        public void a() {
            View view = this.f17390a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService(Constants.INPUT_METHOD)).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public void b() {
            View viewFindViewById;
            View view = this.f17390a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
                viewFindViewById = view;
            } else {
                viewFindViewById = view.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = view.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new androidx.activity.b(viewFindViewById, 1));
        }
    }

    @RequiresApi(30)
    public static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public View f17391b;

        /* JADX WARN: Type inference failed for: r4v0, types: [k1.a] */
        @Override // androidx.compose.ui.platform.coreshims.SoftwareKeyboardControllerCompat.a
        public final void a() {
            View view = this.f17391b;
            WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: k1.a
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((i10 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r4);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService(Constants.INPUT_METHOD)).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r4);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.compose.ui.platform.coreshims.SoftwareKeyboardControllerCompat.a
        public final void b() {
            View view = this.f17391b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService(Constants.INPUT_METHOD)).isActive();
            }
            WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            } else {
                super.b();
            }
        }
    }

    public static class c {
    }

    public SoftwareKeyboardControllerCompat(@NonNull View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f17389a = new a(view);
            return;
        }
        b bVar = new b(view);
        bVar.f17391b = view;
        this.f17389a = bVar;
    }

    public void hide() {
        this.f17389a.a();
    }

    public void show() {
        this.f17389a.b();
    }
}
