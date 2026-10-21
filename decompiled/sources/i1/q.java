package i1;

import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class q {
    public static final int a(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }
}
