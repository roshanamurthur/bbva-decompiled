package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ImageHeaderParserRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38742a = new ArrayList();

    public synchronized void add(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f38742a.add(imageHeaderParser);
    }

    @NonNull
    public synchronized List<ImageHeaderParser> getParsers() {
        return this.f38742a;
    }
}
