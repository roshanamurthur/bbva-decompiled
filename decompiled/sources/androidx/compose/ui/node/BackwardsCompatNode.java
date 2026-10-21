package androidx.compose.ui.node;

import androidx.collection.k;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.BackwardsCompatLocalMap;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import i1.n;
import i1.p;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010W\u001a\u00020O¢\u0006\u0004\bv\u0010VJ\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u000f\u0010\u0016\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0017\u001a\u00020\u0010J)\u0010 \u001a\u00020\u001d*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010%\u001a\u00020#*\u00020!2\u0006\u0010\u001a\u001a\u00020\"2\u0006\u0010$\u001a\u00020#H\u0016J\u001c\u0010'\u001a\u00020#*\u00020!2\u0006\u0010\u001a\u001a\u00020\"2\u0006\u0010&\u001a\u00020#H\u0016J\u001c\u0010(\u001a\u00020#*\u00020!2\u0006\u0010\u001a\u001a\u00020\"2\u0006\u0010$\u001a\u00020#H\u0016J\u001c\u0010)\u001a\u00020#*\u00020!2\u0006\u0010\u001a\u001a\u00020\"2\u0006\u0010&\u001a\u00020#H\u0016J\f\u0010+\u001a\u00020\u0010*\u00020*H\u0016J\f\u0010-\u001a\u00020\u0010*\u00020,H\u0016J-\u00106\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\b\u00107\u001a\u00020\u0010H\u0016J\b\u00109\u001a\u000208H\u0016J\b\u0010:\u001a\u000208H\u0016J\u0018\u0010>\u001a\u0004\u0018\u00010<*\u00020;2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010A\u001a\u00020\u00102\u0006\u0010@\u001a\u00020?H\u0016J\u001d\u0010E\u001a\u00020\u00102\u0006\u0010B\u001a\u000202H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010F\u001a\u00020\u00102\u0006\u0010@\u001a\u00020?H\u0016J\u0010\u0010I\u001a\u00020\u00102\u0006\u0010H\u001a\u00020GH\u0016J\u0010\u0010L\u001a\u00020\u00102\u0006\u0010K\u001a\u00020JH\u0016J\b\u0010N\u001a\u00020MH\u0016R*\u0010W\u001a\u00020O2\u0006\u0010P\u001a\u00020O8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR:\u0010a\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030Y0Xj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030Y`Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u001d\u0010B\u001a\u00020i8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010o\u001a\u00020l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR$\u0010s\u001a\u00028\u0000\"\u0004\b\u0000\u0010p*\b\u0012\u0004\u0012\u00028\u00000Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010t\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006w"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "Landroidx/compose/ui/Modifier$Node;", "", "onAttach", "onDetach", "onMeasureResultChanged", "onDrawCacheReadsChanged$ui_release", "()V", "onDrawCacheReadsChanged", "updateModifierLocalConsumer", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "", "sharePointerInputWithSiblings", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "onPlaced", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "applyFocusProperties", "", "toString", "Landroidx/compose/ui/Modifier$Element;", "value", "H0", "Landroidx/compose/ui/Modifier$Element;", "getElement", "()Landroidx/compose/ui/Modifier$Element;", "setElement", "(Landroidx/compose/ui/Modifier$Element;)V", "element", "Ljava/util/HashSet;", "Landroidx/compose/ui/modifier/ModifierLocal;", "Lkotlin/collections/HashSet;", "K0", "Ljava/util/HashSet;", "getReadValues", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "readValues", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", ExifInterface.GPS_DIRECTION_TRUE, "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "current", "isValidOwnerScope", "()Z", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,457:1\n80#2:458\n76#2:460\n80#2:464\n74#2:466\n72#2:468\n84#2:470\n86#2:472\n78#2:476\n76#2:478\n84#2:480\n80#2:481\n261#3:459\n261#3:461\n261#3:465\n261#3:467\n261#3:469\n261#3:471\n261#3:473\n261#3:477\n261#3:479\n261#3:503\n735#4,2:462\n728#4,2:474\n230#5,5:482\n58#5:487\n59#5,8:489\n383#5,6:497\n393#5,2:504\n395#5,8:509\n403#5,9:520\n412#5,8:532\n68#5,7:540\n1#6:488\n234#7,3:506\n237#7,3:529\n1182#8:517\n1161#8,2:518\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n*L\n116#1:458\n126#1:460\n137#1:464\n145#1:466\n153#1:468\n169#1:470\n194#1:472\n207#1:476\n212#1:478\n222#1:480\n258#1:481\n116#1:459\n126#1:461\n137#1:465\n145#1:467\n153#1:469\n169#1:471\n194#1:473\n207#1:477\n212#1:479\n258#1:503\n130#1:462,2\n205#1:474,2\n258#1:482,5\n258#1:487\n258#1:489,8\n258#1:497,6\n258#1:504,2\n258#1:509,8\n258#1:520,9\n258#1:532,8\n258#1:540,7\n258#1:488\n258#1:506,3\n258#1:529,3\n258#1:517\n258#1:518,2\n*E\n"})
public final class BackwardsCompatNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode, PointerInputModifierNode, ModifierLocalModifierNode, ModifierLocalReadScope, ParentDataModifierNode, LayoutAwareModifierNode, GlobalPositionAwareModifierNode, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, OwnerScope, BuildDrawCacheParams {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public Modifier.Element element;
    public boolean I0;

