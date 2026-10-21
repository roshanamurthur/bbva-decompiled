package androidx.constraintlayout.core.dsl;

import com.adobe.marketing.mobile.EventDataKeys;

/* JADX INFO: loaded from: classes.dex */
public abstract class Guideline extends Helper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18617c;

    public Guideline(String str) {
        super(str, new Helper.HelperType(""));
        this.f18615a = Integer.MIN_VALUE;
        this.f18616b = Integer.MIN_VALUE;
        this.f18617c = Float.NaN;
    }

    public int getEnd() {
        return this.f18616b;
    }

    public float getPercent() {
        return this.f18617c;
    }

    public int getStart() {
        return this.f18615a;
    }

    public void setEnd(int i10) {
        this.f18616b = i10;
        this.configMap.put("end", String.valueOf(i10));
    }

    public void setPercent(float f6) {
        this.f18617c = f6;
        this.configMap.put("percent", String.valueOf(f6));
    }

    public void setStart(int i10) {
        this.f18615a = i10;
        this.configMap.put(EventDataKeys.Lifecycle.LIFECYCLE_START, String.valueOf(i10));
    }
}
