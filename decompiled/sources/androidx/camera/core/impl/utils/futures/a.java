package androidx.camera.core.impl.utils.futures;

import android.app.Activity;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.bbva.cellscore.channel.builder.refactor.WebNavigationDecision;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.google.common.util.concurrent.ListenableFuture;
import com.noknok.android.client.utils.Promise;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements CallbackToFutureAdapter.Resolver, Reaction.NavigationExecution, Promise.Listener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2144p0;

    public /* synthetic */ a(Object obj) {
        this.f2144p0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return Futures.lambda$nonCancellationPropagating$0((ListenableFuture) this.f2144p0, completer);
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.NavigationExecution
    public final void execute(Activity activity, Object obj, Object obj2) {
        ((WebController) obj).openWeb(activity, ((WebNavigationDecision) this.f2144p0).choice(obj2), obj2);
    }

    @Override // com.noknok.android.client.utils.Promise.Listener
    public final Object onDone(Object obj) {
        return ((Promise) this.f2144p0).b(obj);
    }
}
