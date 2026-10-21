package androidx.core.view.accessibility;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessibilityEventCompat {
    public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
    public static final int CONTENT_CHANGE_TYPE_CONTENT_INVALID = 1024;
    public static final int CONTENT_CHANGE_TYPE_DRAG_CANCELLED = 512;
    public static final int CONTENT_CHANGE_TYPE_DRAG_DROPPED = 256;
    public static final int CONTENT_CHANGE_TYPE_DRAG_STARTED = 128;
    public static final int CONTENT_CHANGE_TYPE_ENABLED = 4096;
    public static final int CONTENT_CHANGE_TYPE_ERROR = 2048;
    public static final int CONTENT_CHANGE_TYPE_PANE_APPEARED = 16;
    public static final int CONTENT_CHANGE_TYPE_PANE_DISAPPEARED = 32;
    public static final int CONTENT_CHANGE_TYPE_PANE_TITLE = 8;
    public static final int CONTENT_CHANGE_TYPE_STATE_DESCRIPTION = 64;
    public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
    public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
    public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
    public static final int TYPES_ALL_MASK = -1;
    public static final int TYPE_ANNOUNCEMENT = 16384;
    public static final int TYPE_ASSIST_READING_CONTEXT = 16777216;
    public static final int TYPE_GESTURE_DETECTION_END = 524288;
    public static final int TYPE_GESTURE_DETECTION_START = 262144;

    @Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;

    @Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
    public static final int TYPE_TOUCH_INTERACTION_END = 2097152;
    public static final int TYPE_TOUCH_INTERACTION_START = 1048576;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 65536;
    public static final int TYPE_VIEW_CONTEXT_CLICKED = 8388608;

    @Deprecated
    public static final int TYPE_VIEW_HOVER_ENTER = 128;

    @Deprecated
    public static final int TYPE_VIEW_HOVER_EXIT = 256;

    @Deprecated
    public static final int TYPE_VIEW_SCROLLED = 4096;
    public static final int TYPE_VIEW_TARGETED_BY_SCROLL = 67108864;

    @Deprecated
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
    public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
    public static final int TYPE_WINDOWS_CHANGED = 4194304;

    @Deprecated
    public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ContentChangeType {
    }

    @RequiresApi(16)
    public static class a {
        @DoNotInline
        public static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @DoNotInline
        public static int b(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @DoNotInline
        public static void c(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setAction(i10);
        }

        @DoNotInline
        public static void d(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setMovementGranularity(i10);
        }
    }

    @RequiresApi(19)
    public static class b {
        @DoNotInline
        public static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @DoNotInline
        public static void b(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    @RequiresApi(34)
    public static class c {
        @DoNotInline
        public static boolean a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.isAccessibilityDataSensitive();
        }

        @DoNotInline
        public static void b(AccessibilityEvent accessibilityEvent, boolean z10) {
            accessibilityEvent.setAccessibilityDataSensitive(z10);
        }
    }

    @Deprecated
    public static void appendRecord(AccessibilityEvent accessibilityEvent, AccessibilityRecordCompat accessibilityRecordCompat) {
        accessibilityEvent.appendRecord((AccessibilityRecord) accessibilityRecordCompat.getImpl());
    }

    @Deprecated
    public static AccessibilityRecordCompat asRecord(AccessibilityEvent accessibilityEvent) {
        return new AccessibilityRecordCompat(accessibilityEvent);
    }

    public static int getAction(@NonNull AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static int getContentChangeTypes(@NonNull AccessibilityEvent accessibilityEvent) {
        return b.a(accessibilityEvent);
    }

    public static int getMovementGranularity(@NonNull AccessibilityEvent accessibilityEvent) {
        return a.b(accessibilityEvent);
    }

    @Deprecated
    public static AccessibilityRecordCompat getRecord(AccessibilityEvent accessibilityEvent, int i10) {
        return new AccessibilityRecordCompat(accessibilityEvent.getRecord(i10));
    }

    @Deprecated
    public static int getRecordCount(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static boolean isAccessibilityDataSensitive(@NonNull AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(accessibilityEvent);
        }
        return false;
    }

    public static void setAccessibilityDataSensitive(@NonNull AccessibilityEvent accessibilityEvent, boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.b(accessibilityEvent, z10);
        }
    }

    public static void setAction(@NonNull AccessibilityEvent accessibilityEvent, int i10) {
        a.c(accessibilityEvent, i10);
    }

    public static void setContentChangeTypes(@NonNull AccessibilityEvent accessibilityEvent, int i10) {
        b.b(accessibilityEvent, i10);
    }

    public static void setMovementGranularity(@NonNull AccessibilityEvent accessibilityEvent, int i10) {
        a.d(accessibilityEvent, i10);
    }
}
