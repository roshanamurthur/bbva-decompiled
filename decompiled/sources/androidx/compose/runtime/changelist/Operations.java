package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.b;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Operations.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 (2\u00020\u0001:\u0003()*B\u0007¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J7\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\rH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001J\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0000J&\u0010\u0014\u001a\u00020\u00052\u001b\u0010\u0013\u001a\u0017\u0012\b\u0012\u00060\u0012R\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\rH\u0086\bJ&\u0010\u0016\u001a\u00020\u00052\u001b\u0010\u0015\u001a\u0017\u0012\b\u0012\u00060\u0012R\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\rH\u0086\bJ\"\u0010\u001d\u001a\u00020\u00052\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001f\u001a\u00020\u001eH\u0017J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006+"}, d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "", "isEmpty", "isNotEmpty", "", ClearCommand.ID, "Landroidx/compose/runtime/changelist/Operation;", "operation", "pushOp", "push", "Lkotlin/Function1;", "Landroidx/compose/runtime/changelist/Operations$WriteScope;", "Lkotlin/ExtensionFunctionType;", "args", NavigationOperations.POP, "other", "popInto", "Landroidx/compose/runtime/changelist/Operations$OpIterator;", "sink", "drain", "action", "forEach", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingOperations", "", "toString", "linePrefix", "toDebugString", "", "getSize", "()I", "size", "<init>", "()V", "Companion", "OpIterator", "WriteScope", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,476:1\n295#1,7:491\n284#1:498\n295#1,7:499\n285#1,2:506\n295#1,7:508\n33#2,7:477\n50#2,7:484\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n284#1:491,7\n308#1:498\n308#1:499,7\n308#1:506,2\n407#1:508,7\n147#1:477,7\n174#1:484,7\n*E\n"})
public final class Operations extends OperationsDebugStringFormattable {
    public static final int InitialCapacity = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14850b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14852d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14856h;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Operation[] f14849a = new Operation[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public int[] f14851c = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public Object[] f14853e = new Object[16];

    /* JADX INFO: compiled from: Operations.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "", "next", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "getInt-w8GmfQM", "(I)I", "getInt", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "getObject-31yXWZQ", "(I)Ljava/lang/Object;", "getObject", "Landroidx/compose/runtime/changelist/Operation;", "getOperation", "()Landroidx/compose/runtime/changelist/Operation;", "operation", "<init>", "(Landroidx/compose/runtime/changelist/Operations;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public final class OpIterator implements OperationArgContainer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14859c;

        public OpIterator() {
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* JADX INFO: renamed from: getInt-w8GmfQM */
        public int mo2150getIntw8GmfQM(int parameter) {
            return Operations.this.f14851c[this.f14858b + parameter];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* JADX INFO: renamed from: getObject-31yXWZQ */
        public <T> T mo2151getObject31yXWZQ(int parameter) {
            return (T) Operations.this.f14853e[this.f14859c + parameter];
        }

        @NotNull
        public final Operation getOperation() {
            Operation operation = Operations.this.f14849a[this.f14857a];
            Intrinsics.checkNotNull(operation);
            return operation;
        }

        public final boolean next() {
            int i10 = this.f14857a;
            Operations operations = Operations.this;
            if (i10 >= operations.f14850b) {
                return false;
            }
            Operation operation = getOperation();
            this.f14858b = operation.getInts() + this.f14858b;
            this.f14859c = operation.getObjects() + this.f14859c;
            int i11 = this.f14857a + 1;
            this.f14857a = i11;
            return i11 < operations.f14850b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Operations.kt */
    public static final class a<T> extends Lambda implements Function1<T, CharSequence> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f14863q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f14863q0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Object obj) {
            return Operations.this.a(obj, this.f14863q0);
        }
    }

    public static final int access$createExpectedArgMask(Operations operations, int i10) {
        operations.getClass();
        if (i10 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i10);
    }

    public static final Operation access$peekOperation(Operations operations) {
        Operation operation = operations.f14849a[operations.f14850b - 1];
        Intrinsics.checkNotNull(operation);
        return operation;
    }

    /* JADX INFO: renamed from: access$topIntIndexOf-w8GmfQM, reason: not valid java name */
    public static final int m2152access$topIntIndexOfw8GmfQM(Operations operations, int i10) {
        int i11 = operations.f14852d;
        Operation operation = operations.f14849a[operations.f14850b - 1];
        Intrinsics.checkNotNull(operation);
        return (i11 - operation.getInts()) + i10;
    }

    /* JADX INFO: renamed from: access$topObjectIndexOf-31yXWZQ, reason: not valid java name */
    public static final int m2153access$topObjectIndexOf31yXWZQ(Operations operations, int i10) {
        int i11 = operations.f14854f;
        Operation operation = operations.f14849a[operations.f14850b - 1];
        Intrinsics.checkNotNull(operation);
        return (i11 - operation.getObjects()) + i10;
    }

    public final String a(Object obj, String str) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        if (obj instanceof Object[]) {
            return b(ArraysKt___ArraysKt.asIterable((Object[]) obj), str);
        }
        if (obj instanceof int[]) {
            return b(ArraysKt___ArraysKt.asIterable((int[]) obj), str);
        }
        if (obj instanceof long[]) {
            return b(ArraysKt___ArraysKt.asIterable((long[]) obj), str);
        }
        if (obj instanceof float[]) {
            return b(ArraysKt___ArraysKt.asIterable((float[]) obj), str);
        }
        if (obj instanceof double[]) {
            return b(ArraysKt___ArraysKt.asIterable((double[]) obj), str);
        }
        if (obj instanceof Iterable) {
            return b((Iterable) obj, str);
        }
        return obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).toDebugString(str) : obj.toString();
    }

    public final <T> String b(Iterable<? extends T> iterable, String str) {
        return CollectionsKt___CollectionsKt.joinToString$default(iterable, ", ", Constant.BRACKET_OPEN, Constant.BRACKET_CLOSE, 0, null, new a(str), 24, null);
    }

    public final void clear() {
        this.f14850b = 0;
        this.f14852d = 0;
        ArraysKt___ArraysJvmKt.fill(this.f14853e, (Object) null, 0, this.f14854f);
        this.f14854f = 0;
    }

    public final void drain(@NotNull Function1<? super OpIterator, Unit> sink) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                sink.invoke(opIterator);
            } while (opIterator.next());
        }
        clear();
    }

    public final void executeAndFlushAllPendingOperations(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.getOperation().execute(opIterator, applier, slots, rememberManager);
            } while (opIterator.next());
        }
        clear();
    }

    public final void forEach(@NotNull Function1<? super OpIterator, Unit> action) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                action.invoke(opIterator);
            } while (opIterator.next());
        }
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int getF14850b() {
        return this.f14850b;
    }

    public final boolean isEmpty() {
        return getF14850b() == 0;
    }

    public final boolean isNotEmpty() {
        return getF14850b() != 0;
    }

    public final void pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        Operation[] operationArr = this.f14849a;
        int i10 = this.f14850b - 1;
        this.f14850b = i10;
        Operation operation = operationArr[i10];
        Intrinsics.checkNotNull(operation);
        this.f14849a[this.f14850b] = null;
        int objects = operation.getObjects();
        for (int i11 = 0; i11 < objects; i11++) {
            Object[] objArr = this.f14853e;
            int i12 = this.f14854f - 1;
            this.f14854f = i12;
            objArr[i12] = null;
        }
        int ints = operation.getInts();
        for (int i13 = 0; i13 < ints; i13++) {
            int[] iArr = this.f14851c;
            int i14 = this.f14852d - 1;
            this.f14852d = i14;
            iArr[i14] = 0;
        }
    }

    public final void popInto(@NotNull Operations other) {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        Operation[] operationArr = this.f14849a;
        int i10 = this.f14850b - 1;
        this.f14850b = i10;
        Operation operation = operationArr[i10];
        Intrinsics.checkNotNull(operation);
        this.f14849a[this.f14850b] = null;
        other.pushOp(operation);
        int i11 = this.f14854f;
        int i12 = other.f14854f;
        int objects = operation.getObjects();
        for (int i13 = 0; i13 < objects; i13++) {
            i12--;
            i11--;
            Object[] objArr = other.f14853e;
            Object[] objArr2 = this.f14853e;
            objArr[i12] = objArr2[i11];
            objArr2[i11] = null;
        }
        int i14 = this.f14852d;
        int i15 = other.f14852d;
        int ints = operation.getInts();
        for (int i16 = 0; i16 < ints; i16++) {
            i15--;
            i14--;
            int[] iArr = other.f14851c;
            int[] iArr2 = this.f14851c;
            iArr[i15] = iArr2[i14];
            iArr2[i14] = 0;
        }
        this.f14854f -= operation.getObjects();
        this.f14852d -= operation.getInts();
    }

    public final void push(@NotNull Operation operation) {
        if (!(operation.getInts() == 0 && operation.getObjects() == 0)) {
            PreconditionsKt.throwIllegalArgumentException("Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.");
        }
        pushOp(operation);
    }

    @InternalComposeApi
    public final void pushOp(@NotNull Operation operation) {
        this.f14855g = 0;
        this.f14856h = 0;
        int i10 = this.f14850b;
        if (i10 == this.f14849a.length) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f14849a, this.f14850b + c.coerceAtMost(i10, 1024));
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f14849a = (Operation[]) objArrCopyOf;
        }
        int ints = operation.getInts() + this.f14852d;
        int[] iArr = this.f14851c;
        int length = iArr.length;
        if (ints > length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, c.coerceAtLeast(c.coerceAtMost(length, 1024) + length, ints));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f14851c = iArrCopyOf;
        }
        int objects = operation.getObjects() + this.f14854f;
        Object[] objArr = this.f14853e;
        int length2 = objArr.length;
        if (objects > length2) {
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, c.coerceAtLeast(c.coerceAtMost(length2, 1024) + length2, objects));
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
            this.f14853e = objArrCopyOf2;
        }
        Operation[] operationArr = this.f14849a;
        int i11 = this.f14850b;
        this.f14850b = i11 + 1;
        operationArr[i11] = operation;
        this.f14852d = operation.getInts() + this.f14852d;
        this.f14854f = operation.getObjects() + this.f14854f;
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @NotNull
    public String toDebugString(@NotNull String linePrefix) {
        int i10;
        char c10;
        String string;
        char c11;
        char c12;
        StringBuilder sb2 = new StringBuilder();
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            int i11 = 1;
            while (true) {
                sb2.append(linePrefix);
                int i12 = i11 + 1;
                sb2.append(i11);
                sb2.append(". ");
                Operation operation = opIterator.getOperation();
                if (operation.getInts() == 0 && operation.getObjects() == 0) {
                    string = operation.getName();
                    i10 = i12;
                    c10 = '\n';
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(operation.getName());
                    sb3.append(RootService.OPEN_BRACKET);
                    String str = linePrefix + "    ";
                    int ints = operation.getInts();
                    int i13 = 0;
                    boolean z10 = true;
                    while (i13 < ints) {
                        int iM2114constructorimpl = Operation.IntParameter.m2114constructorimpl(i13);
                        int i14 = i12;
                        String strMo2086intParamNamew8GmfQM = operation.mo2086intParamNamew8GmfQM(iM2114constructorimpl);
                        if (z10) {
                            c12 = '\n';
                            z10 = false;
                        } else {
                            sb3.append(", ");
                            c12 = '\n';
                        }
                        sb3.append(c12);
                        Intrinsics.checkNotNullExpressionValue(sb3, "append('\\n')");
                        sb3.append(str);
                        sb3.append(strMo2086intParamNamew8GmfQM);
                        sb3.append(" = ");
                        sb3.append(opIterator.mo2150getIntw8GmfQM(iM2114constructorimpl));
                        i13++;
                        i12 = i14;
                    }
                    i10 = i12;
                    int objects = operation.getObjects();
                    int i15 = 0;
                    while (i15 < objects) {
                        int iM2125constructorimpl = Operation.ObjectParameter.m2125constructorimpl(i15);
                        String strMo2087objectParamName31yXWZQ = operation.mo2087objectParamName31yXWZQ(iM2125constructorimpl);
                        if (z10) {
                            c11 = '\n';
                            z10 = false;
                        } else {
                            sb3.append(", ");
                            c11 = '\n';
                        }
                        sb3.append(c11);
                        Intrinsics.checkNotNullExpressionValue(sb3, "append('\\n')");
                        sb3.append(str);
                        sb3.append(strMo2087objectParamName31yXWZQ);
                        sb3.append(" = ");
                        sb3.append(a(opIterator.mo2151getObject31yXWZQ(iM2125constructorimpl), str));
                        i15++;
                        operation = operation;
                    }
                    c10 = '\n';
                    sb3.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb3, "append('\\n')");
                    sb3.append(linePrefix);
                    sb3.append(")");
                    string = sb3.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                }
                sb2.append(string);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                sb2.append(c10);
                Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                if (!opIterator.next()) {
                    break;
                }
                i11 = i10;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @Deprecated(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @ReplaceWith(expression = "toDebugString()", imports = {}))
    @NotNull
    public String toString() {
        return super.toString();
    }

    public final void push(@NotNull Operation operation, @NotNull Function1<? super WriteScope, Unit> args) {
        pushOp(operation);
        args.invoke(WriteScope.m2154boximpl(WriteScope.m2155constructorimpl(this)));
        if (this.f14855g == access$createExpectedArgMask(this, operation.getInts()) && this.f14856h == access$createExpectedArgMask(this, operation.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = operation.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & this.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(operation.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = operation.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & this.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(operation.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(operation);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    /* JADX INFO: compiled from: Operations.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000e\u001a\u00020\u0006\"\u0004\b\u0000\u0010\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0088\u0001 \u0092\u0001\u00020\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "value", "", "setInt-A6tL2VI", "(Landroidx/compose/runtime/changelist/Operations;II)V", "setInt", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "setObject-DKhxnng", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V", "setObject", "", "toString-impl", "(Landroidx/compose/runtime/changelist/Operations;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroidx/compose/runtime/changelist/Operations;)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/changelist/Operation;", "getOperation-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;", "operation", "Landroidx/compose/runtime/changelist/Operations;", "stack", "constructor-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @JvmInline
    @SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,476:1\n50#2,7:477\n50#2,7:484\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n*L\n336#1:477,7\n345#1:484,7\n*E\n"})
    public static final class WriteScope {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Operations f14861a;

        public /* synthetic */ WriteScope(Operations operations) {
            this.f14861a = operations;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WriteScope m2154boximpl(Operations operations) {
            return new WriteScope(operations);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m2156equalsimpl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && Intrinsics.areEqual(operations, ((WriteScope) obj).getF14861a());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m2157equalsimpl0(Operations operations, Operations operations2) {
            return Intrinsics.areEqual(operations, operations2);
        }

        @NotNull
        /* JADX INFO: renamed from: getOperation-impl, reason: not valid java name */
        public static final Operation m2158getOperationimpl(Operations operations) {
            return Operations.access$peekOperation(operations);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m2159hashCodeimpl(Operations operations) {
            return operations.hashCode();
        }

        /* JADX INFO: renamed from: setInt-A6tL2VI, reason: not valid java name */
        public static final void m2160setIntA6tL2VI(Operations operations, int i10, int i11) {
            int i12 = 1 << i10;
            if (!((operations.f14855g & i12) == 0)) {
                PreconditionsKt.throwIllegalStateException("Already pushed argument " + m2158getOperationimpl(operations).mo2086intParamNamew8GmfQM(i10));
            }
            operations.f14855g |= i12;
            operations.f14851c[Operations.m2152access$topIntIndexOfw8GmfQM(operations, i10)] = i11;
        }

        /* JADX INFO: renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m2161setObjectDKhxnng(Operations operations, int i10, T t10) {
            int i11 = 1 << i10;
            if (!((operations.f14856h & i11) == 0)) {
                PreconditionsKt.throwIllegalStateException("Already pushed argument " + m2158getOperationimpl(operations).mo2087objectParamName31yXWZQ(i10));
            }
            operations.f14856h |= i11;
            operations.f14853e[Operations.m2153access$topObjectIndexOf31yXWZQ(operations, i10)] = t10;
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m2162toStringimpl(Operations operations) {
            return "WriteScope(stack=" + operations + RootService.CLOSE_BRACKET;
        }

        public boolean equals(Object obj) {
            return m2156equalsimpl(this.f14861a, obj);
        }

        public int hashCode() {
            return m2159hashCodeimpl(this.f14861a);
        }

        public String toString() {
            return m2162toStringimpl(this.f14861a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ Operations getF14861a() {
            return this.f14861a;
        }

        @NotNull
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Operations m2155constructorimpl(@NotNull Operations operations) {
            return operations;
        }
    }
}
