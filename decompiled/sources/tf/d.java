package tf;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f93564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f93565c;

    public /* synthetic */ d(Object obj, Object obj2, int i10) {
        this.f93563a = i10;
        this.f93564b = obj;
        this.f93565c = obj2;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i10 = this.f93563a;
        Object obj = this.f93565c;
        Object obj2 = this.f93564b;
        switch (i10) {
            case 0:
                ComponentRuntime componentRuntime = (ComponentRuntime) obj2;
                Component component = (Component) obj;
                componentRuntime.getClass();
                return component.getFactory().create(new n(component, componentRuntime));
            default:
                return new gg.f((Context) obj2, (String) obj);
        }
    }
}
