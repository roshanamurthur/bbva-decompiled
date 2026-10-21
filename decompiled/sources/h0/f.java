package h0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropStack$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,522:1\n151#2,3:523\n33#2,4:526\n154#2,2:530\n38#2:532\n156#2:533\n33#2,6:534\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropStack$1$1\n*L\n468#1:523,3\n468#1:526,4\n468#1:530,2\n468#1:532\n468#1:533\n472#1:534,6\n*E\n"})
public final class f extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68741p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<Constraints, Constraints> f68742q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function4<Constraints, Float, Composer, Integer, Unit> f68743r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f68744s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, Function2 function2, Function1 function1, Function4 function4) {
        super(2);
        this.f68741p0 = function2;
        this.f68742q0 = function1;
        this.f68743r0 = function4;
        this.f68744s0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        SubcomposeMeasureScope SubcomposeLayout = subcomposeMeasureScope;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        Placeable placeableMo3575measureBRTryo0 = ((Measurable) CollectionsKt___CollectionsKt.first((List) SubcomposeLayout.subcompose(b.Back, this.f68741p0))).mo3575measureBRTryo0(this.f68742q0.invoke(Constraints.m4346boximpl(f18296a)).getF18296a());
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(b.Front, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new e(this.f68743r0, f18296a, placeableMo3575measureBRTryo0.getHeight(), this.f68744s0)));
        ArrayList arrayList = new ArrayList(listSubcompose.size());
        int size = listSubcompose.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(listSubcompose.get(i10).mo3575measureBRTryo0(f18296a));
        }
        int iMax = Math.max(Constraints.m4359getMinWidthimpl(f18296a), placeableMo3575measureBRTryo0.getWidth());
        int iMax2 = Math.max(Constraints.m4358getMinHeightimpl(f18296a), placeableMo3575measureBRTryo0.getHeight());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Placeable placeable = (Placeable) arrayList.get(i11);
            iMax = Math.max(iMax, placeable.getWidth());
            iMax2 = Math.max(iMax2, placeable.getHeight());
        }
        return MeasureScope.CC.q(SubcomposeLayout, iMax, iMax2, null, new d(placeableMo3575measureBRTryo0, arrayList), 4, null);
    }
}
