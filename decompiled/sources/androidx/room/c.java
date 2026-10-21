package androidx.room;

import android.content.Context;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkModuleConfig;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f23366p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f23367q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f23368r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f23369s0;

    public /* synthetic */ c(Object obj, Object obj2, int i10, Object obj3) {
        this.f23366p0 = i10;
        this.f23367q0 = obj;
        this.f23368r0 = obj2;
        this.f23369s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f23366p0;
        Object obj = this.f23367q0;
        Object obj2 = this.f23369s0;
        Object obj3 = this.f23368r0;
        switch (i10) {
            case 0:
                QueryInterceptorDatabase this$0 = (QueryInterceptorDatabase) obj;
                String query = (String) obj3;
                Object[] bindArgs = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(query, "$query");
                Intrinsics.checkNotNullParameter(bindArgs, "$bindArgs");
                this$0.f23255r0.onQuery(query, ArraysKt___ArraysKt.toList(bindArgs));
                break;
            case 1:
                SFMCSdk.Companion.m5502configure$lambda10$lambda9((SFMCSdkModuleConfig) obj, (Function1) obj3, (Context) obj2);
                break;
            default:
                String tag = (String) obj3;
                Throwable tr = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(tr, "$tr");
                break;
        }
    }

    public /* synthetic */ c(String str, String str2, Throwable th2) {
        this.f23366p0 = 2;
        this.f23368r0 = str;
        this.f23367q0 = str2;
        this.f23369s0 = th2;
    }
}
