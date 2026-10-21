package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* JADX INFO: compiled from: KeyPositionBase.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Key {
    protected static final float SELECTION_SLOPE = 20.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19582e = Key.UNSET;

    public abstract boolean intersects(int i10, int i11, RectF rectF, RectF rectF2, float f6, float f10);

    public abstract void positionAttributes(View view, RectF rectF, RectF rectF2, float f6, float f10, String[] strArr, float[] fArr);

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void getAttributeNames(HashSet<String> hashSet) {
    }
}
