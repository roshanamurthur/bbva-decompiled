package com.bbva.plugin.socialsharing.command;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import bk.q;
import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.socialsharing.model.request.ShareRequest;
import com.bbva.socialsharing.SocialSharing;
import com.bbva.socialsharing.model.ShareData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/socialsharing/command/Share;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/socialsharing/model/request/ShareRequest;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/socialsharing/SocialSharing;", "socialSharing", "<init>", "(Lcom/bbva/socialsharing/SocialSharing;)V", "Companion", "socialsharing-plugin_release"}, k = 1, mv = {1, 4, 0})
public final class Share extends AbstractCommand<ShareRequest> {

    @NotNull
    public static final String ID = "share";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SocialSharing f36053p0;

    /* JADX INFO: compiled from: Share.kt */
    public static final class a<T> implements Consumer<Activity> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ShareRequest f36055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f36056c;

        public a(ShareRequest shareRequest, CommandCallback commandCallback) {
            this.f36055b = shareRequest;
            this.f36056c = commandCallback;
        }

        @Override // com.bbva.androidtoolkit.optional.function.Consumer
        public final void accept(Activity activity) {
            Activity it = activity;
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            Share.access$execute(Share.this, it, this.f36055b, this.f36056c);
        }
    }

    /* JADX INFO: compiled from: Share.kt */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f36057p0;

        public b(CommandCallback commandCallback) {
            this.f36057p0 = commandCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f36057p0.sendError(Errors.ErrorNotAvailable);
        }
    }

    public Share(@NotNull SocialSharing socialSharing) {
        super(ShareRequest.class);
        this.f36053p0 = socialSharing;
    }

    public static ShareData a(@NotNull ShareRequest.Content content) throws IllegalArgumentException {
        return ShareData.INSTANCE.fromMap(q.mapOf(TuplesKt.to("source", content.getSource()), TuplesKt.to("filename", content.getFilename()), TuplesKt.to("content", content.getContent())));
    }

    public static final void access$execute(Share share, @NotNull Activity activity, @NotNull ShareRequest shareRequest, @NotNull CommandCallback commandCallback) {
        share.getClass();
        try {
            SocialSharing socialSharing = share.f36053p0;
            String title = shareRequest.getTitle();
            List<ShareRequest.Content> contents = shareRequest.getContents();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(contents, 10));
            Iterator<T> it = contents.iterator();
            while (it.hasNext()) {
                arrayList.add(a((ShareRequest.Content) it.next()));
            }
            Object[] array = arrayList.toArray(new ShareData[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            ShareData[] shareDataArr = (ShareData[]) array;
            socialSharing.share(activity, title, (ShareData[]) Arrays.copyOf(shareDataArr, shareDataArr.length));
            commandCallback.sendEvent();
        } catch (ActivityNotFoundException unused) {
            commandCallback.sendError(Errors.ErrorNotSupported);
        } catch (IllegalArgumentException unused2) {
            commandCallback.sendError(Errors.ErrorMalformedParam);
        } catch (UnsupportedOperationException unused3) {
            commandCallback.sendError(Errors.ErrorNotAvailable);
        } catch (Exception unused4) {
            commandCallback.sendError(Errors.ErrorDefault);
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull ShareRequest params, @NotNull CommandCallback callback) {
        this.mActivityContainer.get().ifPresentOrElse(new a(params, callback), new b(callback));
    }
}
