package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ContentScale.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "computeScaleFactor", "Landroidx/compose/ui/layout/ScaleFactor;", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeScaleFactor-H7hwNQA", "(JJ)J", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ContentScale {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f16531a;

    /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    long mo3570computeScaleFactorH7hwNQA(long srcSize, long dstSize);

    /* JADX INFO: compiled from: ContentScale.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0018\u0010\b\u001a\u0004\b\u0017\u0010\u0006R \u0010 \u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010\b\u001a\u0004\b\u001d\u0010\u001eR \u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0004\u0012\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u0006¨\u0006&"}, d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "Landroidx/compose/ui/layout/ContentScale;", "b", "Landroidx/compose/ui/layout/ContentScale;", "getCrop", "()Landroidx/compose/ui/layout/ContentScale;", "getCrop$annotations", "()V", "Crop", "c", "getFit", "getFit$annotations", "Fit", "d", "getFillHeight", "getFillHeight$annotations", "FillHeight", "e", "getFillWidth", "getFillWidth$annotations", "FillWidth", "f", "getInside", "getInside$annotations", "Inside", "Landroidx/compose/ui/layout/FixedScale;", "g", "Landroidx/compose/ui/layout/FixedScale;", "getNone", "()Landroidx/compose/ui/layout/FixedScale;", "getNone$annotations", "None", "h", "getFillBounds", "getFillBounds$annotations", "FillBounds", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f16531a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final ContentScale$Companion$Crop$1 f16532b = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo3570computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float fMax = Math.max(Size.m2344getWidthimpl(dstSize) / Size.m2344getWidthimpl(srcSize), Size.m2341getHeightimpl(dstSize) / Size.m2341getHeightimpl(srcSize));
                return ScaleFactorKt.ScaleFactor(fMax, fMax);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final ContentScale$Companion$Fit$1 f16533c = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo3570computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float fMin = Math.min(Size.m2344getWidthimpl(dstSize) / Size.m2344getWidthimpl(srcSize), Size.m2341getHeightimpl(dstSize) / Size.m2341getHeightimpl(srcSize));
                return ScaleFactorKt.ScaleFactor(fMin, fMin);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final ContentScale$Companion$FillHeight$1 f16534d = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo3570computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float fM3571access$computeFillHeightiLBOSCw = ContentScaleKt.m3571access$computeFillHeightiLBOSCw(srcSize, dstSize);
                return ScaleFactorKt.ScaleFactor(fM3571access$computeFillHeightiLBOSCw, fM3571access$computeFillHeightiLBOSCw);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final ContentScale$Companion$FillWidth$1 f16535e = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo3570computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float fM3574access$computeFillWidthiLBOSCw = ContentScaleKt.m3574access$computeFillWidthiLBOSCw(srcSize, dstSize);
                return ScaleFactorKt.ScaleFactor(fM3574access$computeFillWidthiLBOSCw, fM3574access$computeFillWidthiLBOSCw);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final ContentScale$Companion$Inside$1 f16536f = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo3570computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                if (Size.m2344getWidthimpl(srcSize) <= Size.m2344getWidthimpl(dstSize) && Size.m2341getHeightimpl(srcSize) <= Size.m2341getHeightimpl(dstSize)) {
                    return ScaleFactorKt.ScaleFactor(1.0f, 1.0f);
                }
                float fMin = Math.min(Size.m2344getWidthimpl(dstSize) / Size.m2344getWidthimpl(srcSize), Size.m2341getHeightimpl(dstSize) / Size.m2341getHeightimpl(srcSize));
                return ScaleFactorKt.ScaleFactor(fMin, fMin);
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final FixedScale None = new FixedScale(1.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final ContentScale$Companion$FillBounds$1 f16538h = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo3570computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                return ScaleFactorKt.ScaleFactor(ContentScaleKt.m3574access$computeFillWidthiLBOSCw(srcSize, dstSize), ContentScaleKt.m3571access$computeFillHeightiLBOSCw(srcSize, dstSize));
            }
        };

        @NotNull
        public final ContentScale getCrop() {
            return f16532b;
        }

        @NotNull
        public final ContentScale getFillBounds() {
            return f16538h;
        }

        @NotNull
        public final ContentScale getFillHeight() {
            return f16534d;
        }

        @NotNull
        public final ContentScale getFillWidth() {
            return f16535e;
        }

        @NotNull
        public final ContentScale getFit() {
            return f16533c;
        }

        @NotNull
        public final ContentScale getInside() {
            return f16536f;
        }

        @NotNull
        public final FixedScale getNone() {
            return None;
        }

        @Stable
        public static /* synthetic */ void getCrop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillBounds$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillHeight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillWidth$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFit$annotations() {
        }

        @Stable
        public static /* synthetic */ void getInside$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
