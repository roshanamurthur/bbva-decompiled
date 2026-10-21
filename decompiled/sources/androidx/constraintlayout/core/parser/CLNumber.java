package androidx.constraintlayout.core.parser;

import androidx.appcompat.widget.g0;

/* JADX INFO: loaded from: classes.dex */
public class CLNumber extends CLElement {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f18966r0;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.f18966r0 = Float.NaN;
    }

    public static CLElement allocate(char[] cArr) {
        return new CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLNumber)) {
            return false;
        }
        float f6 = getFloat();
        float f10 = ((CLNumber) obj).getFloat();
        return (Float.isNaN(f6) && Float.isNaN(f10)) || f6 == f10;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if (Float.isNaN(this.f18966r0) && hasContent()) {
            this.f18966r0 = Float.parseFloat(content());
        }
        return this.f18966r0;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if (Float.isNaN(this.f18966r0) && hasContent()) {
            this.f18966r0 = Integer.parseInt(content());
        }
        return (int) this.f18966r0;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f6 = this.f18966r0;
        return iHashCode + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0);
    }

    public boolean isInt() {
        float f6 = getFloat();
        return ((float) ((int) f6)) == f6;
    }

    public void putValue(float f6) {
        this.f18966r0 = f6;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        addIndent(sb2, i10);
        float f6 = getFloat();
        int i12 = (int) f6;
        if (i12 == f6) {
            sb2.append(i12);
        } else {
            sb2.append(f6);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        float f6 = getFloat();
        int i10 = (int) f6;
        if (i10 == f6) {
            return g0.c("", i10);
        }
        return "" + f6;
    }

    public CLNumber(float f6) {
        super(null);
        this.f18966r0 = f6;
    }
}
