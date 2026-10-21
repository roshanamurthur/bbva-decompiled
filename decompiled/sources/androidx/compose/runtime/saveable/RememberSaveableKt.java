package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.b;

/* JADX INFO: compiled from: RememberSaveable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\bH\u0007¢\u0006\u0004\b\n\u0010\u000e\u001a\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0000H\u0000¨\u0006\u0011"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "inputs", "Landroidx/compose/runtime/saveable/Saver;", "saver", "", "key", "Lkotlin/Function0;", "init", "rememberSaveable", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "Landroidx/compose/runtime/MutableState;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "value", "generateCannotBeSavedErrorMessage", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,274:1\n77#2:275\n1225#3,6:276\n1225#3,6:282\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n82#1:275\n84#1:276,6\n94#1:282,6\n*E\n"})
public final class RememberSaveableKt {

    /* JADX INFO: compiled from: RememberSaveable.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.saveable.a<T> f15198p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Saver<T, ? extends Object> f15199q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SaveableStateRegistry f15200r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f15201s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ T f15202t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Object[] f15203u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.runtime.saveable.a<T> aVar, Saver<T, ? extends Object> saver, SaveableStateRegistry saveableStateRegistry, String str, T t10, Object[] objArr) {
            super(0);
            this.f15198p0 = aVar;
            this.f15199q0 = saver;
            this.f15200r0 = saveableStateRegistry;
            this.f15201s0 = str;
            this.f15202t0 = t10;
            this.f15203u0 = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z10;
            androidx.compose.runtime.saveable.a<T> aVar = this.f15198p0;
            SaveableStateRegistry saveableStateRegistry = aVar.f15240q0;
            SaveableStateRegistry saveableStateRegistry2 = this.f15200r0;
            boolean z11 = true;
            if (saveableStateRegistry != saveableStateRegistry2) {
                aVar.f15240q0 = saveableStateRegistry2;
                z10 = true;
            } else {
                z10 = false;
            }
            String str = aVar.f15241r0;
            String str2 = this.f15201s0;
            if (Intrinsics.areEqual(str, str2)) {
                z11 = z10;
            } else {
                aVar.f15241r0 = str2;
            }
            aVar.f15239p0 = this.f15199q0;
            aVar.f15242s0 = this.f15202t0;
            aVar.f15243t0 = this.f15203u0;
            SaveableStateRegistry.Entry entry = aVar.f15244u0;
            if (entry != null && z11) {
                entry.unregister();
                aVar.f15244u0 = null;
                aVar.a();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void access$requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String strGenerateCannotBeSavedErrorMessage;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
                strGenerateCannotBeSavedErrorMessage = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strGenerateCannotBeSavedErrorMessage = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strGenerateCannotBeSavedErrorMessage = generateCannotBeSavedErrorMessage(obj);
        }
        throw new IllegalArgumentException(strGenerateCannotBeSavedErrorMessage);
    }

    @NotNull
    public static final String generateCannotBeSavedErrorMessage(@NotNull Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v0 ??, still in use, count: 1, list:
          (r15v0 ?? I:java.lang.Object) from 0x0087: INVOKE (r20v0 ?? I:androidx.compose.runtime.Composer), (r15v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:17)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m2165rememberSaveable(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v0 ??, still in use, count: 1, list:
          (r15v0 ?? I:java.lang.Object) from 0x0087: INVOKE (r20v0 ?? I:androidx.compose.runtime.Composer), (r15v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:17)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    @Composable
    @NotNull
    public static final <T> MutableState<T> rememberSaveable(@NotNull Object[] objArr, @NotNull Saver<T, ? extends Object> saver, @Nullable String str, @NotNull Function0<? extends MutableState<T>> function0, @Nullable Composer composer, int i10, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202053668, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        MutableState<T> mutableState = (MutableState) m2165rememberSaveable(objArrCopyOf, SaverKt.Saver(new r0.a(saver), new b(saver)), str2, (Function0) function0, composer, (i10 & 896) | (i10 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
