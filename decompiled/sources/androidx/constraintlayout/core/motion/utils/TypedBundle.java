package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class TypedBundle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f18943a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f18944b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18945c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f18946d = new int[10];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f18947e = new float[10];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18948f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f18949g = new int[5];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f18950h = new String[5];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18951i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f18952j = new int[4];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f18953k = new boolean[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18954l = 0;

    public void add(int i10, int i11) {
        int i12 = this.f18945c;
        int[] iArr = this.f18943a;
        if (i12 >= iArr.length) {
            this.f18943a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f18944b;
            this.f18944b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f18943a;
        int i13 = this.f18945c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f18944b;
        this.f18945c = i13 + 1;
        iArr4[i13] = i11;
    }

    public void addIfNotNull(int i10, String str) {
        if (str != null) {
            add(i10, str);
        }
    }

    public void applyDelta(TypedValues typedValues) {
        for (int i10 = 0; i10 < this.f18945c; i10++) {
            typedValues.setValue(this.f18943a[i10], this.f18944b[i10]);
        }
        for (int i11 = 0; i11 < this.f18948f; i11++) {
            typedValues.setValue(this.f18946d[i11], this.f18947e[i11]);
        }
        for (int i12 = 0; i12 < this.f18951i; i12++) {
            typedValues.setValue(this.f18949g[i12], this.f18950h[i12]);
        }
        for (int i13 = 0; i13 < this.f18954l; i13++) {
            typedValues.setValue(this.f18952j[i13], this.f18953k[i13]);
        }
    }

    public void clear() {
        this.f18954l = 0;
        this.f18951i = 0;
        this.f18948f = 0;
        this.f18945c = 0;
    }

    public int getInteger(int i10) {
        for (int i11 = 0; i11 < this.f18945c; i11++) {
            if (this.f18943a[i11] == i10) {
                return this.f18944b[i11];
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TypedBundle{mCountInt=");
        sb2.append(this.f18945c);
        sb2.append(", mCountFloat=");
        sb2.append(this.f18948f);
        sb2.append(", mCountString=");
        sb2.append(this.f18951i);
        sb2.append(", mCountBoolean=");
        return androidx.activity.a.d(sb2, this.f18954l, AbstractJsonLexerKt.END_OBJ);
    }

    public void add(int i10, float f6) {
        int i11 = this.f18948f;
        int[] iArr = this.f18946d;
        if (i11 >= iArr.length) {
            this.f18946d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f18947e;
            this.f18947e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f18946d;
        int i12 = this.f18948f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f18947e;
        this.f18948f = i12 + 1;
        fArr2[i12] = f6;
    }

    public void applyDelta(TypedBundle typedBundle) {
        for (int i10 = 0; i10 < this.f18945c; i10++) {
            typedBundle.add(this.f18943a[i10], this.f18944b[i10]);
        }
        for (int i11 = 0; i11 < this.f18948f; i11++) {
            typedBundle.add(this.f18946d[i11], this.f18947e[i11]);
        }
        for (int i12 = 0; i12 < this.f18951i; i12++) {
            typedBundle.add(this.f18949g[i12], this.f18950h[i12]);
        }
        for (int i13 = 0; i13 < this.f18954l; i13++) {
            typedBundle.add(this.f18952j[i13], this.f18953k[i13]);
        }
    }

    public void add(int i10, String str) {
        int i11 = this.f18951i;
        int[] iArr = this.f18949g;
        if (i11 >= iArr.length) {
            this.f18949g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f18950h;
            this.f18950h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f18949g;
        int i12 = this.f18951i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f18950h;
        this.f18951i = i12 + 1;
        strArr2[i12] = str;
    }

    public void add(int i10, boolean z10) {
        int i11 = this.f18954l;
        int[] iArr = this.f18952j;
        if (i11 >= iArr.length) {
            this.f18952j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f18953k;
            this.f18953k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f18952j;
        int i12 = this.f18954l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f18953k;
        this.f18954l = i12 + 1;
        zArr2[i12] = z10;
    }
}
