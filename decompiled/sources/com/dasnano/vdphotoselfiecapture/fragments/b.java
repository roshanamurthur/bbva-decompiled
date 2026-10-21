package com.dasnano.vdphotoselfiecapture.fragments;

import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.material.search.SearchBar;
import com.veridas.camera.CameraAction;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements CameraAction, SynchronizationGuard.CriticalSection, AccessibilityManagerCompat.TouchExplorationStateChangeListener, EventListener.Factory {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f39656p0;

    public /* synthetic */ b(Object obj) {
        this.f39656p0 = obj;
    }

    @Override // okhttp3.EventListener.Factory
    public final EventListener create(Call it) {
        EventListener this_asFactory = (EventListener) this.f39656p0;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        return Integer.valueOf(((EventStore) this.f39656p0).cleanUp());
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        SearchBar searchBar = (SearchBar) this.f39656p0;
        int i10 = SearchBar.D1;
        searchBar.setFocusableInTouchMode(z10);
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        SelfieFragment selfieFragment = (SelfieFragment) this.f39656p0;
        String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
        selfieFragment.getClass();
        selfieFragment.runOnUiThread(new androidx.room.h(selfieFragment, 3));
        VDLogger.log(Logger.Tag.CAMERA_TAKE_PICTURE, "Take picture");
    }
}
