package kg;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements ComponentFactory {
    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new DefaultUserAgentPublisher(componentContainer.setOf(c.class), GlobalLibraryVersionRegistrar.getInstance());
    }
}
