package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a6\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/TransformableState;", "state", "", "lockRotationOnZoomPan", "enabled", "transformable", "Lkotlin/Function0;", "canPan", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,220:1\n135#2:221\n101#3,2:222\n33#3,6:224\n103#3:230\n33#3,6:231\n101#3,2:237\n33#3,6:239\n103#3:245\n101#3,2:246\n33#3,6:248\n103#3:254\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n139#1:221\n172#1:222,2\n172#1:224,6\n172#1:230\n206#1:231,6\n217#1:237,2\n217#1:239,6\n217#1:245\n218#1:246,2\n218#1:248,6\n218#1:254\n*E\n"})
public final class TransformableKt {

    /* JADX INFO: compiled from: Transformable.kt */
    public static final class a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f3956p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Transformable.kt */
    @SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$transformable$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,220:1\n25#2:221\n25#2:228\n1097#3,6:222\n1097#3,6:229\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$transformable$3\n*L\n101#1:221\n122#1:228\n101#1:222,6\n122#1:229,6\n*E\n"})
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f3957p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Boolean> f3958q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f3959r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TransformableState f3960s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TransformableState transformableState, Function0 function0, boolean z10, boolean z11) {
            super(3);
            this.f3957p0 = z10;
            this.f3958q0 = function0;
            this.f3959r0 = z11;
            this.f3960s0 = transformableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, 298661433);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(298661433, iA, -1, "androidx.compose.foundation.gestures.transformable.<anonymous> (Transformable.kt:97)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(this.f3957p0), composer2, 0);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.f3958q0, composer2, 0);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Channel channel = (Channel) objRememberedValue;
            composer2.startReplaceableGroup(-2015615917);
            boolean z10 = this.f3959r0;
            if (z10) {
                TransformableState transformableState = this.f3960s0;
                EffectsKt.LaunchedEffect(transformableState, new d(channel, transformableState, null), composer2, 64);
            }
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new e(stateRememberUpdatedState, channel, stateRememberUpdatedState2, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Function2 function2 = (Function2) objRememberedValue2;
            Modifier modifierPointerInput = Modifier.INSTANCE;
            if (z10) {
                modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierPointerInput, channel, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierPointerInput;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0117  */
    /* JADX WARN: Code duplicated, block: B:31:0x0125 A[LOOP:2: B:27:0x0115->B:31:0x0125, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0268 -> B:83:0x0274). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object access$detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope r29, androidx.compose.runtime.State r30, kotlinx.coroutines.channels.Channel r31, androidx.compose.runtime.State r32, kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.access$detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, kotlinx.coroutines.channels.Channel, androidx.compose.runtime.State, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final Modifier transformable(@NotNull Modifier modifier, @NotNull TransformableState state, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return transformable(modifier, state, a.f3956p0, z10, z11);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return transformable(modifier, transformableState, z10, z11);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier transformable(@NotNull Modifier modifier, @NotNull final TransformableState state, @NotNull final Function0<Boolean> canPan, final boolean z10, final boolean z11) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canPan, "canPan");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "transformable").set("state", state);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("canPan", canPan);
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z11, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "enabled", inspectorInfo).set("lockRotationOnZoomPan", Boolean.valueOf(z10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new b(state, canPan, z10, z11));
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, Function0 function0, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return transformable(modifier, transformableState, function0, z10, z11);
    }
}
