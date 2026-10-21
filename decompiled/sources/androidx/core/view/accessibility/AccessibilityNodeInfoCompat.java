package androidx.core.view.accessibility;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public class AccessibilityNodeInfoCompat {
    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String ACTION_ARGUMENT_DIRECTION_INT = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";
    public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    @SuppressLint({"ActionValue"})
    public static final String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";
    public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COLLAPSE = 524288;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_CUT = 65536;
    public static final int ACTION_DISMISS = 1048576;
    public static final int ACTION_EXPAND = 262144;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 32;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
    public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
    public static final int ACTION_PASTE = 32768;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
    public static final int ACTION_SCROLL_BACKWARD = 8192;
    public static final int ACTION_SCROLL_FORWARD = 4096;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 131072;
    public static final int ACTION_SET_TEXT = 2097152;
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
    public static final int EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH = 20000;
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
    public static final int FLAG_PREFETCH_ANCESTORS = 1;
    public static final int FLAG_PREFETCH_DESCENDANTS_BREADTH_FIRST = 16;
    public static final int FLAG_PREFETCH_DESCENDANTS_DEPTH_FIRST = 8;
    public static final int FLAG_PREFETCH_DESCENDANTS_HYBRID = 4;
    public static final int FLAG_PREFETCH_SIBLINGS = 2;
    public static final int FLAG_PREFETCH_UNINTERRUPTIBLE = 32;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;

    @SuppressLint({"MinMaxConstant"})
    public static final int MAX_NUMBER_OF_PREFETCHED_NODES = 50;
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f20365c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f20366a;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int mParentVirtualDescendantId = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20367b = -1;

    public static class AccessibilityActionCompat {
        public static final AccessibilityActionCompat ACTION_CONTEXT_CLICK;

        @NonNull
        public static final AccessibilityActionCompat ACTION_DRAG_CANCEL;

        @NonNull
        public static final AccessibilityActionCompat ACTION_DRAG_DROP;

        @NonNull
        public static final AccessibilityActionCompat ACTION_DRAG_START;
        public static final AccessibilityActionCompat ACTION_HIDE_TOOLTIP;

        @NonNull
        public static final AccessibilityActionCompat ACTION_IME_ENTER;
        public static final AccessibilityActionCompat ACTION_MOVE_WINDOW;

        @NonNull
        public static final AccessibilityActionCompat ACTION_PAGE_DOWN;

        @NonNull
        public static final AccessibilityActionCompat ACTION_PAGE_LEFT;

        @NonNull
        public static final AccessibilityActionCompat ACTION_PAGE_RIGHT;

        @NonNull
        public static final AccessibilityActionCompat ACTION_PAGE_UP;

        @NonNull
        public static final AccessibilityActionCompat ACTION_PRESS_AND_HOLD;
        public static final AccessibilityActionCompat ACTION_SCROLL_DOWN;

        @NonNull
        @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
        public static final AccessibilityActionCompat ACTION_SCROLL_IN_DIRECTION;
        public static final AccessibilityActionCompat ACTION_SCROLL_LEFT;
        public static final AccessibilityActionCompat ACTION_SCROLL_RIGHT;
        public static final AccessibilityActionCompat ACTION_SCROLL_TO_POSITION;
        public static final AccessibilityActionCompat ACTION_SCROLL_UP;
        public static final AccessibilityActionCompat ACTION_SET_PROGRESS;
        public static final AccessibilityActionCompat ACTION_SHOW_ON_SCREEN;

        @NonNull
        public static final AccessibilityActionCompat ACTION_SHOW_TEXT_SUGGESTIONS;
        public static final AccessibilityActionCompat ACTION_SHOW_TOOLTIP;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f20368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f20369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<? extends AccessibilityViewCommand.CommandArguments> f20370c;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected final AccessibilityViewCommand mCommand;
        public static final AccessibilityActionCompat ACTION_FOCUS = new AccessibilityActionCompat(1, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_FOCUS = new AccessibilityActionCompat(2, null);
        public static final AccessibilityActionCompat ACTION_SELECT = new AccessibilityActionCompat(4, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_SELECTION = new AccessibilityActionCompat(8, null);
        public static final AccessibilityActionCompat ACTION_CLICK = new AccessibilityActionCompat(16, null);
        public static final AccessibilityActionCompat ACTION_LONG_CLICK = new AccessibilityActionCompat(32, null);
        public static final AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(64, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(128, null);
        public static final AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(256, (CharSequence) null, (Class<? extends AccessibilityViewCommand.CommandArguments>) AccessibilityViewCommand.MoveAtGranularityArguments.class);
        public static final AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(512, (CharSequence) null, (Class<? extends AccessibilityViewCommand.CommandArguments>) AccessibilityViewCommand.MoveAtGranularityArguments.class);
        public static final AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT = new AccessibilityActionCompat(1024, (CharSequence) null, (Class<? extends AccessibilityViewCommand.CommandArguments>) AccessibilityViewCommand.MoveHtmlArguments.class);
        public static final AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT = new AccessibilityActionCompat(2048, (CharSequence) null, (Class<? extends AccessibilityViewCommand.CommandArguments>) AccessibilityViewCommand.MoveHtmlArguments.class);
        public static final AccessibilityActionCompat ACTION_SCROLL_FORWARD = new AccessibilityActionCompat(4096, null);
        public static final AccessibilityActionCompat ACTION_SCROLL_BACKWARD = new AccessibilityActionCompat(8192, null);
        public static final AccessibilityActionCompat ACTION_COPY = new AccessibilityActionCompat(16384, null);
        public static final AccessibilityActionCompat ACTION_PASTE = new AccessibilityActionCompat(32768, null);
        public static final AccessibilityActionCompat ACTION_CUT = new AccessibilityActionCompat(65536, null);
        public static final AccessibilityActionCompat ACTION_SET_SELECTION = new AccessibilityActionCompat(131072, (CharSequence) null, (Class<? extends AccessibilityViewCommand.CommandArguments>) AccessibilityViewCommand.SetSelectionArguments.class);
        public static final AccessibilityActionCompat ACTION_EXPAND = new AccessibilityActionCompat(262144, null);
        public static final AccessibilityActionCompat ACTION_COLLAPSE = new AccessibilityActionCompat(524288, null);
        public static final AccessibilityActionCompat ACTION_DISMISS = new AccessibilityActionCompat(1048576, null);
        public static final AccessibilityActionCompat ACTION_SET_TEXT = new AccessibilityActionCompat(2097152, (CharSequence) null, (Class<? extends AccessibilityViewCommand.CommandArguments>) AccessibilityViewCommand.SetTextArguments.class);

        static {
            int i10 = Build.VERSION.SDK_INT;
            ACTION_SHOW_ON_SCREEN = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            ACTION_SCROLL_TO_POSITION = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AccessibilityViewCommand.ScrollToPositionArguments.class);
            ACTION_SCROLL_UP = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            ACTION_SCROLL_LEFT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            ACTION_SCROLL_DOWN = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            ACTION_SCROLL_RIGHT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            ACTION_PAGE_UP = new AccessibilityActionCompat(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            ACTION_PAGE_DOWN = new AccessibilityActionCompat(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            ACTION_PAGE_LEFT = new AccessibilityActionCompat(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            ACTION_PAGE_RIGHT = new AccessibilityActionCompat(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            ACTION_CONTEXT_CLICK = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            ACTION_SET_PROGRESS = new AccessibilityActionCompat(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, AccessibilityViewCommand.SetProgressArguments.class);
            ACTION_MOVE_WINDOW = new AccessibilityActionCompat(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AccessibilityViewCommand.MoveWindowArguments.class);
            ACTION_SHOW_TOOLTIP = new AccessibilityActionCompat(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            ACTION_HIDE_TOOLTIP = new AccessibilityActionCompat(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            ACTION_PRESS_AND_HOLD = new AccessibilityActionCompat(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            ACTION_IME_ENTER = new AccessibilityActionCompat(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            ACTION_DRAG_START = new AccessibilityActionCompat(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            ACTION_DRAG_DROP = new AccessibilityActionCompat(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            ACTION_DRAG_CANCEL = new AccessibilityActionCompat(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            ACTION_SHOW_TEXT_SUGGESTIONS = new AccessibilityActionCompat(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            ACTION_SCROLL_IN_DIRECTION = new AccessibilityActionCompat(i10 >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public AccessibilityActionCompat(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public AccessibilityActionCompat createReplacementAction(CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            return new AccessibilityActionCompat(null, this.f20369b, charSequence, accessibilityViewCommand, this.f20370c);
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) obj;
            Object obj2 = this.f20368a;
            if (obj2 == null) {
                return accessibilityActionCompat.f20368a == null;
            }
            return obj2.equals(accessibilityActionCompat.f20368a);
        }

        public int getId() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f20368a).getId();
        }

        public CharSequence getLabel() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f20368a).getLabel();
        }

        public int hashCode() {
            Object obj = this.f20368a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean perform(View view, Bundle bundle) {
            if (this.mCommand == null) {
                return false;
            }
            Class<? extends AccessibilityViewCommand.CommandArguments> cls = this.f20370c;
            AccessibilityViewCommand.CommandArguments commandArguments = null;
            if (cls != null) {
                try {
                    AccessibilityViewCommand.CommandArguments commandArgumentsNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        commandArgumentsNewInstance.setBundle(bundle);
                        commandArguments = commandArgumentsNewInstance;
                    } catch (Exception unused) {
                        commandArguments = commandArgumentsNewInstance;
                        Class<? extends AccessibilityViewCommand.CommandArguments> cls2 = this.f20370c;
                        if (cls2 != null) {
                            cls2.getName();
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            return this.mCommand.perform(view, commandArguments);
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
            String strD = AccessibilityNodeInfoCompat.d(this.f20369b);
            if (strD.equals("ACTION_UNKNOWN") && getLabel() != null) {
                strD = getLabel().toString();
            }
            sb2.append(strD);
            return sb2.toString();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public AccessibilityActionCompat(int i10, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            this(null, i10, charSequence, accessibilityViewCommand, null);
        }

        public AccessibilityActionCompat(Object obj) {
            this(obj, 0, null, null, null);
        }

        private AccessibilityActionCompat(int i10, CharSequence charSequence, Class<? extends AccessibilityViewCommand.CommandArguments> cls) {
            this(null, i10, charSequence, null, cls);
        }

        public AccessibilityActionCompat(Object obj, int i10, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class<? extends AccessibilityViewCommand.CommandArguments> cls) {
            this.f20369b = i10;
            this.mCommand = accessibilityViewCommand;
            if (obj == null) {
                this.f20368a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f20368a = obj;
            }
            this.f20370c = cls;
        }
    }

    public static class CollectionInfoCompat {
        public static final int SELECTION_MODE_MULTIPLE = 2;
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f20371a;

        public CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f20371a = collectionInfo;
        }

        public static CollectionInfoCompat obtain(int i10, int i11, boolean z10, int i12) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }

        public int getColumnCount() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f20371a).getColumnCount();
        }

        public int getRowCount() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f20371a).getRowCount();
        }

        public int getSelectionMode() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f20371a).getSelectionMode();
        }

        public boolean isHierarchical() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f20371a).isHierarchical();
        }

        public static CollectionInfoCompat obtain(int i10, int i11, boolean z10) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }
    }

    public static class CollectionItemInfoCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f20372a;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f20373a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f20374b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f20375c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f20376d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f20377e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f20378f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public String f20379g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public String f20380h;

            @NonNull
            public CollectionItemInfoCompat build() {
                return Build.VERSION.SDK_INT >= 33 ? d.a(this.f20373a, this.f20374b, this.f20375c, this.f20376d, this.f20377e, this.f20378f, this.f20379g, this.f20380h) : b.a(this.f20375c, this.f20377e, this.f20374b, this.f20376d, this.f20373a, this.f20378f);
            }

            @NonNull
            public Builder setColumnIndex(int i10) {
                this.f20374b = i10;
                return this;
            }

            @NonNull
            public Builder setColumnSpan(int i10) {
                this.f20376d = i10;
                return this;
            }

            @NonNull
            public Builder setColumnTitle(@Nullable String str) {
                this.f20380h = str;
                return this;
            }

            @NonNull
            public Builder setHeading(boolean z10) {
                this.f20373a = z10;
                return this;
            }

            @NonNull
            public Builder setRowIndex(int i10) {
                this.f20375c = i10;
                return this;
            }

            @NonNull
            public Builder setRowSpan(int i10) {
                this.f20377e = i10;
                return this;
            }

            @NonNull
            public Builder setRowTitle(@Nullable String str) {
                this.f20379g = str;
                return this;
            }

            @NonNull
            public Builder setSelected(boolean z10) {
                this.f20378f = z10;
                return this;
            }
        }

        public CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f20372a = collectionItemInfo;
        }

        public static CollectionItemInfoCompat obtain(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }

        public int getColumnIndex() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f20372a).getColumnIndex();
        }

        public int getColumnSpan() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f20372a).getColumnSpan();
        }

        @Nullable
        public String getColumnTitle() {
            if (Build.VERSION.SDK_INT >= 33) {
                return d.c(this.f20372a);
            }
            return null;
        }

        public int getRowIndex() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f20372a).getRowIndex();
        }

        public int getRowSpan() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f20372a).getRowSpan();
        }

        @Nullable
        public String getRowTitle() {
            if (Build.VERSION.SDK_INT >= 33) {
                return d.d(this.f20372a);
            }
            return null;
        }

        @Deprecated
        public boolean isHeading() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f20372a).isHeading();
        }

        public boolean isSelected() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f20372a).isSelected();
        }

        public static CollectionItemInfoCompat obtain(int i10, int i11, int i12, int i13, boolean z10) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }
    }

    @RequiresApi(19)
    public static class a {
        @DoNotInline
        public static CollectionItemInfoCompat a(int i10, int i11, int i12, int i13, boolean z10) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        @DoNotInline
        public static Object b(int i10, float f6, float f10, float f11) {
            return AccessibilityNodeInfo.RangeInfo.obtain(i10, f6, f10, f11);
        }

        @DoNotInline
        public static Bundle c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    @RequiresApi(21)
    public static class b {
        @DoNotInline
        public static CollectionItemInfoCompat a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    @RequiresApi(30)
    public static class c {
        @DoNotInline
        public static Object a(int i10, float f6, float f10, float f11) {
            return new AccessibilityNodeInfo.RangeInfo(i10, f6, f10, f11);
        }

        @DoNotInline
        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        @DoNotInline
        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    @RequiresApi(33)
    public static class d {
        @DoNotInline
        public static CollectionItemInfoCompat a(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
            return new CollectionItemInfoCompat(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z10).setColumnIndex(i10).setRowIndex(i11).setColumnSpan(i12).setRowSpan(i13).setSelected(z11).setRowTitle(str).setColumnTitle(str2).build());
        }

        @DoNotInline
        public static AccessibilityNodeInfoCompat b(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
            return AccessibilityNodeInfoCompat.l(accessibilityNodeInfo.getChild(i10, i11));
        }

        @DoNotInline
        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        @DoNotInline
        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        @DoNotInline
        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        @DoNotInline
        public static AccessibilityNodeInfoCompat f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            return AccessibilityNodeInfoCompat.l(accessibilityNodeInfo.getParent(i10));
        }

        @DoNotInline
        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        @DoNotInline
        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        @DoNotInline
        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setTextSelectable(z10);
        }

        @DoNotInline
        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    @RequiresApi(34)
    public static class e {
        @DoNotInline
        public static void a(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        @DoNotInline
        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        @DoNotInline
        public static long c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        @DoNotInline
        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        @DoNotInline
        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        @DoNotInline
        public static void f(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }

        @DoNotInline
        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        @DoNotInline
        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        @DoNotInline
        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, long j10) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j10));
        }

        @DoNotInline
        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z10) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z10);
        }

        @DoNotInline
        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z10);
        }
    }

    @Deprecated
    public AccessibilityNodeInfoCompat(Object obj) {
        this.f20366a = (AccessibilityNodeInfo) obj;
    }

    private void a(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void b() {
        a.c(this.f20366a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        a.c(this.f20366a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        a.c(this.f20366a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        a.c(this.f20366a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> c(String str) {
        ArrayList<Integer> integerArrayList = a.c(this.f20366a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        a.c(this.f20366a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static String d(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean e(int i10) {
        Bundle extras = getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    private SparseArray<WeakReference<ClickableSpan>> f(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayG = g(view);
        if (sparseArrayG != null) {
            return sparseArrayG;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(androidx.core.R.id.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> g(View view) {
        return (SparseArray) view.getTag(androidx.core.R.id.tag_accessibility_clickable_spans);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] getClickableSpans(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private boolean h() {
        return !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int i(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f20365c;
        f20365c = i11 + 1;
        return i11;
    }

    private void j(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayG = g(view);
        if (sparseArrayG != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayG.size(); i10++) {
                if (sparseArrayG.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayG.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void k(int i10, boolean z10) {
        Bundle extras = getExtras();
        if (extras != null) {
            int i11 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public static AccessibilityNodeInfoCompat l(Object obj) {
        if (obj != null) {
            return new AccessibilityNodeInfoCompat(obj);
        }
        return null;
    }

    public static AccessibilityNodeInfoCompat obtain(View view) {
        return wrap(AccessibilityNodeInfo.obtain(view));
    }

    public static AccessibilityNodeInfoCompat wrap(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    public void addAction(int i10) {
        this.f20366a.addAction(i10);
    }

    public void addChild(View view) {
        this.f20366a.addChild(view);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addSpansToExtras(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            b();
            j(view);
            ClickableSpan[] clickableSpans = getClickableSpans(charSequence);
            if (clickableSpans == null || clickableSpans.length <= 0) {
                return;
            }
            getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", androidx.core.R.id.accessibility_action_clickable_span);
            SparseArray<WeakReference<ClickableSpan>> sparseArrayF = f(view);
            for (int i10 = 0; i10 < clickableSpans.length; i10++) {
                int i11 = i(clickableSpans[i10], sparseArrayF);
                sparseArrayF.put(i11, new WeakReference<>(clickableSpans[i10]));
                a(clickableSpans[i10], (Spanned) charSequence, i11);
            }
        }
    }

    public boolean canOpenPopup() {
        return this.f20366a.canOpenPopup();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f20366a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.f20366a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.f20366a)) {
            return false;
        }
        return this.f20367b == accessibilityNodeInfoCompat.f20367b && this.mParentVirtualDescendantId == accessibilityNodeInfoCompat.mParentVirtualDescendantId;
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = this.f20366a.findAccessibilityNodeInfosByText(str);
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(wrap(listFindAccessibilityNodeInfosByText.get(i10)));
        }
        return arrayList;
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByViewId(String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = this.f20366a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = listFindAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(wrap(it.next()));
        }
        return arrayList;
    }

    public AccessibilityNodeInfoCompat findFocus(int i10) {
        return l(this.f20366a.findFocus(i10));
    }

    public AccessibilityNodeInfoCompat focusSearch(int i10) {
        return l(this.f20366a.focusSearch(i10));
    }

    public List<AccessibilityActionCompat> getActionList() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f20366a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new AccessibilityActionCompat(actionList.get(i10)));
        }
        return arrayList;
    }

    @Deprecated
    public int getActions() {
        return this.f20366a.getActions();
    }

    @NonNull
    public List<String> getAvailableExtraData() {
        return Build.VERSION.SDK_INT >= 26 ? this.f20366a.getAvailableExtraData() : Collections.emptyList();
    }

    @Deprecated
    public void getBoundsInParent(Rect rect) {
        this.f20366a.getBoundsInParent(rect);
    }

    public void getBoundsInScreen(Rect rect) {
        this.f20366a.getBoundsInScreen(rect);
    }

    public void getBoundsInWindow(@NonNull Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.a(this.f20366a, rect);
            return;
        }
        Rect rect2 = (Rect) a.c(this.f20366a).getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public AccessibilityNodeInfoCompat getChild(int i10) {
        return l(this.f20366a.getChild(i10));
    }

    public int getChildCount() {
        return this.f20366a.getChildCount();
    }

    public CharSequence getClassName() {
        return this.f20366a.getClassName();
    }

    public CollectionInfoCompat getCollectionInfo() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f20366a.getCollectionInfo();
        if (collectionInfo != null) {
            return new CollectionInfoCompat(collectionInfo);
        }
        return null;
    }

    public CollectionItemInfoCompat getCollectionItemInfo() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f20366a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new CollectionItemInfoCompat(collectionItemInfo);
        }
        return null;
    }

    @Nullable
    public CharSequence getContainerTitle() {
        return Build.VERSION.SDK_INT >= 34 ? e.b(this.f20366a) : a.c(this.f20366a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public CharSequence getContentDescription() {
        return this.f20366a.getContentDescription();
    }

    public int getDrawingOrder() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f20366a.getDrawingOrder();
        }
        return 0;
    }

    public CharSequence getError() {
        return this.f20366a.getError();
    }

    @Nullable
    public AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
        if (Build.VERSION.SDK_INT >= 33) {
            return d.e(this.f20366a);
        }
        return null;
    }

    public Bundle getExtras() {
        return a.c(this.f20366a);
    }

    @Nullable
    public CharSequence getHintText() {
        return Build.VERSION.SDK_INT >= 26 ? this.f20366a.getHintText() : a.c(this.f20366a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    @Deprecated
    public Object getInfo() {
        return this.f20366a;
    }

    public int getInputType() {
        return this.f20366a.getInputType();
    }

    public AccessibilityNodeInfoCompat getLabelFor() {
        return l(this.f20366a.getLabelFor());
    }

    public AccessibilityNodeInfoCompat getLabeledBy() {
        return l(this.f20366a.getLabeledBy());
    }

    public int getLiveRegion() {
        return this.f20366a.getLiveRegion();
    }

    public int getMaxTextLength() {
        return this.f20366a.getMaxTextLength();
    }

    public long getMinDurationBetweenContentChangesMillis() {
        return Build.VERSION.SDK_INT >= 34 ? e.c(this.f20366a) : a.c(this.f20366a).getLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY");
    }

    public int getMovementGranularities() {
        return this.f20366a.getMovementGranularities();
    }

    public CharSequence getPackageName() {
        return this.f20366a.getPackageName();
    }

    @Nullable
    public CharSequence getPaneTitle() {
        return Build.VERSION.SDK_INT >= 28 ? this.f20366a.getPaneTitle() : a.c(this.f20366a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY");
    }

    public AccessibilityNodeInfoCompat getParent() {
        return l(this.f20366a.getParent());
    }

    public RangeInfoCompat getRangeInfo() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f20366a.getRangeInfo();
        if (rangeInfo != null) {
            return new RangeInfoCompat(rangeInfo);
        }
        return null;
    }

    @Nullable
    public CharSequence getRoleDescription() {
        return a.c(this.f20366a).getCharSequence("AccessibilityNodeInfo.roleDescription");
    }

    @Nullable
    public CharSequence getStateDescription() {
        return Build.VERSION.SDK_INT >= 30 ? c.b(this.f20366a) : a.c(this.f20366a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public CharSequence getText() {
        if (!h()) {
            return this.f20366a.getText();
        }
        List<Integer> listC = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listC2 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listC3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listC4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f20366a.getText(), 0, this.f20366a.getText().length()));
        for (int i10 = 0; i10 < listC.size(); i10++) {
            spannableString.setSpan(new AccessibilityClickableSpanCompat(listC4.get(i10).intValue(), this, getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listC.get(i10).intValue(), listC2.get(i10).intValue(), listC3.get(i10).intValue());
        }
        return spannableString;
    }

    public int getTextSelectionEnd() {
        return this.f20366a.getTextSelectionEnd();
    }

    public int getTextSelectionStart() {
        return this.f20366a.getTextSelectionStart();
    }

    @Nullable
    public CharSequence getTooltipText() {
        return Build.VERSION.SDK_INT >= 28 ? this.f20366a.getTooltipText() : a.c(this.f20366a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    @Nullable
    public TouchDelegateInfoCompat getTouchDelegateInfo() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        if (Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.f20366a.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new TouchDelegateInfoCompat(touchDelegateInfo);
    }

    public AccessibilityNodeInfoCompat getTraversalAfter() {
        return l(this.f20366a.getTraversalAfter());
    }

    public AccessibilityNodeInfoCompat getTraversalBefore() {
        return l(this.f20366a.getTraversalBefore());
    }

    @Nullable
    public String getUniqueId() {
        return Build.VERSION.SDK_INT >= 33 ? d.g(this.f20366a) : a.c(this.f20366a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public String getViewIdResourceName() {
        return this.f20366a.getViewIdResourceName();
    }

    public AccessibilityWindowInfoCompat getWindow() {
        AccessibilityWindowInfo window = this.f20366a.getWindow();
        if (window != null) {
            return new AccessibilityWindowInfoCompat(window);
        }
        return null;
    }

    public int getWindowId() {
        return this.f20366a.getWindowId();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean hasRequestInitialAccessibilityFocus() {
        return Build.VERSION.SDK_INT >= 34 ? e.d(this.f20366a) : e(32);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f20366a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean isAccessibilityDataSensitive() {
        return Build.VERSION.SDK_INT >= 34 ? e.e(this.f20366a) : e(64);
    }

    public boolean isAccessibilityFocused() {
        return this.f20366a.isAccessibilityFocused();
    }

    public boolean isCheckable() {
        return this.f20366a.isCheckable();
    }

    public boolean isChecked() {
        return this.f20366a.isChecked();
    }

    public boolean isClickable() {
        return this.f20366a.isClickable();
    }

    public boolean isContentInvalid() {
        return this.f20366a.isContentInvalid();
    }

    public boolean isContextClickable() {
        return this.f20366a.isContextClickable();
    }

    public boolean isDismissable() {
        return this.f20366a.isDismissable();
    }

    public boolean isEditable() {
        return this.f20366a.isEditable();
    }

    public boolean isEnabled() {
        return this.f20366a.isEnabled();
    }

    public boolean isFocusable() {
        return this.f20366a.isFocusable();
    }

    public boolean isFocused() {
        return this.f20366a.isFocused();
    }

    public boolean isGranularScrollingSupported() {
        return e(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
    }

    public boolean isHeading() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f20366a.isHeading();
        }
        if (e(2)) {
            return true;
        }
        CollectionItemInfoCompat collectionItemInfo = getCollectionItemInfo();
        return collectionItemInfo != null && collectionItemInfo.isHeading();
    }

    public boolean isImportantForAccessibility() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f20366a.isImportantForAccessibility();
        }
        return true;
    }

    public boolean isLongClickable() {
        return this.f20366a.isLongClickable();
    }

    public boolean isMultiLine() {
        return this.f20366a.isMultiLine();
    }

    public boolean isPassword() {
        return this.f20366a.isPassword();
    }

    public boolean isScreenReaderFocusable() {
        return Build.VERSION.SDK_INT >= 28 ? this.f20366a.isScreenReaderFocusable() : e(1);
    }

    public boolean isScrollable() {
        return this.f20366a.isScrollable();
    }

    public boolean isSelected() {
        return this.f20366a.isSelected();
    }

    public boolean isShowingHintText() {
        return Build.VERSION.SDK_INT >= 26 ? this.f20366a.isShowingHintText() : e(4);
    }

    public boolean isTextEntryKey() {
        return Build.VERSION.SDK_INT >= 29 ? this.f20366a.isTextEntryKey() : e(8);
    }

    public boolean isTextSelectable() {
        return Build.VERSION.SDK_INT >= 33 ? d.h(this.f20366a) : e(8388608);
    }

    public boolean isVisibleToUser() {
        return this.f20366a.isVisibleToUser();
    }

    public boolean performAction(int i10) {
        return this.f20366a.performAction(i10);
    }

    public boolean refresh() {
        return this.f20366a.refresh();
    }

    public boolean removeAction(AccessibilityActionCompat accessibilityActionCompat) {
        return this.f20366a.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f20368a);
    }

    public boolean removeChild(View view) {
        return this.f20366a.removeChild(view);
    }

    public void setAccessibilityDataSensitive(boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.f(this.f20366a, z10);
        } else {
            k(64, z10);
        }
    }

    public void setAccessibilityFocused(boolean z10) {
        this.f20366a.setAccessibilityFocused(z10);
    }

    public void setAvailableExtraData(@NonNull List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20366a.setAvailableExtraData(list);
        }
    }

    @Deprecated
    public void setBoundsInParent(Rect rect) {
        this.f20366a.setBoundsInParent(rect);
    }

    public void setBoundsInScreen(Rect rect) {
        this.f20366a.setBoundsInScreen(rect);
    }

    public void setBoundsInWindow(@NonNull Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.g(this.f20366a, rect);
        } else {
            a.c(this.f20366a).putParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY", rect);
        }
    }

    public void setCanOpenPopup(boolean z10) {
        this.f20366a.setCanOpenPopup(z10);
    }

    public void setCheckable(boolean z10) {
        this.f20366a.setCheckable(z10);
    }

    public void setChecked(boolean z10) {
        this.f20366a.setChecked(z10);
    }

    public void setClassName(CharSequence charSequence) {
        this.f20366a.setClassName(charSequence);
    }

    public void setClickable(boolean z10) {
        this.f20366a.setClickable(z10);
    }

    public void setCollectionInfo(Object obj) {
        this.f20366a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((CollectionInfoCompat) obj).f20371a);
    }

    public void setCollectionItemInfo(Object obj) {
        this.f20366a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((CollectionItemInfoCompat) obj).f20372a);
    }

    public void setContainerTitle(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.h(this.f20366a, charSequence);
        } else {
            a.c(this.f20366a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY", charSequence);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        this.f20366a.setContentDescription(charSequence);
    }

    public void setContentInvalid(boolean z10) {
        this.f20366a.setContentInvalid(z10);
    }

    public void setContextClickable(boolean z10) {
        this.f20366a.setContextClickable(z10);
    }

    public void setDismissable(boolean z10) {
        this.f20366a.setDismissable(z10);
    }

    public void setDrawingOrder(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f20366a.setDrawingOrder(i10);
        }
    }

    public void setEditable(boolean z10) {
        this.f20366a.setEditable(z10);
    }

    public void setEnabled(boolean z10) {
        this.f20366a.setEnabled(z10);
    }

    public void setError(CharSequence charSequence) {
        this.f20366a.setError(charSequence);
    }

    public void setFocusable(boolean z10) {
        this.f20366a.setFocusable(z10);
    }

    public void setFocused(boolean z10) {
        this.f20366a.setFocused(z10);
    }

    public void setGranularScrollingSupported(boolean z10) {
        k(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, z10);
    }

    public void setHeading(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f20366a.setHeading(z10);
        } else {
            k(2, z10);
        }
    }

    public void setHintText(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20366a.setHintText(charSequence);
        } else {
            a.c(this.f20366a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void setImportantForAccessibility(boolean z10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f20366a.setImportantForAccessibility(z10);
        }
    }

    public void setInputType(int i10) {
        this.f20366a.setInputType(i10);
    }

    public void setLabelFor(View view) {
        this.f20366a.setLabelFor(view);
    }

    public void setLabeledBy(View view) {
        this.f20366a.setLabeledBy(view);
    }

    public void setLiveRegion(int i10) {
        this.f20366a.setLiveRegion(i10);
    }

    public void setLongClickable(boolean z10) {
        this.f20366a.setLongClickable(z10);
    }

    public void setMaxTextLength(int i10) {
        this.f20366a.setMaxTextLength(i10);
    }

    public void setMinDurationBetweenContentChangesMillis(long j10) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.i(this.f20366a, j10);
        } else {
            a.c(this.f20366a).putLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY", j10);
        }
    }

    public void setMovementGranularities(int i10) {
        this.f20366a.setMovementGranularities(i10);
    }

    public void setMultiLine(boolean z10) {
        this.f20366a.setMultiLine(z10);
    }

    public void setPackageName(CharSequence charSequence) {
        this.f20366a.setPackageName(charSequence);
    }

    public void setPaneTitle(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f20366a.setPaneTitle(charSequence);
        } else {
            a.c(this.f20366a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void setParent(View view) {
        this.mParentVirtualDescendantId = -1;
        this.f20366a.setParent(view);
    }

    public void setPassword(boolean z10) {
        this.f20366a.setPassword(z10);
    }

    public void setQueryFromAppProcessEnabled(@NonNull View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.j(this.f20366a, view, z10);
        }
    }

    public void setRangeInfo(RangeInfoCompat rangeInfoCompat) {
        this.f20366a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) rangeInfoCompat.f20381a);
    }

    @SuppressLint({"GetterSetterNames"})
    public void setRequestInitialAccessibilityFocus(boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.k(this.f20366a, z10);
        } else {
            k(32, z10);
        }
    }

    public void setRoleDescription(@Nullable CharSequence charSequence) {
        a.c(this.f20366a).putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void setScreenReaderFocusable(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f20366a.setScreenReaderFocusable(z10);
        } else {
            k(1, z10);
        }
    }

    public void setScrollable(boolean z10) {
        this.f20366a.setScrollable(z10);
    }

    public void setSelected(boolean z10) {
        this.f20366a.setSelected(z10);
    }

    public void setShowingHintText(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20366a.setShowingHintText(z10);
        } else {
            k(4, z10);
        }
    }

    public void setSource(View view) {
        this.f20367b = -1;
        this.f20366a.setSource(view);
    }

    public void setStateDescription(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.c(this.f20366a, charSequence);
        } else {
            a.c(this.f20366a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f20366a.setText(charSequence);
    }

    public void setTextEntryKey(boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f20366a.setTextEntryKey(z10);
        } else {
            k(8, z10);
        }
    }

    public void setTextSelectable(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            d.i(this.f20366a, z10);
        } else {
            k(8388608, z10);
        }
    }

    public void setTextSelection(int i10, int i11) {
        this.f20366a.setTextSelection(i10, i11);
    }

    public void setTooltipText(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f20366a.setTooltipText(charSequence);
        } else {
            a.c(this.f20366a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void setTouchDelegateInfo(@NonNull TouchDelegateInfoCompat touchDelegateInfoCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f20366a.setTouchDelegateInfo(touchDelegateInfoCompat.f20382a);
        }
    }

    public void setTraversalAfter(View view) {
        this.f20366a.setTraversalAfter(view);
    }

    public void setTraversalBefore(View view) {
        this.f20366a.setTraversalBefore(view);
    }

    public void setUniqueId(@Nullable String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            d.j(this.f20366a, str);
        } else {
            a.c(this.f20366a).putString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY", str);
        }
    }

    public void setViewIdResourceName(String str) {
        this.f20366a.setViewIdResourceName(str);
    }

    public void setVisibleToUser(boolean z10) {
        this.f20366a.setVisibleToUser(z10);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        sb2.append("; boundsInParent: " + rect);
        getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        getBoundsInWindow(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(getPackageName());
        sb2.append("; className: ");
        sb2.append(getClassName());
        sb2.append("; text: ");
        sb2.append(getText());
        sb2.append("; error: ");
        sb2.append(getError());
        sb2.append("; maxTextLength: ");
        sb2.append(getMaxTextLength());
        sb2.append("; stateDescription: ");
        sb2.append(getStateDescription());
        sb2.append("; contentDescription: ");
        sb2.append(getContentDescription());
        sb2.append("; tooltipText: ");
        sb2.append(getTooltipText());
        sb2.append("; viewIdResName: ");
        sb2.append(getViewIdResourceName());
        sb2.append("; uniqueId: ");
        sb2.append(getUniqueId());
        sb2.append("; checkable: ");
        sb2.append(isCheckable());
        sb2.append("; checked: ");
        sb2.append(isChecked());
        sb2.append("; focusable: ");
        sb2.append(isFocusable());
        sb2.append("; focused: ");
        sb2.append(isFocused());
        sb2.append("; selected: ");
        sb2.append(isSelected());
        sb2.append("; clickable: ");
        sb2.append(isClickable());
        sb2.append("; longClickable: ");
        sb2.append(isLongClickable());
        sb2.append("; contextClickable: ");
        sb2.append(isContextClickable());
        sb2.append("; enabled: ");
        sb2.append(isEnabled());
        sb2.append("; password: ");
        sb2.append(isPassword());
        sb2.append("; scrollable: " + isScrollable());
        sb2.append("; containerTitle: ");
        sb2.append(getContainerTitle());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(isGranularScrollingSupported());
        sb2.append("; importantForAccessibility: ");
        sb2.append(isImportantForAccessibility());
        sb2.append("; visible: ");
        sb2.append(isVisibleToUser());
        sb2.append("; isTextSelectable: ");
        sb2.append(isTextSelectable());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(isAccessibilityDataSensitive());
        sb2.append("; [");
        List<AccessibilityActionCompat> actionList = getActionList();
        for (int i10 = 0; i10 < actionList.size(); i10++) {
            AccessibilityActionCompat accessibilityActionCompat = actionList.get(i10);
            String strD = d(accessibilityActionCompat.getId());
            if (strD.equals("ACTION_UNKNOWN") && accessibilityActionCompat.getLabel() != null) {
                strD = accessibilityActionCompat.getLabel().toString();
            }
            sb2.append(strD);
            if (i10 != actionList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(Constant.BRACKET_CLOSE);
        return sb2.toString();
    }

    public AccessibilityNodeInfo unwrap() {
        return this.f20366a;
    }

    public static class RangeInfoCompat {
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_PERCENT = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f20381a;

        public RangeInfoCompat(AccessibilityNodeInfo.RangeInfo rangeInfo) {
            this.f20381a = rangeInfo;
        }

        public static RangeInfoCompat obtain(int i10, float f6, float f10, float f11) {
            return new RangeInfoCompat(AccessibilityNodeInfo.RangeInfo.obtain(i10, f6, f10, f11));
        }

        public float getCurrent() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f20381a).getCurrent();
        }

        public float getMax() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f20381a).getMax();
        }

        public float getMin() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f20381a).getMin();
        }

        public int getType() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f20381a).getType();
        }

        public RangeInfoCompat(int i10, float f6, float f10, float f11) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f20381a = c.a(i10, f6, f10, f11);
            } else {
                this.f20381a = a.b(i10, f6, f10, f11);
            }
        }
    }

    public static AccessibilityNodeInfoCompat obtain(View view, int i10) {
        return l(AccessibilityNodeInfo.obtain(view, i10));
    }

    public void addAction(AccessibilityActionCompat accessibilityActionCompat) {
        this.f20366a.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f20368a);
    }

    public void addChild(View view, int i10) {
        this.f20366a.addChild(view, i10);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getChild(int i10, int i11) {
        return Build.VERSION.SDK_INT >= 33 ? d.b(this.f20366a, i10, i11) : getChild(i10);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getParent(int i10) {
        return Build.VERSION.SDK_INT >= 33 ? d.f(this.f20366a, i10) : getParent();
    }

    public boolean performAction(int i10, Bundle bundle) {
        return this.f20366a.performAction(i10, bundle);
    }

    public boolean removeChild(View view, int i10) {
        return this.f20366a.removeChild(view, i10);
    }

    public void setLabelFor(View view, int i10) {
        this.f20366a.setLabelFor(view, i10);
    }

    public void setLabeledBy(View view, int i10) {
        this.f20366a.setLabeledBy(view, i10);
    }

    public void setTraversalAfter(View view, int i10) {
        this.f20366a.setTraversalAfter(view, i10);
    }

    public void setTraversalBefore(View view, int i10) {
        this.f20366a.setTraversalBefore(view, i10);
    }

    public void setParent(View view, int i10) {
        this.mParentVirtualDescendantId = i10;
        this.f20366a.setParent(view, i10);
    }

    public void setSource(View view, int i10) {
        this.f20367b = i10;
        this.f20366a.setSource(view, i10);
    }

    public static final class TouchDelegateInfoCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccessibilityNodeInfo.TouchDelegateInfo f20382a;

        public TouchDelegateInfoCompat(@NonNull Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f20382a = androidx.appcompat.widget.q.d(map);
            } else {
                this.f20382a = null;
            }
        }

        @Nullable
        public Region getRegionAt(@IntRange(from = 0) int i10) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f20382a.getRegionAt(i10);
            }
            return null;
        }

        @IntRange(from = 0)
        public int getRegionCount() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f20382a.getRegionCount();
            }
            return 0;
        }

        @Nullable
        public AccessibilityNodeInfoCompat getTargetForRegion(@NonNull Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.f20382a.getTargetForRegion(region)) == null) {
                return null;
            }
            return AccessibilityNodeInfoCompat.wrap(targetForRegion);
        }

        public TouchDelegateInfoCompat(@NonNull AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f20382a = touchDelegateInfo;
        }
    }

    public static AccessibilityNodeInfoCompat obtain() {
        return wrap(AccessibilityNodeInfo.obtain());
    }

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f20366a = accessibilityNodeInfo;
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return wrap(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f20366a));
    }

    @Deprecated
    public void recycle() {
    }
}
