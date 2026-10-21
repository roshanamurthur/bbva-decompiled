package net.ipsoft.amelia.sdk.internal.common;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import net.ipsoft.amelia.sdk.ContentDisplayOption;
import net.ipsoft.amelia.sdk.IAmeliaError;
import net.ipsoft.amelia.sdk.IDownloadListener;
import net.ipsoft.amelia.sdk.IDownloadMessage;
import net.ipsoft.amelia.sdk.IDownloadedMmo;
import net.ipsoft.amelia.sdk.IResourceToDisplay;
import net.ipsoft.amelia.sdk.internal.b.aa;
import net.ipsoft.amelia.sdk.internal.b.ab;
import net.ipsoft.amelia.sdk.internal.b.n;

/* JADX INFO: loaded from: classes12.dex */
public class h implements IDownloadMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f84864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f84865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IAmeliaError f84866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IDownloadedMmo f84867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IResourceToDisplay f84868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f84869f;

    public class a extends ab {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ File f84870i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ IDownloadListener f84871j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, File file2, IDownloadListener iDownloadListener) {
            super(file);
            this.f84870i = file2;
            this.f84871j = iDownloadListener;
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.o
        public final void a() {
            net.ipsoft.amelia.sdk.internal.b.l lVar = this.f84764f;
            IDownloadListener iDownloadListener = this.f84871j;
            h hVar = h.this;
            if (lVar == null) {
                i iVar = new i(Uri.fromFile(this.f84870i), this.f84763e);
                hVar.f84867d = iVar;
                iDownloadListener.onDownloadSuccess(iVar);
            } else {
                i iVar2 = new i(new c(lVar, "Failed to download MMO"));
                hVar.f84867d = iVar2;
                hVar.f84866c = iVar2.getRecentError();
                iDownloadListener.onDownloadFailed(iVar2.getRecentError());
            }
        }
    }

    public h(n nVar, f fVar, IResourceToDisplay iResourceToDisplay, String str) {
        this.f84868e = iResourceToDisplay;
        this.f84865b = fVar;
        this.f84864a = nVar;
        this.f84869f = str;
    }

    @Override // net.ipsoft.amelia.sdk.IDownloadMessage
    public void download(IDownloadListener iDownloadListener, Context context) {
        download(iDownloadListener, context.getCacheDir());
    }

    @Override // net.ipsoft.amelia.sdk.IDownloadMessage
    public ContentDisplayOption getContentDisplayOption() {
        return this.f84868e.getDisplayOption();
    }

    @Override // net.ipsoft.amelia.sdk.IDownloadMessage
    public IAmeliaError getError() {
        return this.f84866c;
    }

    @Override // net.ipsoft.amelia.sdk.IDownloadMessage
    public IResourceToDisplay getFileInfo() {
        return this.f84868e;
    }

    @Override // net.ipsoft.amelia.sdk.IDownloadMessage
    public String getMimeType() {
        IDownloadedMmo iDownloadedMmo = this.f84867d;
        if (iDownloadedMmo != null) {
            return iDownloadedMmo.getMimeType();
        }
        return null;
    }

    @Override // net.ipsoft.amelia.sdk.IDownloadMessage
    public Uri getUri() {
        IDownloadedMmo iDownloadedMmo = this.f84867d;
        if (iDownloadedMmo != null) {
            return iDownloadedMmo.getUri();
        }
        return null;
    }

    @Override // net.ipsoft.amelia.sdk.IDownloadMessage
    public void download(IDownloadListener iDownloadListener, File file) {
        IResourceToDisplay iResourceToDisplay = this.f84868e;
        File file2 = new File(file, iResourceToDisplay.getFilename());
        this.f84864a.a(new aa(this.f84865b, iResourceToDisplay, this.f84869f), new a(file2, file2, iDownloadListener));
    }
}
