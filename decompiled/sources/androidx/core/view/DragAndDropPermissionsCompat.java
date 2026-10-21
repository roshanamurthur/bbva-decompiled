package androidx.core.view;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public final class DragAndDropPermissionsCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DragAndDropPermissions f20191a;

    @RequiresApi(24)
    public static class a {
        @DoNotInline
        public static void a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @DoNotInline
        public static DragAndDropPermissions b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    public DragAndDropPermissionsCompat(DragAndDropPermissions dragAndDropPermissions) {
        this.f20191a = dragAndDropPermissions;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static DragAndDropPermissionsCompat request(@NonNull Activity activity, @NonNull DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsB;
        if (Build.VERSION.SDK_INT < 24 || (dragAndDropPermissionsB = a.b(activity, dragEvent)) == null) {
            return null;
        }
        return new DragAndDropPermissionsCompat(dragAndDropPermissionsB);
    }

    public void release() {
        if (Build.VERSION.SDK_INT >= 24) {
            a.a(this.f20191a);
        }
    }
}
