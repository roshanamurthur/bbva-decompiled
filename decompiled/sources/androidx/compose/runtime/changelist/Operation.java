package androidx.compose.runtime.changelist;

import androidx.collection.g;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:$!\"#$%&'()*+,-./0123456789:;<=>?@ABCDJ(\u0010\n\u001a\u00020\t*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\b\u0010\u0014\u001a\u00020\rH\u0016R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010 \u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\"EFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdef\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"Landroidx/compose/runtime/changelist/Operation;", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "objectParamName", "toString", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getInts", "()I", "ints", "b", "getObjects", "objects", "getName", "()Ljava/lang/String;", "name", "AdvanceSlotsBy", "AppendValue", "ApplyChangeList", "CopyNodesToNewAnchorLocation", "CopySlotTableToAnchorLocation", "DeactivateCurrentGroup", "DetermineMovableContentNodeIndex", "Downs", "EndCompositionScope", "EndCurrentGroup", "EndMovableContentPlacement", "EnsureGroupStarted", "EnsureRootGroupStarted", "InsertNodeFixup", "InsertSlots", "InsertSlotsWithFixups", "IntParameter", "MoveCurrentGroup", "MoveNode", "ObjectParameter", "PostInsertNodeFixup", "ReleaseMovableGroupAtCurrent", "Remember", "RemoveCurrentGroup", "RemoveNode", "ResetSlots", "SideEffect", "SkipToEndOfCurrentGroup", "TestOperation", "TrimParentValues", "UpdateAnchoredValue", "UpdateAuxData", "UpdateNode", "UpdateValue", "Ups", "UseCurrentNode", "Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation$AppendValue;", "Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation$TrimParentValues;", "Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;", "Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "runtime_release"}, k = 1, mv = {1, 8, 0})
public abstract class Operation {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int ints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int objects;

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\r*\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Distance", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getDistance-jn0FJLE", "()I", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n1#1,992:1\n118#1:993\n118#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n121#1:993\n130#1:994\n*E\n"})
    public static final class AdvanceSlotsBy extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final AdvanceSlotsBy INSTANCE = new AdvanceSlotsBy();

