package androidx.camera.core.processing;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import androidx.work.Data;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.google.auto.value.AutoValue;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@WorkerThread
public final class OpenGlRenderer {
    private static final String DEFAULT_FRAGMENT_SHADER;
    private static final String DEFAULT_VERTEX_SHADER;
    private static final int SIZEOF_FLOAT = 4;
    private static final String TAG = "OpenGlRenderer";
    private static final FloatBuffer TEX_BUF;
    private static final float[] TEX_COORDS;
    private static final int TEX_TARGET = 36197;
    private static final String VAR_TEXTURE = "sTexture";
    private static final String VAR_TEXTURE_COORD = "vTextureCoord";
    private static final FloatBuffer VERTEX_BUF;
    private static final float[] VERTEX_COORDS;

    @Nullable
    private OutputSurface mCurrentOutputSurface;

    @Nullable
    private EGLConfig mEglConfig;

    @Nullable
    private Thread mGlThread;
    private final AtomicBoolean mInitialized = new AtomicBoolean(false);
    private final Map<Surface, OutputSurface> mOutputSurfaceMap = new HashMap();

    @NonNull
    private EGLDisplay mEglDisplay = EGL14.EGL_NO_DISPLAY;

    @NonNull
    private EGLContext mEglContext = EGL14.EGL_NO_CONTEXT;

    @NonNull
    private EGLSurface mTempSurface = EGL14.EGL_NO_SURFACE;
    private int mTexId = -1;
    private int mProgramHandle = -1;
    private int mTexMatrixLoc = -1;
    private int mPositionLoc = -1;
    private int mTexCoordLoc = -1;

    @AutoValue
    public static abstract class OutputSurface {
        @NonNull
        public static OutputSurface of(@NonNull EGLSurface eGLSurface, int i10, int i11) {
            return new AutoValue_OpenGlRenderer_OutputSurface(eGLSurface, i10, i11);
        }

        @NonNull
        public abstract EGLSurface getEglSurface();

        public abstract int getHeight();

        public abstract int getWidth();
    }

