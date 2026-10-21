package com.dasnano.vddocumentcapture.managers;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.dasnano.vddocumentcapture.other.BidiCodeRectangle;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.noknok.android.client.utils.ViewWrapper;
import com.veridas.bidicode.entities.BidiCodeRegion;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f39453p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f39454q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f39455r0;

    public /* synthetic */ e(Object obj, Object obj2, int i10) {
        this.f39453p0 = i10;
        this.f39454q0 = obj;
        this.f39455r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        int i10 = this.f39453p0;
        Object obj = this.f39455r0;
        Object obj2 = this.f39454q0;
        switch (i10) {
            case 0:
                Rect rect2 = (Rect) obj;
                for (Map.Entry entry : ((UserVisualHelpManager) obj2).f39421l.entrySet()) {
                    if (rect2 != null) {
                        BidiCodeRegion bidiCodeRegion = (BidiCodeRegion) entry.getValue();
                        RectF rectF = new RectF();
                        rectF.left = (bidiCodeRegion.getX() * rect2.width()) + rect2.left;
                        rectF.top = (bidiCodeRegion.getY() * rect2.height()) + rect2.top;
                        rectF.right = (bidiCodeRegion.getW() * rect2.width()) + rectF.left;
                        rectF.bottom = (bidiCodeRegion.getH() * rect2.height()) + rectF.top;
                        rect = new Rect();
                        rectF.round(rect);
                    } else {
                        rect = null;
                    }
                    ((BidiCodeRectangle) entry.getKey()).setRect(rect);
                }
                break;
            case 1:
                ((EventHandler) ((Map.Entry) obj2).getKey()).handle((Event) obj);
                break;
            default:
                ViewWrapper.a((String) obj2, (View) obj);
                break;
        }
    }
}
