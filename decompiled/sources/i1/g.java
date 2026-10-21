package i1;

import androidx.compose.ui.node.MyersDiffKt;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f69481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f69482b;

    public g(int i10) {
        this.f69481a = new int[i10];
    }

    public final void a(int i10, int i11, int i12) {
        int i13 = this.f69482b;
        int i14 = i13 + 3;
        int[] iArr = this.f69481a;
        if (i14 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f69481a = iArrCopyOf;
        }
        int[] iArr2 = this.f69481a;
        iArr2[i13] = i10 + i12;
        iArr2[i13 + 1] = i11 + i12;
        iArr2[i13 + 2] = i12;
        this.f69482b = i14;
    }

    public final void b(int i10, int i11, int i12, int i13) {
        int i14 = this.f69482b;
        int i15 = i14 + 4;
        int[] iArr = this.f69481a;
        if (i15 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f69481a = iArrCopyOf;
        }
        int[] iArr2 = this.f69481a;
        iArr2[i14] = i10;
        iArr2[i14 + 1] = i11;
        iArr2[i14 + 2] = i12;
        iArr2[i14 + 3] = i13;
        this.f69482b = i15;
    }

    public final void c(int i10, int i11) {
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = this.f69481a;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 < i15 || (i14 == i15 && iArr[i13 + 1] <= iArr[i11 + 1])) {
                    int i16 = i12 + 3;
                    MyersDiffKt.access$swap(iArr, i16, i13);
                    MyersDiffKt.access$swap(iArr, i12 + 4, i13 + 1);
                    MyersDiffKt.access$swap(iArr, i12 + 5, i13 + 2);
                    i12 = i16;
                }
            }
            int[] iArr2 = this.f69481a;
            MyersDiffKt.access$swap(iArr2, i12 + 3, i11);
            MyersDiffKt.access$swap(iArr2, i12 + 4, i11 + 1);
            MyersDiffKt.access$swap(iArr2, i12 + 5, i11 + 2);
            c(i10, i12);
            c(i12 + 6, i11);
        }
    }
}
