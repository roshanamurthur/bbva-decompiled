package com.google.firebase.messaging;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;
import mx.openpay.library.data.util.CommandConstants;

/* JADX INFO: compiled from: TopicOperation.java */
/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f48698d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48701c;

    public s(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w(Constants.TAG, String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f48698d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.f48699a = strSubstring;
        this.f48700b = str;
        this.f48701c = androidx.camera.core.impl.utils.a.b(str, CommandConstants.Z11_EXCLAMATION_MARK, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f48699a.equals(sVar.f48699a) && this.f48700b.equals(sVar.f48700b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48700b, this.f48699a);
    }
}
