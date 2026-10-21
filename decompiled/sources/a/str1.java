package a;

import com.visa.CheckmarkMode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class str1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139a;

    static {
        int[] iArr = new int[CheckmarkMode.values().length];
        try {
            iArr[CheckmarkMode.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckmarkMode.CHECKMARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckmarkMode.CHECKMARK_WITH_TEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f139a = iArr;
    }
}
