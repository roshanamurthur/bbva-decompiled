package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.b;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FixupList.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\"\u0010\r\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ&\u0010\u0015\u001a\u00020\u00052\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0005J@\u0010\u001d\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u001d\u0010\u001c\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001a¢\u0006\u0002\b\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016R\u0011\u0010$\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "", "isEmpty", "isNotEmpty", "", ClearCommand.ID, "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingFixups", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "Landroidx/compose/runtime/Anchor;", "groupAnchor", "createAndInsertNode", "endNodeInsert", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "updateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "linePrefix", "toDebugString", "getSize", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFixupList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,91:1\n4553#2,7:92\n4553#2,7:184\n167#3,5:99\n175#3,2:107\n174#3:109\n178#3,25:115\n204#3:141\n167#3,5:142\n175#3,2:149\n174#3:151\n178#3,25:157\n204#3:183\n167#3,5:191\n175#3,2:198\n174#3:200\n178#3,25:206\n204#3:232\n565#4:104\n566#4:105\n567#4:106\n50#5,5:110\n56#5:140\n50#5,5:152\n56#5:182\n50#5,5:201\n56#5:231\n597#6:147\n598#6:148\n435#7:196\n436#7:197\n*S KotlinDebug\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n*L\n46#1:92,7\n71#1:184,7\n58#1:99,5\n58#1:107,2\n58#1:109\n58#1:115,25\n58#1:141\n64#1:142,5\n64#1:149,2\n64#1:151\n64#1:157,25\n64#1:183\n78#1:191,5\n78#1:198,2\n78#1:200\n78#1:206,25\n78#1:232\n59#1:104\n60#1:105\n61#1:106\n58#1:110,5\n58#1:140\n64#1:152,5\n64#1:182\n78#1:201,5\n78#1:231\n65#1:147\n66#1:148\n79#1:196\n80#1:197\n*E\n"})
public final class FixupList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Operations f14837a = new Operations();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Operations f14838b = new Operations();

    public final void clear() {
        this.f14838b.clear();
        this.f14837a.clear();
    }

    public final void createAndInsertNode(@NotNull Function0<? extends Object> factory, int insertIndex, @NotNull Anchor groupAnchor) {
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        Operations operations = this.f14837a;
        operations.pushOp(insertNodeFixup);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), factory);
        Operations.WriteScope.m2160setIntA6tL2VI(operationsM2155constructorimpl, Operation.IntParameter.m2114constructorimpl(0), insertIndex);
        int i10 = 1;
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(1), groupAnchor);
        if (!(operations.f14855g == Operations.access$createExpectedArgMask(operations, insertNodeFixup.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, insertNodeFixup.getObjects()))) {
            StringBuilder sb2 = new StringBuilder();
            int ints = insertNodeFixup.getInts();
            int i11 = 0;
            int i12 = 0;
            while (i12 < ints) {
                if (((i10 << i12) & operations.f14855g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(insertNodeFixup.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i12)));
                    i11++;
                }
                i12++;
                i10 = 1;
            }
            String string = sb2.toString();
            StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
            int objects = insertNodeFixup.getObjects();
            int i13 = 0;
            int i14 = 0;
            while (i14 < objects) {
                if (((1 << i14) & operations.f14856h) != 0) {
                    if (i11 > 0) {
                        sbC.append(", ");
                    }
                    sbC.append(insertNodeFixup.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i14)));
                    i13++;
                }
                i14++;
                operations = operations;
            }
            String string2 = sbC.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder("Error while pushing ");
            sb3.append(insertNodeFixup);
            sb3.append(". Not all arguments were provided. Missing ");
            androidx.room.a.f(sb3, i11, " int arguments (", string, ") and ");
            b.g(sb3, i13, " object arguments (", string2, ").");
        }
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        Operations operations2 = this.f14838b;
        operations2.pushOp(postInsertNodeFixup);
        Operations operationsM2155constructorimpl2 = Operations.WriteScope.m2155constructorimpl(operations2);
        Operations.WriteScope.m2160setIntA6tL2VI(operationsM2155constructorimpl2, Operation.IntParameter.m2114constructorimpl(0), insertIndex);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl2, Operation.ObjectParameter.m2125constructorimpl(0), groupAnchor);
        if (operations2.f14855g == Operations.access$createExpectedArgMask(operations2, postInsertNodeFixup.getInts()) && operations2.f14856h == Operations.access$createExpectedArgMask(operations2, postInsertNodeFixup.getObjects())) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        int ints2 = postInsertNodeFixup.getInts();
        int i15 = 0;
        for (int i16 = 0; i16 < ints2; i16++) {
            if (((1 << i16) & operations2.f14855g) != 0) {
                if (i15 > 0) {
                    sb4.append(", ");
                }
                sb4.append(postInsertNodeFixup.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i16)));
                i15++;
            }
        }
        String string3 = sb4.toString();
        StringBuilder sbC2 = a.c(string3, "StringBuilder().apply(builderAction).toString()");
        int objects2 = postInsertNodeFixup.getObjects();
        int i17 = 0;
        int i18 = 0;
        while (i18 < objects2) {
            if (((1 << i18) & operations2.f14856h) != 0) {
                if (i15 > 0) {
                    sbC2.append(", ");
                }
                sbC2.append(postInsertNodeFixup.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i18)));
                i17++;
            }
            i18++;
            operations2 = operations2;
        }
        String string4 = sbC2.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(postInsertNodeFixup);
        sb5.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb5, i15, " int arguments (", string3, ") and ");
        b.g(sb5, i17, " object arguments (", string4, ").");
    }

    public final void endNodeInsert() {
        Operations operations = this.f14838b;
        if (!operations.isNotEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        operations.popInto(this.f14837a);
    }

    public final void executeAndFlushAllPendingFixups(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
        if (!this.f14838b.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.f14837a.executeAndFlushAllPendingOperations(applier, slots, rememberManager);
    }

    public final int getSize() {
        return this.f14837a.getF14850b();
    }

    public final boolean isEmpty() {
        return this.f14837a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.f14837a.isNotEmpty();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @NotNull
    public String toDebugString(@NotNull String linePrefix) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FixupList instance containing " + getSize() + " operations");
        if (sb2.length() > 0) {
            sb2.append(":\n" + this.f14837a.toDebugString(linePrefix));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final <V, T> void updateNode(V value, @NotNull Function2<? super T, ? super V, Unit> block) {
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        Operations operations = this.f14837a;
        operations.pushOp(updateNode);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), value);
        int iM2125constructorimpl = Operation.ObjectParameter.m2125constructorimpl(1);
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, iM2125constructorimpl, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, updateNode.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, updateNode.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = updateNode.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(updateNode.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = updateNode.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(updateNode.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(updateNode);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }
}