        public AdvanceSlotsBy() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.advanceBy(operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getDistance-jn0FJLE, reason: not valid java name */
        public final int m2088getDistancejn0FJLE() {
            return IntParameter.m2114constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo2086intParamNamew8GmfQM(int parameter) {
            return IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(0)) ? "distance" : super.mo2086intParamNamew8GmfQM(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$AppendValue;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Value", "", "getValue-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n*L\n1#1,992:1\n171#1:993\n172#1:994\n171#1:995\n172#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n*L\n175#1:993\n176#1:994\n185#1:995\n186#1:996\n*E\n"})
    public static final class AppendValue extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final AppendValue INSTANCE = new AppendValue();

        public AppendValue() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Anchor anchor = (Anchor) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0));
            Object objMo2151getObject31yXWZQ = operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(1));
            if (objMo2151getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering(((RememberObserverHolder) objMo2151getObject31yXWZQ).getWrapped());
            }
            slotWriter.appendSlot(anchor, objMo2151getObject31yXWZQ);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2089getAnchorHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m2090getValueHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0))) {
                return "anchor";
            }
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(1)) ? "value" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Changes", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/changelist/ChangeList;", "getChanges-HpuvwBQ", "()I", "EffectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,992:1\n790#1:993\n791#1:994\n791#1:995\n790#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n794#1:993\n795#1:994\n804#1:995\n806#1:996\n*E\n"})
    public static final class ApplyChangeList extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final ApplyChangeList INSTANCE = new ApplyChangeList();

        public ApplyChangeList() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            IntRef intRef = (IntRef) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(1));
            int element = intRef != null ? intRef.getElement() : 0;
            ChangeList changeList = (ChangeList) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0));
            if (element > 0) {
                applier = new OffsetApplier(applier, element);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotWriter, rememberManager);
        }

        /* JADX INFO: renamed from: getChanges-HpuvwBQ, reason: not valid java name */
        public final int m2091getChangesHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        /* JADX INFO: renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m2092getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0))) {
                return "changes";
            }
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(1)) ? "effectiveNodeIndex" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "EffectiveNodeIndex", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "()I", "Nodes", "", "", "getNodes-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,992:1\n676#1:993\n677#1:994\n676#1:995\n677#1:996\n64#2,6:997\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n*L\n680#1:993\n681#1:994\n690#1:995\n691#1:996\n693#1:997,6\n*E\n"})
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();

        public CopyNodesToNewAnchorLocation() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            int element = ((IntRef) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0))).getElement();
            List list = (List) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(1));
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i11 = element + i10;
                applier.insertBottomUp(i11, obj);
                applier.insertTopDown(i11, obj);
            }
        }

        /* JADX INFO: renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m2093getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        /* JADX INFO: renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m2094getNodesHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0))) {
                return "effectiveNodeIndex";
            }
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(1)) ? "nodes" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "From", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/MovableContentStateReference;", "getFrom-HpuvwBQ", "()I", "ParentCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "ResolvedState", "Landroidx/compose/runtime/MovableContentState;", "getResolvedState-HpuvwBQ", "To", "getTo-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n1#1,992:1\n703#1:993\n704#1:994\n705#1:995\n706#1:996\n705#1:997\n706#1:998\n704#1:999\n703#1:1000\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n709#1:993\n710#1:994\n711#1:995\n712#1:996\n721#1:997\n722#1:998\n724#1:999\n726#1:1000\n*E\n"})
    public static final class CopySlotTableToAnchorLocation extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final CopySlotTableToAnchorLocation INSTANCE = new CopySlotTableToAnchorLocation();

        public CopySlotTableToAnchorLocation() {
            super(0, 4, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(2));
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(3));
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(1));
            MovableContentState movableContentStateMovableContentStateResolve$runtime_release = (MovableContentState) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0));
            if (movableContentStateMovableContentStateResolve$runtime_release == null && (movableContentStateMovableContentStateResolve$runtime_release = compositionContext.movableContentStateResolve$runtime_release(movableContentStateReference)) == null) {
                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            List<Anchor> listMoveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, movableContentStateMovableContentStateResolve$runtime_release.getSlotTable(), 2);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.INSTANCE;
            ControlledComposition composition = movableContentStateReference2.getComposition();
            Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.adoptAnchoredScopes$runtime_release(slotWriter, listMoveIntoGroupFrom, (RecomposeScopeOwner) composition);
        }

        /* JADX INFO: renamed from: getFrom-HpuvwBQ, reason: not valid java name */
        public final int m2095getFromHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(2);
        }

        /* JADX INFO: renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m2096getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(1);
        }

        /* JADX INFO: renamed from: getResolvedState-HpuvwBQ, reason: not valid java name */
        public final int m2097getResolvedStateHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        /* JADX INFO: renamed from: getTo-HpuvwBQ, reason: not valid java name */
        public final int m2098getToHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0))) {
                return "resolvedState";
            }
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(1))) {
                return "resolvedCompositionContext";
            }
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(2))) {
                return "from";
            }
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(3)) ? TypedValues.TransitionType.S_TO : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DeactivateCurrentGroup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final DeactivateCurrentGroup INSTANCE = new DeactivateCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        public DeactivateCurrentGroup() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            ComposerKt.deactivateCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "EffectiveNodeIndexOut", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndexOut-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n1#1,992:1\n648#1:993\n649#1:994\n648#1:995\n649#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n652#1:993\n653#1:994\n663#1:995\n667#1:996\n*E\n"})
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();

        public DetermineMovableContentNodeIndex() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            IntRef intRef = (IntRef) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0));
            Anchor anchor = (Anchor) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(1));
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            intRef.setElement(OperationKt.access$positionToInsert(slotWriter, anchor, applier));
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2099getAnchorHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(1);
        }

        /* JADX INFO: renamed from: getEffectiveNodeIndexOut-HpuvwBQ, reason: not valid java name */
        public final int m2100getEffectiveNodeIndexOutHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0))) {
                return "effectiveNodeIndexOut";
            }
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(1)) ? "anchor" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R&\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Nodes", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "", "getNodes-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n1#1,992:1\n96#1:993\n96#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n99#1:993\n110#1:994\n*E\n"})
    public static final class Downs extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final Downs INSTANCE = new Downs();

        /* JADX WARN: Illegal instructions before constructor call */
        public Downs() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0))) {
                applier.down(obj);
            }
        }

        /* JADX INFO: renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m2101getNodesHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0)) ? "nodes" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u0007*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R*\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Action", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "", "getAction-HpuvwBQ", "()I", "Composition", "getComposition-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n1#1,992:1\n403#1:993\n404#1:994\n403#1:995\n404#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n407#1:993\n408#1:994\n417#1:995\n418#1:996\n*E\n"})
    public static final class EndCompositionScope extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final EndCompositionScope INSTANCE = new EndCompositionScope();

        public EndCompositionScope() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            ((Function1) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0))).invoke((Composition) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(1)));
        }

        /* JADX INFO: renamed from: getAction-HpuvwBQ, reason: not valid java name */
        public final int m2102getActionHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        /* JADX INFO: renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m2103getCompositionHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0))) {
                return "anchor";
            }
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(1)) ? "composition" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EndCurrentGroup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final EndCurrentGroup INSTANCE = new EndCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        public EndCurrentGroup() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.endGroup();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EndMovableContentPlacement extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();

        /* JADX WARN: Illegal instructions before constructor call */
        public EndMovableContentPlacement() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            OperationKt.access$positionToParentOf(slotWriter, applier, 0);
            slotWriter.endGroup();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n1#1,992:1\n339#1:993\n339#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n342#1:993\n351#1:994\n*E\n"})
    public static final class EnsureGroupStarted extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final EnsureGroupStarted INSTANCE = new EnsureGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        public EnsureGroupStarted() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.ensureStarted((Anchor) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2104getAnchorHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0)) ? "anchor" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EnsureRootGroupStarted extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final EnsureRootGroupStarted INSTANCE = new EnsureRootGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        public EnsureRootGroupStarted() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.ensureStarted(0);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J(\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R&\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0018\u0010\f\u001a\u00020\r8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Factory", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function0;", "", "getFactory-HpuvwBQ", "()I", "GroupAnchor", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "InsertIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getInsertIndex-jn0FJLE", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n1#1,992:1\n566#1:993\n565#1:994\n567#1:995\n565#1:996\n567#1:997\n566#1:998\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n570#1:993\n575#1:994\n576#1:995\n585#1:996\n586#1:997\n587#1:998\n*E\n"})
    public static final class InsertNodeFixup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();

        public InsertNodeFixup() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Object objInvoke = ((Function0) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0))).invoke();
            Anchor anchor = (Anchor) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(1));
            int iMo2150getIntw8GmfQM = operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(0));
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter.updateNode(anchor, objInvoke);
            applier.insertTopDown(iMo2150getIntw8GmfQM, objInvoke);
            applier.down(objInvoke);
        }

        /* JADX INFO: renamed from: getFactory-HpuvwBQ, reason: not valid java name */
        public final int m2105getFactoryHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        /* JADX INFO: renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2106getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(1);
        }

        /* JADX INFO: renamed from: getInsertIndex-jn0FJLE, reason: not valid java name */
        public final int m2107getInsertIndexjn0FJLE() {
            return IntParameter.m2114constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo2086intParamNamew8GmfQM(int parameter) {
            return IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(0)) ? "insertIndex" : super.mo2086intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0))) {
                return "factory";
            }
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(1)) ? "groupAnchor" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "FromSlotTable", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n1#1,992:1\n503#1:993\n504#1:994\n504#1:995\n503#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n507#1:993\n508#1:994\n517#1:995\n518#1:996\n*E\n"})
    public static final class InsertSlots extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final InsertSlots INSTANCE = new InsertSlots();

        public InsertSlots() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0));
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2108getAnchorHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        /* JADX INFO: renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m2109getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0))) {
                return "anchor";
            }
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(1)) ? "from" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Fixups", "Landroidx/compose/runtime/changelist/FixupList;", "getFixups-HpuvwBQ", "FromSlotTable", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,992:1\n531#1:993\n532#1:994\n533#1:995\n532#1:996\n531#1:997\n533#1:998\n174#2,5:999\n180#2,3:1005\n1#3:1004\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n*L\n536#1:993\n537#1:994\n538#1:995\n547#1:996\n548#1:997\n549#1:998\n551#1:999,5\n551#1:1005,3\n551#1:1004\n*E\n"})
    public static final class InsertSlotsWithFixups extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();

        public InsertSlotsWithFixups() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0));
            FixupList fixupList = (FixupList) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(2));
            SlotWriter slotWriterOpenWriter = slotTable.openWriter();
            try {
                fixupList.executeAndFlushAllPendingFixups(applier, slotWriterOpenWriter, rememberManager);
                Unit unit = Unit.INSTANCE;
                slotWriterOpenWriter.close(true);
                slotWriter.beginInsert();
                slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
                slotWriter.endInsert();
            } catch (Throwable th2) {
                slotWriterOpenWriter.close(false);
                throw th2;
            }
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2110getAnchorHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        /* JADX INFO: renamed from: getFixups-HpuvwBQ, reason: not valid java name */
        public final int m2111getFixupsHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(2);
        }

        /* JADX INFO: renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m2112getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0))) {
                return "anchor";
            }
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(1))) {
                return "from";
            }
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(2)) ? "fixups" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\r*\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Offset", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getOffset-jn0FJLE", "()I", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n1#1,992:1\n366#1:993\n366#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n369#1:993\n378#1:994\n*E\n"})
    public static final class MoveCurrentGroup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final MoveCurrentGroup INSTANCE = new MoveCurrentGroup();

        public MoveCurrentGroup() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.moveGroup(operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getOffset-jn0FJLE, reason: not valid java name */
        public final int m2120getOffsetjn0FJLE() {
            return IntParameter.m2114constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo2086intParamNamew8GmfQM(int parameter) {
            return IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(0)) ? TypedValues.CycleType.S_WAVE_OFFSET : super.mo2086intParamNamew8GmfQM(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "From", "getFrom-jn0FJLE", "To", "getTo-jn0FJLE", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n1#1,992:1\n478#1:993\n479#1:994\n480#1:995\n478#1:996\n479#1:997\n480#1:998\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n483#1:993\n484#1:994\n485#1:995\n495#1:996\n496#1:997\n497#1:998\n*E\n"})
    public static final class MoveNode extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final MoveNode INSTANCE = new MoveNode();

        public MoveNode() {
            super(3, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            applier.move(operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(0)), operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(1)), operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(2)));
        }

        /* JADX INFO: renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m2121getCountjn0FJLE() {
            return IntParameter.m2114constructorimpl(2);
        }

        /* JADX INFO: renamed from: getFrom-jn0FJLE, reason: not valid java name */
        public final int m2122getFromjn0FJLE() {
            return IntParameter.m2114constructorimpl(0);
        }

        /* JADX INFO: renamed from: getTo-jn0FJLE, reason: not valid java name */
        public final int m2123getTojn0FJLE() {
            return IntParameter.m2114constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo2086intParamNamew8GmfQM(int parameter) {
            if (IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(0))) {
                return "from";
            }
            if (IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(1))) {
                return TypedValues.TransitionType.S_TO;
            }
            return IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(2)) ? "count" : super.mo2086intParamNamew8GmfQM(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ(\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\t8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "GroupAnchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "()I", "InsertIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getInsertIndex-jn0FJLE", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n1#1,992:1\n597#1:993\n598#1:994\n598#1:995\n597#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n601#1:993\n606#1:994\n615#1:995\n616#1:996\n*E\n"})
    public static final class PostInsertNodeFixup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();

        public PostInsertNodeFixup() {
            super(1, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Anchor anchor = (Anchor) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0));
            int iMo2150getIntw8GmfQM = operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(0));
            applier.up();
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier.insertBottomUp(iMo2150getIntw8GmfQM, slotWriter.node(anchor));
        }

        /* JADX INFO: renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2131getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        /* JADX INFO: renamed from: getInsertIndex-jn0FJLE, reason: not valid java name */
        public final int m2132getInsertIndexjn0FJLE() {
            return IntParameter.m2114constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo2086intParamNamew8GmfQM(int parameter) {
            return IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(0)) ? "insertIndex" : super.mo2086intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0)) ? "groupAnchor" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Composition", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/ControlledComposition;", "getComposition-HpuvwBQ", "()I", "ParentCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "Reference", "Landroidx/compose/runtime/MovableContentStateReference;", "getReference-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n1#1,992:1\n764#1:993\n765#1:994\n766#1:995\n764#1:996\n765#1:997\n766#1:998\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n769#1:993\n770#1:994\n771#1:995\n781#1:996\n782#1:997\n783#1:998\n*E\n"})
    public static final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final ReleaseMovableGroupAtCurrent INSTANCE = new ReleaseMovableGroupAtCurrent();

        public ReleaseMovableGroupAtCurrent() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            OperationKt.access$releaseMovableGroupAtCurrent((ControlledComposition) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0)), (CompositionContext) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(1)), (MovableContentStateReference) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(2)), slotWriter);
        }

        /* JADX INFO: renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m2133getCompositionHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        /* JADX INFO: renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m2134getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(1);
        }

        /* JADX INFO: renamed from: getReference-HpuvwBQ, reason: not valid java name */
        public final int m2135getReferenceHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0))) {
                return "composition";
            }
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(1))) {
                return "parentCompositionContext";
            }
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(2)) ? "reference" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Value", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/RememberObserver;", "getValue-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n1#1,992:1\n154#1:993\n154#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n157#1:993\n166#1:994\n*E\n"})
    public static final class Remember extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final Remember INSTANCE = new Remember();

        /* JADX WARN: Illegal instructions before constructor call */
        public Remember() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            rememberManager.remembering((RememberObserver) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m2136getValueHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0)) ? "value" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoveCurrentGroup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final RemoveCurrentGroup INSTANCE = new RemoveCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        public RemoveCurrentGroup() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "RemoveIndex", "getRemoveIndex-jn0FJLE", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n1#1,992:1\n456#1:993\n457#1:994\n456#1:995\n457#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n460#1:993\n461#1:994\n471#1:995\n472#1:996\n*E\n"})
    public static final class RemoveNode extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final RemoveNode INSTANCE = new RemoveNode();

        /* JADX WARN: Illegal instructions before constructor call */
        public RemoveNode() {
            int i10 = 2;
            super(i10, 0, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            applier.remove(operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(0)), operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(1)));
        }

        /* JADX INFO: renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m2137getCountjn0FJLE() {
            return IntParameter.m2114constructorimpl(1);
        }

        /* JADX INFO: renamed from: getRemoveIndex-jn0FJLE, reason: not valid java name */
        public final int m2138getRemoveIndexjn0FJLE() {
            return IntParameter.m2114constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo2086intParamNamew8GmfQM(int parameter) {
            if (IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(0))) {
                return "removeIndex";
            }
            return IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(1)) ? "count" : super.mo2086intParamNamew8GmfQM(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ResetSlots extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final ResetSlots INSTANCE = new ResetSlots();

        /* JADX WARN: Illegal instructions before constructor call */
        public ResetSlots() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.reset();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u0006*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R$\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Effect", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function0;", "", "getEffect-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n1#1,992:1\n137#1:993\n137#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n140#1:993\n149#1:994\n*E\n"})
    public static final class SideEffect extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final SideEffect INSTANCE = new SideEffect();

        /* JADX WARN: Illegal instructions before constructor call */
        public SideEffect() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            rememberManager.sideEffect((Function0) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getEffect-HpuvwBQ, reason: not valid java name */
        public final int m2139getEffectHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0)) ? "effect" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SkipToEndOfCurrentGroup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final SkipToEndOfCurrentGroup INSTANCE = new SkipToEndOfCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        public SkipToEndOfCurrentGroup() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.skipToGroupEnd();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u001f\u0012$\b\u0002\u0010\u0012\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\"\u0010#J(\u0010\n\u001a\u00020\t*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R3\u0010\u0012\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R%\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a0\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006$"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "", "toString", "Lkotlin/Function3;", "c", "Lkotlin/jvm/functions/Function3;", "getBlock", "()Lkotlin/jvm/functions/Function3;", "block", "", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "d", "Ljava/util/List;", "getIntParams", "()Ljava/util/List;", "intParams", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "e", "getObjParams", "objParams", "", "ints", "objects", "<init>", "(IILkotlin/jvm/functions/Function3;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TestOperation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,992:1\n1#2:993\n*E\n"})
    public static final class TestOperation extends Operation {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function3<Applier<?>, SlotWriter, RememberManager, Unit> block;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ArrayList f14844d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final ArrayList f14845e;

        /* JADX INFO: compiled from: Operation.kt */
        public static final class a extends Lambda implements Function3<Applier<?>, SlotWriter, RememberManager, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f14846p0 = new a(3);

            @Override // kotlin.jvm.functions.Function3
            public final /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                return Unit.INSTANCE;
            }
        }

        @TestOnly
        public TestOperation() {
            this(0, 0, null, 7, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            this.block.invoke(applier, slotWriter, rememberManager);
        }

        @NotNull
        public final Function3<Applier<?>, SlotWriter, RememberManager, Unit> getBlock() {
            return this.block;
        }

        @NotNull
        public final List<IntParameter> getIntParams() {
            return this.f14844d;
        }

        @NotNull
        public final List<ObjectParameter<Object>> getObjParams() {
            return this.f14845e;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + Utils_jvmKt.identityHashCode(this);
        }

        public /* synthetic */ TestOperation(int i10, int i11, Function3 function3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? a.f14846p0 : function3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @TestOnly
        public TestOperation(int i10, int i11, @NotNull Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
            super(i10, i11, null);
            this.block = function3;
            ArrayList arrayList = new ArrayList(i10);
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(IntParameter.m2113boximpl(IntParameter.m2114constructorimpl(i12)));
            }
            this.f14844d = arrayList;
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i13 = 0; i13 < i11; i13++) {
                arrayList2.add(ObjectParameter.m2124boximpl(ObjectParameter.m2125constructorimpl(i13)));
            }
            this.f14845e = arrayList2;
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\r*\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$TrimParentValues;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1#1,992:1\n195#1:993\n195#1:994\n1871#2,6:995\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n*L\n198#1:993\n207#1:994\n209#1:995,6\n*E\n"})
    public static final class TrimParentValues extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final TrimParentValues INSTANCE = new TrimParentValues();

        public TrimParentValues() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            int iMo2150getIntw8GmfQM = operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(0));
            int slotsSize = slotWriter.getSlotsSize();
            int parent = slotWriter.getParent();
            int iSlotsStartIndex$runtime_release = slotWriter.slotsStartIndex$runtime_release(parent);
            int iSlotsEndIndex$runtime_release = slotWriter.slotsEndIndex$runtime_release(parent);
            for (int iMax = Math.max(iSlotsStartIndex$runtime_release, iSlotsEndIndex$runtime_release - iMo2150getIntw8GmfQM); iMax < iSlotsEndIndex$runtime_release; iMax++) {
                Object obj = slotWriter.f14761c[slotWriter.b(iMax)];
                if (obj instanceof RememberObserverHolder) {
                    rememberManager.forgetting(((RememberObserverHolder) obj).getWrapped(), slotsSize - iMax, -1, -1);
                } else if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).release();
                }
            }
            slotWriter.trimTailSlots(iMo2150getIntw8GmfQM);
        }

        /* JADX INFO: renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m2140getCountjn0FJLE() {
            return IntParameter.m2114constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo2086intParamNamew8GmfQM(int parameter) {
            return IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(0)) ? "count" : super.mo2086intParamNamew8GmfQM(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012J(\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\t8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "GroupSlotIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getGroupSlotIndex-jn0FJLE", "Value", "", "getValue-HpuvwBQ", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,992:1\n266#1:993\n264#1:994\n265#1:995\n264#1:996\n265#1:997\n266#1:998\n4186#2,8:999\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n*L\n269#1:993\n274#1:994\n275#1:995\n284#1:996\n285#1:997\n286#1:998\n295#1:999,8\n*E\n"})
    public static final class UpdateAnchoredValue extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final UpdateAnchoredValue INSTANCE = new UpdateAnchoredValue();

        public UpdateAnchoredValue() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            int iAnchorIndex;
            int slotsSize;
            Object objMo2151getObject31yXWZQ = operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0));
            Anchor anchor = (Anchor) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(1));
            int iMo2150getIntw8GmfQM = operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(0));
            if (objMo2151getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering(((RememberObserverHolder) objMo2151getObject31yXWZQ).getWrapped());
            }
            int iAnchorIndex2 = slotWriter.anchorIndex(anchor);
            Object obj = slotWriter.set(iAnchorIndex2, iMo2150getIntw8GmfQM, objMo2151getObject31yXWZQ);
            if (!(obj instanceof RememberObserverHolder)) {
                if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).release();
                    return;
                }
                return;
            }
            int slotsSize2 = slotWriter.getSlotsSize() - slotWriter.slotIndexOfGroupSlotIndex(iAnchorIndex2, iMo2150getIntw8GmfQM);
            RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
            Anchor after = rememberObserverHolder.getAfter();
            if (after == null || !after.getValid()) {
                iAnchorIndex = -1;
                slotsSize = -1;
            } else {
                iAnchorIndex = slotWriter.anchorIndex(after);
                slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
            }
            rememberManager.forgetting(rememberObserverHolder.getWrapped(), slotsSize2, iAnchorIndex, slotsSize);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2141getAnchorHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(1);
        }

        /* JADX INFO: renamed from: getGroupSlotIndex-jn0FJLE, reason: not valid java name */
        public final int m2142getGroupSlotIndexjn0FJLE() {
            return IntParameter.m2114constructorimpl(0);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m2143getValueHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo2086intParamNamew8GmfQM(int parameter) {
            return IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(0)) ? "groupSlotIndex" : super.mo2086intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0))) {
                return "value";
            }
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(1)) ? "anchor" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R \u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Data", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getData-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n1#1,992:1\n312#1:993\n312#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n315#1:993\n324#1:994\n*E\n"})
    public static final class UpdateAuxData extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final UpdateAuxData INSTANCE = new UpdateAuxData();

        /* JADX WARN: Illegal instructions before constructor call */
        public UpdateAuxData() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.updateAux(operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getData-HpuvwBQ, reason: not valid java name */
        public final int m2144getDataHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0)) ? "data" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\u0007*\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R9\u0010\u0003\u001a#\u0012\u001f\u0012\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Block", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getBlock-HpuvwBQ", "()I", "Value", "getValue-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,992:1\n435#1:993\n436#1:994\n435#1:995\n436#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n439#1:993\n440#1:994\n449#1:995\n450#1:996\n*E\n"})
    public static final class UpdateNode extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final UpdateNode INSTANCE = new UpdateNode();

        public UpdateNode() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            ((Function2) operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(1))).invoke(applier.getCurrent(), operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0)));
        }

        /* JADX INFO: renamed from: getBlock-HpuvwBQ, reason: not valid java name */
        public final int m2145getBlockHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(1);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m2146getValueHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0))) {
                return "value";
            }
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(1)) ? "block" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ(\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "GroupSlotIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getGroupSlotIndex-jn0FJLE", "()I", "Value", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getValue-HpuvwBQ", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n1#1,992:1\n226#1:993\n225#1:994\n225#1:995\n226#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n229#1:993\n234#1:994\n243#1:995\n244#1:996\n*E\n"})
    public static final class UpdateValue extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final UpdateValue INSTANCE = new UpdateValue();

        public UpdateValue() {
            super(1, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Object objMo2151getObject31yXWZQ = operationArgContainer.mo2151getObject31yXWZQ(ObjectParameter.m2125constructorimpl(0));
            int iMo2150getIntw8GmfQM = operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(0));
            if (objMo2151getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering(((RememberObserverHolder) objMo2151getObject31yXWZQ).getWrapped());
            }
            Object obj = slotWriter.set(iMo2150getIntw8GmfQM, objMo2151getObject31yXWZQ);
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting(((RememberObserverHolder) obj).getWrapped(), slotWriter.getSlotsSize() - slotWriter.slotIndexOfGroupSlotIndex(slotWriter.getCurrentGroup(), iMo2150getIntw8GmfQM), -1, -1);
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }

        /* JADX INFO: renamed from: getGroupSlotIndex-jn0FJLE, reason: not valid java name */
        public final int m2147getGroupSlotIndexjn0FJLE() {
            return IntParameter.m2114constructorimpl(0);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m2148getValueHpuvwBQ() {
            return ObjectParameter.m2125constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo2086intParamNamew8GmfQM(int parameter) {
            return IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(0)) ? "groupSlotIndex" : super.mo2086intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo2087objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m2127equalsimpl0(parameter, ObjectParameter.m2125constructorimpl(0)) ? "value" : super.mo2087objectParamName31yXWZQ(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\r*\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,992:1\n79#1:993\n79#1:994\n1#2:995\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n*L\n82#1:993\n91#1:994\n*E\n"})
    public static final class Ups extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final Ups INSTANCE = new Ups();

        public Ups() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            int iMo2150getIntw8GmfQM = operationArgContainer.mo2150getIntw8GmfQM(IntParameter.m2114constructorimpl(0));
            for (int i10 = 0; i10 < iMo2150getIntw8GmfQM; i10++) {
                applier.up();
            }
        }

        /* JADX INFO: renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m2149getCountjn0FJLE() {
            return IntParameter.m2114constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo2086intParamNamew8GmfQM(int parameter) {
            return IntParameter.m2116equalsimpl0(parameter, IntParameter.m2114constructorimpl(0)) ? "count" : super.mo2086intParamNamew8GmfQM(parameter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UseCurrentNode extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final UseCurrentNode INSTANCE = new UseCurrentNode();

        /* JADX WARN: Illegal instructions before constructor call */
        public UseCurrentNode() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Object current = applier.getCurrent();
            Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((ComposeNodeLifecycleCallback) current).onReuse();
        }
    }

    public /* synthetic */ Operation(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, null);
    }

    public abstract void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager);

    public final int getInts() {
        return this.ints;
    }

    @NotNull
    public final String getName() {
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }

    public final int getObjects() {
        return this.objects;
    }

    @NotNull
    /* JADX INFO: renamed from: intParamName-w8GmfQM, reason: not valid java name */
    public String mo2086intParamNamew8GmfQM(int parameter) {
        return g.a("IntParameter(", parameter, RootService.CLOSE_BRACKET);
    }

    @NotNull
    /* JADX INFO: renamed from: objectParamName-31yXWZQ, reason: not valid java name */
    public String mo2087objectParamName31yXWZQ(int parameter) {
        return g.a("ObjectParameter(", parameter, RootService.CLOSE_BRACKET);
    }

    @NotNull
    public String toString() {
        return getName();
    }

    public Operation(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this.ints = i10;
        this.objects = i11;
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0013\u0092\u0001\u00020\u0006¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$IntParameter;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getOffset", "()I", TypedValues.CycleType.S_WAVE_OFFSET, "constructor-impl", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @JvmInline
    public static final class IntParameter {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int offset;

        public /* synthetic */ IntParameter(int i10) {
            this.offset = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IntParameter m2113boximpl(int i10) {
            return new IntParameter(i10);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m2115equalsimpl(int i10, Object obj) {
            return (obj instanceof IntParameter) && i10 == ((IntParameter) obj).m2119unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m2116equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m2118toStringimpl(int i10) {
            return g.a("IntParameter(offset=", i10, RootService.CLOSE_BRACKET);
        }

        public boolean equals(Object obj) {
            return m2115equalsimpl(this.offset, obj);
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return m2117hashCodeimpl(this.offset);
        }

        public String toString() {
            return m2118toStringimpl(this.offset);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m2119unboximpl() {
            return this.offset;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m2114constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m2117hashCodeimpl(int i10) {
            return i10;
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\tJ\u0010\u0010\u0006\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0014\u0092\u0001\u00020\u0007¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getOffset", "()I", TypedValues.CycleType.S_WAVE_OFFSET, "constructor-impl", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @JvmInline
    public static final class ObjectParameter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int offset;

        public /* synthetic */ ObjectParameter(int i10) {
            this.offset = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ObjectParameter m2124boximpl(int i10) {
            return new ObjectParameter(i10);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m2126equalsimpl(int i10, Object obj) {
            return (obj instanceof ObjectParameter) && i10 == ((ObjectParameter) obj).m2130unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m2127equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m2129toStringimpl(int i10) {
            return g.a("ObjectParameter(offset=", i10, RootService.CLOSE_BRACKET);
        }

        public boolean equals(Object obj) {
            return m2126equalsimpl(this.offset, obj);
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return m2128hashCodeimpl(this.offset);
        }

        public String toString() {
            return m2129toStringimpl(this.offset);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m2130unboximpl() {
            return this.offset;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static <T> int m2125constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m2128hashCodeimpl(int i10) {
            return i10;
        }
    }
}
