package androidx.recyclerview.widget;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: LayoutState.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23050e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23054i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23046a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23051f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23052g = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LayoutState{mAvailable=");
        sb2.append(this.f23047b);
        sb2.append(", mCurrentPosition=");
        sb2.append(this.f23048c);
        sb2.append(", mItemDirection=");
        sb2.append(this.f23049d);
        sb2.append(", mLayoutDirection=");
        sb2.append(this.f23050e);
        sb2.append(", mStartLine=");
        sb2.append(this.f23051f);
        sb2.append(", mEndLine=");
        return androidx.activity.a.d(sb2, this.f23052g, AbstractJsonLexerKt.END_OBJ);
    }
}
