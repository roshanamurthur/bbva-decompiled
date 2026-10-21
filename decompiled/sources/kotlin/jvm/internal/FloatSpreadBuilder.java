package kotlin.jvm.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lkotlin/jvm/internal/FloatSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "", "getSize", "", "value", "", "add", "toArray", "size", "<init>", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class FloatSpreadBuilder extends PrimitiveSpreadBuilder<float[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final float[] f79723d;

    public FloatSpreadBuilder(int i10) {
        super(i10);
        this.f79723d = new float[i10];
    }

    public final void add(float value) {
        int position = getPosition();
        setPosition(position + 1);
        this.f79723d[position] = value;
    }

    @NotNull
    public final float[] toArray() {
        return toArray(this.f79723d, new float[size()]);
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }
}
