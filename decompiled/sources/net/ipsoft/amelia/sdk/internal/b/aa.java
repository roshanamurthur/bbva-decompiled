package net.ipsoft.amelia.sdk.internal.b;

import java.util.LinkedHashMap;
import net.ipsoft.amelia.sdk.IResourceToDisplay;

/* JADX INFO: loaded from: classes12.dex */
public class aa extends m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final net.ipsoft.amelia.sdk.internal.common.f f84684l;
    public final IResourceToDisplay m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f84685n;

    public aa(net.ipsoft.amelia.sdk.internal.common.f fVar, IResourceToDisplay iResourceToDisplay, String str) {
        super(fVar.a());
        this.f84684l = fVar;
        this.m = iResourceToDisplay;
        this.f84685n = str;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String a(String str) {
        return androidx.camera.camera2.internal.compat.u.f(str, "/Amelia/api/cm/download/");
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String c() {
        return m.f84740g;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public LinkedHashMap<String, String> d() {
        if (this.f84741h == null) {
            this.f84741h = new LinkedHashMap<>();
        }
        this.f84741h.put("conversationId", this.f84684l.getConversationId());
        LinkedHashMap<String, String> linkedHashMap = this.f84741h;
        IResourceToDisplay iResourceToDisplay = this.m;
        linkedHashMap.put("bucketName", iResourceToDisplay.getBucketName());
        this.f84741h.put("fileName", iResourceToDisplay.getFilename());
        String str = this.f84685n;
        if (str != null) {
            this.f84741h.put("contextId", str);
        }
        return this.f84741h;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String f() {
        return "*/*";
    }
}
