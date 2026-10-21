package androidx.datastore.core;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", i = {0, 1}, l = {42, 57}, m = "runMigrations", n = {"cleanUps", "cleanUpFailure"}, s = {"L$0", "L$0"})
public final class a<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Serializable f20732p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Iterator f20733q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public /* synthetic */ Object f20734r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ DataMigrationInitializer.Companion f20735s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f20736t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DataMigrationInitializer.Companion companion, Continuation<? super a> continuation) {
        super(continuation);
        this.f20735s0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f20734r0 = obj;
        this.f20736t0 |= Integer.MIN_VALUE;
        return DataMigrationInitializer.Companion.access$runMigrations(this.f20735s0, null, null, this);
    }
}
