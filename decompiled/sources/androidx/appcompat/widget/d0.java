package androidx.appcompat.widget;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: AppCompatReceiveContentHelper.java */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class d0 {
    @DoNotInline
    public static boolean a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ViewCompat.performReceiveContent(textView, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    @DoNotInline
    public static boolean b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        ViewCompat.performReceiveContent(view, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
        return true;
    }
}