    static {
        Locale locale = Locale.US;
        DEFAULT_VERTEX_SHADER = String.format(locale, "uniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", VAR_TEXTURE_COORD, VAR_TEXTURE_COORD);
        DEFAULT_FRAGMENT_SHADER = String.format(locale, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nvoid main() {\n    gl_FragColor = texture2D(%s, %s);\n}\n", VAR_TEXTURE_COORD, VAR_TEXTURE, VAR_TEXTURE, VAR_TEXTURE_COORD);
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        VERTEX_COORDS = fArr;
        VERTEX_BUF = createFloatBuffer(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        TEX_COORDS = fArr2;
        TEX_BUF = createFloatBuffer(fArr2);
    }

    private static void checkEglErrorOrThrow(@NonNull String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbE = f.e(str, ": EGL error: 0x");
        sbE.append(Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sbE.toString());
    }

    private static void checkGlErrorOrThrow(@NonNull String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbE = f.e(str, ": GL error 0x");
        sbE.append(Integer.toHexString(iGlGetError));
        throw new IllegalStateException(sbE.toString());
    }

    private void checkGlThreadOrThrow() {
        Preconditions.checkState(this.mGlThread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    private void checkInitializedOrThrow(boolean z10) {
        Preconditions.checkState(z10 == this.mInitialized.get(), z10 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    private static void checkLocationOrThrow(int i10, @NonNull String str) {
        if (i10 < 0) {
            throw new IllegalStateException(h0.b("Unable to locate '", str, "' in program"));
        }
    }

    private void createEglContext() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEglDisplay = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.mEglDisplay, iArr, 0, iArr, 1)) {
            this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.mEglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.mEglDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        checkEglErrorOrThrow("eglCreateContext");
        this.mEglConfig = eGLConfig;
        this.mEglContext = eGLContextEglCreateContext;
        EGL14.eglQueryContext(this.mEglDisplay, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    @NonNull
    public static FloatBuffer createFloatBuffer(@NonNull float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    @NonNull
    private static EGLSurface createPBufferSurface(@NonNull EGLDisplay eGLDisplay, @NonNull EGLConfig eGLConfig, int i10, int i11) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i10, 12374, i11, 12344}, 0);
        checkEglErrorOrThrow("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    private void createProgram(@NonNull ShaderProvider shaderProvider) throws Throwable {
        int iLoadFragmentShader;
        int iLoadShader;
        int iGlCreateProgram;
        try {
            iLoadShader = loadShader(35633, DEFAULT_VERTEX_SHADER);
            try {
                iLoadFragmentShader = loadFragmentShader(shaderProvider);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                    try {
                        checkGlErrorOrThrow("glCreateProgram");
                        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
                        checkGlErrorOrThrow("glAttachShader");
                        GLES20.glAttachShader(iGlCreateProgram, iLoadFragmentShader);
                        checkGlErrorOrThrow("glAttachShader");
                        GLES20.glLinkProgram(iGlCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.mProgramHandle = iGlCreateProgram;
                        } else {
                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        }
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        if (iLoadShader != -1) {
                            GLES20.glDeleteShader(iLoadShader);
                        }
                        if (iLoadFragmentShader != -1) {
                            GLES20.glDeleteShader(iLoadFragmentShader);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    } catch (IllegalStateException e7) {
                        e = e7;
                        if (iLoadShader != -1) {
                            GLES20.glDeleteShader(iLoadShader);
                        }
                        if (iLoadFragmentShader != -1) {
                            GLES20.glDeleteShader(iLoadFragmentShader);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e10) {
                    e = e10;
                    iGlCreateProgram = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e11) {
                e = e11;
                iLoadFragmentShader = -1;
                iGlCreateProgram = -1;
            }
        } catch (IllegalArgumentException | IllegalStateException e12) {
            e = e12;
            iLoadFragmentShader = -1;
            iLoadShader = -1;
            iGlCreateProgram = -1;
        }
    }

    private void createTempSurface() {
        EGLDisplay eGLDisplay = this.mEglDisplay;
        EGLConfig eGLConfig = this.mEglConfig;
        Objects.requireNonNull(eGLConfig);
        this.mTempSurface = createPBufferSurface(eGLDisplay, eGLConfig, 1, 1);
    }

    private void createTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlErrorOrThrow("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(TEX_TARGET, i10);
        checkGlErrorOrThrow("glBindTexture " + i10);
        GLES20.glTexParameterf(TEX_TARGET, 10241, 9728.0f);
        GLES20.glTexParameterf(TEX_TARGET, Data.MAX_DATA_BYTES, 9729.0f);
        GLES20.glTexParameteri(TEX_TARGET, 10242, 33071);
        GLES20.glTexParameteri(TEX_TARGET, 10243, 33071);
        checkGlErrorOrThrow("glTexParameter");
        this.mTexId = i10;
    }

    @NonNull
    private static EGLSurface createWindowSurface(@NonNull EGLDisplay eGLDisplay, @NonNull EGLConfig eGLConfig, @NonNull Surface surface) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        checkEglErrorOrThrow("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    @NonNull
    private Size getSurfaceSize(@NonNull EGLSurface eGLSurface) {
        return new Size(querySurface(this.mEglDisplay, eGLSurface, 12375), querySurface(this.mEglDisplay, eGLSurface, 12374));
    }

    private int loadFragmentShader(@NonNull ShaderProvider shaderProvider) {
        if (shaderProvider == ShaderProvider.DEFAULT) {
            return loadShader(35632, DEFAULT_FRAGMENT_SHADER);
        }
        try {
            String strCreateFragmentShader = shaderProvider.createFragmentShader(VAR_TEXTURE, VAR_TEXTURE_COORD);
            if (strCreateFragmentShader != null && strCreateFragmentShader.contains(VAR_TEXTURE_COORD) && strCreateFragmentShader.contains(VAR_TEXTURE)) {
                return loadShader(35632, strCreateFragmentShader);
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException("Unable to compile fragment shader", th2);
        }
    }

    private void loadLocations() {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.mProgramHandle, "aPosition");
        this.mPositionLoc = iGlGetAttribLocation;
        checkLocationOrThrow(iGlGetAttribLocation, "aPosition");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.mProgramHandle, "aTextureCoord");
        this.mTexCoordLoc = iGlGetAttribLocation2;
        checkLocationOrThrow(iGlGetAttribLocation2, "aTextureCoord");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, "uTexMatrix");
        this.mTexMatrixLoc = iGlGetUniformLocation;
        checkLocationOrThrow(iGlGetUniformLocation, "uTexMatrix");
    }

    private static int loadShader(int i10, @NonNull String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        checkGlErrorOrThrow(g0.c("glCreateShader type=", i10));
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Logger.w(TAG, "Could not compile shader: " + str);
        GLES20.glDeleteShader(iGlCreateShader);
        StringBuilder sbC = o1.c("Could not compile shader type ", i10, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        sbC.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        throw new IllegalStateException(sbC.toString());
    }

    private void makeCurrent(@NonNull EGLSurface eGLSurface) {
        Preconditions.checkNotNull(this.mEglDisplay);
        Preconditions.checkNotNull(this.mEglContext);
        if (!EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    private static int querySurface(@NonNull EGLDisplay eGLDisplay, @NonNull EGLSurface eGLSurface, int i10) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0);
        return iArr[0];
    }

    private void releaseInternal() {
        int i10 = this.mProgramHandle;
        if (i10 != -1) {
            GLES20.glDeleteProgram(i10);
            this.mProgramHandle = -1;
        }
        Iterator<OutputSurface> it = this.mOutputSurfaceMap.values().iterator();
        while (it.hasNext()) {
            EGL14.eglDestroySurface(this.mEglDisplay, it.next().getEglSurface());
        }
        this.mOutputSurfaceMap.clear();
        if (!Objects.equals(this.mTempSurface, EGL14.EGL_NO_SURFACE)) {
            EGL14.eglDestroySurface(this.mEglDisplay, this.mTempSurface);
            this.mTempSurface = EGL14.EGL_NO_SURFACE;
        }
        if (!Objects.equals(this.mEglDisplay, EGL14.EGL_NO_DISPLAY)) {
            if (!Objects.equals(this.mEglContext, EGL14.EGL_NO_CONTEXT)) {
                EGLDisplay eGLDisplay = this.mEglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEglContext);
                EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
                this.mEglContext = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglTerminate(this.mEglDisplay);
            this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
        }
        this.mEglConfig = null;
        this.mProgramHandle = -1;
        this.mTexMatrixLoc = -1;
        this.mPositionLoc = -1;
        this.mTexCoordLoc = -1;
        this.mTexId = -1;
        this.mCurrentOutputSurface = null;
        this.mGlThread = null;
    }

    public int getTextureName() {
        checkInitializedOrThrow(true);
        checkGlThreadOrThrow();
        return this.mTexId;
    }

    public void init(@NonNull ShaderProvider shaderProvider) {
        checkInitializedOrThrow(false);
        try {
            createEglContext();
            createTempSurface();
            makeCurrent(this.mTempSurface);
            createProgram(shaderProvider);
            loadLocations();
            createTexture();
            this.mGlThread = Thread.currentThread();
            this.mInitialized.set(true);
        } catch (IllegalArgumentException | IllegalStateException e5) {
            releaseInternal();
            throw e5;
        }
    }

    public void release() {
        if (this.mInitialized.getAndSet(false)) {
            checkGlThreadOrThrow();
            releaseInternal();
        }
    }

    public void render(long j10, @NonNull float[] fArr) {
        checkInitializedOrThrow(true);
        checkGlThreadOrThrow();
        if (this.mCurrentOutputSurface == null) {
            return;
        }
        GLES20.glUseProgram(this.mProgramHandle);
        checkGlErrorOrThrow("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(TEX_TARGET, this.mTexId);
        GLES20.glUniformMatrix4fv(this.mTexMatrixLoc, 1, false, fArr, 0);
        checkGlErrorOrThrow("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.mPositionLoc);
        checkGlErrorOrThrow("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.mPositionLoc, 2, 5126, false, 0, (Buffer) VERTEX_BUF);
        checkGlErrorOrThrow("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.mTexCoordLoc);
        checkGlErrorOrThrow("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.mTexCoordLoc, 2, 5126, false, 0, (Buffer) TEX_BUF);
        checkGlErrorOrThrow("glVertexAttribPointer");
        GLES20.glDrawArrays(5, 0, 4);
        checkGlErrorOrThrow("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.mPositionLoc);
        GLES20.glDisableVertexAttribArray(this.mTexCoordLoc);
        GLES20.glUseProgram(0);
        GLES20.glBindTexture(TEX_TARGET, 0);
        EGLExt.eglPresentationTimeANDROID(this.mEglDisplay, this.mCurrentOutputSurface.getEglSurface(), j10);
        if (EGL14.eglSwapBuffers(this.mEglDisplay, this.mCurrentOutputSurface.getEglSurface())) {
            return;
        }
        Logger.w(TAG, "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public void setOutputSurface(@NonNull Surface surface) {
        checkInitializedOrThrow(true);
        checkGlThreadOrThrow();
        if (!this.mOutputSurfaceMap.containsKey(surface)) {
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLConfig eGLConfig = this.mEglConfig;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceCreateWindowSurface = createWindowSurface(eGLDisplay, eGLConfig, surface);
            Size surfaceSize = getSurfaceSize(eGLSurfaceCreateWindowSurface);
            this.mOutputSurfaceMap.put(surface, OutputSurface.of(eGLSurfaceCreateWindowSurface, surfaceSize.getWidth(), surfaceSize.getHeight()));
        }
        OutputSurface outputSurface = this.mOutputSurfaceMap.get(surface);
        Objects.requireNonNull(outputSurface);
        this.mCurrentOutputSurface = outputSurface;
        makeCurrent(outputSurface.getEglSurface());
        GLES20.glViewport(0, 0, this.mCurrentOutputSurface.getWidth(), this.mCurrentOutputSurface.getHeight());
        GLES20.glScissor(0, 0, this.mCurrentOutputSurface.getWidth(), this.mCurrentOutputSurface.getHeight());
    }
}
