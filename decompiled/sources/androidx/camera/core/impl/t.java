package androidx.camera.core.impl;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import androidx.emoji2.text.MetadataRepo;
import androidx.room.QueryInterceptorDatabase;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2137p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2138q0;

    public /* synthetic */ t(Object obj, int i10) {
        this.f2137p0 = i10;
        this.f2138q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2137p0) {
            case 0:
                ((ListenableFuture) this.f2138q0).cancel(true);
                return;
            case 1:
                FontRequestEmojiCompatConfig.a aVar = (FontRequestEmojiCompatConfig.a) this.f2138q0;
                synchronized (aVar.f21286d) {
                    try {
                        if (aVar.f21291i == null) {
                            return;
                        }
                        try {
                            FontsContractCompat.FontInfo fontInfoC = aVar.c();
                            int resultCode = fontInfoC.getResultCode();
                            if (resultCode == 2) {
                                synchronized (aVar.f21286d) {
                                    try {
                                        FontRequestEmojiCompatConfig.RetryPolicy retryPolicy = aVar.f21290h;
                                        if (retryPolicy != null) {
                                            long retryDelay = retryPolicy.getRetryDelay();
                                            if (retryDelay >= 0) {
                                                aVar.d(fontInfoC.getUri(), retryDelay);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                            if (resultCode != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + resultCode + ")");
                            }
                            try {
                                TraceCompat.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Typeface typefaceBuildTypeface = aVar.f21285c.buildTypeface(aVar.f21283a, fontInfoC);
                                ByteBuffer byteBufferMmap = TypefaceCompatUtil.mmap(aVar.f21283a, null, fontInfoC.getUri());
                                if (byteBufferMmap == null || typefaceBuildTypeface == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                MetadataRepo metadataRepoCreate = MetadataRepo.create(typefaceBuildTypeface, byteBufferMmap);
                                TraceCompat.endSection();
                                synchronized (aVar.f21286d) {
                                    try {
                                        EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = aVar.f21291i;
                                        if (metadataRepoLoaderCallback != null) {
                                            metadataRepoLoaderCallback.onLoaded(metadataRepoCreate);
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                    break;
                                }
                                aVar.a();
                                return;
                            } catch (Throwable th4) {
                                TraceCompat.endSection();
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            synchronized (aVar.f21286d) {
                                try {
                                    EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = aVar.f21291i;
                                    if (metadataRepoLoaderCallback2 != null) {
                                        metadataRepoLoaderCallback2.onFailed(th5);
                                    }
                                    aVar.a();
                                    return;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            case 2:
                QueryInterceptorDatabase this$0 = (QueryInterceptorDatabase) this.f2138q0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f23255r0.onQuery("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
                return;
            case 3:
                CommandCallback commandCallback = (CommandCallback) this.f2138q0;
                Intrinsics.checkNotNullParameter(commandCallback, "$commandCallback");
                commandCallback.sendError(Errors.ErrorNotAvailable);
                return;
            case 4:
                SelfieFragment selfieFragment = (SelfieFragment) this.f2138q0;
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                selfieFragment.E();
                return;
            case 5:
                WorkInitializer workInitializer = (WorkInitializer) this.f2138q0;
                workInitializer.getClass();
                workInitializer.f43850d.runCriticalSection(new z0.c(workInitializer));
                return;
            default:
                com.visa.internal.a.b((MediaPlayer) this.f2138q0);
                return;
        }
    }
}
