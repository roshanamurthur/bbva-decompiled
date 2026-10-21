package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComposableLambdaN.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J*\u0010\b\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0006\"\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "", "block", "", "update", "", "args", "invoke", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getKey", "()I", "key", "r0", "getArity", "arity", "", "tracked", "<init>", "(IZI)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,193:1\n37#2,2:194\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n113#1:194,2\n*E\n"})
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int key;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f15173q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int arity;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public FunctionN f15175s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public RecomposeScope f15176t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public ArrayList f15177u0;

    /* JADX INFO: compiled from: ComposableLambdaN.jvm.kt */
    @SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,193:1\n37#2,2:194\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n*L\n124#1:194,2\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object[] f15178p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f15179q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ComposableLambdaNImpl f15180r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object[] objArr, int i10, ComposableLambdaNImpl composableLambdaNImpl) {
            super(2);
            this.f15178p0 = objArr;
            this.f15179q0 = i10;
            this.f15180r0 = composableLambdaNImpl;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            num.intValue();
            int i10 = this.f15179q0;
            IntRange intRangeUntil = c.until(0, i10);
            Object[] objArr = this.f15178p0;
            Object[] array = ArraysKt___ArraysKt.slice(objArr, intRangeUntil).toArray(new Object[0]);
            Object obj = objArr[i10 + 1];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(((Integer) obj).intValue());
            int length = (objArr.length - i10) - 2;
            Object[] objArr2 = new Object[length];
            for (int i11 = 0; i11 < length; i11++) {
                Object obj2 = objArr[i10 + 2 + i11];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                objArr2[i11] = Integer.valueOf(RecomposeScopeImplKt.updateChangedFlags(((Integer) obj2).intValue()));
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(4);
            spreadBuilder.addSpread(array);
            spreadBuilder.add(composer2);
            spreadBuilder.add(Integer.valueOf(iUpdateChangedFlags | 1));
            spreadBuilder.addSpread(objArr2);
            this.f15180r0.invoke(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
            return Unit.INSTANCE;
        }
    }

    public ComposableLambdaNImpl(int i10, boolean z10, int i11) {
        this.key = i10;
        this.f15173q0 = z10;
        this.arity = i11;
    }

    @Override // kotlin.jvm.functions.FunctionN, kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // kotlin.jvm.functions.FunctionN
    @Nullable
    public Object invoke(@NotNull Object... args) {
        RecomposeScope recomposeScope;
        int length = args.length - 2;
        for (int i10 = 1; i10 * 10 < length; i10++) {
            length--;
        }
        Object obj = args[length];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        int i11 = 0;
        Object[] array = ArraysKt___ArraysKt.slice(args, c.until(0, args.length - 1)).toArray(new Object[0]);
        Object obj2 = args[args.length - 1];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Composer composerStartRestartGroup = ((Composer) obj).startRestartGroup(this.key);
        if (this.f15173q0 && (recomposeScope = composerStartRestartGroup.getRecomposeScope()) != null) {
            composerStartRestartGroup.recordUsed(recomposeScope);
            if (!ComposableLambdaKt.replacableWith(this.f15176t0, recomposeScope)) {
                ArrayList arrayList = this.f15177u0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i11 >= size) {
                            arrayList.add(recomposeScope);
                            break;
                        }
                        if (ComposableLambdaKt.replacableWith((RecomposeScope) arrayList.get(i11), recomposeScope)) {
                            arrayList.set(i11, recomposeScope);
                            break;
                        }
                        i11++;
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    this.f15177u0 = arrayList2;
                    arrayList2.add(recomposeScope);
                }
            } else {
                this.f15176t0 = recomposeScope;
            }
        }
        int iDifferentBits = iIntValue | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(length) : ComposableLambdaKt.sameBits(length));
        FunctionN functionN = this.f15175s0;
        Intrinsics.checkNotNull(functionN, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(array);
        spreadBuilder.add(Integer.valueOf(iDifferentBits));
        Object objInvoke = functionN.invoke(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(args, length, this));
        }
        return objInvoke;
    }

    public final void update(@NotNull Object block) {
        if (Intrinsics.areEqual(block, this.f15175s0)) {
            return;
        }
        boolean z10 = this.f15175s0 == null;
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this.f15175s0 = (FunctionN) block;
        if (z10 || !this.f15173q0) {
            return;
        }
        RecomposeScope recomposeScope = this.f15176t0;
        if (recomposeScope != null) {
            recomposeScope.invalidate();
            this.f15176t0 = null;
        }
        ArrayList arrayList = this.f15177u0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((RecomposeScope) arrayList.get(i10)).invalidate();
            }
            arrayList.clear();
        }
    }
}
