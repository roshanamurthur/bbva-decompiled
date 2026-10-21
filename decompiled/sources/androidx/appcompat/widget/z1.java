package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;

/* JADX INFO: compiled from: TooltipPopup.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f1712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f1713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f1714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1716g;

    public z1(@NonNull Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1713d = layoutParams;
        this.f1714e = new Rect();
        this.f1715f = new int[2];
        this.f1716g = new int[2];
        this.f1710a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1711b = viewInflate;
        this.f1712c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(z1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
