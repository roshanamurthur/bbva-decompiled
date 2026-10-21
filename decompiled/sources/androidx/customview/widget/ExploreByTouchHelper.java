package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import com.bbva.nativesettings.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Rect f20475k = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f20476l = new a();
    public static final b m = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AccessibilityManager f20481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f20482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f20483g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f20477a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f20478b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f20479c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f20480d = new int[2];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20484h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20485i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20486j = Integer.MIN_VALUE;

    public class a implements FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> {
        @Override // androidx.customview.widget.FocusStrategy.BoundsAdapter
        public final void obtainBounds(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
            accessibilityNodeInfoCompat.getBoundsInParent(rect);
        }
    }

    public class b implements FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> {
        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        public final AccessibilityNodeInfoCompat get(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat, int i10) {
            return sparseArrayCompat.valueAt(i10);
        }

        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        public final int size(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat) {
            return sparseArrayCompat.size();
        }
    }

    public class c extends AccessibilityNodeProviderCompat {
        public c() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i10) {
            return AccessibilityNodeInfoCompat.obtain(ExploreByTouchHelper.this.d(i10));
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final AccessibilityNodeInfoCompat findFocus(int i10) {
            ExploreByTouchHelper exploreByTouchHelper = ExploreByTouchHelper.this;
            int i11 = i10 == 2 ? exploreByTouchHelper.f20484h : exploreByTouchHelper.f20485i;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return createAccessibilityNodeInfo(i11);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x002c  */
        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final boolean performAction(int i10, int i11, Bundle bundle) {
            int i12;
            ExploreByTouchHelper exploreByTouchHelper = ExploreByTouchHelper.this;
            View view = exploreByTouchHelper.f20482f;
            if (i10 == -1) {
                return ViewCompat.performAccessibilityAction(view, i11, bundle);
            }
            boolean z10 = true;
            if (i11 == 1) {
                return exploreByTouchHelper.requestKeyboardFocusForVirtualView(i10);
            }
            if (i11 == 2) {
                return exploreByTouchHelper.clearKeyboardFocusForVirtualView(i10);
            }
            if (i11 == 64) {
                AccessibilityManager accessibilityManager = exploreByTouchHelper.f20481e;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = exploreByTouchHelper.f20484h) != i10) {
                    if (i12 != Integer.MIN_VALUE) {
                        exploreByTouchHelper.f20484h = Integer.MIN_VALUE;
                        exploreByTouchHelper.f20482f.invalidate();
                        exploreByTouchHelper.sendEventForVirtualView(i12, 65536);
                    }
                    exploreByTouchHelper.f20484h = i10;
                    view.invalidate();
                    exploreByTouchHelper.sendEventForVirtualView(i10, 32768);
                } else {
                    z10 = false;
                }
            } else {
                if (i11 != 128) {
                    return exploreByTouchHelper.onPerformActionForVirtualView(i10, i11, bundle);
                }
                if (exploreByTouchHelper.f20484h == i10) {
                    exploreByTouchHelper.f20484h = Integer.MIN_VALUE;
                    view.invalidate();
                    exploreByTouchHelper.sendEventForVirtualView(i10, 65536);
                } else {
                    z10 = false;
                }
            }
            return z10;
        }
    }

    public ExploreByTouchHelper(@NonNull View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f20482f = view;
        this.f20481e = (AccessibilityManager) view.getContext().getSystemService(Constants.ACCESSIBILITY);
        view.setFocusable(true);
        if (ViewCompat.getImportantForAccessibility(view) == 0) {
            ViewCompat.setImportantForAccessibility(view, 1);
        }
    }

    public final AccessibilityEvent a(int i10, int i11) {
        View view = this.f20482f;
        if (i10 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i11);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatD = d(i10);
        accessibilityEventObtain2.getText().add(accessibilityNodeInfoCompatD.getText());
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfoCompatD.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfoCompatD.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfoCompatD.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfoCompatD.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfoCompatD.isChecked());
        onPopulateEventForVirtualView(i10, accessibilityEventObtain2);
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfoCompatD.getClassName());
        AccessibilityRecordCompat.setSource(accessibilityEventObtain2, view, i10);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    @NonNull
    public final AccessibilityNodeInfoCompat b(int i10) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        accessibilityNodeInfoCompatObtain.setEnabled(true);
        accessibilityNodeInfoCompatObtain.setFocusable(true);
        accessibilityNodeInfoCompatObtain.setClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        Rect rect = f20475k;
        accessibilityNodeInfoCompatObtain.setBoundsInParent(rect);
        accessibilityNodeInfoCompatObtain.setBoundsInScreen(rect);
        View view = this.f20482f;
        accessibilityNodeInfoCompatObtain.setParent(view);
        onPopulateNodeForVirtualView(i10, accessibilityNodeInfoCompatObtain);
        if (accessibilityNodeInfoCompatObtain.getText() == null && accessibilityNodeInfoCompatObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f20478b;
        accessibilityNodeInfoCompatObtain.getBoundsInParent(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoCompatObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompatObtain.setPackageName(view.getContext().getPackageName());
        accessibilityNodeInfoCompatObtain.setSource(view, i10);
        if (this.f20484h == i10) {
            accessibilityNodeInfoCompatObtain.setAccessibilityFocused(true);
            accessibilityNodeInfoCompatObtain.addAction(128);
        } else {
            accessibilityNodeInfoCompatObtain.setAccessibilityFocused(false);
            accessibilityNodeInfoCompatObtain.addAction(64);
        }
        boolean z10 = this.f20485i == i10;
        if (z10) {
            accessibilityNodeInfoCompatObtain.addAction(2);
        } else if (accessibilityNodeInfoCompatObtain.isFocusable()) {
            accessibilityNodeInfoCompatObtain.addAction(1);
        }
        accessibilityNodeInfoCompatObtain.setFocused(z10);
        int[] iArr = this.f20480d;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f20477a;
        accessibilityNodeInfoCompatObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoCompatObtain.getBoundsInParent(rect3);
            if (accessibilityNodeInfoCompatObtain.mParentVirtualDescendantId != -1) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain2 = AccessibilityNodeInfoCompat.obtain();
                for (int i11 = accessibilityNodeInfoCompatObtain.mParentVirtualDescendantId; i11 != -1; i11 = accessibilityNodeInfoCompatObtain2.mParentVirtualDescendantId) {
                    accessibilityNodeInfoCompatObtain2.setParent(view, -1);
                    accessibilityNodeInfoCompatObtain2.setBoundsInParent(rect);
                    onPopulateNodeForVirtualView(i11, accessibilityNodeInfoCompatObtain2);
                    accessibilityNodeInfoCompatObtain2.getBoundsInParent(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
                accessibilityNodeInfoCompatObtain2.recycle();
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f20479c;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoCompatObtain.setBoundsInScreen(rect3);
                if (rect3 != null && !rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfoCompatObtain.setVisibleToUser(true);
                    }
                }
            }
        }
        return accessibilityNodeInfoCompatObtain;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(int i10, @Nullable Rect rect) {
        Object obj;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        int i11;
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat = new SparseArrayCompat<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            sparseArrayCompat.put(((Integer) arrayList.get(i12)).intValue(), b(((Integer) arrayList.get(i12)).intValue()));
        }
        int i13 = this.f20485i;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = i13 == Integer.MIN_VALUE ? null : sparseArrayCompat.get(i13);
        a aVar = f20476l;
        b bVar = m;
        View view = this.f20482f;
        if (i10 == 1 || i10 == 2) {
            boolean z10 = ViewCompat.getLayoutDirection(view) == 1;
            bVar.getClass();
            int size = sparseArrayCompat.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i14 = 0; i14 < size; i14++) {
                arrayList2.add(bVar.get(sparseArrayCompat, i14));
            }
            Collections.sort(arrayList2, new FocusStrategy.a(z10, aVar));
            if (i10 == 1) {
                int size2 = arrayList2.size();
                if (accessibilityNodeInfoCompat2 != null) {
                    size2 = arrayList2.indexOf(accessibilityNodeInfoCompat2);
                }
                int i15 = size2 - 1;
                if (i15 >= 0) {
                    obj = arrayList2.get(i15);
                } else {
                    obj = null;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size3 = arrayList2.size();
                int iLastIndexOf = (accessibilityNodeInfoCompat2 == null ? -1 : arrayList2.lastIndexOf(accessibilityNodeInfoCompat2)) + 1;
                if (iLastIndexOf < size3) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i16 = this.f20485i;
            if (i16 != Integer.MIN_VALUE) {
                d(i16).getBoundsInParent(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i10 == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i10 == 33) {
                    rect2.set(0, height, width, height);
                } else if (i10 == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i10 == 17) {
                i11 = 0;
                rect3.offset(rect2.width() + 1, 0);
            } else if (i10 == 33) {
                i11 = 0;
                rect3.offset(0, rect2.height() + 1);
            } else if (i10 == 66) {
                i11 = 0;
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i10 != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i11 = 0;
                rect3.offset(0, -(rect2.height() + 1));
            }
            bVar.getClass();
            int size4 = sparseArrayCompat.size();
            Rect rect4 = new Rect();
            Object obj2 = null;
            while (i11 < size4) {
                Object obj3 = bVar.get(sparseArrayCompat, i11);
                if (obj3 != accessibilityNodeInfoCompat2) {
                    aVar.obtainBounds(obj3, rect4);
                    if (FocusStrategy.c(i10, rect2, rect4)) {
                        if (!FocusStrategy.c(i10, rect2, rect3) || FocusStrategy.a(i10, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            obj2 = obj3;
                        } else if (!FocusStrategy.a(i10, rect2, rect3, rect4)) {
                            int iD = FocusStrategy.d(i10, rect2, rect4);
                            int iE = FocusStrategy.e(i10, rect2, rect4);
                            int i17 = (iE * iE) + (iD * 13 * iD);
                            int iD2 = FocusStrategy.d(i10, rect2, rect3);
                            int iE2 = FocusStrategy.e(i10, rect2, rect3);
                            if (i17 < (iE2 * iE2) + (iD2 * 13 * iD2)) {
                                rect3.set(rect4);
                                obj2 = obj3;
                            }
                        }
                    }
                }
                i11++;
            }
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj2;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = accessibilityNodeInfoCompat;
        return requestKeyboardFocusForVirtualView(accessibilityNodeInfoCompat3 != null ? sparseArrayCompat.keyAt(sparseArrayCompat.indexOfValue(accessibilityNodeInfoCompat3)) : Integer.MIN_VALUE);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i10) {
        if (this.f20485i != i10) {
            return false;
        }
        this.f20485i = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i10, false);
        sendEventForVirtualView(i10, 8);
        return true;
    }

    @NonNull
    public final AccessibilityNodeInfoCompat d(int i10) {
        if (i10 != -1) {
            return b(i10);
        }
        View view = this.f20482f;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(view);
        ViewCompat.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (accessibilityNodeInfoCompatObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            accessibilityNodeInfoCompatObtain.addChild(view, ((Integer) arrayList.get(i11)).intValue());
        }
        return accessibilityNodeInfoCompatObtain;
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        int i10;
        AccessibilityManager accessibilityManager = this.f20481e;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            int i11 = this.f20486j;
            if (i11 != virtualViewAt) {
                this.f20486j = virtualViewAt;
                sendEventForVirtualView(virtualViewAt, 128);
                sendEventForVirtualView(i11, 256);
            }
            return virtualViewAt != Integer.MIN_VALUE;
        }
        if (action != 10 || (i10 = this.f20486j) == Integer.MIN_VALUE) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f20486j = Integer.MIN_VALUE;
            sendEventForVirtualView(Integer.MIN_VALUE, 128);
            sendEventForVirtualView(i10, 256);
        }
        return true;
    }

    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return c(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return c(1, null);
            }
            return false;
        }
        int i11 = 66;
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    if (keyCode == 19) {
                        i11 = 33;
                    } else if (keyCode == 21) {
                        i11 = 17;
                    } else if (keyCode != 22) {
                        i11 = 130;
                    }
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z10 = false;
                    while (i10 < repeatCount && c(i11, null)) {
                        i10++;
                        z10 = true;
                    }
                    return z10;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        int i12 = this.f20485i;
        if (i12 != Integer.MIN_VALUE) {
            onPerformActionForVirtualView(i12, 16, null);
        }
        return true;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f20484h;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.f20483g == null) {
            this.f20483g = new c();
        }
        return this.f20483g;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.f20485i;
    }

    public abstract int getVirtualViewAt(float f6, float f10);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i10) {
        invalidateVirtualView(i10, 0);
    }

    public final void onFocusChanged(boolean z10, int i10, @Nullable Rect rect) {
        int i11 = this.f20485i;
        if (i11 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i11);
        }
        if (z10) {
            c(i10, rect);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        onPopulateNodeForHost(accessibilityNodeInfoCompat);
    }

    public abstract boolean onPerformActionForVirtualView(int i10, int i11, @Nullable Bundle bundle);

    public abstract void onPopulateNodeForVirtualView(int i10, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public final boolean requestKeyboardFocusForVirtualView(int i10) {
        int i11;
        View view = this.f20482f;
        if ((!view.isFocused() && !view.requestFocus()) || (i11 = this.f20485i) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f20485i = i10;
        onVirtualViewKeyboardFocusChanged(i10, true);
        sendEventForVirtualView(i10, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f20481e.isEnabled() || (parent = (view = this.f20482f).getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(view, a(i10, i11));
    }

    public final void invalidateVirtualView(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f20481e.isEnabled() || (parent = (view = this.f20482f).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventA = a(i10, 2048);
        AccessibilityEventCompat.setContentChangeTypes(accessibilityEventA, i11);
        parent.requestSendAccessibilityEvent(view, accessibilityEventA);
    }

    public void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void onPopulateEventForVirtualView(int i10, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onVirtualViewKeyboardFocusChanged(int i10, boolean z10) {
    }
}
