package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class DragStartHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f20192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OnDragStartListener f20193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f20197f = new View.OnLongClickListener() { // from class: androidx.core.view.r
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return this.f20406p0.onLongClick(view);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f20198g = new View.OnTouchListener() { // from class: androidx.core.view.s
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f20407p0.onTouch(view, motionEvent);
        }
    };

    public interface OnDragStartListener {
        boolean onDragStart(@NonNull View view, @NonNull DragStartHelper dragStartHelper);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.view.r] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.core.view.s] */
    public DragStartHelper(@NonNull View view, @NonNull OnDragStartListener onDragStartListener) {
        this.f20192a = view;
        this.f20193b = onDragStartListener;
    }

    public void attach() {
        View view = this.f20192a;
        view.setOnLongClickListener(this.f20197f);
        view.setOnTouchListener(this.f20198g);
    }

    public void detach() {
        View view = this.f20192a;
        view.setOnLongClickListener(null);
        view.setOnTouchListener(null);
    }

    public void getTouchPosition(@NonNull Point point) {
        point.set(this.f20194c, this.f20195d);
    }

    public boolean onLongClick(@NonNull View view) {
        if (this.f20196e) {
            return true;
        }
        boolean zOnDragStart = this.f20193b.onDragStart(view, this);
        this.f20196e = zOnDragStart;
        return zOnDragStart;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        int x4 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f20194c = x4;
            this.f20195d = y7;
        } else if (action == 1) {
            this.f20196e = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f20196e = false;
            }
        } else if (MotionEventCompat.isFromSource(motionEvent, 8194) && (motionEvent.getButtonState() & 1) != 0 && !this.f20196e && (this.f20194c != x4 || this.f20195d != y7)) {
            this.f20194c = x4;
            this.f20195d = y7;
            boolean zOnDragStart = this.f20193b.onDragStart(view, this);
            this.f20196e = zOnDragStart;
            return zOnDragStart;
        }
        return false;
    }
}