    @Nullable
    public BackwardsCompatLocalMap J0;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @NotNull
    public HashSet<ModifierLocal<?>> readValues;

    @Nullable
    public LayoutCoordinates L0;

    /* JADX INFO: compiled from: BackwardsCompatNode.kt */
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            BackwardsCompatNode.this.updateModifierLocalConsumer();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BackwardsCompatNode.kt */
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            BackwardsCompatNode backwardsCompatNode = BackwardsCompatNode.this;
            Modifier.Element element = backwardsCompatNode.getElement();
            Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((ModifierLocalConsumer) element).onModifierLocalsUpdated(backwardsCompatNode);
            return Unit.INSTANCE;
        }
    }

    public BackwardsCompatNode(@NotNull Modifier.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(element));
        this.element = element;
        this.I0 = true;
        this.readValues = new HashSet<>();
    }

    public final void a(boolean z10) {
        if (!getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Element element = this.element;
        if ((NodeKind.m3725constructorimpl(32) & getKindSet()) != 0) {
            if (element instanceof ModifierLocalConsumer) {
                sideEffect(new a());
            }
            if (element instanceof ModifierLocalProvider) {
                ModifierLocalProvider<?> modifierLocalProvider = (ModifierLocalProvider) element;
                BackwardsCompatLocalMap backwardsCompatLocalMap = this.J0;
                if (backwardsCompatLocalMap == null || !backwardsCompatLocalMap.contains$ui_release(modifierLocalProvider.getKey())) {
                    this.J0 = new BackwardsCompatLocalMap(modifierLocalProvider);
                    if (BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                        DelegatableNodeKt.requireOwner(this).getModifierLocalManager().insertedProvider(this, modifierLocalProvider.getKey());
                    }
                } else {
                    backwardsCompatLocalMap.setElement(modifierLocalProvider);
                    DelegatableNodeKt.requireOwner(this).getModifierLocalManager().updatedProvider(this, modifierLocalProvider.getKey());
                }
            }
        }
        if ((NodeKind.m3725constructorimpl(4) & getKindSet()) != 0) {
            if (element instanceof DrawCacheModifier) {
                this.I0 = true;
            }
            if (!z10) {
                LayoutModifierNodeKt.invalidateLayer(this);
            }
        }
        if ((NodeKind.m3725constructorimpl(2) & getKindSet()) != 0) {
            if (BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                NodeCoordinator coordinator = getCoordinator();
                Intrinsics.checkNotNull(coordinator);
                ((LayoutModifierNodeCoordinator) coordinator).setLayoutModifierNode$ui_release(this);
                coordinator.onLayoutModifierNodeChanged();
            }
            if (!z10) {
                LayoutModifierNodeKt.invalidateLayer(this);
                DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
        }
        if (element instanceof RemeasurementModifier) {
            ((RemeasurementModifier) element).onRemeasurementAvailable(DelegatableNodeKt.requireLayoutNode(this));
        }
        if ((NodeKind.m3725constructorimpl(128) & getKindSet()) != 0) {
            if ((element instanceof OnRemeasuredModifier) && BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
            if (element instanceof OnPlacedModifier) {
                this.L0 = null;
                if (BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                    DelegatableNodeKt.requireOwner(this).registerOnLayoutCompletedListener(new Owner.OnLayoutCompletedListener() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$2
                        @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
                        public void onLayoutComplete() {
                            BackwardsCompatNode backwardsCompatNode = this.f16741p0;
                            if (backwardsCompatNode.L0 == null) {
                                backwardsCompatNode.onPlaced(DelegatableNodeKt.m3653requireCoordinator64DMado(backwardsCompatNode, NodeKind.m3725constructorimpl(128)));
                            }
                        }
                    });
                }
            }
        }
        if ((NodeKind.m3725constructorimpl(256) & getKindSet()) != 0 && (element instanceof OnGloballyPositionedModifier) && BackwardsCompatNodeKt.access$isChainUpdate(this)) {
            DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
        }
        if (element instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().add(this);
        }
        if ((NodeKind.m3725constructorimpl(16) & getKindSet()) != 0 && (element instanceof PointerInputModifier)) {
            ((PointerInputModifier) element).getPointerInputFilter().setLayoutCoordinates$ui_release(getCoordinator());
        }
        if ((NodeKind.m3725constructorimpl(8) & getKindSet()) != 0) {
            DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        }
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@NotNull FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        Modifier.Element element = this.element;
        if (!(element instanceof FocusOrderModifier)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        new i1.f((FocusOrderModifier) element).invoke(focusProperties);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        ((SemanticsConfiguration) semanticsPropertyReceiver).collapsePeer$ui_release(((SemanticsModifier) element).getSemanticsConfiguration());
    }

    public final void b() {
        if (!getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Element element = this.element;
        if ((NodeKind.m3725constructorimpl(32) & getKindSet()) != 0) {
            if (element instanceof ModifierLocalProvider) {
                DelegatableNodeKt.requireOwner(this).getModifierLocalManager().removedProvider(this, ((ModifierLocalProvider) element).getKey());
            }
            if (element instanceof ModifierLocalConsumer) {
                ((ModifierLocalConsumer) element).onModifierLocalsUpdated(BackwardsCompatNodeKt.f16742a);
            }
        }
        if ((NodeKind.m3725constructorimpl(8) & getKindSet()) != 0) {
            DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        }
        if (element instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().remove(this);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        DrawModifier drawModifier = (DrawModifier) element;
        if (this.I0 && (element instanceof DrawCacheModifier)) {
            Modifier.Element element2 = this.element;
            if (element2 instanceof DrawCacheModifier) {
                DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.f16743b, new i1.a(element2, this));
            }
            this.I0 = false;
        }
        drawModifier.draw(contentDrawScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public <T> T getCurrent(@NotNull ModifierLocal<T> modifierLocal) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(modifierLocal, "<this>");
        this.readValues.add(modifierLocal);
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(32);
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (layoutNodeRequireLayoutNode != null) {
            if ((k.a(layoutNodeRequireLayoutNode) & iM3725constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM3725constructorimpl) != 0) {
                        ?? Access$pop = parent;
                        ?? mutableVector = 0;
                        while (Access$pop != 0) {
                            if (Access$pop instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) Access$pop;
                                if (modifierLocalModifierNode.getProvidedValues().contains$ui_release(modifierLocal)) {
                                    return (T) modifierLocalModifierNode.getProvidedValues().get$ui_release(modifierLocal);
                                }
                            } else if ((Access$pop.getKindSet() & iM3725constructorimpl) != 0 && (Access$pop instanceof DelegatingNode)) {
                                Modifier.Node delegate = ((DelegatingNode) Access$pop).getDelegate();
                                int i10 = 0;
                                Access$pop = Access$pop;
                                mutableVector = mutableVector;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            mutableVector = mutableVector;
                                            Access$pop = delegate;
                                        } else {
                                            if (mutableVector == 0) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (Access$pop != 0) {
                                                mutableVector.add(Access$pop);
                                                Access$pop = 0;
                                            }
                                            mutableVector.add(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    Access$pop = Access$pop;
                                    mutableVector = mutableVector;
                                }
                                if (i10 == 1) {
                                }
                            }
                            Access$pop = DelegatableNodeKt.access$pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
        }
        return modifierLocal.getDefaultFactory$ui_release().invoke();
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @NotNull
    public Density getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity();
    }

    @NotNull
    public final Modifier.Element getElement() {
        return this.element;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutNode(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @NotNull
    public ModifierLocalMap getProvidedValues() {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this.J0;
        return backwardsCompatLocalMap != null ? backwardsCompatLocalMap : ModifierLocalModifierNodeKt.modifierLocalMapOf();
    }

    @NotNull
    public final HashSet<ModifierLocal<?>> getReadValues() {
        return this.readValues;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: getShouldClearDescendantSemantics */
    public final /* synthetic */ boolean getIsClearingSemantics() {
        return p.a(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return p.b(this);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public long mo2199getSizeNHjbRc() {
        return IntSizeKt.m4559toSizeozmzZPI(DelegatableNodeKt.m3653requireCoordinator64DMado(this, NodeKind.m3725constructorimpl(128)).mo3581getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public boolean interceptOutOfBoundsChildEvents() {
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return getIsAttached();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).maxIntrinsicHeight(intrinsicMeasureScope, measurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).maxIntrinsicWidth(intrinsicMeasureScope, measurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).mo47measure3p2s80s(measure, measurable, j10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).minIntrinsicHeight(intrinsicMeasureScope, measurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).minIntrinsicWidth(intrinsicMeasureScope, measurable, i10);
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @Nullable
    public Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((ParentDataModifier) element).modifyParentData(density, obj);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        a(true);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getPointerInputFilter().onCancel();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ void onDensityChange() {
        n.b(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        b();
    }

    public final void onDrawCacheReadsChanged$ui_release() {
        this.I0 = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@NotNull FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        Modifier.Element element = this.element;
        if (!(element instanceof FocusEventModifier)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ((FocusEventModifier) element).onFocusEvent(focusState);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((OnGloballyPositionedModifier) element).onGloballyPositioned(coordinates);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        this.I0 = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.L0 = coordinates;
        Modifier.Element element = this.element;
        if (element instanceof OnPlacedModifier) {
            ((OnPlacedModifier) element).onPlaced(coordinates);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo115onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getPointerInputFilter().mo3497onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo457onRemeasuredozmzZPI(long size) {
        Modifier.Element element = this.element;
        if (element instanceof OnRemeasuredModifier) {
            ((OnRemeasuredModifier) element).mo176onRemeasuredozmzZPI(size);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ void onViewConfigurationChange() {
        n.c(this);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        h1.c.c(this, modifierLocal, obj);
    }

    public final void setElement(@NotNull Modifier.Element value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (getIsAttached()) {
            b();
        }
        this.element = value;
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(value));
        if (getIsAttached()) {
            a(false);
        }
    }

    public final void setReadValues(@NotNull HashSet<ModifierLocal<?>> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
        this.readValues = hashSet;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public boolean sharePointerInputWithSiblings() {
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).getPointerInputFilter().getShareWithSiblings();
    }

    @NotNull
    public String toString() {
        return this.element.toString();
    }

    public final void updateModifierLocalConsumer() {
        if (getIsAttached()) {
            this.readValues.clear();
            DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.f16744c, new b());
        }
    }
}
