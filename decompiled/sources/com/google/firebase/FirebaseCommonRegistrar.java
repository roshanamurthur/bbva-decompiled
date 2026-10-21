package com.google.firebase;

import android.os.Build;
import androidx.camera.core.processing.f;
import androidx.constraintlayout.core.state.a;
import androidx.datastore.preferences.protobuf.q;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.KotlinDetector;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace(JsonPointer.SEPARATOR, '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.component());
        arrayList.add(DefaultHeartBeatController.component());
        arrayList.add(LibraryVersionComponent.create("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.create("fire-core", "21.0.0"));
        arrayList.add(LibraryVersionComponent.create("device-name", a(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.create("device-model", a(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.create("device-brand", a(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.fromContext("android-target-sdk", new q()));
        arrayList.add(LibraryVersionComponent.fromContext("android-min-sdk", new a()));
        arrayList.add(LibraryVersionComponent.fromContext("android-platform", new androidx.camera.core.imagecapture.a()));
        arrayList.add(LibraryVersionComponent.fromContext("android-installer", new f()));
        String strDetectVersion = KotlinDetector.detectVersion();
        if (strDetectVersion != null) {
            arrayList.add(LibraryVersionComponent.create("kotlin", strDetectVersion));
        }
        return arrayList;
    }
}
