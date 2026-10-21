package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

/* JADX INFO: compiled from: ContentScale.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0})
public final class ContentScaleKt {
    /* JADX INFO: renamed from: access$computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final float m3571access$computeFillHeightiLBOSCw(long j10, long j11) {
        return Size.m2341getHeightimpl(j11) / Size.m2341getHeightimpl(j10);
    }

    /* JADX INFO: renamed from: access$computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final float m3574access$computeFillWidthiLBOSCw(long j10, long j11) {
        return Size.m2344getWidthimpl(j11) / Size.m2344getWidthimpl(j10);
    }
}
