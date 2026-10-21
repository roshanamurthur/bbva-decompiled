package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Arrays;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public class Ref {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18699d;

    public Ref(String str, float f6, float f10, float f11) {
        this.f18696a = str;
        this.f18697b = f6;
        this.f18698c = f10;
        this.f18699d = f11;
    }

    public static void addStringToReferences(String str, ArrayList<Ref> arrayList) {
        Object obj;
        if (str == null || str.length() == 0) {
            return;
        }
        Object[] objArr = new Object[4];
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != ' ' && cCharAt != '\'') {
                if (cCharAt == ',') {
                    if (i10 < 3) {
                        objArr[i10] = sb2.toString();
                        sb2.setLength(0);
                        i10++;
                    }
                    if (i11 == 1 && (obj = objArr[0]) != null) {
                        String string = obj.toString();
                        Ref ref = new Ref();
                        ref.f18697b = Float.NaN;
                        ref.f18698c = Float.NaN;
                        ref.f18699d = Float.NaN;
                        ref.f18696a = string;
                        arrayList.add(ref);
                        objArr[0] = null;
                        i10 = 0;
                    }
                } else if (cCharAt == '[') {
                    i11++;
                } else if (cCharAt != ']') {
                    sb2.append(cCharAt);
                } else if (i11 > 0) {
                    i11--;
                    objArr[i10] = sb2.toString();
                    sb2.setLength(0);
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        arrayList.add(new Ref(obj2.toString(), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3])));
                        Arrays.fill(objArr, (Object) null);
                        i10 = 0;
                    }
                }
            }
        }
    }

    public static float parseFloat(Object obj) {
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception unused) {
            return Float.NaN;
        }
    }

    public static Ref parseStringToRef(String str) {
        String[] strArrSplit = str.replaceAll("[\\[\\]\\']", "").split(",");
        if (strArrSplit.length == 0) {
            return null;
        }
        Object[] objArr = new Object[4];
        for (int i10 = 0; i10 < strArrSplit.length && i10 < 4; i10++) {
            objArr[i10] = strArrSplit[i10];
        }
        return new Ref(objArr[0].toString().replace("'", ""), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3]));
    }

    public String getId() {
        return this.f18696a;
    }

    public float getPostMargin() {
        return this.f18699d;
    }

    public float getPreMargin() {
        return this.f18698c;
    }

    public float getWeight() {
        return this.f18697b;
    }

    public void setId(String str) {
        this.f18696a = str;
    }

    public void setPostMargin(float f6) {
        this.f18699d = f6;
    }

    public void setPreMargin(float f6) {
        this.f18698c = f6;
    }

    public void setWeight(float f6) {
        this.f18697b = f6;
    }

    public String toString() {
        String str = this.f18696a;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = (Float.isNaN(this.f18697b) && Float.isNaN(this.f18698c) && Float.isNaN(this.f18699d)) ? false : true;
        if (z10) {
            sb2.append(Constant.BRACKET_OPEN);
        }
        sb2.append("'");
        sb2.append(this.f18696a);
        sb2.append("'");
        if (!Float.isNaN(this.f18699d)) {
            sb2.append(",");
            sb2.append(!Float.isNaN(this.f18697b) ? this.f18697b : 0.0f);
            sb2.append(",");
            sb2.append(Float.isNaN(this.f18698c) ? 0.0f : this.f18698c);
            sb2.append(",");
            sb2.append(this.f18699d);
        } else if (!Float.isNaN(this.f18698c)) {
            sb2.append(",");
            sb2.append(Float.isNaN(this.f18697b) ? 0.0f : this.f18697b);
            sb2.append(",");
            sb2.append(this.f18698c);
        } else if (!Float.isNaN(this.f18697b)) {
            sb2.append(",");
            sb2.append(this.f18697b);
        }
        if (z10) {
            sb2.append(Constant.BRACKET_CLOSE);
        }
        sb2.append(",");
        return sb2.toString();
    }
}
