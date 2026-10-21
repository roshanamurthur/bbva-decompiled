package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bbva.nativesettings.common.Constants;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class SoftwareKeyboardControllerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f20226a;

    @RequiresApi(20)
    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final View f20227a;

        public a(@Nullable View view) {
            this.f20227a = view;
        }

        public void a() {
            View view = this.f20227a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService(Constants.INPUT_METHOD)).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public void b() {
            View viewFindViewById;
            View view = this.f20227a;
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
            viewFindViewById.post(new androidx.compose.ui.platform.j(viewFindViewById, 1));
        }
    }

    @RequiresApi(30)
    public static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public View f20228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public WindowInsetsController f20229c;

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.core.view.y] */
        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.a
        public final void a() {
            View view = this.f20228b;
            WindowInsetsController windowInsetsController = this.f20229c;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.y
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

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.a
        public final void b() {
            View view = this.f20228b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService(Constants.INPUT_METHOD)).isActive();
            }
            WindowInsetsController windowInsetsController = this.f20229c;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
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
            this.f20226a = new a(view);
            return;
        }
        b bVar = new b(view);
        bVar.f20228b = view;
        this.f20226a = bVar;
    }

    public void hide() {
        this.f20226a.a();
    }

    public void show() {
        this.f20226a.b();
    }

    @RequiresApi(30)
    @Deprecated
    public SoftwareKeyboardControllerCompat(@NonNull WindowInsetsController windowInsetsController) {
        b bVar = new b(null);
        bVar.f20229c = windowInsetsController;
        this.f20226a = bVar;
    }
}
