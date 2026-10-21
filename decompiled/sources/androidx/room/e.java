package androidx.room;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f23372p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f23373q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f23374r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f23375s0;

    public /* synthetic */ e(QueryInterceptorDatabase queryInterceptorDatabase, String str, List list) {
        this.f23374r0 = queryInterceptorDatabase;
        this.f23373q0 = str;
        this.f23375s0 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f23372p0;
        String sql = this.f23373q0;
        Object obj = this.f23375s0;
        Object obj2 = this.f23374r0;
        switch (i10) {
            case 0:
                QueryInterceptorDatabase this$0 = (QueryInterceptorDatabase) obj2;
                List<? extends Object> inputArguments = (List) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(sql, "$sql");
                Intrinsics.checkNotNullParameter(inputArguments, "$inputArguments");
                this$0.f23255r0.onQuery(sql, inputArguments);
                break;
            default:
                String format = (String) obj2;
                Object[] arg = (Object[]) obj;
                Intrinsics.checkNotNullParameter(sql, "$tag");
                Intrinsics.checkNotNullParameter(format, "$format");
                Intrinsics.checkNotNullParameter(arg, "$arg");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(arg, arg.length);
                Intrinsics.checkNotNullExpressionValue(String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "format(...)");
                break;
        }
    }

    public /* synthetic */ e(String str, String str2, Object[] objArr) {
        this.f23373q0 = str;
        this.f23374r0 = str2;
        this.f23375s0 = objArr;
    }
}
