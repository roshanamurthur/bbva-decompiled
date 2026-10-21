package tc;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;

/* JADX INFO: compiled from: LockedResource.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i<Z> implements Resource<Z>, FactoryPools.Poolable {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Pools.Pool<i<?>> f93519t0 = FactoryPools.threadSafe(20, new a());

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final StateVerifier f93520p0 = StateVerifier.newInstance();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Resource<Z> f93521q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f93522r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f93523s0;

    /* JADX INFO: compiled from: LockedResource.java */
    public class a implements FactoryPools.Factory<i<?>> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        public final i<?> create() {
            return new i<>();
        }
    }

    public final synchronized void a() {
        this.f93520p0.throwIfRecycled();
        if (!this.f93522r0) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f93522r0 = false;
        if (this.f93523s0) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public final Z get() {
        return this.f93521q0.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public final Class<Z> getResourceClass() {
        return this.f93521q0.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.f93521q0.getSize();
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @NonNull
    public final StateVerifier getVerifier() {
        return this.f93520p0;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final synchronized void recycle() {
        this.f93520p0.throwIfRecycled();
        this.f93523s0 = true;
        if (!this.f93522r0) {
            this.f93521q0.recycle();
            this.f93521q0 = null;
            f93519t0.release(this);
        }
    }
}
