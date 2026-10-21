package com.noknok.android.client.extension;

import android.location.Location;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public interface ILocationServiceListener {
    void onFailure(@NonNull Exception exc);

    void onSuccess(Location location);
}
