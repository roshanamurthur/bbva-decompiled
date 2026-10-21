package j;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final FullyDrawnReporter f78724p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Function0<Boolean> f78725q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final SnapshotStateObserver f78726r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final a f78727s0;

    /* JADX INFO: compiled from: ReportDrawn.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Function0<? extends Boolean>, Unit> {
        public a(Object obj) {
            super(1, obj, c.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Boolean> function0) {
            Function0<? extends Boolean> function1 = function0;
            c cVar = (c) this.receiver;
            cVar.getClass();
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            d dVar = new d(booleanRef, function1);
            SnapshotStateObserver snapshotStateObserver = cVar.f78726r0;
            snapshotStateObserver.observeReads(function1, cVar.f78727s0, dVar);
            if (booleanRef.element) {
                snapshotStateObserver.clear(cVar.f78725q0);
                FullyDrawnReporter fullyDrawnReporter = cVar.f78724p0;
                if (!fullyDrawnReporter.isFullyDrawnReported()) {
                    fullyDrawnReporter.removeReporter();
                }
                snapshotStateObserver.clear();
                snapshotStateObserver.stop();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ReportDrawn.kt */
    public static final class b extends Lambda implements Function1<Function0<? extends Unit>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f78728p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public c(@NotNull FullyDrawnReporter fullyDrawnReporter, @NotNull Function0<Boolean> function0) {
        this.f78724p0 = fullyDrawnReporter;
        this.f78725q0 = function0;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(b.f78728p0);
        snapshotStateObserver.start();
        this.f78726r0 = snapshotStateObserver;
        a aVar = new a(this);
        this.f78727s0 = aVar;
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return;
        }
        fullyDrawnReporter.addReporter();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        snapshotStateObserver.observeReads(function0, aVar, new d(booleanRef, function0));
        if (booleanRef.element) {
            snapshotStateObserver.clear(function0);
            if (!fullyDrawnReporter.isFullyDrawnReported()) {
                fullyDrawnReporter.removeReporter();
            }
            snapshotStateObserver.clear();
            snapshotStateObserver.stop();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SnapshotStateObserver snapshotStateObserver = this.f78726r0;
        snapshotStateObserver.clear();
        snapshotStateObserver.stop();
        return Unit.INSTANCE;
    }
}
