package androidx.room;

import androidx.camera.core.impl.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MultiInstanceInvalidationClient.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/MultiInstanceInvalidationClient$callback$1", "Landroidx/room/IMultiInstanceInvalidationCallback$Stub;", "onInvalidation", "", "tables", "", "", "([Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiInstanceInvalidationClient$callback$1 extends IMultiInstanceInvalidationCallback.Stub {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f23243f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationClient f23244e;

    public MultiInstanceInvalidationClient$callback$1(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        this.f23244e = multiInstanceInvalidationClient;
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public void onInvalidation(@NotNull String[] tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f23244e;
        multiInstanceInvalidationClient.getExecutor().execute(new l(multiInstanceInvalidationClient, tables, 1));
    }
}
