package kotlin.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u0003*\u00028\u0000H$¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0003H\u0004J\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "getSize", "(Ljava/lang/Object;)I", "spreadArgument", "", "addSpread", "(Ljava/lang/Object;)V", "size", "values", "result", "toArray", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPosition", "()I", "setPosition", "(I)V", "position", "<init>", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public abstract class PrimitiveSpreadBuilder<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final T[] f79730c;

    public PrimitiveSpreadBuilder(int i10) {
        this.f79728a = i10;
        this.f79730c = (T[]) new Object[i10];
    }

    public final void addSpread(@NotNull T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        int i10 = this.position;
        this.position = i10 + 1;
        this.f79730c[i10] = spreadArgument;
    }

    public final int getPosition() {
        return this.position;
    }

    public abstract int getSize(@NotNull T t10);

    public final void setPosition(int i10) {
        this.position = i10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public final int size() {
        int size = 0;
        ?? it = new IntRange(0, this.f79728a - 1).iterator();
        while (it.hasNext()) {
            T t10 = this.f79730c[it.nextInt()];
            size += t10 != null ? getSize(t10) : 1;
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @NotNull
    public final T toArray(@NotNull T values, @NotNull T result) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        int i10 = this.f79728a;
        ?? it = new IntRange(0, i10 - 1).iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            T t10 = this.f79730c[iNextInt];
            if (t10 != null) {
                if (i11 < iNextInt) {
                    int i13 = iNextInt - i11;
                    System.arraycopy(values, i11, result, i12, i13);
                    i12 += i13;
                }
                int size = getSize(t10);
                System.arraycopy(t10, 0, result, i12, size);
                i12 += size;
                i11 = iNextInt + 1;
            }
        }
        if (i11 < i10) {
            System.arraycopy(values, i11, result, i12, i10 - i11);
        }
        return result;
    }
}
