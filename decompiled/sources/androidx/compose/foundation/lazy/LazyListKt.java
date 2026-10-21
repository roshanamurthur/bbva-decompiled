package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y.g;

/* JADX INFO: compiled from: LazyList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009a\u0001\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "", "beyondBoundsItemCount", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "LazyList", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,339:1\n76#2:340\n83#3,3:341\n1097#4,6:344\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n122#1:340\n174#1:341,3\n174#1:344,6\n*E\n"})
public final class LazyListKt {

    /* JADX INFO: compiled from: LazyList.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Alignment.Vertical E0;
        public final /* synthetic */ Arrangement.Horizontal F0;
        public final /* synthetic */ Function1<LazyListScope, Unit> G0;
        public final /* synthetic */ int H0;
        public final /* synthetic */ int I0;
        public final /* synthetic */ int J0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4586p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f4587q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f4588r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f4589s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f4590t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f4591u0;
        public final /* synthetic */ boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f4592w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Horizontal f4593x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Vertical f4594y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z10, boolean z11, FlingBehavior flingBehavior, boolean z12, int i10, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, Function1<? super LazyListScope, Unit> function1, int i11, int i12, int i13) {
            super(2);
            this.f4586p0 = modifier;
            this.f4587q0 = lazyListState;
            this.f4588r0 = paddingValues;
            this.f4589s0 = z10;
            this.f4590t0 = z11;
            this.f4591u0 = flingBehavior;
            this.v0 = z12;
            this.f4592w0 = i10;
            this.f4593x0 = horizontal;
            this.f4594y0 = vertical;
            this.E0 = vertical2;
            this.F0 = horizontal2;
            this.G0 = function1;
            this.H0 = i11;
            this.I0 = i12;
            this.J0 = i13;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyListKt.LazyList(this.f4586p0, this.f4587q0, this.f4588r0, this.f4589s0, this.f4590t0, this.f4591u0, this.v0, this.f4592w0, this.f4593x0, this.f4594y0, this.E0, this.F0, this.G0, composer, RecomposeScopeImplKt.updateChangedFlags(this.H0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.I0), this.J0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyList.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<LazyListItemProvider> f4595p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f4596q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f4597r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function0<? extends LazyListItemProvider> function0, LazyListState lazyListState, int i10) {
            super(2);
            this.f4595p0 = function0;
            this.f4596q0 = lazyListState;
            this.f4597r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f4597r0 | 1);
            LazyListKt.a(this.f4595p0, this.f4596q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0146  */
    /* JADX WARN: Code duplicated, block: B:102:0x0149  */
    /* JADX WARN: Code duplicated, block: B:106:0x0151  */
    /* JADX WARN: Code duplicated, block: B:107:0x0156  */
    /* JADX WARN: Code duplicated, block: B:109:0x015c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0162  */
    /* JADX WARN: Code duplicated, block: B:112:0x0165  */
    /* JADX WARN: Code duplicated, block: B:114:0x016a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0170  */
    /* JADX WARN: Code duplicated, block: B:119:0x0175  */
    /* JADX WARN: Code duplicated, block: B:121:0x017b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0181  */
    /* JADX WARN: Code duplicated, block: B:127:0x018a  */
    /* JADX WARN: Code duplicated, block: B:128:0x018d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0191  */
    /* JADX WARN: Code duplicated, block: B:132:0x0197  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:154:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:160:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:163:0x0238  */
    /* JADX WARN: Code duplicated, block: B:166:0x0270 A[LOOP:0: B:165:0x026e->B:166:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x0283  */
    /* JADX WARN: Code duplicated, block: B:173:0x0298  */
    /* JADX WARN: Code duplicated, block: B:176:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:179:0x02df  */
    /* JADX WARN: Code duplicated, block: B:181:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:184:0x0362  */
    /* JADX WARN: Code duplicated, block: B:189:0x0374  */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00de  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    /* JADX WARN: Code duplicated, block: B:81:0x0106  */
    /* JADX WARN: Code duplicated, block: B:82:0x0109  */
    /* JADX WARN: Code duplicated, block: B:86:0x0111  */
    /* JADX WARN: Code duplicated, block: B:87:0x0118  */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:91:0x0126  */
    /* JADX WARN: Code duplicated, block: B:92:0x0129  */
    /* JADX WARN: Code duplicated, block: B:96:0x0131  */
    /* JADX WARN: Code duplicated, block: B:97:0x0138  */
    /* JADX WARN: Code duplicated, block: B:99:0x0140  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LazyList(@NotNull Modifier modifier, @NotNull LazyListState state, @NotNull PaddingValues contentPadding, boolean z10, boolean z11, @NotNull FlingBehavior flingBehavior, boolean z12, int i10, @Nullable Alignment.Horizontal horizontal, @Nullable Arrangement.Vertical vertical, @Nullable Alignment.Vertical vertical2, @Nullable Arrangement.Horizontal horizontal2, @NotNull Function1<? super LazyListScope, Unit> content, @Nullable Composer composer, int i11, int i12, int i13) {
        int i14;
        int i15;
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
        int i27;
        int i28;
        Alignment.Horizontal horizontal3;
        Arrangement.Vertical vertical3;
        Alignment.Vertical vertical4;
        Arrangement.Horizontal horizontal4;
        Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda;
        int i29;
        int i30;
        Object[] objArr;
        int i31;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        Orientation orientation;
        Composer composer3;
        int i32;
        Alignment.Horizontal horizontal5;
        Arrangement.Vertical vertical5;
        Alignment.Vertical vertical6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(620764179);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 112) == 0) {
            i14 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i11 & 896) == 0) {
            i14 |= composerStartRestartGroup.changed(contentPadding) ? 256 : 128;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i14 |= composerStartRestartGroup.changed(z10) ? 2048 : 1024;
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((i11 & 57344) == 0) {
            i14 |= composerStartRestartGroup.changed(z11) ? 16384 : 8192;
        }
        if ((i13 & 32) == 0) {
            if ((i11 & 458752) == 0) {
                i15 = composerStartRestartGroup.changed(flingBehavior) ? 131072 : 65536;
            }
            if ((i13 & 64) != 0) {
                if ((3670016 & i11) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 128;
                if (i17 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 256;
                if (i19 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 512;
                if (i21 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(vertical)) {
                        i22 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i22 = 268435456;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 1024;
                if (i23 != 0) {
                    i24 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i12 | i25;
                } else {
                    i24 = i12;
                }
                i26 = i13 & 2048;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i12 & 112) == 0) {
                    i24 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
                }
                i27 = i24;
                if ((i13 & 4096) != 0) {
                    i27 |= BluetoothState.REQUEST_CONNECT_DEVICE;
                } else if ((i12 & 896) == 0) {
                    i27 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
                }
                if ((1533916891 & i14) != 306783378 && (i27 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    i32 = i10;
                    horizontal5 = horizontal;
                    vertical5 = vertical;
                    vertical6 = vertical2;
                    horizontal4 = horizontal2;
                    composer3 = composerStartRestartGroup;
                } else {
                    if (i17 != 0) {
                        i28 = 0;
                    } else {
                        i28 = i10;
                    }
                    if (i19 != 0) {
                        horizontal3 = null;
                    } else {
                        horizontal3 = horizontal;
                    }
                    if (i21 != 0) {
                        vertical3 = null;
                    } else {
                        vertical3 = vertical;
                    }
                    if (i23 != 0) {
                        vertical4 = null;
                    } else {
                        vertical4 = vertical2;
                    }
                    if (i26 != 0) {
                        horizontal4 = null;
                    } else {
                        horizontal4 = horizontal2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(620764179, i14, i27, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                    }
                    int i33 = (i14 >> 3) & 14;
                    function0RememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i27 >> 3) & 112) | i33);
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState = LazyListSemanticsKt.rememberLazyListSemanticState(state, z11, composerStartRestartGroup, i33 | ((i14 >> 9) & 112));
                    int i34 = i14 & 112;
                    int i35 = i14 & 7168;
                    int i36 = i14 >> 6;
                    int i37 = i27 << 21;
                    i29 = (i14 & 896) | i34 | i35 | (i14 & 57344) | (i36 & 458752) | (i36 & 3670016) | (29360128 & i37) | (i37 & 234881024) | (1879048192 & i14);
                    composerStartRestartGroup.startReplaceableGroup(183156450);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(183156450, i29, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
                    }
                    objArr = new Object[]{state, contentPadding, Boolean.valueOf(z10), Boolean.valueOf(z11), horizontal3, vertical4, horizontal4, vertical3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i31 = 0;
                    zChanged = false;
                    for (i30 = 8; i31 < i30; i30 = 8) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i31]);
                        i31++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        composer2 = composerStartRestartGroup;
                        g gVar = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                        composer2.updateRememberedValue(gVar);
                        objRememberedValue = gVar;
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function2 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    a(function0RememberLazyListItemProviderLambda, state, composer2, i34);
                    ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(composer2, 6);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation2 = orientation;
                    Composer composer4 = composer2;
                    composer3 = composer4;
                    LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticStateRememberLazyListSemanticState, orientation2, z12, z10, composer4, (i36 & 57344) | ((i14 << 6) & 458752)), orientation2), state, i28, z10, orientation2, composer4, i34 | ((i14 >> 15) & 896) | i35), overscrollEffect), state, orientation2, overscrollEffect, z12, scrollableDefaults.reverseDirection((LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation2, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function2, composer3, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i32 = i28;
                    horizontal5 = horizontal3;
                    vertical5 = vertical3;
                    vertical6 = vertical4;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier, state, contentPadding, z10, z11, flingBehavior, z12, i32, horizontal5, vertical5, vertical6, horizontal4, content, i11, i12, i13));
            }
            i14 |= 1572864;
            i17 = i13 & 128;
            if (i17 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(i10)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i14 |= i18;
            }
            i19 = i13 & 256;
            if (i19 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i14 |= i20;
            }
            i21 = i13 & 512;
            if (i21 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(vertical)) {
                    i22 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i22 = 268435456;
                }
                i14 |= i22;
            }
            i23 = i13 & 1024;
            if (i23 != 0) {
                i24 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i12 | i25;
            } else {
                i24 = i12;
            }
            i26 = i13 & 2048;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i12 & 112) == 0) {
                i24 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
            }
            i27 = i24;
            if ((i13 & 4096) != 0) {
                i27 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            } else if ((i12 & 896) == 0) {
                i27 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
            }
            if ((1533916891 & i14) != 306783378) {
                if (i17 != 0) {
                    i28 = 0;
                } else {
                    i28 = i10;
                }
                if (i19 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i21 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i23 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i26 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i14, i27, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                }
                int i38 = (i14 >> 3) & 14;
                function0RememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i27 >> 3) & 112) | i38);
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState2 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z11, composerStartRestartGroup, i38 | ((i14 >> 9) & 112));
                int i39 = i14 & 112;
                int i310 = i14 & 7168;
                int i311 = i14 >> 6;
                int i312 = i27 << 21;
                i29 = (i14 & 896) | i39 | i310 | (i14 & 57344) | (i311 & 458752) | (i311 & 3670016) | (29360128 & i312) | (i312 & 234881024) | (1879048192 & i14);
                composerStartRestartGroup.startReplaceableGroup(183156450);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(183156450, i29, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
                }
                objArr = new Object[]{state, contentPadding, Boolean.valueOf(z10), Boolean.valueOf(z11), horizontal3, vertical4, horizontal4, vertical3};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i31 = 0;
                zChanged = false;
                while (i31 < i30) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i31]);
                    i31++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    g gVar2 = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                    composer2.updateRememberedValue(gVar2);
                    objRememberedValue = gVar2;
                } else {
                    composer2 = composerStartRestartGroup;
                    g gVar3 = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                    composer2.updateRememberedValue(gVar3);
                    objRememberedValue = gVar3;
                }
                composer2.endReplaceableGroup();
                Function2 function3 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                a(function0RememberLazyListItemProviderLambda, state, composer2, i39);
                ScrollableDefaults scrollableDefaults2 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect2 = scrollableDefaults2.overscrollEffect(composer2, 6);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation3 = orientation;
                Composer composer5 = composer2;
                composer3 = composer5;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticStateRememberLazyListSemanticState2, orientation3, z12, z10, composer5, (i311 & 57344) | ((i14 << 6) & 458752)), orientation3), state, i28, z10, orientation3, composer5, i39 | ((i14 >> 15) & 896) | i310), overscrollEffect2), state, orientation3, overscrollEffect2, z12, scrollableDefaults2.reverseDirection((LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation3, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function3, composer3, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i32 = i28;
                horizontal5 = horizontal3;
                vertical5 = vertical3;
                vertical6 = vertical4;
            } else {
                if (i17 != 0) {
                    i28 = 0;
                } else {
                    i28 = i10;
                }
                if (i19 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i21 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i23 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i26 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i14, i27, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                }
                int i313 = (i14 >> 3) & 14;
                function0RememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i27 >> 3) & 112) | i313);
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState3 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z11, composerStartRestartGroup, i313 | ((i14 >> 9) & 112));
                int i314 = i14 & 112;
                int i315 = i14 & 7168;
                int i316 = i14 >> 6;
                int i317 = i27 << 21;
                i29 = (i14 & 896) | i314 | i315 | (i14 & 57344) | (i316 & 458752) | (i316 & 3670016) | (29360128 & i317) | (i317 & 234881024) | (1879048192 & i14);
                composerStartRestartGroup.startReplaceableGroup(183156450);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(183156450, i29, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
                }
                objArr = new Object[]{state, contentPadding, Boolean.valueOf(z10), Boolean.valueOf(z11), horizontal3, vertical4, horizontal4, vertical3};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i31 = 0;
                zChanged = false;
                while (i31 < i30) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i31]);
                    i31++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    g gVar4 = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                    composer2.updateRememberedValue(gVar4);
                    objRememberedValue = gVar4;
                } else {
                    composer2 = composerStartRestartGroup;
                    g gVar5 = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                    composer2.updateRememberedValue(gVar5);
                    objRememberedValue = gVar5;
                }
                composer2.endReplaceableGroup();
                Function2 function4 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                a(function0RememberLazyListItemProviderLambda, state, composer2, i314);
                ScrollableDefaults scrollableDefaults3 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect3 = scrollableDefaults3.overscrollEffect(composer2, 6);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation4 = orientation;
                Composer composer6 = composer2;
                composer3 = composer6;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticStateRememberLazyListSemanticState3, orientation4, z12, z10, composer6, (i316 & 57344) | ((i14 << 6) & 458752)), orientation4), state, i28, z10, orientation4, composer6, i314 | ((i14 >> 15) & 896) | i315), overscrollEffect3), state, orientation4, overscrollEffect3, z12, scrollableDefaults3.reverseDirection((LayoutDirection) composer6.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation4, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function4, composer3, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i32 = i28;
                horizontal5 = horizontal3;
                vertical5 = vertical3;
                vertical6 = vertical4;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier, state, contentPadding, z10, z11, flingBehavior, z12, i32, horizontal5, vertical5, vertical6, horizontal4, content, i11, i12, i13));
        }
        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i14 |= i15;
        if ((i13 & 64) != 0) {
            if ((3670016 & i11) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i14 |= i16;
            }
            i17 = i13 & 128;
            if (i17 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(i10)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i14 |= i18;
            }
            i19 = i13 & 256;
            if (i19 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i14 |= i20;
            }
            i21 = i13 & 512;
            if (i21 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(vertical)) {
                    i22 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i22 = 268435456;
                }
                i14 |= i22;
            }
            i23 = i13 & 1024;
            if (i23 != 0) {
                i24 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i12 | i25;
            } else {
                i24 = i12;
            }
            i26 = i13 & 2048;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i12 & 112) == 0) {
                i24 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
            }
            i27 = i24;
            if ((i13 & 4096) != 0) {
                i27 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            } else if ((i12 & 896) == 0) {
                i27 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
            }
            if ((1533916891 & i14) != 306783378) {
                if (i17 != 0) {
                    i28 = 0;
                } else {
                    i28 = i10;
                }
                if (i19 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i21 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i23 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i26 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i14, i27, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                }
                int i318 = (i14 >> 3) & 14;
                function0RememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i27 >> 3) & 112) | i318);
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState4 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z11, composerStartRestartGroup, i318 | ((i14 >> 9) & 112));
                int i319 = i14 & 112;
                int i3110 = i14 & 7168;
                int i3111 = i14 >> 6;
                int i3112 = i27 << 21;
                i29 = (i14 & 896) | i319 | i3110 | (i14 & 57344) | (i3111 & 458752) | (i3111 & 3670016) | (29360128 & i3112) | (i3112 & 234881024) | (1879048192 & i14);
                composerStartRestartGroup.startReplaceableGroup(183156450);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(183156450, i29, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
                }
                objArr = new Object[]{state, contentPadding, Boolean.valueOf(z10), Boolean.valueOf(z11), horizontal3, vertical4, horizontal4, vertical3};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i31 = 0;
                zChanged = false;
                while (i31 < i30) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i31]);
                    i31++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    g gVar6 = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                    composer2.updateRememberedValue(gVar6);
                    objRememberedValue = gVar6;
                } else {
                    composer2 = composerStartRestartGroup;
                    g gVar7 = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                    composer2.updateRememberedValue(gVar7);
                    objRememberedValue = gVar7;
                }
                composer2.endReplaceableGroup();
                Function2 function5 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                a(function0RememberLazyListItemProviderLambda, state, composer2, i319);
                ScrollableDefaults scrollableDefaults4 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect4 = scrollableDefaults4.overscrollEffect(composer2, 6);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation5 = orientation;
                Composer composer7 = composer2;
                composer3 = composer7;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticStateRememberLazyListSemanticState4, orientation5, z12, z10, composer7, (i3111 & 57344) | ((i14 << 6) & 458752)), orientation5), state, i28, z10, orientation5, composer7, i319 | ((i14 >> 15) & 896) | i3110), overscrollEffect4), state, orientation5, overscrollEffect4, z12, scrollableDefaults4.reverseDirection((LayoutDirection) composer7.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation5, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function5, composer3, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i32 = i28;
                horizontal5 = horizontal3;
                vertical5 = vertical3;
                vertical6 = vertical4;
            } else {
                if (i17 != 0) {
                    i28 = 0;
                } else {
                    i28 = i10;
                }
                if (i19 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i21 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i23 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i26 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i14, i27, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                }
                int i3113 = (i14 >> 3) & 14;
                function0RememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i27 >> 3) & 112) | i3113);
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState5 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z11, composerStartRestartGroup, i3113 | ((i14 >> 9) & 112));
                int i3114 = i14 & 112;
                int i3115 = i14 & 7168;
                int i3116 = i14 >> 6;
                int i3117 = i27 << 21;
                i29 = (i14 & 896) | i3114 | i3115 | (i14 & 57344) | (i3116 & 458752) | (i3116 & 3670016) | (29360128 & i3117) | (i3117 & 234881024) | (1879048192 & i14);
                composerStartRestartGroup.startReplaceableGroup(183156450);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(183156450, i29, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
                }
                objArr = new Object[]{state, contentPadding, Boolean.valueOf(z10), Boolean.valueOf(z11), horizontal3, vertical4, horizontal4, vertical3};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i31 = 0;
                zChanged = false;
                while (i31 < i30) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i31]);
                    i31++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    g gVar8 = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                    composer2.updateRememberedValue(gVar8);
                    objRememberedValue = gVar8;
                } else {
                    composer2 = composerStartRestartGroup;
                    g gVar9 = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                    composer2.updateRememberedValue(gVar9);
                    objRememberedValue = gVar9;
                }
                composer2.endReplaceableGroup();
                Function2 function6 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                a(function0RememberLazyListItemProviderLambda, state, composer2, i3114);
                ScrollableDefaults scrollableDefaults5 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect5 = scrollableDefaults5.overscrollEffect(composer2, 6);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation6 = orientation;
                Composer composer8 = composer2;
                composer3 = composer8;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticStateRememberLazyListSemanticState5, orientation6, z12, z10, composer8, (i3116 & 57344) | ((i14 << 6) & 458752)), orientation6), state, i28, z10, orientation6, composer8, i3114 | ((i14 >> 15) & 896) | i3115), overscrollEffect5), state, orientation6, overscrollEffect5, z12, scrollableDefaults5.reverseDirection((LayoutDirection) composer8.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation6, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function6, composer3, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i32 = i28;
                horizontal5 = horizontal3;
                vertical5 = vertical3;
                vertical6 = vertical4;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier, state, contentPadding, z10, z11, flingBehavior, z12, i32, horizontal5, vertical5, vertical6, horizontal4, content, i11, i12, i13));
        }
        i14 |= 1572864;
        i17 = i13 & 128;
        if (i17 != 0) {
            i14 |= 12582912;
        } else if ((i11 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(i10)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i14 |= i18;
        }
        i19 = i13 & 256;
        if (i19 != 0) {
            i14 |= 100663296;
        } else if ((i11 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(horizontal)) {
                i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i20 = 33554432;
            }
            i14 |= i20;
        }
        i21 = i13 & 512;
        if (i21 != 0) {
            i14 |= 805306368;
        } else if ((i11 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(vertical)) {
                i22 = PKIFailureInfo.duplicateCertReq;
            } else {
                i22 = 268435456;
            }
            i14 |= i22;
        }
        i23 = i13 & 1024;
        if (i23 != 0) {
            i24 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            if (composerStartRestartGroup.changed(vertical2)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i12 | i25;
        } else {
            i24 = i12;
        }
        i26 = i13 & 2048;
        if (i26 != 0) {
            i24 |= 48;
        } else if ((i12 & 112) == 0) {
            i24 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
        }
        i27 = i24;
        if ((i13 & 4096) != 0) {
            i27 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i12 & 896) == 0) {
            i27 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((1533916891 & i14) != 306783378) {
            if (i17 != 0) {
                i28 = 0;
            } else {
                i28 = i10;
            }
            if (i19 != 0) {
                horizontal3 = null;
            } else {
                horizontal3 = horizontal;
            }
            if (i21 != 0) {
                vertical3 = null;
            } else {
                vertical3 = vertical;
            }
            if (i23 != 0) {
                vertical4 = null;
            } else {
                vertical4 = vertical2;
            }
            if (i26 != 0) {
                horizontal4 = null;
            } else {
                horizontal4 = horizontal2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(620764179, i14, i27, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
            }
            int i3118 = (i14 >> 3) & 14;
            function0RememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i27 >> 3) & 112) | i3118);
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState6 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z11, composerStartRestartGroup, i3118 | ((i14 >> 9) & 112));
            int i3119 = i14 & 112;
            int i31110 = i14 & 7168;
            int i31111 = i14 >> 6;
            int i31112 = i27 << 21;
            i29 = (i14 & 896) | i3119 | i31110 | (i14 & 57344) | (i31111 & 458752) | (i31111 & 3670016) | (29360128 & i31112) | (i31112 & 234881024) | (1879048192 & i14);
            composerStartRestartGroup.startReplaceableGroup(183156450);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(183156450, i29, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
            }
            objArr = new Object[]{state, contentPadding, Boolean.valueOf(z10), Boolean.valueOf(z11), horizontal3, vertical4, horizontal4, vertical3};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i31 = 0;
            zChanged = false;
            while (i31 < i30) {
                zChanged |= composerStartRestartGroup.changed(objArr[i31]);
                i31++;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                composer2 = composerStartRestartGroup;
                g gVar10 = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                composer2.updateRememberedValue(gVar10);
                objRememberedValue = gVar10;
            } else {
                composer2 = composerStartRestartGroup;
                g gVar11 = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                composer2.updateRememberedValue(gVar11);
                objRememberedValue = gVar11;
            }
            composer2.endReplaceableGroup();
            Function2 function7 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            a(function0RememberLazyListItemProviderLambda, state, composer2, i3119);
            ScrollableDefaults scrollableDefaults6 = ScrollableDefaults.INSTANCE;
            OverscrollEffect overscrollEffect6 = scrollableDefaults6.overscrollEffect(composer2, 6);
            if (z11) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation7 = orientation;
            Composer composer9 = composer2;
            composer3 = composer9;
            LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticStateRememberLazyListSemanticState6, orientation7, z12, z10, composer9, (i31111 & 57344) | ((i14 << 6) & 458752)), orientation7), state, i28, z10, orientation7, composer9, i3119 | ((i14 >> 15) & 896) | i31110), overscrollEffect6), state, orientation7, overscrollEffect6, z12, scrollableDefaults6.reverseDirection((LayoutDirection) composer9.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation7, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function7, composer3, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i32 = i28;
            horizontal5 = horizontal3;
            vertical5 = vertical3;
            vertical6 = vertical4;
        } else {
            if (i17 != 0) {
                i28 = 0;
            } else {
                i28 = i10;
            }
            if (i19 != 0) {
                horizontal3 = null;
            } else {
                horizontal3 = horizontal;
            }
            if (i21 != 0) {
                vertical3 = null;
            } else {
                vertical3 = vertical;
            }
            if (i23 != 0) {
                vertical4 = null;
            } else {
                vertical4 = vertical2;
            }
            if (i26 != 0) {
                horizontal4 = null;
            } else {
                horizontal4 = horizontal2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(620764179, i14, i27, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
            }
            int i31113 = (i14 >> 3) & 14;
            function0RememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i27 >> 3) & 112) | i31113);
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState7 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z11, composerStartRestartGroup, i31113 | ((i14 >> 9) & 112));
            int i31114 = i14 & 112;
            int i31115 = i14 & 7168;
            int i31116 = i14 >> 6;
            int i31117 = i27 << 21;
            i29 = (i14 & 896) | i31114 | i31115 | (i14 & 57344) | (i31116 & 458752) | (i31116 & 3670016) | (29360128 & i31117) | (i31117 & 234881024) | (1879048192 & i14);
            composerStartRestartGroup.startReplaceableGroup(183156450);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(183156450, i29, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
            }
            objArr = new Object[]{state, contentPadding, Boolean.valueOf(z10), Boolean.valueOf(z11), horizontal3, vertical4, horizontal4, vertical3};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i31 = 0;
            zChanged = false;
            while (i31 < i30) {
                zChanged |= composerStartRestartGroup.changed(objArr[i31]);
                i31++;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                composer2 = composerStartRestartGroup;
                g gVar12 = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                composer2.updateRememberedValue(gVar12);
                objRememberedValue = gVar12;
            } else {
                composer2 = composerStartRestartGroup;
                g gVar13 = new g(z11, contentPadding, z10, state, function0RememberLazyListItemProviderLambda, vertical3, horizontal4, i28, horizontal3, vertical4);
                composer2.updateRememberedValue(gVar13);
                objRememberedValue = gVar13;
            }
            composer2.endReplaceableGroup();
            Function2 function8 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            a(function0RememberLazyListItemProviderLambda, state, composer2, i31114);
            ScrollableDefaults scrollableDefaults7 = ScrollableDefaults.INSTANCE;
            OverscrollEffect overscrollEffect7 = scrollableDefaults7.overscrollEffect(composer2, 6);
            if (z11) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation8 = orientation;
            Composer composer10 = composer2;
            composer3 = composer10;
            LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticStateRememberLazyListSemanticState7, orientation8, z12, z10, composer10, (i31116 & 57344) | ((i14 << 6) & 458752)), orientation8), state, i28, z10, orientation8, composer10, i31114 | ((i14 >> 15) & 896) | i31115), overscrollEffect7), state, orientation8, overscrollEffect7, z12, scrollableDefaults7.reverseDirection((LayoutDirection) composer10.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation8, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function8, composer3, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i32 = i28;
            horizontal5 = horizontal3;
            vertical5 = vertical3;
            vertical6 = vertical4;
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier, state, contentPadding, z10, z11, flingBehavior, z12, i32, horizontal5, vertical5, vertical6, horizontal4, content, i11, i12, i13));
    }

    @Composable
    @ExperimentalFoundationApi
    public static final void a(Function0<? extends LazyListItemProvider> function0, LazyListState lazyListState, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-331135862);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-331135862, i10, -1, "androidx.compose.foundation.lazy.ScrollPositionUpdater (LazyList.kt:140)");
            }
            LazyListItemProvider lazyListItemProviderInvoke = function0.invoke();
            if (lazyListItemProviderInvoke.getItemCount() > 0) {
                LazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(lazyListState, lazyListItemProviderInvoke, 0, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(function0, lazyListState, i10));
    }
}
