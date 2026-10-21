package com.bbva.androidtoolkit.plugin.command;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.activity.ActivityResultRequest;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.androidtoolkit.plugin.component.PluginComponentContainer;
import com.bbva.androidtoolkit.plugin.postmessage.PostMessenger;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.cells.validator.ValidatorChecker;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractCommand<T> {
    public static final int EXECUTE_ON_MAIN_THREAD = 0;
    public static final int EXECUTE_ON_NEW_THREAD = 2;
    public static final int EXECUTE_ON_UI_THREAD = 1;
    protected ActivityContainer mActivityContainer;
    protected Application mApplication;
    protected Gson mGson;
    protected PostMessenger mPostMessenger;
    private final Class<T> mTClass;
    private final int mThreadExecution;
    protected ExecutorService mThreadPool;
    protected Handler mUiHandler;
    private ValidatorChecker<T> mValidatorChecker;
    protected Optional<WebView> mWebView;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ThreadExecution {
    }

    public AbstractCommand(@NonNull Class<T> cls) {
        this(cls, 0);
    }

    @Nullable
    private T jsonToObject(@NonNull Class<T> cls, JsonElement jsonElement) {
        return (T) this.mGson.fromJson(jsonElement, (Class) cls);
    }

    public void addComponents(PluginComponentContainer pluginComponentContainer) {
        this.mThreadPool = pluginComponentContainer.getThreadPool();
        this.mUiHandler = pluginComponentContainer.getUIHandler();
        this.mActivityContainer = pluginComponentContainer.getActivityContainer();
        this.mApplication = pluginComponentContainer.getApplication();
        this.mWebView = pluginComponentContainer.getWebView();
        this.mPostMessenger = pluginComponentContainer.getPostMessenger();
    }

    public abstract void execute(T t10, CommandCallback commandCallback);

    public void executeAction(JsonElement jsonElement, CommandCallback commandCallback) {
        T tJsonToObject = jsonToObject(this.mTClass, jsonElement);
        ValidatorChecker<T> validatorChecker = this.mValidatorChecker;
        if (validatorChecker == null || (tJsonToObject != null && validatorChecker.isValid(tJsonToObject))) {
            execute(tJsonToObject, commandCallback);
        } else {
            commandCallback.sendError(Errors.ErrorMalformedParam);
        }
    }

    public int getThreadExecution() {
        return this.mThreadExecution;
    }

    public void requestActivityResult(ActivityResultRequest activityResultRequest, CommandCallback commandCallback) {
        Optional<Activity> optional = this.mActivityContainer.get();
        if (optional.isPresent()) {
            activityResultRequest.start(optional.get());
        } else {
            commandCallback.sendError(Errors.ErrorNotAvailable);
        }
    }

    public void response(@NonNull CommandCallback commandCallback, JSONObject jSONObject) {
        if (jSONObject != null) {
            commandCallback.sendEvent(jSONObject);
        } else {
            commandCallback.sendError("Error while try creating response");
        }
    }

    public void setValidator(ValidatorChecker<T> validatorChecker) {
        this.mValidatorChecker = validatorChecker;
    }

    public AbstractCommand(@NonNull Class<T> cls, ValidatorChecker<T> validatorChecker) {
        this(cls, 0);
        this.mValidatorChecker = validatorChecker;
    }

    public AbstractCommand(@NonNull Class<T> cls, int i10) {
        this.mGson = new Gson();
        this.mTClass = cls;
        this.mThreadExecution = i10;
    }

    public AbstractCommand(@NonNull Class<T> cls, ValidatorChecker<T> validatorChecker, int i10) {
        this.mGson = new Gson();
        this.mTClass = cls;
        this.mThreadExecution = i10;
        this.mValidatorChecker = validatorChecker;
    }
}
