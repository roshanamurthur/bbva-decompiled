package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001av\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0016\u001al\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001av\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001d\u001a¬\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010+\u001a\u0085\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010,\u001a¬\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010.\u001a\u0085\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010/\u001aë\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u00104\u001a¯\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001aë\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u00106\u001a¯\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u00107\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00068"}, d2 = {"LazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "userScrollEnabled", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.ITEMS, ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Lkotlin/ParameterName;", "name", AnalyticsConstants.Key.ITEM, "", "contentType", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,423:1\n136#1,12:424\n171#1,12:436\n206#1,12:448\n241#1,12:460\n154#2:472\n154#2:473\n154#2:474\n154#2:475\n*S KotlinDebug\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n154#1:424,12\n189#1:436,12\n224#1:448,12\n259#1:460,12\n293#1:472\n349#1:473\n377#1:474\n403#1:475\n*E\n"})
public final class LazyDslKt {

    /* JADX INFO: compiled from: LazyDsl.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4492p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f4493q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f4494r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f4495s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Vertical f4496t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Horizontal f4497u0;
        public final /* synthetic */ FlingBehavior v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f4498w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function1<LazyListScope, Unit> f4499x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f4500y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z10, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z11, Function1<? super LazyListScope, Unit> function1, int i10, int i11) {
            super(2);
            this.f4492p0 = modifier;
            this.f4493q0 = lazyListState;
            this.f4494r0 = paddingValues;
            this.f4495s0 = z10;
            this.f4496t0 = vertical;
            this.f4497u0 = horizontal;
            this.v0 = flingBehavior;
            this.f4498w0 = z11;
            this.f4499x0 = function1;
            this.f4500y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyDslKt.LazyColumn(this.f4492p0, this.f4493q0, this.f4494r0, this.f4495s0, this.f4496t0, this.f4497u0, this.v0, this.f4498w0, this.f4499x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4500y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyDsl.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4501p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f4502q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f4503r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f4504s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Vertical f4505t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Horizontal f4506u0;
        public final /* synthetic */ FlingBehavior v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function1<LazyListScope, Unit> f4507w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f4508x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f4509y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z10, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, Function1<? super LazyListScope, Unit> function1, int i10, int i11) {
            super(2);
            this.f4501p0 = modifier;
            this.f4502q0 = lazyListState;
            this.f4503r0 = paddingValues;
            this.f4504s0 = z10;
            this.f4505t0 = vertical;
            this.f4506u0 = horizontal;
            this.v0 = flingBehavior;
            this.f4507w0 = function1;
            this.f4508x0 = i10;
            this.f4509y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyDslKt.LazyColumn(this.f4501p0, this.f4502q0, this.f4503r0, this.f4504s0, this.f4505t0, this.f4506u0, this.v0, this.f4507w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4508x0 | 1), this.f4509y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyDsl.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4510p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f4511q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f4512r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f4513s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Horizontal f4514t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Vertical f4515u0;
        public final /* synthetic */ FlingBehavior v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f4516w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function1<LazyListScope, Unit> f4517x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f4518y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z10, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z11, Function1<? super LazyListScope, Unit> function1, int i10, int i11) {
            super(2);
            this.f4510p0 = modifier;
            this.f4511q0 = lazyListState;
            this.f4512r0 = paddingValues;
            this.f4513s0 = z10;
            this.f4514t0 = horizontal;
            this.f4515u0 = vertical;
            this.v0 = flingBehavior;
            this.f4516w0 = z11;
            this.f4517x0 = function1;
            this.f4518y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyDslKt.LazyRow(this.f4510p0, this.f4511q0, this.f4512r0, this.f4513s0, this.f4514t0, this.f4515u0, this.v0, this.f4516w0, this.f4517x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4518y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyDsl.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4519p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f4520q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f4521r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f4522s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Horizontal f4523t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Vertical f4524u0;
        public final /* synthetic */ FlingBehavior v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function1<LazyListScope, Unit> f4525w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f4526x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f4527y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z10, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, Function1<? super LazyListScope, Unit> function1, int i10, int i11) {
            super(2);
            this.f4519p0 = modifier;
            this.f4520q0 = lazyListState;
            this.f4521r0 = paddingValues;
            this.f4522s0 = z10;
            this.f4523t0 = horizontal;
            this.f4524u0 = vertical;
            this.v0 = flingBehavior;
            this.f4525w0 = function1;
            this.f4526x0 = i10;
            this.f4527y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyDslKt.LazyRow(this.f4519p0, this.f4520q0, this.f4521r0, this.f4522s0, this.f4523t0, this.f4524u0, this.v0, this.f4525w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4526x0 | 1), this.f4527y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$1, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$1\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass1 extends Lambda implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$2, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$2\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass2 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Object> f4528p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4529q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.f4528p0 = function1;
            this.f4529q0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NotNull
        public final Object invoke(int i10) {
            return this.f4528p0.invoke((T) this.f4529q0.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$3\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass3 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Object> f4530p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4531q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.f4530p0 = function1;
            this.f4531q0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Nullable
        public final Object invoke(int i10) {
            return this.f4530p0.invoke((T) this.f4531q0.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$4, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass4 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> f4532p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4533q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.f4532p0 = function4;
            this.f4533q0 = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyItemScope items, int i10, @Nullable Composer composer, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & 14) == 0) {
                i12 = (composer.changed(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
            }
            this.f4532p0.invoke(items, (T) this.f4533q0.get(i10), composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$5, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$5\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass5 extends Lambda implements Function1 {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$6, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$6\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass6 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Object> f4534p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4535q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.f4534p0 = function1;
            this.f4535q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @NotNull
        public final Object invoke(int i10) {
            return this.f4534p0.invoke(this.f4535q0[i10]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$7, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$7\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass7 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Object> f4536p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4537q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.f4536p0 = function1;
            this.f4537q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Nullable
        public final Object invoke(int i10) {
            return this.f4536p0.invoke(this.f4537q0[i10]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$8, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$8\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass8 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> f4538p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4539q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.f4538p0 = function4;
            this.f4539q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Composable
        public final void invoke(@NotNull LazyItemScope items, int i10, @Nullable Composer composer, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & 14) == 0) {
                i12 = (composer.changed(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1043393750, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:214)");
            }
            this.f4538p0.invoke(items, this.f4539q0[i10], composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$2\n*L\n1#1,423:1\n*E\n"})
    public static final class C05262 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Object> f4542p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4543q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05262(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.f4542p0 = function2;
            this.f4543q0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NotNull
        public final Object invoke(int i10) {
            return this.f4542p0.invoke(Integer.valueOf(i10), (T) this.f4543q0.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3\n*L\n1#1,423:1\n*E\n"})
    public static final class C05273 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Object> f4544p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4545q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05273(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.f4544p0 = function2;
            this.f4545q0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Nullable
        public final Object invoke(int i10) {
            return this.f4544p0.invoke(Integer.valueOf(i10), (T) this.f4545q0.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n*L\n1#1,423:1\n*E\n"})
    public static final class C05284 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> f4546p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4547q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05284(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.f4546p0 = function5;
            this.f4547q0 = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyItemScope items, int i10, @Nullable Composer composer, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & 14) == 0) {
                i12 = (composer.changed(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
            }
            this.f4546p0.invoke(items, Integer.valueOf(i10), (T) this.f4547q0.get(i10), composer, Integer.valueOf((i12 & 14) | (i12 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$6\n*L\n1#1,423:1\n*E\n"})
    public static final class C05306 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Object> f4548p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4549q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05306(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.f4548p0 = function2;
            this.f4549q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @NotNull
        public final Object invoke(int i10) {
            return this.f4548p0.invoke(Integer.valueOf(i10), this.f4549q0[i10]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$7\n*L\n1#1,423:1\n*E\n"})
    public static final class C05317 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Object> f4550p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4551q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05317(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.f4550p0 = function2;
            this.f4551q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Nullable
        public final Object invoke(int i10) {
            return this.f4550p0.invoke(Integer.valueOf(i10), this.f4551q0[i10]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$8\n*L\n1#1,423:1\n*E\n"})
    public static final class C05328 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> f4552p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4553q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05328(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.f4552p0 = function5;
            this.f4553q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Composable
        public final void invoke(@NotNull LazyItemScope items, int i10, @Nullable Composer composer, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & 14) == 0) {
                i12 = (composer.changed(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600639390, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:249)");
            }
            this.f4552p0.invoke(items, Integer.valueOf(i10), this.f4553q0[i10], composer, Integer.valueOf((i12 & 14) | (i12 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:105:0x0146  */
    /* JADX WARN: Code duplicated, block: B:118:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0175  */
    /* JADX WARN: Code duplicated, block: B:120:0x0178  */
    /* JADX WARN: Code duplicated, block: B:123:0x017f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0187  */
    /* JADX WARN: Code duplicated, block: B:126:0x018b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0195  */
    /* JADX WARN: Code duplicated, block: B:130:0x0199  */
    /* JADX WARN: Code duplicated, block: B:133:0x019e  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:149:0x01df  */
    /* JADX WARN: Code duplicated, block: B:152:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:155:0x023f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0259  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x011f  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LazyColumn(@Nullable Modifier modifier, @Nullable LazyListState lazyListState, @Nullable PaddingValues paddingValues, boolean z10, @Nullable Arrangement.Vertical vertical, @Nullable Alignment.Horizontal horizontal, @Nullable FlingBehavior flingBehavior, boolean z11, @NotNull Function1<? super LazyListScope, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        PaddingValues paddingValues2;
        int i13;
        boolean z12;
        int i14;
        Arrangement.Vertical vertical2;
        int i15;
        Alignment.Horizontal horizontal2;
        int i16;
        int i17;
        int i18;
        int i19;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM289PaddingValues0680j_4;
        boolean z13;
        Arrangement.Vertical bottom;
        Alignment.Horizontal start;
        FlingBehavior flingBehavior2;
        boolean z14;
        Modifier modifier3;
        LazyListState lazyListState2;
        boolean z15;
        PaddingValues paddingValues3;
        Arrangement.Vertical vertical3;
        Alignment.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        Arrangement arrangement;
        Composer composer2;
        Modifier modifier4;
        LazyListState lazyListState3;
        PaddingValues paddingValues4;
        boolean z16;
        Arrangement.Vertical vertical4;
        Alignment.Horizontal horizontal4;
        FlingBehavior flingBehavior4;
        boolean z17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-740714857);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= ((i11 & 2) == 0 && composerStartRestartGroup.changed(lazyListState)) ? 32 : 16;
        }
        int i22 = i11 & 4;
        if (i22 == 0) {
            if ((i10 & 896) == 0) {
                paddingValues2 = paddingValues;
                i12 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z10;
                    if (composerStartRestartGroup.changed(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        vertical2 = vertical;
                        int i23 = composerStartRestartGroup.changed(vertical2) ? 16384 : 8192;
                        i12 |= i23;
                    } else {
                        vertical2 = vertical;
                    }
                    i12 |= i23;
                } else {
                    vertical2 = vertical;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    horizontal2 = horizontal;
                } else {
                    horizontal2 = horizontal;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(horizontal2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior)) {
                        i20 = 524288;
                    } else {
                        i20 = 1048576;
                    }
                    i12 |= i20;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i19 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i22 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            z13 = i13 == 0 ? z12 : false;
                            if ((i11 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getBottom();
                                } else {
                                    bottom = arrangement.getTop();
                                }
                                i12 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i15 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 64) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            modifier3 = modifier2;
                            lazyListState2 = lazyListStateRememberLazyListState;
                            z15 = z13;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            modifier3 = modifier;
                            lazyListState2 = lazyListState;
                            flingBehavior3 = flingBehavior;
                            z14 = z11;
                            paddingValues3 = paddingValues2;
                            z15 = z12;
                            vertical3 = vertical2;
                            horizontal3 = horizontal2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                        }
                        int i24 = i12 >> 3;
                        composer2 = composerStartRestartGroup;
                        LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i24) | (i24 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyListState3 = lazyListState2;
                        paddingValues4 = paddingValues3;
                        z16 = z15;
                        vertical4 = vertical3;
                        horizontal4 = horizontal3;
                        flingBehavior4 = flingBehavior3;
                        z17 = z14;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        lazyListState3 = lazyListState;
                        flingBehavior4 = flingBehavior;
                        paddingValues4 = paddingValues2;
                        composer2 = composerStartRestartGroup;
                        z16 = z12;
                        vertical4 = vertical2;
                        horizontal4 = horizontal2;
                        z17 = z11;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, lazyListState3, paddingValues4, z16, vertical4, horizontal4, flingBehavior4, z17, content, i10, i11));
                }
                i19 = 100663296;
                i12 |= i19;
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i25 = i12 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i25) | (i25 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z16 = z15;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z17 = z14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i26 = i12 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i26) | (i26 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z16 = z15;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z17 = z14;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, lazyListState3, paddingValues4, z16, vertical4, horizontal4, flingBehavior4, z17, content, i10, i11));
            }
            i12 |= 3072;
            z12 = z10;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i12 |= i23;
                } else {
                    vertical2 = vertical;
                }
                i12 |= i23;
            } else {
                vertical2 = vertical;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                horizontal2 = horizontal;
            } else {
                horizontal2 = horizontal;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i27 = i12 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i27) | (i27 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z16 = z15;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z17 = z14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i28 = i12 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i28) | (i28 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z16 = z15;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z17 = z14;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, lazyListState3, paddingValues4, z16, vertical4, horizontal4, flingBehavior4, z17, content, i10, i11));
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i29 = i12 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i29) | (i29 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z16 = z15;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z17 = z14;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i210 = i12 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i210) | (i210 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z16 = z15;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z17 = z14;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, lazyListState3, paddingValues4, z16, vertical4, horizontal4, flingBehavior4, z17, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        paddingValues2 = paddingValues;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z12 = z10;
                if (composerStartRestartGroup.changed(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i12 |= i23;
                } else {
                    vertical2 = vertical;
                }
                i12 |= i23;
            } else {
                vertical2 = vertical;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                horizontal2 = horizontal;
            } else {
                horizontal2 = horizontal;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i211 = i12 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i211) | (i211 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z16 = z15;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z17 = z14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i212 = i12 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i212) | (i212 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z16 = z15;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z17 = z14;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, lazyListState3, paddingValues4, z16, vertical4, horizontal4, flingBehavior4, z17, content, i10, i11));
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i213 = i12 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i213) | (i213 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z16 = z15;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z17 = z14;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i214 = i12 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i214) | (i214 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z16 = z15;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z17 = z14;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, lazyListState3, paddingValues4, z16, vertical4, horizontal4, flingBehavior4, z17, content, i10, i11));
        }
        i12 |= 3072;
        z12 = z10;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                vertical2 = vertical;
                if (composerStartRestartGroup.changed(vertical2)) {
                }
                i12 |= i23;
            } else {
                vertical2 = vertical;
            }
            i12 |= i23;
        } else {
            vertical2 = vertical;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            horizontal2 = horizontal;
        } else {
            horizontal2 = horizontal;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(horizontal2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        }
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(z11)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i19 = 33554432;
                }
            }
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i215 = i12 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i215) | (i215 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z16 = z15;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z17 = z14;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i216 = i12 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i216) | (i216 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z16 = z15;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z17 = z14;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, lazyListState3, paddingValues4, z16, vertical4, horizontal4, flingBehavior4, z17, content, i10, i11));
        }
        i19 = 100663296;
        i12 |= i19;
        if ((191739611 & i12) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i22 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i12 &= -57345;
                } else {
                    bottom = vertical2;
                }
                if (i15 != 0) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i11 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z15 = z13;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i22 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i12 &= -57345;
                } else {
                    bottom = vertical2;
                }
                if (i15 != 0) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i11 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z15 = z13;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
            }
            int i217 = i12 >> 3;
            composer2 = composerStartRestartGroup;
            LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i217) | (i217 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState3 = lazyListState2;
            paddingValues4 = paddingValues3;
            z16 = z15;
            vertical4 = vertical3;
            horizontal4 = horizontal3;
            flingBehavior4 = flingBehavior3;
            z17 = z14;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i22 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i12 &= -57345;
                } else {
                    bottom = vertical2;
                }
                if (i15 != 0) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i11 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z15 = z13;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i22 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i12 &= -57345;
                } else {
                    bottom = vertical2;
                }
                if (i15 != 0) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i11 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z15 = z13;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740714857, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
            }
            int i218 = i12 >> 3;
            composer2 = composerStartRestartGroup;
            LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, true, flingBehavior3, z14, 0, horizontal3, vertical3, null, null, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i218) | (i218 & 3670016) | ((i12 << 9) & 234881024) | ((i12 << 15) & 1879048192), (i12 >> 18) & 896, 3200);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState3 = lazyListState2;
            paddingValues4 = paddingValues3;
            z16 = z15;
            vertical4 = vertical3;
            horizontal4 = horizontal3;
            flingBehavior4 = flingBehavior3;
            z17 = z14;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, lazyListState3, paddingValues4, z16, vertical4, horizontal4, flingBehavior4, z17, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0138  */
    /* JADX WARN: Code duplicated, block: B:105:0x0145  */
    /* JADX WARN: Code duplicated, block: B:118:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:120:0x0177  */
    /* JADX WARN: Code duplicated, block: B:123:0x017e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0186  */
    /* JADX WARN: Code duplicated, block: B:126:0x018a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0194  */
    /* JADX WARN: Code duplicated, block: B:130:0x0198  */
    /* JADX WARN: Code duplicated, block: B:133:0x019d  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:149:0x01de  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:155:0x023e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0258  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LazyRow(@Nullable Modifier modifier, @Nullable LazyListState lazyListState, @Nullable PaddingValues paddingValues, boolean z10, @Nullable Arrangement.Horizontal horizontal, @Nullable Alignment.Vertical vertical, @Nullable FlingBehavior flingBehavior, boolean z11, @NotNull Function1<? super LazyListScope, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        PaddingValues paddingValues2;
        int i13;
        boolean z12;
        int i14;
        Arrangement.Horizontal horizontal2;
        int i15;
        Alignment.Vertical vertical2;
        int i16;
        int i17;
        int i18;
        int i19;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM289PaddingValues0680j_4;
        boolean z13;
        Arrangement.Horizontal end;
        Alignment.Vertical top;
        FlingBehavior flingBehavior2;
        boolean z14;
        Modifier modifier3;
        LazyListState lazyListState2;
        boolean z15;
        PaddingValues paddingValues3;
        Arrangement.Horizontal horizontal3;
        Alignment.Vertical vertical3;
        FlingBehavior flingBehavior3;
        Arrangement arrangement;
        Composer composer2;
        Modifier modifier4;
        LazyListState lazyListState3;
        PaddingValues paddingValues4;
        boolean z16;
        Arrangement.Horizontal horizontal4;
        Alignment.Vertical vertical4;
        FlingBehavior flingBehavior4;
        boolean z17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1724297413);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= ((i11 & 2) == 0 && composerStartRestartGroup.changed(lazyListState)) ? 32 : 16;
        }
        int i22 = i11 & 4;
        if (i22 == 0) {
            if ((i10 & 896) == 0) {
                paddingValues2 = paddingValues;
                i12 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z10;
                    if (composerStartRestartGroup.changed(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        horizontal2 = horizontal;
                        int i23 = composerStartRestartGroup.changed(horizontal2) ? 16384 : 8192;
                        i12 |= i23;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i12 |= i23;
                } else {
                    horizontal2 = horizontal;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior)) {
                        i20 = 524288;
                    } else {
                        i20 = 1048576;
                    }
                    i12 |= i20;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i19 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i22 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            z13 = i13 == 0 ? z12 : false;
                            if ((i11 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getEnd();
                                } else {
                                    end = arrangement.getStart();
                                }
                                i12 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i15 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 64) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            modifier3 = modifier2;
                            lazyListState2 = lazyListStateRememberLazyListState;
                            z15 = z13;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            modifier3 = modifier;
                            lazyListState2 = lazyListState;
                            flingBehavior3 = flingBehavior;
                            z14 = z11;
                            paddingValues3 = paddingValues2;
                            z15 = z12;
                            horizontal3 = horizontal2;
                            vertical3 = vertical2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                        }
                        int i24 = i12 >> 3;
                        composer2 = composerStartRestartGroup;
                        LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i24) | (i24 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyListState3 = lazyListState2;
                        paddingValues4 = paddingValues3;
                        z16 = z15;
                        horizontal4 = horizontal3;
                        vertical4 = vertical3;
                        flingBehavior4 = flingBehavior3;
                        z17 = z14;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        lazyListState3 = lazyListState;
                        flingBehavior4 = flingBehavior;
                        paddingValues4 = paddingValues2;
                        z16 = z12;
                        horizontal4 = horizontal2;
                        composer2 = composerStartRestartGroup;
                        vertical4 = vertical2;
                        z17 = z11;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier4, lazyListState3, paddingValues4, z16, horizontal4, vertical4, flingBehavior4, z17, content, i10, i11));
                }
                i19 = 100663296;
                i12 |= i19;
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i25 = i12 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i25) | (i25 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z16 = z15;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z17 = z14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i26 = i12 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i26) | (i26 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z16 = z15;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z17 = z14;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier4, lazyListState3, paddingValues4, z16, horizontal4, vertical4, flingBehavior4, z17, content, i10, i11));
            }
            i12 |= 3072;
            z12 = z10;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i12 |= i23;
                } else {
                    horizontal2 = horizontal;
                }
                i12 |= i23;
            } else {
                horizontal2 = horizontal;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i27 = i12 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i27) | (i27 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z16 = z15;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z17 = z14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i28 = i12 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i28) | (i28 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z16 = z15;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z17 = z14;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier4, lazyListState3, paddingValues4, z16, horizontal4, vertical4, flingBehavior4, z17, content, i10, i11));
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i29 = i12 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i29) | (i29 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z16 = z15;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z17 = z14;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i210 = i12 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i210) | (i210 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z16 = z15;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z17 = z14;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier4, lazyListState3, paddingValues4, z16, horizontal4, vertical4, flingBehavior4, z17, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        paddingValues2 = paddingValues;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z12 = z10;
                if (composerStartRestartGroup.changed(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i12 |= i23;
                } else {
                    horizontal2 = horizontal;
                }
                i12 |= i23;
            } else {
                horizontal2 = horizontal;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i211 = i12 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i211) | (i211 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z16 = z15;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z17 = z14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i22 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z15 = z13;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i212 = i12 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i212) | (i212 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z16 = z15;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z17 = z14;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier4, lazyListState3, paddingValues4, z16, horizontal4, vertical4, flingBehavior4, z17, content, i10, i11));
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i213 = i12 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i213) | (i213 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z16 = z15;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z17 = z14;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i214 = i12 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i214) | (i214 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z16 = z15;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z17 = z14;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier4, lazyListState3, paddingValues4, z16, horizontal4, vertical4, flingBehavior4, z17, content, i10, i11));
        }
        i12 |= 3072;
        z12 = z10;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                horizontal2 = horizontal;
                if (composerStartRestartGroup.changed(horizontal2)) {
                }
                i12 |= i23;
            } else {
                horizontal2 = horizontal;
            }
            i12 |= i23;
        } else {
            horizontal2 = horizontal;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            vertical2 = vertical;
        } else {
            vertical2 = vertical;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        }
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(z11)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i11 & 256) != 0) {
            if ((234881024 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i19 = 33554432;
                }
            }
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i215 = i12 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i215) | (i215 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z16 = z15;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z17 = z14;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i22 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z15 = z13;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i216 = i12 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i216) | (i216 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z16 = z15;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z17 = z14;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier4, lazyListState3, paddingValues4, z16, horizontal4, vertical4, flingBehavior4, z17, content, i10, i11));
        }
        i19 = 100663296;
        i12 |= i19;
        if ((191739611 & i12) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i22 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i12 &= -57345;
                } else {
                    end = horizontal2;
                }
                if (i15 != 0) {
                    top = Alignment.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i11 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z15 = z13;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i22 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i12 &= -57345;
                } else {
                    end = horizontal2;
                }
                if (i15 != 0) {
                    top = Alignment.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i11 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z15 = z13;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
            }
            int i217 = i12 >> 3;
            composer2 = composerStartRestartGroup;
            LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i217) | (i217 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState3 = lazyListState2;
            paddingValues4 = paddingValues3;
            z16 = z15;
            horizontal4 = horizontal3;
            vertical4 = vertical3;
            flingBehavior4 = flingBehavior3;
            z17 = z14;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i22 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i12 &= -57345;
                } else {
                    end = horizontal2;
                }
                if (i15 != 0) {
                    top = Alignment.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i11 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z15 = z13;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i22 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i12 &= -57345;
                } else {
                    end = horizontal2;
                }
                if (i15 != 0) {
                    top = Alignment.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i11 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z15 = z13;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1724297413, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
            }
            int i218 = i12 >> 3;
            composer2 = composerStartRestartGroup;
            LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z15, false, flingBehavior3, z14, 0, null, null, vertical3, horizontal3, content, composer2, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (458752 & i218) | (i218 & 3670016), ((i12 >> 15) & 14) | ((i12 >> 9) & 112) | ((i12 >> 18) & 896), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState3 = lazyListState2;
            paddingValues4 = paddingValues3;
            z16 = z15;
            horizontal4 = horizontal3;
            vertical4 = vertical3;
            flingBehavior4 = flingBehavior3;
            z17 = z14;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier4, lazyListState3, paddingValues4, z16, horizontal4, vertical4, flingBehavior4, z17, content, i10, i11));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyListScope lazyListScope, @NotNull List<? extends T> items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function1<? super T, ? extends Object> contentType, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new AnonymousClass2(function1, items) : null, new AnonymousClass3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List items, Function1 function1, Function1 contentType, Function4 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            contentType = AnonymousClass1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new AnonymousClass2(function1, items) : null, new AnonymousClass3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyListScope lazyListScope, @NotNull List<? extends T> items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new C05262(function2, items) : null, new C05273(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C05284(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List items, Function2 function2, Function2 contentType, Function5 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1
                @Nullable
                public final Void invoke(int i11, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new C05262(function2, items) : null, new C05273(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C05284(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyListScope lazyListScope, @NotNull T[] items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function1<? super T, ? extends Object> contentType, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new AnonymousClass6(function1, items) : null, new AnonymousClass7(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyListScope lazyListScope, @NotNull T[] items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new C05306(function2, items) : null, new C05317(contentType, items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C05328(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List items, Function1 function1, Function4 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new AnonymousClass2(function1, items) : null, new AnonymousClass3(AnonymousClass1.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List items, Function2 function2, Function5 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new C05262(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C05284(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, List<? extends T> items, Function1<? super T, ? extends Object> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new AnonymousClass2(function1, items) : null, new AnonymousClass3(AnonymousClass1.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> items, Function2<? super Integer, ? super T, ? extends Object> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new C05262(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C05284(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] items, Function2 function2, Function2 contentType, Function5 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5
                @Nullable
                public final Void invoke(int i11, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new C05306(function2, items) : null, new C05317(contentType, items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C05328(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] items, Function1 function1, Function1 contentType, Function4 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            contentType = AnonymousClass5.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new AnonymousClass6(function1, items) : null, new AnonymousClass7(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, T[] items, Function2<? super Integer, ? super T, ? extends Object> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new C05306(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C05328(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, T[] items, Function1<? super T, ? extends Object> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new AnonymousClass6(function1, items) : null, new AnonymousClass7(AnonymousClass5.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(itemContent, items)));
    }

    /* JADX WARN: Code duplicated, block: B:109:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0151  */
    /* JADX WARN: Code duplicated, block: B:111:0x0154  */
    /* JADX WARN: Code duplicated, block: B:114:0x015d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0164  */
    /* JADX WARN: Code duplicated, block: B:117:0x0167  */
    /* JADX WARN: Code duplicated, block: B:119:0x0173  */
    /* JADX WARN: Code duplicated, block: B:122:0x0178  */
    /* JADX WARN: Code duplicated, block: B:124:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x018a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0195  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:144:0x020f  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @Composable
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z10, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, Function1 content, Composer composer, int i10, int i11) {
        int i12;
        LazyListState lazyListState2;
        PaddingValues paddingValuesM289PaddingValues0680j_4;
        int i13;
        boolean z11;
        int i14;
        Arrangement.Vertical vertical2;
        int i15;
        Alignment.Horizontal start;
        int i16;
        int i17;
        Modifier modifier2;
        Modifier modifier3;
        LazyListState lazyListStateRememberLazyListState;
        FlingBehavior flingBehavior2;
        LazyListState lazyListState3;
        Arrangement arrangement;
        Arrangement.Vertical bottom;
        Modifier modifier4;
        LazyListState lazyListState4;
        PaddingValues paddingValues2;
        boolean z12;
        Arrangement.Vertical vertical3;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i18;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-563353797);
        int i19 = i11 & 1;
        if (i19 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                lazyListState2 = lazyListState;
                int i20 = composerStartRestartGroup.changed(lazyListState2) ? 32 : 16;
                i12 |= i20;
            } else {
                lazyListState2 = lazyListState;
            }
            i12 |= i20;
        } else {
            lazyListState2 = lazyListState;
        }
        int i21 = i11 & 4;
        if (i21 == 0) {
            if ((i10 & 896) == 0) {
                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                i12 |= composerStartRestartGroup.changed(paddingValuesM289PaddingValues0680j_4) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        vertical2 = vertical;
                        int i22 = composerStartRestartGroup.changed(vertical2) ? 16384 : 8192;
                        i12 |= i22;
                    } else {
                        vertical2 = vertical;
                    }
                    i12 |= i22;
                } else {
                    vertical2 = vertical;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    start = horizontal;
                } else {
                    start = horizontal;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(start)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i12 |= i18;
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((23967451 & i12) != 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    flingBehavior3 = flingBehavior;
                    lazyListState4 = lazyListState2;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    z12 = z11;
                    horizontal2 = start;
                    vertical3 = vertical2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        modifier3 = modifier2;
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i21 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        }
                        if (i13 != 0) {
                            z11 = false;
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z11) {
                                bottom = arrangement.getBottom();
                            } else {
                                bottom = arrangement.getTop();
                            }
                            i12 &= -57345;
                            vertical2 = bottom;
                        }
                        if (i15 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        lazyListState3 = lazyListStateRememberLazyListState;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        modifier3 = modifier;
                        flingBehavior2 = flingBehavior;
                        lazyListState3 = lazyListState2;
                    }
                    PaddingValues paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    boolean z13 = z11;
                    Alignment.Horizontal horizontal3 = start;
                    Arrangement.Vertical vertical4 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                    }
                    LazyColumn(modifier3, lazyListState3, paddingValues3, z13, vertical4, horizontal3, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState4 = lazyListState3;
                    paddingValues2 = paddingValues3;
                    z12 = z13;
                    vertical3 = vertical4;
                    horizontal2 = horizontal3;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier4, lazyListState4, paddingValues2, z12, vertical3, horizontal2, flingBehavior3, content, i10, i11));
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i12 |= i22;
                } else {
                    vertical2 = vertical;
                }
                i12 |= i22;
            } else {
                vertical2 = vertical;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                start = horizontal;
            } else {
                start = horizontal;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(start)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((29360128 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((23967451 & i12) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues4 = paddingValuesM289PaddingValues0680j_4;
                boolean z14 = z11;
                Alignment.Horizontal horizontal4 = start;
                Arrangement.Vertical vertical5 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                }
                LazyColumn(modifier3, lazyListState3, paddingValues4, z14, vertical5, horizontal4, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues4;
                z12 = z14;
                vertical3 = vertical5;
                horizontal2 = horizontal4;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues5 = paddingValuesM289PaddingValues0680j_4;
                boolean z15 = z11;
                Alignment.Horizontal horizontal5 = start;
                Arrangement.Vertical vertical6 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                }
                LazyColumn(modifier3, lazyListState3, paddingValues5, z15, vertical6, horizontal5, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues5;
                z12 = z15;
                vertical3 = vertical6;
                horizontal2 = horizontal5;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier4, lazyListState4, paddingValues2, z12, vertical3, horizontal2, flingBehavior3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        paddingValuesM289PaddingValues0680j_4 = paddingValues;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i12 |= i22;
                } else {
                    vertical2 = vertical;
                }
                i12 |= i22;
            } else {
                vertical2 = vertical;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                start = horizontal;
            } else {
                start = horizontal;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(start)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((29360128 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((23967451 & i12) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues6 = paddingValuesM289PaddingValues0680j_4;
                boolean z16 = z11;
                Alignment.Horizontal horizontal6 = start;
                Arrangement.Vertical vertical7 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                }
                LazyColumn(modifier3, lazyListState3, paddingValues6, z16, vertical7, horizontal6, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues6;
                z12 = z16;
                vertical3 = vertical7;
                horizontal2 = horizontal6;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i15 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues7 = paddingValuesM289PaddingValues0680j_4;
                boolean z17 = z11;
                Alignment.Horizontal horizontal7 = start;
                Arrangement.Vertical vertical8 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                }
                LazyColumn(modifier3, lazyListState3, paddingValues7, z17, vertical8, horizontal7, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues7;
                z12 = z17;
                vertical3 = vertical8;
                horizontal2 = horizontal7;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier4, lazyListState4, paddingValues2, z12, vertical3, horizontal2, flingBehavior3, content, i10, i11));
        }
        i12 |= 3072;
        z11 = z10;
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                vertical2 = vertical;
                if (composerStartRestartGroup.changed(vertical2)) {
                }
                i12 |= i22;
            } else {
                vertical2 = vertical;
            }
            i12 |= i22;
        } else {
            vertical2 = vertical;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            start = horizontal;
        } else {
            start = horizontal;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(start)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i18 = 524288;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((29360128 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        }
        if ((23967451 & i12) != 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i21 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z11) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i12 &= -57345;
                    vertical2 = bottom;
                }
                if (i15 != 0) {
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i21 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z11) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i12 &= -57345;
                    vertical2 = bottom;
                }
                if (i15 != 0) {
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            }
            PaddingValues paddingValues8 = paddingValuesM289PaddingValues0680j_4;
            boolean z18 = z11;
            Alignment.Horizontal horizontal8 = start;
            Arrangement.Vertical vertical9 = vertical2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
            }
            LazyColumn(modifier3, lazyListState3, paddingValues8, z18, vertical9, horizontal8, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState4 = lazyListState3;
            paddingValues2 = paddingValues8;
            z12 = z18;
            vertical3 = vertical9;
            horizontal2 = horizontal8;
            flingBehavior3 = flingBehavior2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i21 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z11) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i12 &= -57345;
                    vertical2 = bottom;
                }
                if (i15 != 0) {
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i21 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z11) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i12 &= -57345;
                    vertical2 = bottom;
                }
                if (i15 != 0) {
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            }
            PaddingValues paddingValues9 = paddingValuesM289PaddingValues0680j_4;
            boolean z19 = z11;
            Alignment.Horizontal horizontal9 = start;
            Arrangement.Vertical vertical10 = vertical2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-563353797, i12, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
            }
            LazyColumn(modifier3, lazyListState3, paddingValues9, z19, vertical10, horizontal9, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState4 = lazyListState3;
            paddingValues2 = paddingValues9;
            z12 = z19;
            vertical3 = vertical10;
            horizontal2 = horizontal9;
            flingBehavior3 = flingBehavior2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier4, lazyListState4, paddingValues2, z12, vertical3, horizontal2, flingBehavior3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:109:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0151  */
    /* JADX WARN: Code duplicated, block: B:111:0x0154  */
    /* JADX WARN: Code duplicated, block: B:114:0x015d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0164  */
    /* JADX WARN: Code duplicated, block: B:117:0x0167  */
    /* JADX WARN: Code duplicated, block: B:119:0x0173  */
    /* JADX WARN: Code duplicated, block: B:122:0x0178  */
    /* JADX WARN: Code duplicated, block: B:124:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x018a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0195  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:144:0x020f  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @Composable
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z10, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, Function1 content, Composer composer, int i10, int i11) {
        int i12;
        LazyListState lazyListState2;
        PaddingValues paddingValuesM289PaddingValues0680j_4;
        int i13;
        boolean z11;
        int i14;
        Arrangement.Horizontal horizontal2;
        int i15;
        Alignment.Vertical top;
        int i16;
        int i17;
        Modifier modifier2;
        Modifier modifier3;
        LazyListState lazyListStateRememberLazyListState;
        FlingBehavior flingBehavior2;
        LazyListState lazyListState3;
        Arrangement arrangement;
        Arrangement.Horizontal end;
        Modifier modifier4;
        LazyListState lazyListState4;
        PaddingValues paddingValues2;
        boolean z12;
        Arrangement.Horizontal horizontal3;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i18;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(407929823);
        int i19 = i11 & 1;
        if (i19 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                lazyListState2 = lazyListState;
                int i20 = composerStartRestartGroup.changed(lazyListState2) ? 32 : 16;
                i12 |= i20;
            } else {
                lazyListState2 = lazyListState;
            }
            i12 |= i20;
        } else {
            lazyListState2 = lazyListState;
        }
        int i21 = i11 & 4;
        if (i21 == 0) {
            if ((i10 & 896) == 0) {
                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                i12 |= composerStartRestartGroup.changed(paddingValuesM289PaddingValues0680j_4) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        horizontal2 = horizontal;
                        int i22 = composerStartRestartGroup.changed(horizontal2) ? 16384 : 8192;
                        i12 |= i22;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i12 |= i22;
                } else {
                    horizontal2 = horizontal;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    top = vertical;
                } else {
                    top = vertical;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(top)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i12 |= i18;
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((23967451 & i12) != 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    flingBehavior3 = flingBehavior;
                    lazyListState4 = lazyListState2;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    z12 = z11;
                    vertical2 = top;
                    horizontal3 = horizontal2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        modifier3 = modifier2;
                        if ((i11 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i21 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        }
                        if (i13 != 0) {
                            z11 = false;
                        }
                        if ((i11 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z11) {
                                end = arrangement.getEnd();
                            } else {
                                end = arrangement.getStart();
                            }
                            i12 &= -57345;
                            horizontal2 = end;
                        }
                        if (i15 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        lazyListState3 = lazyListStateRememberLazyListState;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        modifier3 = modifier;
                        flingBehavior2 = flingBehavior;
                        lazyListState3 = lazyListState2;
                    }
                    PaddingValues paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    boolean z13 = z11;
                    Alignment.Vertical vertical3 = top;
                    Arrangement.Horizontal horizontal4 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                    }
                    LazyRow(modifier3, lazyListState3, paddingValues3, z13, horizontal4, vertical3, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState4 = lazyListState3;
                    paddingValues2 = paddingValues3;
                    z12 = z13;
                    horizontal3 = horizontal4;
                    vertical2 = vertical3;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(modifier4, lazyListState4, paddingValues2, z12, horizontal3, vertical2, flingBehavior3, content, i10, i11));
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i12 |= i22;
                } else {
                    horizontal2 = horizontal;
                }
                i12 |= i22;
            } else {
                horizontal2 = horizontal;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                top = vertical;
            } else {
                top = vertical;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(top)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((29360128 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((23967451 & i12) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                        horizontal2 = end;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                        horizontal2 = end;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues4 = paddingValuesM289PaddingValues0680j_4;
                boolean z14 = z11;
                Alignment.Vertical vertical4 = top;
                Arrangement.Horizontal horizontal5 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                }
                LazyRow(modifier3, lazyListState3, paddingValues4, z14, horizontal5, vertical4, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues4;
                z12 = z14;
                horizontal3 = horizontal5;
                vertical2 = vertical4;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                        horizontal2 = end;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                        horizontal2 = end;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues5 = paddingValuesM289PaddingValues0680j_4;
                boolean z15 = z11;
                Alignment.Vertical vertical5 = top;
                Arrangement.Horizontal horizontal6 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                }
                LazyRow(modifier3, lazyListState3, paddingValues5, z15, horizontal6, vertical5, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues5;
                z12 = z15;
                horizontal3 = horizontal6;
                vertical2 = vertical5;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(modifier4, lazyListState4, paddingValues2, z12, horizontal3, vertical2, flingBehavior3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        paddingValuesM289PaddingValues0680j_4 = paddingValues;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i12 |= i22;
                } else {
                    horizontal2 = horizontal;
                }
                i12 |= i22;
            } else {
                horizontal2 = horizontal;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                top = vertical;
            } else {
                top = vertical;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(top)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((29360128 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((23967451 & i12) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                        horizontal2 = end;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                        horizontal2 = end;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues6 = paddingValuesM289PaddingValues0680j_4;
                boolean z16 = z11;
                Alignment.Vertical vertical6 = top;
                Arrangement.Horizontal horizontal7 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                }
                LazyRow(modifier3, lazyListState3, paddingValues6, z16, horizontal7, vertical6, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues6;
                z12 = z16;
                horizontal3 = horizontal7;
                vertical2 = vertical6;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                        horizontal2 = end;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i11 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i21 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z11) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -57345;
                        horizontal2 = end;
                    }
                    if (i15 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues7 = paddingValuesM289PaddingValues0680j_4;
                boolean z17 = z11;
                Alignment.Vertical vertical7 = top;
                Arrangement.Horizontal horizontal8 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                }
                LazyRow(modifier3, lazyListState3, paddingValues7, z17, horizontal8, vertical7, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues7;
                z12 = z17;
                horizontal3 = horizontal8;
                vertical2 = vertical7;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(modifier4, lazyListState4, paddingValues2, z12, horizontal3, vertical2, flingBehavior3, content, i10, i11));
        }
        i12 |= 3072;
        z11 = z10;
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                horizontal2 = horizontal;
                if (composerStartRestartGroup.changed(horizontal2)) {
                }
                i12 |= i22;
            } else {
                horizontal2 = horizontal;
            }
            i12 |= i22;
        } else {
            horizontal2 = horizontal;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            top = vertical;
        } else {
            top = vertical;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(top)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i18 = 524288;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((29360128 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        }
        if ((23967451 & i12) != 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i21 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z11) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i12 &= -57345;
                    horizontal2 = end;
                }
                if (i15 != 0) {
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i21 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z11) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i12 &= -57345;
                    horizontal2 = end;
                }
                if (i15 != 0) {
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            }
            PaddingValues paddingValues8 = paddingValuesM289PaddingValues0680j_4;
            boolean z18 = z11;
            Alignment.Vertical vertical8 = top;
            Arrangement.Horizontal horizontal9 = horizontal2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
            }
            LazyRow(modifier3, lazyListState3, paddingValues8, z18, horizontal9, vertical8, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState4 = lazyListState3;
            paddingValues2 = paddingValues8;
            z12 = z18;
            horizontal3 = horizontal9;
            vertical2 = vertical8;
            flingBehavior3 = flingBehavior2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i21 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z11) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i12 &= -57345;
                    horizontal2 = end;
                }
                if (i15 != 0) {
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i11 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i21 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z11) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i12 &= -57345;
                    horizontal2 = end;
                }
                if (i15 != 0) {
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            }
            PaddingValues paddingValues9 = paddingValuesM289PaddingValues0680j_4;
            boolean z19 = z11;
            Alignment.Vertical vertical9 = top;
            Arrangement.Horizontal horizontal10 = horizontal2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407929823, i12, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
            }
            LazyRow(modifier3, lazyListState3, paddingValues9, z19, horizontal10, vertical9, flingBehavior2, true, content, composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (234881024 & (i12 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState4 = lazyListState3;
            paddingValues2 = paddingValues9;
            z12 = z19;
            horizontal3 = horizontal10;
            vertical2 = vertical9;
            flingBehavior3 = flingBehavior2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(modifier4, lazyListState4, paddingValues2, z12, horizontal3, vertical2, flingBehavior3, content, i10, i11));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] items, Function2 function2, Function5 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new C05306(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C05328(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] items, Function1 function1, Function4 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new AnonymousClass6(function1, items) : null, new AnonymousClass7(AnonymousClass5.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(itemContent, items)));
    }
}
