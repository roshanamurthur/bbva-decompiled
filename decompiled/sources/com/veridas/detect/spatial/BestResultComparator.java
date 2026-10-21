package com.veridas.detect.spatial;

import com.veridas.math.geometry.Rectangle;
import java.util.Comparator;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BestResultComparator.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/veridas/detect/spatial/BestResultComparator;", "Ljava/util/Comparator;", "Lcom/veridas/math/geometry/Rectangle;", "Lkotlin/Comparator;", "()V", "compare", "", "o1", "o2", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BestResultComparator implements Comparator<Rectangle> {
    @Override // java.util.Comparator
    public int compare(@Nullable Rectangle o2, @Nullable Rectangle o10) {
        return Double.compare(o2 == null ? 0.0d : o2.area(), o10 != null ? o10.area() : 0.0d);
    }
}
