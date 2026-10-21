package v2;

import androidx.emoji2.text.DefaultEmojiCompatConfig;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import androidx.room.QueryInterceptorDatabase;
import androidx.room.QueryInterceptorProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Callback;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93955p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f93956q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f93957r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f93958s0;

    public /* synthetic */ e(Object obj, Object obj2, int i10, Object obj3) {
        this.f93955p0 = i10;
        this.f93956q0 = obj;
        this.f93957r0 = obj2;
        this.f93958s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f93955p0;
        Object obj = this.f93957r0;
        Object obj2 = this.f93958s0;
        Object obj3 = this.f93956q0;
        switch (i10) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) obj3;
                EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = (EmojiCompat.MetadataRepoLoaderCallback) obj;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) obj2;
                bVar.getClass();
                try {
                    FontRequestEmojiCompatConfig fontRequestEmojiCompatConfigCreate = DefaultEmojiCompatConfig.create(bVar.f21274a);
                    if (fontRequestEmojiCompatConfigCreate == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    fontRequestEmojiCompatConfigCreate.setLoadingExecutor(threadPoolExecutor);
                    fontRequestEmojiCompatConfigCreate.getMetadataRepoLoader().load(new androidx.emoji2.text.c(metadataRepoLoaderCallback, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    metadataRepoLoaderCallback.onFailed(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                QueryInterceptorDatabase this$0 = (QueryInterceptorDatabase) obj3;
                SupportSQLiteQuery query = (SupportSQLiteQuery) obj;
                QueryInterceptorProgram queryInterceptorProgram = (QueryInterceptorProgram) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(query, "$query");
                Intrinsics.checkNotNullParameter(queryInterceptorProgram, "$queryInterceptorProgram");
                this$0.f23255r0.onQuery(query.getF23480p0(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
                return;
            case 2:
                String tag = (String) obj3;
                Throwable tr = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(tr, "$tr");
                return;
            default:
                ((Callback) obj).onFailure(retrofit2.c.b.this, (Throwable) obj2);
                return;
        }
    }
}
