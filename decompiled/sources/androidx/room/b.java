package androidx.room;

import androidx.sqlite.db.SupportSQLiteQuery;
import com.facetec.sdk.dr;
import com.facetec.sdk.dt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f23362p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f23363q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f23364r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f23365s0;

    public /* synthetic */ b(Object obj, Object obj2, int i10, Object obj3) {
        this.f23362p0 = i10;
        this.f23363q0 = obj;
        this.f23364r0 = obj2;
        this.f23365s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f23362p0;
        Object obj = this.f23365s0;
        Object obj2 = this.f23364r0;
        Object obj3 = this.f23363q0;
        switch (i10) {
            case 0:
                QueryInterceptorDatabase this$0 = (QueryInterceptorDatabase) obj3;
                SupportSQLiteQuery query = (SupportSQLiteQuery) obj2;
                QueryInterceptorProgram queryInterceptorProgram = (QueryInterceptorProgram) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(query, "$query");
                Intrinsics.checkNotNullParameter(queryInterceptorProgram, "$queryInterceptorProgram");
                this$0.f23255r0.onQuery(query.getF23480p0(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
                break;
            default:
                ((dr) obj3).b((dr.a) obj2, (dt) obj);
                break;
        }
    }
}
