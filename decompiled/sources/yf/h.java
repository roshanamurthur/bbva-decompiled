package yf;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mypinpad.tsdk.isolation.vh;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Callable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94809p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f94810q0;

    public /* synthetic */ h(Object obj, int i10) {
        this.f94809p0 = i10;
        this.f94810q0 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Map<String, String> mapA;
        switch (this.f94809p0) {
            case 0:
                UserMetadata.a aVar = (UserMetadata.a) this.f94810q0;
                aVar.f47857b.set(null);
                synchronized (aVar) {
                    try {
                        if (aVar.f47856a.isMarked()) {
                            mapA = aVar.f47856a.getReference().a();
                            AtomicMarkableReference<c> atomicMarkableReference = aVar.f47856a;
                            atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                        } else {
                            mapA = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (mapA != null) {
                    UserMetadata userMetadata = aVar.f47859d;
                    userMetadata.f47849a.g(userMetadata.f47851c, mapA, aVar.f47858c);
                }
                return null;
            default:
                return vh.setCompoundDrawableTintBlendMode(new Object[]{(Function0) this.f94810q0}, 1669734589, -1669734586, (int) System.currentTimeMillis());
        }
    }
}
