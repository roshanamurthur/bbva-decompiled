package b4;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Observable implements Window.Callback {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final HandlerThread f24772q0 = new HandlerThread("CYFTouchManager");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static boolean f24773r0 = false;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Window.Callback f24774p0;

    /* JADX INFO: renamed from: b4.a$a, reason: collision with other inner class name */
    public class RunnableC0110a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MotionEvent f24775p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f24776q0;

        public RunnableC0110a(MotionEvent motionEvent, int i10) {
            this.f24775p0 = motionEvent;
            this.f24776q0 = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.akamai.botman.e.f26327d = 1;
            com.akamai.botman.e.f26328e = 1;
            a aVar = a.this;
            aVar.setChanged();
            int i10 = this.f24776q0;
            aVar.notifyObservers(new b(this.f24775p0, i10 != 1 ? 0 : 1, i10));
        }
    }

    public a(Window.Callback callback) {
        this.f24774p0 = callback;
        if (f24773r0) {
            HandlerThread handlerThread = f24772q0;
            if (handlerThread.isAlive()) {
                return;
            }
            handlerThread.start();
        }
    }

    public final void a(MotionEvent motionEvent, int i10) {
        try {
            if (f24773r0) {
                HandlerThread handlerThread = f24772q0;
                if (handlerThread.isAlive()) {
                    new Handler(handlerThread.getLooper()).post(new RunnableC0110a(motionEvent, i10));
                    return;
                }
            }
            int i11 = 1;
            com.akamai.botman.e.f26327d = 1;
            com.akamai.botman.e.f26328e = 1;
            setChanged();
            if (i10 != 1) {
                i11 = 0;
            }
            notifyObservers(new b(motionEvent, i11, i10));
        } catch (Exception e5) {
            f.a(e5);
        }
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f24774p0.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f24774p0.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f24774p0.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f24774p0.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Window.Callback callback = this.f24774p0;
        if (action == 0) {
            a(motionEventObtain, 2);
            return callback.dispatchTouchEvent(motionEvent);
        }
        if (action == 1) {
            a(motionEventObtain, 3);
            return callback.dispatchTouchEvent(motionEvent);
        }
        if (action == 2) {
            a(motionEventObtain, 1);
            return callback.dispatchTouchEvent(motionEvent);
        }
        if (action == 5) {
            a(motionEventObtain, 2);
            return callback.dispatchTouchEvent(motionEvent);
        }
        if (action != 6) {
            return callback.dispatchTouchEvent(motionEvent);
        }
        a(motionEventObtain, 3);
        return callback.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f24774p0.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f24774p0.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f24774p0.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f24774p0.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f24774p0.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f24774p0.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        return this.f24774p0.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f24774p0.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f24774p0.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return this.f24774p0.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        this.f24774p0.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f24774p0.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f24774p0.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f24774p0.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        this.f24774p0.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f24774p0.onWindowStartingActionMode(callback, i10);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f24774p0.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f24774p0.onWindowStartingActionMode(callback);
    }
}
