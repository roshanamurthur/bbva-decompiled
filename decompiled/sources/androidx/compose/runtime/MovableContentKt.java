package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MovableContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0007\u001a;\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\u0005\"\u0004\b\u0000\u0010\t2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\n\u001aM\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u0005\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r2\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u000e\u001a_\u0010\u0002\u001a\u001f\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u00102#\u0010\u0006\u001a\u001f\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0011\u001aq\u0010\u0002\u001a%\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u0005\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u00132)\u0010\u0006\u001a%\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0014\u001aE\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017\"\u0004\b\u0000\u0010\u00162\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017¢\u0006\u0002\u0010\n\u001aW\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\t2\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017¢\u0006\u0002\u0010\u000e\u001ai\u0010\u0015\u001a$\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r2(\u0010\u0006\u001a$\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017¢\u0006\u0002\u0010\u0011\u001a{\u0010\u0015\u001a*\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u00102.\u0010\u0006\u001a*\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"movableContentKey", "", "movableContentOf", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "(Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "Lkotlin/Function1;", "P", "(Lkotlin/jvm/functions/Function3;)Lkotlin/jvm/functions/Function3;", "Lkotlin/Function2;", "P1", "P2", "(Lkotlin/jvm/functions/Function4;)Lkotlin/jvm/functions/Function4;", "Lkotlin/Function3;", "P3", "(Lkotlin/jvm/functions/Function5;)Lkotlin/jvm/functions/Function5;", "Lkotlin/Function4;", "P4", "(Lkotlin/jvm/functions/Function6;)Lkotlin/jvm/functions/Function6;", "movableContentWithReceiverOf", "R", "Lkotlin/ExtensionFunctionType;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MovableContentKt {
    public static final int movableContentKey = 126665345;

    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MovableContent<Unit> f14594p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MovableContent<Unit> movableContent) {
            super(2);
            this.f14594p0 = movableContent;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-642339857, iIntValue, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:39)");
                }
                composer2.insertMovableContent(this.f14594p0, Unit.INSTANCE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class b<P> extends Lambda implements Function3<P, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MovableContent<P> f14595p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MovableContent<P> movableContent) {
            super(3);
            this.f14595p0 = movableContent;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Object obj, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? composer2.changed(obj) : composer2.changedInstance(obj) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-434707029, iIntValue, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:64)");
                }
                composer2.insertMovableContent(this.f14595p0, obj);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, P2] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class c<P1, P2> extends Lambda implements Function4<P1, P2, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MovableContent<Pair<P1, P2>> f14596p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MovableContent<Pair<P1, P2>> movableContent) {
            super(4);
            this.f14596p0 = movableContent;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(Object obj, Object obj2, Composer composer, Integer num) {
            int i10;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                i10 = ((iIntValue & 8) == 0 ? composer2.changed(obj) : composer2.changedInstance(obj) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i10 |= (iIntValue & 64) == 0 ? composer2.changed(obj2) : composer2.changedInstance(obj2) ? 32 : 16;
            }
            if ((i10 & 147) == 146 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1200019734, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:89)");
                }
                composer2.insertMovableContent(this.f14596p0, TuplesKt.to(obj, obj2));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, P2, P3] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class d<P1, P2, P3> extends Lambda implements Function5<P1, P2, P3, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MovableContent<Pair<Pair<P1, P2>, P3>> f14597p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MovableContent<Pair<Pair<P1, P2>, P3>> movableContent) {
            super(5);
            this.f14597p0 = movableContent;
        }

        @Override // kotlin.jvm.functions.Function5
        public final Unit invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
            int i10;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                i10 = ((iIntValue & 8) == 0 ? composer2.changed(obj) : composer2.changedInstance(obj) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i10 |= (iIntValue & 64) == 0 ? composer2.changed(obj2) : composer2.changedInstance(obj2) ? 32 : 16;
            }
            if ((iIntValue & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
                i10 |= (iIntValue & 512) == 0 ? composer2.changed(obj3) : composer2.changedInstance(obj3) ? 256 : 128;
            }
            if ((i10 & 1171) == 1170 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1083870185, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:118)");
                }
                composer2.insertMovableContent(this.f14597p0, TuplesKt.to(TuplesKt.to(obj, obj2), obj3));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, P2, P3, P4] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class e<P1, P2, P3, P4> extends Lambda implements Function6<P1, P2, P3, P4, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MovableContent<Pair<Pair<P1, P2>, Pair<P3, P4>>> f14598p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MovableContent<Pair<Pair<P1, P2>, Pair<P3, P4>>> movableContent) {
            super(6);
            this.f14598p0 = movableContent;
        }

        @Override // kotlin.jvm.functions.Function6
        public final Unit invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
            int i10;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                i10 = ((iIntValue & 8) == 0 ? composer2.changed(obj) : composer2.changedInstance(obj) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i10 |= (iIntValue & 64) == 0 ? composer2.changed(obj2) : composer2.changedInstance(obj2) ? 32 : 16;
            }
            if ((iIntValue & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
                i10 |= (iIntValue & 512) == 0 ? composer2.changed(obj3) : composer2.changedInstance(obj3) ? 256 : 128;
            }
            if ((iIntValue & 3072) == 0) {
                i10 |= (iIntValue & 4096) == 0 ? composer2.changed(obj4) : composer2.changedInstance(obj4) ? 2048 : 1024;
            }
            if ((i10 & 9363) == 9362 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741877681, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:147)");
                }
                composer2.insertMovableContent(this.f14598p0, TuplesKt.to(TuplesKt.to(obj, obj2), TuplesKt.to(obj3, obj4)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class f extends Lambda implements Function3<Unit, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f14599p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function2<? super Composer, ? super Integer, Unit> function2) {
            super(3);
            this.f14599p0 = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Unit unit, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1079330685, iIntValue, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
                }
                this.f14599p0.invoke(composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, P2] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class g<P1, P2> extends Lambda implements Function3<Pair<? extends P1, ? extends P2>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function4<P1, P2, Composer, Integer, Unit> f14600p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function4<? super P1, ? super P2, ? super Composer, ? super Integer, Unit> function4) {
            super(3);
            this.f14600p0 = function4;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Object obj, Composer composer, Integer num) {
            Pair pair = (Pair) obj;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? composer2.changed(pair) : composer2.changedInstance(pair) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1849814513, iIntValue, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:87)");
                }
                this.f14600p0.invoke((P1) pair.getFirst(), (P2) pair.getSecond(), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, P2, P3] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class h<P1, P2, P3> extends Lambda implements Function3<Pair<? extends Pair<? extends P1, ? extends P2>, ? extends P3>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function5<P1, P2, P3, Composer, Integer, Unit> f14601p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function5<? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, Unit> function5) {
            super(3);
            this.f14601p0 = function5;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Object obj, Composer composer, Integer num) {
            Pair pair = (Pair) obj;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? composer2.changed(pair) : composer2.changedInstance(pair) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-284417101, iIntValue, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:115)");
                }
                this.f14601p0.invoke((P1) ((Pair) pair.getFirst()).getFirst(), (P2) ((Pair) pair.getFirst()).getSecond(), (P3) pair.getSecond(), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, P2, P3, P4] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class i<P1, P2, P3, P4> extends Lambda implements Function3<Pair<? extends Pair<? extends P1, ? extends P2>, ? extends Pair<? extends P3, ? extends P4>>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function6<P1, P2, P3, P4, Composer, Integer, Unit> f14602p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function6<? super P1, ? super P2, ? super P3, ? super P4, ? super Composer, ? super Integer, Unit> function6) {
            super(3);
            this.f14602p0 = function6;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Object obj, Composer composer, Integer num) {
            Pair pair = (Pair) obj;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? composer2.changed(pair) : composer2.changedInstance(pair) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1876318581, iIntValue, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:144)");
                }
                this.f14602p0.invoke((P1) ((Pair) pair.getFirst()).getFirst(), (P2) ((Pair) pair.getFirst()).getSecond(), (P3) ((Pair) pair.getSecond()).getFirst(), (P4) ((Pair) pair.getSecond()).getSecond(), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class j<R> extends Lambda implements Function3<R, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MovableContent<R> f14603p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MovableContent<R> movableContent) {
            super(3);
            this.f14603p0 = movableContent;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Object obj, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? composer2.changed(obj) : composer2.changedInstance(obj) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(506997506, iIntValue, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:172)");
                }
                composer2.insertMovableContent(this.f14603p0, obj);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, R] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class k<P, R> extends Lambda implements Function4<R, P, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MovableContent<Pair<R, P>> f14604p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MovableContent<Pair<R, P>> movableContent) {
            super(4);
            this.f14604p0 = movableContent;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(Object obj, Object obj2, Composer composer, Integer num) {
            int i10;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                i10 = ((iIntValue & 8) == 0 ? composer2.changed(obj) : composer2.changedInstance(obj) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i10 |= (iIntValue & 64) == 0 ? composer2.changed(obj2) : composer2.changedInstance(obj2) ? 32 : 16;
            }
            if ((i10 & 147) == 146 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(627354118, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:199)");
                }
                composer2.insertMovableContent(this.f14604p0, TuplesKt.to(obj, obj2));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, R, P2] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class l<P1, P2, R> extends Lambda implements Function5<R, P1, P2, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MovableContent<Pair<Pair<R, P1>, P2>> f14605p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MovableContent<Pair<Pair<R, P1>, P2>> movableContent) {
            super(5);
            this.f14605p0 = movableContent;
        }

        @Override // kotlin.jvm.functions.Function5
        public final Unit invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
            int i10;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                i10 = ((iIntValue & 8) == 0 ? composer2.changed(obj) : composer2.changedInstance(obj) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i10 |= (iIntValue & 64) == 0 ? composer2.changed(obj2) : composer2.changedInstance(obj2) ? 32 : 16;
            }
            if ((iIntValue & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
                i10 |= (iIntValue & 512) == 0 ? composer2.changed(obj3) : composer2.changedInstance(obj3) ? 256 : 128;
            }
            if ((i10 & 1171) == 1170 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(583402949, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:228)");
                }
                composer2.insertMovableContent(this.f14605p0, TuplesKt.to(TuplesKt.to(obj, obj2), obj3));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, R, P2, P3] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class m<P1, P2, P3, R> extends Lambda implements Function6<R, P1, P2, P3, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MovableContent<Pair<Pair<R, P1>, Pair<P2, P3>>> f14606p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MovableContent<Pair<Pair<R, P1>, Pair<P2, P3>>> movableContent) {
            super(6);
            this.f14606p0 = movableContent;
        }

        @Override // kotlin.jvm.functions.Function6
        public final Unit invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
            int i10;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                i10 = ((iIntValue & 8) == 0 ? composer2.changed(obj) : composer2.changedInstance(obj) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i10 |= (iIntValue & 64) == 0 ? composer2.changed(obj2) : composer2.changedInstance(obj2) ? 32 : 16;
            }
            if ((iIntValue & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
                i10 |= (iIntValue & 512) == 0 ? composer2.changed(obj3) : composer2.changedInstance(obj3) ? 256 : 128;
            }
            if ((iIntValue & 3072) == 0) {
                i10 |= (iIntValue & 4096) == 0 ? composer2.changed(obj4) : composer2.changedInstance(obj4) ? 2048 : 1024;
            }
            if ((i10 & 9363) == 9362 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1468683306, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:257)");
                }
                composer2.insertMovableContent(this.f14606p0, TuplesKt.to(TuplesKt.to(obj, obj2), TuplesKt.to(obj3, obj4)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class n<R> extends Lambda implements Function3<R, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<R, Composer, Integer, Unit> f14607p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(Function3<? super R, ? super Composer, ? super Integer, Unit> function3) {
            super(3);
            this.f14607p0 = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Object obj, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? composer2.changed(obj) : composer2.changedInstance(obj) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(250838178, iIntValue, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:170)");
                }
                this.f14607p0.invoke(obj, composer2, Integer.valueOf(iIntValue & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, R] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class o<P, R> extends Lambda implements Function3<Pair<? extends R, ? extends P>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function4<R, P, Composer, Integer, Unit> f14608p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(Function4<? super R, ? super P, ? super Composer, ? super Integer, Unit> function4) {
            super(3);
            this.f14608p0 = function4;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Object obj, Composer composer, Integer num) {
            Pair pair = (Pair) obj;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? composer2.changed(pair) : composer2.changedInstance(pair) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(812082854, iIntValue, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
                }
                this.f14608p0.invoke((R) pair.getFirst(), (P) pair.getSecond(), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, R, P2] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class p<P1, P2, R> extends Lambda implements Function3<Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function5<R, P1, P2, Composer, Integer, Unit> f14609p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(Function5<? super R, ? super P1, ? super P2, ? super Composer, ? super Integer, Unit> function5) {
            super(3);
            this.f14609p0 = function5;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Object obj, Composer composer, Integer num) {
            Pair pair = (Pair) obj;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? composer2.changed(pair) : composer2.changedInstance(pair) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1322148760, iIntValue, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:225)");
                }
                this.f14609p0.invoke((R) ((Pair) pair.getFirst()).getFirst(), (P1) ((Pair) pair.getFirst()).getSecond(), (P2) pair.getSecond(), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, R, P2, P3] */
    /* JADX INFO: compiled from: MovableContent.kt */
    public static final class q<P1, P2, P3, R> extends Lambda implements Function3<Pair<? extends Pair<? extends R, ? extends P1>, ? extends Pair<? extends P2, ? extends P3>>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function6<R, P1, P2, P3, Composer, Integer, Unit> f14610p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(Function6<? super R, ? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, Unit> function6) {
            super(3);
            this.f14610p0 = function6;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Object obj, Composer composer, Integer num) {
            Pair pair = (Pair) obj;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? composer2.changed(pair) : composer2.changedInstance(pair) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(838586922, iIntValue, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:254)");
                }
                this.f14610p0.invoke((R) ((Pair) pair.getFirst()).getFirst(), (P1) ((Pair) pair.getFirst()).getSecond(), (P2) ((Pair) pair.getSecond()).getFirst(), (P3) ((Pair) pair.getSecond()).getSecond(), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Function2<Composer, Integer, Unit> movableContentOf(@NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
        return ComposableLambdaKt.composableLambdaInstance(-642339857, true, new a(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1079330685, true, new f(function2)))));
    }

    @ComposableInferredTarget(scheme = "[0[0]:[_]]")
    @NotNull
    public static final <R> Function3<R, Composer, Integer, Unit> movableContentWithReceiverOf(@NotNull Function3<? super R, ? super Composer, ? super Integer, Unit> function3) {
        return ComposableLambdaKt.composableLambdaInstance(506997506, true, new j(new MovableContent(ComposableLambdaKt.composableLambdaInstance(250838178, true, new n(function3)))));
    }

    @NotNull
    public static final <P> Function3<P, Composer, Integer, Unit> movableContentOf(@NotNull Function3<? super P, ? super Composer, ? super Integer, Unit> function3) {
        return ComposableLambdaKt.composableLambdaInstance(-434707029, true, new b(new MovableContent(function3)));
    }

    @NotNull
    public static final <R, P> Function4<R, P, Composer, Integer, Unit> movableContentWithReceiverOf(@NotNull Function4<? super R, ? super P, ? super Composer, ? super Integer, Unit> function4) {
        return ComposableLambdaKt.composableLambdaInstance(627354118, true, new k(new MovableContent(ComposableLambdaKt.composableLambdaInstance(812082854, true, new o(function4)))));
    }

    @NotNull
    public static final <P1, P2> Function4<P1, P2, Composer, Integer, Unit> movableContentOf(@NotNull Function4<? super P1, ? super P2, ? super Composer, ? super Integer, Unit> function4) {
        return ComposableLambdaKt.composableLambdaInstance(-1200019734, true, new c(new MovableContent(ComposableLambdaKt.composableLambdaInstance(1849814513, true, new g(function4)))));
    }

    @NotNull
    public static final <R, P1, P2> Function5<R, P1, P2, Composer, Integer, Unit> movableContentWithReceiverOf(@NotNull Function5<? super R, ? super P1, ? super P2, ? super Composer, ? super Integer, Unit> function5) {
        return ComposableLambdaKt.composableLambdaInstance(583402949, true, new l(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1322148760, true, new p(function5)))));
    }

    @NotNull
    public static final <P1, P2, P3> Function5<P1, P2, P3, Composer, Integer, Unit> movableContentOf(@NotNull Function5<? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, Unit> function5) {
        return ComposableLambdaKt.composableLambdaInstance(-1083870185, true, new d(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-284417101, true, new h(function5)))));
    }

    @NotNull
    public static final <R, P1, P2, P3> Function6<R, P1, P2, P3, Composer, Integer, Unit> movableContentWithReceiverOf(@NotNull Function6<? super R, ? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, Unit> function6) {
        return ComposableLambdaKt.composableLambdaInstance(1468683306, true, new m(new MovableContent(ComposableLambdaKt.composableLambdaInstance(838586922, true, new q(function6)))));
    }

    @NotNull
    public static final <P1, P2, P3, P4> Function6<P1, P2, P3, P4, Composer, Integer, Unit> movableContentOf(@NotNull Function6<? super P1, ? super P2, ? super P3, ? super P4, ? super Composer, ? super Integer, Unit> function6) {
        return ComposableLambdaKt.composableLambdaInstance(-1741877681, true, new e(new MovableContent(ComposableLambdaKt.composableLambdaInstance(1876318581, true, new i(function6)))));
    }
}
