package androidx.appcompat.view;

import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class WindowCallbackWrapper implements Window.Callback {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Window.Callback f866p0;

    @RequiresApi(23)
    public static class a {
        @DoNotInline
        public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        @DoNotInline
        public static android.view.ActionMode b(Window.Callback callback, android.view.ActionMode.Callback callback2, int i10) {
            return callback.onWindowStartingActionMode(callback2, i10);
        }
    }

    @RequiresApi(24)
    public static class b {
        @DoNotInline
        public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            callback.onProvideKeyboardShortcuts(list, menu, i10);
        }
    }

    @RequiresApi(26)
    public static class c {
        @DoNotInline
        public static void a(Window.Callback callback, boolean z10) {
            callback.onPointerCaptureChanged(z10);
        }
    }

    public WindowCallbackWrapper(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f866p0 = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f866p0.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f866p0.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f866p0.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f866p0.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f866p0.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f866p0.dispatchTrackballEvent(motionEvent);
    }

    public final Window.Callback getWrapped() {
        return this.f866p0;
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode actionMode) {
        this.f866p0.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode actionMode) {
        this.f866p0.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f866p0.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f866p0.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f866p0.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i10) {
        return this.f866p0.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f866p0.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f866p0.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return this.f866p0.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.f866p0.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    @RequiresApi(26)
    public void onPointerCaptureChanged(boolean z10) {
        c.a(this.f866p0, z10);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f866p0.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    @RequiresApi(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        b.a(this.f866p0, list, menu, i10);
    }

    @Override // android.view.Window.Callback
    @RequiresApi(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f866p0, searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f866p0.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        this.f866p0.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return this.f866p0.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f866p0.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @RequiresApi(23)
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i10) {
        return a.b(this.f866p0, callback, i10);
    }
}
