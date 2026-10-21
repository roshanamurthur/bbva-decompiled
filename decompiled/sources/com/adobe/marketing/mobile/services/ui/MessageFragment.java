package com.adobe.marketing.mobile.services.ui;

import android.R;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.adobe.marketing.mobile.internal.context.App;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.ui.internal.MessagesMonitor;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MessageFragment extends DialogFragment implements View.OnTouchListener {
    private static final String ARGUMENT_KEY_BACKDROP_COLOR = "backdropColor";
    private static final String ARGUMENT_KEY_BACKDROP_OPACITY = "backdropOpacity";
    private static final String ARGUMENT_KEY_IS_UI_TAKE_OVER = "isUiTakeOver";
    private static final String TAG = "MessageFragment";
    private static final String UNEXPECTED_NULL_VALUE = "Unexpected Null Value";
    protected GestureDetector gestureDetector;
    protected Map<MessageSettings.MessageGesture, String> gestures;
    protected AEPMessage message;
    private MessagesMonitor messagesMonitor;
    protected WebViewGestureListener webViewGestureListener;
    protected boolean dismissedWithGesture = false;
    private final View.OnLayoutChangeListener layoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.adobe.marketing.mobile.services.ui.MessageFragment.1
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            MessageFragment.this.message.recreateWebView(i12 - i10, i13 - i11);
            MessageFragment.this.updateDialogView();
        }
    };

    private void addListeners() {
        View viewFindViewById = getActivity().findViewById(R.id.content);
        if (viewFindViewById.getHeight() == 0 || viewFindViewById.getWidth() == 0) {
            viewFindViewById.addOnLayoutChangeListener(this.layoutChangeListener);
        } else {
            this.message.recreateWebView(viewFindViewById.getWidth(), viewFindViewById.getHeight());
            updateDialogView();
        }
        if (isUiTakeOverEnabled()) {
            return;
        }
        getDialog().getWindow().getDecorView().setOnTouchListener(new View.OnTouchListener() { // from class: com.adobe.marketing.mobile.services.ui.MessageFragment.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                MessageFragment.this.dismiss();
                return true;
            }
        });
    }

    private void applyBackdropColor() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            Bundle arguments = getArguments();
            String string = arguments.getString(ARGUMENT_KEY_BACKDROP_COLOR);
            float f6 = arguments.getFloat(ARGUMENT_KEY_BACKDROP_OPACITY);
            ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(string));
            colorDrawable.setAlpha((int) (f6 * 255.0f));
            dialog.getWindow().setBackgroundDrawable(colorDrawable);
        }
    }

    public static String getArgumentKeyBackdropColor() {
        return ARGUMENT_KEY_BACKDROP_COLOR;
    }

    public static String getArgumentKeyBackdropOpacity() {
        return ARGUMENT_KEY_BACKDROP_OPACITY;
    }

    public static String getArgumentKeyIsUiTakeOver() {
        return ARGUMENT_KEY_IS_UI_TAKE_OVER;
    }

    private boolean isUiTakeOverEnabled() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean(ARGUMENT_KEY_IS_UI_TAKE_OVER, false);
    }

    private void removeListeners() {
        getActivity().findViewById(R.id.content).removeOnLayoutChangeListener(this.layoutChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDialogView() {
        Dialog dialog = getDialog();
        WebView webView = this.message.getWebView();
        ViewGroup.LayoutParams params = this.message.getParams();
        if (dialog == null || webView == null || params == null) {
            MobileCore.log(LoggingMode.DEBUG, TAG, "Unexpected Null Value (Message Fragment), unable to update the MessageFragment Dialog.");
            return;
        }
        dialog.setContentView(webView, params);
        webView.setOnTouchListener(this);
        this.message.setWebView(webView);
    }

    @Override // android.app.DialogFragment
    public void dismiss() {
        MobileCore.log(LoggingMode.VERBOSE, TAG, "MessageFragment was dismissed.");
        super.dismiss();
    }

    public GestureDetector getGestureDetector() {
        return this.gestureDetector;
    }

    public Map<MessageSettings.MessageGesture, String> getGestures() {
        return this.gestures;
    }

    public boolean isDismissedWithGesture() {
        return this.dismissedWithGesture;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        if (ServiceProvider.getInstance().getMessageDelegate().shouldShowMessage(this.message)) {
            applyBackdropColor();
            addListeners();
        } else {
            View viewFindViewById = getActivity().findViewById(R.id.content);
            this.message.recreateWebView(viewFindViewById.getWidth(), viewFindViewById.getHeight());
            this.message.getWebView().setOnTouchListener(this);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        AEPMessage aEPMessage = this.message;
        if (aEPMessage != null) {
            aEPMessage.viewed();
        }
        MessagesMonitor messagesMonitor = this.messagesMonitor;
        if (messagesMonitor != null) {
            messagesMonitor.displayed();
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        AEPMessage aEPMessage = this.message;
        if (aEPMessage == null) {
            MobileCore.log(LoggingMode.DEBUG, TAG, "Unexpected Null Value (Message Fragment), failed to show the message.");
            return;
        }
        Map<MessageSettings.MessageGesture, String> gestures = aEPMessage.getSettings().getGestures();
        if (gestures != null && !gestures.isEmpty()) {
            this.gestures = gestures;
        }
        this.webViewGestureListener = new WebViewGestureListener(this);
        this.gestureDetector = new GestureDetector(App.getInstance().getAppContext(), this.webViewGestureListener);
        setStyle(0, R.style.Theme.Translucent.NoTitleBar);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
        MessagesMonitor messagesMonitor = this.messagesMonitor;
        if (messagesMonitor != null) {
            messagesMonitor.dismissed();
        }
        removeListeners();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.message == null) {
            MobileCore.log(LoggingMode.DEBUG, TAG, "Unexpected Null Value (Message Fragment), unable to handle the touch event on ".concat(view.getClass().getSimpleName()));
            return true;
        }
        if (!(view instanceof WebView)) {
            return false;
        }
        this.gestureDetector.onTouchEvent(motionEvent);
        return view.onTouchEvent(motionEvent);
    }

    public void setMessage(AEPMessage aEPMessage) {
        this.message = aEPMessage;
        if (aEPMessage != null) {
            this.messagesMonitor = aEPMessage.messagesMonitor;
        }
    }

    @Override // android.app.DialogFragment
    public int show(FragmentTransaction fragmentTransaction, String str) {
        MobileCore.log(LoggingMode.VERBOSE, TAG, "MessageFragment was shown.");
        return super.show(fragmentTransaction, str);
    }
}
