package ud;

import android.content.Context;
import com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.TransportRuntime_Factory;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: compiled from: DaggerTransportRuntimeComponent.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends f {
    public Provider<TransportRuntime> E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Provider<Executor> f93778p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Factory f93779q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Provider f93780r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public SchemaManager_Factory f93781s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Provider<String> f93782t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Provider<SQLiteEventStore> f93783u0;
    public SchedulingModule_WorkSchedulerFactory v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public DefaultScheduler_Factory f93784w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Uploader_Factory f93785x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public WorkInitializer_Factory f93786y0;

    /* JADX INFO: renamed from: ud.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DaggerTransportRuntimeComponent.java */
    public static final class C0500a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f93787a;

        public final a a() {
            Preconditions.checkBuilderRequirement(this.f93787a, Context.class);
            Context context = this.f93787a;
            a aVar = new a();
            aVar.f93778p0 = DoubleCheck.provider(ExecutionModule_ExecutorFactory.create());
            Factory factoryCreate = InstanceFactory.create(context);
            aVar.f93779q0 = factoryCreate;
            aVar.f93780r0 = DoubleCheck.provider(MetadataBackendRegistry_Factory.create(aVar.f93779q0, CreationContextFactory_Factory.create(factoryCreate, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create())));
            aVar.f93781s0 = SchemaManager_Factory.create(aVar.f93779q0, EventStoreModule_DbNameFactory.create(), EventStoreModule_SchemaVersionFactory.create());
            aVar.f93782t0 = DoubleCheck.provider(EventStoreModule_PackageNameFactory.create(aVar.f93779q0));
            aVar.f93783u0 = DoubleCheck.provider(SQLiteEventStore_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), EventStoreModule_StoreConfigFactory.create(), aVar.f93781s0, aVar.f93782t0));
            SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactoryCreate = SchedulingModule_WorkSchedulerFactory.create(aVar.f93779q0, aVar.f93783u0, SchedulingConfigModule_ConfigFactory.create(TimeModule_EventClockFactory.create()), TimeModule_UptimeClockFactory.create());
            aVar.v0 = schedulingModule_WorkSchedulerFactoryCreate;
            Provider<Executor> provider = aVar.f93778p0;
            Provider provider2 = aVar.f93780r0;
            Provider<SQLiteEventStore> provider3 = aVar.f93783u0;
            aVar.f93784w0 = DefaultScheduler_Factory.create(provider, provider2, schedulingModule_WorkSchedulerFactoryCreate, provider3, provider3);
            Factory factory = aVar.f93779q0;
            Provider provider4 = aVar.f93780r0;
            Provider<SQLiteEventStore> provider5 = aVar.f93783u0;
            aVar.f93785x0 = Uploader_Factory.create(factory, provider4, provider5, aVar.v0, aVar.f93778p0, provider5, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), aVar.f93783u0);
            Provider<Executor> provider6 = aVar.f93778p0;
            Provider<SQLiteEventStore> provider7 = aVar.f93783u0;
            aVar.f93786y0 = WorkInitializer_Factory.create(provider6, provider7, aVar.v0, provider7);
            aVar.E0 = DoubleCheck.provider(TransportRuntime_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), aVar.f93784w0, aVar.f93785x0, aVar.f93786y0));
            return aVar;
        }
    }
}
