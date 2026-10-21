package com.sun.mail.util;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketOption;
import java.nio.channels.SocketChannel;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes9.dex */
public class WriteTimeoutSocket extends Socket {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Socket f65605p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ScheduledExecutorService f65606q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f65607r0;

    public WriteTimeoutSocket(Socket socket, int i10) throws IOException {
        this.f65605p0 = socket;
        this.f65606q0 = Executors.newScheduledThreadPool(1);
        this.f65607r0 = i10;
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) throws IOException {
        this.f65605p0.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ScheduledExecutorService scheduledExecutorService = this.f65606q0;
        try {
            this.f65605p0.close();
        } finally {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) throws IOException {
        this.f65605p0.connect(socketAddress, 0);
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        return this.f65605p0.getChannel();
    }

    public FileDescriptor getFileDescriptor$() {
        try {
            return (FileDescriptor) Socket.class.getDeclaredMethod("getFileDescriptor$", new Class[0]).invoke(this.f65605p0, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        return this.f65605p0.getInetAddress();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() throws IOException {
        return this.f65605p0.getInputStream();
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() throws SocketException {
        return this.f65605p0.getKeepAlive();
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.f65605p0.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.f65605p0.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return this.f65605p0.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getOOBInline() throws SocketException {
        return this.f65605p0.getOOBInline();
    }

    @Override // java.net.Socket
    public <T> T getOption(SocketOption<T> socketOption) throws IOException {
        throw new UnsupportedOperationException("WriteTimeoutSocket.getOption");
    }

    @Override // java.net.Socket
    public synchronized OutputStream getOutputStream() throws IOException {
        return new b(this.f65605p0.getOutputStream(), this.f65606q0, this.f65607r0);
    }

    @Override // java.net.Socket
    public int getPort() {
        return this.f65605p0.getPort();
    }

    @Override // java.net.Socket
    public int getReceiveBufferSize() throws SocketException {
        return this.f65605p0.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return this.f65605p0.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() throws SocketException {
        return this.f65605p0.getReuseAddress();
    }

    @Override // java.net.Socket
    public int getSendBufferSize() throws SocketException {
        return this.f65605p0.getSendBufferSize();
    }

    @Override // java.net.Socket
    public int getSoLinger() throws SocketException {
        return this.f65605p0.getSoLinger();
    }

    @Override // java.net.Socket
    public int getSoTimeout() throws SocketException {
        return this.f65605p0.getSoTimeout();
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() throws SocketException {
        return this.f65605p0.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public int getTrafficClass() throws SocketException {
        return this.f65605p0.getTrafficClass();
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.f65605p0.isBound();
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.f65605p0.isClosed();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.f65605p0.isConnected();
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.f65605p0.isInputShutdown();
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.f65605p0.isOutputShutdown();
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i10) throws IOException {
        this.f65605p0.sendUrgentData(i10);
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z10) throws SocketException {
        this.f65605p0.setKeepAlive(z10);
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z10) throws SocketException {
        this.f65605p0.setOOBInline(z10);
    }

    @Override // java.net.Socket
    public <T> Socket setOption(SocketOption<T> socketOption, T t10) throws IOException {
        throw new UnsupportedOperationException("WriteTimeoutSocket.setOption");
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i10, int i11, int i12) {
        this.f65605p0.setPerformancePreferences(i10, i11, i12);
    }

    @Override // java.net.Socket
    public void setReceiveBufferSize(int i10) throws SocketException {
        this.f65605p0.setReceiveBufferSize(i10);
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z10) throws SocketException {
        this.f65605p0.setReuseAddress(z10);
    }

    @Override // java.net.Socket
    public void setSendBufferSize(int i10) throws SocketException {
        this.f65605p0.setSendBufferSize(i10);
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z10, int i10) throws SocketException {
        this.f65605p0.setSoLinger(z10, i10);
    }

    @Override // java.net.Socket
    public void setSoTimeout(int i10) throws SocketException {
        this.f65605p0.setSoTimeout(i10);
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z10) throws SocketException {
        this.f65605p0.setTcpNoDelay(z10);
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i10) throws SocketException {
        this.f65605p0.setTrafficClass(i10);
    }

    @Override // java.net.Socket
    public void shutdownInput() throws IOException {
        this.f65605p0.shutdownInput();
    }

    @Override // java.net.Socket
    public void shutdownOutput() throws IOException {
        this.f65605p0.shutdownOutput();
    }

    @Override // java.net.Socket
    public Set<SocketOption<?>> supportedOptions() {
        return Collections.emptySet();
    }

    @Override // java.net.Socket
    public String toString() {
        return this.f65605p0.toString();
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i10) throws IOException {
        this.f65605p0.connect(socketAddress, i10);
    }

    public WriteTimeoutSocket(int i10) throws IOException {
        this(new Socket(), i10);
    }

    public WriteTimeoutSocket(InetAddress inetAddress, int i10, int i11) throws IOException {
        this(i11);
        this.f65605p0.connect(new InetSocketAddress(inetAddress, i10));
    }

    public WriteTimeoutSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11, int i12) throws IOException {
        this(i12);
        this.f65605p0.bind(new InetSocketAddress(inetAddress2, i11));
        this.f65605p0.connect(new InetSocketAddress(inetAddress, i10));
    }

    public WriteTimeoutSocket(String str, int i10, int i11) throws IOException {
        this(i11);
        this.f65605p0.connect(new InetSocketAddress(str, i10));
    }

    public WriteTimeoutSocket(String str, int i10, InetAddress inetAddress, int i11, int i12) throws IOException {
        this(i12);
        this.f65605p0.bind(new InetSocketAddress(inetAddress, i11));
        this.f65605p0.connect(new InetSocketAddress(str, i10));
    }
}
