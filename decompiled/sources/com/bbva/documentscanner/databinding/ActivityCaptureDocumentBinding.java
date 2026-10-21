package com.bbva.documentscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.document.scanner.presentation.view.FrameBackground;
import com.bbva.document.scanner.presentation.view.FrameView;
import com.bbva.documentscanner.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityCaptureDocumentBinding implements ViewBinding {

    @NonNull
    public final PreviewView cameraPreview;

    @NonNull
    public final CellsImageView close;

    @NonNull
    public final FrameView frame;

    @NonNull
    public final FrameLayout notificationContainer;

    @NonNull
    public final CellsTextView notificationText;

    @NonNull
    public final FrameBackground overlay;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f29225p0;

    @NonNull
    public final CellsButton takePhoto;

    public ActivityCaptureDocumentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull PreviewView previewView, @NonNull CellsImageView cellsImageView, @NonNull FrameView frameView, @NonNull FrameLayout frameLayout, @NonNull CellsTextView cellsTextView, @NonNull FrameBackground frameBackground, @NonNull CellsButton cellsButton) {
        this.f29225p0 = constraintLayout;
        this.cameraPreview = previewView;
        this.close = cellsImageView;
        this.frame = frameView;
        this.notificationContainer = frameLayout;
        this.notificationText = cellsTextView;
        this.overlay = frameBackground;
        this.takePhoto = cellsButton;
    }

    @NonNull
    public static ActivityCaptureDocumentBinding bind(@NonNull View view) {
        int i10 = R.id.camera_preview;
        PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(view, i10);
        if (previewView != null) {
            i10 = R.id.close;
            CellsImageView cellsImageView = (CellsImageView) ViewBindings.findChildViewById(view, i10);
            if (cellsImageView != null) {
                i10 = R.id.frame;
                FrameView frameView = (FrameView) ViewBindings.findChildViewById(view, i10);
                if (frameView != null) {
                    i10 = R.id.notificationContainer;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
                    if (frameLayout != null) {
                        i10 = R.id.notificationText;
                        CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                        if (cellsTextView != null) {
                            i10 = R.id.overlay;
                            FrameBackground frameBackground = (FrameBackground) ViewBindings.findChildViewById(view, i10);
                            if (frameBackground != null) {
                                i10 = R.id.take_photo;
                                CellsButton cellsButton = (CellsButton) ViewBindings.findChildViewById(view, i10);
                                if (cellsButton != null) {
                                    return new ActivityCaptureDocumentBinding((ConstraintLayout) view, previewView, cellsImageView, frameView, frameLayout, cellsTextView, frameBackground, cellsButton);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ActivityCaptureDocumentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityCaptureDocumentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_capture_document, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f29225p0;
    }
}
