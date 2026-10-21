package com.mypinpad.tsdk.isolation;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/setLongClickable;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View;", "p0", "Landroid/view/MotionEvent;", "p1", "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Landroid/app/Activity;", "Lcom/mypinpad/tsdk/i/setTransitionGroup;", "<init>", "(Landroid/app/Activity;Lcom/mypinpad/tsdk/i/setTransitionGroup;)V", "setDividerPadding", "a"}, k = 1, mv = {1, 8, 0})
public final class setLongClickable implements View.OnTouchListener {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f60045s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f60046t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Activity f60047p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final setTransitionGroup f60048q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final GestureDetector f60049r0;

    public final class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f60050b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f60051c = 1;

        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:59:0x024a  */
        /* JADX WARN: Code duplicated, block: B:60:0x027a  */
        /* JADX WARN: Code duplicated, block: B:62:0x027e  */
        /* JADX WARN: Code duplicated, block: B:64:0x0297  */
        /* JADX WARN: Code duplicated, block: B:67:0x02b0  */
        /* JADX WARN: Code duplicated, block: B:71:0x02c4  */
        /* JADX WARN: Code duplicated, block: B:77:0x030f  */
        /* JADX WARN: Code duplicated, block: B:78:0x0315  */
        /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
        
            return java.lang.Boolean.TRUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
        
            return java.lang.Boolean.FALSE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
        
            if (r13 < r12) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
        
            if (r13 < r12) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00da, code lost:
        
            r12 = com.mypinpad.tsdk.i.setLongClickable.a.f60051c;
            r13 = ((r12 ^ 59) - (~((r12 & 59) << 1))) - 1;
            com.mypinpad.tsdk.i.setLongClickable.a.f60050b = r13 % 128;
            r13 = r13 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
        
            r12 = com.mypinpad.tsdk.i.setLongClickable.a.f60050b;
            r13 = ((r12 & 25) - (~(r12 | 25))) - 1;
            com.mypinpad.tsdk.i.setLongClickable.a.f60051c = r13 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00fa, code lost:
        
            if ((r13 % 2) != 0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00fc, code lost:
        
            r12 = 91 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x03dd, code lost:
        
            if (r12.getRawY() > (r13.height() >>> 115)) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x041a, code lost:
        
            if (r12 > ((r13 ^ r15) + ((r13 & r15) << 1))) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x041c, code lost:
        
            r12 = com.mypinpad.tsdk.i.setLongClickable.a.f60051c + 27;
            com.mypinpad.tsdk.i.setLongClickable.a.f60050b = r12 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0425, code lost:
        
            if ((r12 % 2) == 0) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0427, code lost:
        
            r12 = 12 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x042e, code lost:
        
            r12 = com.mypinpad.tsdk.i.setLongClickable.a.f60051c;
            r13 = ((r12 & (-16)) | ((~r12) & 15)) + ((r12 & 15) << 1);
            com.mypinpad.tsdk.i.setLongClickable.a.f60050b = r13 % 128;
            r13 = r13 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Boolean a(java.lang.Object[] r12, int r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 1234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setLongClickable.a.a(java.lang.Object[], int, int, int):java.lang.Boolean");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(@NotNull MotionEvent motionEvent) {
            return a(new Object[]{this, motionEvent}, -1289214008, 1289214009, System.identityHashCode(this)).booleanValue();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        @RequiresApi(30)
        public final boolean onFling(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2, float f6, float f10) {
            return a(new Object[]{this, motionEvent, motionEvent2, Float.valueOf(f6), Float.valueOf(f10)}, -1852029856, 1852029860, System.identityHashCode(this)).booleanValue();
        }
    }

    static {
        int i10 = f60045s0 + 5;
        f60046t0 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 38 / 0;
        }
    }

    public setLongClickable(@NotNull Activity activity, @NotNull setTransitionGroup settransitiongroup) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(settransitiongroup, "");
        this.f60047p0 = activity;
        this.f60048q0 = settransitiongroup;
        this.f60049r0 = new GestureDetector(activity, new a());
    }

    public static final /* synthetic */ Activity m_(setLongClickable setlongclickable) {
        return (Activity) setY(new Object[]{setlongclickable}, 1476030257, -1476030257, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-657)) + (i10 * 659);
        int i14 = ~((~i10) | i11);
        int i15 = ~((~i11) | i10);
        int i16 = ~(i10 | i12);
        int i17 = ((i14 | i15 | i16) * (-658)) + i13;
        int i18 = ((i16 | i15) * 658) + (i15 * 658) + i17;
        if (i18 == 1) {
            setLongClickable setlongclickable = (setLongClickable) objArr[0];
            View view = (View) objArr[1];
            MotionEvent motionEvent = (MotionEvent) objArr[2];
            int i19 = f60046t0;
            int i20 = (i19 | 61) << 1;
            int i21 = -(i19 ^ 61);
            int i22 = (i20 & i21) + (i21 | i20);
            f60045s0 = i22 % 128;
            int i23 = i22 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            boolean zOnTouchEvent = setlongclickable.f60049r0.onTouchEvent(motionEvent);
            int i24 = f60045s0;
            int i25 = (i24 ^ 97) + ((i24 & 97) << 1);
            f60046t0 = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 10 / 0;
            }
            return Boolean.valueOf(zOnTouchEvent);
        }
        if (i18 != 2) {
            setLongClickable setlongclickable2 = (setLongClickable) objArr[0];
            int i27 = f60046t0 + 95;
            f60045s0 = i27 % 128;
            int i28 = i27 % 2;
            Activity activity = setlongclickable2.f60047p0;
            if (i28 == 0) {
                return activity;
            }
            throw null;
        }
        setLongClickable setlongclickable3 = (setLongClickable) objArr[0];
        int i29 = f60046t0;
        int i30 = (i29 & 21) + (i29 | 21);
        f60045s0 = i30 % 128;
        int i31 = i30 % 2;
        setTransitionGroup settransitiongroup = setlongclickable3.f60048q0;
        if (i31 != 0) {
            int i32 = 43 / 0;
        }
        int i33 = (i29 & 71) + (i29 | 71);
        f60045s0 = i33 % 128;
        int i34 = i33 % 2;
        return settransitiongroup;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(@NotNull View p4, @NotNull MotionEvent p10) {
        return ((Boolean) setY(new Object[]{this, p4, p10}, 999235707, -999235706, System.identityHashCode(this))).booleanValue();
    }

    public static final /* synthetic */ setTransitionGroup setY(setLongClickable setlongclickable) {
        return (setTransitionGroup) setY(new Object[]{setlongclickable}, 291266401, -291266399, (int) System.currentTimeMillis());
    }
}
