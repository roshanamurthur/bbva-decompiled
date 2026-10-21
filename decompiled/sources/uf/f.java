package uf;

import android.util.Log;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93818p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f93819q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f93820r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f93821s0;

    public /* synthetic */ f(Object obj, Object obj2, int i10, Object obj3) {
        this.f93818p0 = i10;
        this.f93819q0 = obj;
        this.f93820r0 = obj2;
        this.f93821s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f93818p0;
        Object obj = this.f93821s0;
        Object obj2 = this.f93820r0;
        Object obj3 = this.f93819q0;
        switch (i10) {
            case 0:
                i iVar = (i) obj3;
                iVar.getClass();
                iVar.f93828p0.execute(new androidx.camera.core.impl.q((Runnable) obj2, (j.b) obj, 3));
                break;
            default:
                String tag = (String) obj3;
                String format = (String) obj2;
                Object[] arg = (Object[]) obj;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(format, "$format");
                Intrinsics.checkNotNullParameter(arg, "$arg");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(arg, arg.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                Log.wtf(tag, str);
                break;
        }
    }
}
