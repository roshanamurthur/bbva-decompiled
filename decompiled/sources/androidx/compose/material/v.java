package androidx.compose.material;

import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v extends Lambda implements Function1<IntSize, Map<BottomSheetValue, ? extends Float>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f9054p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ float f9055q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i10, float f6) {
        super(1);
        this.f9054p0 = i10;
        this.f9055q0 = f6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<BottomSheetValue, ? extends Float> invoke(IntSize intSize) {
        float fM4548getHeightimpl = IntSize.m4548getHeightimpl(intSize.getF18319a());
        float f6 = this.f9054p0;
        float f10 = this.f9055q0;
        float f11 = f6 - f10;
        return (fM4548getHeightimpl == 0.0f || fM4548getHeightimpl == f10) ? bk.p.mapOf(TuplesKt.to(BottomSheetValue.Collapsed, Float.valueOf(f11))) : bk.q.mapOf(TuplesKt.to(BottomSheetValue.Collapsed, Float.valueOf(f11)), TuplesKt.to(BottomSheetValue.Expanded, Float.valueOf(f6 - fM4548getHeightimpl)));
    }
}
