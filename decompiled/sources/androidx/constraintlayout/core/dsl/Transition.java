package androidx.constraintlayout.core.dsl;

import ad.d;
import androidx.appcompat.widget.a;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;

/* JADX INFO: loaded from: classes.dex */
public class Transition {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18703d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OnSwipe f18700a = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18704e = 400;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18705f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final KeyFrames f18706g = new KeyFrames();

    public Transition(String str, String str2) {
        this.f18701b = null;
        this.f18702c = null;
        this.f18703d = null;
        this.f18701b = "default";
        this.f18703d = str;
        this.f18702c = str2;
    }

    public String getId() {
        return this.f18701b;
    }

    public void setDuration(int i10) {
        this.f18704e = i10;
    }

    public void setFrom(String str) {
        this.f18703d = str;
    }

    public void setId(String str) {
        this.f18701b = str;
    }

    public void setKeyFrames(Keys keys) {
        this.f18706g.add(keys);
    }

    public void setOnSwipe(OnSwipe onSwipe) {
        this.f18700a = onSwipe;
    }

    public void setStagger(float f6) {
        this.f18705f = f6;
    }

    public void setTo(String str) {
        this.f18702c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18701b);
        sb2.append(":{\nfrom:'");
        sb2.append(this.f18703d);
        sb2.append("',\nto:'");
        String strF = d.f(sb2, this.f18702c, "',\n");
        if (this.f18704e != 400) {
            strF = a.c(f.e(strF, "duration:"), this.f18704e, ",\n");
        }
        if (this.f18705f != 0.0f) {
            strF = l0.a(f.e(strF, "stagger:"), this.f18705f, ",\n");
        }
        if (this.f18700a != null) {
            StringBuilder sbD = c.d(strF);
            sbD.append(this.f18700a.toString());
            strF = sbD.toString();
        }
        StringBuilder sbD2 = c.d(strF);
        sbD2.append(this.f18706g.toString());
        return u.f(sbD2.toString(), "},\n");
    }

    public Transition(String str, String str2, String str3) {
        this.f18701b = null;
        this.f18702c = null;
        this.f18703d = null;
        this.f18701b = str;
        this.f18703d = str2;
        this.f18702c = str3;
    }
}
