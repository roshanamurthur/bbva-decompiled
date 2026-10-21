package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bbva.ethermobilesdk.deviceinfo.component.Sys;
import com.esotericsoftware.kryo.serializers.z;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.objenesis.strategy.PlatformDescription;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes13.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f93077c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Constructor<MethodHandles.Lookup> f93079b;

    /* JADX INFO: compiled from: Platform.java */
    public static final class a extends f {

        /* JADX INFO: renamed from: retrofit2.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Platform.java */
        public static final class ExecutorC0488a implements Executor {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Handler f93080p0 = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f93080p0.post(runnable);
            }
        }

        @Override // retrofit2.f
        public final Executor a() {
            return new ExecutorC0488a();
        }

        @Override // retrofit2.f
        @Nullable
        public final Object b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        f fVar;
        if (PlatformDescription.DALVIK.equals(System.getProperty(Sys.VM_NAME))) {
            fVar = new a(Build.VERSION.SDK_INT >= 24);
        } else {
            fVar = new f(true);
        }
        f93077c = fVar;
    }

    public f(boolean z10) {
        this.f93078a = z10;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z10) {
            try {
                declaredConstructor = androidx.compose.ui.platform.b.j().getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f93079b = declaredConstructor;
    }

    @Nullable
    public Executor a() {
        return null;
    }

    @Nullable
    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f93079b;
        return (constructor != null ? z.g(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
