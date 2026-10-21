package re;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f92996a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f92996a = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f92996a[Bitmap.Config.ARGB_8888.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
