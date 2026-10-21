package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.web.constant.NavigationOperations;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NestedVectorStack.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0004\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/NestedVectorStack;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "isNotEmpty", NavigationOperations.POP, "()Ljava/lang/Object;", "Landroidx/compose/runtime/collection/MutableVector;", "vector", "", "push", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestedVectorStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,57:1\n1182#2:58\n1161#2,2:59\n523#3:61\n523#3:62\n*S KotlinDebug\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n*L\n26#1:58\n26#1:59,2\n41#1:61\n47#1:62\n*E\n"})
public final class NestedVectorStack<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16876b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16875a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public int[] f16877c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableVector<MutableVector<T>> f16878d = new MutableVector<>(new MutableVector[16], 0);

    public final boolean isNotEmpty() {
        int i10 = this.f16875a;
        return i10 >= 0 && this.f16877c[i10] >= 0;
    }

    public final T pop() {
        int i10 = this.f16875a;
        int i11 = this.f16877c[i10];
        MutableVector<MutableVector<T>> mutableVector = this.f16878d;
        MutableVector<T> mutableVector2 = mutableVector.getContent()[i10];
        if (i11 > 0) {
            int[] iArr = this.f16877c;
            iArr[i10] = iArr[i10] - 1;
        } else if (i11 == 0) {
            mutableVector.removeAt(i10);
            this.f16875a--;
        }
        return mutableVector2.getContent()[i11];
    }

    public final void push(@NotNull MutableVector<T> vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        if (vector.isNotEmpty()) {
            this.f16878d.add(vector);
            int size = vector.getSize() - 1;
            int i10 = this.f16876b;
            int[] iArr = this.f16877c;
            if (i10 >= iArr.length) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                this.f16877c = iArrCopyOf;
            }
            int[] iArr2 = this.f16877c;
            int i11 = this.f16876b;
            this.f16876b = i11 + 1;
            iArr2[i11] = size;
            this.f16875a++;
        }
    }
}
