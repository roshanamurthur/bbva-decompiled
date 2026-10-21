package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.constraintlayout.motion.widget.Key;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VectorCompose.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a©\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Group", "", "name", "", Key.ROTATION, "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Path", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,165:1\n325#2,11:166\n251#2,10:177\n*S KotlinDebug\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n*L\n59#1:166,11\n116#1:177,10\n*E\n"})
public final class VectorComposeKt {

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class a extends Lambda implements Function0<GroupComponent> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16044p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final GroupComponent invoke() {
            return new GroupComponent();
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class a0 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ float E0;
        public final /* synthetic */ float F0;
        public final /* synthetic */ float G0;
        public final /* synthetic */ float H0;
        public final /* synthetic */ int I0;
        public final /* synthetic */ int J0;
        public final /* synthetic */ int K0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<PathNode> f16045p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f16046q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f16047r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Brush f16048s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f16049t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Brush f16050u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f16051w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f16052x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f16053y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a0(List<? extends PathNode> list, int i10, String str, Brush brush, float f6, Brush brush2, float f10, float f11, int i11, int i12, float f12, float f13, float f14, float f15, int i13, int i14, int i15) {
            super(2);
            this.f16045p0 = list;
            this.f16046q0 = i10;
            this.f16047r0 = str;
            this.f16048s0 = brush;
            this.f16049t0 = f6;
            this.f16050u0 = brush2;
            this.v0 = f10;
            this.f16051w0 = f11;
            this.f16052x0 = i11;
            this.f16053y0 = i12;
            this.E0 = f12;
            this.F0 = f13;
            this.G0 = f14;
            this.H0 = f15;
            this.I0 = i13;
            this.J0 = i14;
            this.K0 = i15;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VectorComposeKt.m3023Path9cdaXJ4(this.f16045p0, this.f16046q0, this.f16047r0, this.f16048s0, this.f16049t0, this.f16050u0, this.v0, this.f16051w0, this.f16052x0, this.f16053y0, this.E0, this.F0, this.G0, this.H0, composer, RecomposeScopeImplKt.updateChangedFlags(this.I0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.J0), this.K0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class b extends Lambda implements Function2<GroupComponent, String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f16054p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(GroupComponent groupComponent, String str) {
            GroupComponent set = groupComponent;
            String it = str;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            set.setName(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class c extends Lambda implements Function2<GroupComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f16055p0 = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(GroupComponent groupComponent, Float f6) {
            GroupComponent set = groupComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setRotation(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class d extends Lambda implements Function2<GroupComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f16056p0 = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(GroupComponent groupComponent, Float f6) {
            GroupComponent set = groupComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setPivotX(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class e extends Lambda implements Function2<GroupComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f16057p0 = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(GroupComponent groupComponent, Float f6) {
            GroupComponent set = groupComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setPivotY(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class f extends Lambda implements Function2<GroupComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f16058p0 = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(GroupComponent groupComponent, Float f6) {
            GroupComponent set = groupComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setScaleX(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class g extends Lambda implements Function2<GroupComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f16059p0 = new g(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(GroupComponent groupComponent, Float f6) {
            GroupComponent set = groupComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setScaleY(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class h extends Lambda implements Function2<GroupComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f16060p0 = new h(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(GroupComponent groupComponent, Float f6) {
            GroupComponent set = groupComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setTranslationX(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class i extends Lambda implements Function2<GroupComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f16061p0 = new i(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(GroupComponent groupComponent, Float f6) {
            GroupComponent set = groupComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setTranslationY(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class j extends Lambda implements Function2<GroupComponent, List<? extends PathNode>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f16062p0 = new j(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list) {
            GroupComponent set = groupComponent;
            List<? extends PathNode> it = list;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            set.setClipPathData(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f16063p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f16064q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f16065r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f16066s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f16067t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f16068u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f16069w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ List<PathNode> f16070x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f16071y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, List<? extends PathNode> list, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f16063p0 = str;
            this.f16064q0 = f6;
            this.f16065r0 = f10;
            this.f16066s0 = f11;
            this.f16067t0 = f12;
            this.f16068u0 = f13;
            this.v0 = f14;
            this.f16069w0 = f15;
            this.f16070x0 = list;
            this.f16071y0 = function2;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VectorComposeKt.Group(this.f16063p0, this.f16064q0, this.f16065r0, this.f16066s0, this.f16067t0, this.f16068u0, this.v0, this.f16069w0, this.f16070x0, this.f16071y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class l extends Lambda implements Function0<PathComponent> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f16072p0 = new l(0);

        @Override // kotlin.jvm.functions.Function0
        public final PathComponent invoke() {
            return new PathComponent();
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class m extends Lambda implements Function2<PathComponent, StrokeCap, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final m f16073p0 = new m(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
            PathComponent set = pathComponent;
            int f15732a = strokeCap.getF15732a();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.m3021setStrokeLineCapBeK7IIE(f15732a);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class n extends Lambda implements Function2<PathComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final n f16074p0 = new n(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, Float f6) {
            PathComponent set = pathComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setStrokeLineMiter(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class o extends Lambda implements Function2<PathComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f16075p0 = new o(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, Float f6) {
            PathComponent set = pathComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setTrimPathStart(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class p extends Lambda implements Function2<PathComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final p f16076p0 = new p(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, Float f6) {
            PathComponent set = pathComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setTrimPathEnd(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class q extends Lambda implements Function2<PathComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f16077p0 = new q(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, Float f6) {
            PathComponent set = pathComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setTrimPathOffset(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class r extends Lambda implements Function2<PathComponent, String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final r f16078p0 = new r(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, String str) {
            PathComponent set = pathComponent;
            String it = str;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            set.setName(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class s extends Lambda implements Function2<PathComponent, List<? extends PathNode>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final s f16079p0 = new s(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, List<? extends PathNode> list) {
            PathComponent set = pathComponent;
            List<? extends PathNode> it = list;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            set.setPathData(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class t extends Lambda implements Function2<PathComponent, PathFillType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final t f16080p0 = new t(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
            PathComponent set = pathComponent;
            int f15686a = pathFillType.getF15686a();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.m3020setPathFillTypeoQ8Xj4U(f15686a);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class u extends Lambda implements Function2<PathComponent, Brush, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final u f16081p0 = new u(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, Brush brush) {
            PathComponent set = pathComponent;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setFill(brush);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class v extends Lambda implements Function2<PathComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final v f16082p0 = new v(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, Float f6) {
            PathComponent set = pathComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setFillAlpha(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class w extends Lambda implements Function2<PathComponent, Brush, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final w f16083p0 = new w(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, Brush brush) {
            PathComponent set = pathComponent;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setStroke(brush);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class x extends Lambda implements Function2<PathComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final x f16084p0 = new x(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, Float f6) {
            PathComponent set = pathComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setStrokeAlpha(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class y extends Lambda implements Function2<PathComponent, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final y f16085p0 = new y(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, Float f6) {
            PathComponent set = pathComponent;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.setStrokeLineWidth(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorCompose.kt */
    public static final class z extends Lambda implements Function2<PathComponent, StrokeJoin, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final z f16086p0 = new z(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
            PathComponent set = pathComponent;
            int f15736a = strokeJoin.getF15736a();
            Intrinsics.checkNotNullParameter(set, "$this$set");
            set.m3022setStrokeLineJoinWw9F2mQ(f15736a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:107:0x014c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x016f A[PHI: r2 r4 r5 r6 r7 r9 r13 r14 r15
      0x016f: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:141:0x019e, B:115:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r4v26 int) = (r4v22 int), (r4v27 int) binds: [B:141:0x019e, B:115:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r5v5 float) = (r5v2 float), (r5v6 float) binds: [B:141:0x019e, B:115:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r6v15 float) = (r6v11 float), (r6v17 float) binds: [B:141:0x019e, B:115:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r7v10 float) = (r7v6 float), (r7v11 float) binds: [B:141:0x019e, B:115:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r9v7 float) = (r9v3 float), (r9v2 float) binds: [B:141:0x019e, B:115:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r13v9 float) = (r13v6 float), (r13v10 float) binds: [B:141:0x019e, B:115:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r14v6 float) = (r14v3 float), (r14v2 float) binds: [B:141:0x019e, B:115:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r15v9 float) = (r15v6 float), (r15v10 float) binds: [B:141:0x019e, B:115:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0174  */
    /* JADX WARN: Code duplicated, block: B:119:0x0177  */
    /* JADX WARN: Code duplicated, block: B:122:0x017c  */
    /* JADX WARN: Code duplicated, block: B:123:0x017e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0182  */
    /* JADX WARN: Code duplicated, block: B:127:0x0185  */
    /* JADX WARN: Code duplicated, block: B:130:0x018a  */
    /* JADX WARN: Code duplicated, block: B:131:0x018c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191  */
    /* JADX WARN: Code duplicated, block: B:136:0x0195  */
    /* JADX WARN: Code duplicated, block: B:137:0x0197  */
    /* JADX WARN: Code duplicated, block: B:140:0x019c  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:155:0x023e  */
    /* JADX WARN: Code duplicated, block: B:160:0x024e  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x011f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0122  */
    @VectorComposable
    @Composable
    public static final void Group(@Nullable String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, @Nullable List<? extends PathNode> list, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        float f16;
        int i14;
        int i15;
        float f17;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        String str2;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        List<? extends PathNode> emptyPath;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        List<? extends PathNode> list2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-213417674);
        int i27 = i11 & 1;
        if (i27 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i28 = i11 & 2;
        if (i28 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(f6) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    f16 = f10;
                    if (composerStartRestartGroup.changed(f16)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        f17 = f11;
                        if (composerStartRestartGroup.changed(f17)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        i12 |= 24576;
                    } else if ((i10 & 57344) == 0) {
                        if (composerStartRestartGroup.changed(f12)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f13)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f14)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    i23 = i11 & 128;
                    if (i23 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f15)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i12 |= i24;
                    }
                    i25 = i11 & 256;
                    if (i25 != 0) {
                        i12 |= 33554432;
                    }
                    if ((i11 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i26 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i26 = 268435456;
                            }
                        }
                        if (i25 != 256 && (1533916891 & i12) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            str2 = str;
                            f18 = f6;
                            f19 = f12;
                            f24 = f13;
                            f27 = f14;
                            f23 = f15;
                            f25 = f16;
                            f26 = f17;
                            list2 = list;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f6;
                                }
                                if (i13 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i15 != 0) {
                                    f17 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = f12;
                                }
                                f20 = i19 == 0 ? f13 : 1.0f;
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                f22 = i23 == 0 ? f15 : 0.0f;
                                if (i25 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i12 &= -234881025;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                                }
                                composerStartRestartGroup.startReplaceableGroup(-548224868);
                                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(a.f16044p0);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                                Updater.m2081setimpl(composerM2074constructorimpl, str2, b.f16054p0);
                                Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f18), c.f16055p0);
                                Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f16), d.f16056p0);
                                Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f17), e.f16057p0);
                                Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f19), f.f16058p0);
                                Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f20), g.f16059p0);
                                Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f21), h.f16060p0);
                                Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f22), i.f16061p0);
                                Updater.m2081setimpl(composerM2074constructorimpl, emptyPath, j.f16062p0);
                                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f23 = f22;
                                f24 = f20;
                                f25 = f16;
                                f26 = f17;
                                f27 = f21;
                                list2 = emptyPath;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if (i25 != 0) {
                                    i12 &= -234881025;
                                }
                                str2 = str;
                                f18 = f6;
                                f19 = f12;
                                f20 = f13;
                                f21 = f14;
                                f22 = f15;
                            }
                            emptyPath = list;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-548224868);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(a.f16044p0);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            Updater.m2081setimpl(composerM2074constructorimpl2, str2, b.f16054p0);
                            Updater.m2081setimpl(composerM2074constructorimpl2, Float.valueOf(f18), c.f16055p0);
                            Updater.m2081setimpl(composerM2074constructorimpl2, Float.valueOf(f16), d.f16056p0);
                            Updater.m2081setimpl(composerM2074constructorimpl2, Float.valueOf(f17), e.f16057p0);
                            Updater.m2081setimpl(composerM2074constructorimpl2, Float.valueOf(f19), f.f16058p0);
                            Updater.m2081setimpl(composerM2074constructorimpl2, Float.valueOf(f20), g.f16059p0);
                            Updater.m2081setimpl(composerM2074constructorimpl2, Float.valueOf(f21), h.f16060p0);
                            Updater.m2081setimpl(composerM2074constructorimpl2, Float.valueOf(f22), i.f16061p0);
                            Updater.m2081setimpl(composerM2074constructorimpl2, emptyPath, j.f16062p0);
                            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f23 = f22;
                            f24 = f20;
                            f25 = f16;
                            f26 = f17;
                            f27 = f21;
                            list2 = emptyPath;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
                    }
                    i26 = 805306368;
                    i12 |= i26;
                    if (i25 != 256) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(a.f16044p0);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl3, str2, b.f16054p0);
                        Updater.m2081setimpl(composerM2074constructorimpl3, Float.valueOf(f18), c.f16055p0);
                        Updater.m2081setimpl(composerM2074constructorimpl3, Float.valueOf(f16), d.f16056p0);
                        Updater.m2081setimpl(composerM2074constructorimpl3, Float.valueOf(f17), e.f16057p0);
                        Updater.m2081setimpl(composerM2074constructorimpl3, Float.valueOf(f19), f.f16058p0);
                        Updater.m2081setimpl(composerM2074constructorimpl3, Float.valueOf(f20), g.f16059p0);
                        Updater.m2081setimpl(composerM2074constructorimpl3, Float.valueOf(f21), h.f16060p0);
                        Updater.m2081setimpl(composerM2074constructorimpl3, Float.valueOf(f22), i.f16061p0);
                        Updater.m2081setimpl(composerM2074constructorimpl3, emptyPath, j.f16062p0);
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f23 = f22;
                        f24 = f20;
                        f25 = f16;
                        f26 = f17;
                        f27 = f21;
                        list2 = emptyPath;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(a.f16044p0);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl4, str2, b.f16054p0);
                        Updater.m2081setimpl(composerM2074constructorimpl4, Float.valueOf(f18), c.f16055p0);
                        Updater.m2081setimpl(composerM2074constructorimpl4, Float.valueOf(f16), d.f16056p0);
                        Updater.m2081setimpl(composerM2074constructorimpl4, Float.valueOf(f17), e.f16057p0);
                        Updater.m2081setimpl(composerM2074constructorimpl4, Float.valueOf(f19), f.f16058p0);
                        Updater.m2081setimpl(composerM2074constructorimpl4, Float.valueOf(f20), g.f16059p0);
                        Updater.m2081setimpl(composerM2074constructorimpl4, Float.valueOf(f21), h.f16060p0);
                        Updater.m2081setimpl(composerM2074constructorimpl4, Float.valueOf(f22), i.f16061p0);
                        Updater.m2081setimpl(composerM2074constructorimpl4, emptyPath, j.f16062p0);
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f23 = f22;
                        f24 = f20;
                        f25 = f16;
                        f26 = f17;
                        f27 = f21;
                        list2 = emptyPath;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
                }
                i12 |= 3072;
                f17 = f11;
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f12)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f13)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f14)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & 128;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f15)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                i25 = i11 & 256;
                if (i25 != 0) {
                    i12 |= 33554432;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                    }
                    if (i25 != 256) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(a.f16044p0);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl5 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl5, str2, b.f16054p0);
                        Updater.m2081setimpl(composerM2074constructorimpl5, Float.valueOf(f18), c.f16055p0);
                        Updater.m2081setimpl(composerM2074constructorimpl5, Float.valueOf(f16), d.f16056p0);
                        Updater.m2081setimpl(composerM2074constructorimpl5, Float.valueOf(f17), e.f16057p0);
                        Updater.m2081setimpl(composerM2074constructorimpl5, Float.valueOf(f19), f.f16058p0);
                        Updater.m2081setimpl(composerM2074constructorimpl5, Float.valueOf(f20), g.f16059p0);
                        Updater.m2081setimpl(composerM2074constructorimpl5, Float.valueOf(f21), h.f16060p0);
                        Updater.m2081setimpl(composerM2074constructorimpl5, Float.valueOf(f22), i.f16061p0);
                        Updater.m2081setimpl(composerM2074constructorimpl5, emptyPath, j.f16062p0);
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f23 = f22;
                        f24 = f20;
                        f25 = f16;
                        f26 = f17;
                        f27 = f21;
                        list2 = emptyPath;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(a.f16044p0);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl6 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl6, str2, b.f16054p0);
                        Updater.m2081setimpl(composerM2074constructorimpl6, Float.valueOf(f18), c.f16055p0);
                        Updater.m2081setimpl(composerM2074constructorimpl6, Float.valueOf(f16), d.f16056p0);
                        Updater.m2081setimpl(composerM2074constructorimpl6, Float.valueOf(f17), e.f16057p0);
                        Updater.m2081setimpl(composerM2074constructorimpl6, Float.valueOf(f19), f.f16058p0);
                        Updater.m2081setimpl(composerM2074constructorimpl6, Float.valueOf(f20), g.f16059p0);
                        Updater.m2081setimpl(composerM2074constructorimpl6, Float.valueOf(f21), h.f16060p0);
                        Updater.m2081setimpl(composerM2074constructorimpl6, Float.valueOf(f22), i.f16061p0);
                        Updater.m2081setimpl(composerM2074constructorimpl6, emptyPath, j.f16062p0);
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f23 = f22;
                        f24 = f20;
                        f25 = f16;
                        f26 = f17;
                        f27 = f21;
                        list2 = emptyPath;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
                }
                i26 = 805306368;
                i12 |= i26;
                if (i25 != 256) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(a.f16044p0);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl7 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl7, str2, b.f16054p0);
                    Updater.m2081setimpl(composerM2074constructorimpl7, Float.valueOf(f18), c.f16055p0);
                    Updater.m2081setimpl(composerM2074constructorimpl7, Float.valueOf(f16), d.f16056p0);
                    Updater.m2081setimpl(composerM2074constructorimpl7, Float.valueOf(f17), e.f16057p0);
                    Updater.m2081setimpl(composerM2074constructorimpl7, Float.valueOf(f19), f.f16058p0);
                    Updater.m2081setimpl(composerM2074constructorimpl7, Float.valueOf(f20), g.f16059p0);
                    Updater.m2081setimpl(composerM2074constructorimpl7, Float.valueOf(f21), h.f16060p0);
                    Updater.m2081setimpl(composerM2074constructorimpl7, Float.valueOf(f22), i.f16061p0);
                    Updater.m2081setimpl(composerM2074constructorimpl7, emptyPath, j.f16062p0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f23 = f22;
                    f24 = f20;
                    f25 = f16;
                    f26 = f17;
                    f27 = f21;
                    list2 = emptyPath;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(a.f16044p0);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl8 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl8, str2, b.f16054p0);
                    Updater.m2081setimpl(composerM2074constructorimpl8, Float.valueOf(f18), c.f16055p0);
                    Updater.m2081setimpl(composerM2074constructorimpl8, Float.valueOf(f16), d.f16056p0);
                    Updater.m2081setimpl(composerM2074constructorimpl8, Float.valueOf(f17), e.f16057p0);
                    Updater.m2081setimpl(composerM2074constructorimpl8, Float.valueOf(f19), f.f16058p0);
                    Updater.m2081setimpl(composerM2074constructorimpl8, Float.valueOf(f20), g.f16059p0);
                    Updater.m2081setimpl(composerM2074constructorimpl8, Float.valueOf(f21), h.f16060p0);
                    Updater.m2081setimpl(composerM2074constructorimpl8, Float.valueOf(f22), i.f16061p0);
                    Updater.m2081setimpl(composerM2074constructorimpl8, emptyPath, j.f16062p0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f23 = f22;
                    f24 = f20;
                    f25 = f16;
                    f26 = f17;
                    f27 = f21;
                    list2 = emptyPath;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            f16 = f10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    f17 = f11;
                    if (composerStartRestartGroup.changed(f17)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f12)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f13)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f14)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & 128;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f15)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                i25 = i11 & 256;
                if (i25 != 0) {
                    i12 |= 33554432;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                    }
                    if (i25 != 256) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(a.f16044p0);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl9 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl9, str2, b.f16054p0);
                        Updater.m2081setimpl(composerM2074constructorimpl9, Float.valueOf(f18), c.f16055p0);
                        Updater.m2081setimpl(composerM2074constructorimpl9, Float.valueOf(f16), d.f16056p0);
                        Updater.m2081setimpl(composerM2074constructorimpl9, Float.valueOf(f17), e.f16057p0);
                        Updater.m2081setimpl(composerM2074constructorimpl9, Float.valueOf(f19), f.f16058p0);
                        Updater.m2081setimpl(composerM2074constructorimpl9, Float.valueOf(f20), g.f16059p0);
                        Updater.m2081setimpl(composerM2074constructorimpl9, Float.valueOf(f21), h.f16060p0);
                        Updater.m2081setimpl(composerM2074constructorimpl9, Float.valueOf(f22), i.f16061p0);
                        Updater.m2081setimpl(composerM2074constructorimpl9, emptyPath, j.f16062p0);
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f23 = f22;
                        f24 = f20;
                        f25 = f16;
                        f26 = f17;
                        f27 = f21;
                        list2 = emptyPath;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(a.f16044p0);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl10 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl10, str2, b.f16054p0);
                        Updater.m2081setimpl(composerM2074constructorimpl10, Float.valueOf(f18), c.f16055p0);
                        Updater.m2081setimpl(composerM2074constructorimpl10, Float.valueOf(f16), d.f16056p0);
                        Updater.m2081setimpl(composerM2074constructorimpl10, Float.valueOf(f17), e.f16057p0);
                        Updater.m2081setimpl(composerM2074constructorimpl10, Float.valueOf(f19), f.f16058p0);
                        Updater.m2081setimpl(composerM2074constructorimpl10, Float.valueOf(f20), g.f16059p0);
                        Updater.m2081setimpl(composerM2074constructorimpl10, Float.valueOf(f21), h.f16060p0);
                        Updater.m2081setimpl(composerM2074constructorimpl10, Float.valueOf(f22), i.f16061p0);
                        Updater.m2081setimpl(composerM2074constructorimpl10, emptyPath, j.f16062p0);
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f23 = f22;
                        f24 = f20;
                        f25 = f16;
                        f26 = f17;
                        f27 = f21;
                        list2 = emptyPath;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
                }
                i26 = 805306368;
                i12 |= i26;
                if (i25 != 256) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(a.f16044p0);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl11 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl11, str2, b.f16054p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11, Float.valueOf(f18), c.f16055p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11, Float.valueOf(f16), d.f16056p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11, Float.valueOf(f17), e.f16057p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11, Float.valueOf(f19), f.f16058p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11, Float.valueOf(f20), g.f16059p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11, Float.valueOf(f21), h.f16060p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11, Float.valueOf(f22), i.f16061p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11, emptyPath, j.f16062p0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f23 = f22;
                    f24 = f20;
                    f25 = f16;
                    f26 = f17;
                    f27 = f21;
                    list2 = emptyPath;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(a.f16044p0);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl12 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl12, str2, b.f16054p0);
                    Updater.m2081setimpl(composerM2074constructorimpl12, Float.valueOf(f18), c.f16055p0);
                    Updater.m2081setimpl(composerM2074constructorimpl12, Float.valueOf(f16), d.f16056p0);
                    Updater.m2081setimpl(composerM2074constructorimpl12, Float.valueOf(f17), e.f16057p0);
                    Updater.m2081setimpl(composerM2074constructorimpl12, Float.valueOf(f19), f.f16058p0);
                    Updater.m2081setimpl(composerM2074constructorimpl12, Float.valueOf(f20), g.f16059p0);
                    Updater.m2081setimpl(composerM2074constructorimpl12, Float.valueOf(f21), h.f16060p0);
                    Updater.m2081setimpl(composerM2074constructorimpl12, Float.valueOf(f22), i.f16061p0);
                    Updater.m2081setimpl(composerM2074constructorimpl12, emptyPath, j.f16062p0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f23 = f22;
                    f24 = f20;
                    f25 = f16;
                    f26 = f17;
                    f27 = f21;
                    list2 = emptyPath;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
            }
            i12 |= 3072;
            f17 = f11;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(f12)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(f13)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f14)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & 128;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f15)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            i25 = i11 & 256;
            if (i25 != 0) {
                i12 |= 33554432;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i26 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i26 = 268435456;
                    }
                }
                if (i25 != 256) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(a.f16044p0);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl13 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl13, str2, b.f16054p0);
                    Updater.m2081setimpl(composerM2074constructorimpl13, Float.valueOf(f18), c.f16055p0);
                    Updater.m2081setimpl(composerM2074constructorimpl13, Float.valueOf(f16), d.f16056p0);
                    Updater.m2081setimpl(composerM2074constructorimpl13, Float.valueOf(f17), e.f16057p0);
                    Updater.m2081setimpl(composerM2074constructorimpl13, Float.valueOf(f19), f.f16058p0);
                    Updater.m2081setimpl(composerM2074constructorimpl13, Float.valueOf(f20), g.f16059p0);
                    Updater.m2081setimpl(composerM2074constructorimpl13, Float.valueOf(f21), h.f16060p0);
                    Updater.m2081setimpl(composerM2074constructorimpl13, Float.valueOf(f22), i.f16061p0);
                    Updater.m2081setimpl(composerM2074constructorimpl13, emptyPath, j.f16062p0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f23 = f22;
                    f24 = f20;
                    f25 = f16;
                    f26 = f17;
                    f27 = f21;
                    list2 = emptyPath;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(a.f16044p0);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl14 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl14, str2, b.f16054p0);
                    Updater.m2081setimpl(composerM2074constructorimpl14, Float.valueOf(f18), c.f16055p0);
                    Updater.m2081setimpl(composerM2074constructorimpl14, Float.valueOf(f16), d.f16056p0);
                    Updater.m2081setimpl(composerM2074constructorimpl14, Float.valueOf(f17), e.f16057p0);
                    Updater.m2081setimpl(composerM2074constructorimpl14, Float.valueOf(f19), f.f16058p0);
                    Updater.m2081setimpl(composerM2074constructorimpl14, Float.valueOf(f20), g.f16059p0);
                    Updater.m2081setimpl(composerM2074constructorimpl14, Float.valueOf(f21), h.f16060p0);
                    Updater.m2081setimpl(composerM2074constructorimpl14, Float.valueOf(f22), i.f16061p0);
                    Updater.m2081setimpl(composerM2074constructorimpl14, emptyPath, j.f16062p0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f23 = f22;
                    f24 = f20;
                    f25 = f16;
                    f26 = f17;
                    f27 = f21;
                    list2 = emptyPath;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
            }
            i26 = 805306368;
            i12 |= i26;
            if (i25 != 256) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(a.f16044p0);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl15 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl15, str2, b.f16054p0);
                Updater.m2081setimpl(composerM2074constructorimpl15, Float.valueOf(f18), c.f16055p0);
                Updater.m2081setimpl(composerM2074constructorimpl15, Float.valueOf(f16), d.f16056p0);
                Updater.m2081setimpl(composerM2074constructorimpl15, Float.valueOf(f17), e.f16057p0);
                Updater.m2081setimpl(composerM2074constructorimpl15, Float.valueOf(f19), f.f16058p0);
                Updater.m2081setimpl(composerM2074constructorimpl15, Float.valueOf(f20), g.f16059p0);
                Updater.m2081setimpl(composerM2074constructorimpl15, Float.valueOf(f21), h.f16060p0);
                Updater.m2081setimpl(composerM2074constructorimpl15, Float.valueOf(f22), i.f16061p0);
                Updater.m2081setimpl(composerM2074constructorimpl15, emptyPath, j.f16062p0);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f23 = f22;
                f24 = f20;
                f25 = f16;
                f26 = f17;
                f27 = f21;
                list2 = emptyPath;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(a.f16044p0);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl16 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl16, str2, b.f16054p0);
                Updater.m2081setimpl(composerM2074constructorimpl16, Float.valueOf(f18), c.f16055p0);
                Updater.m2081setimpl(composerM2074constructorimpl16, Float.valueOf(f16), d.f16056p0);
                Updater.m2081setimpl(composerM2074constructorimpl16, Float.valueOf(f17), e.f16057p0);
                Updater.m2081setimpl(composerM2074constructorimpl16, Float.valueOf(f19), f.f16058p0);
                Updater.m2081setimpl(composerM2074constructorimpl16, Float.valueOf(f20), g.f16059p0);
                Updater.m2081setimpl(composerM2074constructorimpl16, Float.valueOf(f21), h.f16060p0);
                Updater.m2081setimpl(composerM2074constructorimpl16, Float.valueOf(f22), i.f16061p0);
                Updater.m2081setimpl(composerM2074constructorimpl16, emptyPath, j.f16062p0);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f23 = f22;
                f24 = f20;
                f25 = f16;
                f26 = f17;
                f27 = f21;
                list2 = emptyPath;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                f16 = f10;
                if (composerStartRestartGroup.changed(f16)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    f17 = f11;
                    if (composerStartRestartGroup.changed(f17)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f12)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f13)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f14)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & 128;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f15)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                i25 = i11 & 256;
                if (i25 != 0) {
                    i12 |= 33554432;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                    }
                    if (i25 != 256) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(a.f16044p0);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl17 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl17, str2, b.f16054p0);
                        Updater.m2081setimpl(composerM2074constructorimpl17, Float.valueOf(f18), c.f16055p0);
                        Updater.m2081setimpl(composerM2074constructorimpl17, Float.valueOf(f16), d.f16056p0);
                        Updater.m2081setimpl(composerM2074constructorimpl17, Float.valueOf(f17), e.f16057p0);
                        Updater.m2081setimpl(composerM2074constructorimpl17, Float.valueOf(f19), f.f16058p0);
                        Updater.m2081setimpl(composerM2074constructorimpl17, Float.valueOf(f20), g.f16059p0);
                        Updater.m2081setimpl(composerM2074constructorimpl17, Float.valueOf(f21), h.f16060p0);
                        Updater.m2081setimpl(composerM2074constructorimpl17, Float.valueOf(f22), i.f16061p0);
                        Updater.m2081setimpl(composerM2074constructorimpl17, emptyPath, j.f16062p0);
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f23 = f22;
                        f24 = f20;
                        f25 = f16;
                        f26 = f17;
                        f27 = f21;
                        list2 = emptyPath;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f6;
                            }
                            if (i13 != 0) {
                                f16 = 0.0f;
                            }
                            if (i15 != 0) {
                                f17 = 0.0f;
                            }
                            if (i17 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f12;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i12 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(a.f16044p0);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl18 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl18, str2, b.f16054p0);
                        Updater.m2081setimpl(composerM2074constructorimpl18, Float.valueOf(f18), c.f16055p0);
                        Updater.m2081setimpl(composerM2074constructorimpl18, Float.valueOf(f16), d.f16056p0);
                        Updater.m2081setimpl(composerM2074constructorimpl18, Float.valueOf(f17), e.f16057p0);
                        Updater.m2081setimpl(composerM2074constructorimpl18, Float.valueOf(f19), f.f16058p0);
                        Updater.m2081setimpl(composerM2074constructorimpl18, Float.valueOf(f20), g.f16059p0);
                        Updater.m2081setimpl(composerM2074constructorimpl18, Float.valueOf(f21), h.f16060p0);
                        Updater.m2081setimpl(composerM2074constructorimpl18, Float.valueOf(f22), i.f16061p0);
                        Updater.m2081setimpl(composerM2074constructorimpl18, emptyPath, j.f16062p0);
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f23 = f22;
                        f24 = f20;
                        f25 = f16;
                        f26 = f17;
                        f27 = f21;
                        list2 = emptyPath;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
                }
                i26 = 805306368;
                i12 |= i26;
                if (i25 != 256) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(a.f16044p0);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl19 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl19, str2, b.f16054p0);
                    Updater.m2081setimpl(composerM2074constructorimpl19, Float.valueOf(f18), c.f16055p0);
                    Updater.m2081setimpl(composerM2074constructorimpl19, Float.valueOf(f16), d.f16056p0);
                    Updater.m2081setimpl(composerM2074constructorimpl19, Float.valueOf(f17), e.f16057p0);
                    Updater.m2081setimpl(composerM2074constructorimpl19, Float.valueOf(f19), f.f16058p0);
                    Updater.m2081setimpl(composerM2074constructorimpl19, Float.valueOf(f20), g.f16059p0);
                    Updater.m2081setimpl(composerM2074constructorimpl19, Float.valueOf(f21), h.f16060p0);
                    Updater.m2081setimpl(composerM2074constructorimpl19, Float.valueOf(f22), i.f16061p0);
                    Updater.m2081setimpl(composerM2074constructorimpl19, emptyPath, j.f16062p0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f23 = f22;
                    f24 = f20;
                    f25 = f16;
                    f26 = f17;
                    f27 = f21;
                    list2 = emptyPath;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(a.f16044p0);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl110 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl110, str2, b.f16054p0);
                    Updater.m2081setimpl(composerM2074constructorimpl110, Float.valueOf(f18), c.f16055p0);
                    Updater.m2081setimpl(composerM2074constructorimpl110, Float.valueOf(f16), d.f16056p0);
                    Updater.m2081setimpl(composerM2074constructorimpl110, Float.valueOf(f17), e.f16057p0);
                    Updater.m2081setimpl(composerM2074constructorimpl110, Float.valueOf(f19), f.f16058p0);
                    Updater.m2081setimpl(composerM2074constructorimpl110, Float.valueOf(f20), g.f16059p0);
                    Updater.m2081setimpl(composerM2074constructorimpl110, Float.valueOf(f21), h.f16060p0);
                    Updater.m2081setimpl(composerM2074constructorimpl110, Float.valueOf(f22), i.f16061p0);
                    Updater.m2081setimpl(composerM2074constructorimpl110, emptyPath, j.f16062p0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f23 = f22;
                    f24 = f20;
                    f25 = f16;
                    f26 = f17;
                    f27 = f21;
                    list2 = emptyPath;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
            }
            i12 |= 3072;
            f17 = f11;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(f12)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(f13)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f14)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & 128;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f15)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            i25 = i11 & 256;
            if (i25 != 0) {
                i12 |= 33554432;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i26 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i26 = 268435456;
                    }
                }
                if (i25 != 256) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(a.f16044p0);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl111 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl111, str2, b.f16054p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111, Float.valueOf(f18), c.f16055p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111, Float.valueOf(f16), d.f16056p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111, Float.valueOf(f17), e.f16057p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111, Float.valueOf(f19), f.f16058p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111, Float.valueOf(f20), g.f16059p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111, Float.valueOf(f21), h.f16060p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111, Float.valueOf(f22), i.f16061p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111, emptyPath, j.f16062p0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f23 = f22;
                    f24 = f20;
                    f25 = f16;
                    f26 = f17;
                    f27 = f21;
                    list2 = emptyPath;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(a.f16044p0);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl112 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl112, str2, b.f16054p0);
                    Updater.m2081setimpl(composerM2074constructorimpl112, Float.valueOf(f18), c.f16055p0);
                    Updater.m2081setimpl(composerM2074constructorimpl112, Float.valueOf(f16), d.f16056p0);
                    Updater.m2081setimpl(composerM2074constructorimpl112, Float.valueOf(f17), e.f16057p0);
                    Updater.m2081setimpl(composerM2074constructorimpl112, Float.valueOf(f19), f.f16058p0);
                    Updater.m2081setimpl(composerM2074constructorimpl112, Float.valueOf(f20), g.f16059p0);
                    Updater.m2081setimpl(composerM2074constructorimpl112, Float.valueOf(f21), h.f16060p0);
                    Updater.m2081setimpl(composerM2074constructorimpl112, Float.valueOf(f22), i.f16061p0);
                    Updater.m2081setimpl(composerM2074constructorimpl112, emptyPath, j.f16062p0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f23 = f22;
                    f24 = f20;
                    f25 = f16;
                    f26 = f17;
                    f27 = f21;
                    list2 = emptyPath;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
            }
            i26 = 805306368;
            i12 |= i26;
            if (i25 != 256) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(a.f16044p0);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl113 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl113, str2, b.f16054p0);
                Updater.m2081setimpl(composerM2074constructorimpl113, Float.valueOf(f18), c.f16055p0);
                Updater.m2081setimpl(composerM2074constructorimpl113, Float.valueOf(f16), d.f16056p0);
                Updater.m2081setimpl(composerM2074constructorimpl113, Float.valueOf(f17), e.f16057p0);
                Updater.m2081setimpl(composerM2074constructorimpl113, Float.valueOf(f19), f.f16058p0);
                Updater.m2081setimpl(composerM2074constructorimpl113, Float.valueOf(f20), g.f16059p0);
                Updater.m2081setimpl(composerM2074constructorimpl113, Float.valueOf(f21), h.f16060p0);
                Updater.m2081setimpl(composerM2074constructorimpl113, Float.valueOf(f22), i.f16061p0);
                Updater.m2081setimpl(composerM2074constructorimpl113, emptyPath, j.f16062p0);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f23 = f22;
                f24 = f20;
                f25 = f16;
                f26 = f17;
                f27 = f21;
                list2 = emptyPath;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(a.f16044p0);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl114 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl114, str2, b.f16054p0);
                Updater.m2081setimpl(composerM2074constructorimpl114, Float.valueOf(f18), c.f16055p0);
                Updater.m2081setimpl(composerM2074constructorimpl114, Float.valueOf(f16), d.f16056p0);
                Updater.m2081setimpl(composerM2074constructorimpl114, Float.valueOf(f17), e.f16057p0);
                Updater.m2081setimpl(composerM2074constructorimpl114, Float.valueOf(f19), f.f16058p0);
                Updater.m2081setimpl(composerM2074constructorimpl114, Float.valueOf(f20), g.f16059p0);
                Updater.m2081setimpl(composerM2074constructorimpl114, Float.valueOf(f21), h.f16060p0);
                Updater.m2081setimpl(composerM2074constructorimpl114, Float.valueOf(f22), i.f16061p0);
                Updater.m2081setimpl(composerM2074constructorimpl114, emptyPath, j.f16062p0);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f23 = f22;
                f24 = f20;
                f25 = f16;
                f26 = f17;
                f27 = f21;
                list2 = emptyPath;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        f16 = f10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                f17 = f11;
                if (composerStartRestartGroup.changed(f17)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(f12)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(f13)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f14)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & 128;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f15)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            i25 = i11 & 256;
            if (i25 != 0) {
                i12 |= 33554432;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i26 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i26 = 268435456;
                    }
                }
                if (i25 != 256) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(a.f16044p0);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl115 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl115, str2, b.f16054p0);
                    Updater.m2081setimpl(composerM2074constructorimpl115, Float.valueOf(f18), c.f16055p0);
                    Updater.m2081setimpl(composerM2074constructorimpl115, Float.valueOf(f16), d.f16056p0);
                    Updater.m2081setimpl(composerM2074constructorimpl115, Float.valueOf(f17), e.f16057p0);
                    Updater.m2081setimpl(composerM2074constructorimpl115, Float.valueOf(f19), f.f16058p0);
                    Updater.m2081setimpl(composerM2074constructorimpl115, Float.valueOf(f20), g.f16059p0);
                    Updater.m2081setimpl(composerM2074constructorimpl115, Float.valueOf(f21), h.f16060p0);
                    Updater.m2081setimpl(composerM2074constructorimpl115, Float.valueOf(f22), i.f16061p0);
                    Updater.m2081setimpl(composerM2074constructorimpl115, emptyPath, j.f16062p0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f23 = f22;
                    f24 = f20;
                    f25 = f16;
                    f26 = f17;
                    f27 = f21;
                    list2 = emptyPath;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f6;
                        }
                        if (i13 != 0) {
                            f16 = 0.0f;
                        }
                        if (i15 != 0) {
                            f17 = 0.0f;
                        }
                        if (i17 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f12;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i12 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(a.f16044p0);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl116 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl116, str2, b.f16054p0);
                    Updater.m2081setimpl(composerM2074constructorimpl116, Float.valueOf(f18), c.f16055p0);
                    Updater.m2081setimpl(composerM2074constructorimpl116, Float.valueOf(f16), d.f16056p0);
                    Updater.m2081setimpl(composerM2074constructorimpl116, Float.valueOf(f17), e.f16057p0);
                    Updater.m2081setimpl(composerM2074constructorimpl116, Float.valueOf(f19), f.f16058p0);
                    Updater.m2081setimpl(composerM2074constructorimpl116, Float.valueOf(f20), g.f16059p0);
                    Updater.m2081setimpl(composerM2074constructorimpl116, Float.valueOf(f21), h.f16060p0);
                    Updater.m2081setimpl(composerM2074constructorimpl116, Float.valueOf(f22), i.f16061p0);
                    Updater.m2081setimpl(composerM2074constructorimpl116, emptyPath, j.f16062p0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f23 = f22;
                    f24 = f20;
                    f25 = f16;
                    f26 = f17;
                    f27 = f21;
                    list2 = emptyPath;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
            }
            i26 = 805306368;
            i12 |= i26;
            if (i25 != 256) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(a.f16044p0);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl117 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl117, str2, b.f16054p0);
                Updater.m2081setimpl(composerM2074constructorimpl117, Float.valueOf(f18), c.f16055p0);
                Updater.m2081setimpl(composerM2074constructorimpl117, Float.valueOf(f16), d.f16056p0);
                Updater.m2081setimpl(composerM2074constructorimpl117, Float.valueOf(f17), e.f16057p0);
                Updater.m2081setimpl(composerM2074constructorimpl117, Float.valueOf(f19), f.f16058p0);
                Updater.m2081setimpl(composerM2074constructorimpl117, Float.valueOf(f20), g.f16059p0);
                Updater.m2081setimpl(composerM2074constructorimpl117, Float.valueOf(f21), h.f16060p0);
                Updater.m2081setimpl(composerM2074constructorimpl117, Float.valueOf(f22), i.f16061p0);
                Updater.m2081setimpl(composerM2074constructorimpl117, emptyPath, j.f16062p0);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f23 = f22;
                f24 = f20;
                f25 = f16;
                f26 = f17;
                f27 = f21;
                list2 = emptyPath;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(a.f16044p0);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl118 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl118, str2, b.f16054p0);
                Updater.m2081setimpl(composerM2074constructorimpl118, Float.valueOf(f18), c.f16055p0);
                Updater.m2081setimpl(composerM2074constructorimpl118, Float.valueOf(f16), d.f16056p0);
                Updater.m2081setimpl(composerM2074constructorimpl118, Float.valueOf(f17), e.f16057p0);
                Updater.m2081setimpl(composerM2074constructorimpl118, Float.valueOf(f19), f.f16058p0);
                Updater.m2081setimpl(composerM2074constructorimpl118, Float.valueOf(f20), g.f16059p0);
                Updater.m2081setimpl(composerM2074constructorimpl118, Float.valueOf(f21), h.f16060p0);
                Updater.m2081setimpl(composerM2074constructorimpl118, Float.valueOf(f22), i.f16061p0);
                Updater.m2081setimpl(composerM2074constructorimpl118, emptyPath, j.f16062p0);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f23 = f22;
                f24 = f20;
                f25 = f16;
                f26 = f17;
                f27 = f21;
                list2 = emptyPath;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
        }
        i12 |= 3072;
        f17 = f11;
        i17 = i11 & 16;
        if (i17 != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (composerStartRestartGroup.changed(f12)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i12 |= i18;
        }
        i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i10 & 458752) == 0) {
            if (composerStartRestartGroup.changed(f13)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i12 |= i20;
        }
        i21 = i11 & 64;
        if (i21 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(f14)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        }
        i23 = i11 & 128;
        if (i23 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(f15)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i12 |= i24;
        }
        i25 = i11 & 256;
        if (i25 != 0) {
            i12 |= 33554432;
        }
        if ((i11 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i26 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i26 = 268435456;
                }
            }
            if (i25 != 256) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(a.f16044p0);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl119 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl119, str2, b.f16054p0);
                Updater.m2081setimpl(composerM2074constructorimpl119, Float.valueOf(f18), c.f16055p0);
                Updater.m2081setimpl(composerM2074constructorimpl119, Float.valueOf(f16), d.f16056p0);
                Updater.m2081setimpl(composerM2074constructorimpl119, Float.valueOf(f17), e.f16057p0);
                Updater.m2081setimpl(composerM2074constructorimpl119, Float.valueOf(f19), f.f16058p0);
                Updater.m2081setimpl(composerM2074constructorimpl119, Float.valueOf(f20), g.f16059p0);
                Updater.m2081setimpl(composerM2074constructorimpl119, Float.valueOf(f21), h.f16060p0);
                Updater.m2081setimpl(composerM2074constructorimpl119, Float.valueOf(f22), i.f16061p0);
                Updater.m2081setimpl(composerM2074constructorimpl119, emptyPath, j.f16062p0);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f23 = f22;
                f24 = f20;
                f25 = f16;
                f26 = f17;
                f27 = f21;
                list2 = emptyPath;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f6;
                    }
                    if (i13 != 0) {
                        f16 = 0.0f;
                    }
                    if (i15 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f12;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i12 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(a.f16044p0);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl1110 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl1110, str2, b.f16054p0);
                Updater.m2081setimpl(composerM2074constructorimpl1110, Float.valueOf(f18), c.f16055p0);
                Updater.m2081setimpl(composerM2074constructorimpl1110, Float.valueOf(f16), d.f16056p0);
                Updater.m2081setimpl(composerM2074constructorimpl1110, Float.valueOf(f17), e.f16057p0);
                Updater.m2081setimpl(composerM2074constructorimpl1110, Float.valueOf(f19), f.f16058p0);
                Updater.m2081setimpl(composerM2074constructorimpl1110, Float.valueOf(f20), g.f16059p0);
                Updater.m2081setimpl(composerM2074constructorimpl1110, Float.valueOf(f21), h.f16060p0);
                Updater.m2081setimpl(composerM2074constructorimpl1110, Float.valueOf(f22), i.f16061p0);
                Updater.m2081setimpl(composerM2074constructorimpl1110, emptyPath, j.f16062p0);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f23 = f22;
                f24 = f20;
                f25 = f16;
                f26 = f17;
                f27 = f21;
                list2 = emptyPath;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
        }
        i26 = 805306368;
        i12 |= i26;
        if (i25 != 256) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i27 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i28 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f6;
                }
                if (i13 != 0) {
                    f16 = 0.0f;
                }
                if (i15 != 0) {
                    f17 = 0.0f;
                }
                if (i17 != 0) {
                    f19 = 1.0f;
                } else {
                    f19 = f12;
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                    f21 = 0.0f;
                } else {
                    f21 = f14;
                }
                if (i23 == 0) {
                }
                if (i25 != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i12 &= -234881025;
                } else {
                    emptyPath = list;
                }
            } else {
                if (i27 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i28 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f6;
                }
                if (i13 != 0) {
                    f16 = 0.0f;
                }
                if (i15 != 0) {
                    f17 = 0.0f;
                }
                if (i17 != 0) {
                    f19 = 1.0f;
                } else {
                    f19 = f12;
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                    f21 = 0.0f;
                } else {
                    f21 = f14;
                }
                if (i23 == 0) {
                }
                if (i25 != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i12 &= -234881025;
                } else {
                    emptyPath = list;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
            }
            composerStartRestartGroup.startReplaceableGroup(-548224868);
            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(a.f16044p0);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl1111 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl1111, str2, b.f16054p0);
            Updater.m2081setimpl(composerM2074constructorimpl1111, Float.valueOf(f18), c.f16055p0);
            Updater.m2081setimpl(composerM2074constructorimpl1111, Float.valueOf(f16), d.f16056p0);
            Updater.m2081setimpl(composerM2074constructorimpl1111, Float.valueOf(f17), e.f16057p0);
            Updater.m2081setimpl(composerM2074constructorimpl1111, Float.valueOf(f19), f.f16058p0);
            Updater.m2081setimpl(composerM2074constructorimpl1111, Float.valueOf(f20), g.f16059p0);
            Updater.m2081setimpl(composerM2074constructorimpl1111, Float.valueOf(f21), h.f16060p0);
            Updater.m2081setimpl(composerM2074constructorimpl1111, Float.valueOf(f22), i.f16061p0);
            Updater.m2081setimpl(composerM2074constructorimpl1111, emptyPath, j.f16062p0);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f23 = f22;
            f24 = f20;
            f25 = f16;
            f26 = f17;
            f27 = f21;
            list2 = emptyPath;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i27 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i28 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f6;
                }
                if (i13 != 0) {
                    f16 = 0.0f;
                }
                if (i15 != 0) {
                    f17 = 0.0f;
                }
                if (i17 != 0) {
                    f19 = 1.0f;
                } else {
                    f19 = f12;
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                    f21 = 0.0f;
                } else {
                    f21 = f14;
                }
                if (i23 == 0) {
                }
                if (i25 != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i12 &= -234881025;
                } else {
                    emptyPath = list;
                }
            } else {
                if (i27 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i28 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f6;
                }
                if (i13 != 0) {
                    f16 = 0.0f;
                }
                if (i15 != 0) {
                    f17 = 0.0f;
                }
                if (i17 != 0) {
                    f19 = 1.0f;
                } else {
                    f19 = f12;
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                    f21 = 0.0f;
                } else {
                    f21 = f14;
                }
                if (i23 == 0) {
                }
                if (i25 != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i12 &= -234881025;
                } else {
                    emptyPath = list;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
            }
            composerStartRestartGroup.startReplaceableGroup(-548224868);
            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(a.f16044p0);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl1112 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl1112, str2, b.f16054p0);
            Updater.m2081setimpl(composerM2074constructorimpl1112, Float.valueOf(f18), c.f16055p0);
            Updater.m2081setimpl(composerM2074constructorimpl1112, Float.valueOf(f16), d.f16056p0);
            Updater.m2081setimpl(composerM2074constructorimpl1112, Float.valueOf(f17), e.f16057p0);
            Updater.m2081setimpl(composerM2074constructorimpl1112, Float.valueOf(f19), f.f16058p0);
            Updater.m2081setimpl(composerM2074constructorimpl1112, Float.valueOf(f20), g.f16059p0);
            Updater.m2081setimpl(composerM2074constructorimpl1112, Float.valueOf(f21), h.f16060p0);
            Updater.m2081setimpl(composerM2074constructorimpl1112, Float.valueOf(f22), i.f16061p0);
            Updater.m2081setimpl(composerM2074constructorimpl1112, emptyPath, j.f16062p0);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 27) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f23 = f22;
            f24 = f20;
            f25 = f16;
            f26 = f17;
            f27 = f21;
            list2 = emptyPath;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new k(str2, f18, f25, f26, f19, f24, f27, f23, list2, content, i10, i11));
    }

    @VectorComposable
    @Composable
    /* JADX INFO: renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m3023Path9cdaXJ4(@NotNull List<? extends PathNode> pathData, int i10, @Nullable String str, @Nullable Brush brush, float f6, @Nullable Brush brush2, float f10, float f11, int i11, int i12, float f12, float f13, float f14, float f15, @Nullable Composer composer, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1478270750);
        int defaultFillType = (i15 & 2) != 0 ? VectorKt.getDefaultFillType() : i10;
        String str2 = (i15 & 4) != 0 ? "" : str;
        Brush brush3 = (i15 & 8) != 0 ? null : brush;
        float f16 = (i15 & 16) != 0 ? 1.0f : f6;
        Brush brush4 = (i15 & 32) == 0 ? brush2 : null;
        float f17 = (i15 & 64) != 0 ? 1.0f : f10;
        float f18 = (i15 & 128) != 0 ? 0.0f : f11;
        int defaultStrokeLineCap = (i15 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i11;
        int defaultStrokeLineJoin = (i15 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i12;
        float f19 = (i15 & 1024) != 0 ? 4.0f : f12;
        float f20 = (i15 & 2048) != 0 ? 0.0f : f13;
        float f21 = (i15 & 4096) != 0 ? 1.0f : f14;
        float f22 = (i15 & 8192) != 0 ? 0.0f : f15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1478270750, i13, i14, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:99)");
        }
        composerStartRestartGroup.startReplaceableGroup(1886828752);
        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startNode();
        if (composerStartRestartGroup.getInserting()) {
            final l lVar = l.f16072p0;
            composerStartRestartGroup.createNode(new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path-9cdaXJ4$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.graphics.vector.PathComponent, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final PathComponent invoke() {
                    return lVar.invoke();
                }
            });
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
        Updater.m2081setimpl(composerM2074constructorimpl, str2, r.f16078p0);
        Updater.m2081setimpl(composerM2074constructorimpl, pathData, s.f16079p0);
        Updater.m2081setimpl(composerM2074constructorimpl, PathFillType.m2741boximpl(defaultFillType), t.f16080p0);
        Updater.m2081setimpl(composerM2074constructorimpl, brush3, u.f16081p0);
        Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f16), v.f16082p0);
        Updater.m2081setimpl(composerM2074constructorimpl, brush4, w.f16083p0);
        Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f17), x.f16084p0);
        Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f18), y.f16085p0);
        Updater.m2081setimpl(composerM2074constructorimpl, StrokeJoin.m2811boximpl(defaultStrokeLineJoin), z.f16086p0);
        Updater.m2081setimpl(composerM2074constructorimpl, StrokeCap.m2801boximpl(defaultStrokeLineCap), m.f16073p0);
        Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f19), n.f16074p0);
        Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f20), o.f16075p0);
        Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f21), p.f16076p0);
        Updater.m2081setimpl(composerM2074constructorimpl, Float.valueOf(f22), q.f16077p0);
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a0(pathData, defaultFillType, str2, brush3, f16, brush4, f17, f18, defaultStrokeLineCap, defaultStrokeLineJoin, f19, f20, f21, f22, i13, i14, i15));
    }
}
