package dh;

import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: MultiFinderPatternFinder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends FinderPatternFinder {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FinderPatternInfo[] f68181f = new FinderPatternInfo[0];

    /* JADX INFO: renamed from: dh.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MultiFinderPatternFinder.java */
    public static final class C0281a implements Serializable, Comparator<FinderPattern> {
        @Override // java.util.Comparator
        public final int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            double estimatedModuleSize = finderPattern2.getEstimatedModuleSize() - finderPattern.getEstimatedModuleSize();
            if (estimatedModuleSize < 0.0d) {
                return -1;
            }
            return estimatedModuleSize > 0.0d ? 1 : 0;
        }
    }
}
