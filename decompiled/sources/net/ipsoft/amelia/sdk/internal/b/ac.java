package net.ipsoft.amelia.sdk.internal.b;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public class ac extends m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f84687l;
    public final Uri m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final net.ipsoft.amelia.sdk.internal.common.f f84688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f84689o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f84690p;

    public ac(Context context, Uri uri, net.ipsoft.amelia.sdk.internal.common.f fVar) {
        super(fVar.a());
        this.f84743j = null;
        this.f84687l = context;
        this.m = uri;
        String type = context.getContentResolver().getType(uri);
        this.f84690p = type;
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
        this.f84689o = extensionFromMimeType != null ? Constant.DOT_STRING.concat(extensionFromMimeType) : null;
        this.f84688n = fVar;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String a(String str) {
        return androidx.camera.camera2.internal.compat.u.f(str, "/Amelia/api/cm/upload");
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public void b() throws IOException {
        Context context = this.f84687l;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(this.m);
        File fileCreateTempFile = File.createTempFile("amelia_upload_", this.f84689o, context.getCacheDir());
        this.f84743j = fileCreateTempFile;
        net.ipsoft.amelia.sdk.internal.common.j.a(inputStreamOpenInputStream, fileCreateTempFile);
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String c() {
        return this.f84690p;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String f() {
        return "*/*";
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String g() {
        return this.f84688n.getConversationId();
    }
}
